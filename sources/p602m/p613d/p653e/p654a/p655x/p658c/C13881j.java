package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13960d;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.j */
/* compiled from: SecP160R1Point */
public class C13881j extends C13818b {
    public C13881j(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13877i iVar = (C13877i) this.f30669b;
        C13877i iVar2 = (C13877i) this.f30670c;
        C13877i iVar3 = (C13877i) gVar.mo35155l();
        C13877i iVar4 = (C13877i) gVar.mo35156m();
        C13877i iVar5 = (C13877i) this.f30671d[0];
        C13877i iVar6 = (C13877i) gVar.mo35130a(0);
        int[] b = C13960d.m43869b();
        int[] a = C13960d.m43863a();
        int[] a2 = C13960d.m43863a();
        int[] a3 = C13960d.m43863a();
        boolean f2 = iVar5.mo35111f();
        if (f2) {
            iArr2 = iVar3.f30755g;
            iArr = iVar4.f30755g;
        } else {
            C13873h.m43062d(iVar5.f30755g, a2);
            C13873h.m43059b(a2, iVar3.f30755g, a);
            C13873h.m43059b(a2, iVar5.f30755g, a2);
            C13873h.m43059b(a2, iVar4.f30755g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = iVar6.mo35111f();
        if (f3) {
            iArr4 = iVar.f30755g;
            iArr3 = iVar2.f30755g;
        } else {
            C13873h.m43062d(iVar6.f30755g, a3);
            C13873h.m43059b(a3, iVar.f30755g, b);
            C13873h.m43059b(a3, iVar6.f30755g, a3);
            C13873h.m43059b(a3, iVar2.f30755g, a3);
            iArr4 = b;
            iArr3 = a3;
        }
        int[] a4 = C13960d.m43863a();
        C13873h.m43063d(iArr4, iArr2, a4);
        C13873h.m43063d(iArr3, iArr, a);
        if (!C13960d.m43867b(a4)) {
            C13873h.m43062d(a4, a2);
            int[] a5 = C13960d.m43863a();
            C13873h.m43059b(a2, a4, a5);
            C13873h.m43059b(a2, iArr4, a2);
            C13873h.m43058b(a5, a5);
            C13960d.m43872c(iArr3, a5, b);
            C13873h.m43053a(C13960d.m43866b(a2, a2, a5), a5);
            C13877i iVar7 = new C13877i(a3);
            C13873h.m43062d(a, iVar7.f30755g);
            int[] iArr5 = iVar7.f30755g;
            C13873h.m43063d(iArr5, a5, iArr5);
            C13877i iVar8 = new C13877i(a5);
            C13873h.m43063d(a2, iVar7.f30755g, iVar8.f30755g);
            C13873h.m43061c(iVar8.f30755g, a, b);
            C13873h.m43060c(b, iVar8.f30755g);
            C13877i iVar9 = new C13877i(a4);
            if (!f2) {
                int[] iArr6 = iVar9.f30755g;
                C13873h.m43059b(iArr6, iVar5.f30755g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = iVar9.f30755g;
                C13873h.m43059b(iArr7, iVar6.f30755g, iArr7);
            }
            C13881j jVar = new C13881j(f, iVar7, iVar8, new C13812e[]{iVar9}, this.f30672e);
            return jVar;
        } else if (C13960d.m43867b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13881j(null, mo35141c(), mo35144d());
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
        C13881j jVar = new C13881j(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return jVar;
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
        C13877i iVar = (C13877i) this.f30670c;
        if (iVar.mo35112g()) {
            return f.mo35091k();
        }
        C13877i iVar2 = (C13877i) this.f30669b;
        C13877i iVar3 = (C13877i) this.f30671d[0];
        int[] a = C13960d.m43863a();
        int[] a2 = C13960d.m43863a();
        int[] a3 = C13960d.m43863a();
        C13873h.m43062d(iVar.f30755g, a3);
        int[] a4 = C13960d.m43863a();
        C13873h.m43062d(a3, a4);
        boolean f2 = iVar3.mo35111f();
        int[] iArr = iVar3.f30755g;
        if (!f2) {
            C13873h.m43062d(iArr, a2);
            iArr = a2;
        }
        C13873h.m43063d(iVar2.f30755g, iArr, a);
        C13873h.m43056a(iVar2.f30755g, iArr, a2);
        C13873h.m43059b(a2, a, a2);
        C13873h.m43053a(C13960d.m43866b(a2, a2, a2), a2);
        C13873h.m43059b(a3, iVar2.f30755g, a3);
        C13873h.m43053a(C13969m.m44025c(5, a3, 2, 0), a3);
        C13873h.m43053a(C13969m.m44000a(5, a4, 3, 0, a), a);
        C13877i iVar4 = new C13877i(a4);
        C13873h.m43062d(a2, iVar4.f30755g);
        int[] iArr2 = iVar4.f30755g;
        C13873h.m43063d(iArr2, a3, iArr2);
        int[] iArr3 = iVar4.f30755g;
        C13873h.m43063d(iArr3, a3, iArr3);
        C13877i iVar5 = new C13877i(a3);
        C13873h.m43063d(a3, iVar4.f30755g, iVar5.f30755g);
        int[] iArr4 = iVar5.f30755g;
        C13873h.m43059b(iArr4, a2, iArr4);
        int[] iArr5 = iVar5.f30755g;
        C13873h.m43063d(iArr5, a, iArr5);
        C13877i iVar6 = new C13877i(a2);
        C13873h.m43064e(iVar.f30755g, iVar6.f30755g);
        if (!f2) {
            int[] iArr6 = iVar6.f30755g;
            C13873h.m43059b(iArr6, iVar3.f30755g, iArr6);
        }
        C13877i iVar7 = iVar4;
        C13877i iVar8 = iVar5;
        C13881j jVar = new C13881j(f, iVar7, iVar8, new C13812e[]{iVar6}, this.f30672e);
        return jVar;
    }

    public C13881j(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13881j(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
