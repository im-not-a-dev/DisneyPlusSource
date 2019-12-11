package p520io.reactivex.p531y.p546i;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import p520io.reactivex.p531y.p534c.C12048k;

/* renamed from: io.reactivex.y.i.e */
/* compiled from: ScalarSubscription */
public final class C12537e<T> extends AtomicInteger implements C12048k<T> {

    /* renamed from: U */
    final Subscriber<? super T> f29059U;

    /* renamed from: c */
    final T f29060c;

    public C12537e(Subscriber<? super T> subscriber, T t) {
        this.f29059U = subscriber;
        this.f29060c = t;
    }

    /* renamed from: a */
    public int mo30285a(int i) {
        return i & 1;
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        if (C12539g.m39330c(j) && compareAndSet(0, 1)) {
            Subscriber<? super T> subscriber = this.f29059U;
            subscriber.onNext(this.f29060c);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }

    public void cancel() {
        lazySet(2);
    }

    public void clear() {
        lazySet(1);
    }

    public boolean isEmpty() {
        return get() != 0;
    }

    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f29060c;
    }
}
