package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13964h;
import p602m.p613d.p653e.p661c.C13969m;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.f2 */
/* compiled from: SecT283FieldElement */
public class C13868f2 extends C13812e {

    /* renamed from: g */
    protected long[] f30743g;

    public C13868f2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f30743g = C13864e2.m42951a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        long[] a = C13964h.m43970a();
        C13864e2.m42950a(this.f30743g, ((C13868f2) eVar).f30743g, a);
        return new C13868f2(a);
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        long[] jArr = this.f30743g;
        long[] jArr2 = ((C13868f2) eVar).f30743g;
        long[] jArr3 = ((C13868f2) eVar2).f30743g;
        long[] jArr4 = ((C13868f2) eVar3).f30743g;
        long[] b = C13969m.m44021b(9);
        C13864e2.m42959e(jArr, jArr2, b);
        C13864e2.m42959e(jArr3, jArr4, b);
        long[] a = C13964h.m43970a();
        C13864e2.m42958e(b, a);
        return new C13868f2(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        long[] a = C13964h.m43970a();
        C13864e2.m42957d(this.f30743g, ((C13868f2) eVar).f30743g, a);
        return new C13868f2(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return 283;
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        return mo35100a(eVar);
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        long[] a = C13964h.m43970a();
        C13864e2.m42956d(this.f30743g, a);
        return new C13868f2(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13868f2)) {
            return false;
        }
        return C13964h.m43969a(this.f30743g, ((C13868f2) obj).f30743g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13964h.m43968a(this.f30743g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13964h.m43972b(this.f30743g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        return this;
    }

    public int hashCode() {
        return C14079a.m44442a(this.f30743g, 0, 5) ^ 2831275;
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        long[] a = C13964h.m43970a();
        C13864e2.m42960f(this.f30743g, a);
        return new C13868f2(a);
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        long[] a = C13964h.m43970a();
        C13864e2.m42961g(this.f30743g, a);
        return new C13868f2(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return (this.f30743g[0] & 1) != 0;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13964h.m43974c(this.f30743g);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        long[] a = C13964h.m43970a();
        C13864e2.m42949a(this.f30743g, a);
        return new C13868f2(a);
    }

    public C13868f2() {
        this.f30743g = C13964h.m43970a();
    }

    protected C13868f2(long[] jArr) {
        this.f30743g = jArr;
    }

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35105b(eVar, eVar2, eVar3);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        long[] jArr = this.f30743g;
        long[] jArr2 = ((C13868f2) eVar).f30743g;
        long[] jArr3 = ((C13868f2) eVar2).f30743g;
        long[] b = C13969m.m44021b(9);
        C13864e2.m42962h(jArr, b);
        C13864e2.m42959e(jArr2, jArr3, b);
        long[] a = C13964h.m43970a();
        C13864e2.m42958e(b, a);
        return new C13868f2(a);
    }

    /* renamed from: b */
    public C13812e mo35104b(C13812e eVar) {
        return mo35106c(eVar.mo35110e());
    }

    /* renamed from: a */
    public C13812e mo35099a(int i) {
        if (i < 1) {
            return this;
        }
        long[] a = C13964h.m43970a();
        C13864e2.m42948a(this.f30743g, i, a);
        return new C13868f2(a);
    }
}
