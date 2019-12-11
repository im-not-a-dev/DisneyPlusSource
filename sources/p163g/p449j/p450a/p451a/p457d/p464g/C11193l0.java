package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;

/* renamed from: g.j.a.a.d.g.l0 */
public final class C11193l0 extends C11090e4<C11193l0, C11194a> implements C11288r5 {
    private static volatile C11373x5<C11193l0> zzuo;
    /* access modifiers changed from: private */
    public static final C11193l0 zzwa = new C11193l0();
    private int zzue;
    private String zzvy;
    private String zzvz;

    /* renamed from: g.j.a.a.d.g.l0$a */
    public static final class C11194a extends C11091a<C11193l0, C11194a> implements C11288r5 {
        private C11194a() {
            super(C11193l0.zzwa);
        }

        /* synthetic */ C11194a(C11177k0 k0Var) {
            this();
        }
    }

    static {
        C11090e4.m35024a(C11193l0.class, zzwa);
    }

    private C11193l0() {
        String str = "";
        this.zzvy = str;
        this.zzvz = str;
    }

    /* renamed from: p */
    public static C11373x5<C11193l0> m35529p() {
        return (C11373x5) zzwa.mo28293a(C11094d.f26168g, null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11177k0.f26290a[i - 1]) {
            case 1:
                return new C11193l0();
            case 2:
                return new C11194a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzwa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzue", "zzvy", "zzvz"});
            case 4:
                return zzwa;
            case 5:
                C11373x5<C11193l0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11193l0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzwa);
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

    /* renamed from: n */
    public final String mo28653n() {
        return this.zzvy;
    }

    /* renamed from: o */
    public final String mo28654o() {
        return this.zzvz;
    }
}
