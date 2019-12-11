package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p163g.p503n.p504a.p508g0.C11819e;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p521a0.C11908a;

/* renamed from: g.n.a.t */
/* compiled from: AutoDisposingSubscriberImpl */
final class C11836t<T> extends AtomicInteger implements C11819e<T> {

    /* renamed from: U */
    final AtomicReference<Disposable> f27484U = new AtomicReference<>();

    /* renamed from: V */
    private final C11789c f27485V = new C11789c();

    /* renamed from: W */
    private final AtomicReference<C14314c> f27486W = new AtomicReference<>();

    /* renamed from: X */
    private final AtomicLong f27487X = new AtomicLong();

    /* renamed from: Y */
    private final CompletableSource f27488Y;

    /* renamed from: Z */
    private final Subscriber<? super T> f27489Z;

    /* renamed from: c */
    final AtomicReference<C14314c> f27490c = new AtomicReference<>();

    /* renamed from: g.n.a.t$a */
    /* compiled from: AutoDisposingSubscriberImpl */
    class C11837a extends C11908a {
        C11837a() {
        }

        public void onComplete() {
            C11836t.this.f27484U.lazySet(C11791d.DISPOSED);
            C11838u.m37979a(C11836t.this.f27490c);
        }

        public void onError(Throwable th) {
            C11836t.this.f27484U.lazySet(C11791d.DISPOSED);
            C11836t.this.onError(th);
        }
    }

    C11836t(CompletableSource completableSource, Subscriber<? super T> subscriber) {
        this.f27488Y = completableSource;
        this.f27489Z = subscriber;
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        C11837a aVar = new C11837a();
        if (C11821i.m37965a(this.f27484U, (Disposable) aVar, C11836t.class)) {
            this.f27489Z.mo29945a(this);
            this.f27488Y.subscribe(aVar);
            if (C11821i.m37966a(this.f27490c, cVar, C11836t.class)) {
                C11838u.m37980a(this.f27486W, this.f27487X, cVar);
            }
        }
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        C11838u.m37977a(this.f27486W, this.f27487X, j);
    }

    public void cancel() {
        C11791d.m37928a(this.f27484U);
        C11838u.m37979a(this.f27490c);
    }

    public void dispose() {
        cancel();
    }

    public boolean isDisposed() {
        return this.f27490c.get() == C11838u.CANCELLED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            this.f27490c.lazySet(C11838u.CANCELLED);
            C11791d.m37928a(this.f27484U);
            C11843y.m37990a(this.f27489Z, (AtomicInteger) this, this.f27485V);
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            this.f27490c.lazySet(C11838u.CANCELLED);
            C11791d.m37928a(this.f27484U);
            C11843y.m37989a(this.f27489Z, th, (AtomicInteger) this, this.f27485V);
        }
    }

    public void onNext(T t) {
        if (!isDisposed() && C11843y.m37992a(this.f27489Z, t, (AtomicInteger) this, this.f27485V)) {
            this.f27490c.lazySet(C11838u.CANCELLED);
            C11791d.m37928a(this.f27484U);
        }
    }
}
