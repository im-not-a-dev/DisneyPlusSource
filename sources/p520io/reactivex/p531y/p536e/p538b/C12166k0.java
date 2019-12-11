package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.k0 */
/* compiled from: FlowableSubscribeOn */
public final class C12166k0<T> extends C12111a<T, T> {

    /* renamed from: V */
    final C11969r f28039V;

    /* renamed from: W */
    final boolean f28040W;

    /* renamed from: io.reactivex.y.e.b.k0$a */
    /* compiled from: FlowableSubscribeOn */
    static final class C12167a<T> extends AtomicReference<Thread> implements C11955i<T>, C14314c, Runnable {

        /* renamed from: U */
        final C11972c f28041U;

        /* renamed from: V */
        final AtomicReference<C14314c> f28042V = new AtomicReference<>();

        /* renamed from: W */
        final AtomicLong f28043W = new AtomicLong();

        /* renamed from: X */
        final boolean f28044X;

        /* renamed from: Y */
        C14313b<T> f28045Y;

        /* renamed from: c */
        final Subscriber<? super T> f28046c;

        /* renamed from: io.reactivex.y.e.b.k0$a$a */
        /* compiled from: FlowableSubscribeOn */
        static final class C12168a implements Runnable {

            /* renamed from: U */
            final long f28047U;

            /* renamed from: c */
            final C14314c f28048c;

            C12168a(C14314c cVar, long j) {
                this.f28048c = cVar;
                this.f28047U = j;
            }

            public void run() {
                this.f28048c.mo29946b(this.f28047U);
            }
        }

        C12167a(Subscriber<? super T> subscriber, C11972c cVar, C14313b<T> bVar, boolean z) {
            this.f28046c = subscriber;
            this.f28041U = cVar;
            this.f28045Y = bVar;
            this.f28044X = !z;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39328a(this.f28042V, cVar)) {
                long andSet = this.f28043W.getAndSet(0);
                if (andSet != 0) {
                    mo30416a(andSet, cVar);
                }
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C14314c cVar = (C14314c) this.f28042V.get();
                if (cVar != null) {
                    mo30416a(j, cVar);
                    return;
                }
                C12544d.m39341a(this.f28043W, j);
                C14314c cVar2 = (C14314c) this.f28042V.get();
                if (cVar2 != null) {
                    long andSet = this.f28043W.getAndSet(0);
                    if (andSet != 0) {
                        mo30416a(andSet, cVar2);
                    }
                }
            }
        }

        public void cancel() {
            C12539g.m39326a(this.f28042V);
            this.f28041U.dispose();
        }

        public void onComplete() {
            this.f28046c.onComplete();
            this.f28041U.dispose();
        }

        public void onError(Throwable th) {
            this.f28046c.onError(th);
            this.f28041U.dispose();
        }

        public void onNext(T t) {
            this.f28046c.onNext(t);
        }

        public void run() {
            lazySet(Thread.currentThread());
            C14313b<T> bVar = this.f28045Y;
            this.f28045Y = null;
            bVar.subscribe(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30416a(long j, C14314c cVar) {
            if (this.f28044X || Thread.currentThread() == get()) {
                cVar.mo29946b(j);
            } else {
                this.f28041U.mo30296a((Runnable) new C12168a(cVar, j));
            }
        }
    }

    public C12166k0(Flowable<T> flowable, C11969r rVar, boolean z) {
        super(flowable);
        this.f28039V = rVar;
        this.f28040W = z;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        C11972c a = this.f28039V.mo30292a();
        C12167a aVar = new C12167a(subscriber, a, this.f27888U, this.f28040W);
        subscriber.mo29945a(aVar);
        a.mo30296a((Runnable) aVar);
    }
}
