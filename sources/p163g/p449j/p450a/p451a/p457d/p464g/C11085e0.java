package p163g.p449j.p450a.p451a.p457d.p464g;

import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;

/* renamed from: g.j.a.a.d.g.e0 */
public final class C11085e0 extends C11090e4<C11085e0, C11086a> implements C11288r5 {
    private static volatile C11373x5<C11085e0> zzuo;
    /* access modifiers changed from: private */
    public static final C11085e0 zzvj = new C11085e0();
    private int zzue;
    private int zzuf;
    private boolean zzuk;
    private boolean zzul;
    private boolean zzum;
    private String zzvh = "";
    private C11050c0 zzvi;

    /* renamed from: g.j.a.a.d.g.e0$a */
    public static final class C11086a extends C11091a<C11085e0, C11086a> implements C11288r5 {
        private C11086a() {
            super(C11085e0.zzvj);
        }

        /* renamed from: a */
        public final C11086a mo28423a(String str) {
            mo28442f();
            ((C11085e0) this.f26158U).m34996a(str);
            return this;
        }

        /* synthetic */ C11086a(C11021a0 a0Var) {
            this();
        }
    }

    static {
        C11090e4.m35024a(C11085e0.class, zzvj);
    }

    private C11085e0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m34996a(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzvh = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: v */
    public static C11373x5<C11085e0> m34997v() {
        return (C11373x5) zzvj.mo28293a(C11094d.f26168g, null, null);
    }

    /* renamed from: n */
    public final int mo28415n() {
        return this.zzuf;
    }

    /* renamed from: o */
    public final String mo28416o() {
        return this.zzvh;
    }

    /* renamed from: p */
    public final boolean mo28417p() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: q */
    public final boolean mo28418q() {
        return this.zzuk;
    }

    /* renamed from: r */
    public final boolean mo28419r() {
        return this.zzul;
    }

    /* renamed from: s */
    public final boolean mo28420s() {
        return (this.zzue & 32) != 0;
    }

    /* renamed from: t */
    public final boolean mo28421t() {
        return this.zzum;
    }

    /* renamed from: u */
    public final C11050c0 mo28422u() {
        C11050c0 c0Var = this.zzvi;
        return c0Var == null ? C11050c0.m34820u() : c0Var;
    }

    /* renamed from: a */
    public static C11085e0 m34994a(byte[] bArr, C11285r3 r3Var) throws C11258p4 {
        return (C11085e0) C11090e4.m35018a(zzvj, bArr, r3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11021a0.f26040a[i - 1]) {
            case 1:
                return new C11085e0();
            case 2:
                return new C11086a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzvj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzue", "zzuf", "zzvh", "zzvi", "zzuk", "zzul", "zzum"});
            case 4:
                return zzvj;
            case 5:
                C11373x5<C11085e0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11085e0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzvj);
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
