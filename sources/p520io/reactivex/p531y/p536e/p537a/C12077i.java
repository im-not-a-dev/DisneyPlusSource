package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.a.i */
/* compiled from: CompletableFromAction */
public final class C12077i extends Completable {

    /* renamed from: c */
    final C11945a f27807c;

    public C12077i(C11945a aVar) {
        this.f27807c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        Disposable b = C11929b.m38493b();
        completableObserver.onSubscribe(b);
        try {
            this.f27807c.run();
            if (!b.isDisposed()) {
                completableObserver.onComplete();
            }
        } catch (Throwable th) {
            C12003b.m38614b(th);
            if (!b.isDisposed()) {
                completableObserver.onError(th);
            } else {
                C11915a.m38466b(th);
            }
        }
    }
}
