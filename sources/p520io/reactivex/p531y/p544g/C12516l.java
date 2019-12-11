package p520io.reactivex.p531y.p544g;

import java.util.concurrent.Callable;

/* renamed from: io.reactivex.y.g.l */
/* compiled from: ScheduledDirectTask */
public final class C12516l extends C12492a implements Callable<Void> {
    public C12516l(Runnable runnable) {
        super(runnable);
    }

    public Void call() throws Exception {
        this.f28935U = Thread.currentThread();
        try {
            this.f28936c.run();
            return null;
        } finally {
            lazySet(C12492a.f28933V);
            this.f28935U = null;
        }
    }
}
