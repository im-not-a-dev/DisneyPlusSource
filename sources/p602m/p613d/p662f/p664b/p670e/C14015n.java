package p602m.p613d.p662f.p664b.p670e;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.f.b.e.n */
/* compiled from: XMSSAddress */
public abstract class C14015n {

    /* renamed from: a */
    private final int f30992a;

    /* renamed from: b */
    private final long f30993b;

    /* renamed from: c */
    private final int f30994c;

    /* renamed from: d */
    private final int f30995d;

    /* renamed from: m.d.f.b.e.n$a */
    /* compiled from: XMSSAddress */
    protected static abstract class C14016a<T extends C14016a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f30996a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f30997b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f30998c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f30999d = 0;

        protected C14016a(int i) {
            this.f30996a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo35392a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo35429a(long j) {
            this.f30998c = j;
            return mo35392a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo35430b(int i) {
            this.f30997b = i;
            return mo35392a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo35428a(int i) {
            this.f30999d = i;
            return mo35392a();
        }
    }

    protected C14015n(C14016a aVar) {
        this.f30992a = aVar.f30997b;
        this.f30993b = aVar.f30998c;
        this.f30994c = aVar.f30996a;
        this.f30995d = aVar.f30999d;
    }

    /* renamed from: a */
    public final int mo35425a() {
        return this.f30995d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo35426b() {
        return this.f30992a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo35427c() {
        return this.f30993b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public byte[] mo35389d() {
        byte[] bArr = new byte[32];
        C14087h.m44470a(this.f30992a, bArr, 0);
        C14087h.m44471a(this.f30993b, bArr, 4);
        C14087h.m44470a(this.f30994c, bArr, 12);
        C14087h.m44470a(this.f30995d, bArr, 28);
        return bArr;
    }
}
