package com.jakewharton.rxrelay2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;

/* renamed from: com.jakewharton.rxrelay2.b */
/* compiled from: PublishRelay */
public final class C10531b<T> extends C10533c<T> {

    /* renamed from: U */
    static final C10532a[] f24956U = new C10532a[0];

    /* renamed from: c */
    final AtomicReference<C10532a<T>[]> f24957c = new AtomicReference<>(f24956U);

    /* renamed from: com.jakewharton.rxrelay2.b$a */
    /* compiled from: PublishRelay */
    static final class C10532a<T> extends AtomicBoolean implements Disposable {

        /* renamed from: U */
        final C10531b<T> f24958U;

        /* renamed from: c */
        final C11968q<? super T> f24959c;

        C10532a(C11968q<? super T> qVar, C10531b<T> bVar) {
            this.f24959c = qVar;
            this.f24958U = bVar;
        }

        /* renamed from: a */
        public void mo27418a(T t) {
            if (!get()) {
                this.f24959c.onNext(t);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f24958U.mo27417b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }
    }

    C10531b() {
    }

    /* renamed from: n */
    public static <T> C10531b<T> m33228n() {
        return new C10531b<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27416a(C10532a<T> aVar) {
        C10532a[] aVarArr;
        C10532a[] aVarArr2;
        do {
            aVarArr = (C10532a[]) this.f24957c.get();
            int length = aVarArr.length;
            aVarArr2 = new C10532a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f24957c.compareAndSet(aVarArr, aVarArr2));
    }

    public void accept(T t) {
        if (t != null) {
            for (C10532a a : (C10532a[]) this.f24957c.get()) {
                a.mo27418a(t);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C10532a aVar = new C10532a(qVar, this);
        qVar.onSubscribe(aVar);
        mo27416a(aVar);
        if (aVar.isDisposed()) {
            mo27417b(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo27417b(C10532a<T> aVar) {
        C10532a<T>[] aVarArr;
        C10532a[] aVarArr2;
        do {
            aVarArr = (C10532a[]) this.f24957c.get();
            if (aVarArr != f24956U) {
                int length = aVarArr.length;
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
                        aVarArr2 = f24956U;
                    } else {
                        C10532a[] aVarArr3 = new C10532a[(length - 1)];
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
        } while (!this.f24957c.compareAndSet(aVarArr, aVarArr2));
    }
}
