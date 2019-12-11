package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11968q;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.e.u */
/* compiled from: ObservableFlatMapMaybe */
public final class C12393u<T, R> extends C12294a<T, R> {

    /* renamed from: U */
    final Function<? super T, ? extends MaybeSource<? extends R>> f28682U;

    /* renamed from: V */
    final boolean f28683V;

    /* renamed from: io.reactivex.y.e.e.u$a */
    /* compiled from: ObservableFlatMapMaybe */
    static final class C12394a<T, R> extends AtomicInteger implements C11968q<T>, Disposable {

        /* renamed from: U */
        final boolean f28684U;

        /* renamed from: V */
        final CompositeDisposable f28685V = new CompositeDisposable();

        /* renamed from: W */
        final AtomicInteger f28686W = new AtomicInteger(1);

        /* renamed from: X */
        final C12543c f28687X = new C12543c();

        /* renamed from: Y */
        final Function<? super T, ? extends MaybeSource<? extends R>> f28688Y;

        /* renamed from: Z */
        final AtomicReference<C12491c<R>> f28689Z = new AtomicReference<>();

        /* renamed from: a0 */
        Disposable f28690a0;

        /* renamed from: b0 */
        volatile boolean f28691b0;

        /* renamed from: c */
        final C11968q<? super R> f28692c;

        /* renamed from: io.reactivex.y.e.e.u$a$a */
        /* compiled from: ObservableFlatMapMaybe */
        final class C12395a extends AtomicReference<Disposable> implements C11958l<R>, Disposable {
            C12395a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onComplete() {
                C12394a.this.mo30546a(this);
            }

            public void onError(Throwable th) {
                C12394a.this.mo30548a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }

            public void onSuccess(R r) {
                C12394a.this.mo30547a(this, r);
            }
        }

        C12394a(C11968q<? super R> qVar, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
            this.f28692c = qVar;
            this.f28688Y = function;
            this.f28684U = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30547a(C12395a aVar, R r) {
            this.f28685V.mo30251c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.f28692c.onNext(r);
                    if (this.f28686W.decrementAndGet() != 0) {
                        z = false;
                    }
                    C12491c cVar = (C12491c) this.f28689Z.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        mo30550c();
                    }
                    Throwable a = this.f28687X.mo30668a();
                    if (a != null) {
                        this.f28692c.onError(a);
                    } else {
                        this.f28692c.onComplete();
                    }
                    return;
                }
            }
            C12491c d = mo30551d();
            synchronized (d) {
                d.offer(r);
            }
            this.f28686W.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo30550c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30549b() {
            if (getAndIncrement() == 0) {
                mo30550c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30550c() {
            C11968q<? super R> qVar = this.f28692c;
            AtomicInteger atomicInteger = this.f28686W;
            AtomicReference<C12491c<R>> atomicReference = this.f28689Z;
            int i = 1;
            while (!this.f28691b0) {
                if (this.f28684U || ((Throwable) this.f28687X.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    C12491c cVar = (C12491c) atomicReference.get();
                    Object poll = cVar != null ? cVar.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a = this.f28687X.mo30668a();
                        if (a != null) {
                            qVar.onError(a);
                        } else {
                            qVar.onComplete();
                        }
                        return;
                    } else if (z) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        qVar.onNext(poll);
                    }
                } else {
                    Throwable a2 = this.f28687X.mo30668a();
                    mo30545a();
                    qVar.onError(a2);
                    return;
                }
            }
            mo30545a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12491c<R> mo30551d() {
            C12491c<R> cVar;
            do {
                C12491c<R> cVar2 = (C12491c) this.f28689Z.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C12491c<>(Observable.m38313l());
            } while (!this.f28689Z.compareAndSet(null, cVar));
            return cVar;
        }

        public void dispose() {
            this.f28691b0 = true;
            this.f28690a0.dispose();
            this.f28685V.dispose();
        }

        public boolean isDisposed() {
            return this.f28691b0;
        }

        public void onComplete() {
            this.f28686W.decrementAndGet();
            mo30549b();
        }

        public void onError(Throwable th) {
            this.f28686W.decrementAndGet();
            if (this.f28687X.mo30669a(th)) {
                if (!this.f28684U) {
                    this.f28685V.dispose();
                }
                mo30549b();
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28688Y.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) apply;
                this.f28686W.getAndIncrement();
                C12395a aVar = new C12395a();
                if (!this.f28691b0 && this.f28685V.mo30250b(aVar)) {
                    maybeSource.mo30113a(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28690a0.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28690a0, disposable)) {
                this.f28690a0 = disposable;
                this.f28692c.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30548a(C12395a aVar, Throwable th) {
            this.f28685V.mo30251c(aVar);
            if (this.f28687X.mo30669a(th)) {
                if (!this.f28684U) {
                    this.f28690a0.dispose();
                    this.f28685V.dispose();
                }
                this.f28686W.decrementAndGet();
                mo30549b();
                return;
            }
            C11915a.m38466b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30546a(C12395a aVar) {
            this.f28685V.mo30251c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f28686W.decrementAndGet() != 0) {
                        z = false;
                    }
                    C12491c cVar = (C12491c) this.f28689Z.get();
                    if (z && (cVar == null || cVar.isEmpty())) {
                        Throwable a = this.f28687X.mo30668a();
                        if (a != null) {
                            this.f28692c.onError(a);
                        } else {
                            this.f28692c.onComplete();
                        }
                        return;
                    } else if (decrementAndGet() != 0) {
                        mo30550c();
                    } else {
                        return;
                    }
                }
            }
            this.f28686W.decrementAndGet();
            mo30549b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30545a() {
            C12491c cVar = (C12491c) this.f28689Z.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12393u(ObservableSource<T> observableSource, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z) {
        super(observableSource);
        this.f28682U = function;
        this.f28683V = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super R> qVar) {
        this.f28379c.mo30162a(new C12394a(qVar, this.f28682U, this.f28683V));
    }
}
