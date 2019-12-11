package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13960d;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.f */
/* compiled from: SecP160K1Point */
public class C13865f extends C13818b {
    public C13865f(C13806d dVar, C13812e eVar, C13812e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    /* renamed from: a */
    public C13816g mo35134a(C13816g gVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (mo35157n()) {
            return gVar;
        }
        if (gVar.mo35157n()) {
            return this;
        }
        if (this == gVar) {
            return mo35166v();
        }
        C13806d f = mo35148f();
        C13893m mVar = (C13893m) this.f30669b;
        C13893m mVar2 = (C13893m) this.f30670c;
        C13893m mVar3 = (C13893m) gVar.mo35155l();
        C13893m mVar4 = (C13893m) gVar.mo35156m();
        C13893m mVar5 = (C13893m) this.f30671d[0];
        C13893m mVar6 = (C13893m) gVar.mo35130a(0);
        int[] b = C13960d.m43869b();
        int[] a = C13960d.m43863a();
        int[] a2 = C13960d.m43863a();
        int[] a3 = C13960d.m43863a();
        boolean f2 = mVar5.mo35111f();
        if (f2) {
            iArr2 = mVar3.f30772g;
            iArr = mVar4.f30772g;
        } else {
            C13889l.m43224d(mVar5.f30772g, a2);
            C13889l.m43221b(a2, mVar3.f30772g, a);
            C13889l.m43221b(a2, mVar5.f30772g, a2);
            C13889l.m43221b(a2, mVar4.f30772g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = mVar6.mo35111f();
        if (f3) {
            iArr4 = mVar.f30772g;
            iArr3 = mVar2.f30772g;
        } else {
            C13889l.m43224d(mVar6.f30772g, a3);
            C13889l.m43221b(a3, mVar.f30772g, b);
            C13889l.m43221b(a3, mVar6.f30772g, a3);
            C13889l.m43221b(a3, mVar2.f30772g, a3);
            iArr4 = b;
            iArr3 = a3;
        }
        int[] a4 = C13960d.m43863a();
        C13889l.m43225d(iArr4, iArr2, a4);
        C13889l.m43225d(iArr3, iArr, a);
        if (!C13960d.m43867b(a4)) {
            C13889l.m43224d(a4, a2);
            int[] a5 = C13960d.m43863a();
            C13889l.m43221b(a2, a4, a5);
            C13889l.m43221b(a2, iArr4, a2);
            C13889l.m43220b(a5, a5);
            C13960d.m43872c(iArr3, a5, b);
            C13889l.m43215a(C13960d.m43866b(a2, a2, a5), a5);
            C13893m mVar7 = new C13893m(a3);
            C13889l.m43224d(a, mVar7.f30772g);
            int[] iArr5 = mVar7.f30772g;
            C13889l.m43225d(iArr5, a5, iArr5);
            C13893m mVar8 = new C13893m(a5);
            C13889l.m43225d(a2, mVar7.f30772g, mVar8.f30772g);
            C13889l.m43223c(mVar8.f30772g, a, b);
            C13889l.m43222c(b, mVar8.f30772g);
            C13893m mVar9 = new C13893m(a4);
            if (!f2) {
                int[] iArr6 = mVar9.f30772g;
                C13889l.m43221b(iArr6, mVar5.f30772g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = mVar9.f30772g;
                C13889l.m43221b(iArr7, mVar6.f30772g, iArr7);
            }
            C13865f fVar = new C13865f(f, mVar7, mVar8, new C13812e[]{mVar9}, this.f30672e);
            return fVar;
        } else if (C13960d.m43867b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13865f(null, mo35141c(), mo35144d());
    }

    /* renamed from: d */
    public C13816g mo35145d(C13816g gVar) {
        if (this == gVar) {
            return mo35165u();
        }
        if (mo35157n()) {
            return gVar;
        }
        if (gVar.mo35157n()) {
            return mo35166v();
        }
        if (this.f30670c.mo35112g()) {
            return gVar;
        }
        return mo35166v().mo35134a(gVar);
    }

    /* renamed from: q */
    public C13816g mo35160q() {
        if (mo35157n()) {
            return this;
        }
        C13865f fVar = new C13865f(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return fVar;
    }

    /* renamed from: u */
    public C13816g mo35165u() {
        return (mo35157n() || this.f30670c.mo35112g()) ? this : mo35166v().mo35134a((C13816g) this);
    }

    /* renamed from: v */
    public C13816g mo35166v() {
        if (mo35157n()) {
            return this;
        }
        C13806d f = mo35148f();
        C13893m mVar = (C13893m) this.f30670c;
        if (mVar.mo35112g()) {
            return f.mo35091k();
        }
        C13893m mVar2 = (C13893m) this.f30669b;
        C13893m mVar3 = (C13893m) this.f30671d[0];
        int[] a = C13960d.m43863a();
        C13889l.m43224d(mVar.f30772g, a);
        int[] a2 = C13960d.m43863a();
        C13889l.m43224d(a, a2);
        int[] a3 = C13960d.m43863a();
        C13889l.m43224d(mVar2.f30772g, a3);
        C13889l.m43215a(C13960d.m43866b(a3, a3, a3), a3);
        C13889l.m43221b(a, mVar2.f30772g, a);
        C13889l.m43215a(C13969m.m44025c(5, a, 2, 0), a);
        int[] a4 = C13960d.m43863a();
        C13889l.m43215a(C13969m.m44000a(5, a2, 3, 0, a4), a4);
        C13893m mVar4 = new C13893m(a2);
        C13889l.m43224d(a3, mVar4.f30772g);
        int[] iArr = mVar4.f30772g;
        C13889l.m43225d(iArr, a, iArr);
        int[] iArr2 = mVar4.f30772g;
        C13889l.m43225d(iArr2, a, iArr2);
        C13893m mVar5 = new C13893m(a);
        C13889l.m43225d(a, mVar4.f30772g, mVar5.f30772g);
        int[] iArr3 = mVar5.f30772g;
        C13889l.m43221b(iArr3, a3, iArr3);
        int[] iArr4 = mVar5.f30772g;
        C13889l.m43225d(iArr4, a4, iArr4);
        C13893m mVar6 = new C13893m(a3);
        C13889l.m43226e(mVar.f30772g, mVar6.f30772g);
        if (!mVar3.mo35111f()) {
            int[] iArr5 = mVar6.f30772g;
            C13889l.m43221b(iArr5, mVar3.f30772g, iArr5);
        }
        C13865f fVar = new C13865f(f, mVar4, mVar5, new C13812e[]{mVar6}, this.f30672e);
        return fVar;
    }

    public C13865f(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
        super(dVar, eVar, eVar2);
        boolean z2 = true;
        boolean z3 = eVar == null;
        if (eVar2 != null) {
            z2 = false;
        }
        if (z3 == z2) {
            this.f30672e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    C13865f(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
