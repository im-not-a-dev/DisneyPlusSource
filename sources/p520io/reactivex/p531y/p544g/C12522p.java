package p520io.reactivex.p531y.p544g;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.g.p */
/* compiled from: SingleScheduler */
public final class C12522p extends C11969r {

    /* renamed from: c */
    static final C12513j f29015c = new C12513j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: d */
    static final ScheduledExecutorService f29016d = Executors.newScheduledThreadPool(0);

    /* renamed from: b */
    final AtomicReference<ScheduledExecutorService> f29017b;

    /* renamed from: io.reactivex.y.g.p$a */
    /* compiled from: SingleScheduler */
    static final class C12523a extends C11972c {

        /* renamed from: U */
        final CompositeDisposable f29018U = new CompositeDisposable();

        /* renamed from: V */
        volatile boolean f29019V;

        /* renamed from: c */
        final ScheduledExecutorService f29020c;

        C12523a(ScheduledExecutorService scheduledExecutorService) {
            this.f29020c = scheduledExecutorService;
        }

        /* renamed from: a */
        public Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f29019V) {
                return C12011d.INSTANCE;
            }
            C12517m mVar = new C12517m(C11915a.m38459a(runnable), this.f29018U);
            this.f29018U.mo30250b(mVar);
            if (j <= 0) {
                try {
                    future = this.f29020c.submit(mVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C11915a.m38466b((Throwable) e);
                    return C12011d.INSTANCE;
                }
            } else {
                future = this.f29020c.schedule(mVar, j, timeUnit);
            }
            mVar.mo30636a(future);
            return mVar;
        }

        public void dispose() {
            if (!this.f29019V) {
                this.f29019V = true;
                this.f29018U.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f29019V;
        }
    }

    static {
        f29016d.shutdown();
    }

    public C12522p() {
        this(f29015c);
    }

    /* renamed from: a */
    static ScheduledExecutorService m39278a(ThreadFactory threadFactory) {
        return C12519o.m39273a(threadFactory);
    }

    public C12522p(ThreadFactory threadFactory) {
        this.f29017b = new AtomicReference<>();
        this.f29017b.lazySet(m39278a(threadFactory));
    }

    /* renamed from: a */
    public C11972c mo30292a() {
        return new C12523a((ScheduledExecutorService) this.f29017b.get());
    }

    /* renamed from: a */
    public Disposable mo30291a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C12516l lVar = new C12516l(C11915a.m38459a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f29017b.get()).submit(lVar);
            } catch (RejectedExecutionException e) {
                C11915a.m38466b((Throwable) e);
                return C12011d.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f29017b.get()).schedule(lVar, j, timeUnit);
        }
        lVar.mo30600a(future);
        return lVar;
    }

    /* renamed from: a */
    public Disposable mo30290a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C11915a.m38459a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f29017b.get();
            C12505e eVar = new C12505e(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C11915a.m38466b((Throwable) e);
                    return C12011d.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(eVar, j, timeUnit);
            }
            eVar.mo30616a(future);
            return eVar;
        }
        C12515k kVar = new C12515k(a);
        try {
            kVar.mo30600a(((ScheduledExecutorService) this.f29017b.get()).scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e2) {
            C11915a.m38466b((Throwable) e2);
            return C12011d.INSTANCE;
        }
    }
}
