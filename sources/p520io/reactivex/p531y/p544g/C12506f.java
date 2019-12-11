package p520io.reactivex.p531y.p544g;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.g.f */
/* compiled from: IoScheduler */
public final class C12506f extends C11969r {

    /* renamed from: d */
    static final C12513j f28978d;

    /* renamed from: e */
    static final C12513j f28979e;

    /* renamed from: f */
    private static final long f28980f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: g */
    private static final TimeUnit f28981g = TimeUnit.SECONDS;

    /* renamed from: h */
    static final C12509c f28982h = new C12509c(new C12513j("RxCachedThreadSchedulerShutdown"));

    /* renamed from: i */
    static final C12507a f28983i = new C12507a(0, null, f28978d);

    /* renamed from: b */
    final ThreadFactory f28984b;

    /* renamed from: c */
    final AtomicReference<C12507a> f28985c;

    /* renamed from: io.reactivex.y.g.f$a */
    /* compiled from: IoScheduler */
    static final class C12507a implements Runnable {

        /* renamed from: U */
        private final ConcurrentLinkedQueue<C12509c> f28986U;

        /* renamed from: V */
        final CompositeDisposable f28987V;

        /* renamed from: W */
        private final ScheduledExecutorService f28988W;

        /* renamed from: X */
        private final Future<?> f28989X;

        /* renamed from: Y */
        private final ThreadFactory f28990Y;

        /* renamed from: c */
        private final long f28991c;

        C12507a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future<?> future;
            this.f28991c = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f28986U = new ConcurrentLinkedQueue<>();
            this.f28987V = new CompositeDisposable();
            this.f28990Y = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C12506f.f28979e);
                long j2 = this.f28991c;
                future = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.f28988W = scheduledExecutorService;
            this.f28989X = future;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30621a(C12509c cVar) {
            cVar.mo30626a(mo30623c() + this.f28991c);
            this.f28986U.offer(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C12509c mo30622b() {
            if (this.f28987V.isDisposed()) {
                return C12506f.f28982h;
            }
            while (!this.f28986U.isEmpty()) {
                C12509c cVar = (C12509c) this.f28986U.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            C12509c cVar2 = new C12509c(this.f28990Y);
            this.f28987V.mo30250b(cVar2);
            return cVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public long mo30623c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30624d() {
            this.f28987V.dispose();
            Future<?> future = this.f28989X;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f28988W;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo30620a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30620a() {
            if (!this.f28986U.isEmpty()) {
                long c = mo30623c();
                Iterator it = this.f28986U.iterator();
                while (it.hasNext()) {
                    C12509c cVar = (C12509c) it.next();
                    if (cVar.mo30627b() > c) {
                        return;
                    }
                    if (this.f28986U.remove(cVar)) {
                        this.f28987V.mo30249a((Disposable) cVar);
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.g.f$b */
    /* compiled from: IoScheduler */
    static final class C12508b extends C11972c {

        /* renamed from: U */
        private final C12507a f28992U;

        /* renamed from: V */
        private final C12509c f28993V;

        /* renamed from: W */
        final AtomicBoolean f28994W = new AtomicBoolean();

        /* renamed from: c */
        private final CompositeDisposable f28995c;

        C12508b(C12507a aVar) {
            this.f28992U = aVar;
            this.f28995c = new CompositeDisposable();
            this.f28993V = aVar.mo30622b();
        }

        /* renamed from: a */
        public Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f28995c.isDisposed()) {
                return C12011d.INSTANCE;
            }
            return this.f28993V.mo30628a(runnable, j, timeUnit, this.f28995c);
        }

        public void dispose() {
            if (this.f28994W.compareAndSet(false, true)) {
                this.f28995c.dispose();
                this.f28992U.mo30621a(this.f28993V);
            }
        }

        public boolean isDisposed() {
            return this.f28994W.get();
        }
    }

    /* renamed from: io.reactivex.y.g.f$c */
    /* compiled from: IoScheduler */
    static final class C12509c extends C12511h {

        /* renamed from: V */
        private long f28996V = 0;

        C12509c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo30626a(long j) {
            this.f28996V = j;
        }

        /* renamed from: b */
        public long mo30627b() {
            return this.f28996V;
        }
    }

    static {
        f28982h.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f28978d = new C12513j("RxCachedThreadScheduler", max);
        f28979e = new C12513j("RxCachedWorkerPoolEvictor", max);
        f28983i.mo30624d();
    }

    public C12506f() {
        this(f28978d);
    }

    /* renamed from: a */
    public C11972c mo30292a() {
        return new C12508b((C12507a) this.f28985c.get());
    }

    /* renamed from: b */
    public void mo30619b() {
        C12507a aVar = new C12507a(f28980f, f28981g, this.f28984b);
        if (!this.f28985c.compareAndSet(f28983i, aVar)) {
            aVar.mo30624d();
        }
    }

    public C12506f(ThreadFactory threadFactory) {
        this.f28984b = threadFactory;
        this.f28985c = new AtomicReference<>(f28983i);
        mo30619b();
    }
}
