package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.C11987u;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.y.e.a.k */
/* compiled from: CompletableFromSingle */
public final class C12079k<T> extends Completable {

    /* renamed from: c */
    final SingleSource<T> f27809c;

    /* renamed from: io.reactivex.y.e.a.k$a */
    /* compiled from: CompletableFromSingle */
    static final class C12080a<T> implements C11987u<T> {

        /* renamed from: c */
        final CompletableObserver f27810c;

        C12080a(CompletableObserver completableObserver) {
            this.f27810c = completableObserver;
        }

        public void onError(Throwable th) {
            this.f27810c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f27810c.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f27810c.onComplete();
        }
    }

    public C12079k(SingleSource<T> singleSource) {
        this.f27809c = singleSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27809c.mo30216a(new C12080a(completableObserver));
    }
}
