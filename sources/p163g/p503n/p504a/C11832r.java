package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p163g.p503n.p504a.p508g0.C11817c;
import p520io.reactivex.C11968q;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p521a0.C11908a;

/* renamed from: g.n.a.r */
/* compiled from: AutoDisposingObserverImpl */
final class C11832r<T> extends AtomicInteger implements C11817c<T> {

    /* renamed from: U */
    final AtomicReference<Disposable> f27473U = new AtomicReference<>();

    /* renamed from: V */
    private final C11789c f27474V = new C11789c();

    /* renamed from: W */
    private final CompletableSource f27475W;

    /* renamed from: X */
    private final C11968q<? super T> f27476X;

    /* renamed from: c */
    final AtomicReference<Disposable> f27477c = new AtomicReference<>();

    /* renamed from: g.n.a.r$a */
    /* compiled from: AutoDisposingObserverImpl */
    class C11833a extends C11908a {
        C11833a() {
        }

        public void onComplete() {
            C11832r.this.f27473U.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(C11832r.this.f27477c);
        }

        public void onError(Throwable th) {
            C11832r.this.f27473U.lazySet(C11791d.DISPOSED);
            C11832r.this.onError(th);
        }
    }

    C11832r(CompletableSource completableSource, C11968q<? super T> qVar) {
        this.f27475W = completableSource;
        this.f27476X = qVar;
    }

    public void dispose() {
        C11791d.m37928a(this.f27473U);
        C11791d.m37928a(this.f27477c);
    }

    public boolean isDisposed() {
        return this.f27477c.get() == C11791d.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            this.f27477c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27473U);
            C11843y.m37988a(this.f27476X, (AtomicInteger) this, this.f27474V);
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            this.f27477c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27473U);
            C11843y.m37987a(this.f27476X, th, (AtomicInteger) this, this.f27474V);
        }
    }

    public void onNext(T t) {
        if (!isDisposed() && C11843y.m37991a(this.f27476X, t, (AtomicInteger) this, this.f27474V)) {
            this.f27477c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27473U);
        }
    }

    public void onSubscribe(Disposable disposable) {
        C11833a aVar = new C11833a();
        if (C11821i.m37965a(this.f27473U, (Disposable) aVar, C11832r.class)) {
            this.f27476X.onSubscribe(this);
            this.f27475W.subscribe(aVar);
            C11821i.m37965a(this.f27477c, disposable, C11832r.class);
        }
    }
}
