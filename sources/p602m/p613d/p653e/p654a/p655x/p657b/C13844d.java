package p602m.p613d.p653e.p654a.p655x.p657b;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.b.d */
/* compiled from: SM2P256V1Point */
public class C13844d extends C13818b {
    public C13844d(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13843c cVar = (C13843c) this.f30669b;
        C13843c cVar2 = (C13843c) this.f30670c;
        C13843c cVar3 = (C13843c) gVar.mo35155l();
        C13843c cVar4 = (C13843c) gVar.mo35156m();
        C13843c cVar5 = (C13843c) this.f30671d[0];
        C13843c cVar6 = (C13843c) gVar.mo35130a(0);
        int[] c = C13963g.m43961c();
        int[] a = C13963g.m43945a();
        int[] a2 = C13963g.m43945a();
        int[] a3 = C13963g.m43945a();
        boolean f2 = cVar5.mo35111f();
        if (f2) {
            iArr2 = cVar3.f30714g;
            iArr = cVar4.f30714g;
        } else {
            C13842b.m42711d(cVar5.f30714g, a2);
            C13842b.m42708b(a2, cVar3.f30714g, a);
            C13842b.m42708b(a2, cVar5.f30714g, a2);
            C13842b.m42708b(a2, cVar4.f30714g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = cVar6.mo35111f();
        if (f3) {
            iArr4 = cVar.f30714g;
            iArr3 = cVar2.f30714g;
        } else {
            C13842b.m42711d(cVar6.f30714g, a3);
            C13842b.m42708b(a3, cVar.f30714g, c);
            C13842b.m42708b(a3, cVar6.f30714g, a3);
            C13842b.m42708b(a3, cVar2.f30714g, a3);
            iArr4 = c;
            iArr3 = a3;
        }
        int[] a4 = C13963g.m43945a();
        C13842b.m42712d(iArr4, iArr2, a4);
        C13842b.m42712d(iArr3, iArr, a);
        if (!C13963g.m43949b(a4)) {
            C13842b.m42711d(a4, a2);
            int[] a5 = C13963g.m43945a();
            C13842b.m42708b(a2, a4, a5);
            C13842b.m42708b(a2, iArr4, a2);
            C13842b.m42707b(a5, a5);
            C13963g.m43959c(iArr3, a5, c);
            C13842b.m42700a(C13963g.m43947b(a2, a2, a5), a5);
            C13843c cVar7 = new C13843c(a3);
            C13842b.m42711d(a, cVar7.f30714g);
            int[] iArr5 = cVar7.f30714g;
            C13842b.m42712d(iArr5, a5, iArr5);
            C13843c cVar8 = new C13843c(a5);
            C13842b.m42712d(a2, cVar7.f30714g, cVar8.f30714g);
            C13842b.m42710c(cVar8.f30714g, a, c);
            C13842b.m42709c(c, cVar8.f30714g);
            C13843c cVar9 = new C13843c(a4);
            if (!f2) {
                int[] iArr6 = cVar9.f30714g;
                C13842b.m42708b(iArr6, cVar5.f30714g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = cVar9.f30714g;
                C13842b.m42708b(iArr7, cVar6.f30714g, iArr7);
            }
            C13844d dVar = new C13844d(f, cVar7, cVar8, new C13812e[]{cVar9}, this.f30672e);
            return dVar;
        } else if (C13963g.m43949b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13844d(null, mo35141c(), mo35144d());
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
        C13844d dVar = new C13844d(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return dVar;
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
        C13843c cVar = (C13843c) this.f30670c;
        if (cVar.mo35112g()) {
            return f.mo35091k();
        }
        C13843c cVar2 = (C13843c) this.f30669b;
        C13843c cVar3 = (C13843c) this.f30671d[0];
        int[] a = C13963g.m43945a();
        int[] a2 = C13963g.m43945a();
        int[] a3 = C13963g.m43945a();
        C13842b.m42711d(cVar.f30714g, a3);
        int[] a4 = C13963g.m43945a();
        C13842b.m42711d(a3, a4);
        boolean f2 = cVar3.mo35111f();
        int[] iArr = cVar3.f30714g;
        if (!f2) {
            C13842b.m42711d(iArr, a2);
            iArr = a2;
        }
        C13842b.m42712d(cVar2.f30714g, iArr, a);
        C13842b.m42704a(cVar2.f30714g, iArr, a2);
        C13842b.m42708b(a2, a, a2);
        C13842b.m42700a(C13963g.m43947b(a2, a2, a2), a2);
        C13842b.m42708b(a3, cVar2.f30714g, a3);
        C13842b.m42700a(C13969m.m44025c(8, a3, 2, 0), a3);
        C13842b.m42700a(C13969m.m44000a(8, a4, 3, 0, a), a);
        C13843c cVar4 = new C13843c(a4);
        C13842b.m42711d(a2, cVar4.f30714g);
        int[] iArr2 = cVar4.f30714g;
        C13842b.m42712d(iArr2, a3, iArr2);
        int[] iArr3 = cVar4.f30714g;
        C13842b.m42712d(iArr3, a3, iArr3);
        C13843c cVar5 = new C13843c(a3);
        C13842b.m42712d(a3, cVar4.f30714g, cVar5.f30714g);
        int[] iArr4 = cVar5.f30714g;
        C13842b.m42708b(iArr4, a2, iArr4);
        int[] iArr5 = cVar5.f30714g;
        C13842b.m42712d(iArr5, a, iArr5);
        C13843c cVar6 = new C13843c(a2);
        C13842b.m42713e(cVar.f30714g, cVar6.f30714g);
        if (!f2) {
            int[] iArr6 = cVar6.f30714g;
            C13842b.m42708b(iArr6, cVar3.f30714g, iArr6);
        }
        C13843c cVar7 = cVar4;
        C13843c cVar8 = cVar5;
        C13844d dVar = new C13844d(f, cVar7, cVar8, new C13812e[]{cVar6}, this.f30672e);
        return dVar;
    }

    public C13844d(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13844d(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
