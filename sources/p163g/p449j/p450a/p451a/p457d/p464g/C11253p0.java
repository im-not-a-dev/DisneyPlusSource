package p163g.p449j.p450a.p451a.p457d.p464g;

import java.util.Collections;
import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11091a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11090e4.C11093c;
import p163g.p449j.p450a.p451a.p457d.p464g.C11281r0.C11282a;

/* renamed from: g.j.a.a.d.g.p0 */
public final class C11253p0 extends C11090e4<C11253p0, C11254a> implements C11288r5 {
    private static volatile C11373x5<C11253p0> zzuo;
    /* access modifiers changed from: private */
    public static final C11253p0 zzwo = new C11253p0();
    private int zzue;
    private C11216m4<C11281r0> zzwj = C11090e4.m35028m();
    private String zzwk = "";
    private long zzwl;
    private long zzwm;
    private int zzwn;

    /* renamed from: g.j.a.a.d.g.p0$a */
    public static final class C11254a extends C11091a<C11253p0, C11254a> implements C11288r5 {
        private C11254a() {
            super(C11253p0.zzwo);
        }

        /* renamed from: a */
        public final C11281r0 mo28813a(int i) {
            return ((C11253p0) this.f26158U).mo28797b(i);
        }

        /* renamed from: b */
        public final C11254a mo28814b(int i) {
            mo28442f();
            ((C11253p0) this.f26158U).m35892c(i);
            return this;
        }

        /* renamed from: i */
        public final String mo28816i() {
            return ((C11253p0) this.f26158U).mo28799o();
        }

        /* renamed from: j */
        public final long mo28817j() {
            return ((C11253p0) this.f26158U).mo28800p();
        }

        /* renamed from: k */
        public final List<C11281r0> mo28818k() {
            return Collections.unmodifiableList(((C11253p0) this.f26158U).mo28801q());
        }

        /* renamed from: l */
        public final int mo28819l() {
            return ((C11253p0) this.f26158U).mo28802r();
        }

        /* renamed from: m */
        public final long mo28820m() {
            return ((C11253p0) this.f26158U).mo28804t();
        }

        /* synthetic */ C11254a(C11212m0 m0Var) {
            this();
        }

        /* renamed from: a */
        public final C11254a mo28808a(int i, C11281r0 r0Var) {
            mo28442f();
            ((C11253p0) this.f26158U).m35878a(i, r0Var);
            return this;
        }

        /* renamed from: b */
        public final C11254a mo28815b(long j) {
            mo28442f();
            ((C11253p0) this.f26158U).m35890b(j);
            return this;
        }

        /* renamed from: a */
        public final C11254a mo28807a(int i, C11282a aVar) {
            mo28442f();
            ((C11253p0) this.f26158U).m35877a(i, aVar);
            return this;
        }

        /* renamed from: a */
        public final C11254a mo28811a(C11281r0 r0Var) {
            mo28442f();
            ((C11253p0) this.f26158U).m35888a(r0Var);
            return this;
        }

        /* renamed from: a */
        public final C11254a mo28810a(C11282a aVar) {
            mo28442f();
            ((C11253p0) this.f26158U).m35887a(aVar);
            return this;
        }

        /* renamed from: a */
        public final C11254a mo28812a(String str) {
            mo28442f();
            ((C11253p0) this.f26158U).m35889a(str);
            return this;
        }

        /* renamed from: a */
        public final C11254a mo28809a(long j) {
            mo28442f();
            ((C11253p0) this.f26158U).m35879a(j);
            return this;
        }
    }

    static {
        C11090e4.m35024a(C11253p0.class, zzwo);
    }

    private C11253p0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35878a(int i, C11281r0 r0Var) {
        if (r0Var != null) {
            m35893w();
            this.zzwj.set(i, r0Var);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m35892c(int i) {
        m35893w();
        this.zzwj.remove(i);
    }

    /* renamed from: w */
    private final void m35893w() {
        if (!this.zzwj.mo28709h0()) {
            this.zzwj = C11090e4.m35020a(this.zzwj);
        }
    }

    /* renamed from: x */
    public static C11254a m35894x() {
        return (C11254a) zzwo.mo28434i();
    }

    /* renamed from: b */
    public final C11281r0 mo28797b(int i) {
        return (C11281r0) this.zzwj.get(i);
    }

    /* renamed from: n */
    public final int mo28798n() {
        return this.zzwn;
    }

    /* renamed from: o */
    public final String mo28799o() {
        return this.zzwk;
    }

    /* renamed from: p */
    public final long mo28800p() {
        return this.zzwl;
    }

    /* renamed from: q */
    public final List<C11281r0> mo28801q() {
        return this.zzwj;
    }

    /* renamed from: r */
    public final int mo28802r() {
        return this.zzwj.size();
    }

    /* renamed from: s */
    public final boolean mo28803s() {
        return (this.zzue & 2) != 0;
    }

    /* renamed from: t */
    public final long mo28804t() {
        return this.zzwm;
    }

    /* renamed from: u */
    public final boolean mo28805u() {
        return (this.zzue & 4) != 0;
    }

    /* renamed from: v */
    public final boolean mo28806v() {
        return (this.zzue & 8) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m35890b(long j) {
        this.zzue |= 4;
        this.zzwm = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35877a(int i, C11282a aVar) {
        m35893w();
        this.zzwj.set(i, (C11281r0) aVar.mo28446l0());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35888a(C11281r0 r0Var) {
        if (r0Var != null) {
            m35893w();
            this.zzwj.add(r0Var);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35887a(C11282a aVar) {
        m35893w();
        this.zzwj.add((C11281r0) aVar.mo28446l0());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35889a(String str) {
        if (str != null) {
            this.zzue |= 1;
            this.zzwk = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m35879a(long j) {
        this.zzue |= 2;
        this.zzwl = j;
    }

    /* renamed from: a */
    public static C11253p0 m35876a(byte[] bArr, C11285r3 r3Var) throws C11258p4 {
        return (C11253p0) C11090e4.m35018a(zzwo, bArr, r3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28293a(int i, Object obj, Object obj2) {
        switch (C11212m0.f26361a[i - 1]) {
            case 1:
                return new C11253p0();
            case 2:
                return new C11254a(null);
            case 3:
                return C11090e4.m35022a((C11259p5) zzwo, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzue", "zzwj", C11281r0.class, "zzwk", "zzwl", "zzwm", "zzwn"});
            case 4:
                return zzwo;
            case 5:
                C11373x5<C11253p0> x5Var = zzuo;
                if (x5Var == null) {
                    synchronized (C11253p0.class) {
                        x5Var = zzuo;
                        if (x5Var == null) {
                            x5Var = new C11093c<>(zzwo);
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
