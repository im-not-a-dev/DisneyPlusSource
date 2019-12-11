package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;
import p163g.p449j.p450a.p451a.p457d.p464g.C11310t0.C11311a;

/* renamed from: g.j.a.a.d.g.s0 */
public final class C11296s0 extends C11090e4<C11296s0, C11297a> implements C11288r5 {
    private static volatile C11373x5<C11296s0> zzuo;
    /* access modifiers changed from: private */
    public static final C11296s0 zzww = new C11296s0();
    private C11216m4<C11310t0> zzwv = C11090e4.m35028m();

    /* renamed from: g.j.a.a.d.g.s0$a */
    public static final class C11297a extends C11091a<C11296s0, C11297a> implements C11288r5 {
        private C11297a() {
            super(C11296s0.zzww);
        }

        /* renamed from: a */
        public final C11310t0 mo28880a(int i) {
            return ((C11296s0) this.f26158U).mo28877b(0);
        }

        /* synthetic */ C11297a(C11212m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public final C11297a mo28879a(C11311a aVar) {
            mo28442f();
            ((C11296s0) this.f26158U).m36057a(aVar);
            return this;
        }
    }

    static {
        C11090e4.m35024a(C11296s0.class, zzww);
    }

    private C11296s0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m36057a(C11311a aVar) {
        if (!this.zzwv.mo28709h0()) {
            this.zzwv = C11090e4.m35020a(this.zzwv);
        }
        this.zzwv.add((C11310t0) aVar.mo28446l0());
    }

    /* renamed from: o */
    public static C11297a m36058o() {
        return (C11297a) zzww.mo28434i();
    }

    /* renamed from: b */
    public final C11310t0 mo28877b(int i) {
        return (C11310t0) this.zzwv.get(0);
    }

    /* renamed from: n */
    public final List<C11310t0> mo28878n() {
        return this.zzwv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11296s0();
            case 2:
                return new C11297a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzww, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzwv", C11310t0.class});
            case 4:
                return zzww;
            case 5:
                C11373x5<C11296s0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11296s0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzww);
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
