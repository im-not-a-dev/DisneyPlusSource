package p520io.reactivex.p531y.p536e.p540d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11968q;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.d.c */
/* compiled from: MaybeFlatMapObservable */
public final class C12290c<T, R> extends Observable<R> {

    /* renamed from: U */
    final Function<? super T, ? extends ObservableSource<? extends R>> f28371U;

    /* renamed from: c */
    final MaybeSource<T> f28372c;

    /* renamed from: io.reactivex.y.e.d.c$a */
    /* compiled from: MaybeFlatMapObservable */
    static final class C12291a<T, R> extends AtomicReference<Disposable> implements C11968q<R>, C11958l<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends ObservableSource<? extends R>> f28373U;

        /* renamed from: c */
        final C11968q<? super R> f28374c;

        C12291a(C11968q<? super R> qVar, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f28374c = qVar;
            this.f28373U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28374c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28374c.onError(th);
        }

        public void onNext(R r) {
            this.f28374c.onNext(r);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f28373U.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null Publisher");
                ((ObservableSource) apply).mo30162a(this);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28374c.onError(th);
            }
        }
    }

    public C12290c(MaybeSource<T> maybeSource, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        this.f28372c = maybeSource;
        this.f28371U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super R> qVar) {
        C12291a aVar = new C12291a(qVar, this.f28371U);
        qVar.onSubscribe(aVar);
        this.f28372c.mo30113a(aVar);
    }
}
