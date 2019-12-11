package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12041d;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.e.t */
/* compiled from: ObservableFlatMapCompletableCompletable */
public final class C12388t<T> extends Completable implements C12041d<T> {

    /* renamed from: U */
    final Function<? super T, ? extends CompletableSource> f28666U;

    /* renamed from: V */
    final boolean f28667V;

    /* renamed from: c */
    final ObservableSource<T> f28668c;

    /* renamed from: io.reactivex.y.e.e.t$a */
    /* compiled from: ObservableFlatMapCompletableCompletable */
    static final class C12389a<T> extends AtomicInteger implements Disposable, C11968q<T> {

        /* renamed from: U */
        final C12543c f28669U = new C12543c();

        /* renamed from: V */
        final Function<? super T, ? extends CompletableSource> f28670V;

        /* renamed from: W */
        final boolean f28671W;

        /* renamed from: X */
        final CompositeDisposable f28672X = new CompositeDisposable();

        /* renamed from: Y */
        Disposable f28673Y;

        /* renamed from: Z */
        volatile boolean f28674Z;

        /* renamed from: c */
        final CompletableObserver f28675c;

        /* renamed from: io.reactivex.y.e.e.t$a$a */
        /* compiled from: ObservableFlatMapCompletableCompletable */
        final class C12390a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            C12390a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onComplete() {
                C12389a.this.mo30543a(this);
            }

            public void onError(Throwable th) {
                C12389a.this.mo30544a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }
        }

        C12389a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f28675c = completableObserver;
            this.f28670V = function;
            this.f28671W = z;
            lazySet(1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30543a(C12390a aVar) {
            this.f28672X.mo30251c(aVar);
            onComplete();
        }

        public void dispose() {
            this.f28674Z = true;
            this.f28673Y.dispose();
            this.f28672X.dispose();
        }

        public boolean isDisposed() {
            return this.f28673Y.isDisposed();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f28669U.mo30668a();
                if (a != null) {
                    this.f28675c.onError(a);
                } else {
                    this.f28675c.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f28669U.mo30669a(th)) {
                C11915a.m38466b(th);
            } else if (!this.f28671W) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f28675c.onError(this.f28669U.mo30668a());
                }
            } else if (decrementAndGet() == 0) {
                this.f28675c.onError(this.f28669U.mo30668a());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28670V.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) apply;
                getAndIncrement();
                C12390a aVar = new C12390a();
                if (!this.f28674Z && this.f28672X.mo30250b(aVar)) {
                    completableSource.subscribe(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28673Y.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28673Y, disposable)) {
                this.f28673Y = disposable;
                this.f28675c.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30544a(C12390a aVar, Throwable th) {
            this.f28672X.mo30251c(aVar);
            onError(th);
        }
    }

    public C12388t(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z) {
        this.f28668c = observableSource;
        this.f28666U = function;
        this.f28667V = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f28668c.mo30162a(new C12389a(completableObserver, this.f28666U, this.f28667V));
    }

    /* renamed from: a */
    public Observable<T> mo30364a() {
        return C11915a.m38448a((Observable<T>) new C12383s<T>(this.f28668c, this.f28666U, this.f28667V));
    }
}
