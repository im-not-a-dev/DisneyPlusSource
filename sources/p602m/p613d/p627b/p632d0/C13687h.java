package p602m.p613d.p627b.p632d0;

import p602m.p613d.p653e.p654a.C13816g;

/* renamed from: m.d.b.d0.h */
/* compiled from: ECPublicKeyParameters */
public class C13687h extends C13684e {

    /* renamed from: V */
    private final C13816g f30445V;

    public C13687h(C13816g gVar, C13682c cVar) {
        super(false, cVar);
        this.f30445V = m42058a(gVar);
    }

    /* renamed from: a */
    private C13816g m42058a(C13816g gVar) {
        if (gVar == null) {
            throw new IllegalArgumentException("point has null value");
        } else if (!gVar.mo35157n()) {
            C13816g r = gVar.mo35161r();
            if (r.mo35159p()) {
                return r;
            }
            throw new IllegalArgumentException("point not on curve");
        } else {
            throw new IllegalArgumentException("point at infinity");
        }
    }

    /* renamed from: c */
    public C13816g mo34940c() {
        return this.f30445V;
    }
}
