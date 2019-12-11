package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.s0 */
/* compiled from: ObservableSkip */
public final class C12386s0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final long f28662U;

    /* renamed from: io.reactivex.y.e.e.s0$a */
    /* compiled from: ObservableSkip */
    static final class C12387a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        long f28663U;

        /* renamed from: V */
        Disposable f28664V;

        /* renamed from: c */
        final C11968q<? super T> f28665c;

        C12387a(C11968q<? super T> qVar, long j) {
            this.f28665c = qVar;
            this.f28663U = j;
        }

        public void dispose() {
            this.f28664V.dispose();
        }

        public boolean isDisposed() {
            return this.f28664V.isDisposed();
        }

        public void onComplete() {
            this.f28665c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28665c.onError(th);
        }

        public void onNext(T t) {
            long j = this.f28663U;
            if (j != 0) {
                this.f28663U = j - 1;
            } else {
                this.f28665c.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28664V, disposable)) {
                this.f28664V = disposable;
                this.f28665c.onSubscribe(this);
            }
        }
    }

    public C12386s0(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f28662U = j;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12387a(qVar, this.f28662U));
    }
}
