package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p683g.C14079a;

/* renamed from: m.d.e.a.x.c.h1 */
/* compiled from: SecT163FieldElement */
public class C13875h1 extends C13812e {

    /* renamed from: g */
    protected long[] f30753g;

    public C13875h1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f30753g = C13871g1.m43033a(bigInteger);
    }

    /* renamed from: a */
    public C13812e mo35100a(C13812e eVar) {
        long[] b = C13961e.m43897b();
        C13871g1.m43032a(this.f30753g, ((C13875h1) eVar).f30753g, b);
        return new C13875h1(b);
    }

    /* renamed from: b */
    public C13812e mo35105b(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        long[] jArr = this.f30753g;
        long[] jArr2 = ((C13875h1) eVar).f30753g;
        long[] jArr3 = ((C13875h1) eVar2).f30753g;
        long[] jArr4 = ((C13875h1) eVar3).f30753g;
        long[] d = C13961e.m43909d();
        C13871g1.m43041e(jArr, jArr2, d);
        C13871g1.m43041e(jArr3, jArr4, d);
        long[] b = C13961e.m43897b();
        C13871g1.m43038d(d, b);
        return new C13875h1(b);
    }

    /* renamed from: c */
    public C13812e mo35106c(C13812e eVar) {
        long[] b = C13961e.m43897b();
        C13871g1.m43039d(this.f30753g, ((C13875h1) eVar).f30753g, b);
        return new C13875h1(b);
    }

    /* renamed from: d */
    public int mo35108d() {
        return 163;
    }

    /* renamed from: d */
    public C13812e mo35109d(C13812e eVar) {
        return mo35100a(eVar);
    }

    /* renamed from: e */
    public C13812e mo35110e() {
        long[] b = C13961e.m43897b();
        C13871g1.m43036c(this.f30753g, b);
        return new C13875h1(b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13875h1)) {
            return false;
        }
        return C13961e.m43888a(this.f30753g, ((C13875h1) obj).f30753g);
    }

    /* renamed from: f */
    public boolean mo35111f() {
        return C13961e.m43887a(this.f30753g);
    }

    /* renamed from: g */
    public boolean mo35112g() {
        return C13961e.m43896b(this.f30753g);
    }

    /* renamed from: h */
    public C13812e mo35113h() {
        return this;
    }

    public int hashCode() {
        return C14079a.m44442a(this.f30753g, 0, 3) ^ 163763;
    }

    /* renamed from: i */
    public C13812e mo35114i() {
        long[] b = C13961e.m43897b();
        C13871g1.m43040e(this.f30753g, b);
        return new C13875h1(b);
    }

    /* renamed from: j */
    public C13812e mo35115j() {
        long[] b = C13961e.m43897b();
        C13871g1.m43042f(this.f30753g, b);
        return new C13875h1(b);
    }

    /* renamed from: k */
    public boolean mo35116k() {
        return (this.f30753g[0] & 1) != 0;
    }

    /* renamed from: l */
    public BigInteger mo35117l() {
        return C13961e.m43901c(this.f30753g);
    }

    /* renamed from: a */
    public C13812e mo35098a() {
        long[] b = C13961e.m43897b();
        C13871g1.m43031a(this.f30753g, b);
        return new C13875h1(b);
    }

    public C13875h1() {
        this.f30753g = C13961e.m43897b();
    }

    protected C13875h1(long[] jArr) {
        this.f30753g = jArr;
    }

    /* renamed from: a */
    public C13812e mo35102a(C13812e eVar, C13812e eVar2, C13812e eVar3) {
        return mo35105b(eVar, eVar2, eVar3);
    }

    /* renamed from: a */
    public C13812e mo35101a(C13812e eVar, C13812e eVar2) {
        long[] jArr = this.f30753g;
        long[] jArr2 = ((C13875h1) eVar).f30753g;
        long[] jArr3 = ((C13875h1) eVar2).f30753g;
        long[] d = C13961e.m43909d();
        C13871g1.m43043g(jArr, d);
        C13871g1.m43041e(jArr2, jArr3, d);
        long[] b = C13961e.m43897b();
        C13871g1.m43038d(d, b);
        return new C13875h1(b);
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
        C13871g1.m43030a(this.f30753g, i, b);
        return new C13875h1(b);
    }
}
