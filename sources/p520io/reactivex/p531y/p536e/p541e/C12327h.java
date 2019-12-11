package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.C11948d;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p531y.p535d.C12052a;

/* renamed from: io.reactivex.y.e.e.h */
/* compiled from: ObservableDistinctUntilChanged */
public final class C12327h<T, K> extends C12294a<T, T> {

    /* renamed from: U */
    final Function<? super T, K> f28475U;

    /* renamed from: V */
    final C11948d<? super K, ? super K> f28476V;

    /* renamed from: io.reactivex.y.e.e.h$a */
    /* compiled from: ObservableDistinctUntilChanged */
    static final class C12328a<T, K> extends C12052a<T, T> {

        /* renamed from: Y */
        final Function<? super T, K> f28477Y;

        /* renamed from: Z */
        final C11948d<? super K, ? super K> f28478Z;

        /* renamed from: a0 */
        K f28479a0;

        /* renamed from: b0 */
        boolean f28480b0;

        C12328a(C11968q<? super T> qVar, Function<? super T, K> function, C11948d<? super K, ? super K> dVar) {
            super(qVar);
            this.f28477Y = function;
            this.f28478Z = dVar;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30368b(i);
        }

        public void onNext(T t) {
            if (!this.f27760W) {
                if (this.f27761X != 0) {
                    this.f27762c.onNext(t);
                    return;
                }
                try {
                    K apply = this.f28477Y.apply(t);
                    if (this.f28480b0) {
                        boolean a = this.f28478Z.mo30263a(this.f28479a0, apply);
                        this.f28479a0 = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f28480b0 = true;
                        this.f28479a0 = apply;
                    }
                    this.f27762c.onNext(t);
                } catch (Throwable th) {
                    mo30367a(th);
                }
            }
        }

        public T poll() throws Exception {
            while (true) {
                T poll = this.f27759V.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f28477Y.apply(poll);
                if (!this.f28480b0) {
                    this.f28480b0 = true;
                    this.f28479a0 = apply;
                    return poll;
                } else if (!this.f28478Z.mo30263a(this.f28479a0, apply)) {
                    this.f28479a0 = apply;
                    return poll;
                } else {
                    this.f28479a0 = apply;
                }
            }
        }
    }

    public C12327h(ObservableSource<T> observableSource, Function<? super T, K> function, C11948d<? super K, ? super K> dVar) {
        super(observableSource);
        this.f28475U = function;
        this.f28476V = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12328a(qVar, this.f28475U, this.f28476V));
    }
}
