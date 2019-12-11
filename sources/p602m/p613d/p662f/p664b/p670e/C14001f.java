package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.f.b.e.f */
/* compiled from: HashTreeAddress */
final class C14001f extends C14015n {

    /* renamed from: e */
    private final int f30959e;

    /* renamed from: f */
    private final int f30960f;

    /* renamed from: g */
    private final int f30961g;

    /* renamed from: m.d.f.b.e.f$b */
    /* compiled from: HashTreeAddress */
    protected static class C14003b extends C14016a<C14003b> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f30962e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f30963f = 0;

        protected C14003b() {
            super(2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C14003b mo35392a() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C14003b mo35394c(int i) {
            this.f30962e = i;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C14003b mo35395d(int i) {
            this.f30963f = i;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C14015n mo35393b() {
            return new C14001f(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo35389d() {
        byte[] d = super.mo35389d();
        C14087h.m44470a(this.f30959e, d, 16);
        C14087h.m44470a(this.f30960f, d, 20);
        C14087h.m44470a(this.f30961g, d, 24);
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo35390e() {
        return this.f30960f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo35391f() {
        return this.f30961g;
    }

    private C14001f(C14003b bVar) {
        super(bVar);
        this.f30959e = 0;
        this.f30960f = bVar.f30962e;
        this.f30961g = bVar.f30963f;
    }
}
