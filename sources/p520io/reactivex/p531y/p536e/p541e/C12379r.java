package p520io.reactivex.p531y.p536e.p541e;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12046i;
import p520io.reactivex.p531y.p534c.C12050m;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p543f.C12490b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p547j.C12543c;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.y.e.e.r */
/* compiled from: ObservableFlatMap */
public final class C12379r<T, U> extends C12294a<T, U> {

    /* renamed from: U */
    final Function<? super T, ? extends ObservableSource<? extends U>> f28625U;

    /* renamed from: V */
    final boolean f28626V;

    /* renamed from: W */
    final int f28627W;

    /* renamed from: X */
    final int f28628X;

    /* renamed from: io.reactivex.y.e.e.r$a */
    /* compiled from: ObservableFlatMap */
    static final class C12380a<T, U> extends AtomicReference<Disposable> implements C11968q<U> {

        /* renamed from: U */
        final C12381b<T, U> f28629U;

        /* renamed from: V */
        volatile boolean f28630V;

        /* renamed from: W */
        volatile C12051n<U> f28631W;

        /* renamed from: X */
        int f28632X;

        /* renamed from: c */
        final long f28633c;

        C12380a(C12381b<T, U> bVar, long j) {
            this.f28633c = j;
            this.f28629U = bVar;
        }

        /* renamed from: a */
        public void mo30531a() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public void onComplete() {
            this.f28630V = true;
            this.f28629U.mo30539c();
        }

        public void onError(Throwable th) {
            if (this.f28629U.f28642a0.mo30669a(th)) {
                C12381b<T, U> bVar = this.f28629U;
                if (!bVar.f28637V) {
                    bVar.mo30538b();
                }
                this.f28630V = true;
                this.f28629U.mo30539c();
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(U u) {
            if (this.f28632X == 0) {
                this.f28629U.mo30533a(u, this);
            } else {
                this.f28629U.mo30539c();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable) && (disposable instanceof C12046i)) {
                C12046i iVar = (C12046i) disposable;
                int a = iVar.mo30285a(7);
                if (a == 1) {
                    this.f28632X = a;
                    this.f28631W = iVar;
                    this.f28630V = true;
                    this.f28629U.mo30539c();
                } else if (a == 2) {
                    this.f28632X = a;
                    this.f28631W = iVar;
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.e.e.r$b */
    /* compiled from: ObservableFlatMap */
    static final class C12381b<T, U> extends AtomicInteger implements Disposable, C11968q<T> {

        /* renamed from: j0 */
        static final C12380a<?, ?>[] f28634j0 = new C12380a[0];

        /* renamed from: k0 */
        static final C12380a<?, ?>[] f28635k0 = new C12380a[0];

        /* renamed from: U */
        final Function<? super T, ? extends ObservableSource<? extends U>> f28636U;

        /* renamed from: V */
        final boolean f28637V;

        /* renamed from: W */
        final int f28638W;

        /* renamed from: X */
        final int f28639X;

        /* renamed from: Y */
        volatile C12050m<U> f28640Y;

        /* renamed from: Z */
        volatile boolean f28641Z;

        /* renamed from: a0 */
        final C12543c f28642a0 = new C12543c();

        /* renamed from: b0 */
        volatile boolean f28643b0;

        /* renamed from: c */
        final C11968q<? super U> f28644c;

        /* renamed from: c0 */
        final AtomicReference<C12380a<?, ?>[]> f28645c0;

        /* renamed from: d0 */
        Disposable f28646d0;

        /* renamed from: e0 */
        long f28647e0;

        /* renamed from: f0 */
        long f28648f0;

        /* renamed from: g0 */
        int f28649g0;

        /* renamed from: h0 */
        Queue<ObservableSource<? extends U>> f28650h0;

        /* renamed from: i0 */
        int f28651i0;

        C12381b(C11968q<? super U> qVar, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
            this.f28644c = qVar;
            this.f28636U = function;
            this.f28637V = z;
            this.f28638W = i;
            this.f28639X = i2;
            if (i != Integer.MAX_VALUE) {
                this.f28650h0 = new ArrayDeque(i);
            }
            this.f28645c0 = new AtomicReference<>(f28634j0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30532a(ObservableSource<? extends U> observableSource) {
            ObservableSource<? extends U> observableSource2;
            while (observableSource instanceof Callable) {
                if (mo30536a((Callable) observableSource) && this.f28638W != Integer.MAX_VALUE) {
                    boolean z = false;
                    synchronized (this) {
                        observableSource2 = (ObservableSource) this.f28650h0.poll();
                        if (observableSource2 == null) {
                            this.f28651i0--;
                            z = true;
                        }
                    }
                    if (z) {
                        mo30539c();
                        return;
                    }
                    observableSource = observableSource2;
                } else {
                    return;
                }
            }
            long j = this.f28647e0;
            this.f28647e0 = 1 + j;
            C12380a aVar = new C12380a(this, j);
            if (mo30535a(aVar)) {
                observableSource.mo30162a(aVar);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30537b(C12380a<T, U> aVar) {
            C12380a<T, U>[] aVarArr;
            Object obj;
            do {
                aVarArr = (C12380a[]) this.f28645c0.get();
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
                            obj = f28634j0;
                        } else {
                            C12380a[] aVarArr2 = new C12380a[(length - 1)];
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
            } while (!this.f28645c0.compareAndSet(aVarArr, obj));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30539c() {
            if (getAndIncrement() == 0) {
                mo30540d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30540d() {
            int i;
            int i2;
            int i3;
            C11968q<? super U> qVar = this.f28644c;
            int i4 = 1;
            while (!mo30534a()) {
                C12050m<U> mVar = this.f28640Y;
                if (mVar != null) {
                    while (!mo30534a()) {
                        Object poll = mVar.poll();
                        if (poll != null) {
                            qVar.onNext(poll);
                        }
                    }
                    return;
                }
                boolean z = this.f28641Z;
                C12050m<U> mVar2 = this.f28640Y;
                C12380a[] aVarArr = (C12380a[]) this.f28645c0.get();
                int length = aVarArr.length;
                if (this.f28638W != Integer.MAX_VALUE) {
                    synchronized (this) {
                        i = this.f28650h0.size();
                    }
                } else {
                    i = 0;
                }
                if (!z || !((mVar2 == null || mVar2.isEmpty()) && length == 0 && i == 0)) {
                    if (length != 0) {
                        long j = this.f28648f0;
                        int i5 = this.f28649g0;
                        if (length <= i5 || aVarArr[i5].f28633c != j) {
                            if (length <= i5) {
                                i5 = 0;
                            }
                            int i6 = i5;
                            for (int i7 = 0; i7 < length && aVarArr[i6].f28633c != j; i7++) {
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                            }
                            this.f28649g0 = i6;
                            this.f28648f0 = aVarArr[i6].f28633c;
                            i5 = i6;
                        }
                        int i8 = 0;
                        i2 = 0;
                        while (i8 < length) {
                            if (!mo30534a()) {
                                C12380a aVar = aVarArr[i3];
                                C12051n<U> nVar = aVar.f28631W;
                                if (nVar != null) {
                                    while (true) {
                                        try {
                                            Object poll2 = nVar.poll();
                                            if (poll2 == null) {
                                                break;
                                            }
                                            qVar.onNext(poll2);
                                            if (mo30534a()) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            C12003b.m38614b(th);
                                            aVar.mo30531a();
                                            this.f28642a0.mo30669a(th);
                                            if (!mo30534a()) {
                                                mo30537b(aVar);
                                                i2++;
                                                i3++;
                                                if (i3 != length) {
                                                }
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                boolean z2 = aVar.f28630V;
                                C12051n<U> nVar2 = aVar.f28631W;
                                if (z2 && (nVar2 == null || nVar2.isEmpty())) {
                                    mo30537b(aVar);
                                    if (!mo30534a()) {
                                        i2++;
                                    } else {
                                        return;
                                    }
                                }
                                i3++;
                                if (i3 != length) {
                                    i8++;
                                }
                                i3 = 0;
                                i8++;
                            } else {
                                return;
                            }
                        }
                        this.f28649g0 = i3;
                        this.f28648f0 = aVarArr[i3].f28633c;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i4 = addAndGet(-i4);
                        if (i4 == 0) {
                            return;
                        }
                    } else if (this.f28638W != Integer.MAX_VALUE) {
                        while (true) {
                            int i9 = i2 - 1;
                            if (i2 == 0) {
                                continue;
                                break;
                            }
                            synchronized (this) {
                                ObservableSource observableSource = (ObservableSource) this.f28650h0.poll();
                                if (observableSource == null) {
                                    this.f28651i0--;
                                } else {
                                    mo30532a(observableSource);
                                }
                            }
                            i2 = i9;
                        }
                        while (true) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Throwable a = this.f28642a0.mo30668a();
                    if (a != C12548h.f29081a) {
                        if (a == null) {
                            qVar.onComplete();
                        } else {
                            qVar.onError(a);
                        }
                    }
                    return;
                }
            }
        }

        public void dispose() {
            if (!this.f28643b0) {
                this.f28643b0 = true;
                if (mo30538b()) {
                    Throwable a = this.f28642a0.mo30668a();
                    if (a != null && a != C12548h.f29081a) {
                        C11915a.m38466b(a);
                    }
                }
            }
        }

        public boolean isDisposed() {
            return this.f28643b0;
        }

        public void onComplete() {
            if (!this.f28641Z) {
                this.f28641Z = true;
                mo30539c();
            }
        }

        public void onError(Throwable th) {
            if (this.f28641Z) {
                C11915a.m38466b(th);
                return;
            }
            if (this.f28642a0.mo30669a(th)) {
                this.f28641Z = true;
                mo30539c();
            } else {
                C11915a.m38466b(th);
            }
        }

        public void onNext(T t) {
            if (!this.f28641Z) {
                try {
                    Object apply = this.f28636U.apply(t);
                    C12036b.m38663a(apply, "The mapper returned a null ObservableSource");
                    ObservableSource observableSource = (ObservableSource) apply;
                    if (this.f28638W != Integer.MAX_VALUE) {
                        synchronized (this) {
                            if (this.f28651i0 == this.f28638W) {
                                this.f28650h0.offer(observableSource);
                                return;
                            }
                            this.f28651i0++;
                        }
                    }
                    mo30532a(observableSource);
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f28646d0.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28646d0, disposable)) {
                this.f28646d0 = disposable;
                this.f28644c.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo30538b() {
            this.f28646d0.dispose();
            C12380a<?, ?>[] aVarArr = (C12380a[]) this.f28645c0.get();
            C12380a<?, ?>[] aVarArr2 = f28635k0;
            if (aVarArr != aVarArr2) {
                C12380a<?, ?>[] aVarArr3 = (C12380a[]) this.f28645c0.getAndSet(aVarArr2);
                if (aVarArr3 != f28635k0) {
                    for (C12380a<?, ?> a : aVarArr3) {
                        a.mo30531a();
                    }
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30535a(C12380a<T, U> aVar) {
            C12380a<?, ?>[] aVarArr;
            C12380a[] aVarArr2;
            do {
                aVarArr = (C12380a[]) this.f28645c0.get();
                if (aVarArr == f28635k0) {
                    aVar.mo30531a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12380a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f28645c0.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30536a(Callable<? extends U> callable) {
            try {
                Object call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C12050m<U> mVar = this.f28640Y;
                    if (mVar == null) {
                        int i = this.f28638W;
                        if (i == Integer.MAX_VALUE) {
                            mVar = new C12491c<>(this.f28639X);
                        } else {
                            mVar = new C12490b<>(i);
                        }
                        this.f28640Y = mVar;
                    }
                    if (!mVar.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    } else if (getAndIncrement() != 0) {
                        return false;
                    }
                } else {
                    this.f28644c.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                }
                mo30540d();
                return true;
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28642a0.mo30669a(th);
                mo30539c();
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30533a(U u, C12380a<T, U> aVar) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                C12051n nVar = aVar.f28631W;
                if (nVar == null) {
                    nVar = new C12491c(this.f28639X);
                    aVar.f28631W = nVar;
                }
                nVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.f28644c.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            mo30540d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30534a() {
            if (this.f28643b0) {
                return true;
            }
            Throwable th = (Throwable) this.f28642a0.get();
            if (this.f28637V || th == null) {
                return false;
            }
            mo30538b();
            Throwable a = this.f28642a0.mo30668a();
            if (a != C12548h.f29081a) {
                this.f28644c.onError(a);
            }
            return true;
        }
    }

    public C12379r(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z, int i, int i2) {
        super(observableSource);
        this.f28625U = function;
        this.f28626V = z;
        this.f28627W = i;
        this.f28628X = i2;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super U> qVar) {
        if (!C12372p0.m39091a(this.f28379c, qVar, this.f28625U)) {
            ObservableSource<T> observableSource = this.f28379c;
            C12381b bVar = new C12381b(qVar, this.f28625U, this.f28626V, this.f28627W, this.f28628X);
            observableSource.mo30162a(bVar);
        }
    }
}
