package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.t0 */
/* compiled from: SecP521R1Point */
public class C13922t0 extends C13818b {
    public C13922t0(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13918s0 s0Var = (C13918s0) this.f30669b;
        C13918s0 s0Var2 = (C13918s0) this.f30670c;
        C13918s0 s0Var3 = (C13918s0) gVar.mo35155l();
        C13918s0 s0Var4 = (C13918s0) gVar.mo35156m();
        C13918s0 s0Var5 = (C13918s0) this.f30671d[0];
        C13918s0 s0Var6 = (C13918s0) gVar2.mo35130a(0);
        int[] a = C13969m.m44011a(17);
        int[] a2 = C13969m.m44011a(17);
        int[] a3 = C13969m.m44011a(17);
        int[] a4 = C13969m.m44011a(17);
        boolean f2 = s0Var5.mo35111f();
        if (f2) {
            iArr2 = s0Var3.f30800g;
            iArr = s0Var4.f30800g;
        } else {
            C13914r0.m43488e(s0Var5.f30800g, a3);
            C13914r0.m43485c(a3, s0Var3.f30800g, a2);
            C13914r0.m43485c(a3, s0Var5.f30800g, a3);
            C13914r0.m43485c(a3, s0Var4.f30800g, a3);
            iArr2 = a2;
            iArr = a3;
        }
        boolean f3 = s0Var6.mo35111f();
        if (f3) {
            iArr4 = s0Var.f30800g;
            iArr3 = s0Var2.f30800g;
        } else {
            C13914r0.m43488e(s0Var6.f30800g, a4);
            C13914r0.m43485c(a4, s0Var.f30800g, a);
            C13914r0.m43485c(a4, s0Var6.f30800g, a4);
            C13914r0.m43485c(a4, s0Var2.f30800g, a4);
            iArr4 = a;
            iArr3 = a4;
        }
        int[] a5 = C13969m.m44011a(17);
        C13914r0.m43487d(iArr4, iArr2, a5);
        C13914r0.m43487d(iArr3, iArr, a2);
        if (!C13969m.m44033e(17, a5)) {
            C13914r0.m43488e(a5, a3);
            int[] a6 = C13969m.m44011a(17);
            C13914r0.m43485c(a3, a5, a6);
            C13914r0.m43485c(a3, iArr4, a3);
            C13914r0.m43485c(iArr3, a6, a);
            C13918s0 s0Var7 = new C13918s0(a4);
            C13914r0.m43488e(a2, s0Var7.f30800g);
            int[] iArr5 = s0Var7.f30800g;
            C13914r0.m43480a(iArr5, a6, iArr5);
            int[] iArr6 = s0Var7.f30800g;
            C13914r0.m43487d(iArr6, a3, iArr6);
            int[] iArr7 = s0Var7.f30800g;
            C13914r0.m43487d(iArr7, a3, iArr7);
            C13918s0 s0Var8 = new C13918s0(a6);
            C13914r0.m43487d(a3, s0Var7.f30800g, s0Var8.f30800g);
            C13914r0.m43485c(s0Var8.f30800g, a2, a2);
            C13914r0.m43487d(a2, a, s0Var8.f30800g);
            C13918s0 s0Var9 = new C13918s0(a5);
            if (!f2) {
                int[] iArr8 = s0Var9.f30800g;
                C13914r0.m43485c(iArr8, s0Var5.f30800g, iArr8);
            }
            if (!f3) {
                int[] iArr9 = s0Var9.f30800g;
                C13914r0.m43485c(iArr9, s0Var6.f30800g, iArr9);
            }
            C13922t0 t0Var = new C13922t0(f, s0Var7, s0Var8, new C13812e[]{s0Var9}, this.f30672e);
            return t0Var;
        } else if (C13969m.m44033e(17, a2)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13922t0(null, mo35141c(), mo35144d());
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
        C13922t0 t0Var = new C13922t0(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return t0Var;
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
        C13918s0 s0Var = (C13918s0) this.f30670c;
        if (s0Var.mo35112g()) {
            return f.mo35091k();
        }
        C13918s0 s0Var2 = (C13918s0) this.f30669b;
        C13918s0 s0Var3 = (C13918s0) this.f30671d[0];
        int[] a = C13969m.m44011a(17);
        int[] a2 = C13969m.m44011a(17);
        int[] a3 = C13969m.m44011a(17);
        C13914r0.m43488e(s0Var.f30800g, a3);
        int[] a4 = C13969m.m44011a(17);
        C13914r0.m43488e(a3, a4);
        boolean f2 = s0Var3.mo35111f();
        int[] iArr = s0Var3.f30800g;
        if (!f2) {
            C13914r0.m43488e(iArr, a2);
            iArr = a2;
        }
        C13914r0.m43487d(s0Var2.f30800g, iArr, a);
        C13914r0.m43480a(s0Var2.f30800g, iArr, a2);
        C13914r0.m43485c(a2, a, a2);
        C13969m.m44019b(17, a2, a2, a2);
        C13914r0.m43477a(a2);
        C13914r0.m43485c(a3, s0Var2.f30800g, a3);
        C13969m.m44025c(17, a3, 2, 0);
        C13914r0.m43477a(a3);
        C13969m.m44000a(17, a4, 3, 0, a);
        C13914r0.m43477a(a);
        C13918s0 s0Var4 = new C13918s0(a4);
        C13914r0.m43488e(a2, s0Var4.f30800g);
        int[] iArr2 = s0Var4.f30800g;
        C13914r0.m43487d(iArr2, a3, iArr2);
        int[] iArr3 = s0Var4.f30800g;
        C13914r0.m43487d(iArr3, a3, iArr3);
        C13918s0 s0Var5 = new C13918s0(a3);
        C13914r0.m43487d(a3, s0Var4.f30800g, s0Var5.f30800g);
        int[] iArr4 = s0Var5.f30800g;
        C13914r0.m43485c(iArr4, a2, iArr4);
        int[] iArr5 = s0Var5.f30800g;
        C13914r0.m43487d(iArr5, a, iArr5);
        C13918s0 s0Var6 = new C13918s0(a2);
        C13914r0.m43489f(s0Var.f30800g, s0Var6.f30800g);
        if (!f2) {
            int[] iArr6 = s0Var6.f30800g;
            C13914r0.m43485c(iArr6, s0Var3.f30800g, iArr6);
        }
        C13922t0 t0Var = new C13922t0(f, s0Var4, s0Var5, new C13812e[]{s0Var6}, this.f30672e);
        return t0Var;
    }

    public C13922t0(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13922t0(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
