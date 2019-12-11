package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.y.e.e.b0 */
/* compiled from: ObservableIgnoreElements */
public final class C12300b0<T> extends C12294a<T, T> {

    /* renamed from: io.reactivex.y.e.e.b0$a */
    /* compiled from: ObservableIgnoreElements */
    static final class C12301a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        Disposable f28391U;

        /* renamed from: c */
        final C11968q<? super T> f28392c;

        C12301a(C11968q<? super T> qVar) {
            this.f28392c = qVar;
        }

        public void dispose() {
            this.f28391U.dispose();
        }

        public boolean isDisposed() {
            return this.f28391U.isDisposed();
        }

        public void onComplete() {
            this.f28392c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28392c.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(Disposable disposable) {
            this.f28391U = disposable;
            this.f28392c.onSubscribe(this);
        }
    }

    public C12300b0(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12301a(qVar));
    }
}
