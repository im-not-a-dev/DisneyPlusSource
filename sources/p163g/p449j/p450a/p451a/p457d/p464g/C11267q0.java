package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.q0 */
public final class C11267q0 extends C11090e4<C11267q0, C11268a> implements C11288r5 {
    private static volatile C11373x5<C11267q0> zzuo;
    /* access modifiers changed from: private */
    public static final C11267q0 zzwq = new C11267q0();
    private int zzue;
    private String zzwk = "";
    private long zzwp;

    /* renamed from: g.j.a.a.d.g.q0$a */
    public static final class C11268a extends C11091a<C11267q0, C11268a> implements C11288r5 {
        private C11268a() {
            super(C11267q0.zzwq);
        }

        /* synthetic */ C11268a(C11212m0 m0Var) {
            this();
        }
    }

    static {
        C11090e4.m35024a(C11267q0.class, zzwq);
    }

    private C11267q0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11267q0();
            case 2:
                return new C11268a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzwq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzue", "zzwk", "zzwp"});
            case 4:
                return zzwq;
            case 5:
                C11373x5<C11267q0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11267q0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzwq);
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
