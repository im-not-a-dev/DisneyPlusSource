package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.a0 */
/* compiled from: ObservableHide */
public final class C12295a0<T> extends C12294a<T, T> {

    /* renamed from: io.reactivex.y.e.e.a0$a */
    /* compiled from: ObservableHide */
    static final class C12296a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        Disposable f28380U;

        /* renamed from: c */
        final C11968q<? super T> f28381c;

        C12296a(C11968q<? super T> qVar) {
            this.f28381c = qVar;
        }

        public void dispose() {
            this.f28380U.dispose();
        }

        public boolean isDisposed() {
            return this.f28380U.isDisposed();
        }

        public void onComplete() {
            this.f28381c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28381c.onError(th);
        }

        public void onNext(T t) {
            this.f28381c.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28380U, disposable)) {
                this.f28380U = disposable;
                this.f28381c.onSubscribe(this);
            }
        }
    }

    public C12295a0(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12296a(qVar));
    }
}
