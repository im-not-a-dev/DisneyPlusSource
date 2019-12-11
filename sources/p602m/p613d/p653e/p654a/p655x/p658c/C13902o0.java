package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13969m;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.o0 */
/* compiled from: SecP384R1FieldElement */
public class C13902o0 extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30782h = C13894m0.f30773j;

    /* renamed from: g */
    protected int[] f30783g;

    public C13902o0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30782h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f30783g = C13898n0.m43307a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13969m.m44011a(12);
        C13898n0.m43306a(this.f30783g, ((C13902o0) eVar).f30783g, a);
        return new C13902o0(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13969m.m44011a(12);
        C13958b.m43830a(C13898n0.f30777a, ((C13902o0) eVar).f30783g, a);
        C13898n0.m43312c(a, this.f30783g, a);
        return new C13902o0(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13969m.m44011a(12);
        C13898n0.m43312c(this.f30783g, ((C13902o0) eVar).f30783g, a);
        return new C13902o0(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30782h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13969m.m44011a(12);
        C13958b.m43830a(C13898n0.f30777a, this.f30783g, a);
        return new C13902o0(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13902o0)) {
            return false;
        }
        return C13969m.m44020b(12, this.f30783g, ((C13902o0) obj).f30783g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13969m.m44031d(12, this.f30783g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13969m.m44033e(12, this.f30783g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13969m.m44011a(12);
        C13898n0.m43309b(this.f30783g, a);
        return new C13902o0(a);
    }

    public int hashCode() {
        return f30782h.hashCode() ^ C14079a.m44459b(this.f30783g, 0, 12);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30783g;
        if (C13969m.m44033e(12, iArr) || C13969m.m44031d(12, iArr)) {
            return this;
        }
        int[] a = C13969m.m44011a(12);
        int[] a2 = C13969m.m44011a(12);
        int[] a3 = C13969m.m44011a(12);
        int[] a4 = C13969m.m44011a(12);
        C13898n0.m43313d(iArr, a);
        C13898n0.m43312c(a, iArr, a);
        C13898n0.m43304a(a, 2, a2);
        C13898n0.m43312c(a2, a, a2);
        C13898n0.m43313d(a2, a2);
        C13898n0.m43312c(a2, iArr, a2);
        C13898n0.m43304a(a2, 5, a3);
        C13898n0.m43312c(a3, a2, a3);
        C13898n0.m43304a(a3, 5, a4);
        C13898n0.m43312c(a4, a2, a4);
        C13898n0.m43304a(a4, 15, a2);
        C13898n0.m43312c(a2, a4, a2);
        C13898n0.m43304a(a2, 2, a3);
        C13898n0.m43312c(a, a3, a);
        C13898n0.m43304a(a3, 28, a3);
        C13898n0.m43312c(a2, a3, a2);
        C13898n0.m43304a(a2, 60, a3);
        C13898n0.m43312c(a3, a2, a3);
        C13898n0.m43304a(a3, 120, a2);
        C13898n0.m43312c(a2, a3, a2);
        C13898n0.m43304a(a2, 15, a2);
        C13898n0.m43312c(a2, a4, a2);
        C13898n0.m43304a(a2, 33, a2);
        C13898n0.m43312c(a2, a, a2);
        C13898n0.m43304a(a2, 64, a2);
        C13898n0.m43312c(a2, iArr, a2);
        C13898n0.m43304a(a2, 30, a);
        C13898n0.m43313d(a, a2);
        return C13969m.m44020b(12, iArr, a2) ? new C13902o0(a) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13969m.m44011a(12);
        C13898n0.m43313d(this.f30783g, a);
        return new C13902o0(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13969m.m44006a(this.f30783g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13969m.m44034f(12, this.f30783g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13969m.m44011a(12);
        C13898n0.m43314d(this.f30783g, ((C13902o0) eVar).f30783g, a);
        return new C13902o0(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13969m.m44011a(12);
        C13898n0.m43305a(this.f30783g, a);
        return new C13902o0(a);
    }

    public C13902o0() {
        this.f30783g = C13969m.m44011a(12);
    }

    protected C13902o0(int[] iArr) {
        this.f30783g = iArr;
    }
}
