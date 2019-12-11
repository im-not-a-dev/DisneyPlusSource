package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicReference;
import p163g.p503n.p504a.p508g0.C11815a;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p521a0.C11908a;

/* renamed from: g.n.a.p */
/* compiled from: AutoDisposingCompletableObserverImpl */
final class C11828p implements C11815a {

    /* renamed from: U */
    final AtomicReference<Disposable> f27463U = new AtomicReference<>();

    /* renamed from: V */
    private final CompletableSource f27464V;

    /* renamed from: W */
    private final CompletableObserver f27465W;

    /* renamed from: c */
    final AtomicReference<Disposable> f27466c = new AtomicReference<>();

    /* renamed from: g.n.a.p$a */
    /* compiled from: AutoDisposingCompletableObserverImpl */
    class C11829a extends C11908a {
        C11829a() {
        }

        public void onComplete() {
            C11828p.this.f27463U.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(C11828p.this.f27466c);
        }

        public void onError(Throwable th) {
            C11828p.this.f27463U.lazySet(C11791d.DISPOSED);
            C11828p.this.onError(th);
        }
    }

    C11828p(CompletableSource completableSource, CompletableObserver completableObserver) {
        this.f27464V = completableSource;
        this.f27465W = completableObserver;
    }

    public void dispose() {
        C11791d.m37928a(this.f27463U);
        C11791d.m37928a(this.f27466c);
    }

    public boolean isDisposed() {
        return this.f27466c.get() == C11791d.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            this.f27466c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27463U);
            this.f27465W.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            this.f27466c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27463U);
            this.f27465W.onError(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        Class<C11828p> cls = C11828p.class;
        C11829a aVar = new C11829a();
        if (C11821i.m37965a(this.f27463U, (Disposable) aVar, cls)) {
            this.f27465W.onSubscribe(this);
            this.f27464V.subscribe(aVar);
            C11821i.m37965a(this.f27466c, disposable, cls);
        }
    }
}
