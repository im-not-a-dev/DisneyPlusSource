package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13958b;
import p602m.p613d.p653e.p661c.C13969m;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.s0 */
/* compiled from: SecP521R1FieldElement */
public class C13918s0 extends C13812e {

    /* renamed from: h */
    public static final BigInteger f30799h = C13910q0.f30791j;

    /* renamed from: g */
    protected int[] f30800g;

    public C13918s0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f30799h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f30800g = C13914r0.m43481a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        int[] a = C13969m.m44011a(17);
        C13914r0.m43480a(this.f30800g, ((C13918s0) eVar).f30800g, a);
        return new C13918s0(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        int[] a = C13969m.m44011a(17);
        C13958b.m43830a(C13914r0.f30795a, ((C13918s0) eVar).f30800g, a);
        C13914r0.m43485c(a, this.f30800g, a);
        return new C13918s0(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        int[] a = C13969m.m44011a(17);
        C13914r0.m43485c(this.f30800g, ((C13918s0) eVar).f30800g, a);
        return new C13918s0(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return f30799h.bitLength();
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        int[] a = C13969m.m44011a(17);
        C13958b.m43830a(C13914r0.f30795a, this.f30800g, a);
        return new C13918s0(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13918s0)) {
            return false;
        }
        return C13969m.m44020b(17, this.f30800g, ((C13918s0) obj).f30800g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13969m.m44031d(17, this.f30800g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13969m.m44033e(17, this.f30800g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        int[] a = C13969m.m44011a(17);
        C13914r0.m43484c(this.f30800g, a);
        return new C13918s0(a);
    }

    public int hashCode() {
        return f30799h.hashCode() ^ C14079a.m44459b(this.f30800g, 0, 17);
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        int[] iArr = this.f30800g;
        if (C13969m.m44033e(17, iArr) || C13969m.m44031d(17, iArr)) {
            return this;
        }
        int[] a = C13969m.m44011a(17);
        int[] a2 = C13969m.m44011a(17);
        C13914r0.m43478a(iArr, 519, a);
        C13914r0.m43488e(a, a2);
        return C13969m.m44020b(17, iArr, a2) ? new C13918s0(a) : null;
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        int[] a = C13969m.m44011a(17);
        C13914r0.m43488e(this.f30800g, a);
        return new C13918s0(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return C13969m.m44006a(this.f30800g, 0) == 1;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13969m.m44034f(17, this.f30800g);
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        int[] a = C13969m.m44011a(17);
        C13914r0.m43487d(this.f30800g, ((C13918s0) eVar).f30800g, a);
        return new C13918s0(a);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        int[] a = C13969m.m44011a(17);
        C13914r0.m43479a(this.f30800g, a);
        return new C13918s0(a);
    }

    public C13918s0() {
        this.f30800g = C13969m.m44011a(17);
    }

    protected C13918s0(int[] iArr) {
        this.f30800g = iArr;
    }
}
