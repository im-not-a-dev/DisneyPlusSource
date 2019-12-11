package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.c0 */
public final class C11050c0 extends C11090e4<C11050c0, C11051a> implements C11288r5 {
    private static volatile C11373x5<C11050c0> zzuo;
    /* access modifiers changed from: private */
    public static final C11050c0 zzut = new C11050c0();
    private int zzue;
    private C11105f0 zzup;
    private C11069d0 zzuq;
    private boolean zzur;
    private String zzus = "";

    /* renamed from: g.j.a.a.d.g.c0$a */
    public static final class C11051a extends C11091a<C11050c0, C11051a> implements C11288r5 {
        private C11051a() {
            super(C11050c0.zzut);
        }

        /* renamed from: a */
        public final C11051a mo28339a(String str) {
            mo28442f();
            ((C11050c0) this.f26158U).m34819a(str);
            return this;
        }

        /* synthetic */ C11051a(C11021a0 a0Var) {
            this();
        }
    }

    static {
        C11090e4.m35024a(C11050c0.class, zzut);
    }

    private C11050c0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m34819a(String str) {
        if (str != null) {
            this.zzue |= 8;
            this.zzus = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: u */
    public static C11050c0 m34820u() {
        return zzut;
    }

    /* renamed from: n */
    public final boolean mo28332n() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: o */
    public final C11105f0 mo28333o() {
        C11105f0 f0Var = this.zzup;
        return f0Var == null ? C11105f0.m35112v() : f0Var;
    }

    /* renamed from: p */
    public final boolean mo28334p() {
        return (this.zzue & 2) != 0;
    }

    /* renamed from: q */
    public final C11069d0 mo28335q() {
        C11069d0 d0Var = this.zzuq;
        return d0Var == null ? C11069d0.m34942x() : d0Var;
    }

    /* renamed from: r */
    public final boolean mo28336r() {
        return (this.zzue & 4) != 0;
    }

    /* renamed from: s */
    public final boolean mo28337s() {
        return this.zzur;
    }

    /* renamed from: t */
    public final String mo28338t() {
        return this.zzus;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11021a0.f26040a[i - 1]) {
            case 1:
                return new C11050c0();
            case 2:
                return new C11051a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzut, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzue", "zzup", "zzuq", "zzur", "zzus"});
            case 4:
                return zzut;
            case 5:
                C11373x5<C11050c0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11050c0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzut);
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
