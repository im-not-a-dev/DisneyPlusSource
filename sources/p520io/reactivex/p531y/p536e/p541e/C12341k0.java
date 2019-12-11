package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12043f;
import p520io.reactivex.p548z.C12557a;

/* renamed from: io.reactivex.y.e.e.k0 */
/* compiled from: ObservablePublish */
public final class C12341k0<T> extends C12557a<T> implements C12043f<T>, C12351m0<T> {

    /* renamed from: U */
    final AtomicReference<C12343b<T>> f28526U;

    /* renamed from: V */
    final ObservableSource<T> f28527V;

    /* renamed from: c */
    final ObservableSource<T> f28528c;

    /* renamed from: io.reactivex.y.e.e.k0$a */
    /* compiled from: ObservablePublish */
    static final class C12342a<T> extends AtomicReference<Object> implements Disposable {

        /* renamed from: c */
        final C11968q<? super T> f28529c;

        C12342a(C11968q<? super T> qVar) {
            this.f28529c = qVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30499a(C12343b<T> bVar) {
            if (!compareAndSet(null, bVar)) {
                bVar.mo30501b(this);
            }
        }

        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet != null && andSet != this) {
                ((C12343b) andSet).mo30501b(this);
            }
        }

        public boolean isDisposed() {
            return get() == this;
        }
    }

    /* renamed from: io.reactivex.y.e.e.k0$b */
    /* compiled from: ObservablePublish */
    static final class C12343b<T> implements C11968q<T>, Disposable {

        /* renamed from: X */
        static final C12342a[] f28530X = new C12342a[0];

        /* renamed from: Y */
        static final C12342a[] f28531Y = new C12342a[0];

        /* renamed from: U */
        final AtomicReference<C12342a<T>[]> f28532U = new AtomicReference<>(f28530X);

        /* renamed from: V */
        final AtomicBoolean f28533V;

        /* renamed from: W */
        final AtomicReference<Disposable> f28534W = new AtomicReference<>();

        /* renamed from: c */
        final AtomicReference<C12343b<T>> f28535c;

        C12343b(AtomicReference<C12343b<T>> atomicReference) {
            this.f28535c = atomicReference;
            this.f28533V = new AtomicBoolean();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30500a(C12342a<T> aVar) {
            C12342a[] aVarArr;
            C12342a[] aVarArr2;
            do {
                aVarArr = (C12342a[]) this.f28532U.get();
                if (aVarArr == f28531Y) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12342a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!this.f28532U.compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30501b(C12342a<T> aVar) {
            C12342a[] aVarArr;
            C12342a[] aVarArr2;
            do {
                aVarArr = (C12342a[]) this.f28532U.get();
                int length = aVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (aVarArr[i2].equals(aVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            aVarArr2 = f28530X;
                        } else {
                            C12342a[] aVarArr3 = new C12342a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                            aVarArr2 = aVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f28532U.compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            if (((C12342a[]) this.f28532U.getAndSet(f28531Y)) != f28531Y) {
                this.f28535c.compareAndSet(this, null);
                C12010c.m38621a(this.f28534W);
            }
        }

        public boolean isDisposed() {
            return this.f28532U.get() == f28531Y;
        }

        public void onComplete() {
            this.f28535c.compareAndSet(this, null);
            for (C12342a aVar : (C12342a[]) this.f28532U.getAndSet(f28531Y)) {
                aVar.f28529c.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f28535c.compareAndSet(this, null);
            C12342a[] aVarArr = (C12342a[]) this.f28532U.getAndSet(f28531Y);
            if (aVarArr.length != 0) {
                for (C12342a aVar : aVarArr) {
                    aVar.f28529c.onError(th);
                }
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            for (C12342a aVar : (C12342a[]) this.f28532U.get()) {
                aVar.f28529c.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this.f28534W, disposable);
        }
    }

    /* renamed from: io.reactivex.y.e.e.k0$c */
    /* compiled from: ObservablePublish */
    static final class C12344c<T> implements ObservableSource<T> {

        /* renamed from: c */
        private final AtomicReference<C12343b<T>> f28536c;

        C12344c(AtomicReference<C12343b<T>> atomicReference) {
            this.f28536c = atomicReference;
        }

        /* renamed from: a */
        public void mo30162a(C11968q<? super T> qVar) {
            C12342a aVar = new C12342a(qVar);
            qVar.onSubscribe(aVar);
            while (true) {
                C12343b bVar = (C12343b) this.f28536c.get();
                if (bVar == null || bVar.isDisposed()) {
                    C12343b bVar2 = new C12343b(this.f28536c);
                    if (!this.f28536c.compareAndSet(bVar, bVar2)) {
                        continue;
                    } else {
                        bVar = bVar2;
                    }
                }
                if (bVar.mo30500a(aVar)) {
                    aVar.mo30499a(bVar);
                    return;
                }
            }
        }
    }

    private C12341k0(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<C12343b<T>> atomicReference) {
        this.f28527V = observableSource;
        this.f28528c = observableSource2;
        this.f28526U = atomicReference;
    }

    /* renamed from: e */
    public static <T> C12557a<T> m39028e(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return C11915a.m38456a((C12557a<T>) new C12341k0<T>(new C12344c(atomicReference), observableSource, atomicReference));
    }

    /* renamed from: a */
    public ObservableSource<T> mo30497a() {
        return this.f28528c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28527V.mo30162a(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30498g(p520io.reactivex.functions.Consumer<? super p520io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.k0$b<T>> r0 = r4.f28526U
            java.lang.Object r0 = r0.get()
            io.reactivex.y.e.e.k0$b r0 = (p520io.reactivex.p531y.p536e.p541e.C12341k0.C12343b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            io.reactivex.y.e.e.k0$b r1 = new io.reactivex.y.e.e.k0$b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.k0$b<T>> r2 = r4.f28526U
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.k0$b<T>> r2 = r4.f28526U
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f28533V
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f28533V
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.accept(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            io.reactivex.ObservableSource<T> r5 = r4.f28528c
            r5.mo30162a(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            p520io.reactivex.p530x.C12003b.m38614b(r5)
            java.lang.RuntimeException r5 = p520io.reactivex.p531y.p547j.C12548h.m39353b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p541e.C12341k0.mo30498g(io.reactivex.functions.Consumer):void");
    }
}
