package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11958l;
import p520io.reactivex.Flowable;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.p */
/* compiled from: FlowableFlatMapMaybe */
public final class C12189p<T, R> extends C12111a<T, R> {

    /* renamed from: V */
    final Function<? super T, ? extends MaybeSource<? extends R>> f28125V;

    /* renamed from: W */
    final boolean f28126W;

    /* renamed from: X */
    final int f28127X;

    /* renamed from: io.reactivex.y.e.b.p$a */
    /* compiled from: FlowableFlatMapMaybe */
    static final class C12190a<T, R> extends AtomicInteger implements C11955i<T>, C14314c {

        /* renamed from: U */
        final boolean f28128U;

        /* renamed from: V */
        final int f28129V;

        /* renamed from: W */
        final AtomicLong f28130W = new AtomicLong();

        /* renamed from: X */
        final CompositeDisposable f28131X = new CompositeDisposable();

        /* renamed from: Y */
        final AtomicInteger f28132Y = new AtomicInteger(1);

        /* renamed from: Z */
        final C12543c f28133Z = new C12543c();

        /* renamed from: a0 */
        final Function<? super T, ? extends MaybeSource<? extends R>> f28134a0;

        /* renamed from: b0 */
        final AtomicReference<C12491c<R>> f28135b0 = new AtomicReference<>();

        /* renamed from: c */
        final Subscriber<? super R> f28136c;

        /* renamed from: c0 */
        C14314c f28137c0;

        /* renamed from: d0 */
        volatile boolean f28138d0;

        /* renamed from: io.reactivex.y.e.b.p$a$a */
        /* compiled from: FlowableFlatMapMaybe */
        final class C12191a extends AtomicReference<Disposable> implements C11958l<R>, Disposable {
            C12191a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onComplete() {
                C12190a.this.mo30439a(this);
            }

            public void onError(Throwable th) {
                C12190a.this.mo30441a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }

            public void onSuccess(R r) {
                C12190a.this.mo30440a(this, r);
            }
        }

        C12190a(Subscriber<? super R> subscriber, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
            this.f28136c = subscriber;
            this.f28134a0 = function;
            this.f28128U = z;
            this.f28129V = i;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28137c0, cVar)) {
                this.f28137c0 = cVar;
                this.f28136c.mo29945a(this);
                int i = this.f28129V;
                if (i == Integer.MAX_VALUE) {
                    cVar.mo29946b(Long.MAX_VALUE);
                } else {
                    cVar.mo29946b((long) i);
                }
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a(this.f28130W, j);
                mo30442b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30443c() {
            boolean z;
            int i;
            Subscriber<? super R> subscriber = this.f28136c;
            AtomicInteger atomicInteger = this.f28132Y;
            AtomicReference<C12491c<R>> atomicReference = this.f28135b0;
            int i2 = 1;
            do {
                long j = this.f28130W.get();
                long j2 = 0;
                while (true) {
                    z = false;
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (this.f28138d0) {
                        mo30438a();
                        return;
                    } else if (this.f28128U || ((Throwable) this.f28133Z.get()) == null) {
                        boolean z2 = atomicInteger.get() == 0;
                        C12491c cVar = (C12491c) atomicReference.get();
                        Object poll = cVar != null ? cVar.poll() : null;
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            Throwable a = this.f28133Z.mo30668a();
                            if (a != null) {
                                subscriber.onError(a);
                            } else {
                                subscriber.onComplete();
                            }
                            return;
                        } else if (z3) {
                            break;
                        } else {
                            subscriber.onNext(poll);
                            j2++;
                        }
                    } else {
                        Throwable a2 = this.f28133Z.mo30668a();
                        mo30438a();
                        subscriber.onError(a2);
                        return;
                    }
                }
                if (i == 0) {
                    if (this.f28138d0) {
                        mo30438a();
                        return;
                    } else if (this.f28128U || ((Throwable) this.f28133Z.get()) == null) {
                        boolean z4 = atomicInteger.get() == 0;
                        C12491c cVar2 = (C12491c) atomicReference.get();
                        if (cVar2 == null || cVar2.isEmpty()) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable a3 = this.f28133Z.mo30668a();
                            if (a3 != null) {
                                subscriber.onError(a3);
                            } else {
                                subscriber.onComplete();
                            }
                            return;
                        }
                    } else {
                        Throwable a4 = this.f28133Z.mo30668a();
                        mo30438a();
                        subscriber.onError(a4);
                        return;
                    }
                }
                if (j2 != 0) {
                    C12544d.m39343c(this.f28130W, j2);
                    if (this.f28129V != Integer.MAX_VALUE) {
                        this.f28137c0.mo29946b(j2);
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        public void cancel() {
            this.f28138d0 = true;
            this.f28137c0.cancel();
            this.f28131X.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12491c<R> mo30444d() {
            C12491c<R> cVar;
            do {
                C12491c<R> cVar2 = (C12491c) this.f28135b0.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C12491c<>(Flowable.m38208h());
            } while (!this.f28135b0.compareAndSet(null, cVar));
            return cVar;
        }

        public void onComplete() {
            this.f28132Y.decrementAndGet();
            mo30442b();
        }

        public void onError(Throwable th) {
            this.f28132Y.decrementAndGet();
            if (this.f28133Z.mo30669a(th)) {
                if (!this.f28128U) {
                    this.f28131X.dispose();
                }
                mo30442b();
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28134a0.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) apply;
                this.f28132Y.getAndIncrement();
                C12191a aVar = new C12191a();
                if (!this.f28138d0 && this.f28131X.mo30250b(aVar)) {
                    maybeSource.mo30113a(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28137c0.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30442b() {
            if (getAndIncrement() == 0) {
                mo30443c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30440a(C12191a aVar, R r) {
            this.f28131X.mo30251c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f28132Y.decrementAndGet() != 0) {
                        z = false;
                    }
                    if (this.f28130W.get() != 0) {
                        this.f28136c.onNext(r);
                        C12491c cVar = (C12491c) this.f28135b0.get();
                        if (!z || (cVar != null && !cVar.isEmpty())) {
                            C12544d.m39343c(this.f28130W, 1);
                            if (this.f28129V != Integer.MAX_VALUE) {
                                this.f28137c0.mo29946b(1);
                            }
                        } else {
                            Throwable a = this.f28133Z.mo30668a();
                            if (a != null) {
                                this.f28136c.onError(a);
                            } else {
                                this.f28136c.onComplete();
                            }
                            return;
                        }
                    } else {
                        C12491c d = mo30444d();
                        synchronized (d) {
                            d.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    mo30443c();
                }
            }
            C12491c d2 = mo30444d();
            synchronized (d2) {
                d2.offer(r);
            }
            this.f28132Y.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo30443c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30441a(C12191a aVar, Throwable th) {
            this.f28131X.mo30251c(aVar);
            if (this.f28133Z.mo30669a(th)) {
                if (!this.f28128U) {
                    this.f28137c0.cancel();
                    this.f28131X.dispose();
                } else if (this.f28129V != Integer.MAX_VALUE) {
                    this.f28137c0.mo29946b(1);
                }
                this.f28132Y.decrementAndGet();
                mo30442b();
                return;
            }
            C11915a.m38466b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30439a(C12191a aVar) {
            this.f28131X.mo30251c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f28132Y.decrementAndGet() != 0) {
                        z = false;
                    }
                    C12491c cVar = (C12491c) this.f28135b0.get();
                    if (!z || (cVar != null && !cVar.isEmpty())) {
                        if (this.f28129V != Integer.MAX_VALUE) {
                            this.f28137c0.mo29946b(1);
                        }
                        if (decrementAndGet() != 0) {
                            mo30443c();
                        }
                        return;
                    }
                    Throwable a = this.f28133Z.mo30668a();
                    if (a != null) {
                        this.f28136c.onError(a);
                    } else {
                        this.f28136c.onComplete();
                    }
                    return;
                }
            }
            this.f28132Y.decrementAndGet();
            if (this.f28129V != Integer.MAX_VALUE) {
                this.f28137c0.mo29946b(1);
            }
            mo30442b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30438a() {
            C12491c cVar = (C12491c) this.f28135b0.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12189p(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.f28125V = function;
        this.f28126W = z;
        this.f28127X = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super R> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12190a<Object>(subscriber, this.f28125V, this.f28126W, this.f28127X));
    }
}
