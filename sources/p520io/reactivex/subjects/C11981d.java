package p520io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.subjects.d */
/* compiled from: SingleSubject */
public final class C11981d<T> extends Single<T> implements C11987u<T> {

    /* renamed from: X */
    static final C11982a[] f27698X = new C11982a[0];

    /* renamed from: Y */
    static final C11982a[] f27699Y = new C11982a[0];

    /* renamed from: U */
    final AtomicBoolean f27700U = new AtomicBoolean();

    /* renamed from: V */
    T f27701V;

    /* renamed from: W */
    Throwable f27702W;

    /* renamed from: c */
    final AtomicReference<C11982a<T>[]> f27703c = new AtomicReference<>(f27698X);

    /* renamed from: io.reactivex.subjects.d$a */
    /* compiled from: SingleSubject */
    static final class C11982a<T> extends AtomicReference<C11981d<T>> implements Disposable {

        /* renamed from: c */
        final C11987u<? super T> f27704c;

        C11982a(C11987u<? super T> uVar, C11981d<T> dVar) {
            this.f27704c = uVar;
            lazySet(dVar);
        }

        public void dispose() {
            C11981d dVar = (C11981d) getAndSet(null);
            if (dVar != null) {
                dVar.mo30319b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    C11981d() {
    }

    /* renamed from: k */
    public static <T> C11981d<T> m38579k() {
        return new C11981d<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30318a(C11982a<T> aVar) {
        C11982a[] aVarArr;
        C11982a[] aVarArr2;
        do {
            aVarArr = (C11982a[]) this.f27703c.get();
            if (aVarArr == f27699Y) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C11982a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f27703c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        C11982a aVar = new C11982a(uVar, this);
        uVar.onSubscribe(aVar);
        if (!mo30318a(aVar)) {
            Throwable th = this.f27702W;
            if (th != null) {
                uVar.onError(th);
            } else {
                uVar.onSuccess(this.f27701V);
            }
        } else if (aVar.isDisposed()) {
            mo30319b(aVar);
        }
    }

    public void onError(Throwable th) {
        C12036b.m38663a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f27700U.compareAndSet(false, true)) {
            this.f27702W = th;
            for (C11982a aVar : (C11982a[]) this.f27703c.getAndSet(f27699Y)) {
                aVar.f27704c.onError(th);
            }
            return;
        }
        C11915a.m38466b(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f27703c.get() == f27699Y) {
            disposable.dispose();
        }
    }

    public void onSuccess(T t) {
        C12036b.m38663a(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f27700U.compareAndSet(false, true)) {
            this.f27701V = t;
            for (C11982a aVar : (C11982a[]) this.f27703c.getAndSet(f27699Y)) {
                aVar.f27704c.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30319b(C11982a<T> aVar) {
        C11982a<T>[] aVarArr;
        C11982a[] aVarArr2;
        do {
            aVarArr = (C11982a[]) this.f27703c.get();
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
                        aVarArr2 = f27698X;
                    } else {
                        C11982a[] aVarArr3 = new C11982a[(length - 1)];
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
        } while (!this.f27703c.compareAndSet(aVarArr, aVarArr2));
    }
}
