package p520io.reactivex.p531y.p536e.p538b;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12048k;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p543f.C12490b;
import p520io.reactivex.p531y.p546i.C12536d;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.q0 */
/* compiled from: FlowableZip */
public final class C12198q0<T, R> extends Flowable<R> {

    /* renamed from: U */
    final C14313b<? extends T>[] f28160U;

    /* renamed from: V */
    final Iterable<? extends C14313b<? extends T>> f28161V;

    /* renamed from: W */
    final Function<? super Object[], ? extends R> f28162W;

    /* renamed from: X */
    final int f28163X;

    /* renamed from: Y */
    final boolean f28164Y;

    /* renamed from: io.reactivex.y.e.b.q0$a */
    /* compiled from: FlowableZip */
    static final class C12199a<T, R> extends AtomicInteger implements C14314c {

        /* renamed from: U */
        final C12200b<T, R>[] f28165U;

        /* renamed from: V */
        final Function<? super Object[], ? extends R> f28166V;

        /* renamed from: W */
        final AtomicLong f28167W;

        /* renamed from: X */
        final C12543c f28168X;

        /* renamed from: Y */
        final boolean f28169Y;

        /* renamed from: Z */
        volatile boolean f28170Z;

        /* renamed from: a0 */
        final Object[] f28171a0;

        /* renamed from: c */
        final Subscriber<? super R> f28172c;

        C12199a(Subscriber<? super R> subscriber, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.f28172c = subscriber;
            this.f28166V = function;
            this.f28169Y = z;
            C12200b<T, R>[] bVarArr = new C12200b[i];
            for (int i3 = 0; i3 < i; i3++) {
                bVarArr[i3] = new C12200b<>(this, i2);
            }
            this.f28171a0 = new Object[i];
            this.f28165U = bVarArr;
            this.f28167W = new AtomicLong();
            this.f28168X = new C12543c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30454a(C14313b<? extends T>[] bVarArr, int i) {
            C12200b<T, R>[] bVarArr2 = this.f28165U;
            int i2 = 0;
            while (i2 < i && !this.f28170Z) {
                if (this.f28169Y || this.f28168X.get() == null) {
                    bVarArr[i2].subscribe(bVarArr2[i2]);
                    i2++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a(this.f28167W, j);
                mo30455b();
            }
        }

        public void cancel() {
            if (!this.f28170Z) {
                this.f28170Z = true;
                mo30452a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30453a(C12200b<T, R> bVar, Throwable th) {
            if (this.f28168X.mo30669a(th)) {
                bVar.f28177Y = true;
                mo30455b();
                return;
            }
            C11915a.m38466b(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30455b() {
            int i;
            if (getAndIncrement() == 0) {
                Subscriber<? super R> subscriber = this.f28172c;
                C12200b<T, R>[] bVarArr = this.f28165U;
                int length = bVarArr.length;
                Object[] objArr = this.f28171a0;
                int i2 = 1;
                do {
                    long j = this.f28167W.get();
                    long j2 = 0;
                    while (true) {
                        i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (!this.f28170Z) {
                            if (this.f28169Y || this.f28168X.get() == null) {
                                boolean z = false;
                                for (int i3 = 0; i3 < length; i3++) {
                                    C12200b<T, R> bVar = bVarArr[i3];
                                    if (objArr[i3] == null) {
                                        try {
                                            boolean z2 = bVar.f28177Y;
                                            C12051n<T> nVar = bVar.f28175W;
                                            Object poll = nVar != null ? nVar.poll() : null;
                                            boolean z3 = poll == null;
                                            if (!z2 || !z3) {
                                                if (!z3) {
                                                    objArr[i3] = poll;
                                                }
                                                z = true;
                                            } else {
                                                mo30452a();
                                                if (((Throwable) this.f28168X.get()) != null) {
                                                    subscriber.onError(this.f28168X.mo30668a());
                                                } else {
                                                    subscriber.onComplete();
                                                }
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C12003b.m38614b(th);
                                            this.f28168X.mo30669a(th);
                                            if (!this.f28169Y) {
                                                mo30452a();
                                                subscriber.onError(this.f28168X.mo30668a());
                                                return;
                                            }
                                        }
                                    }
                                }
                                if (z) {
                                    break;
                                }
                                try {
                                    subscriber.onNext(C12036b.m38663a(this.f28166V.apply(objArr.clone()), "The zipper returned a null value"));
                                    j2++;
                                    Arrays.fill(objArr, null);
                                } catch (Throwable th2) {
                                    C12003b.m38614b(th2);
                                    mo30452a();
                                    this.f28168X.mo30669a(th2);
                                    subscriber.onError(this.f28168X.mo30668a());
                                    return;
                                }
                            } else {
                                mo30452a();
                                subscriber.onError(this.f28168X.mo30668a());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (i == 0) {
                        if (!this.f28170Z) {
                            if (this.f28169Y || this.f28168X.get() == null) {
                                for (int i4 = 0; i4 < length; i4++) {
                                    C12200b<T, R> bVar2 = bVarArr[i4];
                                    if (objArr[i4] == null) {
                                        try {
                                            boolean z4 = bVar2.f28177Y;
                                            C12051n<T> nVar2 = bVar2.f28175W;
                                            Object poll2 = nVar2 != null ? nVar2.poll() : null;
                                            boolean z5 = poll2 == null;
                                            if (z4 && z5) {
                                                mo30452a();
                                                if (((Throwable) this.f28168X.get()) != null) {
                                                    subscriber.onError(this.f28168X.mo30668a());
                                                } else {
                                                    subscriber.onComplete();
                                                }
                                                return;
                                            } else if (!z5) {
                                                objArr[i4] = poll2;
                                            }
                                        } catch (Throwable th3) {
                                            C12003b.m38614b(th3);
                                            this.f28168X.mo30669a(th3);
                                            if (!this.f28169Y) {
                                                mo30452a();
                                                subscriber.onError(this.f28168X.mo30668a());
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                mo30452a();
                                subscriber.onError(this.f28168X.mo30668a());
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (j2 != 0) {
                        for (C12200b<T, R> b : bVarArr) {
                            b.mo29946b(j2);
                        }
                        if (j != Long.MAX_VALUE) {
                            this.f28167W.addAndGet(-j2);
                        }
                    }
                    i2 = addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30452a() {
            for (C12200b<T, R> cancel : this.f28165U) {
                cancel.cancel();
            }
        }
    }

    /* renamed from: io.reactivex.y.e.b.q0$b */
    /* compiled from: FlowableZip */
    static final class C12200b<T, R> extends AtomicReference<C14314c> implements C11955i<T>, C14314c {

        /* renamed from: U */
        final int f28173U;

        /* renamed from: V */
        final int f28174V;

        /* renamed from: W */
        C12051n<T> f28175W;

        /* renamed from: X */
        long f28176X;

        /* renamed from: Y */
        volatile boolean f28177Y;

        /* renamed from: Z */
        int f28178Z;

        /* renamed from: c */
        final C12199a<T, R> f28179c;

        C12200b(C12199a<T, R> aVar, int i) {
            this.f28179c = aVar;
            this.f28173U = i;
            this.f28174V = i - (i >> 2);
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39328a((AtomicReference<C14314c>) this, cVar)) {
                if (cVar instanceof C12048k) {
                    C12048k kVar = (C12048k) cVar;
                    int a = kVar.mo30285a(7);
                    if (a == 1) {
                        this.f28178Z = a;
                        this.f28175W = kVar;
                        this.f28177Y = true;
                        this.f28179c.mo30455b();
                        return;
                    } else if (a == 2) {
                        this.f28178Z = a;
                        this.f28175W = kVar;
                        cVar.mo29946b((long) this.f28173U);
                        return;
                    }
                }
                this.f28175W = new C12490b(this.f28173U);
                cVar.mo29946b((long) this.f28173U);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (this.f28178Z != 1) {
                long j2 = this.f28176X + j;
                if (j2 >= ((long) this.f28174V)) {
                    this.f28176X = 0;
                    ((C14314c) get()).mo29946b(j2);
                    return;
                }
                this.f28176X = j2;
            }
        }

        public void cancel() {
            C12539g.m39326a((AtomicReference<C14314c>) this);
        }

        public void onComplete() {
            this.f28177Y = true;
            this.f28179c.mo30455b();
        }

        public void onError(Throwable th) {
            this.f28179c.mo30453a(this, th);
        }

        public void onNext(T t) {
            if (this.f28178Z != 2) {
                this.f28175W.offer(t);
            }
            this.f28179c.mo30455b();
        }
    }

    public C12198q0(C14313b<? extends T>[] bVarArr, Iterable<? extends C14313b<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f28160U = bVarArr;
        this.f28161V = iterable;
        this.f28162W = function;
        this.f28163X = i;
        this.f28164Y = z;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super R> subscriber) {
        int i;
        C14313b<? extends T>[] bVarArr = this.f28160U;
        if (bVarArr == null) {
            bVarArr = new C14313b[8];
            i = 0;
            for (C14313b<? extends T> bVar : this.f28161V) {
                if (i == bVarArr.length) {
                    C14313b<? extends T>[] bVarArr2 = new C14313b[((i >> 2) + i)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, i);
                    bVarArr = bVarArr2;
                }
                int i2 = i + 1;
                bVarArr[i] = bVar;
                i = i2;
            }
        } else {
            i = bVarArr.length;
        }
        if (i == 0) {
            C12536d.m39311a(subscriber);
            return;
        }
        C12199a aVar = new C12199a(subscriber, this.f28162W, i, this.f28163X, this.f28164Y);
        subscriber.mo29945a(aVar);
        aVar.mo30454a(bVarArr, i);
    }
}
