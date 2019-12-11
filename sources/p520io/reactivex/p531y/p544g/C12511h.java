package p520io.reactivex.p531y.p544g;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12009b;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.g.h */
/* compiled from: NewThreadWorker */
public class C12511h extends C11972c implements Disposable {

    /* renamed from: U */
    volatile boolean f28999U;

    /* renamed from: c */
    private final ScheduledExecutorService f29000c;

    public C12511h(ThreadFactory threadFactory) {
        this.f29000c = C12519o.m39273a(threadFactory);
    }

    /* renamed from: a */
    public Disposable mo30296a(Runnable runnable) {
        return mo30298a(runnable, 0, null);
    }

    /* renamed from: b */
    public Disposable mo30631b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C12516l lVar = new C12516l(C11915a.m38459a(runnable));
        if (j <= 0) {
            try {
                future = this.f29000c.submit(lVar);
            } catch (RejectedExecutionException e) {
                C11915a.m38466b((Throwable) e);
                return C12011d.INSTANCE;
            }
        } else {
            future = this.f29000c.schedule(lVar, j, timeUnit);
        }
        lVar.mo30600a(future);
        return lVar;
    }

    public void dispose() {
        if (!this.f28999U) {
            this.f28999U = true;
            this.f29000c.shutdownNow();
        }
    }

    public boolean isDisposed() {
        return this.f28999U;
    }

    /* renamed from: a */
    public Disposable mo30298a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f28999U) {
            return C12011d.INSTANCE;
        }
        return mo30628a(runnable, j, timeUnit, null);
    }

    /* renamed from: a */
    public C12517m mo30628a(Runnable runnable, long j, TimeUnit timeUnit, C12009b bVar) {
        Future future;
        C12517m mVar = new C12517m(C11915a.m38459a(runnable), bVar);
        if (bVar != null && !bVar.mo30250b(mVar)) {
            return mVar;
        }
        if (j <= 0) {
            try {
                future = this.f29000c.submit(mVar);
            } catch (RejectedExecutionException e) {
                if (bVar != null) {
                    bVar.mo30249a(mVar);
                }
                C11915a.m38466b((Throwable) e);
            }
        } else {
            future = this.f29000c.schedule(mVar, j, timeUnit);
        }
        mVar.mo30636a(future);
        return mVar;
    }

    /* renamed from: b */
    public Disposable mo30630b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C11915a.m38459a(runnable);
        if (j2 <= 0) {
            C12505e eVar = new C12505e(a, this.f29000c);
            if (j <= 0) {
                try {
                    future = this.f29000c.submit(eVar);
                } catch (RejectedExecutionException e) {
                    C11915a.m38466b((Throwable) e);
                    return C12011d.INSTANCE;
                }
            } else {
                future = this.f29000c.schedule(eVar, j, timeUnit);
            }
            eVar.mo30616a(future);
            return eVar;
        }
        C12515k kVar = new C12515k(a);
        try {
            kVar.mo30600a(this.f29000c.scheduleAtFixedRate(kVar, j, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e2) {
            C11915a.m38466b((Throwable) e2);
            return C12011d.INSTANCE;
        }
    }

    /* renamed from: a */
    public void mo30629a() {
        if (!this.f28999U) {
            this.f28999U = true;
            this.f29000c.shutdown();
        }
    }
}
