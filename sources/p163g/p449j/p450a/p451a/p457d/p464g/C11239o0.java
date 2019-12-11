package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.o0 */
public final class C11239o0 extends C11090e4<C11239o0, C11240a> implements C11288r5 {
    private static volatile C11373x5<C11239o0> zzuo;
    /* access modifiers changed from: private */
    public static final C11239o0 zzwi = new C11239o0();
    private int zzue;
    private int zzwg;
    private long zzwh;

    /* renamed from: g.j.a.a.d.g.o0$a */
    public static final class C11240a extends C11091a<C11239o0, C11240a> implements C11288r5 {
        private C11240a() {
            super(C11239o0.zzwi);
        }

        /* renamed from: a */
        public final C11240a mo28742a(int i) {
            mo28442f();
            ((C11239o0) this.f26158U).m35805b(i);
            return this;
        }

        /* synthetic */ C11240a(C11212m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public final C11240a mo28743a(long j) {
            mo28442f();
            ((C11239o0) this.f26158U).m35802a(j);
            return this;
        }
    }

    static {
        C11090e4.m35024a(C11239o0.class, zzwi);
    }

    private C11239o0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35802a(long j) {
        this.zzue |= 2;
        this.zzwh = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m35805b(int i) {
        this.zzue |= 1;
        this.zzwg = i;
    }

    /* renamed from: r */
    public static C11240a m35806r() {
        return (C11240a) zzwi.mo28434i();
    }

    /* renamed from: n */
    public final int mo28738n() {
        return this.zzwg;
    }

    /* renamed from: o */
    public final boolean mo28739o() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: p */
    public final boolean mo28740p() {
        return (this.zzue & 2) != 0;
    }

    /* renamed from: q */
    public final long mo28741q() {
        return this.zzwh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11239o0();
            case 2:
                return new C11240a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzwi, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzue", "zzwg", "zzwh"});
            case 4:
                return zzwi;
            case 5:
                C11373x5<C11239o0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11239o0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzwi);
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
