package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.Callable;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.a.j */
/* compiled from: CompletableFromCallable */
public final class C12078j extends Completable {

    /* renamed from: c */
    final Callable<?> f27808c;

    public C12078j(Callable<?> callable) {
        this.f27808c = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        Disposable b = C11929b.m38493b();
        completableObserver.onSubscribe(b);
        try {
            this.f27808c.call();
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
