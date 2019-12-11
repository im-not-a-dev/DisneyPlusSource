package p520io.reactivex.p531y.p536e.p540d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.d.d */
/* compiled from: SingleFlatMapObservable */
public final class C12292d<T, R> extends Observable<R> {

    /* renamed from: U */
    final Function<? super T, ? extends ObservableSource<? extends R>> f28375U;

    /* renamed from: c */
    final SingleSource<T> f28376c;

    /* renamed from: io.reactivex.y.e.d.d$a */
    /* compiled from: SingleFlatMapObservable */
    static final class C12293a<T, R> extends AtomicReference<Disposable> implements C11968q<R>, C11987u<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends ObservableSource<? extends R>> f28377U;

        /* renamed from: c */
        final C11968q<? super R> f28378c;

        C12293a(C11968q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f28378c = qVar;
            this.f28377U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28378c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28378c.onError(th);
        }

        public void onNext(R r) {
            this.f28378c.onNext(r);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f28377U.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null Publisher");
                ((ObservableSource) apply).mo30162a(this);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28378c.onError(th);
            }
        }
    }

    public C12292d(SingleSource<T> singleSource, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        this.f28376c = singleSource;
        this.f28375U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super R> qVar) {
        C12293a aVar = new C12293a(qVar, this.f28375U);
        qVar.onSubscribe(aVar);
        this.f28376c.mo30216a(aVar);
    }
}
