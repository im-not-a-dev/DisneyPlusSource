package p516i.p517a.p518a.p519a;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11954h;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11956j;
import p520io.reactivex.Flowable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p534c.C12050m;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: i.a.a.a.b */
/* compiled from: FlowableValve */
final class C11903b<T> extends Flowable<T> implements C11954h<T, T>, C11956j<T, T> {

    /* renamed from: U */
    final C14313b<? extends T> f27548U;

    /* renamed from: V */
    final C14313b<Boolean> f27549V;

    /* renamed from: W */
    final boolean f27550W;

    /* renamed from: X */
    final int f27551X;

    /* renamed from: i.a.a.a.b$a */
    /* compiled from: FlowableValve */
    static final class C11904a<T> extends AtomicInteger implements Subscriber<T>, C14314c {

        /* renamed from: U */
        final AtomicReference<C14314c> f27552U = new AtomicReference<>();

        /* renamed from: V */
        final AtomicLong f27553V = new AtomicLong();

        /* renamed from: W */
        final C12050m<T> f27554W;

        /* renamed from: X */
        final C11905a f27555X = new C11905a<>();

        /* renamed from: Y */
        final C12543c f27556Y = new C12543c();

        /* renamed from: Z */
        volatile boolean f27557Z;

        /* renamed from: a0 */
        volatile boolean f27558a0;

        /* renamed from: b0 */
        volatile boolean f27559b0;

        /* renamed from: c */
        final Subscriber<? super T> f27560c;

        /* renamed from: i.a.a.a.b$a$a */
        /* compiled from: FlowableValve */
        final class C11905a extends AtomicReference<C14314c> implements C11955i<Boolean> {
            C11905a() {
            }

            /* renamed from: a */
            public void mo29945a(C14314c cVar) {
                if (C12539g.m39328a((AtomicReference<C14314c>) this, cVar)) {
                    cVar.mo29946b(Long.MAX_VALUE);
                }
            }

            public void onComplete() {
                C11904a.this.mo30031b();
            }

            public void onError(Throwable th) {
                C11904a.this.mo30029a(th);
            }

            /* renamed from: a */
            public void onNext(Boolean bool) {
                C11904a.this.mo30030a(bool.booleanValue());
            }
        }

        C11904a(Subscriber<? super T> subscriber, int i, boolean z) {
            this.f27560c = subscriber;
            this.f27554W = new C12491c(i);
            this.f27558a0 = z;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            C12539g.m39327a(this.f27552U, this.f27553V, cVar);
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            C12539g.m39325a(this.f27552U, this.f27553V, j);
        }

        public void cancel() {
            this.f27559b0 = true;
            C12539g.m39326a(this.f27552U);
            C12539g.m39326a((AtomicReference<C14314c>) this.f27555X);
        }

        public void onComplete() {
            this.f27557Z = true;
            mo30028a();
        }

        public void onError(Throwable th) {
            if (this.f27556Y.mo30669a(th)) {
                mo30028a();
            } else {
                C11915a.m38466b(th);
            }
        }

        public void onNext(T t) {
            this.f27554W.offer(t);
            mo30028a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30028a() {
            if (getAndIncrement() == 0) {
                C12050m<T> mVar = this.f27554W;
                Subscriber<? super T> subscriber = this.f27560c;
                C12543c cVar = this.f27556Y;
                int i = 1;
                while (!this.f27559b0) {
                    if (cVar.get() != null) {
                        Throwable a = cVar.mo30668a();
                        mVar.clear();
                        C12539g.m39326a(this.f27552U);
                        C12539g.m39326a((AtomicReference<C14314c>) this.f27555X);
                        subscriber.onError(a);
                        return;
                    }
                    if (this.f27558a0) {
                        boolean z = this.f27557Z;
                        Object poll = mVar.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            C12539g.m39326a((AtomicReference<C14314c>) this.f27555X);
                            subscriber.onComplete();
                            return;
                        } else if (!z2) {
                            subscriber.onNext(poll);
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                mVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30031b() {
            mo30029a((Throwable) new IllegalStateException("The valve source completed unexpectedly."));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30030a(boolean z) {
            this.f27558a0 = z;
            if (z) {
                mo30028a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30029a(Throwable th) {
            onError(th);
        }
    }

    C11903b(C14313b<? extends T> bVar, C14313b<Boolean> bVar2, boolean z, int i) {
        this.f27548U = bVar;
        this.f27549V = bVar2;
        this.f27550W = z;
        this.f27551X = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27548U.subscribe(mo30027b(subscriber));
    }

    /* renamed from: b */
    public Subscriber<? super T> mo30027b(Subscriber<? super T> subscriber) {
        C11904a aVar = new C11904a(subscriber, this.f27551X, this.f27550W);
        subscriber.mo29945a(aVar);
        this.f27549V.subscribe(aVar.f27555X);
        return aVar;
    }

    /* renamed from: a */
    public C14313b<T> mo30026a(Flowable<T> flowable) {
        return new C11903b(flowable, this.f27549V, this.f27550W, this.f27551X);
    }
}
