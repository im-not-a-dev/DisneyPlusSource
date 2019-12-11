package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import p520io.reactivex.C11955i;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.a.m */
/* compiled from: CompletableMerge */
public final class C12082m extends Completable {

    /* renamed from: U */
    final int f27812U;

    /* renamed from: V */
    final boolean f27813V;

    /* renamed from: c */
    final C14313b<? extends CompletableSource> f27814c;

    /* renamed from: io.reactivex.y.e.a.m$a */
    /* compiled from: CompletableMerge */
    static final class C12083a extends AtomicInteger implements C11955i<CompletableSource>, Disposable {

        /* renamed from: U */
        final int f27815U;

        /* renamed from: V */
        final boolean f27816V;

        /* renamed from: W */
        final C12543c f27817W = new C12543c();

        /* renamed from: X */
        final CompositeDisposable f27818X = new CompositeDisposable();

        /* renamed from: Y */
        C14314c f27819Y;

        /* renamed from: c */
        final CompletableObserver f27820c;

        /* renamed from: io.reactivex.y.e.a.m$a$a */
        /* compiled from: CompletableMerge */
        final class C12084a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            C12084a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onComplete() {
                C12083a.this.mo30383a(this);
            }

            public void onError(Throwable th) {
                C12083a.this.mo30384a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }
        }

        C12083a(CompletableObserver completableObserver, int i, boolean z) {
            this.f27820c = completableObserver;
            this.f27815U = i;
            this.f27816V = z;
            lazySet(1);
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f27819Y, cVar)) {
                this.f27819Y = cVar;
                this.f27820c.onSubscribe(this);
                int i = this.f27815U;
                if (i == Integer.MAX_VALUE) {
                    cVar.mo29946b(Long.MAX_VALUE);
                } else {
                    cVar.mo29946b((long) i);
                }
            }
        }

        public void dispose() {
            this.f27819Y.cancel();
            this.f27818X.dispose();
        }

        public boolean isDisposed() {
            return this.f27818X.isDisposed();
        }

        public void onComplete() {
            if (decrementAndGet() != 0) {
                return;
            }
            if (((Throwable) this.f27817W.get()) != null) {
                this.f27820c.onError(this.f27817W.mo30668a());
            } else {
                this.f27820c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f27816V) {
                this.f27818X.dispose();
                if (!this.f27817W.mo30669a(th)) {
                    C11915a.m38466b(th);
                } else if (getAndSet(0) > 0) {
                    this.f27820c.onError(this.f27817W.mo30668a());
                }
            } else if (!this.f27817W.mo30669a(th)) {
                C11915a.m38466b(th);
            } else if (decrementAndGet() == 0) {
                this.f27820c.onError(this.f27817W.mo30668a());
            }
        }

        /* renamed from: a */
        public void onNext(CompletableSource completableSource) {
            getAndIncrement();
            C12084a aVar = new C12084a();
            this.f27818X.mo30250b(aVar);
            completableSource.subscribe(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30384a(C12084a aVar, Throwable th) {
            this.f27818X.mo30251c(aVar);
            if (!this.f27816V) {
                this.f27819Y.cancel();
                this.f27818X.dispose();
                if (!this.f27817W.mo30669a(th)) {
                    C11915a.m38466b(th);
                } else if (getAndSet(0) > 0) {
                    this.f27820c.onError(this.f27817W.mo30668a());
                }
            } else if (!this.f27817W.mo30669a(th)) {
                C11915a.m38466b(th);
            } else if (decrementAndGet() == 0) {
                this.f27820c.onError(this.f27817W.mo30668a());
            } else if (this.f27815U != Integer.MAX_VALUE) {
                this.f27819Y.mo29946b(1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30383a(C12084a aVar) {
            this.f27818X.mo30251c(aVar);
            if (decrementAndGet() == 0) {
                Throwable th = (Throwable) this.f27817W.get();
                if (th != null) {
                    this.f27820c.onError(th);
                } else {
                    this.f27820c.onComplete();
                }
            } else if (this.f27815U != Integer.MAX_VALUE) {
                this.f27819Y.mo29946b(1);
            }
        }
    }

    public C12082m(C14313b<? extends CompletableSource> bVar, int i, boolean z) {
        this.f27814c = bVar;
        this.f27812U = i;
        this.f27813V = z;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27814c.subscribe(new C12083a(completableObserver, this.f27812U, this.f27813V));
    }
}
