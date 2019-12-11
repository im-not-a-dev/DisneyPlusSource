package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.u0 */
public final class C11324u0 extends C11090e4<C11324u0, C11325a> implements C11288r5 {
    private static volatile C11373x5<C11324u0> zzuo;
    /* access modifiers changed from: private */
    public static final C11324u0 zzyr = new C11324u0();
    private int zzue;
    private int zzyp = 1;
    private C11216m4<C11267q0> zzyq = C11090e4.m35028m();

    /* renamed from: g.j.a.a.d.g.u0$a */
    public static final class C11325a extends C11091a<C11324u0, C11325a> implements C11288r5 {
        private C11325a() {
            super(C11324u0.zzyr);
        }

        /* synthetic */ C11325a(C11212m0 m0Var) {
            this();
        }
    }

    /* renamed from: g.j.a.a.d.g.u0$b */
    public enum C11326b implements C11167j4 {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: c */
        private final int f26552c;

        static {
            new C11381y0();
        }

        private C11326b(int i) {
            this.f26552c = i;
        }

        /* renamed from: a */
        public static C11326b m36401a(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        /* renamed from: a0 */
        public final int mo28380a0() {
            return this.f26552c;
        }

        /* renamed from: a */
        public static C11203l4 m36400a() {
            return C11394z0.f26662a;
        }
    }

    static {
        C11090e4.m35024a(C11324u0.class, zzyr);
    }

    private C11324u0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11324u0();
            case 2:
                return new C11325a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzyr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzue", "zzyp", C11326b.m36400a(), "zzyq", C11267q0.class});
            case 4:
                return zzyr;
            case 5:
                C11373x5<C11324u0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11324u0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzyr);
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
