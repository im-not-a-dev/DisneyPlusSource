package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;

/* renamed from: io.reactivex.y.e.a.n */
/* compiled from: CompletableMergeArray */
public final class C12085n extends Completable {

    /* renamed from: c */
    final CompletableSource[] f27822c;

    /* renamed from: io.reactivex.y.e.a.n$a */
    /* compiled from: CompletableMergeArray */
    static final class C12086a extends AtomicInteger implements CompletableObserver {

        /* renamed from: U */
        final AtomicBoolean f27823U;

        /* renamed from: V */
        final CompositeDisposable f27824V;

        /* renamed from: c */
        final CompletableObserver f27825c;

        C12086a(CompletableObserver completableObserver, AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, int i) {
            this.f27825c = completableObserver;
            this.f27823U = atomicBoolean;
            this.f27824V = compositeDisposable;
            lazySet(i);
        }

        public void onComplete() {
            if (decrementAndGet() == 0 && this.f27823U.compareAndSet(false, true)) {
                this.f27825c.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f27824V.dispose();
            if (this.f27823U.compareAndSet(false, true)) {
                this.f27825c.onError(th);
            } else {
                C11915a.m38466b(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f27824V.mo30250b(disposable);
        }
    }

    public C12085n(CompletableSource[] completableSourceArr) {
        this.f27822c = completableSourceArr;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        C12086a aVar = new C12086a(completableObserver, new AtomicBoolean(), compositeDisposable, this.f27822c.length + 1);
        completableObserver.onSubscribe(compositeDisposable);
        CompletableSource[] completableSourceArr = this.f27822c;
        int length = completableSourceArr.length;
        int i = 0;
        while (i < length) {
            CompletableSource completableSource = completableSourceArr[i];
            if (!compositeDisposable.isDisposed()) {
                if (completableSource == null) {
                    compositeDisposable.dispose();
                    aVar.onError(new NullPointerException("A completable source is null"));
                    return;
                }
                completableSource.subscribe(aVar);
                i++;
            } else {
                return;
            }
        }
        aVar.onComplete();
    }
}
