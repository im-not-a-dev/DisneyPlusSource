package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p534c.C12041d;

/* renamed from: io.reactivex.y.e.e.c0 */
/* compiled from: ObservableIgnoreElementsCompletable */
public final class C12304c0<T> extends Completable implements C12041d<T> {

    /* renamed from: c */
    final ObservableSource<T> f28400c;

    /* renamed from: io.reactivex.y.e.e.c0$a */
    /* compiled from: ObservableIgnoreElementsCompletable */
    static final class C12305a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        Disposable f28401U;

        /* renamed from: c */
        final CompletableObserver f28402c;

        C12305a(CompletableObserver completableObserver) {
            this.f28402c = completableObserver;
        }

        public void dispose() {
            this.f28401U.dispose();
        }

        public boolean isDisposed() {
            return this.f28401U.isDisposed();
        }

        public void onComplete() {
            this.f28402c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28402c.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(Disposable disposable) {
            this.f28401U = disposable;
            this.f28402c.onSubscribe(this);
        }
    }

    public C12304c0(ObservableSource<T> observableSource) {
        this.f28400c = observableSource;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f28400c.mo30162a(new C12305a(completableObserver));
    }

    /* renamed from: a */
    public Observable<T> mo30364a() {
        return C11915a.m38448a((Observable<T>) new C12300b0<T>(this.f28400c));
    }
}
