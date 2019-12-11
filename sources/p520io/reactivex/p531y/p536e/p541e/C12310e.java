package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p521a0.C11911d;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12046i;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p547j.C12543c;
import p520io.reactivex.p531y.p547j.C12547g;

/* renamed from: io.reactivex.y.e.e.e */
/* compiled from: ObservableConcatMap */
public final class C12310e<T, U> extends C12294a<T, U> {

    /* renamed from: U */
    final Function<? super T, ? extends ObservableSource<? extends U>> f28417U;

    /* renamed from: V */
    final int f28418V;

    /* renamed from: W */
    final C12547g f28419W;

    /* renamed from: io.reactivex.y.e.e.e$a */
    /* compiled from: ObservableConcatMap */
    static final class C12311a<T, R> extends AtomicInteger implements C11968q<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends ObservableSource<? extends R>> f28420U;

        /* renamed from: V */
        final int f28421V;

        /* renamed from: W */
        final C12543c f28422W = new C12543c();

        /* renamed from: X */
        final C12312a<R> f28423X;

        /* renamed from: Y */
        final boolean f28424Y;

        /* renamed from: Z */
        C12051n<T> f28425Z;

        /* renamed from: a0 */
        Disposable f28426a0;

        /* renamed from: b0 */
        volatile boolean f28427b0;

        /* renamed from: c */
        final C11968q<? super R> f28428c;

        /* renamed from: c0 */
        volatile boolean f28429c0;

        /* renamed from: d0 */
        volatile boolean f28430d0;

        /* renamed from: e0 */
        int f28431e0;

        /* renamed from: io.reactivex.y.e.e.e$a$a */
        /* compiled from: ObservableConcatMap */
        static final class C12312a<R> extends AtomicReference<Disposable> implements C11968q<R> {

            /* renamed from: U */
            final C12311a<?, R> f28432U;

            /* renamed from: c */
            final C11968q<? super R> f28433c;

            C12312a(C11968q<? super R> qVar, C12311a<?, R> aVar) {
                this.f28433c = qVar;
                this.f28432U = aVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo30479a() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public void onComplete() {
                C12311a<?, R> aVar = this.f28432U;
                aVar.f28427b0 = false;
                aVar.mo30478a();
            }

            public void onError(Throwable th) {
                C12311a<?, R> aVar = this.f28432U;
                if (aVar.f28422W.mo30669a(th)) {
                    if (!aVar.f28424Y) {
                        aVar.f28426a0.dispose();
                    }
                    aVar.f28427b0 = false;
                    aVar.mo30478a();
                    return;
                }
                C11915a.m38466b(th);
            }

            public void onNext(R r) {
                this.f28433c.onNext(r);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
            }
        }

        C12311a(C11968q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.f28428c = qVar;
            this.f28420U = function;
            this.f28421V = i;
            this.f28424Y = z;
            this.f28423X = new C12312a<>(qVar, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30478a() {
            if (getAndIncrement() == 0) {
                C11968q<? super R> qVar = this.f28428c;
                C12051n<T> nVar = this.f28425Z;
                C12543c cVar = this.f28422W;
                while (true) {
                    if (!this.f28427b0) {
                        if (this.f28430d0) {
                            nVar.clear();
                            return;
                        } else if (this.f28424Y || ((Throwable) cVar.get()) == null) {
                            boolean z = this.f28429c0;
                            try {
                                Object poll = nVar.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    this.f28430d0 = true;
                                    Throwable a = cVar.mo30668a();
                                    if (a != null) {
                                        qVar.onError(a);
                                    } else {
                                        qVar.onComplete();
                                    }
                                    return;
                                } else if (!z2) {
                                    try {
                                        Object apply = this.f28420U.apply(poll);
                                        C12036b.m38663a(apply, "The mapper returned a null ObservableSource");
                                        ObservableSource observableSource = (ObservableSource) apply;
                                        if (observableSource instanceof Callable) {
                                            try {
                                                Object call = ((Callable) observableSource).call();
                                                if (call != null && !this.f28430d0) {
                                                    qVar.onNext(call);
                                                }
                                            } catch (Throwable th) {
                                                C12003b.m38614b(th);
                                                cVar.mo30669a(th);
                                            }
                                        } else {
                                            this.f28427b0 = true;
                                            observableSource.mo30162a(this.f28423X);
                                        }
                                    } catch (Throwable th2) {
                                        C12003b.m38614b(th2);
                                        this.f28430d0 = true;
                                        this.f28426a0.dispose();
                                        nVar.clear();
                                        cVar.mo30669a(th2);
                                        qVar.onError(cVar.mo30668a());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C12003b.m38614b(th3);
                                this.f28430d0 = true;
                                this.f28426a0.dispose();
                                cVar.mo30669a(th3);
                                qVar.onError(cVar.mo30668a());
                                return;
                            }
                        } else {
                            nVar.clear();
                            this.f28430d0 = true;
                            qVar.onError(cVar.mo30668a());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.f28430d0 = true;
            this.f28426a0.dispose();
            this.f28423X.mo30479a();
        }

        public boolean isDisposed() {
            return this.f28430d0;
        }

        public void onComplete() {
            this.f28429c0 = true;
            mo30478a();
        }

        public void onError(Throwable th) {
            if (this.f28422W.mo30669a(th)) {
                this.f28429c0 = true;
                mo30478a();
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            if (this.f28431e0 == 0) {
                this.f28425Z.offer(t);
            }
            mo30478a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28426a0, disposable)) {
                this.f28426a0 = disposable;
                if (disposable instanceof C12046i) {
                    C12046i iVar = (C12046i) disposable;
                    int a = iVar.mo30285a(3);
                    if (a == 1) {
                        this.f28431e0 = a;
                        this.f28425Z = iVar;
                        this.f28429c0 = true;
                        this.f28428c.onSubscribe(this);
                        mo30478a();
                        return;
                    } else if (a == 2) {
                        this.f28431e0 = a;
                        this.f28425Z = iVar;
                        this.f28428c.onSubscribe(this);
                        return;
                    }
                }
                this.f28425Z = new C12491c(this.f28421V);
                this.f28428c.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.y.e.e.e$b */
    /* compiled from: ObservableConcatMap */
    static final class C12313b<T, U> extends AtomicInteger implements C11968q<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends ObservableSource<? extends U>> f28434U;

        /* renamed from: V */
        final C12314a<U> f28435V;

        /* renamed from: W */
        final int f28436W;

        /* renamed from: X */
        C12051n<T> f28437X;

        /* renamed from: Y */
        Disposable f28438Y;

        /* renamed from: Z */
        volatile boolean f28439Z;

        /* renamed from: a0 */
        volatile boolean f28440a0;

        /* renamed from: b0 */
        volatile boolean f28441b0;

        /* renamed from: c */
        final C11968q<? super U> f28442c;

        /* renamed from: c0 */
        int f28443c0;

        /* renamed from: io.reactivex.y.e.e.e$b$a */
        /* compiled from: ObservableConcatMap */
        static final class C12314a<U> extends AtomicReference<Disposable> implements C11968q<U> {

            /* renamed from: U */
            final C12313b<?, ?> f28444U;

            /* renamed from: c */
            final C11968q<? super U> f28445c;

            C12314a(C11968q<? super U> qVar, C12313b<?, ?> bVar) {
                this.f28445c = qVar;
                this.f28444U = bVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo30482a() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public void onComplete() {
                this.f28444U.mo30481b();
            }

            public void onError(Throwable th) {
                this.f28444U.dispose();
                this.f28445c.onError(th);
            }

            public void onNext(U u) {
                this.f28445c.onNext(u);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
            }
        }

        C12313b(C11968q<? super U> qVar, Function<? super T, ? extends ObservableSource<? extends U>> function, int i) {
            this.f28442c = qVar;
            this.f28434U = function;
            this.f28436W = i;
            this.f28435V = new C12314a<>(qVar, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30480a() {
            if (getAndIncrement() == 0) {
                while (!this.f28440a0) {
                    if (!this.f28439Z) {
                        boolean z = this.f28441b0;
                        try {
                            Object poll = this.f28437X.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f28440a0 = true;
                                this.f28442c.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.f28434U.apply(poll);
                                    C12036b.m38663a(apply, "The mapper returned a null ObservableSource");
                                    ObservableSource observableSource = (ObservableSource) apply;
                                    this.f28439Z = true;
                                    observableSource.mo30162a(this.f28435V);
                                } catch (Throwable th) {
                                    C12003b.m38614b(th);
                                    dispose();
                                    this.f28437X.clear();
                                    this.f28442c.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            C12003b.m38614b(th2);
                            dispose();
                            this.f28437X.clear();
                            this.f28442c.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f28437X.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30481b() {
            this.f28439Z = false;
            mo30480a();
        }

        public void dispose() {
            this.f28440a0 = true;
            this.f28435V.mo30482a();
            this.f28438Y.dispose();
            if (getAndIncrement() == 0) {
                this.f28437X.clear();
            }
        }

        public boolean isDisposed() {
            return this.f28440a0;
        }

        public void onComplete() {
            if (!this.f28441b0) {
                this.f28441b0 = true;
                mo30480a();
            }
        }

        public void onError(Throwable th) {
            if (this.f28441b0) {
                C11915a.m38466b(th);
                return;
            }
            this.f28441b0 = true;
            dispose();
            this.f28442c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28441b0) {
                if (this.f28443c0 == 0) {
                    this.f28437X.offer(t);
                }
                mo30480a();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28438Y, disposable)) {
                this.f28438Y = disposable;
                if (disposable instanceof C12046i) {
                    C12046i iVar = (C12046i) disposable;
                    int a = iVar.mo30285a(3);
                    if (a == 1) {
                        this.f28443c0 = a;
                        this.f28437X = iVar;
                        this.f28441b0 = true;
                        this.f28442c.onSubscribe(this);
                        mo30480a();
                        return;
                    } else if (a == 2) {
                        this.f28443c0 = a;
                        this.f28437X = iVar;
                        this.f28442c.onSubscribe(this);
                        return;
                    }
                }
                this.f28437X = new C12491c(this.f28436W);
                this.f28442c.onSubscribe(this);
            }
        }
    }

    public C12310e(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, int i, C12547g gVar) {
        super(observableSource);
        this.f28417U = function;
        this.f28419W = gVar;
        this.f28418V = Math.max(8, i);
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super U> qVar) {
        if (!C12372p0.m39091a(this.f28379c, qVar, this.f28417U)) {
            C12547g gVar = this.f28419W;
            if (gVar == C12547g.IMMEDIATE) {
                this.f28379c.mo30162a(new C12313b(new C11911d(qVar), this.f28417U, this.f28418V));
            } else {
                this.f28379c.mo30162a(new C12311a(qVar, this.f28417U, this.f28418V, gVar == C12547g.END));
            }
        }
    }
}
