package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.d0 */
public final class C11069d0 extends C11090e4<C11069d0, C11070a> implements C11288r5 {
    private static volatile C11373x5<C11069d0> zzuo;
    /* access modifiers changed from: private */
    public static final C11069d0 zzuz = new C11069d0();
    private int zzue;
    private int zzuu;
    private boolean zzuv;
    private String zzuw;
    private String zzux;
    private String zzuy;

    /* renamed from: g.j.a.a.d.g.d0$a */
    public static final class C11070a extends C11091a<C11069d0, C11070a> implements C11288r5 {
        private C11070a() {
            super(C11069d0.zzuz);
        }

        /* synthetic */ C11070a(C11021a0 a0Var) {
            this();
        }
    }

    /* renamed from: g.j.a.a.d.g.d0$b */
    public enum C11071b implements C11167j4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: c */
        private final int f26131c;

        static {
            new C11121g0();
        }

        private C11071b(int i) {
            this.f26131c = i;
        }

        /* renamed from: a */
        public static C11071b m34955a(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        /* renamed from: a0 */
        public final int mo28380a0() {
            return this.f26131c;
        }

        /* renamed from: a */
        public static C11203l4 m34956a() {
            return C11135h0.f26226a;
        }
    }

    static {
        C11090e4.m35024a(C11069d0.class, zzuz);
    }

    private C11069d0() {
        String str = "";
        this.zzuw = str;
        this.zzux = str;
        this.zzuy = str;
    }

    /* renamed from: x */
    public static C11069d0 m34942x() {
        return zzuz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11021a0.f26040a[i - 1]) {
            case 1:
                return new C11069d0();
            case 2:
                return new C11070a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzuz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzue", "zzuu", C11071b.m34956a(), "zzuv", "zzuw", "zzux", "zzuy"});
            case 4:
                return zzuz;
            case 5:
                C11373x5<C11069d0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11069d0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzuz);
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
    public final boolean mo28370n() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: o */
    public final C11071b mo28371o() {
        C11071b a = C11071b.m34955a(this.zzuu);
        return a == null ? C11071b.UNKNOWN_COMPARISON_TYPE : a;
    }

    /* renamed from: p */
    public final boolean mo28372p() {
        return (this.zzue & 2) != 0;
    }

    /* renamed from: q */
    public final boolean mo28373q() {
        return this.zzuv;
    }

    /* renamed from: r */
    public final boolean mo28374r() {
        return (this.zzue & 4) != 0;
    }

    /* renamed from: s */
    public final String mo28375s() {
        return this.zzuw;
    }

    /* renamed from: t */
    public final boolean mo28376t() {
        return (this.zzue & 8) != 0;
    }

    /* renamed from: u */
    public final String mo28377u() {
        return this.zzux;
    }

    /* renamed from: v */
    public final boolean mo28378v() {
        return (this.zzue & 16) != 0;
    }

    /* renamed from: w */
    public final String mo28379w() {
        return this.zzuy;
    }
}
