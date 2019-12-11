package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.C14313b;
import org.reactivestreams.Subscriber;
import p520io.reactivex.Flowable;

/* renamed from: io.reactivex.y.e.b.t */
/* compiled from: FlowableFromPublisher */
public final class C12207t<T> extends Flowable<T> {

    /* renamed from: U */
    final C14313b<? extends T> f28189U;

    public C12207t(C14313b<? extends T> bVar) {
        this.f28189U = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f28189U.subscribe(subscriber);
    }
}
