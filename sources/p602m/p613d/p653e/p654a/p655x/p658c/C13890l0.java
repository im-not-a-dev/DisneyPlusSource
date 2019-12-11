package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.l0 */
/* compiled from: SecP256R1Point */
public class C13890l0 extends C13818b {
    public C13890l0(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13886k0 k0Var = (C13886k0) this.f30669b;
        C13886k0 k0Var2 = (C13886k0) this.f30670c;
        C13886k0 k0Var3 = (C13886k0) gVar.mo35155l();
        C13886k0 k0Var4 = (C13886k0) gVar.mo35156m();
        C13886k0 k0Var5 = (C13886k0) this.f30671d[0];
        C13886k0 k0Var6 = (C13886k0) gVar.mo35130a(0);
        int[] c = C13963g.m43961c();
        int[] a = C13963g.m43945a();
        int[] a2 = C13963g.m43945a();
        int[] a3 = C13963g.m43945a();
        boolean f2 = k0Var5.mo35111f();
        if (f2) {
            iArr2 = k0Var3.f30765g;
            iArr = k0Var4.f30765g;
        } else {
            C13882j0.m43151d(k0Var5.f30765g, a2);
            C13882j0.m43148b(a2, k0Var3.f30765g, a);
            C13882j0.m43148b(a2, k0Var5.f30765g, a2);
            C13882j0.m43148b(a2, k0Var4.f30765g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = k0Var6.mo35111f();
        if (f3) {
            iArr4 = k0Var.f30765g;
            iArr3 = k0Var2.f30765g;
        } else {
            C13882j0.m43151d(k0Var6.f30765g, a3);
            C13882j0.m43148b(a3, k0Var.f30765g, c);
            C13882j0.m43148b(a3, k0Var6.f30765g, a3);
            C13882j0.m43148b(a3, k0Var2.f30765g, a3);
            iArr4 = c;
            iArr3 = a3;
        }
        int[] a4 = C13963g.m43945a();
        C13882j0.m43152d(iArr4, iArr2, a4);
        C13882j0.m43152d(iArr3, iArr, a);
        if (!C13963g.m43949b(a4)) {
            C13882j0.m43151d(a4, a2);
            int[] a5 = C13963g.m43945a();
            C13882j0.m43148b(a2, a4, a5);
            C13882j0.m43148b(a2, iArr4, a2);
            C13882j0.m43147b(a5, a5);
            C13963g.m43959c(iArr3, a5, c);
            C13882j0.m43140a(C13963g.m43947b(a2, a2, a5), a5);
            C13886k0 k0Var7 = new C13886k0(a3);
            C13882j0.m43151d(a, k0Var7.f30765g);
            int[] iArr5 = k0Var7.f30765g;
            C13882j0.m43152d(iArr5, a5, iArr5);
            C13886k0 k0Var8 = new C13886k0(a5);
            C13882j0.m43152d(a2, k0Var7.f30765g, k0Var8.f30765g);
            C13882j0.m43150c(k0Var8.f30765g, a, c);
            C13882j0.m43149c(c, k0Var8.f30765g);
            C13886k0 k0Var9 = new C13886k0(a4);
            if (!f2) {
                int[] iArr6 = k0Var9.f30765g;
                C13882j0.m43148b(iArr6, k0Var5.f30765g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = k0Var9.f30765g;
                C13882j0.m43148b(iArr7, k0Var6.f30765g, iArr7);
            }
            C13890l0 l0Var = new C13890l0(f, k0Var7, k0Var8, new C13812e[]{k0Var9}, this.f30672e);
            return l0Var;
        } else if (C13963g.m43949b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13890l0(null, mo35141c(), mo35144d());
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
        C13890l0 l0Var = new C13890l0(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return l0Var;
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
        C13886k0 k0Var = (C13886k0) this.f30670c;
        if (k0Var.mo35112g()) {
            return f.mo35091k();
        }
        C13886k0 k0Var2 = (C13886k0) this.f30669b;
        C13886k0 k0Var3 = (C13886k0) this.f30671d[0];
        int[] a = C13963g.m43945a();
        int[] a2 = C13963g.m43945a();
        int[] a3 = C13963g.m43945a();
        C13882j0.m43151d(k0Var.f30765g, a3);
        int[] a4 = C13963g.m43945a();
        C13882j0.m43151d(a3, a4);
        boolean f2 = k0Var3.mo35111f();
        int[] iArr = k0Var3.f30765g;
        if (!f2) {
            C13882j0.m43151d(iArr, a2);
            iArr = a2;
        }
        C13882j0.m43152d(k0Var2.f30765g, iArr, a);
        C13882j0.m43144a(k0Var2.f30765g, iArr, a2);
        C13882j0.m43148b(a2, a, a2);
        C13882j0.m43140a(C13963g.m43947b(a2, a2, a2), a2);
        C13882j0.m43148b(a3, k0Var2.f30765g, a3);
        C13882j0.m43140a(C13969m.m44025c(8, a3, 2, 0), a3);
        C13882j0.m43140a(C13969m.m44000a(8, a4, 3, 0, a), a);
        C13886k0 k0Var4 = new C13886k0(a4);
        C13882j0.m43151d(a2, k0Var4.f30765g);
        int[] iArr2 = k0Var4.f30765g;
        C13882j0.m43152d(iArr2, a3, iArr2);
        int[] iArr3 = k0Var4.f30765g;
        C13882j0.m43152d(iArr3, a3, iArr3);
        C13886k0 k0Var5 = new C13886k0(a3);
        C13882j0.m43152d(a3, k0Var4.f30765g, k0Var5.f30765g);
        int[] iArr4 = k0Var5.f30765g;
        C13882j0.m43148b(iArr4, a2, iArr4);
        int[] iArr5 = k0Var5.f30765g;
        C13882j0.m43152d(iArr5, a, iArr5);
        C13886k0 k0Var6 = new C13886k0(a2);
        C13882j0.m43153e(k0Var.f30765g, k0Var6.f30765g);
        if (!f2) {
            int[] iArr6 = k0Var6.f30765g;
            C13882j0.m43148b(iArr6, k0Var3.f30765g, iArr6);
        }
        C13886k0 k0Var7 = k0Var4;
        C13886k0 k0Var8 = k0Var5;
        C13890l0 l0Var = new C13890l0(f, k0Var7, k0Var8, new C13812e[]{k0Var6}, this.f30672e);
        return l0Var;
    }

    public C13890l0(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13890l0(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
