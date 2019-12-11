package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p526f0.C11944a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p546i.C12536d;
import p520io.reactivex.processors.C11964a;
import p520io.reactivex.processors.C11966c;

/* renamed from: io.reactivex.y.e.b.g0 */
/* compiled from: FlowableRetryWhen */
public final class C12151g0<T> extends C12111a<T, T> {

    /* renamed from: V */
    final Function<? super Flowable<Throwable>, ? extends C14313b<?>> f27996V;

    /* renamed from: io.reactivex.y.e.b.g0$a */
    /* compiled from: FlowableRetryWhen */
    static final class C12152a<T> extends C12147f0<T, Throwable> {
        C12152a(Subscriber<? super T> subscriber, C11964a<Throwable> aVar, C14314c cVar) {
            super(subscriber, aVar, cVar);
        }

        public void onComplete() {
            this.f27982d0.cancel();
            this.f27980b0.onComplete();
        }

        public void onError(Throwable th) {
            mo30415b(th);
        }
    }

    public C12151g0(Flowable<T> flowable, Function<? super Flowable<Throwable>, ? extends C14313b<?>> function) {
        super(flowable);
        this.f27996V = function;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        C11944a aVar = new C11944a(subscriber);
        C11964a j = C11966c.m38535a(8).mo30278j();
        try {
            Object apply = this.f27996V.apply(j);
            C12036b.m38663a(apply, "handler returned a null Publisher");
            C14313b bVar = (C14313b) apply;
            C12143e0 e0Var = new C12143e0(this.f27888U);
            C12152a aVar2 = new C12152a(aVar, j, e0Var);
            e0Var.f27968W = aVar2;
            subscriber.mo29945a(aVar2);
            bVar.subscribe(e0Var);
            e0Var.onNext(Integer.valueOf(0));
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12536d.m39310a(th, subscriber);
        }
    }
}
