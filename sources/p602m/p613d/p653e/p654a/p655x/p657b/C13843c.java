package p602m.p613d.p653e.p654a.p655x.p657b;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.b.c */
/* compiled from: SM2P256V1FieldElement */
public class C13843c extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30713h = C13841a.f30709j;

    /* renamed from: g */
    protected int[] f30714g;

    public C13843c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30713h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f30714g = C13842b.m42705a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13842b.m42704a(this.f30714g, ((C13843c) eVar).f30714g, a);
        return new C13843c(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13842b.f30711a, ((C13843c) eVar).f30714g, a);
        C13842b.m42708b(a, this.f30714g, a);
        return new C13843c(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13842b.m42708b(this.f30714g, ((C13843c) eVar).f30714g, a);
        return new C13843c(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30713h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13963g.m43945a();
        C13958b.m43830a(C13842b.f30711a, this.f30714g, a);
        return new C13843c(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13843c)) {
            return false;
        }
        return C13963g.m43951b(this.f30714g, ((C13843c) obj).f30714g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13963g.m43941a(this.f30714g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13963g.m43949b(this.f30714g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13963g.m43945a();
        C13842b.m42707b(this.f30714g, a);
        return new C13843c(a);
    }

    public int hashCode() {
        return f30713h.hashCode() ^ C14079a.m44459b(this.f30714g, 0, 8);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30714g;
        if (C13963g.m43949b(iArr) || C13963g.m43941a(iArr)) {
            return this;
        }
        int[] a = C13963g.m43945a();
        C13842b.m42711d(iArr, a);
        C13842b.m42708b(a, iArr, a);
        int[] a2 = C13963g.m43945a();
        C13842b.m42702a(a, 2, a2);
        C13842b.m42708b(a2, a, a2);
        int[] a3 = C13963g.m43945a();
        C13842b.m42702a(a2, 2, a3);
        C13842b.m42708b(a3, a, a3);
        C13842b.m42702a(a3, 6, a);
        C13842b.m42708b(a, a3, a);
        int[] a4 = C13963g.m43945a();
        C13842b.m42702a(a, 12, a4);
        C13842b.m42708b(a4, a, a4);
        C13842b.m42702a(a4, 6, a);
        C13842b.m42708b(a, a3, a);
        C13842b.m42711d(a, a3);
        C13842b.m42708b(a3, iArr, a3);
        C13842b.m42702a(a3, 31, a4);
        C13842b.m42708b(a4, a3, a);
        C13842b.m42702a(a4, 32, a4);
        C13842b.m42708b(a4, a, a4);
        C13842b.m42702a(a4, 62, a4);
        C13842b.m42708b(a4, a, a4);
        C13842b.m42702a(a4, 4, a4);
        C13842b.m42708b(a4, a2, a4);
        C13842b.m42702a(a4, 32, a4);
        C13842b.m42708b(a4, iArr, a4);
        C13842b.m42702a(a4, 62, a4);
        C13842b.m42711d(a4, a2);
        return C13963g.m43951b(iArr, a2) ? new C13843c(a4) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13963g.m43945a();
        C13842b.m42711d(this.f30714g, a);
        return new C13843c(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13963g.m43935a(this.f30714g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13963g.m43956c(this.f30714g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13963g.m43945a();
        C13842b.m42712d(this.f30714g, ((C13843c) eVar).f30714g, a);
        return new C13843c(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13963g.m43945a();
        C13842b.m42703a(this.f30714g, a);
        return new C13843c(a);
    }

    public C13843c() {
        this.f30714g = C13963g.m43945a();
    }

    protected C13843c(int[] iArr) {
        this.f30714g = iArr;
    }
}
