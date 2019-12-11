package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13962f;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.z */
/* compiled from: SecP224K1Point */
public class C13942z extends C13818b {
    public C13942z(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13939y yVar = (C13939y) this.f30669b;
        C13939y yVar2 = (C13939y) this.f30670c;
        C13939y yVar3 = (C13939y) gVar.mo35155l();
        C13939y yVar4 = (C13939y) gVar.mo35156m();
        C13939y yVar5 = (C13939y) this.f30671d[0];
        C13939y yVar6 = (C13939y) gVar.mo35130a(0);
        int[] b = C13962f.m43923b();
        int[] a = C13962f.m43918a();
        int[] a2 = C13962f.m43918a();
        int[] a3 = C13962f.m43918a();
        boolean f2 = yVar5.mo35111f();
        if (f2) {
            iArr2 = yVar3.f30822g;
            iArr = yVar4.f30822g;
        } else {
            C13936x.m43725d(yVar5.f30822g, a2);
            C13936x.m43722b(a2, yVar3.f30822g, a);
            C13936x.m43722b(a2, yVar5.f30822g, a2);
            C13936x.m43722b(a2, yVar4.f30822g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = yVar6.mo35111f();
        if (f3) {
            iArr4 = yVar.f30822g;
            iArr3 = yVar2.f30822g;
        } else {
            C13936x.m43725d(yVar6.f30822g, a3);
            C13936x.m43722b(a3, yVar.f30822g, b);
            C13936x.m43722b(a3, yVar6.f30822g, a3);
            C13936x.m43722b(a3, yVar2.f30822g, a3);
            iArr4 = b;
            iArr3 = a3;
        }
        int[] a4 = C13962f.m43918a();
        C13936x.m43726d(iArr4, iArr2, a4);
        C13936x.m43726d(iArr3, iArr, a);
        if (!C13962f.m43921b(a4)) {
            C13936x.m43725d(a4, a2);
            int[] a5 = C13962f.m43918a();
            C13936x.m43722b(a2, a4, a5);
            C13936x.m43722b(a2, iArr4, a2);
            C13936x.m43721b(a5, a5);
            C13962f.m43925c(iArr3, a5, b);
            C13936x.m43716a(C13962f.m43920b(a2, a2, a5), a5);
            C13939y yVar7 = new C13939y(a3);
            C13936x.m43725d(a, yVar7.f30822g);
            int[] iArr5 = yVar7.f30822g;
            C13936x.m43726d(iArr5, a5, iArr5);
            C13939y yVar8 = new C13939y(a5);
            C13936x.m43726d(a2, yVar7.f30822g, yVar8.f30822g);
            C13936x.m43724c(yVar8.f30822g, a, b);
            C13936x.m43723c(b, yVar8.f30822g);
            C13939y yVar9 = new C13939y(a4);
            if (!f2) {
                int[] iArr6 = yVar9.f30822g;
                C13936x.m43722b(iArr6, yVar5.f30822g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = yVar9.f30822g;
                C13936x.m43722b(iArr7, yVar6.f30822g, iArr7);
            }
            C13942z zVar = new C13942z(f, yVar7, yVar8, new C13812e[]{yVar9}, this.f30672e);
            return zVar;
        } else if (C13962f.m43921b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13942z(null, mo35141c(), mo35144d());
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
        C13942z zVar = new C13942z(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return zVar;
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
        C13939y yVar = (C13939y) this.f30670c;
        if (yVar.mo35112g()) {
            return f.mo35091k();
        }
        C13939y yVar2 = (C13939y) this.f30669b;
        C13939y yVar3 = (C13939y) this.f30671d[0];
        int[] a = C13962f.m43918a();
        C13936x.m43725d(yVar.f30822g, a);
        int[] a2 = C13962f.m43918a();
        C13936x.m43725d(a, a2);
        int[] a3 = C13962f.m43918a();
        C13936x.m43725d(yVar2.f30822g, a3);
        C13936x.m43716a(C13962f.m43920b(a3, a3, a3), a3);
        C13936x.m43722b(a, yVar2.f30822g, a);
        C13936x.m43716a(C13969m.m44025c(7, a, 2, 0), a);
        int[] a4 = C13962f.m43918a();
        C13936x.m43716a(C13969m.m44000a(7, a2, 3, 0, a4), a4);
        C13939y yVar4 = new C13939y(a2);
        C13936x.m43725d(a3, yVar4.f30822g);
        int[] iArr = yVar4.f30822g;
        C13936x.m43726d(iArr, a, iArr);
        int[] iArr2 = yVar4.f30822g;
        C13936x.m43726d(iArr2, a, iArr2);
        C13939y yVar5 = new C13939y(a);
        C13936x.m43726d(a, yVar4.f30822g, yVar5.f30822g);
        int[] iArr3 = yVar5.f30822g;
        C13936x.m43722b(iArr3, a3, iArr3);
        int[] iArr4 = yVar5.f30822g;
        C13936x.m43726d(iArr4, a4, iArr4);
        C13939y yVar6 = new C13939y(a3);
        C13936x.m43727e(yVar.f30822g, yVar6.f30822g);
        if (!yVar3.mo35111f()) {
            int[] iArr5 = yVar6.f30822g;
            C13936x.m43722b(iArr5, yVar3.f30822g, iArr5);
        }
        C13942z zVar = new C13942z(f, yVar4, yVar5, new C13812e[]{yVar6}, this.f30672e);
        return zVar;
    }

    public C13942z(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13942z(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
