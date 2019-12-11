package p520io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.subjects.b */
/* compiled from: CompletableSubject */
public final class C11978b extends Completable implements CompletableObserver {

    /* renamed from: W */
    static final C11979a[] f27688W = new C11979a[0];

    /* renamed from: X */
    static final C11979a[] f27689X = new C11979a[0];

    /* renamed from: U */
    final AtomicBoolean f27690U = new AtomicBoolean();

    /* renamed from: V */
    Throwable f27691V;

    /* renamed from: c */
    final AtomicReference<C11979a[]> f27692c = new AtomicReference<>(f27688W);

    /* renamed from: io.reactivex.subjects.b$a */
    /* compiled from: CompletableSubject */
    static final class C11979a extends AtomicReference<C11978b> implements Disposable {

        /* renamed from: c */
        final CompletableObserver f27693c;

        C11979a(CompletableObserver completableObserver, C11978b bVar) {
            this.f27693c = completableObserver;
            lazySet(bVar);
        }

        public void dispose() {
            C11978b bVar = (C11978b) getAndSet(null);
            if (bVar != null) {
                bVar.mo30316b(this);
            }
        }

        public boolean isDisposed() {
            return get() == null;
        }
    }

    C11978b() {
    }

    /* renamed from: j */
    public static C11978b m38573j() {
        return new C11978b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C11979a aVar = new C11979a(completableObserver, this);
        completableObserver.onSubscribe(aVar);
        if (!mo30315a(aVar)) {
            Throwable th = this.f27691V;
            if (th != null) {
                completableObserver.onError(th);
            } else {
                completableObserver.onComplete();
            }
        } else if (aVar.isDisposed()) {
            mo30316b(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30316b(C11979a aVar) {
        C11979a[] aVarArr;
        C11979a[] aVarArr2;
        do {
            aVarArr = (C11979a[]) this.f27692c.get();
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
                        aVarArr2 = f27688W;
                    } else {
                        C11979a[] aVarArr3 = new C11979a[(length - 1)];
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
        } while (!this.f27692c.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        if (this.f27690U.compareAndSet(false, true)) {
            for (C11979a aVar : (C11979a[]) this.f27692c.getAndSet(f27689X)) {
                aVar.f27693c.onComplete();
            }
        }
    }

    public void onError(Throwable th) {
        C12036b.m38663a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f27690U.compareAndSet(false, true)) {
            this.f27691V = th;
            for (C11979a aVar : (C11979a[]) this.f27692c.getAndSet(f27689X)) {
                aVar.f27693c.onError(th);
            }
            return;
        }
        C11915a.m38466b(th);
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f27692c.get() == f27689X) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30315a(C11979a aVar) {
        C11979a[] aVarArr;
        C11979a[] aVarArr2;
        do {
            aVarArr = (C11979a[]) this.f27692c.get();
            if (aVarArr == f27689X) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C11979a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f27692c.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
