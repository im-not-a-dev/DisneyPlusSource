package okio;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C12862b0;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, mo31007d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "buffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", "offset", "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "timeout", "Lokio/Timeout;", "toString", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* renamed from: okio.r */
/* compiled from: RealBufferedSource.kt */
public final class C14293r implements BufferedSource {

    /* renamed from: U */
    public boolean f31896U;

    /* renamed from: V */
    public final C14302x f31897V;

    /* renamed from: c */
    public final Buffer f31898c = new Buffer();

    /* renamed from: okio.r$a */
    /* compiled from: RealBufferedSource.kt */
    public static final class C14294a extends InputStream {

        /* renamed from: c */
        final /* synthetic */ C14293r f31899c;

        C14294a(C14293r rVar) {
            this.f31899c = rVar;
        }

        public int available() {
            C14293r rVar = this.f31899c;
            if (!rVar.f31896U) {
                return (int) Math.min(rVar.f31898c.mo36335h(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f31899c.close();
        }

        public int read() {
            C14293r rVar = this.f31899c;
            if (!rVar.f31896U) {
                if (rVar.f31898c.mo36335h() == 0) {
                    C14293r rVar2 = this.f31899c;
                    if (rVar2.f31897V.mo35899a(rVar2.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
                        return -1;
                    }
                }
                return this.f31899c.f31898c.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31899c);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) {
            if (!this.f31899c.f31896U) {
                C14273c.m45651a((long) bArr.length, (long) i, (long) i2);
                if (this.f31899c.f31898c.mo36335h() == 0) {
                    C14293r rVar = this.f31899c;
                    if (rVar.f31897V.mo35899a(rVar.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
                        return -1;
                    }
                }
                return this.f31899c.f31898c.mo36292a(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public C14293r(C14302x xVar) {
        this.f31897V = xVar;
    }

    /* renamed from: X */
    public C14303y mo35898X() {
        return this.f31897V.mo35898X();
    }

    /* renamed from: Y */
    public byte[] mo36287Y() {
        this.f31898c.mo36298a(this.f31897V);
        return this.f31898c.mo36287Y();
    }

    /* renamed from: Z */
    public Buffer mo36288Z() {
        return this.f31898c;
    }

    /* renamed from: a */
    public long mo35899a(Buffer buffer, long j) {
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(true ^ this.f31896U)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f31898c.mo36335h() == 0 && this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
            return -1;
        } else {
            return this.f31898c.mo35899a(buffer, Math.min(j, this.f31898c.mo36335h()));
        }
    }

    /* renamed from: a0 */
    public boolean mo36309a0() {
        if (!(!this.f31896U)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f31898c.mo36309a0() || this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo36314b(long j) {
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!this.f31896U) {
            while (this.f31898c.mo36335h() < j) {
                if (this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: b0 */
    public String mo36315b0() {
        long a = mo36444a((byte) 10);
        if (a != -1) {
            return this.f31898c.mo36343j(a);
        }
        if (this.f31898c.mo36335h() != 0) {
            return mo36447a(this.f31898c.mo36335h());
        }
        return null;
    }

    /* renamed from: c */
    public ByteString mo36319c(long j) {
        mo36330f(j);
        return this.f31898c.mo36319c(j);
    }

    /* renamed from: c0 */
    public long mo36320c0() {
        mo36330f(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo36314b(j2)) {
                break;
            }
            byte a = this.f31898c.mo36289a(j);
            if (a < ((byte) 48) || a > ((byte) 57)) {
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i != 0 || a != ((byte) 45)) {
                    if (i == 0) {
                        C12862b0 b0Var = C12862b0.f29515a;
                        Object[] objArr = {Byte.valueOf(a)};
                        String format = String.format("Expected leading [0-9] or '-' character but was %#x", Arrays.copyOf(objArr, objArr.length));
                        C12880j.m40222a((Object) format, "java.lang.String.format(format, *args)");
                        throw new NumberFormatException(format);
                    }
                }
            }
            j = j2;
        }
        return this.f31898c.mo36320c0();
    }

    public void close() {
        if (!this.f31896U) {
            this.f31896U = true;
            this.f31897V.close();
            this.f31898c.mo36308a();
        }
    }

    /* renamed from: d */
    public String mo36322d(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a = mo36445a(b, 0, j2);
            if (a != -1) {
                return this.f31898c.mo36343j(a);
            }
            if (j2 < Long.MAX_VALUE && mo36314b(j2) && this.f31898c.mo36289a(j2 - 1) == ((byte) 13) && mo36314b(1 + j2) && this.f31898c.mo36289a(j2) == b) {
                return this.f31898c.mo36343j(j2);
            }
            Buffer buffer = new Buffer();
            Buffer buffer2 = this.f31898c;
            buffer2.mo36305a(buffer, 0, Math.min((long) 32, buffer2.mo36335h()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.f31898c.mo36335h(), j));
            sb.append(" content=");
            sb.append(buffer.mo36323d().mo36386f());
            sb.append("…");
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* renamed from: d0 */
    public String mo36324d0() {
        return mo36322d(Long.MAX_VALUE);
    }

    /* renamed from: e */
    public byte[] mo36326e(long j) {
        mo36330f(j);
        return this.f31898c.mo36326e(j);
    }

    /* renamed from: e0 */
    public String mo36327e0() {
        this.f31898c.mo36298a(this.f31897V);
        return this.f31898c.mo36327e0();
    }

    /* renamed from: f */
    public void mo36330f(long j) {
        if (!mo36314b(j)) {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo36331f0() {
        /*
            r6 = this;
            r0 = 1
            r6.mo36330f(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo36314b(r3)
            if (r3 == 0) goto L_0x005c
            okio.Buffer r3 = r6.f31898c
            long r4 = (long) r1
            byte r3 = r3.mo36289a(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x0021
            r4 = 57
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
        L_0x0021:
            r4 = 97
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x002b
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
        L_0x002b:
            r4 = 65
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x0038
            r4 = 70
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r1 = r2
            goto L_0x0007
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x005c
        L_0x003b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            kotlin.jvm.internal.b0 r2 = kotlin.jvm.internal.C12862b0.f29515a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x005c:
            okio.Buffer r0 = r6.f31898c
            long r0 = r0.mo36331f0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C14293r.mo36331f0():long");
    }

    /* renamed from: g0 */
    public InputStream mo36334g0() {
        return new C14294a(this);
    }

    public boolean isOpen() {
        return !this.f31896U;
    }

    public BufferedSource peek() {
        return C14287m.m45716a((C14302x) new C14291p(this));
    }

    public int read(ByteBuffer byteBuffer) {
        if (this.f31898c.mo36335h() == 0 && this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
            return -1;
        }
        return this.f31898c.read(byteBuffer);
    }

    public byte readByte() {
        mo36330f(1);
        return this.f31898c.readByte();
    }

    public void readFully(byte[] bArr) {
        try {
            mo36330f((long) bArr.length);
            this.f31898c.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f31898c.mo36335h() > 0) {
                Buffer buffer = this.f31898c;
                int a = buffer.mo36292a(bArr, i, (int) buffer.mo36335h());
                if (a != -1) {
                    i += a;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo36330f(4);
        return this.f31898c.readInt();
    }

    public short readShort() {
        mo36330f(2);
        return this.f31898c.readShort();
    }

    public void skip(long j) {
        if (!this.f31896U) {
            while (j > 0) {
                if (this.f31898c.mo36335h() == 0 && this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f31898c.mo36335h());
                this.f31898c.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f31897V);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: b */
    public short mo36449b() {
        mo36330f(2);
        return this.f31898c.mo36329f();
    }

    /* renamed from: b */
    public long mo36311b(ByteString byteString) {
        return mo36448b(byteString, 0);
    }

    /* renamed from: a */
    public int mo36290a(C14288n nVar) {
        if (!this.f31896U) {
            do {
                int a = this.f31898c.mo36291a(nVar, true);
                if (a != -2) {
                    if (a == -1) {
                        return -1;
                    }
                    this.f31898c.skip((long) nVar.mo36427b()[a].size());
                    return a;
                }
            } while (this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public long mo36448b(ByteString byteString, long j) {
        if (!this.f31896U) {
            while (true) {
                long b = this.f31898c.mo36312b(byteString, j);
                if (b != -1) {
                    return b;
                }
                long h = this.f31898c.mo36335h();
                if (this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
                    return -1;
                }
                j = Math.max(j, h);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public long mo36297a(C14300v vVar) {
        long j = 0;
        while (this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) != -1) {
            long b = this.f31898c.mo36310b();
            if (b > 0) {
                j += b;
                vVar.mo35927b(this.f31898c, b);
            }
        }
        if (this.f31898c.mo36335h() <= 0) {
            return j;
        }
        long h = j + this.f31898c.mo36335h();
        Buffer buffer = this.f31898c;
        vVar.mo35927b(buffer, buffer.mo36335h());
        return h;
    }

    /* renamed from: a */
    public String mo36447a(long j) {
        mo36330f(j);
        return this.f31898c.mo36339i(j);
    }

    /* renamed from: a */
    public int mo36443a() {
        mo36330f(4);
        return this.f31898c.mo36325e();
    }

    /* renamed from: a */
    public long mo36444a(byte b) {
        return mo36445a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo36445a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f31896U) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long a = this.f31898c.mo36294a(b, j, j2);
                    if (a == -1) {
                        long h = this.f31898c.mo36335h();
                        if (h >= j2 || this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
                            break;
                        }
                        j = Math.max(j, h);
                    } else {
                        return a;
                    }
                }
                return -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex=");
            sb.append(j);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public long mo36295a(ByteString byteString) {
        return mo36446a(byteString, 0);
    }

    /* renamed from: a */
    public long mo36446a(ByteString byteString, long j) {
        if (!this.f31896U) {
            while (true) {
                long a = this.f31898c.mo36296a(byteString, j);
                if (a != -1) {
                    return a;
                }
                long h = this.f31898c.mo36335h();
                if (this.f31897V.mo35899a(this.f31898c, (long) ContentServiceClientExtras.URL_SIZE_LIMIT) == -1) {
                    return -1;
                }
                j = Math.max(j, (h - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public String mo36300a(Charset charset) {
        this.f31898c.mo36298a(this.f31897V);
        return this.f31898c.mo36300a(charset);
    }
}
