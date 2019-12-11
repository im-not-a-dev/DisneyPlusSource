package p163g.p503n.p504a;

import org.reactivestreams.C14313b;
import org.reactivestreams.Subscriber;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;

/* renamed from: g.n.a.j */
/* compiled from: AutoDisposeFlowable */
final class C11822j<T> extends Flowable<T> {

    /* renamed from: U */
    private final C14313b<T> f27453U;

    /* renamed from: V */
    private final CompletableSource f27454V;

    C11822j(C14313b<T> bVar, CompletableSource completableSource) {
        this.f27453U = bVar;
        this.f27454V = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27453U.subscribe(new C11836t(this.f27454V, subscriber));
    }
}
