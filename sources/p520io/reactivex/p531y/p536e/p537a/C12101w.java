package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12014g;

/* renamed from: io.reactivex.y.e.a.w */
/* compiled from: CompletableSubscribeOn */
public final class C12101w extends Completable {

    /* renamed from: U */
    final C11969r f27861U;

    /* renamed from: c */
    final CompletableSource f27862c;

    /* renamed from: io.reactivex.y.e.a.w$a */
    /* compiled from: CompletableSubscribeOn */
    static final class C12102a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {

        /* renamed from: U */
        final C12014g f27863U = new C12014g();

        /* renamed from: V */
        final CompletableSource f27864V;

        /* renamed from: c */
        final CompletableObserver f27865c;

        C12102a(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f27865c = completableObserver;
            this.f27864V = completableSource;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
            this.f27863U.dispose();
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f27865c.onComplete();
        }

        public void onError(Throwable th) {
            this.f27865c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void run() {
            this.f27864V.subscribe(this);
        }
    }

    public C12101w(CompletableSource completableSource, C11969r rVar) {
        this.f27862c = completableSource;
        this.f27861U = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C12102a aVar = new C12102a(completableObserver, this.f27862c);
        completableObserver.onSubscribe(aVar);
        aVar.f27863U.mo30345a(this.f27861U.mo30289a(aVar));
    }
}
