package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.r */
/* compiled from: SecP192K1Point */
public class C13913r extends C13818b {
    public C13913r(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13909q qVar = (C13909q) this.f30669b;
        C13909q qVar2 = (C13909q) this.f30670c;
        C13909q qVar3 = (C13909q) gVar.mo35155l();
        C13909q qVar4 = (C13909q) gVar.mo35156m();
        C13909q qVar5 = (C13909q) this.f30671d[0];
        C13909q qVar6 = (C13909q) gVar.mo35130a(0);
        int[] c = C13961e.m43905c();
        int[] a = C13961e.m43889a();
        int[] a2 = C13961e.m43889a();
        int[] a3 = C13961e.m43889a();
        boolean f2 = qVar5.mo35111f();
        if (f2) {
            iArr2 = qVar3.f30790g;
            iArr = qVar4.f30790g;
        } else {
            C13905p.m43386d(qVar5.f30790g, a2);
            C13905p.m43383b(a2, qVar3.f30790g, a);
            C13905p.m43383b(a2, qVar5.f30790g, a2);
            C13905p.m43383b(a2, qVar4.f30790g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = qVar6.mo35111f();
        if (f3) {
            iArr4 = qVar.f30790g;
            iArr3 = qVar2.f30790g;
        } else {
            C13905p.m43386d(qVar6.f30790g, a3);
            C13905p.m43383b(a3, qVar.f30790g, c);
            C13905p.m43383b(a3, qVar6.f30790g, a3);
            C13905p.m43383b(a3, qVar2.f30790g, a3);
            iArr4 = c;
            iArr3 = a3;
        }
        int[] a4 = C13961e.m43889a();
        C13905p.m43387d(iArr4, iArr2, a4);
        C13905p.m43387d(iArr3, iArr, a);
        if (!C13961e.m43893b(a4)) {
            C13905p.m43386d(a4, a2);
            int[] a5 = C13961e.m43889a();
            C13905p.m43383b(a2, a4, a5);
            C13905p.m43383b(a2, iArr4, a2);
            C13905p.m43382b(a5, a5);
            C13961e.m43904c(iArr3, a5, c);
            C13905p.m43377a(C13961e.m43891b(a2, a2, a5), a5);
            C13909q qVar7 = new C13909q(a3);
            C13905p.m43386d(a, qVar7.f30790g);
            int[] iArr5 = qVar7.f30790g;
            C13905p.m43387d(iArr5, a5, iArr5);
            C13909q qVar8 = new C13909q(a5);
            C13905p.m43387d(a2, qVar7.f30790g, qVar8.f30790g);
            C13905p.m43385c(qVar8.f30790g, a, c);
            C13905p.m43384c(c, qVar8.f30790g);
            C13909q qVar9 = new C13909q(a4);
            if (!f2) {
                int[] iArr6 = qVar9.f30790g;
                C13905p.m43383b(iArr6, qVar5.f30790g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = qVar9.f30790g;
                C13905p.m43383b(iArr7, qVar6.f30790g, iArr7);
            }
            C13913r rVar = new C13913r(f, qVar7, qVar8, new C13812e[]{qVar9}, this.f30672e);
            return rVar;
        } else if (C13961e.m43893b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13913r(null, mo35141c(), mo35144d());
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
        C13913r rVar = new C13913r(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return rVar;
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
        C13909q qVar = (C13909q) this.f30670c;
        if (qVar.mo35112g()) {
            return f.mo35091k();
        }
        C13909q qVar2 = (C13909q) this.f30669b;
        C13909q qVar3 = (C13909q) this.f30671d[0];
        int[] a = C13961e.m43889a();
        C13905p.m43386d(qVar.f30790g, a);
        int[] a2 = C13961e.m43889a();
        C13905p.m43386d(a, a2);
        int[] a3 = C13961e.m43889a();
        C13905p.m43386d(qVar2.f30790g, a3);
        C13905p.m43377a(C13961e.m43891b(a3, a3, a3), a3);
        C13905p.m43383b(a, qVar2.f30790g, a);
        C13905p.m43377a(C13969m.m44025c(6, a, 2, 0), a);
        int[] a4 = C13961e.m43889a();
        C13905p.m43377a(C13969m.m44000a(6, a2, 3, 0, a4), a4);
        C13909q qVar4 = new C13909q(a2);
        C13905p.m43386d(a3, qVar4.f30790g);
        int[] iArr = qVar4.f30790g;
        C13905p.m43387d(iArr, a, iArr);
        int[] iArr2 = qVar4.f30790g;
        C13905p.m43387d(iArr2, a, iArr2);
        C13909q qVar5 = new C13909q(a);
        C13905p.m43387d(a, qVar4.f30790g, qVar5.f30790g);
        int[] iArr3 = qVar5.f30790g;
        C13905p.m43383b(iArr3, a3, iArr3);
        int[] iArr4 = qVar5.f30790g;
        C13905p.m43387d(iArr4, a4, iArr4);
        C13909q qVar6 = new C13909q(a3);
        C13905p.m43388e(qVar.f30790g, qVar6.f30790g);
        if (!qVar3.mo35111f()) {
            int[] iArr5 = qVar6.f30790g;
            C13905p.m43383b(iArr5, qVar3.f30790g, iArr5);
        }
        C13913r rVar = new C13913r(f, qVar4, qVar5, new C13812e[]{qVar6}, this.f30672e);
        return rVar;
    }

    public C13913r(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13913r(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
