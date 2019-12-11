package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicReference;
import p163g.p503n.p504a.p508g0.C11818d;
import p520io.reactivex.C11987u;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p521a0.C11908a;

/* renamed from: g.n.a.s */
/* compiled from: AutoDisposingSingleObserverImpl */
final class C11834s<T> implements C11818d<T> {

    /* renamed from: U */
    final AtomicReference<Disposable> f27479U = new AtomicReference<>();

    /* renamed from: V */
    private final CompletableSource f27480V;

    /* renamed from: W */
    private final C11987u<? super T> f27481W;

    /* renamed from: c */
    final AtomicReference<Disposable> f27482c = new AtomicReference<>();

    /* renamed from: g.n.a.s$a */
    /* compiled from: AutoDisposingSingleObserverImpl */
    class C11835a extends C11908a {
        C11835a() {
        }

        public void onComplete() {
            C11834s.this.f27479U.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(C11834s.this.f27482c);
        }

        public void onError(Throwable th) {
            C11834s.this.f27479U.lazySet(C11791d.DISPOSED);
            C11834s.this.onError(th);
        }
    }

    C11834s(CompletableSource completableSource, C11987u<? super T> uVar) {
        this.f27480V = completableSource;
        this.f27481W = uVar;
    }

    public void dispose() {
        C11791d.m37928a(this.f27479U);
        C11791d.m37928a(this.f27482c);
    }

    public boolean isDisposed() {
        return this.f27482c.get() == C11791d.DISPOSED;
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            this.f27482c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27479U);
            this.f27481W.onError(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        Class<C11834s> cls = C11834s.class;
        C11835a aVar = new C11835a();
        if (C11821i.m37965a(this.f27479U, (Disposable) aVar, cls)) {
            this.f27481W.onSubscribe(this);
            this.f27480V.subscribe(aVar);
            C11821i.m37965a(this.f27482c, disposable, cls);
        }
    }

    public void onSuccess(T t) {
        if (!isDisposed()) {
            this.f27482c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27479U);
            this.f27481W.onSuccess(t);
        }
    }
}
