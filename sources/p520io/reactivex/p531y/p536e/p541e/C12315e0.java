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

/* renamed from: io.reactivex.y.e.e.e0 */
/* compiled from: ObservableIntervalRange */
public final class C12315e0 extends Observable<Long> {

    /* renamed from: U */
    final long f28446U;

    /* renamed from: V */
    final long f28447V;

    /* renamed from: W */
    final long f28448W;

    /* renamed from: X */
    final long f28449X;

    /* renamed from: Y */
    final TimeUnit f28450Y;

    /* renamed from: c */
    final C11969r f28451c;

    /* renamed from: io.reactivex.y.e.e.e0$a */
    /* compiled from: ObservableIntervalRange */
    static final class C12316a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: U */
        final long f28452U;

        /* renamed from: V */
        long f28453V;

        /* renamed from: c */
        final C11968q<? super Long> f28454c;

        C12316a(C11968q<? super Long> qVar, long j, long j2) {
            this.f28454c = qVar;
            this.f28453V = j;
            this.f28452U = j2;
        }

        /* renamed from: a */
        public void mo30483a(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return get() == C12010c.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                long j = this.f28453V;
                this.f28454c.onNext(Long.valueOf(j));
                if (j == this.f28452U) {
                    C12010c.m38621a((AtomicReference<Disposable>) this);
                    this.f28454c.onComplete();
                    return;
                }
                this.f28453V = j + 1;
            }
        }
    }

    public C12315e0(long j, long j2, long j3, long j4, TimeUnit timeUnit, C11969r rVar) {
        this.f28448W = j3;
        this.f28449X = j4;
        this.f28450Y = timeUnit;
        this.f28451c = rVar;
        this.f28446U = j;
        this.f28447V = j2;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super Long> qVar) {
        C12316a aVar = new C12316a(qVar, this.f28446U, this.f28447V);
        qVar.onSubscribe(aVar);
        C11969r rVar = this.f28451c;
        if (rVar instanceof C12524q) {
            C11972c a = rVar.mo30292a();
            aVar.mo30483a(a);
            a.mo30297a(aVar, this.f28448W, this.f28449X, this.f28450Y);
            return;
        }
        aVar.mo30483a(rVar.mo30290a(aVar, this.f28448W, this.f28449X, this.f28450Y));
    }
}
