package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13959c;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.v0 */
/* compiled from: SecT113FieldElement */
public class C13930v0 extends C13812e {

    /* renamed from: g */
    protected long[] f30811g;

    public C13930v0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f30811g = C13926u0.m43606a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        long[] b = C13959c.m43844b();
        C13926u0.m43605a(this.f30811g, ((C13930v0) eVar).f30811g, b);
        return new C13930v0(b);
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        long[] jArr = this.f30811g;
        long[] jArr2 = ((C13930v0) eVar).f30811g;
        long[] jArr3 = ((C13930v0) eVar2).f30811g;
        long[] jArr4 = ((C13930v0) eVar3).f30811g;
        long[] d = C13959c.m43854d();
        C13926u0.m43614e(jArr, jArr2, d);
        C13926u0.m43614e(jArr3, jArr4, d);
        long[] b = C13959c.m43844b();
        C13926u0.m43611d(d, b);
        return new C13930v0(b);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        long[] b = C13959c.m43844b();
        C13926u0.m43612d(this.f30811g, ((C13930v0) eVar).f30811g, b);
        return new C13930v0(b);
    }

    /* renamed from: d */
    public int mo35108d() {
        return 113;
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        return mo35100a(eVar);
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        long[] b = C13959c.m43844b();
        C13926u0.m43609c(this.f30811g, b);
        return new C13930v0(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13930v0)) {
            return false;
        }
        return C13959c.m43837a(this.f30811g, ((C13930v0) obj).f30811g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13959c.m43836a(this.f30811g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13959c.m43843b(this.f30811g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        return this;
    }

    public int hashCode() {
        return C14079a.m44442a(this.f30811g, 0, 2) ^ 113009;
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        long[] b = C13959c.m43844b();
        C13926u0.m43613e(this.f30811g, b);
        return new C13930v0(b);
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        long[] b = C13959c.m43844b();
        C13926u0.m43615f(this.f30811g, b);
        return new C13930v0(b);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return (this.f30811g[0] & 1) != 0;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13959c.m43847c(this.f30811g);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        long[] b = C13959c.m43844b();
        C13926u0.m43604a(this.f30811g, b);
        return new C13930v0(b);
    }

    public C13930v0() {
        this.f30811g = C13959c.m43844b();
    }

    protected C13930v0(long[] jArr) {
        this.f30811g = jArr;
    }

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35105b(eVar, eVar2, eVar3);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        long[] jArr = this.f30811g;
        long[] jArr2 = ((C13930v0) eVar).f30811g;
        long[] jArr3 = ((C13930v0) eVar2).f30811g;
        long[] d = C13959c.m43854d();
        C13926u0.m43616g(jArr, d);
        C13926u0.m43614e(jArr2, jArr3, d);
        long[] b = C13959c.m43844b();
        C13926u0.m43611d(d, b);
        return new C13930v0(b);
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
        long[] b = C13959c.m43844b();
        C13926u0.m43603a(this.f30811g, i, b);
        return new C13930v0(b);
    }
}
