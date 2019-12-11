package p163g.p503n.p504a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;

/* renamed from: g.n.a.g */
/* compiled from: AutoDisposeCompletable */
final class C11814g extends Completable {

    /* renamed from: U */
    private final CompletableSource f27451U;

    /* renamed from: c */
    private final Completable f27452c;

    C11814g(Completable completable, CompletableSource completableSource) {
        this.f27452c = completable;
        this.f27451U = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27452c.subscribe(new C11828p(this.f27451U, completableObserver));
    }
}
