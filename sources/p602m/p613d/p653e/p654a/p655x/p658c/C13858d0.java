package p602m.p613d.p653e.p654a.p655x.p658c;

import p602m.p613d.p653e.p654a.C13806d;
import p602m.p613d.p653e.p654a.C13812e;
import p602m.p613d.p653e.p654a.C13816g;
import p602m.p613d.p653e.p654a.C13816g.C13818b;
import p602m.p613d.p653e.p661c.C13962f;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.d0 */
/* compiled from: SecP224R1Point */
public class C13858d0 extends C13818b {
    public C13858d0(C13806d dVar, C13812e eVar, C13812e eVar2) {
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
        C13854c0 c0Var = (C13854c0) this.f30669b;
        C13854c0 c0Var2 = (C13854c0) this.f30670c;
        C13854c0 c0Var3 = (C13854c0) gVar.mo35155l();
        C13854c0 c0Var4 = (C13854c0) gVar.mo35156m();
        C13854c0 c0Var5 = (C13854c0) this.f30671d[0];
        C13854c0 c0Var6 = (C13854c0) gVar.mo35130a(0);
        int[] b = C13962f.m43923b();
        int[] a = C13962f.m43918a();
        int[] a2 = C13962f.m43918a();
        int[] a3 = C13962f.m43918a();
        boolean f2 = c0Var5.mo35111f();
        if (f2) {
            iArr2 = c0Var3.f30731g;
            iArr = c0Var4.f30731g;
        } else {
            C13850b0.m42808d(c0Var5.f30731g, a2);
            C13850b0.m42805b(a2, c0Var3.f30731g, a);
            C13850b0.m42805b(a2, c0Var5.f30731g, a2);
            C13850b0.m42805b(a2, c0Var4.f30731g, a2);
            iArr2 = a;
            iArr = a2;
        }
        boolean f3 = c0Var6.mo35111f();
        if (f3) {
            iArr4 = c0Var.f30731g;
            iArr3 = c0Var2.f30731g;
        } else {
            C13850b0.m42808d(c0Var6.f30731g, a3);
            C13850b0.m42805b(a3, c0Var.f30731g, b);
            C13850b0.m42805b(a3, c0Var6.f30731g, a3);
            C13850b0.m42805b(a3, c0Var2.f30731g, a3);
            iArr4 = b;
            iArr3 = a3;
        }
        int[] a4 = C13962f.m43918a();
        C13850b0.m42809d(iArr4, iArr2, a4);
        C13850b0.m42809d(iArr3, iArr, a);
        if (!C13962f.m43921b(a4)) {
            C13850b0.m42808d(a4, a2);
            int[] a5 = C13962f.m43918a();
            C13850b0.m42805b(a2, a4, a5);
            C13850b0.m42805b(a2, iArr4, a2);
            C13850b0.m42804b(a5, a5);
            C13962f.m43925c(iArr3, a5, b);
            C13850b0.m42797a(C13962f.m43920b(a2, a2, a5), a5);
            C13854c0 c0Var7 = new C13854c0(a3);
            C13850b0.m42808d(a, c0Var7.f30731g);
            int[] iArr5 = c0Var7.f30731g;
            C13850b0.m42809d(iArr5, a5, iArr5);
            C13854c0 c0Var8 = new C13854c0(a5);
            C13850b0.m42809d(a2, c0Var7.f30731g, c0Var8.f30731g);
            C13850b0.m42807c(c0Var8.f30731g, a, b);
            C13850b0.m42806c(b, c0Var8.f30731g);
            C13854c0 c0Var9 = new C13854c0(a4);
            if (!f2) {
                int[] iArr6 = c0Var9.f30731g;
                C13850b0.m42805b(iArr6, c0Var5.f30731g, iArr6);
            }
            if (!f3) {
                int[] iArr7 = c0Var9.f30731g;
                C13850b0.m42805b(iArr7, c0Var6.f30731g, iArr7);
            }
            C13858d0 d0Var = new C13858d0(f, c0Var7, c0Var8, new C13812e[]{c0Var9}, this.f30672e);
            return d0Var;
        } else if (C13962f.m43921b(a)) {
            return mo35166v();
        } else {
            return f.mo35091k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13816g mo35137b() {
        return new C13858d0(null, mo35141c(), mo35144d());
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
        C13858d0 d0Var = new C13858d0(this.f30668a, this.f30669b, this.f30670c.mo35113h(), this.f30671d, this.f30672e);
        return d0Var;
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
        C13854c0 c0Var = (C13854c0) this.f30670c;
        if (c0Var.mo35112g()) {
            return f.mo35091k();
        }
        C13854c0 c0Var2 = (C13854c0) this.f30669b;
        C13854c0 c0Var3 = (C13854c0) this.f30671d[0];
        int[] a = C13962f.m43918a();
        int[] a2 = C13962f.m43918a();
        int[] a3 = C13962f.m43918a();
        C13850b0.m42808d(c0Var.f30731g, a3);
        int[] a4 = C13962f.m43918a();
        C13850b0.m42808d(a3, a4);
        boolean f2 = c0Var3.mo35111f();
        int[] iArr = c0Var3.f30731g;
        if (!f2) {
            C13850b0.m42808d(iArr, a2);
            iArr = a2;
        }
        C13850b0.m42809d(c0Var2.f30731g, iArr, a);
        C13850b0.m42801a(c0Var2.f30731g, iArr, a2);
        C13850b0.m42805b(a2, a, a2);
        C13850b0.m42797a(C13962f.m43920b(a2, a2, a2), a2);
        C13850b0.m42805b(a3, c0Var2.f30731g, a3);
        C13850b0.m42797a(C13969m.m44025c(7, a3, 2, 0), a3);
        C13850b0.m42797a(C13969m.m44000a(7, a4, 3, 0, a), a);
        C13854c0 c0Var4 = new C13854c0(a4);
        C13850b0.m42808d(a2, c0Var4.f30731g);
        int[] iArr2 = c0Var4.f30731g;
        C13850b0.m42809d(iArr2, a3, iArr2);
        int[] iArr3 = c0Var4.f30731g;
        C13850b0.m42809d(iArr3, a3, iArr3);
        C13854c0 c0Var5 = new C13854c0(a3);
        C13850b0.m42809d(a3, c0Var4.f30731g, c0Var5.f30731g);
        int[] iArr4 = c0Var5.f30731g;
        C13850b0.m42805b(iArr4, a2, iArr4);
        int[] iArr5 = c0Var5.f30731g;
        C13850b0.m42809d(iArr5, a, iArr5);
        C13854c0 c0Var6 = new C13854c0(a2);
        C13850b0.m42810e(c0Var.f30731g, c0Var6.f30731g);
        if (!f2) {
            int[] iArr6 = c0Var6.f30731g;
            C13850b0.m42805b(iArr6, c0Var3.f30731g, iArr6);
        }
        C13854c0 c0Var7 = c0Var4;
        C13854c0 c0Var8 = c0Var5;
        C13858d0 d0Var = new C13858d0(f, c0Var7, c0Var8, new C13812e[]{c0Var6}, this.f30672e);
        return d0Var;
    }

    public C13858d0(C13806d dVar, C13812e eVar, C13812e eVar2, boolean z) {
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

    C13858d0(C13806d dVar, C13812e eVar, C13812e eVar2, C13812e[] eVarArr, boolean z) {
        super(dVar, eVar, eVar2, eVarArr);
        this.f30672e = z;
    }
}
