package p602m.p613d.p653e.p660b;

import java.math.BigInteger;
import p602m.p613d.p683g.C14084e;

/* renamed from: m.d.e.b.e */
/* compiled from: GenericPolynomialExtensionField */
class C13953e implements C13955g {

    /* renamed from: a */
    protected final C13950b f30838a;

    /* renamed from: b */
    protected final C13954f f30839b;

    C13953e(C13950b bVar, C13954f fVar) {
        this.f30838a = bVar;
        this.f30839b = fVar;
    }

    /* renamed from: a */
    public C13954f mo35289a() {
        return this.f30839b;
    }

    /* renamed from: b */
    public int mo35283b() {
        return this.f30838a.mo35283b() * this.f30839b.mo35286b();
    }

    /* renamed from: c */
    public BigInteger mo35284c() {
        return this.f30838a.mo35284c();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13953e)) {
            return false;
        }
        C13953e eVar = (C13953e) obj;
        if (!this.f30838a.equals(eVar.f30838a) || !this.f30839b.equals(eVar.f30839b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f30838a.hashCode() ^ C14084e.m44467a(this.f30839b.hashCode(), 16);
    }
}
