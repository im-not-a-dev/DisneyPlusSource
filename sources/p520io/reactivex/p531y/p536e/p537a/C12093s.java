package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.a.s */
/* compiled from: CompletableObserveOn */
public final class C12093s extends Completable {

    /* renamed from: U */
    final C11969r f27837U;

    /* renamed from: c */
    final CompletableSource f27838c;

    /* renamed from: io.reactivex.y.e.a.s$a */
    /* compiled from: CompletableObserveOn */
    static final class C12094a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* renamed from: U */
        final C11969r f27839U;

        /* renamed from: V */
        Throwable f27840V;

        /* renamed from: c */
        final CompletableObserver f27841c;

        C12094a(CompletableObserver completableObserver, C11969r rVar) {
            this.f27841c = completableObserver;
            this.f27839U = rVar;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            C12010c.m38622a((AtomicReference<Disposable>) this, this.f27839U.mo30289a(this));
        }

        public void onError(Throwable th) {
            this.f27840V = th;
            C12010c.m38622a((AtomicReference<Disposable>) this, this.f27839U.mo30289a(this));
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f27841c.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.f27840V;
            if (th != null) {
                this.f27840V = null;
                this.f27841c.onError(th);
                return;
            }
            this.f27841c.onComplete();
        }
    }

    public C12093s(CompletableSource completableSource, C11969r rVar) {
        this.f27838c = completableSource;
        this.f27837U = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27838c.subscribe(new C12094a(completableObserver, this.f27837U));
    }
}
