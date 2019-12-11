package p602m.p613d.p653e.p654a.p659y;

import java.math.BigInteger;

/* renamed from: m.d.e.a.y.d */
/* compiled from: GLVTypeBParameters */
public class C13948d {

    /* renamed from: a */
    protected final BigInteger f30827a;

    /* renamed from: b */
    protected final BigInteger f30828b;

    /* renamed from: c */
    protected final BigInteger f30829c;

    /* renamed from: d */
    protected final BigInteger f30830d;

    /* renamed from: e */
    protected final BigInteger f30831e;

    /* renamed from: f */
    protected final BigInteger f30832f;

    /* renamed from: g */
    protected final BigInteger f30833g;

    /* renamed from: h */
    protected final int f30834h;

    public C13948d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        m43799a(bigIntegerArr, "v1");
        m43799a(bigIntegerArr2, "v2");
        this.f30827a = bigInteger;
        this.f30828b = bigIntegerArr[0];
        this.f30829c = bigIntegerArr[1];
        this.f30830d = bigIntegerArr2[0];
        this.f30831e = bigIntegerArr2[1];
        this.f30832f = bigInteger3;
        this.f30833g = bigInteger4;
        this.f30834h = i;
    }

    /* renamed from: a */
    private static void m43799a(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(str);
            sb.append("' must consist of exactly 2 (non-null) values");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public int mo35276b() {
        return this.f30834h;
    }

    /* renamed from: c */
    public BigInteger mo35277c() {
        return this.f30832f;
    }

    /* renamed from: d */
    public BigInteger mo35278d() {
        return this.f30833g;
    }

    /* renamed from: e */
    public BigInteger mo35279e() {
        return this.f30828b;
    }

    /* renamed from: f */
    public BigInteger mo35280f() {
        return this.f30829c;
    }

    /* renamed from: g */
    public BigInteger mo35281g() {
        return this.f30830d;
    }

    /* renamed from: h */
    public BigInteger mo35282h() {
        return this.f30831e;
    }

    /* renamed from: a */
    public BigInteger mo35275a() {
        return this.f30827a;
    }
}
