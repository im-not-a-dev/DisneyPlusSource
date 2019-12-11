package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.c.l */
/* compiled from: MaybeFlatMapCompletable */
public final class C12253l<T> extends Completable {

    /* renamed from: U */
    final Function<? super T, ? extends CompletableSource> f28296U;

    /* renamed from: c */
    final MaybeSource<T> f28297c;

    /* renamed from: io.reactivex.y.e.c.l$a */
    /* compiled from: MaybeFlatMapCompletable */
    static final class C12254a<T> extends AtomicReference<Disposable> implements C11958l<T>, CompletableObserver, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends CompletableSource> f28298U;

        /* renamed from: c */
        final CompletableObserver f28299c;

        C12254a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function) {
            this.f28299c = completableObserver;
            this.f28298U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28299c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28299c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f28298U.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) apply;
                if (!isDisposed()) {
                    completableSource.subscribe(this);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                onError(th);
            }
        }
    }

    public C12253l(MaybeSource<T> maybeSource, Function<? super T, ? extends CompletableSource> function) {
        this.f28297c = maybeSource;
        this.f28296U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C12254a aVar = new C12254a(completableObserver, this.f28296U);
        completableObserver.onSubscribe(aVar);
        this.f28297c.mo30113a(aVar);
    }
}
