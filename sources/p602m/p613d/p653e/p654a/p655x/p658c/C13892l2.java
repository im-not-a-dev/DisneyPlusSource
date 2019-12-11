package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13966j;
import p602m.p613d.p653e.p661c.C13969m;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.l2 */
/* compiled from: SecT409FieldElement */
public class C13892l2 extends C13812e {

    /* renamed from: g */
    protected long[] f30770g;

    public C13892l2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f30770g = C13888k2.m43203a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        long[] a = C13966j.m43979a();
        C13888k2.m43202a(this.f30770g, ((C13892l2) eVar).f30770g, a);
        return new C13892l2(a);
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        long[] jArr = this.f30770g;
        long[] jArr2 = ((C13892l2) eVar).f30770g;
        long[] jArr3 = ((C13892l2) eVar2).f30770g;
        long[] jArr4 = ((C13892l2) eVar3).f30770g;
        long[] b = C13969m.m44021b(13);
        C13888k2.m43211e(jArr, jArr2, b);
        C13888k2.m43211e(jArr3, jArr4, b);
        long[] a = C13966j.m43979a();
        C13888k2.m43210e(b, a);
        return new C13892l2(a);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        long[] a = C13966j.m43979a();
        C13888k2.m43209d(this.f30770g, ((C13892l2) eVar).f30770g, a);
        return new C13892l2(a);
    }

    /* renamed from: d */
    public int mo35108d() {
        return 409;
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        return mo35100a(eVar);
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        long[] a = C13966j.m43979a();
        C13888k2.m43208d(this.f30770g, a);
        return new C13892l2(a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13892l2)) {
            return false;
        }
        return C13966j.m43978a(this.f30770g, ((C13892l2) obj).f30770g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13966j.m43977a(this.f30770g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13966j.m43981b(this.f30770g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        return this;
    }

    public int hashCode() {
        return C14079a.m44442a(this.f30770g, 0, 7) ^ 4090087;
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        long[] a = C13966j.m43979a();
        C13888k2.m43212f(this.f30770g, a);
        return new C13892l2(a);
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        long[] a = C13966j.m43979a();
        C13888k2.m43213g(this.f30770g, a);
        return new C13892l2(a);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return (this.f30770g[0] & 1) != 0;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13966j.m43983c(this.f30770g);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        long[] a = C13966j.m43979a();
        C13888k2.m43201a(this.f30770g, a);
        return new C13892l2(a);
    }

    public C13892l2() {
        this.f30770g = C13966j.m43979a();
    }

    protected C13892l2(long[] jArr) {
        this.f30770g = jArr;
    }

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35105b(eVar, eVar2, eVar3);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        long[] jArr = this.f30770g;
        long[] jArr2 = ((C13892l2) eVar).f30770g;
        long[] jArr3 = ((C13892l2) eVar2).f30770g;
        long[] b = C13969m.m44021b(13);
        C13888k2.m43214h(jArr, b);
        C13888k2.m43211e(jArr2, jArr3, b);
        long[] a = C13966j.m43979a();
        C13888k2.m43210e(b, a);
        return new C13892l2(a);
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
        long[] a = C13966j.m43979a();
        C13888k2.m43199a(this.f30770g, i, a);
        return new C13892l2(a);
    }
}
