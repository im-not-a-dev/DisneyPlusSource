package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.Subscriber;
import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p534c.C12049l;
import p520io.reactivex.p531y.p546i.C12537e;

/* renamed from: io.reactivex.y.e.b.v */
/* compiled from: FlowableJust */
public final class C12209v<T> extends Flowable<T> implements C12049l<T> {

    /* renamed from: U */
    private final T f28192U;

    public C12209v(T t) {
        this.f28192U = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        subscriber.mo29945a(new C12537e(subscriber, this.f28192U));
    }

    public T call() {
        return this.f28192U;
    }
}
