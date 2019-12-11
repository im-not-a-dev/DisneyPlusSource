package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import p520io.reactivex.C11955i;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.e0 */
/* compiled from: FlowableRepeatWhen */
final class C12143e0<T, U> extends AtomicInteger implements C11955i<Object>, C14314c {

    /* renamed from: U */
    final AtomicReference<C14314c> f27966U = new AtomicReference<>();

    /* renamed from: V */
    final AtomicLong f27967V = new AtomicLong();

    /* renamed from: W */
    C12147f0<T, U> f27968W;

    /* renamed from: c */
    final C14313b<T> f27969c;

    C12143e0(C14313b<T> bVar) {
        this.f27969c = bVar;
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        C12539g.m39327a(this.f27966U, this.f27967V, cVar);
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        C12539g.m39325a(this.f27966U, this.f27967V, j);
    }

    public void cancel() {
        C12539g.m39326a(this.f27966U);
    }

    public void onComplete() {
        this.f27968W.cancel();
        this.f27968W.f27980b0.onComplete();
    }

    public void onError(Throwable th) {
        this.f27968W.cancel();
        this.f27968W.f27980b0.onError(th);
    }

    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.f27966U.get() != C12539g.CANCELLED) {
                this.f27969c.subscribe(this.f27968W);
                if (decrementAndGet() == 0) {
                }
            }
        }
    }
}
