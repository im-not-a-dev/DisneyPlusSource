package okio;

import java.io.Serializable;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okio.p698z.C14306a;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 Z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001ZB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0000J\u0013\u0010!\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0002\b&J\u0015\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0007¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\tH\u0010¢\u0006\u0002\b)J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\u001d\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0000H\u0010¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\r\u00103\u001a\u00020\u0004H\u0010¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\tH\u0010¢\u0006\u0002\b7J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\b\u00109\u001a\u00020\u0000H\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020\u0000H\u0016J\b\u0010C\u001a\u00020\u0000H\u0016J\b\u0010D\u001a\u00020\u0000H\u0016J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0004J\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0000J\u0010\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020JH\u0016J\u001c\u0010K\u001a\u00020\u00002\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\tH\u0017J\b\u0010N\u001a\u00020\u0000H\u0016J\b\u0010O\u001a\u00020\u0000H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020TH\u0016J\u0015\u0010R\u001a\u00020?2\u0006\u0010U\u001a\u00020VH\u0010¢\u0006\u0002\bWJ\u0010\u0010X\u001a\u00020?2\u0006\u0010S\u001a\u00020YH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006["}, mo31007d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$jvm", "()[B", "hashCode", "", "getHashCode$jvm", "()I", "setHashCode$jvm", "(I)V", "size", "utf8", "", "getUtf8$jvm", "()Ljava/lang/String;", "setUtf8$jvm", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "digest", "algorithm", "digest$jvm", "endsWith", "", "suffix", "equals", "", "get", "", "index", "getByte", "-deprecated_getByte", "getSize", "getSize$jvm", "hex", "hmac", "key", "hmac$jvm", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$jvm", "internalGet", "pos", "internalGet$jvm", "lastIndexOf", "md5", "rangeEquals", "offset", "otherOffset", "byteCount", "readObject", "", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$jvm", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* compiled from: ByteString.kt */
public class ByteString implements Serializable, Comparable<ByteString> {

    /* renamed from: W */
    public static final ByteString f31851W = C14306a.m45829a();

    /* renamed from: X */
    public static final C14270a f31852X = new C14270a(null);

    /* renamed from: U */
    private transient String f31853U;

    /* renamed from: V */
    private final byte[] f31854V;

    /* renamed from: c */
    private transient int f31855c;

    /* renamed from: okio.ByteString$a */
    /* compiled from: ByteString.kt */
    public static final class C14270a {
        private C14270a() {
        }

        /* renamed from: a */
        public final ByteString mo36398a(byte... bArr) {
            return C14306a.m45832a(bArr);
        }

        /* renamed from: b */
        public final ByteString mo36399b(String str) {
            return C14306a.m45837b(str);
        }

        /* renamed from: c */
        public final ByteString mo36400c(String str) {
            return C14306a.m45840c(str);
        }

        public /* synthetic */ C14270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ByteString mo36397a(String str) {
            return C14306a.m45830a(str);
        }
    }

    public ByteString(byte[] bArr) {
        this.f31854V = bArr;
    }

    /* renamed from: a */
    public static final ByteString m45612a(byte... bArr) {
        return f31852X.mo36398a(bArr);
    }

    /* renamed from: c */
    public static final ByteString m45613c(String str) {
        return f31852X.mo36397a(str);
    }

    /* renamed from: d */
    public static final ByteString m45614d(String str) {
        return f31852X.mo36399b(str);
    }

    /* renamed from: e */
    public static final ByteString m45615e(String str) {
        return f31852X.mo36400c(str);
    }

    /* renamed from: a */
    public String mo36371a() {
        return C14306a.m45828a(this);
    }

    /* renamed from: b */
    public final byte[] mo36379b() {
        return this.f31854V;
    }

    /* renamed from: c */
    public final int mo36380c() {
        return this.f31855c;
    }

    /* renamed from: d */
    public int mo36383d() {
        return C14306a.m45836b(this);
    }

    /* renamed from: e */
    public final String mo36384e() {
        return this.f31853U;
    }

    public boolean equals(Object obj) {
        return C14306a.m45835a(this, obj);
    }

    /* renamed from: f */
    public String mo36386f() {
        return C14306a.m45841d(this);
    }

    /* renamed from: g */
    public byte[] mo36387g() {
        return C14306a.m45842e(this);
    }

    /* renamed from: h */
    public ByteString mo36388h() {
        return mo36372a("MD5");
    }

    public int hashCode() {
        return C14306a.m45839c(this);
    }

    /* renamed from: i */
    public ByteString mo36390i() {
        return mo36372a("SHA-1");
    }

    /* renamed from: j */
    public ByteString mo36391j() {
        return mo36372a("SHA-256");
    }

    /* renamed from: k */
    public ByteString mo36392k() {
        return C14306a.m45843f(this);
    }

    /* renamed from: l */
    public byte[] mo36393l() {
        return C14306a.m45844g(this);
    }

    /* renamed from: m */
    public String mo36394m() {
        return C14306a.m45846i(this);
    }

    public final int size() {
        return mo36383d();
    }

    public String toString() {
        return C14306a.m45845h(this);
    }

    /* renamed from: a */
    public ByteString mo36372a(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.f31854V);
        C12880j.m40222a((Object) digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(digest);
    }

    /* renamed from: b */
    public final void mo36377b(String str) {
        this.f31853U = str;
    }

    /* renamed from: c */
    public final void mo36381c(int i) {
        this.f31855c = i;
    }

    /* renamed from: a */
    public final byte mo36369a(int i) {
        return mo36376b(i);
    }

    /* renamed from: b */
    public byte mo36376b(int i) {
        return C14306a.m45824a(this, i);
    }

    /* renamed from: a */
    public void mo36373a(Buffer buffer) {
        byte[] bArr = this.f31854V;
        buffer.write(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public final boolean mo36378b(ByteString byteString) {
        return C14306a.m45838b(this, byteString);
    }

    /* renamed from: a */
    public boolean mo36374a(int i, ByteString byteString, int i2, int i3) {
        return C14306a.m45833a(this, i, byteString, i2, i3);
    }

    /* renamed from: a */
    public boolean mo36375a(int i, byte[] bArr, int i2, int i3) {
        return C14306a.m45834a(this, i, bArr, i2, i3);
    }

    /* renamed from: a */
    public int compareTo(ByteString byteString) {
        return C14306a.m45826a(this, byteString);
    }
}
