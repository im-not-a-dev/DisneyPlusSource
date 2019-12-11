package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p546i.C12538f;

/* renamed from: io.reactivex.y.e.b.d0 */
/* compiled from: FlowableRepeat */
public final class C12138d0<T> extends C12111a<T, T> {

    /* renamed from: V */
    final long f27945V;

    /* renamed from: io.reactivex.y.e.b.d0$a */
    /* compiled from: FlowableRepeat */
    static final class C12139a<T> extends AtomicInteger implements C11955i<T> {

        /* renamed from: U */
        final C12538f f27946U;

        /* renamed from: V */
        final C14313b<? extends T> f27947V;

        /* renamed from: W */
        long f27948W;

        /* renamed from: X */
        long f27949X;

        /* renamed from: c */
        final Subscriber<? super T> f27950c;

        C12139a(Subscriber<? super T> subscriber, long j, C12538f fVar, C14313b<? extends T> bVar) {
            this.f27950c = subscriber;
            this.f27946U = fVar;
            this.f27947V = bVar;
            this.f27948W = j;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            this.f27946U.mo30659b(cVar);
        }

        public void onComplete() {
            long j = this.f27948W;
            if (j != Long.MAX_VALUE) {
                this.f27948W = j - 1;
            }
            if (j != 0) {
                mo30410a();
            } else {
                this.f27950c.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f27950c.onError(th);
        }

        public void onNext(T t) {
            this.f27949X++;
            this.f27950c.onNext(t);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30410a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f27946U.mo30660c()) {
                    long j = this.f27949X;
                    if (j != 0) {
                        this.f27949X = 0;
                        this.f27946U.mo30657a(j);
                    }
                    this.f27947V.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }
    }

    public C12138d0(Flowable<T> flowable, long j) {
        super(flowable);
        this.f27945V = j;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        C12538f fVar = new C12538f(false);
        subscriber.mo29945a(fVar);
        long j = this.f27945V;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        C12139a aVar = new C12139a(subscriber, j2, fVar, this.f27888U);
        aVar.mo30410a();
    }
}
