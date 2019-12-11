package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12048k;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p543f.C12490b;
import p520io.reactivex.p531y.p546i.C12538f;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;
import p520io.reactivex.p531y.p547j.C12547g;

/* renamed from: io.reactivex.y.e.b.b */
/* compiled from: FlowableConcatMap */
public final class C12114b<T, R> extends C12111a<T, R> {

    /* renamed from: io.reactivex.y.e.b.b$a */
    /* compiled from: FlowableConcatMap */
    static /* synthetic */ class C12115a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27892a = new int[C12547g.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                io.reactivex.y.j.g[] r0 = p520io.reactivex.p531y.p547j.C12547g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27892a = r0
                int[] r0 = f27892a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.y.j.g r1 = p520io.reactivex.p531y.p547j.C12547g.BOUNDARY     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27892a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.y.j.g r1 = p520io.reactivex.p531y.p547j.C12547g.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p538b.C12114b.C12115a.<clinit>():void");
        }
    }

    /* renamed from: io.reactivex.y.e.b.b$b */
    /* compiled from: FlowableConcatMap */
    static abstract class C12116b<T, R> extends AtomicInteger implements C11955i<T>, C12120f<R>, C14314c {

        /* renamed from: U */
        final Function<? super T, ? extends C14313b<? extends R>> f27893U;

        /* renamed from: V */
        final int f27894V;

        /* renamed from: W */
        final int f27895W;

        /* renamed from: X */
        C14314c f27896X;

        /* renamed from: Y */
        int f27897Y;

        /* renamed from: Z */
        C12051n<T> f27898Z;

        /* renamed from: a0 */
        volatile boolean f27899a0;

        /* renamed from: b0 */
        volatile boolean f27900b0;

        /* renamed from: c */
        final C12119e<R> f27901c = new C12119e<>(this);

        /* renamed from: c0 */
        final C12543c f27902c0 = new C12543c();

        /* renamed from: d0 */
        volatile boolean f27903d0;

        /* renamed from: e0 */
        int f27904e0;

        C12116b(Function<? super T, ? extends C14313b<? extends R>> function, int i) {
            this.f27893U = function;
            this.f27894V = i;
            this.f27895W = i - (i >> 2);
        }

        /* renamed from: a */
        public final void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f27896X, cVar)) {
                this.f27896X = cVar;
                if (cVar instanceof C12048k) {
                    C12048k kVar = (C12048k) cVar;
                    int a = kVar.mo30285a(7);
                    if (a == 1) {
                        this.f27904e0 = a;
                        this.f27898Z = kVar;
                        this.f27899a0 = true;
                        mo30394c();
                        mo30393b();
                        return;
                    } else if (a == 2) {
                        this.f27904e0 = a;
                        this.f27898Z = kVar;
                        mo30394c();
                        cVar.mo29946b((long) this.f27894V);
                        return;
                    }
                }
                this.f27898Z = new C12490b(this.f27894V);
                mo30394c();
                cVar.mo29946b((long) this.f27894V);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo30393b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract void mo30394c();

        public final void onComplete() {
            this.f27899a0 = true;
            mo30393b();
        }

        public final void onNext(T t) {
            if (this.f27904e0 == 2 || this.f27898Z.offer(t)) {
                mo30393b();
                return;
            }
            this.f27896X.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }

        /* renamed from: a */
        public final void mo30392a() {
            this.f27903d0 = false;
            mo30393b();
        }
    }

    /* renamed from: io.reactivex.y.e.b.b$c */
    /* compiled from: FlowableConcatMap */
    static final class C12117c<T, R> extends C12116b<T, R> {

        /* renamed from: f0 */
        final Subscriber<? super R> f27905f0;

        /* renamed from: g0 */
        final boolean f27906g0;

        C12117c(Subscriber<? super R> subscriber, Function<? super T, ? extends C14313b<? extends R>> function, int i, boolean z) {
            super(function, i);
            this.f27905f0 = subscriber;
            this.f27906g0 = z;
        }

        /* renamed from: a */
        public void mo30395a(Throwable th) {
            if (this.f27902c0.mo30669a(th)) {
                if (!this.f27906g0) {
                    this.f27896X.cancel();
                    this.f27899a0 = true;
                }
                this.f27903d0 = false;
                mo30393b();
                return;
            }
            C11915a.m38466b(th);
        }

        /* renamed from: b */
        public void mo30396b(R r) {
            this.f27905f0.onNext(r);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30394c() {
            this.f27905f0.mo29945a(this);
        }

        public void cancel() {
            if (!this.f27900b0) {
                this.f27900b0 = true;
                this.f27901c.cancel();
                this.f27896X.cancel();
            }
        }

        public void onError(Throwable th) {
            if (this.f27902c0.mo30669a(th)) {
                this.f27899a0 = true;
                mo30393b();
                return;
            }
            C11915a.m38466b(th);
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            this.f27901c.mo29946b(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30393b() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f27900b0) {
                    if (!this.f27903d0) {
                        boolean z = this.f27899a0;
                        if (!z || this.f27906g0 || ((Throwable) this.f27902c0.get()) == null) {
                            try {
                                Object poll = this.f27898Z.poll();
                                boolean z2 = poll == null;
                                if (z && z2) {
                                    Throwable a = this.f27902c0.mo30668a();
                                    if (a != null) {
                                        this.f27905f0.onError(a);
                                    } else {
                                        this.f27905f0.onComplete();
                                    }
                                    return;
                                } else if (!z2) {
                                    try {
                                        Object apply = this.f27893U.apply(poll);
                                        C12036b.m38663a(apply, "The mapper returned a null Publisher");
                                        C14313b bVar = (C14313b) apply;
                                        if (this.f27904e0 != 1) {
                                            int i = this.f27897Y + 1;
                                            if (i == this.f27895W) {
                                                this.f27897Y = 0;
                                                this.f27896X.mo29946b((long) i);
                                            } else {
                                                this.f27897Y = i;
                                            }
                                        }
                                        if (bVar instanceof Callable) {
                                            try {
                                                obj = ((Callable) bVar).call();
                                            } catch (Throwable th) {
                                                C12003b.m38614b(th);
                                                this.f27902c0.mo30669a(th);
                                                if (!this.f27906g0) {
                                                    this.f27896X.cancel();
                                                    this.f27905f0.onError(this.f27902c0.mo30668a());
                                                    return;
                                                }
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                continue;
                                            } else if (this.f27901c.mo30661d()) {
                                                this.f27905f0.onNext(obj);
                                            } else {
                                                this.f27903d0 = true;
                                                C12119e<R> eVar = this.f27901c;
                                                eVar.mo30659b((C14314c) new C12121g(obj, eVar));
                                            }
                                        } else {
                                            this.f27903d0 = true;
                                            bVar.subscribe(this.f27901c);
                                        }
                                    } catch (Throwable th2) {
                                        C12003b.m38614b(th2);
                                        this.f27896X.cancel();
                                        this.f27902c0.mo30669a(th2);
                                        this.f27905f0.onError(this.f27902c0.mo30668a());
                                        return;
                                    }
                                }
                            } catch (Throwable th3) {
                                C12003b.m38614b(th3);
                                this.f27896X.cancel();
                                this.f27902c0.mo30669a(th3);
                                this.f27905f0.onError(this.f27902c0.mo30668a());
                                return;
                            }
                        } else {
                            this.f27905f0.onError(this.f27902c0.mo30668a());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.e.b.b$d */
    /* compiled from: FlowableConcatMap */
    static final class C12118d<T, R> extends C12116b<T, R> {

        /* renamed from: f0 */
        final Subscriber<? super R> f27907f0;

        /* renamed from: g0 */
        final AtomicInteger f27908g0 = new AtomicInteger();

        C12118d(Subscriber<? super R> subscriber, Function<? super T, ? extends C14313b<? extends R>> function, int i) {
            super(function, i);
            this.f27907f0 = subscriber;
        }

        /* renamed from: a */
        public void mo30395a(Throwable th) {
            if (this.f27902c0.mo30669a(th)) {
                this.f27896X.cancel();
                if (getAndIncrement() == 0) {
                    this.f27907f0.onError(this.f27902c0.mo30668a());
                    return;
                }
                return;
            }
            C11915a.m38466b(th);
        }

        /* renamed from: b */
        public void mo30396b(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f27907f0.onNext(r);
                if (!compareAndSet(1, 0)) {
                    this.f27907f0.onError(this.f27902c0.mo30668a());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30394c() {
            this.f27907f0.mo29945a(this);
        }

        public void cancel() {
            if (!this.f27900b0) {
                this.f27900b0 = true;
                this.f27901c.cancel();
                this.f27896X.cancel();
            }
        }

        public void onError(Throwable th) {
            if (this.f27902c0.mo30669a(th)) {
                this.f27901c.cancel();
                if (getAndIncrement() == 0) {
                    this.f27907f0.onError(this.f27902c0.mo30668a());
                    return;
                }
                return;
            }
            C11915a.m38466b(th);
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            this.f27901c.mo29946b(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30393b() {
            if (this.f27908g0.getAndIncrement() == 0) {
                while (!this.f27900b0) {
                    if (!this.f27903d0) {
                        boolean z = this.f27899a0;
                        try {
                            Object poll = this.f27898Z.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f27907f0.onComplete();
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.f27893U.apply(poll);
                                    C12036b.m38663a(apply, "The mapper returned a null Publisher");
                                    C14313b bVar = (C14313b) apply;
                                    if (this.f27904e0 != 1) {
                                        int i = this.f27897Y + 1;
                                        if (i == this.f27895W) {
                                            this.f27897Y = 0;
                                            this.f27896X.mo29946b((long) i);
                                        } else {
                                            this.f27897Y = i;
                                        }
                                    }
                                    if (bVar instanceof Callable) {
                                        try {
                                            Object call = ((Callable) bVar).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.f27901c.mo30661d()) {
                                                this.f27903d0 = true;
                                                C12119e<R> eVar = this.f27901c;
                                                eVar.mo30659b((C14314c) new C12121g(call, eVar));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f27907f0.onNext(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f27907f0.onError(this.f27902c0.mo30668a());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            C12003b.m38614b(th);
                                            this.f27896X.cancel();
                                            this.f27902c0.mo30669a(th);
                                            this.f27907f0.onError(this.f27902c0.mo30668a());
                                            return;
                                        }
                                    } else {
                                        this.f27903d0 = true;
                                        bVar.subscribe(this.f27901c);
                                    }
                                } catch (Throwable th2) {
                                    C12003b.m38614b(th2);
                                    this.f27896X.cancel();
                                    this.f27902c0.mo30669a(th2);
                                    this.f27907f0.onError(this.f27902c0.mo30668a());
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            C12003b.m38614b(th3);
                            this.f27896X.cancel();
                            this.f27902c0.mo30669a(th3);
                            this.f27907f0.onError(this.f27902c0.mo30668a());
                            return;
                        }
                    }
                    if (this.f27908g0.decrementAndGet() == 0) {
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.e.b.b$e */
    /* compiled from: FlowableConcatMap */
    static final class C12119e<R> extends C12538f implements C11955i<R> {

        /* renamed from: b0 */
        final C12120f<R> f27909b0;

        /* renamed from: c0 */
        long f27910c0;

        C12119e(C12120f<R> fVar) {
            super(false);
            this.f27909b0 = fVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            mo30659b(cVar);
        }

        public void onComplete() {
            long j = this.f27910c0;
            if (j != 0) {
                this.f27910c0 = 0;
                mo30657a(j);
            }
            this.f27909b0.mo30392a();
        }

        public void onError(Throwable th) {
            long j = this.f27910c0;
            if (j != 0) {
                this.f27910c0 = 0;
                mo30657a(j);
            }
            this.f27909b0.mo30395a(th);
        }

        public void onNext(R r) {
            this.f27910c0++;
            this.f27909b0.mo30396b(r);
        }
    }

    /* renamed from: io.reactivex.y.e.b.b$f */
    /* compiled from: FlowableConcatMap */
    interface C12120f<T> {
        /* renamed from: a */
        void mo30392a();

        /* renamed from: a */
        void mo30395a(Throwable th);

        /* renamed from: b */
        void mo30396b(T t);
    }

    /* renamed from: io.reactivex.y.e.b.b$g */
    /* compiled from: FlowableConcatMap */
    static final class C12121g<T> implements C14314c {

        /* renamed from: U */
        final T f27911U;

        /* renamed from: V */
        boolean f27912V;

        /* renamed from: c */
        final Subscriber<? super T> f27913c;

        C12121g(T t, Subscriber<? super T> subscriber) {
            this.f27911U = t;
            this.f27913c = subscriber;
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (j > 0 && !this.f27912V) {
                this.f27912V = true;
                Subscriber<? super T> subscriber = this.f27913c;
                subscriber.onNext(this.f27911U);
                subscriber.onComplete();
            }
        }

        public void cancel() {
        }
    }

    /* renamed from: a */
    public static <T, R> Subscriber<T> m38724a(Subscriber<? super R> subscriber, Function<? super T, ? extends C14313b<? extends R>> function, int i, C12547g gVar) {
        int i2 = C12115a.f27892a[gVar.ordinal()];
        if (i2 == 1) {
            return new C12117c(subscriber, function, i, false);
        }
        if (i2 != 2) {
            return new C12118d(subscriber, function, i);
        }
        return new C12117c(subscriber, function, i, true);
    }
}
