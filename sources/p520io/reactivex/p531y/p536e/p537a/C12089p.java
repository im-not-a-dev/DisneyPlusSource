package p520io.reactivex.p531y.p536e.p537a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p547j.C12543c;

/* renamed from: io.reactivex.y.e.a.p */
/* compiled from: CompletableMergeDelayErrorIterable */
public final class C12089p extends Completable {

    /* renamed from: c */
    final Iterable<? extends CompletableSource> f27831c;

    public C12089p(Iterable<? extends CompletableSource> iterable) {
        this.f27831c = iterable;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            Iterator it = this.f27831c.iterator();
            C12036b.m38663a(it, "The source iterator returned is null");
            Iterator it2 = it;
            AtomicInteger atomicInteger = new AtomicInteger(1);
            C12543c cVar = new C12543c();
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it2.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            Throwable a = cVar.mo30668a();
                            if (a == null) {
                                completableObserver.onComplete();
                            } else {
                                completableObserver.onError(a);
                            }
                        }
                        return;
                    } else if (!compositeDisposable.isDisposed()) {
                        try {
                            Object next = it2.next();
                            C12036b.m38663a(next, "The iterator returned a null CompletableSource");
                            CompletableSource completableSource = (CompletableSource) next;
                            if (!compositeDisposable.isDisposed()) {
                                atomicInteger.getAndIncrement();
                                completableSource.subscribe(new C12088a(completableObserver, compositeDisposable, cVar, atomicInteger));
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            C12003b.m38614b(th);
                            cVar.mo30669a(th);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12003b.m38614b(th2);
                    cVar.mo30669a(th2);
                }
            }
        } catch (Throwable th3) {
            C12003b.m38614b(th3);
            completableObserver.onError(th3);
        }
    }
}
