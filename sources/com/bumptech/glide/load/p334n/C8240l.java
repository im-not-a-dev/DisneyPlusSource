package com.bumptech.glide.load.p334n;

import com.bumptech.glide.load.C8105a;
import com.bumptech.glide.load.C8111g;
import com.bumptech.glide.load.p334n.p337c0.C8201a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p096e.p121h.p134r.C4114f;
import p163g.p413f.p414a.p420u.C10732i;
import p163g.p413f.p414a.p424w.C10767e;
import p163g.p413f.p414a.p424w.C10774j;
import p163g.p413f.p414a.p424w.p425l.C10777a.C10783f;
import p163g.p413f.p414a.p424w.p425l.C10786c;

/* renamed from: com.bumptech.glide.load.n.l */
/* compiled from: EngineJob */
class C8240l<R> implements C8218b<R>, C10783f {

    /* renamed from: q0 */
    private static final C8243c f17636q0 = new C8243c();

    /* renamed from: U */
    private final C10786c f17637U;

    /* renamed from: V */
    private final C4114f<C8240l<?>> f17638V;

    /* renamed from: W */
    private final C8243c f17639W;

    /* renamed from: X */
    private final C8246m f17640X;

    /* renamed from: Y */
    private final C8201a f17641Y;

    /* renamed from: Z */
    private final C8201a f17642Z;

    /* renamed from: a0 */
    private final C8201a f17643a0;

    /* renamed from: b0 */
    private final C8201a f17644b0;

    /* renamed from: c */
    final C8245e f17645c;

    /* renamed from: c0 */
    private final AtomicInteger f17646c0;

    /* renamed from: d0 */
    private C8111g f17647d0;

    /* renamed from: e0 */
    private boolean f17648e0;

    /* renamed from: f0 */
    private boolean f17649f0;

    /* renamed from: g0 */
    private boolean f17650g0;

    /* renamed from: h0 */
    private boolean f17651h0;

    /* renamed from: i0 */
    private C8258v<?> f17652i0;

    /* renamed from: j0 */
    C8105a f17653j0;

    /* renamed from: k0 */
    private boolean f17654k0;

    /* renamed from: l0 */
    C8251q f17655l0;

    /* renamed from: m0 */
    private boolean f17656m0;

    /* renamed from: n0 */
    C8249p<?> f17657n0;

    /* renamed from: o0 */
    private C8216h<R> f17658o0;

    /* renamed from: p0 */
    private volatile boolean f17659p0;

    /* renamed from: com.bumptech.glide.load.n.l$a */
    /* compiled from: EngineJob */
    private class C8241a implements Runnable {

        /* renamed from: c */
        private final C10732i f17661c;

        C8241a(C10732i iVar) {
            this.f17661c = iVar;
        }

        public void run() {
            synchronized (C8240l.this) {
                if (C8240l.this.f17645c.mo21398a(this.f17661c)) {
                    C8240l.this.mo21383a(this.f17661c);
                }
                C8240l.this.mo21385b();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$b */
    /* compiled from: EngineJob */
    private class C8242b implements Runnable {

        /* renamed from: c */
        private final C10732i f17663c;

        C8242b(C10732i iVar) {
            this.f17663c = iVar;
        }

        public void run() {
            synchronized (C8240l.this) {
                if (C8240l.this.f17645c.mo21398a(this.f17663c)) {
                    C8240l.this.f17657n0.mo21410c();
                    C8240l.this.mo21387b(this.f17663c);
                    C8240l.this.mo21389c(this.f17663c);
                }
                C8240l.this.mo21385b();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$c */
    /* compiled from: EngineJob */
    static class C8243c {
        C8243c() {
        }

        /* renamed from: a */
        public <R> C8249p<R> mo21394a(C8258v<R> vVar, boolean z) {
            return new C8249p<>(vVar, z, true);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$d */
    /* compiled from: EngineJob */
    static final class C8244d {

        /* renamed from: a */
        final C10732i f17664a;

        /* renamed from: b */
        final Executor f17665b;

        C8244d(C10732i iVar, Executor executor) {
            this.f17664a = iVar;
            this.f17665b = executor;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8244d)) {
                return false;
            }
            return this.f17664a.equals(((C8244d) obj).f17664a);
        }

        public int hashCode() {
            return this.f17664a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.l$e */
    /* compiled from: EngineJob */
    static final class C8245e implements Iterable<C8244d> {

        /* renamed from: c */
        private final List<C8244d> f17666c;

        C8245e() {
            this(new ArrayList(2));
        }

        /* renamed from: c */
        private static C8244d m23957c(C10732i iVar) {
            return new C8244d(iVar, C10767e.m33996a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21397a(C10732i iVar, Executor executor) {
            this.f17666c.add(new C8244d(iVar, executor));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo21400b(C10732i iVar) {
            this.f17666c.remove(m23957c(iVar));
        }

        /* access modifiers changed from: 0000 */
        public void clear() {
            this.f17666c.clear();
        }

        /* access modifiers changed from: 0000 */
        public boolean isEmpty() {
            return this.f17666c.isEmpty();
        }

        public Iterator<C8244d> iterator() {
            return this.f17666c.iterator();
        }

        /* access modifiers changed from: 0000 */
        public int size() {
            return this.f17666c.size();
        }

        C8245e(List<C8244d> list) {
            this.f17666c = list;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo21398a(C10732i iVar) {
            return this.f17666c.contains(m23957c(iVar));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C8245e mo21399b() {
            return new C8245e(new ArrayList(this.f17666c));
        }
    }

    C8240l(C8201a aVar, C8201a aVar2, C8201a aVar3, C8201a aVar4, C8246m mVar, C4114f<C8240l<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, fVar, f17636q0);
    }

    /* renamed from: g */
    private C8201a m23937g() {
        if (this.f17649f0) {
            return this.f17643a0;
        }
        return this.f17650g0 ? this.f17644b0 : this.f17642Z;
    }

    /* renamed from: h */
    private boolean m23938h() {
        return this.f17656m0 || this.f17654k0 || this.f17659p0;
    }

    /* renamed from: i */
    private synchronized void m23939i() {
        if (this.f17647d0 != null) {
            this.f17645c.clear();
            this.f17647d0 = null;
            this.f17657n0 = null;
            this.f17652i0 = null;
            this.f17656m0 = false;
            this.f17659p0 = false;
            this.f17654k0 = false;
            this.f17658o0.mo21349a(false);
            this.f17658o0 = null;
            this.f17655l0 = null;
            this.f17653j0 = null;
            this.f17638V.mo14667a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C8240l<R> mo21380a(C8111g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f17647d0 = gVar;
        this.f17648e0 = z;
        this.f17649f0 = z2;
        this.f17650g0 = z3;
        this.f17651h0 = z4;
        return this;
    }

    /* renamed from: b */
    public synchronized void mo21386b(C8216h<R> hVar) {
        C8201a aVar;
        this.f17658o0 = hVar;
        if (hVar.mo21350c()) {
            aVar = this.f17641Y;
        } else {
            aVar = m23937g();
        }
        aVar.execute(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo21389c(C10732i iVar) {
        boolean z;
        this.f17637U.mo27821a();
        this.f17645c.mo21400b(iVar);
        if (this.f17645c.isEmpty()) {
            mo21381a();
            if (!this.f17654k0) {
                if (!this.f17656m0) {
                    z = false;
                    if (z && this.f17646c0.get() == 0) {
                        m23939i();
                    }
                }
            }
            z = true;
            m23939i();
        }
    }

    /* renamed from: d */
    public C10786c mo21296d() {
        return this.f17637U;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r4.f17640X.mo21375a(r4, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r0.hasNext() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        r1 = (com.bumptech.glide.load.p334n.C8240l.C8244d) r0.next();
        r1.f17665b.execute(new com.bumptech.glide.load.p334n.C8240l.C8242b(r4, r1.f17664a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        mo21385b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21390e() {
        /*
            r4 = this;
            monitor-enter(r4)
            g.f.a.w.l.c r0 = r4.f17637U     // Catch:{ all -> 0x0078 }
            r0.mo27821a()     // Catch:{ all -> 0x0078 }
            boolean r0 = r4.f17659p0     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.n.v<?> r0 = r4.f17652i0     // Catch:{ all -> 0x0078 }
            r0.mo21407a()     // Catch:{ all -> 0x0078 }
            r4.m23939i()     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            return
        L_0x0014:
            com.bumptech.glide.load.n.l$e r0 = r4.f17645c     // Catch:{ all -> 0x0078 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0070
            boolean r0 = r4.f17654k0     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0068
            com.bumptech.glide.load.n.l$c r0 = r4.f17639W     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.n.v<?> r1 = r4.f17652i0     // Catch:{ all -> 0x0078 }
            boolean r2 = r4.f17648e0     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.n.p r0 = r0.mo21394a(r1, r2)     // Catch:{ all -> 0x0078 }
            r4.f17657n0 = r0     // Catch:{ all -> 0x0078 }
            r0 = 1
            r4.f17654k0 = r0     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.n.l$e r1 = r4.f17645c     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.n.l$e r1 = r1.mo21399b()     // Catch:{ all -> 0x0078 }
            int r2 = r1.size()     // Catch:{ all -> 0x0078 }
            int r2 = r2 + r0
            r4.mo21382a(r2)     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.g r0 = r4.f17647d0     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.n.p<?> r2 = r4.f17657n0     // Catch:{ all -> 0x0078 }
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            com.bumptech.glide.load.n.m r3 = r4.f17640X
            r3.mo21375a(r4, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.n.l$d r1 = (com.bumptech.glide.load.p334n.C8240l.C8244d) r1
            java.util.concurrent.Executor r2 = r1.f17665b
            com.bumptech.glide.load.n.l$b r3 = new com.bumptech.glide.load.n.l$b
            g.f.a.u.i r1 = r1.f17664a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004b
        L_0x0064:
            r4.mo21385b()
            return
        L_0x0068:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0078 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.C8240l.mo21390e():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo21391f() {
        return this.f17651h0;
    }

    C8240l(C8201a aVar, C8201a aVar2, C8201a aVar3, C8201a aVar4, C8246m mVar, C4114f<C8240l<?>> fVar, C8243c cVar) {
        this.f17645c = new C8245e();
        this.f17637U = C10786c.m34054b();
        this.f17646c0 = new AtomicInteger();
        this.f17641Y = aVar;
        this.f17642Z = aVar2;
        this.f17643a0 = aVar3;
        this.f17644b0 = aVar4;
        this.f17640X = mVar;
        this.f17638V = fVar;
        this.f17639W = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo21384a(C10732i iVar, Executor executor) {
        this.f17637U.mo27821a();
        this.f17645c.mo21397a(iVar, executor);
        boolean z = true;
        if (this.f17654k0) {
            mo21382a(1);
            executor.execute(new C8242b(iVar));
        } else if (this.f17656m0) {
            mo21382a(1);
            executor.execute(new C8241a(iVar));
        } else {
            if (this.f17659p0) {
                z = false;
            }
            C10774j.m34016a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo21387b(C10732i iVar) {
        try {
            iVar.mo27750a(this.f17657n0, this.f17653j0);
        } catch (Throwable th) {
            throw new C8177b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f17640X.mo21375a(r4, r1, null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = (com.bumptech.glide.load.p334n.C8240l.C8244d) r0.next();
        r1.f17665b.execute(new com.bumptech.glide.load.p334n.C8240l.C8241a(r4, r1.f17664a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo21385b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21388c() {
        /*
            r4 = this;
            monitor-enter(r4)
            g.f.a.w.l.c r0 = r4.f17637U     // Catch:{ all -> 0x0066 }
            r0.mo27821a()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f17659p0     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m23939i()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.n.l$e r0 = r4.f17645c     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f17656m0     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f17656m0 = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.g r1 = r4.f17647d0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.l$e r2 = r4.f17645c     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.l$e r2 = r2.mo21399b()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo21382a(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.n.m r0 = r4.f17640X
            r3 = 0
            r0.mo21375a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.n.l$d r1 = (com.bumptech.glide.load.p334n.C8240l.C8244d) r1
            java.util.concurrent.Executor r2 = r1.f17665b
            com.bumptech.glide.load.n.l$a r3 = new com.bumptech.glide.load.n.l$a
            g.f.a.u.i r1 = r1.f17664a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo21385b()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.C8240l.mo21388c():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo21385b() {
        this.f17637U.mo27821a();
        C10774j.m34016a(m23938h(), "Not yet complete!");
        int decrementAndGet = this.f17646c0.decrementAndGet();
        C10774j.m34016a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            if (this.f17657n0 != null) {
                this.f17657n0.mo21413f();
            }
            m23939i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo21383a(C10732i iVar) {
        try {
            iVar.mo27749a(this.f17655l0);
        } catch (Throwable th) {
            throw new C8177b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21381a() {
        if (!m23938h()) {
            this.f17659p0 = true;
            this.f17658o0.mo21348a();
            this.f17640X.mo21374a(this, this.f17647d0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo21382a(int i) {
        C10774j.m34016a(m23938h(), "Not yet complete!");
        if (this.f17646c0.getAndAdd(i) == 0 && this.f17657n0 != null) {
            this.f17657n0.mo21410c();
        }
    }

    /* renamed from: a */
    public void mo21355a(C8258v<R> vVar, C8105a aVar) {
        synchronized (this) {
            this.f17652i0 = vVar;
            this.f17653j0 = aVar;
        }
        mo21390e();
    }

    /* renamed from: a */
    public void mo21354a(C8251q qVar) {
        synchronized (this) {
            this.f17655l0 = qVar;
        }
        mo21388c();
    }

    /* renamed from: a */
    public void mo21353a(C8216h<?> hVar) {
        m23937g().execute(hVar);
    }
}
