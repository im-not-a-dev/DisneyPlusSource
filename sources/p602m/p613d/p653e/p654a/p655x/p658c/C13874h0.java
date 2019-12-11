package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.h0 */
/* compiled from: SecP256K1Point */
public class C13874h0 extends C13818b {
    public C13874h0(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13870g0 g0Var = (C13870g0) this.f30669b;
        C13870g0 g0Var2 = (C13870g0) this.f30670c;
        C13870g0 g0Var3 = (C13870g0) gVar.mo35155l();
        C13870g0 g0Var4 = (C13870g0) gVar.mo35156m();
        C13870g0 g0Var5 = (C13870g0) this.f30671d[0];
        C13870g0 g0Var6 = (C13870g0) gVar.mo35130a(0);
        int[] c = C13963g.m43961c();
        int[] a = C13963g.m43945a();
        int[] a2 = C13963g.m43945a();
        int[] a3 = C13963g.m43945a();
        boolean f2 = g0Var5.mo35111f();
        if (f2) {
            iArr2 = g0Var3.f30747g;
            iArr = g0Var4.f30747g;
        } else {
            C13866f0.m42978d(g0Var5.f30747g, a2);
            C13866f0.m42975b(a2, g0Var3.f30747g, a);
            C13866f0.m42975b(a2, g0Var5.f30747g, a2);
            C13866f0.m42975b(a2, g0Var4.f30747g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = g0Var6.mo35111f();
        if (f3) {
            iArr4 = g0Var.f30747g;
            iArr3 = g0Var2.f30747g;
        } else {
            C13866f0.m42978d(g0Var6.f30747g, a3);
            C13866f0.m42975b(a3, g0Var.f30747g, c);
            C13866f0.m42975b(a3, g0Var6.f30747g, a3);
            C13866f0.m42975b(a3, g0Var2.f30747g, a3);
            iArr4 = c;
            iArr3 = a3;
        }
        int[] a4 = C13963g.m43945a();
        C13866f0.m42979d(iArr4, iArr2, a4);
        C13866f0.m42979d(iArr3, iArr, a);
        if (!C13963g.m43949b(a4)) {
            C13866f0.m42978d(a4, a2);
            int[] a5 = C13963g.m43945a();
            C13866f0.m42975b(a2, a4, a5);
            C13866f0.m42975b(a2, iArr4, a2);
            C13866f0.m42974b(a5, a5);
            C13963g.m43959c(iArr3, a5, c);
            C13866f0.m42969a(C13963g.m43947b(a2, a2, a5), a5);
            C13870g0 g0Var7 = new C13870g0(a3);
            C13866f0.m42978d(a, g0Var7.f30747g);
            int[] iArr5 = g0Var7.f30747g;
            C13866f0.m42979d(iArr5, a5, iArr5);
            C13870g0 g0Var8 = new C13870g0(a5);
            C13866f0.m42979d(a2, g0Var7.f30747g, g0Var8.f30747g);
            C13866f0.m42977c(g0Var8.f30747g, a, c);
            C13866f0.m42976c(c, g0Var8.f30747g);
            C13870g0 g0Var9 = new C13870g0(a4);
            if (!f2) {
                int[] iArr6 = g0Var9.f30747g;
                C13866f0.m42975b(iArr6, g0Var5.f30747g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = g0Var9.f30747g;
                C13866f0.m42975b(iArr7, g0Var6.f30747g, iArr7);
            }
            C13874h0 h0Var = new C13874h0(f, g0Var7, g0Var8, new C13812e[]{g0Var9}, this.f30672e);
            return h0Var;
        } else if (C13963g.m43949b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13874h0(null, mo35141c(), mo35144d());
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
        C13874h0 h0Var = new C13874h0(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return h0Var;
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
        C13870g0 g0Var = (C13870g0) this.f30670c;
        if (g0Var.mo35112g()) {
            return f.mo35091k();
        }
        C13870g0 g0Var2 = (C13870g0) this.f30669b;
        C13870g0 g0Var3 = (C13870g0) this.f30671d[0];
        int[] a = C13963g.m43945a();
        C13866f0.m42978d(g0Var.f30747g, a);
        int[] a2 = C13963g.m43945a();
        C13866f0.m42978d(a, a2);
        int[] a3 = C13963g.m43945a();
        C13866f0.m42978d(g0Var2.f30747g, a3);
        C13866f0.m42969a(C13963g.m43947b(a3, a3, a3), a3);
        C13866f0.m42975b(a, g0Var2.f30747g, a);
        C13866f0.m42969a(C13969m.m44025c(8, a, 2, 0), a);
        int[] a4 = C13963g.m43945a();
        C13866f0.m42969a(C13969m.m44000a(8, a2, 3, 0, a4), a4);
        C13870g0 g0Var4 = new C13870g0(a2);
        C13866f0.m42978d(a3, g0Var4.f30747g);
        int[] iArr = g0Var4.f30747g;
        C13866f0.m42979d(iArr, a, iArr);
        int[] iArr2 = g0Var4.f30747g;
        C13866f0.m42979d(iArr2, a, iArr2);
        C13870g0 g0Var5 = new C13870g0(a);
        C13866f0.m42979d(a, g0Var4.f30747g, g0Var5.f30747g);
        int[] iArr3 = g0Var5.f30747g;
        C13866f0.m42975b(iArr3, a3, iArr3);
        int[] iArr4 = g0Var5.f30747g;
        C13866f0.m42979d(iArr4, a4, iArr4);
        C13870g0 g0Var6 = new C13870g0(a3);
        C13866f0.m42980e(g0Var.f30747g, g0Var6.f30747g);
        if (!g0Var3.mo35111f()) {
            int[] iArr5 = g0Var6.f30747g;
            C13866f0.m42975b(iArr5, g0Var3.f30747g, iArr5);
        }
        C13874h0 h0Var = new C13874h0(f, g0Var4, g0Var5, new C13812e[]{g0Var6}, this.f30672e);
        return h0Var;
    }

    public C13874h0(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13874h0(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
