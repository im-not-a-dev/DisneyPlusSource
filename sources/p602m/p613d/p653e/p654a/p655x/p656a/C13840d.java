package p602m.p613d.p653e.p654a.p655x.p656a;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13963g;

/* renamed from: m.d.e.a.x.a.d */
/* compiled from: Curve25519Point */
public class C13840d extends C13818b {
    public C13840d(C13806d dVar, C13812e eVar, C13812e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    /* renamed from: a */
    public C13812e mo35130a(int i) {
        if (i == 1) {
            return mo35228w();
        }
        return super.mo35130a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13840d(null, mo35141c(), mo35144d());
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
        return mo35227b(false).mo35134a(gVar);
    }

    /* renamed from: q */
    public C13816g mo35160q() {
        if (mo35157n()) {
            return this;
        }
        C13840d dVar = new C13840d(mo35148f(), this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return dVar;
    }

    /* renamed from: u */
    public C13816g mo35165u() {
        if (!mo35157n() && !this.f30670c.mo35112g()) {
            return mo35227b(false).mo35134a((C13816g) this);
        }
        return this;
    }

    /* renamed from: v */
    public C13816g mo35166v() {
        if (mo35157n()) {
            return this;
        }
        C13806d f = mo35148f();
        if (this.f30670c.mo35112g()) {
            return f.mo35091k();
        }
        return mo35227b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C13839c mo35228w() {
        C13812e[] eVarArr = this.f30671d;
        C13839c cVar = (C13839c) eVarArr[1];
        if (cVar != null) {
            return cVar;
        }
        C13839c a = mo35226a((C13839c) eVarArr[0], null);
        eVarArr[1] = a;
        return a;
    }

    public C13840d(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13840d mo35227b(boolean z) {
        C13839c cVar = (C13839c) this.f30669b;
        C13839c cVar2 = (C13839c) this.f30670c;
        C13839c cVar3 = (C13839c) this.f30671d[0];
        C13839c w = mo35228w();
        int[] a = C13963g.m43945a();
        C13838b.m42666d(cVar.f30708g, a);
        C13838b.m42655a(C13963g.m43947b(a, a, a) + C13963g.m43938a(w.f30708g, a), a);
        int[] a2 = C13963g.m43945a();
        C13838b.m42668e(cVar2.f30708g, a2);
        int[] a3 = C13963g.m43945a();
        C13838b.m42662b(a2, cVar2.f30708g, a3);
        int[] a4 = C13963g.m43945a();
        C13838b.m42662b(a3, cVar.f30708g, a4);
        C13838b.m42668e(a4, a4);
        int[] a5 = C13963g.m43945a();
        C13838b.m42666d(a3, a5);
        C13838b.m42668e(a5, a5);
        C13839c cVar4 = new C13839c(a3);
        C13838b.m42666d(a, cVar4.f30708g);
        int[] iArr = cVar4.f30708g;
        C13838b.m42667d(iArr, a4, iArr);
        int[] iArr2 = cVar4.f30708g;
        C13838b.m42667d(iArr2, a4, iArr2);
        C13839c cVar5 = new C13839c(a4);
        C13838b.m42667d(a4, cVar4.f30708g, cVar5.f30708g);
        int[] iArr3 = cVar5.f30708g;
        C13838b.m42662b(iArr3, a, iArr3);
        int[] iArr4 = cVar5.f30708g;
        C13838b.m42667d(iArr4, a5, iArr4);
        C13839c cVar6 = new C13839c(a2);
        if (!C13963g.m43941a(cVar3.f30708g)) {
            int[] iArr5 = cVar6.f30708g;
            C13838b.m42662b(iArr5, cVar3.f30708g, iArr5);
        }
        C13839c cVar7 = null;
        if (z) {
            cVar7 = new C13839c(a5);
            int[] iArr6 = cVar7.f30708g;
            C13838b.m42662b(iArr6, w.f30708g, iArr6);
            int[] iArr7 = cVar7.f30708g;
            C13838b.m42668e(iArr7, iArr7);
        }
        C13840d dVar = new C13840d(mo35148f(), cVar4, cVar5, new C13812e[]{cVar6, cVar7}, this.f30672e);
        return dVar;
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
        C13839c cVar = (C13839c) this.f30669b;
        C13839c cVar2 = (C13839c) this.f30670c;
        C13839c cVar3 = (C13839c) this.f30671d[0];
        C13839c cVar4 = (C13839c) gVar.mo35155l();
        C13839c cVar5 = (C13839c) gVar.mo35156m();
        C13839c cVar6 = (C13839c) gVar.mo35130a(0);
        int[] c = C13963g.m43961c();
        int[] a = C13963g.m43945a();
        int[] a2 = C13963g.m43945a();
        int[] a3 = C13963g.m43945a();
        boolean f2 = cVar3.mo35111f();
        if (f2) {
            iArr2 = cVar4.f30708g;
            iArr = cVar5.f30708g;
        } else {
            C13838b.m42666d(cVar3.f30708g, a2);
            C13838b.m42662b(a2, cVar4.f30708g, a);
            C13838b.m42662b(a2, cVar3.f30708g, a2);
            C13838b.m42662b(a2, cVar5.f30708g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = cVar6.mo35111f();
        if (f3) {
            iArr4 = cVar.f30708g;
            iArr3 = cVar2.f30708g;
        } else {
            C13838b.m42666d(cVar6.f30708g, a3);
            C13838b.m42662b(a3, cVar.f30708g, c);
            C13838b.m42662b(a3, cVar6.f30708g, a3);
            C13838b.m42662b(a3, cVar2.f30708g, a3);
            iArr4 = c;
            iArr3 = a3;
        }
        int[] a4 = C13963g.m43945a();
        C13838b.m42667d(iArr4, iArr2, a4);
        C13838b.m42667d(iArr3, iArr, a);
        if (!C13963g.m43949b(a4)) {
            int[] a5 = C13963g.m43945a();
            C13838b.m42666d(a4, a5);
            int[] a6 = C13963g.m43945a();
            C13838b.m42662b(a5, a4, a6);
            C13838b.m42662b(a5, iArr4, a2);
            C13838b.m42661b(a6, a6);
            C13963g.m43959c(iArr3, a6, c);
            C13838b.m42655a(C13963g.m43947b(a2, a2, a6), a6);
            C13839c cVar7 = new C13839c(a3);
            C13838b.m42666d(a, cVar7.f30708g);
            int[] iArr5 = cVar7.f30708g;
            C13838b.m42667d(iArr5, a6, iArr5);
            C13839c cVar8 = new C13839c(a6);
            C13838b.m42667d(a2, cVar7.f30708g, cVar8.f30708g);
            C13838b.m42665c(cVar8.f30708g, a, c);
            C13838b.m42664c(c, cVar8.f30708g);
            C13839c cVar9 = new C13839c(a4);
            if (!f2) {
                int[] iArr6 = cVar9.f30708g;
                C13838b.m42662b(iArr6, cVar3.f30708g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = cVar9.f30708g;
                C13838b.m42662b(iArr7, cVar6.f30708g, iArr7);
            }
            if (!f2 || !f3) {
                a5 = null;
            }
            C13840d dVar = new C13840d(f, cVar7, cVar8, new C13812e[]{cVar9, mo35226a(cVar9, a5)}, this.f30672e);
            return dVar;
        } else if (C13963g.m43949b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    C13840d(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13839c mo35226a(C13839c cVar, int[] iArr) {
        C13839c cVar2 = (C13839c) mo35148f().mo35082d();
        if (cVar.mo35111f()) {
            return cVar2;
        }
        C13839c cVar3 = new C13839c();
        if (iArr == null) {
            iArr = cVar3.f30708g;
            C13838b.m42666d(cVar.f30708g, iArr);
        }
        C13838b.m42666d(iArr, cVar3.f30708g);
        int[] iArr2 = cVar3.f30708g;
        C13838b.m42662b(iArr2, cVar2.f30708g, iArr2);
        return cVar3;
    }
}
