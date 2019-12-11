package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.a.o */
/* compiled from: CompletableMergeDelayErrorArray */
public final class C12087o extends Completable {

    /* renamed from: c */
    final CompletableSource[] f27826c;

    /* renamed from: io.reactivex.y.e.a.o$a */
    /* compiled from: CompletableMergeDelayErrorArray */
    static final class C12088a implements CompletableObserver {

        /* renamed from: U */
        final CompositeDisposable f27827U;

        /* renamed from: V */
        final C12543c f27828V;

        /* renamed from: W */
        final AtomicInteger f27829W;

        /* renamed from: c */
        final CompletableObserver f27830c;

        C12088a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, C12543c cVar, AtomicInteger atomicInteger) {
            this.f27830c = completableObserver;
            this.f27827U = compositeDisposable;
            this.f27828V = cVar;
            this.f27829W = atomicInteger;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30385a() {
            if (this.f27829W.decrementAndGet() == 0) {
                Throwable a = this.f27828V.mo30668a();
                if (a == null) {
                    this.f27830c.onComplete();
                } else {
                    this.f27830c.onError(a);
                }
            }
        }

        public void onComplete() {
            mo30385a();
        }

        public void onError(Throwable th) {
            if (this.f27828V.mo30669a(th)) {
                mo30385a();
            } else {
                C11915a.m38466b(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f27827U.mo30250b(disposable);
        }
    }

    public C12087o(CompletableSource[] completableSourceArr) {
        this.f27826c = completableSourceArr;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicInteger atomicInteger = new AtomicInteger(this.f27826c.length + 1);
        C12543c cVar = new C12543c();
        completableObserver.onSubscribe(compositeDisposable);
        CompletableSource[] completableSourceArr = this.f27826c;
        int length = completableSourceArr.length;
        int i = 0;
        while (i < length) {
            CompletableSource completableSource = completableSourceArr[i];
            if (!compositeDisposable.isDisposed()) {
                if (completableSource == null) {
                    cVar.mo30669a(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    completableSource.subscribe(new C12088a(completableObserver, compositeDisposable, cVar, atomicInteger));
                }
                i++;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable a = cVar.mo30668a();
            if (a == null) {
                completableObserver.onComplete();
            } else {
                completableObserver.onError(a);
            }
        }
    }
}
