package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p531y.p535d.C12052a;

/* renamed from: io.reactivex.y.e.e.i */
/* compiled from: ObservableDoAfterNext */
public final class C12331i<T> extends C12294a<T, T> {

    /* renamed from: U */
    final Consumer<? super T> f28495U;

    /* renamed from: io.reactivex.y.e.e.i$a */
    /* compiled from: ObservableDoAfterNext */
    static final class C12332a<T> extends C12052a<T, T> {

        /* renamed from: Y */
        final Consumer<? super T> f28496Y;

        C12332a(C11968q<? super T> qVar, Consumer<? super T> consumer) {
            super(qVar);
            this.f28496Y = consumer;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            return mo30368b(i);
        }

        public void onNext(T t) {
            this.f27762c.onNext(t);
            if (this.f27761X == 0) {
                try {
                    this.f28496Y.accept(t);
                } catch (Throwable th) {
                    mo30367a(th);
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.f27759V.poll();
            if (poll != null) {
                this.f28496Y.accept(poll);
            }
            return poll;
        }
    }

    public C12331i(ObservableSource<T> observableSource, Consumer<? super T> consumer) {
        super(observableSource);
        this.f28495U = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12332a(qVar, this.f28495U));
    }
}
