package kotlin.reflect.jvm.internal.impl.protobuf;

import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class ByteString implements Iterable<Byte> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int i) {
            if (i >= 0) {
                this.initialCapacity = i;
                this.flushedBuffers = new ArrayList<>();
                this.buffer = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private byte[] copyArray(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            this.flushedBuffersTotalBytes += this.buffer.length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, this.flushedBuffersTotalBytes >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(bArr));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom((Iterable<ByteString>) this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        public synchronized void write(int i) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i2 = this.bufferPos;
            this.bufferPos = i2 + 1;
            bArr[i2] = (byte) i;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.buffer.length - this.bufferPos) {
                System.arraycopy(bArr, i, this.buffer, this.bufferPos, i2);
                this.bufferPos += i2;
            } else {
                int length = this.buffer.length - this.bufferPos;
                System.arraycopy(bArr, i, this.buffer, this.bufferPos, length);
                int i3 = i + length;
                int i4 = i2 - length;
                flushFullBuffer(i4);
                System.arraycopy(bArr, i3, this.buffer, 0, i4);
                this.bufferPos = i4;
            }
        }
    }

    static {
        Class<ByteString> cls = ByteString.class;
    }

    ByteString() {
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i) {
        if (i == 1) {
            return (ByteString) it.next();
        }
        int i2 = i >>> 1;
        return balancedConcat(it, i2).concat(balancedConcat(it, i - i2));
    }

    public static ByteString copyFrom(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new LiteralByteString(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes(Utf8Charset.NAME));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static Output newOutput() {
        return new Output(128);
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return RopeByteString.concatenate(this, byteString);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public void copyTo(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i5);
                    throw new IndexOutOfBoundsException(sb3.toString());
                } else if (i3 > 0) {
                    copyToInternal(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i4);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void copyToInternal(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int getTreeDepth();

    /* access modifiers changed from: protected */
    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract ByteIterator iterator();

    public abstract CodedInputStream newCodedInput();

    /* access modifiers changed from: protected */
    public abstract int partialHash(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int partialIsValidUtf8(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract String toString(String str) throws UnsupportedEncodingException;

    public String toStringUtf8() {
        try {
            return toString(Utf8Charset.NAME);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* access modifiers changed from: 0000 */
    public void writeTo(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > size()) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 > 0) {
                writeToInternal(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException;

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (ByteString add : iterable) {
                collection.add(add);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return EMPTY;
        }
        return balancedConcat(collection.iterator(), collection.size());
    }
}
