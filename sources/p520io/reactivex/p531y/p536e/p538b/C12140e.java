package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.Flowable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p526f0.C11944a;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.e */
/* compiled from: FlowableDebounceTimed */
public final class C12140e<T> extends C12111a<T, T> {

    /* renamed from: V */
    final long f27951V;

    /* renamed from: W */
    final TimeUnit f27952W;

    /* renamed from: X */
    final C11969r f27953X;

    /* renamed from: io.reactivex.y.e.b.e$a */
    /* compiled from: FlowableDebounceTimed */
    static final class C12141a<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* renamed from: U */
        final long f27954U;

        /* renamed from: V */
        final C12142b<T> f27955V;

        /* renamed from: W */
        final AtomicBoolean f27956W = new AtomicBoolean();

        /* renamed from: c */
        final T f27957c;

        C12141a(T t, long j, C12142b<T> bVar) {
            this.f27957c = t;
            this.f27954U = j;
            this.f27955V = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30411a() {
            if (this.f27956W.compareAndSet(false, true)) {
                this.f27955V.mo30414a(this.f27954U, this.f27957c, this);
            }
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return get() == C12010c.DISPOSED;
        }

        public void run() {
            mo30411a();
        }

        /* renamed from: a */
        public void mo30412a(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }
    }

    /* renamed from: io.reactivex.y.e.b.e$b */
    /* compiled from: FlowableDebounceTimed */
    static final class C12142b<T> extends AtomicLong implements C11955i<T>, C14314c {

        /* renamed from: U */
        final long f27958U;

        /* renamed from: V */
        final TimeUnit f27959V;

        /* renamed from: W */
        final C11972c f27960W;

        /* renamed from: X */
        C14314c f27961X;

        /* renamed from: Y */
        Disposable f27962Y;

        /* renamed from: Z */
        volatile long f27963Z;

        /* renamed from: a0 */
        boolean f27964a0;

        /* renamed from: c */
        final Subscriber<? super T> f27965c;

        C12142b(Subscriber<? super T> subscriber, long j, TimeUnit timeUnit, C11972c cVar) {
            this.f27965c = subscriber;
            this.f27958U = j;
            this.f27959V = timeUnit;
            this.f27960W = cVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f27961X, cVar)) {
                this.f27961X = cVar;
                this.f27965c.mo29945a(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f27961X.cancel();
            this.f27960W.dispose();
        }

        public void onComplete() {
            if (!this.f27964a0) {
                this.f27964a0 = true;
                Disposable disposable = this.f27962Y;
                if (disposable != null) {
                    disposable.dispose();
                }
                C12141a aVar = (C12141a) disposable;
                if (aVar != null) {
                    aVar.mo30411a();
                }
                this.f27965c.onComplete();
                this.f27960W.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f27964a0) {
                C11915a.m38466b(th);
                return;
            }
            this.f27964a0 = true;
            Disposable disposable = this.f27962Y;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f27965c.onError(th);
            this.f27960W.dispose();
        }

        public void onNext(T t) {
            if (!this.f27964a0) {
                long j = this.f27963Z + 1;
                this.f27963Z = j;
                Disposable disposable = this.f27962Y;
                if (disposable != null) {
                    disposable.dispose();
                }
                C12141a aVar = new C12141a(t, j, this);
                this.f27962Y = aVar;
                aVar.mo30412a(this.f27960W.mo30298a(aVar, this.f27958U, this.f27959V));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30414a(long j, T t, C12141a<T> aVar) {
            if (j != this.f27963Z) {
                return;
            }
            if (get() != 0) {
                this.f27965c.onNext(t);
                C12544d.m39343c(this, 1);
                aVar.dispose();
                return;
            }
            cancel();
            this.f27965c.onError(new C12004c("Could not deliver value due to lack of requests"));
        }
    }

    public C12140e(Flowable<T> flowable, long j, TimeUnit timeUnit, C11969r rVar) {
        super(flowable);
        this.f27951V = j;
        this.f27952W = timeUnit;
        this.f27953X = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        Flowable<T> flowable = this.f27888U;
        C12142b bVar = new C12142b(new C11944a(subscriber), this.f27951V, this.f27952W, this.f27953X.mo30292a());
        flowable.mo30080a((C11955i<? super T>) bVar);
    }
}
