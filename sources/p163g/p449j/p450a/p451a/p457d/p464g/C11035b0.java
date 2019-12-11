package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11094d;

/* renamed from: g.j.a.a.d.g.b0 */
public final class C11035b0 extends C11090e4<C11035b0, C11036a> implements C11288r5 {
    /* access modifiers changed from: private */
    public static final C11035b0 zzun = new C11035b0();
    private static volatile C11373x5<C11035b0> zzuo;
    private int zzue;
    private int zzuf;
    private String zzug = "";
    private C11216m4<C11050c0> zzuh = C11090e4.m35028m();
    private boolean zzui;
    private C11069d0 zzuj;
    private boolean zzuk;
    private boolean zzul;
    private boolean zzum;

    /* renamed from: g.j.a.a.d.g.b0$a */
    public static final class C11036a extends C11091a<C11035b0, C11036a> implements C11288r5 {
        private C11036a() {
            super(C11035b0.zzun);
        }

        /* renamed from: a */
        public final C11036a mo28307a(String str) {
            mo28442f();
            ((C11035b0) this.f26158U).m34766a(str);
            return this;
        }

        /* renamed from: i */
        public final String mo28309i() {
            return ((C11035b0) this.f26158U).mo28296o();
        }

        /* renamed from: j */
        public final int mo28310j() {
            return ((C11035b0) this.f26158U).mo28297p();
        }

        /* synthetic */ C11036a(C11021a0 a0Var) {
            this();
        }

        /* renamed from: a */
        public final C11050c0 mo28308a(int i) {
            return ((C11035b0) this.f26158U).mo28294b(i);
        }

        /* renamed from: a */
        public final C11036a mo28306a(int i, C11050c0 c0Var) {
            mo28442f();
            ((C11035b0) this.f26158U).m34763a(i, c0Var);
            return this;
        }
    }

    static {
        C11090e4.m35024a(C11035b0.class, zzun);
    }

    private C11035b0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m34766a(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzug = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: y */
    public static C11373x5<C11035b0> m34767y() {
        return (C11373x5) zzun.mo28293a(C11094d.f26168g, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final C11050c0 mo28294b(int i) {
        return (C11050c0) this.zzuh.get(i);
    }

    /* renamed from: n */
    public final int mo28295n() {
        return this.zzuf;
    }

    /* renamed from: o */
    public final String mo28296o() {
        return this.zzug;
    }

    /* renamed from: p */
    public final int mo28297p() {
        return this.zzuh.size();
    }

    /* renamed from: q */
    public final boolean mo28298q() {
        return (this.zzue & 1) != 0;
    }

    /* renamed from: r */
    public final List<C11050c0> mo28299r() {
        return this.zzuh;
    }

    /* renamed from: s */
    public final boolean mo28300s() {
        return (this.zzue & 8) != 0;
    }

    /* renamed from: t */
    public final C11069d0 mo28301t() {
        C11069d0 d0Var = this.zzuj;
        return d0Var == null ? C11069d0.m34942x() : d0Var;
    }

    /* renamed from: u */
    public final boolean mo28302u() {
        return this.zzuk;
    }

    /* renamed from: v */
    public final boolean mo28303v() {
        return this.zzul;
    }

    /* renamed from: w */
    public final boolean mo28304w() {
        return (this.zzue & 64) != 0;
    }

    /* renamed from: x */
    public final boolean mo28305x() {
        return this.zzum;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m34763a(int i, C11050c0 c0Var) {
        if (c0Var != null) {
            if (!this.zzuh.mo28709h0()) {
                this.zzuh = C11090e4.m35020a(this.zzuh);
            }
            this.zzuh.set(i, c0Var);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static C11035b0 m34762a(byte[] bArr, C11285r3 r3Var) throws C11258p4 {
        return (C11035b0) C11090e4.m35018a(zzun, bArr, r3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11021a0.f26040a[i - 1]) {
            case 1:
                return new C11035b0();
            case 2:
                return new C11036a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzun, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzue", "zzuf", "zzug", "zzuh", C11050c0.class, "zzui", "zzuj", "zzuk", "zzul", "zzum"});
            case 4:
                return zzun;
            case 5:
                C11373x5<C11035b0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11035b0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzun);
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
