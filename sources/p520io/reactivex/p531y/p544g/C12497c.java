package p520io.reactivex.p531y.p544g;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.y.g.c */
/* compiled from: DisposeOnCancel */
final class C12497c implements Future<Object> {

    /* renamed from: c */
    final Disposable f28951c;

    C12497c(Disposable disposable) {
        this.f28951c = disposable;
    }

    public boolean cancel(boolean z) {
        this.f28951c.dispose();
        return false;
    }

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }
}
