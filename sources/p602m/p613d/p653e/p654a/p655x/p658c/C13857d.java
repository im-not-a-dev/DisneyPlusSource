package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13959c;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.d */
/* compiled from: SecP128R1Point */
public class C13857d extends C13818b {
    public C13857d(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13853c cVar = (C13853c) this.f30669b;
        C13853c cVar2 = (C13853c) this.f30670c;
        C13853c cVar3 = (C13853c) gVar.mo35155l();
        C13853c cVar4 = (C13853c) gVar.mo35156m();
        C13853c cVar5 = (C13853c) this.f30671d[0];
        C13853c cVar6 = (C13853c) gVar.mo35130a(0);
        int[] c = C13959c.m43850c();
        int[] a = C13959c.m43838a();
        int[] a2 = C13959c.m43838a();
        int[] a3 = C13959c.m43838a();
        boolean f2 = cVar5.mo35111f();
        if (f2) {
            iArr2 = cVar3.f30729g;
            iArr = cVar4.f30729g;
        } else {
            C13849b.m42794d(cVar5.f30729g, a2);
            C13849b.m42791b(a2, cVar3.f30729g, a);
            C13849b.m42791b(a2, cVar5.f30729g, a2);
            C13849b.m42791b(a2, cVar4.f30729g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = cVar6.mo35111f();
        if (f3) {
            iArr4 = cVar.f30729g;
            iArr3 = cVar2.f30729g;
        } else {
            C13849b.m42794d(cVar6.f30729g, a3);
            C13849b.m42791b(a3, cVar.f30729g, c);
            C13849b.m42791b(a3, cVar6.f30729g, a3);
            C13849b.m42791b(a3, cVar2.f30729g, a3);
            iArr4 = c;
            iArr3 = a3;
        }
        int[] a4 = C13959c.m43838a();
        C13849b.m42795d(iArr4, iArr2, a4);
        C13849b.m42795d(iArr3, iArr, a);
        if (!C13959c.m43841b(a4)) {
            C13849b.m42794d(a4, a2);
            int[] a5 = C13959c.m43838a();
            C13849b.m42791b(a2, a4, a5);
            C13849b.m42791b(a2, iArr4, a2);
            C13849b.m42790b(a5, a5);
            C13959c.m43849c(iArr3, a5, c);
            C13849b.m42783a(C13959c.m43840b(a2, a2, a5), a5);
            C13853c cVar7 = new C13853c(a3);
            C13849b.m42794d(a, cVar7.f30729g);
            int[] iArr5 = cVar7.f30729g;
            C13849b.m42795d(iArr5, a5, iArr5);
            C13853c cVar8 = new C13853c(a5);
            C13849b.m42795d(a2, cVar7.f30729g, cVar8.f30729g);
            C13849b.m42793c(cVar8.f30729g, a, c);
            C13849b.m42792c(c, cVar8.f30729g);
            C13853c cVar9 = new C13853c(a4);
            if (!f2) {
                int[] iArr6 = cVar9.f30729g;
                C13849b.m42791b(iArr6, cVar5.f30729g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = cVar9.f30729g;
                C13849b.m42791b(iArr7, cVar6.f30729g, iArr7);
            }
            C13857d dVar = new C13857d(f, cVar7, cVar8, new C13812e[]{cVar9}, this.f30672e);
            return dVar;
        } else if (C13959c.m43841b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13857d(null, mo35141c(), mo35144d());
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
        C13857d dVar = new C13857d(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
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
        C13853c cVar = (C13853c) this.f30670c;
        if (cVar.mo35112g()) {
            return f.mo35091k();
        }
        C13853c cVar2 = (C13853c) this.f30669b;
        C13853c cVar3 = (C13853c) this.f30671d[0];
        int[] a = C13959c.m43838a();
        int[] a2 = C13959c.m43838a();
        int[] a3 = C13959c.m43838a();
        C13849b.m42794d(cVar.f30729g, a3);
        int[] a4 = C13959c.m43838a();
        C13849b.m42794d(a3, a4);
        boolean f2 = cVar3.mo35111f();
        int[] iArr = cVar3.f30729g;
        if (!f2) {
            C13849b.m42794d(iArr, a2);
            iArr = a2;
        }
        C13849b.m42795d(cVar2.f30729g, iArr, a);
        C13849b.m42787a(cVar2.f30729g, iArr, a2);
        C13849b.m42791b(a2, a, a2);
        C13849b.m42783a(C13959c.m43840b(a2, a2, a2), a2);
        C13849b.m42791b(a3, cVar2.f30729g, a3);
        C13849b.m42783a(C13969m.m44025c(4, a3, 2, 0), a3);
        C13849b.m42783a(C13969m.m44000a(4, a4, 3, 0, a), a);
        C13853c cVar4 = new C13853c(a4);
        C13849b.m42794d(a2, cVar4.f30729g);
        int[] iArr2 = cVar4.f30729g;
        C13849b.m42795d(iArr2, a3, iArr2);
        int[] iArr3 = cVar4.f30729g;
        C13849b.m42795d(iArr3, a3, iArr3);
        C13853c cVar5 = new C13853c(a3);
        C13849b.m42795d(a3, cVar4.f30729g, cVar5.f30729g);
        int[] iArr4 = cVar5.f30729g;
        C13849b.m42791b(iArr4, a2, iArr4);
        int[] iArr5 = cVar5.f30729g;
        C13849b.m42795d(iArr5, a, iArr5);
        C13853c cVar6 = new C13853c(a2);
        C13849b.m42796e(cVar.f30729g, cVar6.f30729g);
        if (!f2) {
            int[] iArr6 = cVar6.f30729g;
            C13849b.m42791b(iArr6, cVar3.f30729g, iArr6);
        }
        C13853c cVar7 = cVar4;
        C13853c cVar8 = cVar5;
        C13857d dVar = new C13857d(f, cVar7, cVar8, new C13812e[]{cVar6}, this.f30672e);
        return dVar;
    }

    public C13857d(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13857d(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
