package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.y.e.f.b */
/* compiled from: SingleCache */
public final class C12423b<T> extends Single<T> implements C11987u<T> {

    /* renamed from: Y */
    static final C12424a[] f28774Y = new C12424a[0];

    /* renamed from: Z */
    static final C12424a[] f28775Z = new C12424a[0];

    /* renamed from: U */
    final AtomicInteger f28776U = new AtomicInteger();

    /* renamed from: V */
    final AtomicReference<C12424a<T>[]> f28777V = new AtomicReference<>(f28774Y);

    /* renamed from: W */
    T f28778W;

    /* renamed from: X */
    Throwable f28779X;

    /* renamed from: c */
    final SingleSource<? extends T> f28780c;

    /* renamed from: io.reactivex.y.e.f.b$a */
    /* compiled from: SingleCache */
    static final class C12424a<T> extends AtomicBoolean implements Disposable {

        /* renamed from: U */
        final C12423b<T> f28781U;

        /* renamed from: c */
        final C11987u<? super T> f28782c;

        C12424a(C11987u<? super T> uVar, C12423b<T> bVar) {
            this.f28782c = uVar;
            this.f28781U = bVar;
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f28781U.mo30570b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    public C12423b(SingleSource<? extends T> singleSource) {
        this.f28780c = singleSource;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30569a(C12424a<T> aVar) {
        C12424a[] aVarArr;
        C12424a[] aVarArr2;
        do {
            aVarArr = (C12424a[]) this.f28777V.get();
            if (aVarArr == f28775Z) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12424a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f28777V.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        C12424a aVar = new C12424a(uVar, this);
        uVar.onSubscribe(aVar);
        if (mo30569a(aVar)) {
            if (aVar.isDisposed()) {
                mo30570b(aVar);
            }
            if (this.f28776U.getAndIncrement() == 0) {
                this.f28780c.mo30216a(this);
            }
            return;
        }
        Throwable th = this.f28779X;
        if (th != null) {
            uVar.onError(th);
        } else {
            uVar.onSuccess(this.f28778W);
        }
    }

    public void onError(Throwable th) {
        C12424a[] aVarArr;
        this.f28779X = th;
        for (C12424a aVar : (C12424a[]) this.f28777V.getAndSet(f28775Z)) {
            if (!aVar.isDisposed()) {
                aVar.f28782c.onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
    }

    public void onSuccess(T t) {
        C12424a[] aVarArr;
        this.f28778W = t;
        for (C12424a aVar : (C12424a[]) this.f28777V.getAndSet(f28775Z)) {
            if (!aVar.isDisposed()) {
                aVar.f28782c.onSuccess(t);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30570b(C12424a<T> aVar) {
        C12424a<T>[] aVarArr;
        C12424a[] aVarArr2;
        do {
            aVarArr = (C12424a[]) this.f28777V.get();
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
                        aVarArr2 = f28774Y;
                    } else {
                        C12424a[] aVarArr3 = new C12424a[(length - 1)];
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
        } while (!this.f28777V.compareAndSet(aVarArr, aVarArr2));
    }
}
