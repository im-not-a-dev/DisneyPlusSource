package okio;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo31005bv = {1, 0, 2}, mo31006d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JB\u001d\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002JV\u0010\u001a\u001a\u00020\u001b2K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001b0\u001dH\bJf\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001b0\u001dH\bJ\r\u0010&\u001a\u00020!H\u0010¢\u0006\u0002\b'J\b\u0010(\u001a\u00020!H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016J\u001d\u0010*\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0001H\u0010¢\u0006\u0002\b,J\u0018\u0010-\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020!H\u0016J\r\u0010/\u001a\u00020\u0004H\u0010¢\u0006\u0002\b0J\u0015\u00101\u001a\u0002022\u0006\u00103\u001a\u00020!H\u0010¢\u0006\u0002\b4J\u0018\u00105\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020!H\u0016J(\u00106\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00107\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J(\u00106\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u00107\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0010\u00108\u001a\u00020!2\u0006\u00103\u001a\u00020!H\u0002J\u0010\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020;H\u0016J\u0018\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!H\u0016J\b\u0010=\u001a\u00020\u0001H\u0016J\b\u0010>\u001a\u00020\u0001H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0001H\u0002J\b\u0010A\u001a\u00020\u0011H\u0016J\u0010\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DH\u0016J\u0015\u0010B\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020FH\u0010¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020IH\u0002R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006K"}, mo31007d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "segments", "", "", "directory", "", "([[B[I)V", "getDirectory", "()[I", "getSegments", "()[[B", "[[B", "asByteBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "base64", "", "base64Url", "digest", "algorithm", "digest$jvm", "equals", "", "other", "", "forEachSegment", "", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "", "offset", "byteCount", "beginIndex", "endIndex", "getSize", "getSize$jvm", "hashCode", "hex", "hmac", "key", "hmac$jvm", "indexOf", "fromIndex", "internalArray", "internalArray$jvm", "internalGet", "", "pos", "internalGet$jvm", "lastIndexOf", "rangeEquals", "otherOffset", "segment", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toByteString", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$jvm", "writeReplace", "Ljava/lang/Object;", "Companion", "jvm"}, mo31008k = 1, mo31009mv = {1, 1, 11})
/* renamed from: okio.u */
/* compiled from: SegmentedByteString.kt */
public final class C14298u extends ByteString {

    /* renamed from: a0 */
    public static final C14299a f31910a0 = new C14299a(null);

    /* renamed from: Y */
    private final transient byte[][] f31911Y;

    /* renamed from: Z */
    private final transient int[] f31912Z;

    /* renamed from: okio.u$a */
    /* compiled from: SegmentedByteString.kt */
    public static final class C14299a {
        private C14299a() {
        }

        /* renamed from: a */
        public final ByteString mo36466a(Buffer buffer, int i) {
            C14273c.m45651a(buffer.mo36335h(), 0, (long) i);
            int i2 = 0;
            C14295s sVar = buffer.f31848c;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                if (sVar != null) {
                    int i5 = sVar.f31902c;
                    int i6 = sVar.f31901b;
                    if (i5 != i6) {
                        i3 += i5 - i6;
                        i4++;
                        sVar = sVar.f31905f;
                    } else {
                        throw new AssertionError("s.limit == s.pos");
                    }
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
            byte[][] bArr = new byte[i4][];
            int[] iArr = new int[(i4 * 2)];
            C14295s sVar2 = buffer.f31848c;
            int i7 = 0;
            while (i2 < i) {
                if (sVar2 != null) {
                    bArr[i7] = sVar2.f31900a;
                    i2 += sVar2.f31902c - sVar2.f31901b;
                    iArr[i7] = Math.min(i2, i);
                    iArr[bArr.length + i7] = sVar2.f31901b;
                    sVar2.f31903d = true;
                    i7++;
                    sVar2 = sVar2.f31905f;
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            }
            return new C14298u(bArr, iArr, null);
        }

        public /* synthetic */ C14299a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C14298u(byte[][] bArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, iArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final int m45791d(int i) {
        int binarySearch = Arrays.binarySearch(this.f31912Z, 0, this.f31911Y.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: p */
    private final ByteString m45792p() {
        return new ByteString(mo36393l());
    }

    /* renamed from: b */
    public byte mo36376b(int i) {
        int i2;
        C14273c.m45651a((long) this.f31912Z[this.f31911Y.length - 1], (long) i, 1);
        int d = m45791d(i);
        if (d == 0) {
            i2 = 0;
        } else {
            i2 = this.f31912Z[d - 1];
        }
        int[] iArr = this.f31912Z;
        byte[][] bArr = this.f31911Y;
        return bArr[d][(i - i2) + iArr[bArr.length + d]];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && mo36374a(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String mo36386f() {
        return m45792p().mo36386f();
    }

    /* renamed from: g */
    public byte[] mo36387g() {
        return mo36393l();
    }

    public int hashCode() {
        int c = mo36380c();
        if (c != 0) {
            return c;
        }
        int length = mo36465o().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = mo36464n()[length + i];
            int i5 = mo36464n()[i];
            byte[] bArr = mo36465o()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        mo36381c(i2);
        return i2;
    }

    /* renamed from: k */
    public ByteString mo36392k() {
        return m45792p().mo36392k();
    }

    /* renamed from: l */
    public byte[] mo36393l() {
        byte[] bArr = new byte[size()];
        int length = mo36465o().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo36464n()[length + i];
            int i5 = mo36464n()[i];
            int i6 = i5 - i2;
            C14272b.m45647a(mo36465o()[i], i4, bArr, i3, i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: n */
    public final int[] mo36464n() {
        return this.f31912Z;
    }

    /* renamed from: o */
    public final byte[][] mo36465o() {
        return this.f31911Y;
    }

    public String toString() {
        return m45792p().toString();
    }

    private C14298u(byte[][] bArr, int[] iArr) {
        super(ByteString.f31851W.mo36379b());
        this.f31911Y = bArr;
        this.f31912Z = iArr;
    }

    /* renamed from: a */
    public String mo36371a() {
        return m45792p().mo36371a();
    }

    /* renamed from: d */
    public int mo36383d() {
        return this.f31912Z[this.f31911Y.length - 1];
    }

    /* renamed from: a */
    public ByteString mo36372a(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo36465o().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo36464n()[length + i];
            int i4 = mo36464n()[i];
            instance.update(mo36465o()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        Intrinsics.checkReturnedValueIsNotNull((Object) digest, "digest.digest()");
        return new ByteString(digest);
    }

    /* renamed from: a */
    public boolean mo36374a(int i, ByteString byteString, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int a = m45791d(i);
        while (i < i5) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = mo36464n()[a - 1];
            }
            int i6 = mo36464n()[a] - i4;
            int min = Math.min(i5, i6 + i4) - i;
            if (!byteString.mo36375a(i2, mo36465o()[a], mo36464n()[mo36465o().length + a] + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo36375a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int a = m45791d(i);
        while (i < i5) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = mo36464n()[a - 1];
            }
            int i6 = mo36464n()[a] - i4;
            int min = Math.min(i5, i6 + i4) - i;
            if (!C14273c.m45652a(mo36465o()[a], mo36464n()[mo36465o().length + a] + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: a */
    public void mo36373a(Buffer buffer) {
        int length = mo36465o().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo36464n()[length + i];
            int i4 = mo36464n()[i];
            C14295s sVar = new C14295s(mo36465o()[i], i3, i3 + (i4 - i2), true, false);
            C14295s sVar2 = buffer.f31848c;
            if (sVar2 == null) {
                sVar.f31906g = sVar;
                sVar.f31905f = sVar.f31906g;
                buffer.f31848c = sVar.f31905f;
            } else if (sVar2 != null) {
                C14295s sVar3 = sVar2.f31906g;
                if (sVar3 != null) {
                    sVar3.mo36459a(sVar);
                } else {
                    Intrinsics.throwNpe();
                    throw null;
                }
            } else {
                Intrinsics.throwNpe();
                throw null;
            }
            i++;
            i2 = i4;
        }
        buffer.mo36344k(buffer.mo36335h() + ((long) size()));
    }
}
