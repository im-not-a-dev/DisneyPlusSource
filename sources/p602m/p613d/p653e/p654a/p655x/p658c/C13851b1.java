package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p653e.p661c.C13969m;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.b1 */
/* compiled from: SecT131FieldElement */
public class C13851b1 extends C13812e {

    /* renamed from: g */
    protected long[] f30726g;

    public C13851b1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f30726g = C13847a1.m42754a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        long[] b = C13961e.m43897b();
        C13847a1.m42753a(this.f30726g, ((C13851b1) eVar).f30726g, b);
        return new C13851b1(b);
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        long[] jArr = this.f30726g;
        long[] jArr2 = ((C13851b1) eVar).f30726g;
        long[] jArr3 = ((C13851b1) eVar2).f30726g;
        long[] jArr4 = ((C13851b1) eVar3).f30726g;
        long[] b = C13969m.m44021b(5);
        C13847a1.m42762e(jArr, jArr2, b);
        C13847a1.m42762e(jArr3, jArr4, b);
        long[] b2 = C13961e.m43897b();
        C13847a1.m42759d(b, b2);
        return new C13851b1(b2);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        long[] b = C13961e.m43897b();
        C13847a1.m42760d(this.f30726g, ((C13851b1) eVar).f30726g, b);
        return new C13851b1(b);
    }

    /* renamed from: d */
    public int mo35108d() {
        return 131;
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        return mo35100a(eVar);
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        long[] b = C13961e.m43897b();
        C13847a1.m42757c(this.f30726g, b);
        return new C13851b1(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13851b1)) {
            return false;
        }
        return C13961e.m43888a(this.f30726g, ((C13851b1) obj).f30726g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13961e.m43887a(this.f30726g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13961e.m43896b(this.f30726g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        return this;
    }

    public int hashCode() {
        return C14079a.m44442a(this.f30726g, 0, 3) ^ 131832;
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        long[] b = C13961e.m43897b();
        C13847a1.m42761e(this.f30726g, b);
        return new C13851b1(b);
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        long[] b = C13961e.m43897b();
        C13847a1.m42763f(this.f30726g, b);
        return new C13851b1(b);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return (this.f30726g[0] & 1) != 0;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13961e.m43901c(this.f30726g);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        long[] b = C13961e.m43897b();
        C13847a1.m42752a(this.f30726g, b);
        return new C13851b1(b);
    }

    public C13851b1() {
        this.f30726g = C13961e.m43897b();
    }

    protected C13851b1(long[] jArr) {
        this.f30726g = jArr;
    }

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35105b(eVar, eVar2, eVar3);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        long[] jArr = this.f30726g;
        long[] jArr2 = ((C13851b1) eVar).f30726g;
        long[] jArr3 = ((C13851b1) eVar2).f30726g;
        long[] b = C13969m.m44021b(5);
        C13847a1.m42764g(jArr, b);
        C13847a1.m42762e(jArr2, jArr3, b);
        long[] b2 = C13961e.m43897b();
        C13847a1.m42759d(b, b2);
        return new C13851b1(b2);
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
        long[] b = C13961e.m43897b();
        C13847a1.m42751a(this.f30726g, i, b);
        return new C13851b1(b);
    }
}
