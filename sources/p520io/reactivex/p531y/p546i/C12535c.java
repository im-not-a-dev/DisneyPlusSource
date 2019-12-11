package p520io.reactivex.p531y.p546i;

import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.y.i.c */
/* compiled from: DeferredScalarSubscription */
public class C12535c<T> extends C12533a<T> {

    /* renamed from: U */
    protected T f29055U;

    /* renamed from: c */
    protected final Subscriber<? super T> f29056c;

    public C12535c(Subscriber<? super T> subscriber) {
        this.f29056c = subscriber;
    }

    /* renamed from: a */
    public final int mo30285a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: b */
    public final void mo29946b(long j) {
        if (C12539g.m39330c(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            T t = this.f29055U;
                            if (t != null) {
                                this.f29055U = null;
                                Subscriber<? super T> subscriber = this.f29056c;
                                subscriber.onNext(t);
                                if (get() != 4) {
                                    subscriber.onComplete();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public void cancel() {
        set(4);
        this.f29055U = null;
    }

    public final void clear() {
        lazySet(32);
        this.f29055U = null;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f29055U;
        this.f29055U = null;
        return t;
    }

    /* renamed from: b */
    public final void mo30654b(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    Subscriber<? super T> subscriber = this.f29056c;
                    subscriber.onNext(t);
                    if (get() != 4) {
                        subscriber.onComplete();
                    }
                    return;
                }
                this.f29055U = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f29055U = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f29055U = t;
        lazySet(16);
        Subscriber<? super T> subscriber2 = this.f29056c;
        subscriber2.onNext(t);
        if (get() != 4) {
            subscriber2.onComplete();
        }
    }
}
