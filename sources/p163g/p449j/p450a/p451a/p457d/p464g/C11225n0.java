package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;
import p163g.p449j.p450a.p451a.p457d.p464g.C11339v0.C11340a;

/* renamed from: g.j.a.a.d.g.n0 */
public final class C11225n0 extends C11090e4<C11225n0, C11226a> implements C11288r5 {
    private static volatile C11373x5<C11225n0> zzuo;
    /* access modifiers changed from: private */
    public static final C11225n0 zzwf = new C11225n0();
    private int zzue;
    private int zzwb;
    private C11339v0 zzwc;
    private C11339v0 zzwd;
    private boolean zzwe;

    /* renamed from: g.j.a.a.d.g.n0$a */
    public static final class C11226a extends C11091a<C11225n0, C11226a> implements C11288r5 {
        private C11226a() {
            super(C11225n0.zzwf);
        }

        /* renamed from: a */
        public final C11226a mo28721a(int i) {
            mo28442f();
            ((C11225n0) this.f26158U).m35755b(i);
            return this;
        }

        /* renamed from: i */
        public final C11339v0 mo28725i() {
            return ((C11225n0) this.f26158U).mo28714n();
        }

        /* renamed from: j */
        public final boolean mo28726j() {
            return ((C11225n0) this.f26158U).mo28715o();
        }

        /* renamed from: k */
        public final C11339v0 mo28727k() {
            return ((C11225n0) this.f26158U).mo28716p();
        }

        /* synthetic */ C11226a(C11212m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public final C11226a mo28722a(C11340a aVar) {
            mo28442f();
            ((C11225n0) this.f26158U).m35752a(aVar);
            return this;
        }

        /* renamed from: a */
        public final C11226a mo28723a(C11339v0 v0Var) {
            mo28442f();
            ((C11225n0) this.f26158U).m35753a(v0Var);
            return this;
        }

        /* renamed from: a */
        public final C11226a mo28724a(boolean z) {
            mo28442f();
            ((C11225n0) this.f26158U).m35754a(z);
            return this;
        }
    }

    static {
        C11090e4.m35024a(C11225n0.class, zzwf);
    }

    private C11225n0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35752a(C11340a aVar) {
        this.zzwc = (C11339v0) aVar.mo28446l0();
        this.zzue |= 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m35755b(int i) {
        this.zzue |= 1;
        this.zzwb = i;
    }

    /* renamed from: u */
    public static C11226a m35756u() {
        return (C11226a) zzwf.mo28434i();
    }

    /* renamed from: n */
    public final C11339v0 mo28714n() {
        C11339v0 v0Var = this.zzwc;
        return v0Var == null ? C11339v0.m36483A() : v0Var;
    }

    /* renamed from: o */
    public final boolean mo28715o() {
        return (this.zzue & 4) != 0;
    }

    /* renamed from: p */
    public final C11339v0 mo28716p() {
        C11339v0 v0Var = this.zzwd;
        return v0Var == null ? C11339v0.m36483A() : v0Var;
    }

    /* renamed from: q */
    public final boolean mo28717q() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: r */
    public final int mo28718r() {
        return this.zzwb;
    }

    /* renamed from: s */
    public final boolean mo28719s() {
        return (this.zzue & 8) != 0;
    }

    /* renamed from: t */
    public final boolean mo28720t() {
        return this.zzwe;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35753a(C11339v0 v0Var) {
        if (v0Var != null) {
            this.zzwd = v0Var;
            this.zzue |= 4;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35754a(boolean z) {
        this.zzue |= 8;
        this.zzwe = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11225n0();
            case 2:
                return new C11226a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzwf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzue", "zzwb", "zzwc", "zzwd", "zzwe"});
            case 4:
                return zzwf;
            case 5:
                C11373x5<C11225n0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11225n0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzwf);
                            zzuo = x5Var;
                        }
                    }
                }
                return x5Var;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
