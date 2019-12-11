package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicReference;
import p163g.p503n.p504a.p508g0.C11816b;
import p520io.reactivex.C11958l;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p521a0.C11908a;

/* renamed from: g.n.a.q */
/* compiled from: AutoDisposingMaybeObserverImpl */
final class C11830q<T> implements C11816b<T> {

    /* renamed from: U */
    final AtomicReference<Disposable> f27468U = new AtomicReference<>();

    /* renamed from: V */
    private final CompletableSource f27469V;

    /* renamed from: W */
    private final C11958l<? super T> f27470W;

    /* renamed from: c */
    final AtomicReference<Disposable> f27471c = new AtomicReference<>();

    /* renamed from: g.n.a.q$a */
    /* compiled from: AutoDisposingMaybeObserverImpl */
    class C11831a extends C11908a {
        C11831a() {
        }

        public void onComplete() {
            C11830q.this.f27468U.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(C11830q.this.f27471c);
        }

        public void onError(Throwable th) {
            C11830q.this.f27468U.lazySet(C11791d.DISPOSED);
            C11830q.this.onError(th);
        }
    }

    C11830q(CompletableSource completableSource, C11958l<? super T> lVar) {
        this.f27469V = completableSource;
        this.f27470W = lVar;
    }

    public void dispose() {
        C11791d.m37928a(this.f27468U);
        C11791d.m37928a(this.f27471c);
    }

    public boolean isDisposed() {
        return this.f27471c.get() == C11791d.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            this.f27471c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27468U);
            this.f27470W.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            this.f27471c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27468U);
            this.f27470W.onError(th);
        }
    }

    public void onSubscribe(Disposable disposable) {
        Class<C11830q> cls = C11830q.class;
        C11831a aVar = new C11831a();
        if (C11821i.m37965a(this.f27468U, (Disposable) aVar, cls)) {
            this.f27470W.onSubscribe(this);
            this.f27469V.subscribe(aVar);
            C11821i.m37965a(this.f27471c, disposable, cls);
        }
    }

    public void onSuccess(T t) {
        if (!isDisposed()) {
            this.f27471c.lazySet(C11791d.DISPOSED);
            C11791d.m37928a(this.f27468U);
            this.f27470W.onSuccess(t);
        }
    }
}
