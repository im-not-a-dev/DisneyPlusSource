package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12013f;
import p520io.reactivex.p531y.p534c.C12043f;
import p520io.reactivex.p548z.C12557a;

/* renamed from: io.reactivex.y.e.e.l0 */
/* compiled from: ObservablePublishAlt */
public final class C12346l0<T> extends C12557a<T> implements C12043f<T>, C12013f {

    /* renamed from: U */
    final AtomicReference<C12348b<T>> f28539U = new AtomicReference<>();

    /* renamed from: c */
    final ObservableSource<T> f28540c;

    /* renamed from: io.reactivex.y.e.e.l0$a */
    /* compiled from: ObservablePublishAlt */
    static final class C12347a<T> extends AtomicReference<C12348b<T>> implements Disposable {

        /* renamed from: c */
        final C11968q<? super T> f28541c;

        public C12347a(C11968q<? super T> qVar, C12348b<T> bVar) {
            this.f28541c = qVar;
            lazySet(bVar);
        }

        public void dispose() {
            C12348b bVar = (C12348b) getAndSet(null);
            if (bVar != null) {
                bVar.mo30503b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* renamed from: io.reactivex.y.e.e.l0$b */
    /* compiled from: ObservablePublishAlt */
    static final class C12348b<T> extends AtomicReference<C12347a<T>[]> implements C11968q<T>, Disposable {

        /* renamed from: X */
        static final C12347a[] f28542X = new C12347a[0];

        /* renamed from: Y */
        static final C12347a[] f28543Y = new C12347a[0];

        /* renamed from: U */
        final AtomicReference<C12348b<T>> f28544U;

        /* renamed from: V */
        final AtomicReference<Disposable> f28545V;

        /* renamed from: W */
        Throwable f28546W;

        /* renamed from: c */
        final AtomicBoolean f28547c = new AtomicBoolean();

        public C12348b(AtomicReference<C12348b<T>> atomicReference) {
            this.f28544U = atomicReference;
            this.f28545V = new AtomicReference<>();
            lazySet(f28542X);
        }

        /* renamed from: a */
        public boolean mo30502a(C12347a<T> aVar) {
            C12347a[] aVarArr;
            C12347a[] aVarArr2;
            do {
                aVarArr = (C12347a[]) get();
                if (aVarArr == f28543Y) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new C12347a[(length + 1)];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        /* renamed from: b */
        public void mo30503b(C12347a<T> aVar) {
            C12347a<T>[] aVarArr;
            C12347a[] aVarArr2;
            do {
                aVarArr = (C12347a[]) get();
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
                        aVarArr2 = f28542X;
                        if (length != 1) {
                            aVarArr2 = new C12347a[(length - 1)];
                            System.arraycopy(aVarArr, 0, aVarArr2, 0, i);
                            System.arraycopy(aVarArr, i + 1, aVarArr2, i, (length - i) - 1);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        public void dispose() {
            getAndSet(f28543Y);
            this.f28544U.compareAndSet(this, null);
            C12010c.m38621a(this.f28545V);
        }

        public boolean isDisposed() {
            return get() == f28543Y;
        }

        public void onComplete() {
            this.f28545V.lazySet(C12010c.DISPOSED);
            for (C12347a aVar : (C12347a[]) getAndSet(f28543Y)) {
                aVar.f28541c.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f28546W = th;
            this.f28545V.lazySet(C12010c.DISPOSED);
            for (C12347a aVar : (C12347a[]) getAndSet(f28543Y)) {
                aVar.f28541c.onError(th);
            }
        }

        public void onNext(T t) {
            for (C12347a aVar : (C12347a[]) get()) {
                aVar.f28541c.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this.f28545V, disposable);
        }
    }

    public C12346l0(ObservableSource<T> observableSource) {
        this.f28540c = observableSource;
    }

    /* renamed from: a */
    public void mo30344a(Disposable disposable) {
        this.f28539U.compareAndSet((C12348b) disposable, null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27408b(p520io.reactivex.C11968q<? super T> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.l0$b<T>> r0 = r3.f28539U
            java.lang.Object r0 = r0.get()
            io.reactivex.y.e.e.l0$b r0 = (p520io.reactivex.p531y.p536e.p541e.C12346l0.C12348b) r0
            if (r0 != 0) goto L_0x001b
            io.reactivex.y.e.e.l0$b r1 = new io.reactivex.y.e.e.l0$b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.l0$b<T>> r2 = r3.f28539U
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.l0$b<T>> r2 = r3.f28539U
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            r0 = r1
        L_0x001b:
            io.reactivex.y.e.e.l0$a r1 = new io.reactivex.y.e.e.l0$a
            r1.<init>(r4, r0)
            r4.onSubscribe(r1)
            boolean r2 = r0.mo30502a(r1)
            if (r2 == 0) goto L_0x0033
            boolean r4 = r1.isDisposed()
            if (r4 == 0) goto L_0x0032
            r0.mo30503b(r1)
        L_0x0032:
            return
        L_0x0033:
            java.lang.Throwable r0 = r0.f28546W
            if (r0 == 0) goto L_0x003b
            r4.onError(r0)
            goto L_0x003e
        L_0x003b:
            r4.onComplete()
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p541e.C12346l0.mo27408b(io.reactivex.q):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30498g(p520io.reactivex.functions.Consumer<? super p520io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.l0$b<T>> r0 = r4.f28539U
            java.lang.Object r0 = r0.get()
            io.reactivex.y.e.e.l0$b r0 = (p520io.reactivex.p531y.p536e.p541e.C12346l0.C12348b) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0021
        L_0x0010:
            io.reactivex.y.e.e.l0$b r1 = new io.reactivex.y.e.e.l0$b
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.l0$b<T>> r2 = r4.f28539U
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.y.e.e.l0$b<T>> r2 = r4.f28539U
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            r0 = r1
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f28547c
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0034
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f28547c
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            r5.accept(r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003f
            io.reactivex.ObservableSource<T> r5 = r4.f28540c
            r5.mo30162a(r0)
        L_0x003f:
            return
        L_0x0040:
            r5 = move-exception
            p520io.reactivex.p530x.C12003b.m38614b(r5)
            java.lang.RuntimeException r5 = p520io.reactivex.p531y.p547j.C12548h.m39353b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p541e.C12346l0.mo30498g(io.reactivex.functions.Consumer):void");
    }
}
