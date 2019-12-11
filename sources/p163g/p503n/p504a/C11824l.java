package p163g.p503n.p504a;

import p520io.reactivex.C11968q;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;

/* renamed from: g.n.a.l */
/* compiled from: AutoDisposeObservable */
final class C11824l<T> extends Observable<T> {

    /* renamed from: U */
    private final CompletableSource f27457U;

    /* renamed from: c */
    private final ObservableSource<T> f27458c;

    C11824l(ObservableSource<T> observableSource, CompletableSource completableSource) {
        this.f27458c = observableSource;
        this.f27457U = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f27458c.mo30162a(new C11832r(this.f27457U, qVar));
    }
}
