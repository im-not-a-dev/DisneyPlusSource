package p520io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.subjects.PublishSubject */
public final class PublishSubject<T> extends C11983e<T> {

    /* renamed from: V */
    static final C11975a[] f27665V = new C11975a[0];

    /* renamed from: W */
    static final C11975a[] f27666W = new C11975a[0];

    /* renamed from: U */
    Throwable f27667U;

    /* renamed from: c */
    final AtomicReference<C11975a<T>[]> f27668c = new AtomicReference<>(f27666W);

    /* renamed from: io.reactivex.subjects.PublishSubject$a */
    static final class C11975a<T> extends AtomicBoolean implements Disposable {

        /* renamed from: U */
        final PublishSubject<T> f27669U;

        /* renamed from: c */
        final C11968q<? super T> f27670c;

        C11975a(C11968q<? super T> qVar, PublishSubject<T> publishSubject) {
            this.f27670c = qVar;
            this.f27669U = publishSubject;
        }

        /* renamed from: a */
        public void mo30305a(T t) {
            if (!get()) {
                this.f27670c.onNext(t);
            }
        }

        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f27669U.mo30301b(this);
            }
        }

        public boolean isDisposed() {
            return get();
        }

        /* renamed from: a */
        public void mo30306a(Throwable th) {
            if (get()) {
                C11915a.m38466b(th);
            } else {
                this.f27670c.onError(th);
            }
        }

        /* renamed from: a */
        public void mo30304a() {
            if (!get()) {
                this.f27670c.onComplete();
            }
        }
    }

    PublishSubject() {
    }

    /* renamed from: q */
    public static <T> PublishSubject<T> m38553q() {
        return new PublishSubject<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30300a(C11975a<T> aVar) {
        C11975a[] aVarArr;
        C11975a[] aVarArr2;
        do {
            aVarArr = (C11975a[]) this.f27668c.get();
            if (aVarArr == f27665V) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C11975a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f27668c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C11975a aVar = new C11975a(qVar, this);
        qVar.onSubscribe(aVar);
        if (!mo30300a(aVar)) {
            Throwable th = this.f27667U;
            if (th != null) {
                qVar.onError(th);
            } else {
                qVar.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo30301b(aVar);
        }
    }

    /* renamed from: o */
    public boolean mo30302o() {
        return this.f27668c.get() == f27665V && this.f27667U == null;
    }

    public void onComplete() {
        Object obj = this.f27668c.get();
        Object obj2 = f27665V;
        if (obj != obj2) {
            for (C11975a a : (C11975a[]) this.f27668c.getAndSet(obj2)) {
                a.mo30304a();
            }
        }
    }

    public void onError(Throwable th) {
        C12036b.m38663a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f27668c.get();
        Object obj2 = f27665V;
        if (obj == obj2) {
            C11915a.m38466b(th);
            return;
        }
        this.f27667U = th;
        for (C11975a a : (C11975a[]) this.f27668c.getAndSet(obj2)) {
            a.mo30306a(th);
        }
    }

    public void onNext(T t) {
        C12036b.m38663a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C11975a a : (C11975a[]) this.f27668c.get()) {
            a.mo30305a(t);
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f27668c.get() == f27665V) {
            disposable.dispose();
        }
    }

    /* renamed from: p */
    public boolean mo30303p() {
        return this.f27668c.get() == f27665V && this.f27667U != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30301b(C11975a<T> aVar) {
        C11975a<T>[] aVarArr;
        C11975a[] aVarArr2;
        do {
            aVarArr = (C11975a[]) this.f27668c.get();
            if (aVarArr != f27665V && aVarArr != f27666W) {
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
                        aVarArr2 = f27666W;
                    } else {
                        C11975a[] aVarArr3 = new C11975a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f27668c.compareAndSet(aVarArr, aVarArr2));
    }
}
