package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p531y.p535d.C12052a;

/* renamed from: io.reactivex.y.e.e.q */
/* compiled from: ObservableFilter */
public final class C12375q<T> extends C12294a<T, T> {

    /* renamed from: U */
    final C11952h<? super T> f28617U;

    /* renamed from: io.reactivex.y.e.e.q$a */
    /* compiled from: ObservableFilter */
    static final class C12376a<T> extends C12052a<T, T> {

        /* renamed from: Y */
        final C11952h<? super T> f28618Y;

        C12376a(C11968q<? super T> qVar, C11952h<? super T> hVar) {
            super(qVar);
            this.f28618Y = hVar;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30368b(i);
        }

        public void onNext(T t) {
            if (this.f27761X == 0) {
                try {
                    if (this.f28618Y.test(t)) {
                        this.f27762c.onNext(t);
                    }
                } catch (Throwable th) {
                    mo30367a(th);
                }
            } else {
                this.f27762c.onNext(null);
            }
        }

        public T poll() throws Exception {
            T poll;
            do {
                poll = this.f27759V.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f28618Y.test(poll));
            return poll;
        }
    }

    public C12375q(ObservableSource<T> observableSource, C11952h<? super T> hVar) {
        super(observableSource);
        this.f28617U = hVar;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12376a(qVar, this.f28617U));
    }
}
