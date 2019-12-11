package p520io.reactivex.p531y.p546i;

import org.reactivestreams.Subscriber;
import p520io.reactivex.p531y.p534c.C12048k;

/* renamed from: io.reactivex.y.i.d */
/* compiled from: EmptySubscription */
public enum C12536d implements C12048k<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m39310a(Throwable th, Subscriber<?> subscriber) {
        subscriber.mo29945a(INSTANCE);
        subscriber.onError(th);
    }

    /* renamed from: a */
    public int mo30285a(int i) {
        return i & 2;
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        C12539g.m39330c(j);
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public String toString() {
        return "EmptySubscription";
    }

    /* renamed from: a */
    public static void m39311a(Subscriber<?> subscriber) {
        subscriber.mo29945a(INSTANCE);
        subscriber.onComplete();
    }
}
