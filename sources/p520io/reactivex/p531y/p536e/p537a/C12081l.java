package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;

/* renamed from: io.reactivex.y.e.a.l */
/* compiled from: CompletableFromUnsafeSource */
public final class C12081l extends Completable {

    /* renamed from: c */
    final CompletableSource f27811c;

    public C12081l(CompletableSource completableSource) {
        this.f27811c = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27811c.subscribe(completableObserver);
    }
}
