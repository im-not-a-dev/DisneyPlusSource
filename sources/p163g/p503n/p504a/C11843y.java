package p163g.p503n.p504a;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11968q;
import p520io.reactivex.p523c0.C11915a;

/* renamed from: g.n.a.y */
/* compiled from: HalfSerializer */
final class C11843y {
    /* renamed from: a */
    public static <T> boolean m37992a(Subscriber<? super T> subscriber, T t, AtomicInteger atomicInteger, C11789c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo29918a();
                if (a != null) {
                    subscriber.onError(a);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m37989a(Subscriber<?> subscriber, Throwable th, AtomicInteger atomicInteger, C11789c cVar) {
        if (!cVar.mo29919a(th)) {
            C11915a.m38466b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            subscriber.onError(cVar.mo29918a());
        }
    }

    /* renamed from: a */
    public static void m37990a(Subscriber<?> subscriber, AtomicInteger atomicInteger, C11789c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo29918a();
            if (a != null) {
                subscriber.onError(a);
            } else {
                subscriber.onComplete();
            }
        }
    }

    /* renamed from: a */
    public static <T> boolean m37991a(C11968q<? super T> qVar, T t, AtomicInteger atomicInteger, C11789c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            qVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable a = cVar.mo29918a();
                if (a != null) {
                    qVar.onError(a);
                } else {
                    qVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m37987a(C11968q<?> qVar, Throwable th, AtomicInteger atomicInteger, C11789c cVar) {
        if (!cVar.mo29919a(th)) {
            C11915a.m38466b(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            qVar.onError(cVar.mo29918a());
        }
    }

    /* renamed from: a */
    public static void m37988a(C11968q<?> qVar, AtomicInteger atomicInteger, C11789c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable a = cVar.mo29918a();
            if (a != null) {
                qVar.onError(a);
            } else {
                qVar.onComplete();
            }
        }
    }
}
