package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13965i;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.p0 */
/* compiled from: SecP384R1Point */
public class C13906p0 extends C13818b {
    public C13906p0(C13806d dVar, C13812e eVar, C13812e eVar2) {
        this(dVar, eVar, eVar2, false);
    }

    /* renamed from: a */
    public C13816g mo35134a(C13816g gVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        C13816g gVar2 = gVar;
        if (mo35157n()) {
            return gVar2;
        }
        if (gVar.mo35157n()) {
            return this;
        }
        if (this == gVar2) {
            return mo35166v();
        }
        C13806d f = mo35148f();
        C13902o0 o0Var = (C13902o0) this.f30669b;
        C13902o0 o0Var2 = (C13902o0) this.f30670c;
        C13902o0 o0Var3 = (C13902o0) gVar.mo35155l();
        C13902o0 o0Var4 = (C13902o0) gVar.mo35156m();
        C13902o0 o0Var5 = (C13902o0) this.f30671d[0];
        C13902o0 o0Var6 = (C13902o0) gVar2.mo35130a(0);
        int[] a = C13969m.m44011a(24);
        int[] a2 = C13969m.m44011a(24);
        int[] a3 = C13969m.m44011a(12);
        int[] a4 = C13969m.m44011a(12);
        boolean f2 = o0Var5.mo35111f();
        if (f2) {
            iArr2 = o0Var3.f30783g;
            iArr = o0Var4.f30783g;
        } else {
            C13898n0.m43313d(o0Var5.f30783g, a3);
            C13898n0.m43312c(a3, o0Var3.f30783g, a2);
            C13898n0.m43312c(a3, o0Var5.f30783g, a3);
            C13898n0.m43312c(a3, o0Var4.f30783g, a3);
            iArr2 = a2;
            iArr = a3;
        }
        boolean f3 = o0Var6.mo35111f();
        if (f3) {
            iArr4 = o0Var.f30783g;
            iArr3 = o0Var2.f30783g;
        } else {
            C13898n0.m43313d(o0Var6.f30783g, a4);
            C13898n0.m43312c(a4, o0Var.f30783g, a);
            C13898n0.m43312c(a4, o0Var6.f30783g, a4);
            C13898n0.m43312c(a4, o0Var2.f30783g, a4);
            iArr4 = a;
            iArr3 = a4;
        }
        int[] a5 = C13969m.m44011a(12);
        C13898n0.m43314d(iArr4, iArr2, a5);
        int[] a6 = C13969m.m44011a(12);
        C13898n0.m43314d(iArr3, iArr, a6);
        if (!C13969m.m44033e(12, a5)) {
            C13898n0.m43313d(a5, a3);
            int[] a7 = C13969m.m44011a(12);
            C13898n0.m43312c(a3, a5, a7);
            C13898n0.m43312c(a3, iArr4, a3);
            C13898n0.m43309b(a7, a7);
            C13965i.m43976a(iArr3, a7, a);
            C13898n0.m43302a(C13969m.m44019b(12, a3, a3, a7), a7);
            C13902o0 o0Var7 = new C13902o0(a4);
            C13898n0.m43313d(a6, o0Var7.f30783g);
            int[] iArr5 = o0Var7.f30783g;
            C13898n0.m43314d(iArr5, a7, iArr5);
            C13902o0 o0Var8 = new C13902o0(a7);
            C13898n0.m43314d(a3, o0Var7.f30783g, o0Var8.f30783g);
            C13965i.m43976a(o0Var8.f30783g, a6, a2);
            C13898n0.m43310b(a, a2, a);
            C13898n0.m43311c(a, o0Var8.f30783g);
            C13902o0 o0Var9 = new C13902o0(a5);
            if (!f2) {
                int[] iArr6 = o0Var9.f30783g;
                C13898n0.m43312c(iArr6, o0Var5.f30783g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = o0Var9.f30783g;
                C13898n0.m43312c(iArr7, o0Var6.f30783g, iArr7);
            }
            C13902o0 o0Var10 = o0Var8;
            C13906p0 p0Var = new C13906p0(f, o0Var7, o0Var10, new C13812e[]{o0Var9}, this.f30672e);
            return p0Var;
        } else if (C13969m.m44033e(12, a6)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13906p0(null, mo35141c(), mo35144d());
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
        C13906p0 p0Var = new C13906p0(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return p0Var;
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
        C13902o0 o0Var = (C13902o0) this.f30670c;
        if (o0Var.mo35112g()) {
            return f.mo35091k();
        }
        C13902o0 o0Var2 = (C13902o0) this.f30669b;
        C13902o0 o0Var3 = (C13902o0) this.f30671d[0];
        int[] a = C13969m.m44011a(12);
        int[] a2 = C13969m.m44011a(12);
        int[] a3 = C13969m.m44011a(12);
        C13898n0.m43313d(o0Var.f30783g, a3);
        int[] a4 = C13969m.m44011a(12);
        C13898n0.m43313d(a3, a4);
        boolean f2 = o0Var3.mo35111f();
        int[] iArr = o0Var3.f30783g;
        if (!f2) {
            C13898n0.m43313d(iArr, a2);
            iArr = a2;
        }
        C13898n0.m43314d(o0Var2.f30783g, iArr, a);
        C13898n0.m43306a(o0Var2.f30783g, iArr, a2);
        C13898n0.m43312c(a2, a, a2);
        C13898n0.m43302a(C13969m.m44019b(12, a2, a2, a2), a2);
        C13898n0.m43312c(a3, o0Var2.f30783g, a3);
        C13898n0.m43302a(C13969m.m44025c(12, a3, 2, 0), a3);
        C13898n0.m43302a(C13969m.m44000a(12, a4, 3, 0, a), a);
        C13902o0 o0Var4 = new C13902o0(a4);
        C13898n0.m43313d(a2, o0Var4.f30783g);
        int[] iArr2 = o0Var4.f30783g;
        C13898n0.m43314d(iArr2, a3, iArr2);
        int[] iArr3 = o0Var4.f30783g;
        C13898n0.m43314d(iArr3, a3, iArr3);
        C13902o0 o0Var5 = new C13902o0(a3);
        C13898n0.m43314d(a3, o0Var4.f30783g, o0Var5.f30783g);
        int[] iArr4 = o0Var5.f30783g;
        C13898n0.m43312c(iArr4, a2, iArr4);
        int[] iArr5 = o0Var5.f30783g;
        C13898n0.m43314d(iArr5, a, iArr5);
        C13902o0 o0Var6 = new C13902o0(a2);
        C13898n0.m43315e(o0Var.f30783g, o0Var6.f30783g);
        if (!f2) {
            int[] iArr6 = o0Var6.f30783g;
            C13898n0.m43312c(iArr6, o0Var3.f30783g, iArr6);
        }
        C13906p0 p0Var = new C13906p0(f, o0Var4, o0Var5, new C13812e[]{o0Var6}, this.f30672e);
        return p0Var;
    }

    public C13906p0(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13906p0(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
