package p520io.reactivex.p521a0;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p547j.C12546f;

/* renamed from: io.reactivex.a0.b */
/* compiled from: DisposableObserver */
public abstract class C11909b<T> implements C11968q<T>, Disposable {
    final AtomicReference<Disposable> upstream = new AtomicReference<>();

    public final void dispose() {
        C12010c.m38621a(this.upstream);
    }

    public final boolean isDisposed() {
        return this.upstream.get() == C12010c.DISPOSED;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(Disposable disposable) {
        if (C12546f.m39348a(this.upstream, disposable, getClass())) {
            onStart();
        }
    }
}
