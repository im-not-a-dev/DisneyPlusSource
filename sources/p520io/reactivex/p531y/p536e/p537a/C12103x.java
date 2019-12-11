package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.y.e.a.x */
/* compiled from: CompletableTimeout */
public final class C12103x extends Completable {

    /* renamed from: U */
    final long f27866U;

    /* renamed from: V */
    final TimeUnit f27867V;

    /* renamed from: W */
    final C11969r f27868W;

    /* renamed from: X */
    final CompletableSource f27869X;

    /* renamed from: c */
    final CompletableSource f27870c;

    /* renamed from: io.reactivex.y.e.a.x$a */
    /* compiled from: CompletableTimeout */
    final class C12104a implements Runnable {

        /* renamed from: U */
        final CompositeDisposable f27871U;

        /* renamed from: V */
        final CompletableObserver f27872V;

        /* renamed from: c */
        private final AtomicBoolean f27874c;

        /* renamed from: io.reactivex.y.e.a.x$a$a */
        /* compiled from: CompletableTimeout */
        final class C12105a implements CompletableObserver {
            C12105a() {
            }

            public void onComplete() {
                C12104a.this.f27871U.dispose();
                C12104a.this.f27872V.onComplete();
            }

            public void onError(Throwable th) {
                C12104a.this.f27871U.dispose();
                C12104a.this.f27872V.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12104a.this.f27871U.mo30250b(disposable);
            }
        }

        C12104a(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.f27874c = atomicBoolean;
            this.f27871U = compositeDisposable;
            this.f27872V = completableObserver;
        }

        public void run() {
            if (this.f27874c.compareAndSet(false, true)) {
                this.f27871U.mo30247a();
                C12103x xVar = C12103x.this;
                CompletableSource completableSource = xVar.f27869X;
                if (completableSource == null) {
                    this.f27872V.onError(new TimeoutException(C12548h.m39350a(xVar.f27866U, xVar.f27867V)));
                } else {
                    completableSource.subscribe(new C12105a());
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.e.a.x$b */
    /* compiled from: CompletableTimeout */
    static final class C12106b implements CompletableObserver {

        /* renamed from: U */
        private final AtomicBoolean f27876U;

        /* renamed from: V */
        private final CompletableObserver f27877V;

        /* renamed from: c */
        private final CompositeDisposable f27878c;

        C12106b(CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean, CompletableObserver completableObserver) {
            this.f27878c = compositeDisposable;
            this.f27876U = atomicBoolean;
            this.f27877V = completableObserver;
        }

        public void onComplete() {
            if (this.f27876U.compareAndSet(false, true)) {
                this.f27878c.dispose();
                this.f27877V.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f27876U.compareAndSet(false, true)) {
                this.f27878c.dispose();
                this.f27877V.onError(th);
                return;
            }
            C11915a.m38466b(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f27878c.mo30250b(disposable);
        }
    }

    public C12103x(CompletableSource completableSource, long j, TimeUnit timeUnit, C11969r rVar, CompletableSource completableSource2) {
        this.f27870c = completableSource;
        this.f27866U = j;
        this.f27867V = timeUnit;
        this.f27868W = rVar;
        this.f27869X = completableSource2;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.mo30250b(this.f27868W.mo30291a(new C12104a(atomicBoolean, compositeDisposable, completableObserver), this.f27866U, this.f27867V));
        this.f27870c.subscribe(new C12106b(compositeDisposable, atomicBoolean, completableObserver));
    }
}
