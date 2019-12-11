package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.Callable;
import org.reactivestreams.C14313b;
import org.reactivestreams.Subscriber;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p546i.C12536d;
import p520io.reactivex.p531y.p546i.C12537e;

/* renamed from: io.reactivex.y.e.b.h0 */
/* compiled from: FlowableScalarXMap */
public final class C12155h0 {

    /* renamed from: io.reactivex.y.e.b.h0$a */
    /* compiled from: FlowableScalarXMap */
    static final class C12156a<T, R> extends Flowable<R> {

        /* renamed from: U */
        final T f28005U;

        /* renamed from: V */
        final Function<? super T, ? extends C14313b<? extends R>> f28006V;

        C12156a(T t, Function<? super T, ? extends C14313b<? extends R>> function) {
            this.f28005U = t;
            this.f28006V = function;
        }

        /* renamed from: a */
        public void mo29935a(Subscriber<? super R> subscriber) {
            try {
                Object apply = this.f28006V.apply(this.f28005U);
                C12036b.m38663a(apply, "The mapper returned a null Publisher");
                C14313b bVar = (C14313b) apply;
                if (bVar instanceof Callable) {
                    try {
                        Object call = ((Callable) bVar).call();
                        if (call == null) {
                            C12536d.m39311a(subscriber);
                            return;
                        }
                        subscriber.mo29945a(new C12537e(subscriber, call));
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        C12536d.m39310a(th, subscriber);
                    }
                } else {
                    bVar.subscribe(subscriber);
                }
            } catch (Throwable th2) {
                C12536d.m39310a(th2, subscriber);
            }
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m38805a(C14313b<T> bVar, Subscriber<? super R> subscriber, Function<? super T, ? extends C14313b<? extends R>> function) {
        if (!(bVar instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) bVar).call();
            if (call == null) {
                C12536d.m39311a(subscriber);
                return true;
            }
            try {
                Object apply = function.apply(call);
                C12036b.m38663a(apply, "The mapper returned a null Publisher");
                C14313b bVar2 = (C14313b) apply;
                if (bVar2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) bVar2).call();
                        if (call2 == null) {
                            C12536d.m39311a(subscriber);
                            return true;
                        }
                        subscriber.mo29945a(new C12537e(subscriber, call2));
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        C12536d.m39310a(th, subscriber);
                        return true;
                    }
                } else {
                    bVar2.subscribe(subscriber);
                }
                return true;
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                C12536d.m39310a(th2, subscriber);
                return true;
            }
        } catch (Throwable th3) {
            C12003b.m38614b(th3);
            C12536d.m39310a(th3, subscriber);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> Flowable<U> m38804a(T t, Function<? super T, ? extends C14313b<? extends U>> function) {
        return C11915a.m38446a((Flowable<T>) new C12156a<T>(t, function));
    }
}
