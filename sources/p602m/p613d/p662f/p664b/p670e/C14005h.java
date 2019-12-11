package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.f.b.e.h */
/* compiled from: LTreeAddress */
final class C14005h extends C14015n {

    /* renamed from: e */
    private final int f30966e;

    /* renamed from: f */
    private final int f30967f;

    /* renamed from: g */
    private final int f30968g;

    /* renamed from: m.d.f.b.e.h$b */
    /* compiled from: LTreeAddress */
    protected static class C14007b extends C14016a<C14007b> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f30969e = 0;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f30970f = 0;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f30971g = 0;

        protected C14007b() {
            super(1);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C14007b mo35392a() {
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C14007b mo35404d(int i) {
            this.f30970f = i;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public C14007b mo35405e(int i) {
            this.f30971g = i;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C14015n mo35402b() {
            return new C14005h(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public C14007b mo35403c(int i) {
            this.f30969e = i;
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo35389d() {
        byte[] d = super.mo35389d();
        C14087h.m44470a(this.f30966e, d, 16);
        C14087h.m44470a(this.f30967f, d, 20);
        C14087h.m44470a(this.f30968g, d, 24);
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo35399e() {
        return this.f30966e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo35400f() {
        return this.f30967f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo35401g() {
        return this.f30968g;
    }

    private C14005h(C14007b bVar) {
        super(bVar);
        this.f30966e = bVar.f30969e;
        this.f30967f = bVar.f30970f;
        this.f30968g = bVar.f30971g;
    }
}
