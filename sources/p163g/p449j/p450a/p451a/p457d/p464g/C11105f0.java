package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.f0 */
public final class C11105f0 extends C11090e4<C11105f0, C11107b> implements C11288r5 {
    private static volatile C11373x5<C11105f0> zzuo;
    /* access modifiers changed from: private */
    public static final C11105f0 zzvp = new C11105f0();
    private int zzue;
    private int zzvl;
    private String zzvm = "";
    private boolean zzvn;
    private C11216m4<String> zzvo = C11090e4.m35028m();

    /* renamed from: g.j.a.a.d.g.f0$a */
    public enum C11106a implements C11167j4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: c */
        private final int f26188c;

        static {
            new C11163j0();
        }

        private C11106a(int i) {
            this.f26188c = i;
        }

        /* renamed from: a */
        public static C11106a m35123a(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        /* renamed from: a0 */
        public final int mo28380a0() {
            return this.f26188c;
        }

        /* renamed from: a */
        public static C11203l4 m35124a() {
            return C11149i0.f26242a;
        }
    }

    /* renamed from: g.j.a.a.d.g.f0$b */
    public static final class C11107b extends C11091a<C11105f0, C11107b> implements C11288r5 {
        private C11107b() {
            super(C11105f0.zzvp);
        }

        /* synthetic */ C11107b(C11021a0 a0Var) {
            this();
        }
    }

    static {
        C11090e4.m35024a(C11105f0.class, zzvp);
    }

    private C11105f0() {
    }

    /* renamed from: v */
    public static C11105f0 m35112v() {
        return zzvp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11021a0.f26040a[i - 1]) {
            case 1:
                return new C11105f0();
            case 2:
                return new C11107b(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzvp, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzue", "zzvl", C11106a.m35124a(), "zzvm", "zzvn", "zzvo"});
            case 4:
                return zzvp;
            case 5:
                C11373x5<C11105f0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11105f0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzvp);
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
    public final boolean mo28497n() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: o */
    public final C11106a mo28498o() {
        C11106a a = C11106a.m35123a(this.zzvl);
        return a == null ? C11106a.UNKNOWN_MATCH_TYPE : a;
    }

    /* renamed from: p */
    public final boolean mo28499p() {
        return (this.zzue & 2) != 0;
    }

    /* renamed from: q */
    public final String mo28500q() {
        return this.zzvm;
    }

    /* renamed from: r */
    public final boolean mo28501r() {
        return (this.zzue & 4) != 0;
    }

    /* renamed from: s */
    public final boolean mo28502s() {
        return this.zzvn;
    }

    /* renamed from: t */
    public final List<String> mo28503t() {
        return this.zzvo;
    }

    /* renamed from: u */
    public final int mo28504u() {
        return this.zzvo.size();
    }
}
