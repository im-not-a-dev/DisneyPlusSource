package kotlin.reflect.jvm.internal.impl.protobuf;

import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder;

public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    private interface RefillCallback {
        void onRefill();
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[4096];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    private void ensureAvailable(int i) throws IOException {
        if (this.bufferSize - this.bufferPos < i) {
            refillBuffer(i);
        }
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    private byte[] readRawBytesSlowPath(int i) throws IOException {
        if (i > 0) {
            int i2 = this.totalBytesRetired;
            int i3 = this.bufferPos;
            int i4 = i2 + i3 + i;
            int i5 = this.currentLimit;
            if (i4 > i5) {
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i6 = this.bufferSize - i3;
                System.arraycopy(this.buffer, i3, bArr, 0, i6);
                this.bufferPos = this.bufferSize;
                int i7 = i - i6;
                ensureAvailable(i7);
                System.arraycopy(this.buffer, 0, bArr, i6, i7);
                this.bufferPos = i7;
                return bArr;
            } else {
                int i8 = this.bufferSize;
                this.totalBytesRetired = i2 + i8;
                this.bufferPos = 0;
                this.bufferSize = 0;
                int i9 = i8 - i3;
                int i10 = i - i9;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                while (i10 > 0) {
                    byte[] bArr2 = new byte[Math.min(i10, 4096)];
                    int i11 = 0;
                    while (i11 < bArr2.length) {
                        InputStream inputStream = this.input;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i11, bArr2.length - i11);
                        if (read != -1) {
                            this.totalBytesRetired += read;
                            i11 += read;
                        } else {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                    }
                    i10 -= bArr2.length;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.buffer, i3, bArr3, 0, i9);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                    i9 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    private void recomputeBufferSizeAfterLimit() {
        this.bufferSize += this.bufferSizeAfterLimit;
        int i = this.totalBytesRetired;
        int i2 = this.bufferSize;
        int i3 = i + i2;
        int i4 = this.currentLimit;
        if (i3 > i4) {
            this.bufferSizeAfterLimit = i3 - i4;
            this.bufferSize = i2 - this.bufferSizeAfterLimit;
            return;
        }
        this.bufferSizeAfterLimit = 0;
    }

    private void refillBuffer(int i) throws IOException {
        if (!tryRefillBuffer(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.totalBytesRetired;
            int i3 = this.bufferPos;
            int i4 = i2 + i3 + i;
            int i5 = this.currentLimit;
            if (i4 <= i5) {
                int i6 = this.bufferSize;
                int i7 = i6 - i3;
                this.bufferPos = i6;
                refillBuffer(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.bufferSize;
                    if (i8 > i9) {
                        i7 += i9;
                        this.bufferPos = i9;
                        refillBuffer(1);
                    } else {
                        this.bufferPos = i8;
                        return;
                    }
                }
            } else {
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        } else {
            throw InvalidProtocolBufferException.negativeSize();
        }
    }

    private boolean tryRefillBuffer(int i) throws IOException {
        int i2 = this.bufferPos;
        if (i2 + i <= this.bufferSize) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        } else if (this.totalBytesRetired + i2 + i > this.currentLimit) {
            return false;
        } else {
            RefillCallback refillCallback2 = this.refillCallback;
            if (refillCallback2 != null) {
                refillCallback2.onRefill();
            }
            if (this.input != null) {
                int i3 = this.bufferPos;
                if (i3 > 0) {
                    int i4 = this.bufferSize;
                    if (i4 > i3) {
                        byte[] bArr = this.buffer;
                        System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                    }
                    this.totalBytesRetired += i3;
                    this.bufferSize -= i3;
                    this.bufferPos = 0;
                }
                InputStream inputStream = this.input;
                byte[] bArr2 = this.buffer;
                int i5 = this.bufferSize;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.buffer.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.bufferSize += read;
                    if ((this.totalBytesRetired + i) - this.sizeLimit <= 0) {
                        recomputeBufferSizeAfterLimit();
                        return this.bufferSize >= i ? true : tryRefillBuffer(i);
                    }
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
            }
            return false;
        }
    }

    public void checkLastTagWas(int i) throws InvalidProtocolBufferException {
        if (this.lastTag != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = i + this.totalBytesRetired + this.bufferPos;
            int i3 = this.currentLimit;
            if (i2 <= i3) {
                this.currentLimit = i2;
                recomputeBufferSizeAfterLimit();
                return i3;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public boolean readBool() throws IOException {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
            ByteString copyFrom = (!this.bufferIsImmutable || !this.enableAliasing) ? ByteString.copyFrom(this.buffer, this.bufferPos, readRawVarint32) : new BoundedByteString(this.buffer, i2, readRawVarint32);
            this.bufferPos += readRawVarint32;
            return copyFrom;
        } else if (readRawVarint32 == 0) {
            return ByteString.EMPTY;
        } else {
            return new LiteralByteString(readRawBytesSlowPath(readRawVarint32));
        }
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() throws IOException {
        return readRawVarint32();
    }

    public int readFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i, Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int i2 = this.recursionDepth;
        if (i2 < this.recursionLimit) {
            this.recursionDepth = i2 + 1;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public int readInt32() throws IOException {
        return readRawVarint32();
    }

    public long readInt64() throws IOException {
        return readRawVarint64();
    }

    public void readMessage(Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public int readRawLittleEndian32() throws IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 4) {
            refillBuffer(4);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        int i = this.bufferPos;
        if (this.bufferSize - i < 8) {
            refillBuffer(8);
            i = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readRawVarint32() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.bufferPos
            int r1 = r9.bufferSize
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.buffer
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.bufferPos = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L_0x0082:
            r9.bufferPos = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readRawVarint64() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.bufferPos
            int r1 = r9.bufferSize
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.buffer
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.bufferPos = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.readRawVarint64SlowPath()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.bufferPos = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    /* access modifiers changed from: 0000 */
    public long readRawVarint64SlowPath() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte readRawByte = readRawByte();
            j |= ((long) (readRawByte & Byte.MAX_VALUE)) << i;
            if ((readRawByte & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readSFixed32() throws IOException {
        return readRawLittleEndian32();
    }

    public long readSFixed64() throws IOException {
        return readRawLittleEndian64();
    }

    public int readSInt32() throws IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() throws IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        int i3 = i - i2;
        String str = Utf8Charset.NAME;
        if (readRawVarint32 <= i3 && readRawVarint32 > 0) {
            String str2 = new String(this.buffer, i2, readRawVarint32, str);
            this.bufferPos += readRawVarint32;
            return str2;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            return new String(readRawBytesSlowPath(readRawVarint32), str);
        }
    }

    public String readStringRequireUtf8() throws IOException {
        byte[] bArr;
        int readRawVarint32 = readRawVarint32();
        int i = this.bufferPos;
        if (readRawVarint32 <= this.bufferSize - i && readRawVarint32 > 0) {
            bArr = this.buffer;
            this.bufferPos = i + readRawVarint32;
        } else if (readRawVarint32 == 0) {
            return "";
        } else {
            bArr = readRawBytesSlowPath(readRawVarint32);
            i = 0;
        }
        if (Utf8.isValidUtf8(bArr, i, i + readRawVarint32)) {
            return new String(bArr, i, readRawVarint32, Utf8Charset.NAME);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = readRawVarint32();
        if (WireFormat.getTagFieldNumber(this.lastTag) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() throws IOException {
        return readRawVarint32();
    }

    public long readUInt64() throws IOException {
        return readRawVarint64();
    }

    public boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            long readInt64 = readInt64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeUInt64NoTag(readInt64);
            return true;
        } else if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        } else if (tagWireType == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        } else if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i);
            skipMessage(codedOutputStream);
            int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(makeTag);
            codedOutputStream.writeRawVarint32(makeTag);
            return true;
        } else if (tagWireType == 4) {
            return false;
        } else {
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, codedOutputStream));
    }

    public void skipRawBytes(int i) throws IOException {
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (i > i2 - i3 || i < 0) {
            skipRawBytesSlowPath(i);
        } else {
            this.bufferPos = i3 + i;
        }
    }

    static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T t = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return t;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = Integer.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        this.bufferPos = literalByteString.getOffsetIntoBytes();
        this.bufferSize = this.bufferPos + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }
}
