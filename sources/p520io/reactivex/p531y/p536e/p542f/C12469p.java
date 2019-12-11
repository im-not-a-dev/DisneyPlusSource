package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.p */
/* compiled from: SingleFlatMapCompletable */
public final class C12469p<T> extends Completable {

    /* renamed from: U */
    final Function<? super T, ? extends CompletableSource> f28874U;

    /* renamed from: c */
    final SingleSource<T> f28875c;

    /* renamed from: io.reactivex.y.e.f.p$a */
    /* compiled from: SingleFlatMapCompletable */
    static final class C12470a<T> extends AtomicReference<Disposable> implements C11987u<T>, CompletableObserver, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends CompletableSource> f28876U;

        /* renamed from: c */
        final CompletableObserver f28877c;

        C12470a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function) {
            this.f28877c = completableObserver;
            this.f28876U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28877c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28877c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }

        public void onSuccess(T t) {
            try {
                CompletableSource completableSource = (CompletableSource) C12036b.m38663a(this.f28876U.apply(t), "The mapper returned a null CompletableSource");
                if (!isDisposed()) {
                    completableSource.subscribe(this);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                onError(th);
            }
        }
    }

    public C12469p(SingleSource<T> singleSource, Function<? super T, ? extends CompletableSource> function) {
        this.f28875c = singleSource;
        this.f28874U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C12470a aVar = new C12470a(completableObserver, this.f28874U);
        completableObserver.onSubscribe(aVar);
        this.f28875c.mo30216a(aVar);
    }
}
