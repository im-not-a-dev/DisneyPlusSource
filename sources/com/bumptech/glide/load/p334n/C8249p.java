package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8111g;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.n.p */
/* compiled from: EngineResource */
class C8249p<Z> implements C8258v<Z> {

    /* renamed from: U */
    private final boolean f17676U;

    /* renamed from: V */
    private final C8258v<Z> f17677V;

    /* renamed from: W */
    private C8250a f17678W;

    /* renamed from: X */
    private C8111g f17679X;

    /* renamed from: Y */
    private int f17680Y;

    /* renamed from: Z */
    private boolean f17681Z;

    /* renamed from: c */
    private final boolean f17682c;

    /* renamed from: com.bumptech.glide.load.n.p$a */
    /* compiled from: EngineResource */
    interface C8250a {
        /* renamed from: a */
        void mo21373a(C8111g gVar, C8249p<?> pVar);
    }

    C8249p(C8258v<Z> vVar, boolean z, boolean z2) {
        C10774j.m34012a(vVar);
        this.f17677V = vVar;
        this.f17682c = z;
        this.f17676U = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo21408a(C8111g gVar, C8250a aVar) {
        this.f17679X = gVar;
        this.f17678W = aVar;
    }

    /* renamed from: b */
    public Class<Z> mo21409b() {
        return this.f17677V.mo21409b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo21410c() {
        if (!this.f17681Z) {
            this.f17680Y++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8258v<Z> mo21411d() {
        return this.f17677V;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo21412e() {
        return this.f17682c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21413f() {
        synchronized (this.f17678W) {
            synchronized (this) {
                if (this.f17680Y > 0) {
                    int i = this.f17680Y - 1;
                    this.f17680Y = i;
                    if (i == 0) {
                        this.f17678W.mo21373a(this.f17679X, this);
                    }
                } else {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
            }
        }
    }

    public Z get() {
        return this.f17677V.get();
    }

    public int getSize() {
        return this.f17677V.getSize();
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("EngineResource{isCacheable=");
        sb.append(this.f17682c);
        sb.append(", listener=");
        sb.append(this.f17678W);
        sb.append(", key=");
        sb.append(this.f17679X);
        sb.append(", acquired=");
        sb.append(this.f17680Y);
        sb.append(", isRecycled=");
        sb.append(this.f17681Z);
        sb.append(", resource=");
        sb.append(this.f17677V);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public synchronized void mo21407a() {
        if (this.f17680Y > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f17681Z) {
            this.f17681Z = true;
            if (this.f17676U) {
                this.f17677V.mo21407a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }
}
