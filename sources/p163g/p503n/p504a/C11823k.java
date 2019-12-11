package p163g.p503n.p504a;

import p520io.reactivex.C11958l;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;

/* renamed from: g.n.a.k */
/* compiled from: AutoDisposeMaybe */
final class C11823k<T> extends Maybe<T> {

    /* renamed from: U */
    private final CompletableSource f27455U;

    /* renamed from: c */
    private final MaybeSource<T> f27456c;

    C11823k(MaybeSource<T> maybeSource, CompletableSource completableSource) {
        this.f27456c = maybeSource;
        this.f27455U = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f27456c.mo30113a(new C11830q(this.f27455U, lVar));
    }
}
