package p163g.p503n.p504a;

import p520io.reactivex.C11987u;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;

/* renamed from: g.n.a.n */
/* compiled from: AutoDisposeSingle */
final class C11826n<T> extends Single<T> {

    /* renamed from: U */
    private final CompletableSource f27461U;

    /* renamed from: c */
    private final SingleSource<T> f27462c;

    C11826n(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.f27462c = singleSource;
        this.f27461U = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f27462c.mo30216a(new C11834s(this.f27461U, uVar));
    }
}
