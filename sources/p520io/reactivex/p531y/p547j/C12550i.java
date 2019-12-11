package p520io.reactivex.p531y.p547j;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import p520io.reactivex.p523c0.C11915a;

/* renamed from: io.reactivex.y.j.i */
/* compiled from: HalfSerializer */
public final class C12550i {
    /* renamed from: a */
    public static <T> void m39354a(Subscriber<? super T> subscriber, T t, AtomicInteger atomicInteger, C12543c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo30668a();
                if (a != null) {
                    subscriber.onError(a);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m39355a(Subscriber<?> subscriber, Throwable th, AtomicInteger atomicInteger, C12543c cVar) {
        if (!cVar.mo30669a(th)) {
            C11915a.m38466b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            subscriber.onError(cVar.mo30668a());
        }
    }

    /* renamed from: a */
    public static void m39356a(Subscriber<?> subscriber, AtomicInteger atomicInteger, C12543c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo30668a();
            if (a != null) {
                subscriber.onError(a);
            } else {
                subscriber.onComplete();
            }
        }
    }
}
