package p520io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.disposables.c */
/* compiled from: ReferenceDisposable */
abstract class C11930c<T> extends AtomicReference<T> implements Disposable {
    C11930c(T t) {
        C12036b.m38663a(t, "value is null");
        super(t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30253a(T t);

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo30253a(andSet);
            }
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
