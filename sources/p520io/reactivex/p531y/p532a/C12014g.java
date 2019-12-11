package p520io.reactivex.p531y.p532a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.y.a.g */
/* compiled from: SequentialDisposable */
public final class C12014g extends AtomicReference<Disposable> implements Disposable {
    public C12014g() {
    }

    /* renamed from: a */
    public boolean mo30345a(Disposable disposable) {
        return C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
    }

    /* renamed from: b */
    public boolean mo30346b(Disposable disposable) {
        return C12010c.m38623b(this, disposable);
    }

    public void dispose() {
        C12010c.m38621a((AtomicReference<Disposable>) this);
    }

    public boolean isDisposed() {
        return C12010c.m38619a((Disposable) get());
    }

    public C12014g(Disposable disposable) {
        lazySet(disposable);
    }
}
