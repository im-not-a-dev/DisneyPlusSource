package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;

/* renamed from: g.j.a.a.d.g.w0 */
public final class C11353w0 extends C11090e4<C11353w0, C11354a> implements C11288r5 {
    private static volatile C11373x5<C11353w0> zzuo;
    /* access modifiers changed from: private */
    public static final C11353w0 zzzb = new C11353w0();
    private int zzue;
    private int zzwg;
    private C11230n4 zzza = C11090e4.m35027l();

    /* renamed from: g.j.a.a.d.g.w0$a */
    public static final class C11354a extends C11091a<C11353w0, C11354a> implements C11288r5 {
        private C11354a() {
            super(C11353w0.zzzb);
        }

        /* renamed from: a */
        public final C11354a mo29085a(int i) {
            mo28442f();
            ((C11353w0) this.f26158U).m36593c(i);
            return this;
        }

        /* renamed from: i */
        public final C11354a mo29088i() {
            mo28442f();
            ((C11353w0) this.f26158U).m36595s();
            return this;
        }

        /* synthetic */ C11354a(C11212m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public final C11354a mo29086a(long j) {
            mo28442f();
            ((C11353w0) this.f26158U).m36587a(j);
            return this;
        }

        /* renamed from: a */
        public final C11354a mo29087a(Iterable<? extends Long> iterable) {
            mo28442f();
            ((C11353w0) this.f26158U).m36592a(iterable);
            return this;
        }
    }

    static {
        C11090e4.m35024a(C11353w0.class, zzzb);
    }

    private C11353w0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m36587a(long j) {
        m36594r();
        this.zzza.mo28390b(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m36593c(int i) {
        this.zzue |= 1;
        this.zzwg = i;
    }

    /* renamed from: r */
    private final void m36594r() {
        if (!this.zzza.mo28709h0()) {
            this.zzza = C11090e4.m35021a(this.zzza);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final void m36595s() {
        this.zzza = C11090e4.m35027l();
    }

    /* renamed from: t */
    public static C11354a m36596t() {
        return (C11354a) zzzb.mo28434i();
    }

    /* renamed from: b */
    public final long mo29080b(int i) {
        return this.zzza.mo28389b(i);
    }

    /* renamed from: n */
    public final int mo29081n() {
        return this.zzwg;
    }

    /* renamed from: o */
    public final boolean mo29082o() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: p */
    public final List<Long> mo29083p() {
        return this.zzza;
    }

    /* renamed from: q */
    public final int mo29084q() {
        return this.zzza.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m36592a(Iterable<? extends Long> iterable) {
        m36594r();
        C11196l2.m35535a(iterable, this.zzza);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11353w0();
            case 2:
                return new C11354a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzue", "zzwg", "zzza"});
            case 4:
                return zzzb;
            case 5:
                C11373x5<C11353w0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11353w0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzzb);
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
