package p520io.reactivex.p531y.p535d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p521a0.C11910c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12005d;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.d.i */
/* compiled from: EmptyCompletableObserver */
public final class C12060i extends AtomicReference<Disposable> implements CompletableObserver, Disposable, C11910c {
    public void dispose() {
        C12010c.m38621a((AtomicReference<Disposable>) this);
    }

    public boolean isDisposed() {
        return get() == C12010c.DISPOSED;
    }

    public void onComplete() {
        lazySet(C12010c.DISPOSED);
    }

    public void onError(Throwable th) {
        lazySet(C12010c.DISPOSED);
        C11915a.m38466b((Throwable) new C12005d(th));
    }

    public void onSubscribe(Disposable disposable) {
        C12010c.m38624c(this, disposable);
    }
}
