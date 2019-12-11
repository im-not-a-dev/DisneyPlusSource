package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12052a;

/* renamed from: io.reactivex.y.e.e.g0 */
/* compiled from: ObservableMap */
public final class C12325g0<T, U> extends C12294a<T, U> {

    /* renamed from: U */
    final Function<? super T, ? extends U> f28473U;

    /* renamed from: io.reactivex.y.e.e.g0$a */
    /* compiled from: ObservableMap */
    static final class C12326a<T, U> extends C12052a<T, U> {

        /* renamed from: Y */
        final Function<? super T, ? extends U> f28474Y;

        C12326a(C11968q<? super U> qVar, Function<? super T, ? extends U> function) {
            super(qVar);
            this.f28474Y = function;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30368b(i);
        }

        public void onNext(T t) {
            if (!this.f27760W) {
                if (this.f27761X != 0) {
                    this.f27762c.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f28474Y.apply(t);
                    C12036b.m38663a(apply, "The mapper function returned a null value.");
                    this.f27762c.onNext(apply);
                } catch (Throwable th) {
                    mo30367a(th);
                }
            }
        }

        public U poll() throws Exception {
            Object poll = this.f27759V.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f28474Y.apply(poll);
            C12036b.m38663a(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public C12325g0(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.f28473U = function;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super U> qVar) {
        this.f28379c.mo30162a(new C12326a(qVar, this.f28473U));
    }
}
