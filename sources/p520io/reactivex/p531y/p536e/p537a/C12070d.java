package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.Callable;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.a.d */
/* compiled from: CompletableDefer */
public final class C12070d extends Completable {

    /* renamed from: c */
    final Callable<? extends CompletableSource> f27795c;

    public C12070d(Callable<? extends CompletableSource> callable) {
        this.f27795c = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        try {
            Object call = this.f27795c.call();
            C12036b.m38663a(call, "The completableSupplier returned a null CompletableSource");
            ((CompletableSource) call).subscribe(completableObserver);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38629a(th, completableObserver);
        }
    }
}
