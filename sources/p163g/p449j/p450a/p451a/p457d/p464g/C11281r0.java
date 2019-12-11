package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.r0 */
public final class C11281r0 extends C11090e4<C11281r0, C11282a> implements C11288r5 {
    private static volatile C11373x5<C11281r0> zzuo;
    /* access modifiers changed from: private */
    public static final C11281r0 zzwu = new C11281r0();
    private int zzue;
    private String zzwk;
    private long zzwp;
    private String zzwr;
    private float zzws;
    private double zzwt;

    /* renamed from: g.j.a.a.d.g.r0$a */
    public static final class C11282a extends C11091a<C11281r0, C11282a> implements C11288r5 {
        private C11282a() {
            super(C11281r0.zzwu);
        }

        /* renamed from: a */
        public final C11282a mo28858a(String str) {
            mo28442f();
            ((C11281r0) this.f26158U).m35983a(str);
            return this;
        }

        /* renamed from: b */
        public final C11282a mo28859b(String str) {
            mo28442f();
            ((C11281r0) this.f26158U).m35986b(str);
            return this;
        }

        /* renamed from: i */
        public final C11282a mo28860i() {
            mo28442f();
            ((C11281r0) this.f26158U).m35988u();
            return this;
        }

        /* renamed from: j */
        public final C11282a mo28861j() {
            mo28442f();
            ((C11281r0) this.f26158U).m35989v();
            return this;
        }

        /* renamed from: k */
        public final C11282a mo28862k() {
            mo28442f();
            ((C11281r0) this.f26158U).m35990w();
            return this;
        }

        /* synthetic */ C11282a(C11212m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public final C11282a mo28857a(long j) {
            mo28442f();
            ((C11281r0) this.f26158U).m35978a(j);
            return this;
        }

        /* renamed from: a */
        public final C11282a mo28856a(double d) {
            mo28442f();
            ((C11281r0) this.f26158U).m35977a(d);
            return this;
        }
    }

    static {
        C11090e4.m35024a(C11281r0.class, zzwu);
    }

    private C11281r0() {
        String str = "";
        this.zzwk = str;
        this.zzwr = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35983a(String str) {
        if (str != null) {
            this.zzue |= 1;
            this.zzwk = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m35986b(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzwr = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m35988u() {
        this.zzue &= -3;
        this.zzwr = zzwu.zzwr;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m35989v() {
        this.zzue &= -5;
        this.zzwp = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m35990w() {
        this.zzue &= -17;
        this.zzwt = 0.0d;
    }

    /* renamed from: x */
    public static C11282a m35991x() {
        return (C11282a) zzwu.mo28434i();
    }

    /* renamed from: n */
    public final String mo28849n() {
        return this.zzwk;
    }

    /* renamed from: o */
    public final boolean mo28850o() {
        return (this.zzue & 2) != 0;
    }

    /* renamed from: p */
    public final String mo28851p() {
        return this.zzwr;
    }

    /* renamed from: q */
    public final boolean mo28852q() {
        return (this.zzue & 4) != 0;
    }

    /* renamed from: r */
    public final long mo28853r() {
        return this.zzwp;
    }

    /* renamed from: s */
    public final boolean mo28854s() {
        return (this.zzue & 16) != 0;
    }

    /* renamed from: t */
    public final double mo28855t() {
        return this.zzwt;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35978a(long j) {
        this.zzue |= 4;
        this.zzwp = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35977a(double d) {
        this.zzue |= 16;
        this.zzwt = d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11281r0();
            case 2:
                return new C11282a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzwu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004", new Object[]{"zzue", "zzwk", "zzwr", "zzwp", "zzws", "zzwt"});
            case 4:
                return zzwu;
            case 5:
                C11373x5<C11281r0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11281r0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzwu);
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
