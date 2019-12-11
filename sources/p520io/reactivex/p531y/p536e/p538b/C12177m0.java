package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11969r;
import p520io.reactivex.Flowable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.m0 */
/* compiled from: FlowableTimer */
public final class C12177m0 extends Flowable<Long> {

    /* renamed from: U */
    final C11969r f28088U;

    /* renamed from: V */
    final long f28089V;

    /* renamed from: W */
    final TimeUnit f28090W;

    /* renamed from: io.reactivex.y.e.b.m0$a */
    /* compiled from: FlowableTimer */
    static final class C12178a extends AtomicReference<Disposable> implements C14314c, Runnable {

        /* renamed from: U */
        volatile boolean f28091U;

        /* renamed from: c */
        final Subscriber<? super Long> f28092c;

        C12178a(Subscriber<? super Long> subscriber) {
            this.f28092c = subscriber;
        }

        /* renamed from: a */
        public void mo30432a(Disposable disposable) {
            C12010c.m38625d(this, disposable);
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                this.f28091U = true;
            }
        }

        public void cancel() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public void run() {
            if (get() == C12010c.DISPOSED) {
                return;
            }
            if (this.f28091U) {
                this.f28092c.onNext(Long.valueOf(0));
                lazySet(C12011d.INSTANCE);
                this.f28092c.onComplete();
                return;
            }
            lazySet(C12011d.INSTANCE);
            this.f28092c.onError(new C12004c("Can't deliver value due to lack of requests"));
        }
    }

    public C12177m0(long j, TimeUnit timeUnit, C11969r rVar) {
        this.f28089V = j;
        this.f28090W = timeUnit;
        this.f28088U = rVar;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super Long> subscriber) {
        C12178a aVar = new C12178a(subscriber);
        subscriber.mo29945a(aVar);
        aVar.mo30432a(this.f28088U.mo30291a(aVar, this.f28089V, this.f28090W));
    }
}
