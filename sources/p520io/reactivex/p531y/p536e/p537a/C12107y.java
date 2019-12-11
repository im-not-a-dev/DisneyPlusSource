package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.a.y */
/* compiled from: CompletableTimer */
public final class C12107y extends Completable {

    /* renamed from: U */
    final TimeUnit f27879U;

    /* renamed from: V */
    final C11969r f27880V;

    /* renamed from: c */
    final long f27881c;

    /* renamed from: io.reactivex.y.e.a.y$a */
    /* compiled from: CompletableTimer */
    static final class C12108a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: c */
        final CompletableObserver f27882c;

        C12108a(CompletableObserver completableObserver) {
            this.f27882c = completableObserver;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30390a(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void run() {
            this.f27882c.onComplete();
        }
    }

    public C12107y(long j, TimeUnit timeUnit, C11969r rVar) {
        this.f27881c = j;
        this.f27879U = timeUnit;
        this.f27880V = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C12108a aVar = new C12108a(completableObserver);
        completableObserver.onSubscribe(aVar);
        aVar.mo30390a(this.f27880V.mo30291a(aVar, this.f27881c, this.f27879U));
    }
}
