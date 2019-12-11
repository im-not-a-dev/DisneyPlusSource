package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.C14313b;
import org.reactivestreams.Subscriber;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p531y.p547j.C12547g;

/* renamed from: io.reactivex.y.e.b.c */
/* compiled from: FlowableConcatMapPublisher */
public final class C12124c<T, R> extends Flowable<R> {

    /* renamed from: U */
    final C14313b<T> f27921U;

    /* renamed from: V */
    final Function<? super T, ? extends C14313b<? extends R>> f27922V;

    /* renamed from: W */
    final int f27923W;

    /* renamed from: X */
    final C12547g f27924X;

    public C12124c(C14313b<T> bVar, Function<? super T, ? extends C14313b<? extends R>> function, int i, C12547g gVar) {
        this.f27921U = bVar;
        this.f27922V = function;
        this.f27923W = i;
        this.f27924X = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super R> subscriber) {
        if (!C12155h0.m38805a(this.f27921U, subscriber, this.f27922V)) {
            this.f27921U.subscribe(C12114b.m38724a(subscriber, this.f27922V, this.f27923W, this.f27924X));
        }
    }
}
