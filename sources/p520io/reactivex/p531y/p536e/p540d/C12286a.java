package p520io.reactivex.p531y.p536e.p540d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.d.a */
/* compiled from: CompletableAndThenObservable */
public final class C12286a<R> extends Observable<R> {

    /* renamed from: U */
    final ObservableSource<? extends R> f28361U;

    /* renamed from: c */
    final CompletableSource f28362c;

    /* renamed from: io.reactivex.y.e.d.a$a */
    /* compiled from: CompletableAndThenObservable */
    static final class C12287a<R> extends AtomicReference<Disposable> implements C11968q<R>, CompletableObserver, Disposable {

        /* renamed from: U */
        ObservableSource<? extends R> f28363U;

        /* renamed from: c */
        final C11968q<? super R> f28364c;

        C12287a(C11968q<? super R> qVar, ObservableSource<? extends R> observableSource) {
            this.f28363U = observableSource;
            this.f28364c = qVar;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            ObservableSource<? extends R> observableSource = this.f28363U;
            if (observableSource == null) {
                this.f28364c.onComplete();
                return;
            }
            this.f28363U = null;
            observableSource.mo30162a(this);
        }

        public void onError(Throwable th) {
            this.f28364c.onError(th);
        }

        public void onNext(R r) {
            this.f28364c.onNext(r);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }
    }

    public C12286a(CompletableSource completableSource, ObservableSource<? extends R> observableSource) {
        this.f28362c = completableSource;
        this.f28361U = observableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super R> qVar) {
        C12287a aVar = new C12287a(qVar, this.f28361U);
        qVar.onSubscribe(aVar);
        this.f28362c.subscribe(aVar);
    }
}
