package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12046i;

/* renamed from: io.reactivex.y.e.e.p0 */
/* compiled from: ObservableScalarXMap */
public final class C12372p0 {

    /* renamed from: io.reactivex.y.e.e.p0$a */
    /* compiled from: ObservableScalarXMap */
    public static final class C12373a<T> extends AtomicInteger implements C12046i<T>, Runnable {

        /* renamed from: U */
        final T f28613U;

        /* renamed from: c */
        final C11968q<? super T> f28614c;

        public C12373a(C11968q<? super T> qVar, T t) {
            this.f28614c = qVar;
            this.f28613U = t;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        public boolean isDisposed() {
            return get() == 3;
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f28613U;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f28614c.onNext(this.f28613U);
                if (get() == 2) {
                    lazySet(3);
                    this.f28614c.onComplete();
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.e.e.p0$b */
    /* compiled from: ObservableScalarXMap */
    static final class C12374b<T, R> extends Observable<R> {

        /* renamed from: U */
        final Function<? super T, ? extends ObservableSource<? extends R>> f28615U;

        /* renamed from: c */
        final T f28616c;

        C12374b(T t, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f28616c = t;
            this.f28615U = function;
        }

        /* renamed from: b */
        public void mo27408b(C11968q<? super R> qVar) {
            try {
                Object apply = this.f28615U.apply(this.f28616c);
                C12036b.m38663a(apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) apply;
                if (observableSource instanceof Callable) {
                    try {
                        Object call = ((Callable) observableSource).call();
                        if (call == null) {
                            C12011d.m38628a(qVar);
                            return;
                        }
                        C12373a aVar = new C12373a(qVar, call);
                        qVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        C12011d.m38631a(th, qVar);
                    }
                } else {
                    observableSource.mo30162a(qVar);
                }
            } catch (Throwable th2) {
                C12011d.m38631a(th2, qVar);
            }
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m39091a(ObservableSource<T> observableSource, C11968q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) observableSource).call();
            if (call == null) {
                C12011d.m38628a(qVar);
                return true;
            }
            try {
                Object apply = function.apply(call);
                C12036b.m38663a(apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) apply;
                if (observableSource2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) observableSource2).call();
                        if (call2 == null) {
                            C12011d.m38628a(qVar);
                            return true;
                        }
                        C12373a aVar = new C12373a(qVar, call2);
                        qVar.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        C12011d.m38631a(th, qVar);
                        return true;
                    }
                } else {
                    observableSource2.mo30162a(qVar);
                }
                return true;
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                C12011d.m38631a(th2, qVar);
                return true;
            }
        } catch (Throwable th3) {
            C12003b.m38614b(th3);
            C12011d.m38631a(th3, qVar);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> Observable<U> m39090a(T t, Function<? super T, ? extends ObservableSource<? extends U>> function) {
        return C11915a.m38448a((Observable<T>) new C12374b<T>(t, function));
    }
}
