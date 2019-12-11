package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.f.b.e.i */
/* compiled from: OTSHashAddress */
final class C14008i extends C14015n {

    /* renamed from: e */
    private final int f30972e;

    /* renamed from: f */
    private final int f30973f;

    /* renamed from: g */
    private final int f30974g;

    /* renamed from: m.d.f.b.e.i$b */
    /* compiled from: OTSHashAddress */
    protected static class C14010b extends C14016a<C14010b> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f30975e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f30976f = 0;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f30977g = 0;

        protected C14010b() {
            super(0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C14010b mo35392a() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C14010b mo35411d(int i) {
            this.f30977g = i;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C14010b mo35412e(int i) {
            this.f30975e = i;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C14015n mo35409b() {
            return new C14008i(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C14010b mo35410c(int i) {
            this.f30976f = i;
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo35389d() {
        byte[] d = super.mo35389d();
        C14087h.m44470a(this.f30972e, d, 16);
        C14087h.m44470a(this.f30973f, d, 20);
        C14087h.m44470a(this.f30974g, d, 24);
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo35406e() {
        return this.f30973f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo35407f() {
        return this.f30974g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo35408g() {
        return this.f30972e;
    }

    private C14008i(C14010b bVar) {
        super(bVar);
        this.f30972e = bVar.f30975e;
        this.f30973f = bVar.f30976f;
        this.f30974g = bVar.f30977g;
    }
}
