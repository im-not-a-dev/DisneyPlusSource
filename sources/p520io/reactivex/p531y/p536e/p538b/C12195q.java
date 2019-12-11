package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11987u;
import p520io.reactivex.Flowable;
import p520io.reactivex.SingleSource;
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

/* renamed from: io.reactivex.y.e.b.q */
/* compiled from: FlowableFlatMapSingle */
public final class C12195q<T, R> extends C12111a<T, R> {

    /* renamed from: V */
    final Function<? super T, ? extends SingleSource<? extends R>> f28145V;

    /* renamed from: W */
    final boolean f28146W;

    /* renamed from: X */
    final int f28147X;

    /* renamed from: io.reactivex.y.e.b.q$a */
    /* compiled from: FlowableFlatMapSingle */
    static final class C12196a<T, R> extends AtomicInteger implements C11955i<T>, C14314c {

        /* renamed from: U */
        final boolean f28148U;

        /* renamed from: V */
        final int f28149V;

        /* renamed from: W */
        final AtomicLong f28150W = new AtomicLong();

        /* renamed from: X */
        final CompositeDisposable f28151X = new CompositeDisposable();

        /* renamed from: Y */
        final AtomicInteger f28152Y = new AtomicInteger(1);

        /* renamed from: Z */
        final C12543c f28153Z = new C12543c();

        /* renamed from: a0 */
        final Function<? super T, ? extends SingleSource<? extends R>> f28154a0;

        /* renamed from: b0 */
        final AtomicReference<C12491c<R>> f28155b0 = new AtomicReference<>();

        /* renamed from: c */
        final Subscriber<? super R> f28156c;

        /* renamed from: c0 */
        C14314c f28157c0;

        /* renamed from: d0 */
        volatile boolean f28158d0;

        /* renamed from: io.reactivex.y.e.b.q$a$a */
        /* compiled from: FlowableFlatMapSingle */
        final class C12197a extends AtomicReference<Disposable> implements C11987u<R>, Disposable {
            C12197a() {
            }

            public void dispose() {
                C12010c.m38621a((AtomicReference<Disposable>) this);
            }

            public boolean isDisposed() {
                return C12010c.m38619a((Disposable) get());
            }

            public void onError(Throwable th) {
                C12196a.this.mo30448a(this, th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }

            public void onSuccess(R r) {
                C12196a.this.mo30447a(this, r);
            }
        }

        C12196a(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
            this.f28156c = subscriber;
            this.f28154a0 = function;
            this.f28148U = z;
            this.f28149V = i;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28157c0, cVar)) {
                this.f28157c0 = cVar;
                this.f28156c.mo29945a(this);
                int i = this.f28149V;
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
                C12544d.m39341a(this.f28150W, j);
                mo30449b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30450c() {
            boolean z;
            int i;
            Subscriber<? super R> subscriber = this.f28156c;
            AtomicInteger atomicInteger = this.f28152Y;
            AtomicReference<C12491c<R>> atomicReference = this.f28155b0;
            int i2 = 1;
            do {
                long j = this.f28150W.get();
                long j2 = 0;
                while (true) {
                    z = false;
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        break;
                    } else if (this.f28158d0) {
                        mo30446a();
                        return;
                    } else if (this.f28148U || ((Throwable) this.f28153Z.get()) == null) {
                        boolean z2 = atomicInteger.get() == 0;
                        C12491c cVar = (C12491c) atomicReference.get();
                        Object poll = cVar != null ? cVar.poll() : null;
                        boolean z3 = poll == null;
                        if (z2 && z3) {
                            Throwable a = this.f28153Z.mo30668a();
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
                        Throwable a2 = this.f28153Z.mo30668a();
                        mo30446a();
                        subscriber.onError(a2);
                        return;
                    }
                }
                if (i == 0) {
                    if (this.f28158d0) {
                        mo30446a();
                        return;
                    } else if (this.f28148U || ((Throwable) this.f28153Z.get()) == null) {
                        boolean z4 = atomicInteger.get() == 0;
                        C12491c cVar2 = (C12491c) atomicReference.get();
                        if (cVar2 == null || cVar2.isEmpty()) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable a3 = this.f28153Z.mo30668a();
                            if (a3 != null) {
                                subscriber.onError(a3);
                            } else {
                                subscriber.onComplete();
                            }
                            return;
                        }
                    } else {
                        Throwable a4 = this.f28153Z.mo30668a();
                        mo30446a();
                        subscriber.onError(a4);
                        return;
                    }
                }
                if (j2 != 0) {
                    C12544d.m39343c(this.f28150W, j2);
                    if (this.f28149V != Integer.MAX_VALUE) {
                        this.f28157c0.mo29946b(j2);
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        public void cancel() {
            this.f28158d0 = true;
            this.f28157c0.cancel();
            this.f28151X.dispose();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C12491c<R> mo30451d() {
            C12491c<R> cVar;
            do {
                C12491c<R> cVar2 = (C12491c) this.f28155b0.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new C12491c<>(Flowable.m38208h());
            } while (!this.f28155b0.compareAndSet(null, cVar));
            return cVar;
        }

        public void onComplete() {
            this.f28152Y.decrementAndGet();
            mo30449b();
        }

        public void onError(Throwable th) {
            this.f28152Y.decrementAndGet();
            if (this.f28153Z.mo30669a(th)) {
                if (!this.f28148U) {
                    this.f28151X.dispose();
                }
                mo30449b();
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            try {
                Object apply = this.f28154a0.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) apply;
                this.f28152Y.getAndIncrement();
                C12197a aVar = new C12197a();
                if (!this.f28158d0 && this.f28151X.mo30250b(aVar)) {
                    singleSource.mo30216a(aVar);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28157c0.cancel();
                onError(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30449b() {
            if (getAndIncrement() == 0) {
                mo30450c();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30447a(C12197a aVar, R r) {
            this.f28151X.mo30251c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.f28152Y.decrementAndGet() != 0) {
                        z = false;
                    }
                    if (this.f28150W.get() != 0) {
                        this.f28156c.onNext(r);
                        C12491c cVar = (C12491c) this.f28155b0.get();
                        if (!z || (cVar != null && !cVar.isEmpty())) {
                            C12544d.m39343c(this.f28150W, 1);
                            if (this.f28149V != Integer.MAX_VALUE) {
                                this.f28157c0.mo29946b(1);
                            }
                        } else {
                            Throwable a = this.f28153Z.mo30668a();
                            if (a != null) {
                                this.f28156c.onError(a);
                            } else {
                                this.f28156c.onComplete();
                            }
                            return;
                        }
                    } else {
                        C12491c d = mo30451d();
                        synchronized (d) {
                            d.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    mo30450c();
                }
            }
            C12491c d2 = mo30451d();
            synchronized (d2) {
                d2.offer(r);
            }
            this.f28152Y.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            mo30450c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30448a(C12197a aVar, Throwable th) {
            this.f28151X.mo30251c(aVar);
            if (this.f28153Z.mo30669a(th)) {
                if (!this.f28148U) {
                    this.f28157c0.cancel();
                    this.f28151X.dispose();
                } else if (this.f28149V != Integer.MAX_VALUE) {
                    this.f28157c0.mo29946b(1);
                }
                this.f28152Y.decrementAndGet();
                mo30449b();
                return;
            }
            C11915a.m38466b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30446a() {
            C12491c cVar = (C12491c) this.f28155b0.get();
            if (cVar != null) {
                cVar.clear();
            }
        }
    }

    public C12195q(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.f28145V = function;
        this.f28146W = z;
        this.f28147X = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super R> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12196a<Object>(subscriber, this.f28145V, this.f28146W, this.f28147X));
    }
}
