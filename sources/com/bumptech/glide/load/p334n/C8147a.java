package com.bumptech.glide.load.p334n;

import android.os.Process;
import com.bumptech.glide.load.C8111g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p163g.p413f.p414a.p424w.C10774j;

/* renamed from: com.bumptech.glide.load.n.a */
/* compiled from: ActiveResources */
final class C8147a {

    /* renamed from: a */
    private final boolean f17418a;

    /* renamed from: b */
    final Map<C8111g, C8152d> f17419b;

    /* renamed from: c */
    private final ReferenceQueue<C8249p<?>> f17420c;

    /* renamed from: d */
    private C8250a f17421d;

    /* renamed from: e */
    private volatile boolean f17422e;

    /* renamed from: f */
    private volatile C8151c f17423f;

    /* renamed from: com.bumptech.glide.load.n.a$a */
    /* compiled from: ActiveResources */
    class C8148a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.n.a$a$a */
        /* compiled from: ActiveResources */
        class C8149a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ Runnable f17424c;

            C8149a(C8148a aVar, Runnable runnable) {
                this.f17424c = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f17424c.run();
            }
        }

        C8148a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C8149a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a$b */
    /* compiled from: ActiveResources */
    class C8150b implements Runnable {
        C8150b() {
        }

        public void run() {
            C8147a.this.mo21205a();
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a$c */
    /* compiled from: ActiveResources */
    interface C8151c {
        /* renamed from: a */
        void mo21214a();
    }

    /* renamed from: com.bumptech.glide.load.n.a$d */
    /* compiled from: ActiveResources */
    static final class C8152d extends WeakReference<C8249p<?>> {

        /* renamed from: a */
        final C8111g f17426a;

        /* renamed from: b */
        final boolean f17427b;

        /* renamed from: c */
        C8258v<?> f17428c;

        C8152d(C8111g gVar, C8249p<?> pVar, ReferenceQueue<? super C8249p<?>> referenceQueue, boolean z) {
            C8258v<?> vVar;
            super(pVar, referenceQueue);
            C10774j.m34012a(gVar);
            this.f17426a = gVar;
            if (!pVar.mo21412e() || !z) {
                vVar = null;
            } else {
                C8258v<?> d = pVar.mo21411d();
                C10774j.m34012a(d);
                vVar = d;
            }
            this.f17428c = vVar;
            this.f17427b = pVar.mo21412e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21215a() {
            this.f17428c = null;
            clear();
        }
    }

    C8147a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C8148a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21209a(C8250a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f17421d = aVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.p334n.C8249p<?> mo21210b(com.bumptech.glide.load.C8111g r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.g, com.bumptech.glide.load.n.a$d> r0 = r1.f17419b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.n.a$d r2 = (com.bumptech.glide.load.p334n.C8147a.C8152d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.n.p r0 = (com.bumptech.glide.load.p334n.C8249p) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo21208a(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p334n.C8147a.mo21210b(com.bumptech.glide.load.g):com.bumptech.glide.load.n.p");
    }

    C8147a(boolean z, Executor executor) {
        this.f17419b = new HashMap();
        this.f17420c = new ReferenceQueue<>();
        this.f17418a = z;
        executor.execute(new C8150b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo21207a(C8111g gVar, C8249p<?> pVar) {
        C8152d dVar = (C8152d) this.f17419b.put(gVar, new C8152d(gVar, pVar, this.f17420c, this.f17418a));
        if (dVar != null) {
            dVar.mo21215a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo21206a(C8111g gVar) {
        C8152d dVar = (C8152d) this.f17419b.remove(gVar);
        if (dVar != null) {
            dVar.mo21215a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21208a(C8152d dVar) {
        synchronized (this.f17421d) {
            synchronized (this) {
                this.f17419b.remove(dVar.f17426a);
                if (dVar.f17427b) {
                    if (dVar.f17428c != null) {
                        C8249p pVar = new C8249p(dVar.f17428c, true, false);
                        pVar.mo21408a(dVar.f17426a, this.f17421d);
                        this.f17421d.mo21373a(dVar.f17426a, pVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21205a() {
        while (!this.f17422e) {
            try {
                mo21208a((C8152d) this.f17420c.remove());
                C8151c cVar = this.f17423f;
                if (cVar != null) {
                    cVar.mo21214a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
