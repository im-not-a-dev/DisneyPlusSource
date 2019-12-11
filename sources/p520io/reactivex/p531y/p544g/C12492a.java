package p520io.reactivex.p531y.p544g;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p525e0.C11933a;
import p520io.reactivex.p531y.p533b.C12015a;

/* renamed from: io.reactivex.y.g.a */
/* compiled from: AbstractDirectTask */
abstract class C12492a extends AtomicReference<Future<?>> implements Disposable, C11933a {

    /* renamed from: V */
    protected static final FutureTask<Void> f28933V = new FutureTask<>(C12015a.f27743b, null);

    /* renamed from: W */
    protected static final FutureTask<Void> f28934W = new FutureTask<>(C12015a.f27743b, null);

    /* renamed from: U */
    protected Thread f28935U;

    /* renamed from: c */
    protected final Runnable f28936c;

    C12492a(Runnable runnable) {
        this.f28936c = runnable;
    }

    /* renamed from: a */
    public final void mo30600a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f28933V) {
                if (future2 == f28934W) {
                    future.cancel(this.f28935U != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public final void dispose() {
        Future future = (Future) get();
        if (future != f28933V) {
            FutureTask<Void> futureTask = f28934W;
            if (future != futureTask && compareAndSet(future, futureTask) && future != null) {
                future.cancel(this.f28935U != Thread.currentThread());
            }
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f28933V || future == f28934W;
    }
}
