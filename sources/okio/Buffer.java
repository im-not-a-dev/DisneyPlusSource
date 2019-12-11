package okio;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.TypeCastException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p588j0.C12801c;
import net.danlew.android.joda.DateUtils;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ$\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0007J\"\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0000H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0002\b*J\u0015\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\fH\u0007¢\u0006\u0002\b,J\b\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001cH\u0002J\u000e\u00101\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u000e\u00102\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u000e\u00103\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(H\u0016J\u0018\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\fH\u0016J \u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001cH\u0016J\u0018\u00104\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001cH\u0016J\u0018\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\fH\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\u0006\u0010>\u001a\u00020\u001cJ\b\u0010?\u001a\u00020\u0018H\u0016J\b\u0010@\u001a\u00020\u0001H\u0016J\u0018\u0010A\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001cH\u0016J(\u0010A\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J0\u0010A\u001a\u00020\"2\u0006\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020.2\u0006\u00108\u001a\u00020E2\u0006\u0010B\u001a\u00020.2\u0006\u0010F\u001a\u00020.H\u0002J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020EH\u0016J \u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J\u0018\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010J\u001a\u00020\f2\u0006\u0010H\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020MH\u0007J\b\u0010O\u001a\u00020(H\u0016J\b\u0010P\u001a\u00020EH\u0016J\u0010\u0010P\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010Q\u001a\u00020\u001cH\u0016J\u0010\u0010Q\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010R\u001a\u00020\fH\u0016J\u000e\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020<J\u0016\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\fJ \u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010U\u001a\u00020\"H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010H\u001a\u00020EH\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010W\u001a\u00020\fH\u0016J\b\u0010X\u001a\u00020.H\u0016J\b\u0010Y\u001a\u00020.H\u0016J\b\u0010Z\u001a\u00020\fH\u0016J\b\u0010[\u001a\u00020\fH\u0016J\b\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020]H\u0016J\u0010\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020aH\u0016J\u0018\u0010_\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010`\u001a\u00020aH\u0016J\u0012\u0010b\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020MH\u0007J\b\u0010c\u001a\u00020\u001eH\u0016J\u0010\u0010c\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010d\u001a\u00020.H\u0016J\n\u0010e\u001a\u0004\u0018\u00010\u001eH\u0016J\u0015\u0010e\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020\fH\u0000¢\u0006\u0002\bgJ\b\u0010h\u001a\u00020\u001eH\u0016J\u0010\u0010h\u001a\u00020\u001e2\u0006\u0010i\u001a\u00020\fH\u0016J\u0010\u0010j\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010k\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fH\u0016J8\u0010l\u001a\u0002Hm\"\u0004\b\u0000\u0010m2\u0006\u00106\u001a\u00020\f2\u001a\u0010n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002Hm0oH\b¢\u0006\u0002\u0010pJ\u0010\u0010q\u001a\u00020.2\u0006\u0010r\u001a\u00020sH\u0016J\u001f\u0010t\u001a\u00020.2\u0006\u0010r\u001a\u00020s2\b\b\u0002\u0010u\u001a\u00020\"H\u0000¢\u0006\u0002\bvJ\u0006\u0010w\u001a\u00020\u001cJ\u0006\u0010x\u001a\u00020\u001cJ\u0006\u0010y\u001a\u00020\u001cJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bzJ\u0010\u0010{\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0006\u0010|\u001a\u00020\u001cJ\u000e\u0010|\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020.J\b\u0010}\u001a\u00020~H\u0016J\b\u0010\u001a\u00020\u001eH\u0016J\u0018\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020.H\u0000¢\u0006\u0003\b\u0001J\u0012\u0010\u0001\u001a\u00020.2\u0007\u0010\u0001\u001a\u00020IH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020EH\u0016J\"\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J\u001a\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010
\u0001\u001a\u00020\u001cH\u0016J\u001b\u0010\u0001\u001a\u00020\u00022\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0013\u0010\u0001\u001a\u00020\f2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0011\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u001a\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020aH\u0016J,\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020.2\u0007\u0010\u0001\u001a\u00020.2\u0006\u0010`\u001a\u00020aH\u0016J\u001b\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0007J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001eH\u0016J$\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020.2\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8\u0007@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0001"}, mo31007d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$jvm", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copyTo", "out", "Ljava/io/OutputStream;", "offset", "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", "hashCode", "", "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "segment", "segmentPos", "", "bytesLimit", "read", "sink", "Ljava/nio/ByteBuffer;", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "newline", "readUtf8Line$jvm", "readUtf8LineStrict", "limit", "request", "require", "seek", "T", "lambda", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "select", "options", "Lokio/Options;", "selectPrefix", "selectTruncated", "selectPrefix$jvm", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$jvm", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "Companion", "UnsafeCursor", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* compiled from: Buffer.kt */
public final class Buffer implements BufferedSource, C14280f, Cloneable, ByteChannel {

    /* renamed from: V */
    private static final byte[] f31846V;

    /* renamed from: U */
    private long f31847U;

    /* renamed from: c */
    public C14295s f31848c;

    /* renamed from: okio.Buffer$a */
    /* compiled from: Buffer.kt */
    public static final class C14267a {
        private C14267a() {
        }

        public /* synthetic */ C14267a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: okio.Buffer$b */
    /* compiled from: Buffer.kt */
    public static final class C14268b extends InputStream {

        /* renamed from: c */
        final /* synthetic */ Buffer f31849c;

        C14268b(Buffer buffer) {
            this.f31849c = buffer;
        }

        public int available() {
            return (int) Math.min(this.f31849c.mo36335h(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f31849c.mo36335h() > 0) {
                return this.f31849c.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31849c);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) {
            return this.f31849c.mo36292a(bArr, i, i2);
        }
    }

    /* renamed from: okio.Buffer$c */
    /* compiled from: Buffer.kt */
    public static final class C14269c extends OutputStream {

        /* renamed from: c */
        final /* synthetic */ Buffer f31850c;

        C14269c(Buffer buffer) {
            this.f31850c = buffer;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31850c);
            sb.append(".outputStream()");
            return sb.toString();
        }

        public void write(int i) {
            this.f31850c.writeByte(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f31850c.write(bArr, i, i2);
        }
    }

    static {
        new C14267a(null);
        byte[] bytes = "0123456789abcdef".getBytes(C12801c.f29474a);
        Intrinsics.checkReturnedValueIsNotNull((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f31846V = bytes;
    }

    /* renamed from: X */
    public C14303y mo35898X() {
        return C14303y.f31915d;
    }

    /* renamed from: Y */
    public byte[] mo36287Y() {
        return mo36326e(this.f31847U);
    }

    /* renamed from: Z */
    public Buffer mo36288Z() {
        return this;
    }

    /* renamed from: a0 */
    public boolean mo36309a0() {
        return this.f31847U == 0;
    }

    /* renamed from: b */
    public boolean mo36314b(long j) {
        return this.f31847U >= j;
    }

    /* renamed from: b0 */
    public String mo36315b0() throws EOFException {
        long a = mo36293a((byte) 10);
        if (a != -1) {
            return mo36343j(a);
        }
        long j = this.f31847U;
        if (j != 0) {
            return mo36339i(j);
        }
        return null;
    }

    /* renamed from: c */
    public OutputStream mo36316c() {
        return new C14269c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r5 != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Number too large: ");
        r3.append(r1.mo36327e0());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo36320c0() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f31847U
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c1
            r5 = -7
            r7 = 0
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x0010:
            okio.s r10 = r0.f31848c
            if (r10 == 0) goto L_0x00bc
            byte[] r11 = r10.f31900a
            int r12 = r10.f31901b
            int r13 = r10.f31902c
        L_0x001a:
            if (r12 >= r13) goto L_0x009d
            byte r15 = r11[r12]
            r14 = 48
            byte r14 = (byte) r14
            if (r15 < r14) goto L_0x006e
            r1 = 57
            byte r1 = (byte) r1
            if (r15 > r1) goto L_0x006e
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x0041
            if (r16 != 0) goto L_0x003a
            long r1 = (long) r14
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0079
        L_0x0041:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.m45585h(r3)
            okio.Buffer r1 = r1.writeByte(r15)
            if (r5 != 0) goto L_0x0053
            r1.readByte()
        L_0x0053:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo36327e0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006e:
            r1 = 45
            byte r1 = (byte) r1
            if (r15 != r1) goto L_0x007e
            if (r7 != 0) goto L_0x007e
            r1 = 1
            long r8 = r8 - r1
            r5 = 1
        L_0x0079:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L_0x001a
        L_0x007e:
            if (r7 == 0) goto L_0x0082
            r6 = 1
            goto L_0x009d
        L_0x0082:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009d:
            if (r12 != r13) goto L_0x00a9
            okio.s r1 = r10.mo36462b()
            r0.f31848c = r1
            okio.C14297t.m45789a(r10)
            goto L_0x00ab
        L_0x00a9:
            r10.f31901b = r12
        L_0x00ab:
            if (r6 != 0) goto L_0x00b1
            okio.s r1 = r0.f31848c
            if (r1 != 0) goto L_0x0010
        L_0x00b1:
            long r1 = r0.f31847U
            long r6 = (long) r7
            long r1 = r1 - r6
            r0.f31847U = r1
            if (r5 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            long r3 = -r3
        L_0x00bb:
            return r3
        L_0x00bc:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            r1 = 0
            throw r1
        L_0x00c1:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo36320c0():long");
    }

    public void close() {
    }

    /* renamed from: d */
    public ByteString mo36323d() {
        return new ByteString(mo36287Y());
    }

    /* renamed from: d0 */
    public String mo36324d0() throws EOFException {
        return mo36322d(Long.MAX_VALUE);
    }

    /* renamed from: e */
    public int mo36325e() throws EOFException {
        return C14273c.m45649a(readInt());
    }

    /* renamed from: e0 */
    public String mo36327e0() {
        return mo36299a(this.f31847U, C12801c.f29474a);
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Buffer)) {
            return false;
        }
        long j = this.f31847U;
        Buffer buffer = (Buffer) obj2;
        if (j != buffer.f31847U) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C14295s sVar = this.f31848c;
        if (sVar != null) {
            C14295s sVar2 = buffer.f31848c;
            if (sVar2 != null) {
                int i = sVar.f31901b;
                int i2 = sVar2.f31901b;
                long j3 = 0;
                while (j3 < this.f31847U) {
                    long min = (long) Math.min(sVar.f31902c - i, sVar2.f31902c - i2);
                    long j4 = j2;
                    while (j4 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (sVar.f31900a[i] != sVar2.f31900a[i2]) {
                            return false;
                        }
                        j4++;
                        i = i3;
                        i2 = i4;
                    }
                    if (i == sVar.f31902c) {
                        sVar = sVar.f31905f;
                        if (sVar != null) {
                            i = sVar.f31901b;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    }
                    if (i2 == sVar2.f31902c) {
                        sVar2 = sVar2.f31905f;
                        if (sVar2 != null) {
                            i2 = sVar2.f31901b;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    }
                    j3 += min;
                    j2 = 0;
                }
                return true;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: f */
    public void mo36330f(long j) throws EOFException {
        if (this.f31847U < j) {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r8 != r9) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        r15.f31848c = r6.mo36462b();
        okio.C14297t.m45789a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r6.f31901b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r0 != false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c A[SYNTHETIC] */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo36331f0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f31847U
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b7
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            okio.s r6 = r15.f31848c
            if (r6 == 0) goto L_0x00b2
            byte[] r7 = r6.f31900a
            int r8 = r6.f31901b
            int r9 = r6.f31902c
        L_0x0015:
            if (r8 >= r9) goto L_0x0097
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0026
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0026
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0026:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0035
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0035
        L_0x0030:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0040
        L_0x0035:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0078
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0078
            goto L_0x0030
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0050:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.m45581g(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo36327e0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0078:
            if (r1 == 0) goto L_0x007c
            r0 = 1
            goto L_0x0097
        L_0x007c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0097:
            if (r8 != r9) goto L_0x00a3
            okio.s r7 = r6.mo36462b()
            r15.f31848c = r7
            okio.C14297t.m45789a(r6)
            goto L_0x00a5
        L_0x00a3:
            r6.f31901b = r8
        L_0x00a5:
            if (r0 != 0) goto L_0x00ab
            okio.s r6 = r15.f31848c
            if (r6 != 0) goto L_0x000b
        L_0x00ab:
            long r2 = r15.f31847U
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f31847U = r2
            return r4
        L_0x00b2:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            r0 = 0
            throw r0
        L_0x00b7:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.mo36331f0():long");
    }

    public void flush() {
    }

    /* renamed from: g0 */
    public InputStream mo36334g0() {
        return new C14268b(this);
    }

    /* renamed from: h0 */
    public Buffer mo36337h0() {
        return this;
    }

    public int hashCode() {
        C14295s sVar = this.f31848c;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = sVar.f31901b; i2 < sVar.f31902c; i2++) {
                i = (i * 31) + sVar.f31900a[i2];
            }
            sVar = sVar.f31905f;
            if (sVar == null) {
                Intrinsics.throwNpe();
                throw null;
            }
        } while (sVar != this.f31848c);
        return i;
    }

    /* renamed from: i */
    public String mo36339i(long j) throws EOFException {
        return mo36299a(j, C12801c.f29474a);
    }

    /* renamed from: i0 */
    public Buffer m45590i0() {
        return this;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final String mo36343j(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo36289a(j2) == ((byte) 13)) {
                String i = mo36339i(j2);
                skip(2);
                return i;
            }
        }
        String i2 = mo36339i(j);
        skip(1);
        return i2;
    }

    /* renamed from: k */
    public final void mo36344k(long j) {
        this.f31847U = j;
    }

    public BufferedSource peek() {
        return C14287m.m45716a((C14302x) new C14291p(this));
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C14295s sVar = this.f31848c;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), sVar.f31902c - sVar.f31901b);
        byteBuffer.put(sVar.f31900a, sVar.f31901b, min);
        sVar.f31901b += min;
        this.f31847U -= (long) min;
        if (sVar.f31901b == sVar.f31902c) {
            this.f31848c = sVar.mo36462b();
            C14297t.m45789a(sVar);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        long j = this.f31847U;
        if (j != 0) {
            C14295s sVar = this.f31848c;
            if (sVar != null) {
                int i = sVar.f31901b;
                int i2 = sVar.f31902c;
                int i3 = i + 1;
                byte b = sVar.f31900a[i];
                this.f31847U = j - 1;
                if (i3 == i2) {
                    this.f31848c = sVar.mo36462b();
                    C14297t.m45789a(sVar);
                } else {
                    sVar.f31901b = i3;
                }
                return b;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = mo36292a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() throws EOFException {
        long j = this.f31847U;
        if (j >= 4) {
            C14295s sVar = this.f31848c;
            if (sVar != null) {
                int i = sVar.f31901b;
                int i2 = sVar.f31902c;
                if (((long) (i2 - i)) < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = sVar.f31900a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
                int i5 = i4 + 1;
                byte b2 = b | ((bArr[i4] & 255) << 8);
                int i6 = i5 + 1;
                byte b3 = b2 | (bArr[i5] & 255);
                this.f31847U = j - 4;
                if (i6 == i2) {
                    this.f31848c = sVar.mo36462b();
                    C14297t.m45789a(sVar);
                } else {
                    sVar.f31901b = i6;
                }
                return b3;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        long j = this.f31847U;
        if (j >= 2) {
            C14295s sVar = this.f31848c;
            if (sVar != null) {
                int i = sVar.f31901b;
                int i2 = sVar.f31902c;
                if (i2 - i < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = sVar.f31900a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
                this.f31847U = j - 2;
                if (i4 == i2) {
                    this.f31848c = sVar.mo36462b();
                    C14297t.m45789a(sVar);
                } else {
                    sVar.f31901b = i4;
                }
                return (short) b;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        throw new EOFException();
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            C14295s sVar = this.f31848c;
            if (sVar != null) {
                int min = (int) Math.min(j, (long) (sVar.f31902c - sVar.f31901b));
                long j2 = (long) min;
                this.f31847U -= j2;
                j -= j2;
                sVar.f31901b += min;
                if (sVar.f31901b == sVar.f31902c) {
                    this.f31848c = sVar.mo36462b();
                    C14297t.m45789a(sVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        return mo36340i().toString();
    }

    /* renamed from: b */
    public final long mo36310b() {
        long j = this.f31847U;
        if (j == 0) {
            return 0;
        }
        C14295s sVar = this.f31848c;
        if (sVar != null) {
            C14295s sVar2 = sVar.f31906g;
            if (sVar2 != null) {
                int i = sVar2.f31902c;
                if (i < 8192 && sVar2.f31904e) {
                    j -= (long) (i - sVar2.f31901b);
                }
                return j;
            }
            Intrinsics.throwNpe();
            throw null;
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: c */
    public ByteString mo36319c(long j) throws EOFException {
        return new ByteString(mo36326e(j));
    }

    public Buffer clone() {
        Buffer buffer = new Buffer();
        if (this.f31847U == 0) {
            return buffer;
        }
        C14295s sVar = this.f31848c;
        if (sVar != null) {
            buffer.f31848c = sVar.mo36463c();
            C14295s sVar2 = buffer.f31848c;
            if (sVar2 != null) {
                sVar2.f31906g = sVar2;
                if (sVar2 == null) {
                    Intrinsics.throwNpe();
                    throw null;
                } else if (sVar2 != null) {
                    sVar2.f31905f = sVar2.f31906g;
                    C14295s sVar3 = this.f31848c;
                    if (sVar3 != null) {
                        C14295s sVar4 = sVar3.f31905f;
                        while (sVar4 != this.f31848c) {
                            C14295s sVar5 = buffer.f31848c;
                            if (sVar5 != null) {
                                C14295s sVar6 = sVar5.f31906g;
                                if (sVar6 == null) {
                                    Intrinsics.throwNpe();
                                    throw null;
                                } else if (sVar4 != null) {
                                    sVar6.mo36459a(sVar4.mo36463c());
                                    sVar4 = sVar4.f31905f;
                                } else {
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                        buffer.f31847U = this.f31847U;
                        return buffer;
                    }
                    Intrinsics.throwNpe();
                    throw null;
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        } else {
            Intrinsics.throwNpe();
            throw null;
        }
    }

    /* renamed from: d */
    public String mo36322d(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long a = mo36294a(b, 0, j2);
            if (a != -1) {
                return mo36343j(a);
            }
            if (j2 < this.f31847U && mo36289a(j2 - 1) == ((byte) 13) && mo36289a(j2) == b) {
                return mo36343j(j2);
            }
            Buffer buffer = new Buffer();
            mo36305a(buffer, 0, Math.min((long) 32, this.f31847U));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.f31847U, j));
            sb.append(" content=");
            sb.append(buffer.mo36323d().mo36386f());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* renamed from: e */
    public byte[] mo36326e(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.f31847U >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: f */
    public short mo36329f() throws EOFException {
        return C14273c.m45650a(readShort());
    }

    /* renamed from: g */
    public int mo36332g() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.f31847U != 0) {
            byte a = mo36289a(0);
            int i2 = 1;
            byte b3 = 65533;
            if ((a & 128) == 0) {
                b2 = a & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((a & 224) == 192) {
                b2 = a & 31;
                i = 2;
                b = 128;
            } else if ((a & 240) == 224) {
                b2 = a & 15;
                i = 3;
                b = 2048;
            } else if ((a & 248) == 240) {
                b2 = a & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f31847U >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte a2 = mo36289a(j2);
                    if ((a2 & 192) == 128) {
                        b2 = (b2 << 6) | (a2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 <= 1114111 && ((55296 > b2 || 57343 < b2) && b2 >= b)) {
                    b3 = b2;
                }
                return b3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("size < ");
            sb.append(i);
            sb.append(": ");
            sb.append(this.f31847U);
            sb.append(" (to read code point prefixed 0x");
            sb.append(Integer.toHexString(a));
            sb.append(")");
            throw new EOFException(sb.toString());
        }
        throw new EOFException();
    }

    /* renamed from: h */
    public final long mo36335h() {
        return this.f31847U;
    }

    /* renamed from: i */
    public final ByteString mo36340i() {
        if (this.f31847U <= ((long) Integer.MAX_VALUE)) {
            return mo36306a((int) this.f31847U);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.f31847U);
        throw new IllegalStateException(sb.toString().toString());
    }

    public Buffer writeByte(int i) {
        C14295s b = mo36313b(1);
        byte[] bArr = b.f31900a;
        int i2 = b.f31902c;
        b.f31902c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f31847U++;
        return this;
    }

    public Buffer writeInt(int i) {
        C14295s b = mo36313b(4);
        byte[] bArr = b.f31900a;
        int i2 = b.f31902c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        b.f31902c = i6;
        this.f31847U += 4;
        return this;
    }

    public Buffer writeShort(int i) {
        C14295s b = mo36313b(2);
        byte[] bArr = b.f31900a;
        int i2 = b.f31902c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        b.f31902c = i4;
        this.f31847U += 2;
        return this;
    }

    /* renamed from: c */
    public Buffer mo36318c(ByteString byteString) {
        byteString.mo36373a(this);
        return this;
    }

    /* renamed from: h */
    public Buffer m45585h(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return m45552a("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        C14295s b = mo36313b(i2);
        byte[] bArr = b.f31900a;
        int i3 = b.f31902c + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = f31846V[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        b.f31902c += i2;
        this.f31847U += (long) i2;
        return this;
    }

    public Buffer write(byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final Buffer mo36305a(Buffer buffer, long j, long j2) {
        C14273c.m45651a(this.f31847U, j, j2);
        if (j2 == 0) {
            return this;
        }
        buffer.f31847U += j2;
        C14295s sVar = this.f31848c;
        while (sVar != null) {
            int i = sVar.f31902c;
            int i2 = sVar.f31901b;
            if (j >= ((long) (i - i2))) {
                j -= (long) (i - i2);
                sVar = sVar.f31905f;
            } else {
                while (j2 > 0) {
                    if (sVar != null) {
                        C14295s c = sVar.mo36463c();
                        c.f31901b += (int) j;
                        c.f31902c = Math.min(c.f31901b + ((int) j2), c.f31902c);
                        C14295s sVar2 = buffer.f31848c;
                        if (sVar2 == null) {
                            c.f31906g = c;
                            c.f31905f = c.f31906g;
                            buffer.f31848c = c.f31905f;
                        } else if (sVar2 != null) {
                            C14295s sVar3 = sVar2.f31906g;
                            if (sVar3 != null) {
                                sVar3.mo36459a(c);
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                        j2 -= (long) (c.f31902c - c.f31901b);
                        sVar = sVar.f31905f;
                        j = 0;
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                }
                return this;
            }
        }
        Intrinsics.throwNpe();
        throw null;
    }

    /* renamed from: c */
    public Buffer mo36317c(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            C14295s b = mo36313b(2);
            byte[] bArr = b.f31900a;
            int i2 = b.f31902c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            b.f31902c = i2 + 2;
            this.f31847U += 2;
        } else if (55296 <= i && 57343 >= i) {
            writeByte(63);
        } else if (i < 65536) {
            C14295s b2 = mo36313b(3);
            byte[] bArr2 = b2.f31900a;
            int i3 = b2.f31902c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            b2.f31902c = i3 + 3;
            this.f31847U += 3;
        } else if (i <= 1114111) {
            C14295s b3 = mo36313b(4);
            byte[] bArr3 = b3.f31900a;
            int i4 = b3.f31902c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            b3.f31902c = i4 + 4;
            this.f31847U += 4;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    public Buffer write(byte[] bArr, int i, int i2) {
        long j = (long) i2;
        C14273c.m45651a((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C14295s b = mo36313b(1);
            int min = Math.min(i3 - i, 8192 - b.f31902c);
            System.arraycopy(bArr, i, b.f31900a, b.f31902c, min);
            i += min;
            b.f31902c += min;
        }
        this.f31847U += j;
        return this;
    }

    /* renamed from: b */
    public final C14295s mo36313b(int i) {
        C14295s sVar;
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C14295s sVar2 = this.f31848c;
            if (sVar2 == null) {
                C14295s a = C14297t.m45788a();
                this.f31848c = a;
                a.f31906g = a;
                a.f31905f = a;
                return a;
            } else if (sVar2 != null) {
                C14295s sVar3 = sVar2.f31906g;
                if (sVar3 != null) {
                    if (sVar3.f31902c + i > 8192 || !sVar3.f31904e) {
                        sVar = C14297t.m45788a();
                        sVar3.mo36459a(sVar);
                    } else {
                        sVar = sVar3;
                    }
                    return sVar;
                }
                Intrinsics.throwNpe();
                throw null;
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
        } else {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C14295s b = mo36313b(1);
            int min = Math.min(i, 8192 - b.f31902c);
            byteBuffer.get(b.f31900a, b.f31902c, min);
            i -= min;
            b.f31902c += min;
        }
        this.f31847U += (long) remaining;
        return remaining;
    }

    /* renamed from: g */
    public Buffer m45581g(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C14295s b = mo36313b(numberOfTrailingZeros);
        byte[] bArr = b.f31900a;
        int i = b.f31902c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f31846V[(int) (15 & j)];
            j >>>= 4;
        }
        b.f31902c += numberOfTrailingZeros;
        this.f31847U += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: b */
    public void mo35927b(Buffer buffer, long j) {
        C14295s sVar;
        if (buffer != this) {
            C14273c.m45651a(buffer.f31847U, 0, j);
            while (j > 0) {
                C14295s sVar2 = buffer.f31848c;
                if (sVar2 != null) {
                    int i = sVar2.f31902c;
                    if (sVar2 != null) {
                        if (j < ((long) (i - sVar2.f31901b))) {
                            C14295s sVar3 = this.f31848c;
                            if (sVar3 == null) {
                                sVar = null;
                            } else if (sVar3 != null) {
                                sVar = sVar3.f31906g;
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                            if (sVar != null && sVar.f31904e) {
                                if ((((long) sVar.f31902c) + j) - ((long) (sVar.f31903d ? 0 : sVar.f31901b)) <= ((long) ContentServiceClientExtras.URL_SIZE_LIMIT)) {
                                    C14295s sVar4 = buffer.f31848c;
                                    if (sVar4 != null) {
                                        sVar4.mo36461a(sVar, (int) j);
                                        buffer.f31847U -= j;
                                        this.f31847U += j;
                                        return;
                                    }
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            }
                            C14295s sVar5 = buffer.f31848c;
                            if (sVar5 != null) {
                                buffer.f31848c = sVar5.mo36458a((int) j);
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                        C14295s sVar6 = buffer.f31848c;
                        if (sVar6 != null) {
                            long j2 = (long) (sVar6.f31902c - sVar6.f31901b);
                            buffer.f31848c = sVar6.mo36462b();
                            C14295s sVar7 = this.f31848c;
                            if (sVar7 == null) {
                                this.f31848c = sVar6;
                                sVar6.f31906g = sVar6;
                                sVar6.f31905f = sVar6.f31906g;
                            } else if (sVar7 != null) {
                                C14295s sVar8 = sVar7.f31906g;
                                if (sVar8 != null) {
                                    sVar8.mo36459a(sVar6);
                                    sVar6.mo36460a();
                                } else {
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                            buffer.f31847U -= j2;
                            this.f31847U += j2;
                            j -= j2;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: a */
    public final byte mo36289a(long j) {
        C14273c.m45651a(this.f31847U, j, 1);
        C14295s sVar = this.f31848c;
        if (sVar == null) {
            Intrinsics.throwNpe();
            throw null;
        } else if (mo36335h() - j < j) {
            long h = mo36335h();
            while (h > j) {
                sVar = sVar.f31906g;
                if (sVar != null) {
                    h -= (long) (sVar.f31902c - sVar.f31901b);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
            if (sVar != null) {
                return sVar.f31900a[(int) ((((long) sVar.f31901b) + j) - h)];
            }
            Intrinsics.throwNpe();
            throw null;
        } else {
            long j2 = 0;
            while (true) {
                int i = sVar.f31902c;
                int i2 = sVar.f31901b;
                long j3 = ((long) (i - i2)) + j2;
                if (j3 <= j) {
                    sVar = sVar.f31905f;
                    if (sVar != null) {
                        j2 = j3;
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                } else if (sVar != null) {
                    return sVar.f31900a[(int) ((((long) i2) + j) - j2)];
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    public int mo36290a(C14288n nVar) {
        int a = m45528a(this, nVar, false, 2, (Object) null);
        if (a == -1) {
            return -1;
        }
        skip((long) nVar.mo36427b()[a].size());
        return a;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m45528a(Buffer buffer, C14288n nVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return buffer.mo36291a(nVar, z);
    }

    /* renamed from: a */
    public final int mo36291a(C14288n nVar, boolean z) {
        int i;
        int i2;
        C14295s sVar = this.f31848c;
        int i3 = -2;
        if (sVar != null) {
            byte[] bArr = sVar.f31900a;
            int i4 = sVar.f31901b;
            int i5 = sVar.f31902c;
            int[] d = nVar.mo36432d();
            int i6 = i4;
            int i7 = i5;
            int i8 = -1;
            C14295s sVar2 = sVar;
            byte[] bArr2 = bArr;
            int i9 = 0;
            loop0:
            while (true) {
                int i10 = i9 + 1;
                int i11 = d[i9];
                int i12 = i10 + 1;
                int i13 = d[i10];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (sVar2 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        i2 = i6 + 1;
                        int i15 = i12 + 1;
                        if ((bArr2[i6] & 255) != d[i12]) {
                            return i8;
                        }
                        boolean z2 = i15 == i14;
                        if (i2 == i7) {
                            if (sVar2 != null) {
                                C14295s sVar3 = sVar2.f31905f;
                                if (sVar3 != null) {
                                    int i16 = sVar3.f31901b;
                                    bArr2 = sVar3.f31900a;
                                    i7 = sVar3.f31902c;
                                    if (sVar3 != sVar) {
                                        int i17 = i16;
                                        sVar2 = sVar3;
                                        i2 = i17;
                                    } else if (!z2) {
                                        break loop0;
                                    } else {
                                        i2 = i16;
                                        sVar2 = null;
                                    }
                                } else {
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                        if (z2) {
                            i = d[i15];
                            break;
                        }
                        i6 = i2;
                        i12 = i15;
                    }
                } else {
                    int i18 = i6 + 1;
                    byte b = bArr2[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (b == d[i12]) {
                            i = d[i12 + i11];
                            if (i18 == i7) {
                                C14295s sVar4 = sVar2.f31905f;
                                if (sVar4 != null) {
                                    i2 = sVar4.f31901b;
                                    byte[] bArr3 = sVar4.f31900a;
                                    i7 = sVar4.f31902c;
                                    bArr2 = bArr3;
                                    sVar2 = sVar4 == sVar ? null : sVar4;
                                } else {
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            } else {
                                i2 = i18;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                if (i >= 0) {
                    return i;
                }
                int i20 = -i;
                i6 = i2;
                i9 = i20;
                i3 = -2;
            }
            return z ? i3 : i8;
        }
        return z ? -2 : -1;
    }

    /* renamed from: b */
    public long mo36311b(ByteString byteString) {
        return mo36312b(byteString, 0);
    }

    /* renamed from: b */
    public long mo36312b(ByteString byteString, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        long j3 = 0;
        if (j >= 0) {
            C14295s sVar = this.f31848c;
            if (sVar == null) {
                return -1;
            }
            if (mo36335h() - j < j) {
                j2 = mo36335h();
                while (j2 > j) {
                    sVar = sVar.f31906g;
                    if (sVar != null) {
                        j2 -= (long) (sVar.f31902c - sVar.f31901b);
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                }
                if (sVar != null) {
                    if (byteString.size() == 2) {
                        byte a = byteString.mo36369a(0);
                        byte a2 = byteString.mo36369a(1);
                        while (j2 < this.f31847U) {
                            byte[] bArr = sVar.f31900a;
                            i2 = (int) ((((long) sVar.f31901b) + j) - j2);
                            int i4 = sVar.f31902c;
                            while (i2 < i4) {
                                byte b = bArr[i2];
                                if (!(b == a || b == a2)) {
                                    i2++;
                                }
                            }
                            j = ((long) (sVar.f31902c - sVar.f31901b)) + j2;
                            sVar = sVar.f31905f;
                            if (sVar != null) {
                                j2 = j;
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                    } else {
                        byte[] g = byteString.mo36387g();
                        while (j2 < this.f31847U) {
                            byte[] bArr2 = sVar.f31900a;
                            i = (int) ((((long) sVar.f31901b) + j) - j2);
                            int i5 = sVar.f31902c;
                            while (i < i5) {
                                byte b2 = bArr2[i];
                                for (byte b3 : g) {
                                    if (b2 == b3) {
                                        i3 = sVar.f31901b;
                                        return ((long) (i2 - i3)) + j2;
                                    }
                                }
                                i++;
                            }
                            j = ((long) (sVar.f31902c - sVar.f31901b)) + j2;
                            sVar = sVar.f31905f;
                            if (sVar != null) {
                                j2 = j;
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                    }
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (sVar.f31902c - sVar.f31901b)) + j3;
                if (j4 > j) {
                    if (sVar != null) {
                        if (byteString.size() == 2) {
                            byte a3 = byteString.mo36369a(0);
                            byte a4 = byteString.mo36369a(1);
                            while (j2 < this.f31847U) {
                                byte[] bArr3 = sVar.f31900a;
                                int i6 = (int) ((((long) sVar.f31901b) + j) - j2);
                                int i7 = sVar.f31902c;
                                while (i2 < i7) {
                                    byte b4 = bArr3[i2];
                                    if (!(b4 == a3 || b4 == a4)) {
                                        i6 = i2 + 1;
                                    }
                                }
                                j = ((long) (sVar.f31902c - sVar.f31901b)) + j2;
                                sVar = sVar.f31905f;
                                if (sVar != null) {
                                    j3 = j;
                                } else {
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            }
                        } else {
                            byte[] g2 = byteString.mo36387g();
                            while (j2 < this.f31847U) {
                                byte[] bArr4 = sVar.f31900a;
                                int i8 = (int) ((((long) sVar.f31901b) + j) - j2);
                                int i9 = sVar.f31902c;
                                while (i < i9) {
                                    byte b5 = bArr4[i];
                                    int length = g2.length;
                                    int i10 = 0;
                                    while (i10 < length) {
                                        if (b5 != g2[i10]) {
                                            i10++;
                                        }
                                    }
                                    i8 = i + 1;
                                }
                                j = ((long) (sVar.f31902c - sVar.f31901b)) + j2;
                                sVar = sVar.f31905f;
                                if (sVar != null) {
                                    j3 = j;
                                } else {
                                    Intrinsics.throwNpe();
                                    throw null;
                                }
                            }
                        }
                    }
                    return -1;
                }
                sVar = sVar.f31905f;
                if (sVar != null) {
                    j3 = j4;
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
            i3 = sVar.f31901b;
            return ((long) (i2 - i3)) + j2;
            i3 = sVar.f31901b;
            return ((long) (i2 - i3)) + j2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fromIndex < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public long mo36297a(C14300v vVar) throws IOException {
        long j = this.f31847U;
        if (j > 0) {
            vVar.mo35927b(this, j);
        }
        return j;
    }

    /* renamed from: a */
    public String mo36300a(Charset charset) {
        return mo36299a(this.f31847U, charset);
    }

    /* renamed from: a */
    public String mo36299a(long j, Charset charset) throws EOFException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.f31847U < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            C14295s sVar = this.f31848c;
            if (sVar != null) {
                int i2 = sVar.f31901b;
                if (((long) i2) + j > ((long) sVar.f31902c)) {
                    return new String(mo36326e(j), charset);
                }
                int i3 = (int) j;
                String str = new String(sVar.f31900a, i2, i3, charset);
                sVar.f31901b += i3;
                this.f31847U -= j;
                if (sVar.f31901b == sVar.f31902c) {
                    this.f31848c = sVar.mo36462b();
                    C14297t.m45789a(sVar);
                }
                return str;
            }
            Intrinsics.throwNpe();
            throw null;
        }
    }

    /* renamed from: a */
    public int mo36292a(byte[] bArr, int i, int i2) {
        C14273c.m45651a((long) bArr.length, (long) i, (long) i2);
        C14295s sVar = this.f31848c;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i2, sVar.f31902c - sVar.f31901b);
        System.arraycopy(sVar.f31900a, sVar.f31901b, bArr, i, min);
        sVar.f31901b += min;
        this.f31847U -= (long) min;
        if (sVar.f31901b == sVar.f31902c) {
            this.f31848c = sVar.mo36462b();
            C14297t.m45789a(sVar);
        }
        return min;
    }

    /* renamed from: a */
    public final void mo36308a() {
        skip(this.f31847U);
    }

    /* renamed from: a */
    public Buffer m45552a(String str) {
        return m45553a(str, 0, str.length());
    }

    /* renamed from: a */
    public Buffer m45553a(String str, int i, int i2) {
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C14295s b = mo36313b(1);
                            byte[] bArr = b.f31900a;
                            int i3 = b.f31902c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                int i5 = i4 + 1;
                                bArr[i4 + i3] = (byte) charAt2;
                                i4 = i5;
                            }
                            int i6 = i3 + i4;
                            int i7 = b.f31902c;
                            int i8 = i6 - i7;
                            b.f31902c = i7 + i8;
                            this.f31847U += (long) i8;
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C14295s b2 = mo36313b(2);
                                byte[] bArr2 = b2.f31900a;
                                int i9 = b2.f31902c;
                                bArr2[i9] = (byte) ((charAt >> 6) | 192);
                                bArr2[i9 + 1] = (byte) ((charAt & '?') | 128);
                                b2.f31902c = i9 + 2;
                                this.f31847U += 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                C14295s b3 = mo36313b(3);
                                byte[] bArr3 = b3.f31900a;
                                int i10 = b3.f31902c;
                                bArr3[i10] = (byte) ((charAt >> 12) | 224);
                                bArr3[i10 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i10 + 2] = (byte) ((charAt & '?') | 128);
                                b3.f31902c = i10 + 3;
                                this.f31847U += 3;
                            } else {
                                int i11 = i + 1;
                                char charAt3 = i11 < i2 ? str.charAt(i11) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    writeByte(63);
                                    i = i11;
                                } else {
                                    int i12 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + DateUtils.FORMAT_ABBREV_MONTH;
                                    C14295s b4 = mo36313b(4);
                                    byte[] bArr4 = b4.f31900a;
                                    int i13 = b4.f31902c;
                                    bArr4[i13] = (byte) ((i12 >> 18) | 240);
                                    bArr4[i13 + 1] = (byte) (((i12 >> 12) & 63) | 128);
                                    bArr4[i13 + 2] = (byte) (((i12 >> 6) & 63) | 128);
                                    bArr4[i13 + 3] = (byte) ((i12 & 63) | 128);
                                    b4.f31902c = i13 + 4;
                                    this.f31847U += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("endIndex > string.length: ");
                sb.append(i2);
                sb.append(" > ");
                sb.append(str.length());
                throw new IllegalArgumentException(sb.toString().toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("beginIndex < 0: ");
        sb3.append(i);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    /* renamed from: a */
    public Buffer m45554a(String str, Charset charset) {
        return mo36303a(str, 0, str.length(), charset);
    }

    /* renamed from: a */
    public Buffer mo36303a(String str, int i, int i2, Charset charset) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("endIndex > string.length: ");
                    sb.append(i2);
                    sb.append(" > ");
                    sb.append(str.length());
                    throw new IllegalArgumentException(sb.toString().toString());
                } else if (Intrinsics.areEqual((Object) charset, (Object) C12801c.f29474a)) {
                    return m45553a(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        Intrinsics.checkReturnedValueIsNotNull((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        return write(bytes, 0, bytes.length);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("endIndex < beginIndex: ");
                sb2.append(i2);
                sb2.append(" < ");
                sb2.append(i);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("beginIndex < 0: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
    }

    /* renamed from: a */
    public long mo36298a(C14302x xVar) throws IOException {
        long j = 0;
        while (true) {
            long a = xVar.mo35899a(this, (long) ContentServiceClientExtras.URL_SIZE_LIMIT);
            if (a == -1) {
                return j;
            }
            j += a;
        }
    }

    /* renamed from: a */
    public C14280f mo36307a(C14302x xVar, long j) throws IOException {
        while (j > 0) {
            long a = xVar.mo35899a(this, j);
            if (a != -1) {
                j -= a;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: a */
    public long mo35899a(Buffer buffer, long j) {
        if (j >= 0) {
            long j2 = this.f31847U;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            buffer.mo35927b(this, j);
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public long mo36293a(byte b) {
        return mo36294a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo36294a(byte b, long j, long j2) {
        long j3;
        int i;
        byte b2 = b;
        long j4 = j;
        long j5 = j2;
        long j6 = 0;
        if (0 <= j4 && j5 >= j4) {
            long j7 = this.f31847U;
            if (j5 > j7) {
                j5 = j7;
            }
            long j8 = -1;
            if (j4 == j5) {
                return -1;
            }
            C14295s sVar = this.f31848c;
            if (sVar == null) {
                return -1;
            }
            if (mo36335h() - j4 < j4) {
                j3 = mo36335h();
                while (j3 > j4) {
                    sVar = sVar.f31906g;
                    if (sVar != null) {
                        j3 -= (long) (sVar.f31902c - sVar.f31901b);
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                }
                if (sVar == null) {
                    return -1;
                }
                while (j3 < j5) {
                    byte[] bArr = sVar.f31900a;
                    int min = (int) Math.min((long) sVar.f31902c, (((long) sVar.f31901b) + j5) - j3);
                    i = (int) ((((long) sVar.f31901b) + j4) - j3);
                    while (i < min) {
                        if (bArr[i] != b2) {
                            i++;
                        }
                    }
                    j4 = ((long) (sVar.f31902c - sVar.f31901b)) + j3;
                    sVar = sVar.f31905f;
                    if (sVar != null) {
                        j3 = j4;
                        j8 = -1;
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                }
                return j8;
            }
            while (true) {
                long j9 = ((long) (sVar.f31902c - sVar.f31901b)) + j6;
                if (j9 <= j4) {
                    sVar = sVar.f31905f;
                    if (sVar != null) {
                        j6 = j9;
                    } else {
                        Intrinsics.throwNpe();
                        throw null;
                    }
                } else if (sVar == null) {
                    return -1;
                } else {
                    while (j3 < j5) {
                        byte[] bArr2 = sVar.f31900a;
                        int min2 = (int) Math.min((long) sVar.f31902c, (((long) sVar.f31901b) + j5) - j3);
                        int i2 = (int) ((((long) sVar.f31901b) + j4) - j3);
                        while (i < min2) {
                            if (bArr2[i] != b2) {
                                i2 = i + 1;
                            }
                        }
                        j4 = ((long) (sVar.f31902c - sVar.f31901b)) + j3;
                        sVar = sVar.f31905f;
                        if (sVar != null) {
                            j6 = j4;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    }
                    return -1;
                }
            }
            return ((long) (i - sVar.f31901b)) + j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size=");
        sb.append(this.f31847U);
        sb.append(" fromIndex=");
        sb.append(j4);
        sb.append(" toIndex=");
        sb.append(j5);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public long mo36295a(ByteString byteString) throws IOException {
        return mo36296a(byteString, 0);
    }

    /* renamed from: a */
    public long mo36296a(ByteString byteString, long j) throws IOException {
        byte[] bArr;
        C14295s sVar;
        Buffer buffer = this;
        long j2 = j;
        boolean z = true;
        if (byteString.size() > 0) {
            long j3 = 0;
            if (j2 < 0) {
                z = false;
            }
            if (z) {
                C14295s sVar2 = buffer.f31848c;
                if (sVar2 == null) {
                    return -1;
                }
                if (mo36335h() - j2 < j2) {
                    long h = mo36335h();
                    while (h > j2) {
                        sVar2 = sVar2.f31906g;
                        if (sVar2 != null) {
                            h -= (long) (sVar2.f31902c - sVar2.f31901b);
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    }
                    if (sVar2 == null) {
                        return -1;
                    }
                    byte[] g = byteString.mo36387g();
                    byte b = g[0];
                    int size = byteString.size();
                    long j4 = (buffer.f31847U - ((long) size)) + 1;
                    long j5 = h;
                    C14295s sVar3 = sVar2;
                    while (j5 < j4) {
                        byte[] bArr2 = sVar3.f31900a;
                        int i = size;
                        int min = (int) Math.min((long) sVar3.f31902c, (((long) sVar3.f31901b) + j4) - j5);
                        int i2 = (int) ((((long) sVar3.f31901b) + j2) - j5);
                        while (i2 < min) {
                            if (bArr2[i2] == b) {
                                bArr = bArr2;
                                sVar = sVar3;
                                if (m45529a(sVar3, i2 + 1, g, 1, i)) {
                                    return ((long) (i2 - sVar.f31901b)) + j5;
                                }
                            } else {
                                bArr = bArr2;
                                sVar = sVar3;
                            }
                            i2++;
                            sVar3 = sVar;
                            bArr2 = bArr;
                        }
                        C14295s sVar4 = sVar3;
                        j2 = ((long) (sVar4.f31902c - sVar4.f31901b)) + j5;
                        sVar3 = sVar4.f31905f;
                        if (sVar3 != null) {
                            size = i;
                            j5 = j2;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    }
                    return -1;
                }
                while (true) {
                    long j6 = ((long) (sVar2.f31902c - sVar2.f31901b)) + j3;
                    if (j6 <= j2) {
                        sVar2 = sVar2.f31905f;
                        if (sVar2 != null) {
                            buffer = this;
                            j3 = j6;
                        } else {
                            Intrinsics.throwNpe();
                            throw null;
                        }
                    } else if (sVar2 == null) {
                        return -1;
                    } else {
                        byte[] g2 = byteString.mo36387g();
                        byte b2 = g2[0];
                        int size2 = byteString.size();
                        long j7 = 1 + (buffer.f31847U - ((long) size2));
                        C14295s sVar5 = sVar2;
                        while (j3 < j7) {
                            byte[] bArr3 = sVar5.f31900a;
                            long j8 = j7;
                            int min2 = (int) Math.min((long) sVar5.f31902c, (((long) sVar5.f31901b) + j7) - j3);
                            for (int i3 = (int) ((((long) sVar5.f31901b) + j2) - j3); i3 < min2; i3++) {
                                if (bArr3[i3] == b2) {
                                    if (m45529a(sVar5, i3 + 1, g2, 1, size2)) {
                                        return ((long) (i3 - sVar5.f31901b)) + j3;
                                    }
                                }
                            }
                            j2 = ((long) (sVar5.f31902c - sVar5.f31901b)) + j3;
                            sVar5 = sVar5.f31905f;
                            if (sVar5 != null) {
                                j3 = j2;
                                j7 = j8;
                            } else {
                                Intrinsics.throwNpe();
                                throw null;
                            }
                        }
                        return -1;
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("fromIndex < 0: ");
                sb.append(j2);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        } else {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
    }

    /* renamed from: a */
    private final boolean m45529a(C14295s sVar, int i, byte[] bArr, int i2, int i3) {
        int i4 = sVar.f31902c;
        byte[] bArr2 = sVar.f31900a;
        while (i2 < i3) {
            if (i == i4) {
                sVar = sVar.f31905f;
                if (sVar != null) {
                    byte[] bArr3 = sVar.f31900a;
                    int i5 = sVar.f31901b;
                    bArr2 = bArr3;
                    i = i5;
                    i4 = sVar.f31902c;
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    public final ByteString mo36306a(int i) {
        return i == 0 ? ByteString.f31851W : C14298u.f31910a0.mo36466a(this, i);
    }
}
