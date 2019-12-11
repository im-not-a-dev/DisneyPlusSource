package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11969r;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.e.y0 */
/* compiled from: ObservableTimer */
public final class C12414y0 extends Observable<Long> {

    /* renamed from: U */
    final long f28754U;

    /* renamed from: V */
    final TimeUnit f28755V;

    /* renamed from: c */
    final C11969r f28756c;

    /* renamed from: io.reactivex.y.e.e.y0$a */
    /* compiled from: ObservableTimer */
    static final class C12415a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: c */
        final C11968q<? super Long> f28757c;

        C12415a(C11968q<? super Long> qVar) {
            this.f28757c = qVar;
        }

        /* renamed from: a */
        public void mo30567a(Disposable disposable) {
            C12010c.m38625d(this, disposable);
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return get() == C12010c.DISPOSED;
        }

        public void run() {
            if (!isDisposed()) {
                this.f28757c.onNext(Long.valueOf(0));
                lazySet(C12011d.INSTANCE);
                this.f28757c.onComplete();
            }
        }
    }

    public C12414y0(long j, TimeUnit timeUnit, C11969r rVar) {
        this.f28754U = j;
        this.f28755V = timeUnit;
        this.f28756c = rVar;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super Long> qVar) {
        C12415a aVar = new C12415a(qVar);
        qVar.onSubscribe(aVar);
        aVar.mo30567a(this.f28756c.mo30291a(aVar, this.f28754U, this.f28755V));
    }
}
