package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.v */
/* compiled from: SecP192R1Point */
public class C13929v extends C13818b {
    public C13929v(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13925u uVar = (C13925u) this.f30669b;
        C13925u uVar2 = (C13925u) this.f30670c;
        C13925u uVar3 = (C13925u) gVar.mo35155l();
        C13925u uVar4 = (C13925u) gVar.mo35156m();
        C13925u uVar5 = (C13925u) this.f30671d[0];
        C13925u uVar6 = (C13925u) gVar.mo35130a(0);
        int[] c = C13961e.m43905c();
        int[] a = C13961e.m43889a();
        int[] a2 = C13961e.m43889a();
        int[] a3 = C13961e.m43889a();
        boolean f2 = uVar5.mo35111f();
        if (f2) {
            iArr2 = uVar3.f30807g;
            iArr = uVar4.f30807g;
        } else {
            C13921t.m43564d(uVar5.f30807g, a2);
            C13921t.m43561b(a2, uVar3.f30807g, a);
            C13921t.m43561b(a2, uVar5.f30807g, a2);
            C13921t.m43561b(a2, uVar4.f30807g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = uVar6.mo35111f();
        if (f3) {
            iArr4 = uVar.f30807g;
            iArr3 = uVar2.f30807g;
        } else {
            C13921t.m43564d(uVar6.f30807g, a3);
            C13921t.m43561b(a3, uVar.f30807g, c);
            C13921t.m43561b(a3, uVar6.f30807g, a3);
            C13921t.m43561b(a3, uVar2.f30807g, a3);
            iArr4 = c;
            iArr3 = a3;
        }
        int[] a4 = C13961e.m43889a();
        C13921t.m43565d(iArr4, iArr2, a4);
        C13921t.m43565d(iArr3, iArr, a);
        if (!C13961e.m43893b(a4)) {
            C13921t.m43564d(a4, a2);
            int[] a5 = C13961e.m43889a();
            C13921t.m43561b(a2, a4, a5);
            C13921t.m43561b(a2, iArr4, a2);
            C13921t.m43560b(a5, a5);
            C13961e.m43904c(iArr3, a5, c);
            C13921t.m43553a(C13961e.m43891b(a2, a2, a5), a5);
            C13925u uVar7 = new C13925u(a3);
            C13921t.m43564d(a, uVar7.f30807g);
            int[] iArr5 = uVar7.f30807g;
            C13921t.m43565d(iArr5, a5, iArr5);
            C13925u uVar8 = new C13925u(a5);
            C13921t.m43565d(a2, uVar7.f30807g, uVar8.f30807g);
            C13921t.m43563c(uVar8.f30807g, a, c);
            C13921t.m43562c(c, uVar8.f30807g);
            C13925u uVar9 = new C13925u(a4);
            if (!f2) {
                int[] iArr6 = uVar9.f30807g;
                C13921t.m43561b(iArr6, uVar5.f30807g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = uVar9.f30807g;
                C13921t.m43561b(iArr7, uVar6.f30807g, iArr7);
            }
            C13929v vVar = new C13929v(f, uVar7, uVar8, new C13812e[]{uVar9}, this.f30672e);
            return vVar;
        } else if (C13961e.m43893b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13929v(null, mo35141c(), mo35144d());
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
        C13929v vVar = new C13929v(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return vVar;
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
        C13925u uVar = (C13925u) this.f30670c;
        if (uVar.mo35112g()) {
            return f.mo35091k();
        }
        C13925u uVar2 = (C13925u) this.f30669b;
        C13925u uVar3 = (C13925u) this.f30671d[0];
        int[] a = C13961e.m43889a();
        int[] a2 = C13961e.m43889a();
        int[] a3 = C13961e.m43889a();
        C13921t.m43564d(uVar.f30807g, a3);
        int[] a4 = C13961e.m43889a();
        C13921t.m43564d(a3, a4);
        boolean f2 = uVar3.mo35111f();
        int[] iArr = uVar3.f30807g;
        if (!f2) {
            C13921t.m43564d(iArr, a2);
            iArr = a2;
        }
        C13921t.m43565d(uVar2.f30807g, iArr, a);
        C13921t.m43557a(uVar2.f30807g, iArr, a2);
        C13921t.m43561b(a2, a, a2);
        C13921t.m43553a(C13961e.m43891b(a2, a2, a2), a2);
        C13921t.m43561b(a3, uVar2.f30807g, a3);
        C13921t.m43553a(C13969m.m44025c(6, a3, 2, 0), a3);
        C13921t.m43553a(C13969m.m44000a(6, a4, 3, 0, a), a);
        C13925u uVar4 = new C13925u(a4);
        C13921t.m43564d(a2, uVar4.f30807g);
        int[] iArr2 = uVar4.f30807g;
        C13921t.m43565d(iArr2, a3, iArr2);
        int[] iArr3 = uVar4.f30807g;
        C13921t.m43565d(iArr3, a3, iArr3);
        C13925u uVar5 = new C13925u(a3);
        C13921t.m43565d(a3, uVar4.f30807g, uVar5.f30807g);
        int[] iArr4 = uVar5.f30807g;
        C13921t.m43561b(iArr4, a2, iArr4);
        int[] iArr5 = uVar5.f30807g;
        C13921t.m43565d(iArr5, a, iArr5);
        C13925u uVar6 = new C13925u(a2);
        C13921t.m43566e(uVar.f30807g, uVar6.f30807g);
        if (!f2) {
            int[] iArr6 = uVar6.f30807g;
            C13921t.m43561b(iArr6, uVar3.f30807g, iArr6);
        }
        C13925u uVar7 = uVar4;
        C13925u uVar8 = uVar5;
        C13929v vVar = new C13929v(f, uVar7, uVar8, new C13812e[]{uVar6}, this.f30672e);
        return vVar;
    }

    public C13929v(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13929v(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
