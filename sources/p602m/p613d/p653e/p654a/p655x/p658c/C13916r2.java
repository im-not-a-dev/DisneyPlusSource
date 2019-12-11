package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13968l;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.r2 */
/* compiled from: SecT571FieldElement */
public class C13916r2 extends C13812e {

    /* renamed from: g */
    protected long[] f30796g;

    public C13916r2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f30796g = C13912q2.m43454a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        long[] a = C13968l.m43988a();
        C13912q2.m43453a(this.f30796g, ((C13916r2) eVar).f30796g, a);
        return new C13916r2(a);
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        long[] jArr = this.f30796g;
        long[] jArr2 = ((C13916r2) eVar).f30796g;
        long[] jArr3 = ((C13916r2) eVar2).f30796g;
        long[] jArr4 = ((C13916r2) eVar3).f30796g;
        long[] b = C13968l.m43991b();
        C13912q2.m43468g(jArr, jArr2, b);
        C13912q2.m43468g(jArr3, jArr4, b);
        long[] a = C13968l.m43988a();
        C13912q2.m43461d(b, a);
        return new C13916r2(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        long[] a = C13968l.m43988a();
        C13912q2.m43466f(this.f30796g, ((C13916r2) eVar).f30796g, a);
        return new C13916r2(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return 571;
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        return mo35100a(eVar);
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        long[] a = C13968l.m43988a();
        C13912q2.m43459c(this.f30796g, a);
        return new C13916r2(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13916r2)) {
            return false;
        }
        return C13968l.m43987a(this.f30796g, ((C13916r2) obj).f30796g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13968l.m43986a(this.f30796g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13968l.m43990b(this.f30796g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        return this;
    }

    public int hashCode() {
        return C14079a.m44442a(this.f30796g, 0, 9) ^ 5711052;
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        long[] a = C13968l.m43988a();
        C13912q2.m43463e(this.f30796g, a);
        return new C13916r2(a);
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        long[] a = C13968l.m43988a();
        C13912q2.m43465f(this.f30796g, a);
        return new C13916r2(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return (this.f30796g[0] & 1) != 0;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13968l.m43992c(this.f30796g);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        long[] a = C13968l.m43988a();
        C13912q2.m43452a(this.f30796g, a);
        return new C13916r2(a);
    }

    public C13916r2() {
        this.f30796g = C13968l.m43988a();
    }

    protected C13916r2(long[] jArr) {
        this.f30796g = jArr;
    }

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35105b(eVar, eVar2, eVar3);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        long[] jArr = this.f30796g;
        long[] jArr2 = ((C13916r2) eVar).f30796g;
        long[] jArr3 = ((C13916r2) eVar2).f30796g;
        long[] b = C13968l.m43991b();
        C13912q2.m43467g(jArr, b);
        C13912q2.m43468g(jArr2, jArr3, b);
        long[] a = C13968l.m43988a();
        C13912q2.m43461d(b, a);
        return new C13916r2(a);
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
        long[] a = C13968l.m43988a();
        C13912q2.m43450a(this.f30796g, i, a);
        return new C13916r2(a);
    }
}
