package p520io.reactivex.p531y.p536e.p538b;

import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12044g;

/* renamed from: io.reactivex.y.e.b.a */
/* compiled from: AbstractFlowableWithUpstream */
abstract class C12111a<T, R> extends Flowable<R> implements C12044g<T> {

    /* renamed from: U */
    protected final Flowable<T> f27888U;

    C12111a(Flowable<T> flowable) {
        C12036b.m38663a(flowable, "source is null");
        this.f27888U = flowable;
    }
}
