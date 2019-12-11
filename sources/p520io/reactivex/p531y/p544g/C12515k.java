package p520io.reactivex.p531y.p544g;

import p520io.reactivex.p523c0.C11915a;

/* renamed from: io.reactivex.y.g.k */
/* compiled from: ScheduledDirectPeriodicTask */
public final class C12515k extends C12492a implements Runnable {
    public C12515k(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.f28935U = Thread.currentThread();
        try {
            this.f28936c.run();
            this.f28935U = null;
        } catch (Throwable th) {
            this.f28935U = null;
            lazySet(C12492a.f28933V);
            C11915a.m38466b(th);
        }
    }
}
