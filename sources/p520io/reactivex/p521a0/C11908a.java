package p520io.reactivex.p521a0;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p547j.C12546f;

/* renamed from: io.reactivex.a0.a */
/* compiled from: DisposableCompletableObserver */
public abstract class C11908a implements CompletableObserver, Disposable {

    /* renamed from: c */
    final AtomicReference<Disposable> f27570c = new AtomicReference<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30239a() {
    }

    public final void dispose() {
        C12010c.m38621a(this.f27570c);
    }

    public final boolean isDisposed() {
        return this.f27570c.get() == C12010c.DISPOSED;
    }

    public final void onSubscribe(Disposable disposable) {
        if (C12546f.m39348a(this.f27570c, disposable, getClass())) {
            mo30239a();
        }
    }
}
