package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12048k;
import p520io.reactivex.p531y.p534c.C12050m;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p543f.C12490b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12543c;
import p520io.reactivex.p531y.p547j.C12544d;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.y.e.b.m */
/* compiled from: FlowableFlatMap */
public final class C12174m<T, U> extends C12111a<T, U> {

    /* renamed from: V */
    final Function<? super T, ? extends C14313b<? extends U>> f28057V;

    /* renamed from: W */
    final boolean f28058W;

    /* renamed from: X */
    final int f28059X;

    /* renamed from: Y */
    final int f28060Y;

    /* renamed from: io.reactivex.y.e.b.m$a */
    /* compiled from: FlowableFlatMap */
    static final class C12175a<T, U> extends AtomicReference<C14314c> implements C11955i<U>, Disposable {

        /* renamed from: U */
        final C12176b<T, U> f28061U;

        /* renamed from: V */
        final int f28062V = (this.f28063W >> 2);

        /* renamed from: W */
        final int f28063W;

        /* renamed from: X */
        volatile boolean f28064X;

        /* renamed from: Y */
        volatile C12051n<U> f28065Y;

        /* renamed from: Z */
        long f28066Z;

        /* renamed from: a0 */
        int f28067a0;

        /* renamed from: c */
        final long f28068c;

        C12175a(C12176b<T, U> bVar, long j) {
            this.f28068c = j;
            this.f28061U = bVar;
            this.f28063W = bVar.f28074X;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39328a((AtomicReference<C14314c>) this, cVar)) {
                if (cVar instanceof C12048k) {
                    C12048k kVar = (C12048k) cVar;
                    int a = kVar.mo30285a(7);
                    if (a == 1) {
                        this.f28067a0 = a;
                        this.f28065Y = kVar;
                        this.f28064X = true;
                        this.f28061U.mo30429d();
                        return;
                    } else if (a == 2) {
                        this.f28067a0 = a;
                        this.f28065Y = kVar;
                    }
                }
                cVar.mo29946b((long) this.f28063W);
            }
        }

        public void dispose() {
            C12539g.m39326a((AtomicReference<C14314c>) this);
        }

        public boolean isDisposed() {
            return get() == C12539g.CANCELLED;
        }

        public void onComplete() {
            this.f28064X = true;
            this.f28061U.mo30429d();
        }

        public void onError(Throwable th) {
            lazySet(C12539g.CANCELLED);
            this.f28061U.mo30420a(this, th);
        }

        public void onNext(U u) {
            if (this.f28067a0 != 2) {
                this.f28061U.mo30421a(u, this);
            } else {
                this.f28061U.mo30429d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30419a(long j) {
            if (this.f28067a0 != 1) {
                long j2 = this.f28066Z + j;
                if (j2 >= ((long) this.f28062V)) {
                    this.f28066Z = 0;
                    ((C14314c) get()).mo29946b(j2);
                    return;
                }
                this.f28066Z = j2;
            }
        }
    }

    /* renamed from: io.reactivex.y.e.b.m$b */
    /* compiled from: FlowableFlatMap */
    static final class C12176b<T, U> extends AtomicInteger implements C11955i<T>, C14314c {

        /* renamed from: k0 */
        static final C12175a<?, ?>[] f28069k0 = new C12175a[0];

        /* renamed from: l0 */
        static final C12175a<?, ?>[] f28070l0 = new C12175a[0];

        /* renamed from: U */
        final Function<? super T, ? extends C14313b<? extends U>> f28071U;

        /* renamed from: V */
        final boolean f28072V;

        /* renamed from: W */
        final int f28073W;

        /* renamed from: X */
        final int f28074X;

        /* renamed from: Y */
        volatile C12050m<U> f28075Y;

        /* renamed from: Z */
        volatile boolean f28076Z;

        /* renamed from: a0 */
        final C12543c f28077a0 = new C12543c();

        /* renamed from: b0 */
        volatile boolean f28078b0;

        /* renamed from: c */
        final Subscriber<? super U> f28079c;

        /* renamed from: c0 */
        final AtomicReference<C12175a<?, ?>[]> f28080c0 = new AtomicReference<>();

        /* renamed from: d0 */
        final AtomicLong f28081d0 = new AtomicLong();

        /* renamed from: e0 */
        C14314c f28082e0;

        /* renamed from: f0 */
        long f28083f0;

        /* renamed from: g0 */
        long f28084g0;

        /* renamed from: h0 */
        int f28085h0;

        /* renamed from: i0 */
        int f28086i0;

        /* renamed from: j0 */
        final int f28087j0;

        C12176b(Subscriber<? super U> subscriber, Function<? super T, ? extends C14313b<? extends U>> function, boolean z, int i, int i2) {
            this.f28079c = subscriber;
            this.f28071U = function;
            this.f28072V = z;
            this.f28073W = i;
            this.f28074X = i2;
            this.f28087j0 = Math.max(1, i >> 1);
            this.f28080c0.lazySet(f28069k0);
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28082e0, cVar)) {
                this.f28082e0 = cVar;
                this.f28079c.mo29945a(this);
                if (!this.f28078b0) {
                    int i = this.f28073W;
                    if (i == Integer.MAX_VALUE) {
                        cVar.mo29946b(Long.MAX_VALUE);
                    } else {
                        cVar.mo29946b((long) i);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30426b(U u) {
            String str = "Scalar queue full?!";
            if (get() == 0 && compareAndSet(0, 1)) {
                long j = this.f28081d0.get();
                C12051n nVar = this.f28075Y;
                if (j == 0 || (nVar != null && !nVar.isEmpty())) {
                    if (nVar == null) {
                        nVar = mo30431f();
                    }
                    if (!nVar.offer(u)) {
                        onError(new IllegalStateException(str));
                        return;
                    }
                } else {
                    this.f28079c.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f28081d0.decrementAndGet();
                    }
                    if (this.f28073W != Integer.MAX_VALUE && !this.f28078b0) {
                        int i = this.f28086i0 + 1;
                        this.f28086i0 = i;
                        int i2 = this.f28087j0;
                        if (i == i2) {
                            this.f28086i0 = 0;
                            this.f28082e0.mo29946b((long) i2);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!mo30431f().offer(u)) {
                onError(new IllegalStateException(str));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            mo30430e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30428c(C12175a<T, U> aVar) {
            C12175a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C12175a[]) this.f28080c0.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2] == aVar) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            obj = f28069k0;
                        } else {
                            C12175a[] aVarArr2 = new C12175a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                            obj = aVarArr2;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f28080c0.compareAndSet(aVarArr, obj));
        }

        public void cancel() {
            if (!this.f28078b0) {
                this.f28078b0 = true;
                this.f28082e0.cancel();
                mo30427c();
                if (getAndIncrement() == 0) {
                    C12050m<U> mVar = this.f28075Y;
                    if (mVar != null) {
                        mVar.clear();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30429d() {
            if (getAndIncrement() == 0) {
                mo30430e();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo30430e() {
            long j;
            long j2;
            long j3;
            boolean z;
            C12175a[] aVarArr;
            int i;
            long j4;
            Subscriber<? super U> subscriber = this.f28079c;
            int i2 = 1;
            while (!mo30422a()) {
                C12050m<U> mVar = this.f28075Y;
                long j5 = this.f28081d0.get();
                boolean z2 = j5 == Long.MAX_VALUE;
                long j6 = 0;
                long j7 = 0;
                if (mVar != null) {
                    while (true) {
                        long j8 = 0;
                        Object obj = null;
                        while (true) {
                            if (j5 == 0) {
                                break;
                            }
                            Object poll = mVar.poll();
                            if (!mo30422a()) {
                                if (poll == null) {
                                    obj = poll;
                                    break;
                                }
                                subscriber.onNext(poll);
                                j7++;
                                j8++;
                                j5--;
                                obj = poll;
                            } else {
                                return;
                            }
                        }
                        if (j8 != 0) {
                            if (z2) {
                                j5 = Long.MAX_VALUE;
                            } else {
                                j5 = this.f28081d0.addAndGet(-j8);
                            }
                        }
                        if (j5 == 0 || obj == null) {
                            break;
                        }
                    }
                }
                boolean z3 = this.f28076Z;
                C12050m<U> mVar2 = this.f28075Y;
                C12175a[] aVarArr2 = (C12175a[]) this.f28080c0.get();
                int length = aVarArr2.length;
                if (!z3 || ((mVar2 != null && !mVar2.isEmpty()) || length != 0)) {
                    int i3 = i2;
                    if (length != 0) {
                        long j9 = this.f28084g0;
                        int i4 = this.f28085h0;
                        if (length <= i4 || aVarArr2[i4].f28068c != j9) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            int i5 = i4;
                            for (int i6 = 0; i6 < length && aVarArr2[i5].f28068c != j9; i6++) {
                                i5++;
                                if (i5 == length) {
                                    i5 = 0;
                                }
                            }
                            this.f28085h0 = i5;
                            this.f28084g0 = aVarArr2[i5].f28068c;
                            i4 = i5;
                        }
                        int i7 = i4;
                        z = false;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length) {
                                aVarArr = aVarArr2;
                                break;
                            } else if (!mo30422a()) {
                                C12175a aVar = aVarArr2[i7];
                                Object obj2 = null;
                                while (!mo30422a()) {
                                    C12051n<U> nVar = aVar.f28065Y;
                                    if (nVar == null) {
                                        aVarArr = aVarArr2;
                                        i = length;
                                    } else {
                                        i = length;
                                        Object obj3 = obj2;
                                        aVarArr = aVarArr2;
                                        long j10 = j6;
                                        while (true) {
                                            if (j == j6) {
                                                break;
                                            }
                                            try {
                                                Object poll2 = nVar.poll();
                                                if (poll2 == null) {
                                                    obj3 = poll2;
                                                    j6 = 0;
                                                    break;
                                                }
                                                subscriber.onNext(poll2);
                                                if (!mo30422a()) {
                                                    j--;
                                                    j10++;
                                                    obj3 = poll2;
                                                    j6 = 0;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                C12003b.m38614b(th2);
                                                aVar.dispose();
                                                this.f28077a0.mo30669a(th2);
                                                if (!this.f28072V) {
                                                    this.f28082e0.cancel();
                                                }
                                                if (!mo30422a()) {
                                                    mo30428c(aVar);
                                                    i8++;
                                                    z = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j10 != j6) {
                                            j = !z2 ? this.f28081d0.addAndGet(-j10) : Long.MAX_VALUE;
                                            aVar.mo30419a(j10);
                                            j4 = 0;
                                        } else {
                                            j4 = j6;
                                        }
                                        if (!(j == j4 || obj3 == null)) {
                                            aVarArr2 = aVarArr;
                                            length = i;
                                            obj2 = obj3;
                                            j6 = 0;
                                        }
                                    }
                                    boolean z4 = aVar.f28064X;
                                    C12051n<U> nVar2 = aVar.f28065Y;
                                    if (z4 && (nVar2 == null || nVar2.isEmpty())) {
                                        mo30428c(aVar);
                                        if (!mo30422a()) {
                                            j7++;
                                            z = true;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j == 0) {
                                        break;
                                    }
                                    int i9 = i7 + 1;
                                    i7 = i9 == i ? 0 : i9;
                                    i8++;
                                    aVarArr2 = aVarArr;
                                    length = i;
                                    j6 = 0;
                                }
                                return;
                            } else {
                                return;
                            }
                        }
                        this.f28085h0 = i7;
                        this.f28084g0 = aVarArr[i7].f28068c;
                        j3 = j7;
                        j2 = 0;
                    } else {
                        j2 = 0;
                        j3 = j7;
                        z = false;
                    }
                    if (j3 != j2 && !this.f28078b0) {
                        this.f28082e0.mo29946b(j3);
                    }
                    if (z) {
                        i2 = i3;
                    } else {
                        i2 = addAndGet(-i3);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } else {
                    Throwable a = this.f28077a0.mo30668a();
                    if (a != C12548h.f29081a) {
                        if (a == null) {
                            subscriber.onComplete();
                        } else {
                            subscriber.onError(a);
                        }
                    }
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C12051n<U> mo30431f() {
            C12050m<U> mVar = this.f28075Y;
            if (mVar == null) {
                int i = this.f28073W;
                if (i == Integer.MAX_VALUE) {
                    mVar = new C12491c<>(this.f28074X);
                } else {
                    mVar = new C12490b<>(i);
                }
                this.f28075Y = mVar;
            }
            return mVar;
        }

        public void onComplete() {
            if (!this.f28076Z) {
                this.f28076Z = true;
                mo30429d();
            }
        }

        public void onError(Throwable th) {
            if (this.f28076Z) {
                C11915a.m38466b(th);
                return;
            }
            if (this.f28077a0.mo30669a(th)) {
                this.f28076Z = true;
                mo30429d();
            } else {
                C11915a.m38466b(th);
            }
        }

        public void onNext(T t) {
            if (!this.f28076Z) {
                try {
                    Object apply = this.f28071U.apply(t);
                    C12036b.m38663a(apply, "The mapper returned a null Publisher");
                    C14313b bVar = (C14313b) apply;
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                mo30426b((U) call);
                            } else if (this.f28073W != Integer.MAX_VALUE && !this.f28078b0) {
                                int i = this.f28086i0 + 1;
                                this.f28086i0 = i;
                                int i2 = this.f28087j0;
                                if (i == i2) {
                                    this.f28086i0 = 0;
                                    this.f28082e0.mo29946b((long) i2);
                                }
                            }
                        } catch (Throwable th) {
                            C12003b.m38614b(th);
                            this.f28077a0.mo30669a(th);
                            mo30429d();
                        }
                    } else {
                        long j = this.f28083f0;
                        this.f28083f0 = 1 + j;
                        C12175a aVar = new C12175a(this, j);
                        if (mo30423a(aVar)) {
                            bVar.subscribe(aVar);
                        }
                    }
                } catch (Throwable th2) {
                    C12003b.m38614b(th2);
                    this.f28082e0.cancel();
                    onError(th2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30423a(C12175a<T, U> aVar) {
            C12175a<?, ?>[] aVarArr;
            C12175a[] aVarArr2;
            do {
                aVarArr = (C12175a[]) this.f28080c0.get();
                if (aVarArr == f28070l0) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12175a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f28080c0.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30427c() {
            C12175a<?, ?>[] aVarArr = (C12175a[]) this.f28080c0.get();
            C12175a<?, ?>[] aVarArr2 = f28070l0;
            if (aVarArr != aVarArr2) {
                C12175a<?, ?>[] aVarArr3 = (C12175a[]) this.f28080c0.getAndSet(aVarArr2);
                if (aVarArr3 != f28070l0) {
                    for (C12175a<?, ?> dispose : aVarArr3) {
                        dispose.dispose();
                    }
                    Throwable a = this.f28077a0.mo30668a();
                    if (a != null && a != C12548h.f29081a) {
                        C11915a.m38466b(a);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30421a(U u, C12175a<T, U> aVar) {
            String str = "Inner queue full?!";
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12051n nVar = aVar.f28065Y;
                if (nVar == null) {
                    nVar = new C12490b(this.f28074X);
                    aVar.f28065Y = nVar;
                }
                if (!nVar.offer(u)) {
                    onError(new C12004c(str));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = this.f28081d0.get();
                C12051n<U> nVar2 = aVar.f28065Y;
                if (j == 0 || (nVar2 != null && !nVar2.isEmpty())) {
                    if (nVar2 == null) {
                        nVar2 = mo30424b(aVar);
                    }
                    if (!nVar2.offer(u)) {
                        onError(new C12004c(str));
                        return;
                    }
                } else {
                    this.f28079c.onNext(u);
                    if (j != Long.MAX_VALUE) {
                        this.f28081d0.decrementAndGet();
                    }
                    aVar.mo30419a(1);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo30430e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C12051n<U> mo30424b(C12175a<T, U> aVar) {
            C12051n<U> nVar = aVar.f28065Y;
            if (nVar != null) {
                return nVar;
            }
            C12490b bVar = new C12490b(this.f28074X);
            aVar.f28065Y = bVar;
            return bVar;
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a(this.f28081d0, j);
                mo30429d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30425b() {
            C12050m<U> mVar = this.f28075Y;
            if (mVar != null) {
                mVar.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30422a() {
            if (this.f28078b0) {
                mo30425b();
                return true;
            } else if (this.f28072V || this.f28077a0.get() == null) {
                return false;
            } else {
                mo30425b();
                Throwable a = this.f28077a0.mo30668a();
                if (a != C12548h.f29081a) {
                    this.f28079c.onError(a);
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30420a(C12175a<T, U> aVar, Throwable th) {
            if (this.f28077a0.mo30669a(th)) {
                aVar.f28064X = true;
                if (!this.f28072V) {
                    this.f28082e0.cancel();
                    for (C12175a dispose : (C12175a[]) this.f28080c0.getAndSet(f28070l0)) {
                        dispose.dispose();
                    }
                }
                mo30429d();
                return;
            }
            C11915a.m38466b(th);
        }
    }

    public C12174m(Flowable<T> flowable, Function<? super T, ? extends C14313b<? extends U>> function, boolean z, int i, int i2) {
        super(flowable);
        this.f28057V = function;
        this.f28058W = z;
        this.f28059X = i;
        this.f28060Y = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super U> subscriber) {
        if (!C12155h0.m38805a(this.f27888U, subscriber, this.f28057V)) {
            this.f27888U.mo30080a(m38830a(subscriber, this.f28057V, this.f28058W, this.f28059X, this.f28060Y));
        }
    }

    /* renamed from: a */
    public static <T, U> C11955i<T> m38830a(Subscriber<? super U> subscriber, Function<? super T, ? extends C14313b<? extends U>> function, boolean z, int i, int i2) {
        C12176b bVar = new C12176b(subscriber, function, z, i, i2);
        return bVar;
    }
}
