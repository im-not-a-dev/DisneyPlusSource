package com.bumptech.glide.load.p334n;

import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.p425l.C10777a;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10781d;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10783f;
import p163g.p413f.p414a.p424w.p425l.C10786c;

/* renamed from: com.bumptech.glide.load.n.u */
/* compiled from: LockedResource */
final class C8256u<Z> implements C8258v<Z>, C10783f {

    /* renamed from: X */
    private static final C4114f<C8256u<?>> f17696X = C10777a.m34038a(20, (C10781d<T>) new C8257a<T>());

    /* renamed from: U */
    private C8258v<Z> f17697U;

    /* renamed from: V */
    private boolean f17698V;

    /* renamed from: W */
    private boolean f17699W;

    /* renamed from: c */
    private final C10786c f17700c = C10786c.m34054b();

    /* renamed from: com.bumptech.glide.load.n.u$a */
    /* compiled from: LockedResource */
    class C8257a implements C10781d<C8256u<?>> {
        C8257a() {
        }

        public C8256u<?> create() {
            return new C8256u<>();
        }
    }

    C8256u() {
    }

    /* renamed from: a */
    private void m23992a(C8258v<Z> vVar) {
        this.f17699W = false;
        this.f17698V = true;
        this.f17697U = vVar;
    }

    /* renamed from: b */
    static <Z> C8256u<Z> m23993b(C8258v<Z> vVar) {
        C8256u<Z> uVar = (C8256u) f17696X.mo14666a();
        C10774j.m34012a(uVar);
        C8256u<Z> uVar2 = uVar;
        uVar2.m23992a(vVar);
        return uVar2;
    }

    /* renamed from: e */
    private void m23994e() {
        this.f17697U = null;
        f17696X.mo14667a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo21437c() {
        this.f17700c.mo27821a();
        if (this.f17698V) {
            this.f17698V = false;
            if (this.f17699W) {
                mo21407a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: d */
    public C10786c mo21296d() {
        return this.f17700c;
    }

    public Z get() {
        return this.f17697U.get();
    }

    public int getSize() {
        return this.f17697U.getSize();
    }

    /* renamed from: b */
    public Class<Z> mo21409b() {
        return this.f17697U.mo21409b();
    }

    /* renamed from: a */
    public synchronized void mo21407a() {
        this.f17700c.mo27821a();
        this.f17699W = true;
        if (!this.f17698V) {
            this.f17697U.mo21407a();
            m23994e();
        }
    }
}
