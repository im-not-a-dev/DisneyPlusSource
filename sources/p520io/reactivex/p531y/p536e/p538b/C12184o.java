package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import p520io.reactivex.C11955i;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12039b;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.b.o */
/* compiled from: FlowableFlatMapCompletableCompletable */
public final class C12184o<T> extends Completable implements C12039b<T> {

    /* renamed from: U */
    final Function<? super T, ? extends CompletableSource> f28107U;

    /* renamed from: V */
    final int f28108V;

    /* renamed from: W */
    final boolean f28109W;

    /* renamed from: c */
    final Flowable<T> f28110c;

    /* renamed from: io.reactivex.y.e.b.o$a */
    /* compiled from: FlowableFlatMapCompletableCompletable */
    static final class C12185a<T> extends AtomicInteger implements C11955i<T>, Disposable {

        /* renamed from: U */
        final C12543c f28111U = new C12543c();

        /* renamed from: V */
        final Function<? super T, ? extends CompletableSource> f28112V;

        /* renamed from: W */
        final boolean f28113W;

        /* renamed from: X */
        final CompositeDisposable f28114X = new CompositeDisposable();

        /* renamed from: Y */
        final int f28115Y;

        /* renamed from: Z */
        C14314c f28116Z;

        /* renamed from: a0 */
        volatile boolean f28117a0;

        /* renamed from: c */
        final CompletableObserver f28118c;

        /* renamed from: io.reactivex.y.e.b.o$a$a */
        /* compiled from: FlowableFlatMapCompletableCompletable */
        final class C12186a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            C12186a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onComplete() {
                C12185a.this.mo30436a(this);
            }

            public void onError(Throwable th) {
                C12185a.this.mo30437a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }
        }

        C12185a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
            this.f28118c = completableObserver;
            this.f28112V = function;
            this.f28113W = z;
            this.f28115Y = i;
            lazySet(1);
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28116Z, cVar)) {
                this.f28116Z = cVar;
                this.f28118c.onSubscribe(this);
                int i = this.f28115Y;
                if (i == Integer.MAX_VALUE) {
                    cVar.mo29946b(Long.MAX_VALUE);
                } else {
                    cVar.mo29946b((long) i);
                }
            }
        }

        public void dispose() {
            this.f28117a0 = true;
            this.f28116Z.cancel();
            this.f28114X.dispose();
        }

        public boolean isDisposed() {
            return this.f28114X.isDisposed();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a = this.f28111U.mo30668a();
                if (a != null) {
                    this.f28118c.onError(a);
                } else {
                    this.f28118c.onComplete();
                }
            } else if (this.f28115Y != Integer.MAX_VALUE) {
                this.f28116Z.mo29946b(1);
            }
        }

        public void onError(Throwable th) {
            if (!this.f28111U.mo30669a(th)) {
                C11915a.m38466b(th);
            } else if (!this.f28113W) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.f28118c.onError(this.f28111U.mo30668a());
                }
            } else if (decrementAndGet() == 0) {
                this.f28118c.onError(this.f28111U.mo30668a());
            } else if (this.f28115Y != Integer.MAX_VALUE) {
                this.f28116Z.mo29946b(1);
            }
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28112V.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) apply;
                getAndIncrement();
                C12186a aVar = new C12186a();
                if (!this.f28117a0 && this.f28114X.mo30250b(aVar)) {
                    completableSource.subscribe(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28116Z.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30436a(C12186a aVar) {
            this.f28114X.mo30251c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30437a(C12186a aVar, Throwable th) {
            this.f28114X.mo30251c(aVar);
            onError(th);
        }
    }

    public C12184o(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z, int i) {
        this.f28110c = flowable;
        this.f28107U = function;
        this.f28109W = z;
        this.f28108V = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f28110c.mo30080a((C11955i<? super T>) new C12185a<Object>(completableObserver, this.f28107U, this.f28109W, this.f28108V));
    }

    /* renamed from: b */
    public Flowable<T> mo30362b() {
        return C11915a.m38446a((Flowable<T>) new C12179n<T>(this.f28110c, this.f28107U, this.f28109W, this.f28108V));
    }
}
