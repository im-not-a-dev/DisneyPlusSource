package p520io.reactivex.p531y.p536e.p537a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.a.q */
/* compiled from: CompletableMergeIterable */
public final class C12090q extends Completable {

    /* renamed from: c */
    final Iterable<? extends CompletableSource> f27832c;

    /* renamed from: io.reactivex.y.e.a.q$a */
    /* compiled from: CompletableMergeIterable */
    static final class C12091a extends AtomicBoolean implements CompletableObserver {

        /* renamed from: U */
        final CompletableObserver f27833U;

        /* renamed from: V */
        final AtomicInteger f27834V;

        /* renamed from: c */
        final CompositeDisposable f27835c;

        C12091a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicInteger atomicInteger) {
            this.f27833U = completableObserver;
            this.f27835c = compositeDisposable;
            this.f27834V = atomicInteger;
        }

        public void onComplete() {
            if (this.f27834V.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f27833U.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f27835c.dispose();
            if (compareAndSet(false, true)) {
                this.f27833U.onError(th);
            } else {
                C11915a.m38466b(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f27835c.mo30250b(disposable);
        }
    }

    public C12090q(Iterable<? extends CompletableSource> iterable) {
        this.f27832c = iterable;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            Iterator it = this.f27832c.iterator();
            C12036b.m38663a(it, "The source iterator returned is null");
            Iterator it2 = it;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            C12091a aVar = new C12091a(completableObserver, compositeDisposable, atomicInteger);
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it2.hasNext()) {
                        aVar.onComplete();
                        return;
                    } else if (!compositeDisposable.isDisposed()) {
                        try {
                            Object next = it2.next();
                            C12036b.m38663a(next, "The iterator returned a null CompletableSource");
                            CompletableSource completableSource = (CompletableSource) next;
                            if (!compositeDisposable.isDisposed()) {
                                atomicInteger.getAndIncrement();
                                completableSource.subscribe(aVar);
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            C12003b.m38614b(th);
                            compositeDisposable.dispose();
                            aVar.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12003b.m38614b(th2);
                    compositeDisposable.dispose();
                    aVar.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            C12003b.m38614b(th3);
            completableObserver.onError(th3);
        }
    }
}
