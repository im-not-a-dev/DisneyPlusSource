package p520io.reactivex.p531y.p544g;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p533b.C12015a;

/* renamed from: io.reactivex.y.g.e */
/* compiled from: InstantPeriodicTask */
final class C12505e implements Callable<Void>, Disposable {

    /* renamed from: Y */
    static final FutureTask<Void> f28972Y = new FutureTask<>(C12015a.f27743b, null);

    /* renamed from: U */
    final AtomicReference<Future<?>> f28973U = new AtomicReference<>();

    /* renamed from: V */
    final AtomicReference<Future<?>> f28974V = new AtomicReference<>();

    /* renamed from: W */
    final ExecutorService f28975W;

    /* renamed from: X */
    Thread f28976X;

    /* renamed from: c */
    final Runnable f28977c;

    C12505e(Runnable runnable, ExecutorService executorService) {
        this.f28977c = runnable;
        this.f28975W = executorService;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30616a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f28974V.get();
            if (future2 == f28972Y) {
                future.cancel(this.f28976X != Thread.currentThread());
                return;
            }
        } while (!this.f28974V.compareAndSet(future2, future));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30617b(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f28973U.get();
            if (future2 == f28972Y) {
                future.cancel(this.f28976X != Thread.currentThread());
                return;
            }
        } while (!this.f28973U.compareAndSet(future2, future));
    }

    public void dispose() {
        Future future = (Future) this.f28974V.getAndSet(f28972Y);
        boolean z = true;
        if (!(future == null || future == f28972Y)) {
            future.cancel(this.f28976X != Thread.currentThread());
        }
        Future future2 = (Future) this.f28973U.getAndSet(f28972Y);
        if (future2 != null && future2 != f28972Y) {
            if (this.f28976X == Thread.currentThread()) {
                z = false;
            }
            future2.cancel(z);
        }
    }

    public boolean isDisposed() {
        return this.f28974V.get() == f28972Y;
    }

    public Void call() throws Exception {
        this.f28976X = Thread.currentThread();
        try {
            this.f28977c.run();
            mo30617b(this.f28975W.submit(this));
            this.f28976X = null;
        } catch (Throwable th) {
            this.f28976X = null;
            C11915a.m38466b(th);
        }
        return null;
    }
}
