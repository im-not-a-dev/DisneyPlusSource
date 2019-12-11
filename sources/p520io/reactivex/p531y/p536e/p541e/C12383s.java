package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12053b;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.e.s */
/* compiled from: ObservableFlatMapCompletable */
public final class C12383s<T> extends C12294a<T, T> {

    /* renamed from: U */
    final Function<? super T, ? extends CompletableSource> f28652U;

    /* renamed from: V */
    final boolean f28653V;

    /* renamed from: io.reactivex.y.e.e.s$a */
    /* compiled from: ObservableFlatMapCompletable */
    static final class C12384a<T> extends C12053b<T> implements C11968q<T> {

        /* renamed from: U */
        final C12543c f28654U = new C12543c();

        /* renamed from: V */
        final Function<? super T, ? extends CompletableSource> f28655V;

        /* renamed from: W */
        final boolean f28656W;

        /* renamed from: X */
        final CompositeDisposable f28657X = new CompositeDisposable();

        /* renamed from: Y */
        Disposable f28658Y;

        /* renamed from: Z */
        volatile boolean f28659Z;

        /* renamed from: c */
        final C11968q<? super T> f28660c;

        /* renamed from: io.reactivex.y.e.e.s$a$a */
        /* compiled from: ObservableFlatMapCompletable */
        final class C12385a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            C12385a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onComplete() {
                C12384a.this.mo30541a(this);
            }

            public void onError(Throwable th) {
                C12384a.this.mo30542a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }
        }

        C12384a(C11968q<? super T> qVar, Function<? super T, ? extends CompletableSource> function, boolean z) {
            this.f28660c = qVar;
            this.f28655V = function;
            this.f28656W = z;
            lazySet(1);
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return i & 2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30541a(C12385a aVar) {
            this.f28657X.mo30251c(aVar);
            onComplete();
        }

        public void clear() {
        }

        public void dispose() {
            this.f28659Z = true;
            this.f28658Y.dispose();
            this.f28657X.dispose();
        }

        public boolean isDisposed() {
            return this.f28658Y.isDisposed();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f28654U.mo30668a();
                if (a != null) {
                    this.f28660c.onError(a);
                } else {
                    this.f28660c.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f28654U.mo30669a(th)) {
                C11915a.m38466b(th);
            } else if (!this.f28656W) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f28660c.onError(this.f28654U.mo30668a());
                }
            } else if (decrementAndGet() == 0) {
                this.f28660c.onError(this.f28654U.mo30668a());
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28655V.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) apply;
                getAndIncrement();
                C12385a aVar = new C12385a();
                if (!this.f28659Z && this.f28657X.mo30250b(aVar)) {
                    completableSource.subscribe(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28658Y.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28658Y, disposable)) {
                this.f28658Y = disposable;
                this.f28660c.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30542a(C12385a aVar, Throwable th) {
            this.f28657X.mo30251c(aVar);
            onError(th);
        }
    }

    public C12383s(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z) {
        super(observableSource);
        this.f28652U = function;
        this.f28653V = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12384a(qVar, this.f28652U, this.f28653V));
    }
}
