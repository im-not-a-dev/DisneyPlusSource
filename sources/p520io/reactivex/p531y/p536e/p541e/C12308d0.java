package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p544g.C12524q;

/* renamed from: io.reactivex.y.e.e.d0 */
/* compiled from: ObservableInterval */
public final class C12308d0 extends Observable<Long> {

    /* renamed from: U */
    final long f28411U;

    /* renamed from: V */
    final long f28412V;

    /* renamed from: W */
    final TimeUnit f28413W;

    /* renamed from: c */
    final C11969r f28414c;

    /* renamed from: io.reactivex.y.e.e.d0$a */
    /* compiled from: ObservableInterval */
    static final class C12309a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: U */
        long f28415U;

        /* renamed from: c */
        final C11968q<? super Long> f28416c;

        C12309a(C11968q<? super Long> qVar) {
            this.f28416c = qVar;
        }

        /* renamed from: a */
        public void mo30476a(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return get() == C12010c.DISPOSED;
        }

        public void run() {
            if (get() != C12010c.DISPOSED) {
                C11968q<? super Long> qVar = this.f28416c;
                long j = this.f28415U;
                this.f28415U = 1 + j;
                qVar.onNext(Long.valueOf(j));
            }
        }
    }

    public C12308d0(long j, long j2, TimeUnit timeUnit, C11969r rVar) {
        this.f28411U = j;
        this.f28412V = j2;
        this.f28413W = timeUnit;
        this.f28414c = rVar;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super Long> qVar) {
        C12309a aVar = new C12309a(qVar);
        qVar.onSubscribe(aVar);
        C11969r rVar = this.f28414c;
        if (rVar instanceof C12524q) {
            C11972c a = rVar.mo30292a();
            aVar.mo30476a(a);
            a.mo30297a(aVar, this.f28411U, this.f28412V, this.f28413W);
            return;
        }
        aVar.mo30476a(rVar.mo30290a(aVar, this.f28411U, this.f28412V, this.f28413W));
    }
}
