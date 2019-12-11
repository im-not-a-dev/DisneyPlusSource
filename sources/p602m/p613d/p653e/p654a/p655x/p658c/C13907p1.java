package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.p1 */
/* compiled from: SecT193FieldElement */
public class C13907p1 extends C13812e {

    /* renamed from: g */
    protected long[] f30788g;

    public C13907p1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f30788g = C13903o1.m43357a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        long[] b = C13963g.m43953b();
        C13903o1.m43356a(this.f30788g, ((C13907p1) eVar).f30788g, b);
        return new C13907p1(b);
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        long[] jArr = this.f30788g;
        long[] jArr2 = ((C13907p1) eVar).f30788g;
        long[] jArr3 = ((C13907p1) eVar2).f30788g;
        long[] jArr4 = ((C13907p1) eVar3).f30788g;
        long[] d = C13963g.m43965d();
        C13903o1.m43365e(jArr, jArr2, d);
        C13903o1.m43365e(jArr3, jArr4, d);
        long[] b = C13963g.m43953b();
        C13903o1.m43364e(d, b);
        return new C13907p1(b);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        long[] b = C13963g.m43953b();
        C13903o1.m43363d(this.f30788g, ((C13907p1) eVar).f30788g, b);
        return new C13907p1(b);
    }

    /* renamed from: d */
    public int mo35108d() {
        return 193;
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        return mo35100a(eVar);
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        long[] b = C13963g.m43953b();
        C13903o1.m43362d(this.f30788g, b);
        return new C13907p1(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13907p1)) {
            return false;
        }
        return C13963g.m43944a(this.f30788g, ((C13907p1) obj).f30788g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13963g.m43943a(this.f30788g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13963g.m43952b(this.f30788g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        return this;
    }

    public int hashCode() {
        return C14079a.m44442a(this.f30788g, 0, 4) ^ 1930015;
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        long[] b = C13963g.m43953b();
        C13903o1.m43366f(this.f30788g, b);
        return new C13907p1(b);
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        long[] b = C13963g.m43953b();
        C13903o1.m43367g(this.f30788g, b);
        return new C13907p1(b);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return (this.f30788g[0] & 1) != 0;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13963g.m43957c(this.f30788g);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        long[] b = C13963g.m43953b();
        C13903o1.m43355a(this.f30788g, b);
        return new C13907p1(b);
    }

    public C13907p1() {
        this.f30788g = C13963g.m43953b();
    }

    protected C13907p1(long[] jArr) {
        this.f30788g = jArr;
    }

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35105b(eVar, eVar2, eVar3);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        long[] jArr = this.f30788g;
        long[] jArr2 = ((C13907p1) eVar).f30788g;
        long[] jArr3 = ((C13907p1) eVar2).f30788g;
        long[] d = C13963g.m43965d();
        C13903o1.m43368h(jArr, d);
        C13903o1.m43365e(jArr2, jArr3, d);
        long[] b = C13963g.m43953b();
        C13903o1.m43364e(d, b);
        return new C13907p1(b);
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
        long[] b = C13963g.m43953b();
        C13903o1.m43354a(this.f30788g, i, b);
        return new C13907p1(b);
    }
}
