package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12040c;

/* renamed from: io.reactivex.y.e.c.s */
/* compiled from: MaybeIgnoreElementCompletable */
public final class C12269s<T> extends Completable implements C12040c<T> {

    /* renamed from: c */
    final MaybeSource<T> f28323c;

    /* renamed from: io.reactivex.y.e.c.s$a */
    /* compiled from: MaybeIgnoreElementCompletable */
    static final class C12270a<T> implements C11958l<T>, Disposable {

        /* renamed from: U */
        Disposable f28324U;

        /* renamed from: c */
        final CompletableObserver f28325c;

        C12270a(CompletableObserver completableObserver) {
            this.f28325c = completableObserver;
        }

        public void dispose() {
            this.f28324U.dispose();
            this.f28324U = C12010c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f28324U.isDisposed();
        }

        public void onComplete() {
            this.f28324U = C12010c.DISPOSED;
            this.f28325c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28324U = C12010c.DISPOSED;
            this.f28325c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28324U, disposable)) {
                this.f28324U = disposable;
                this.f28325c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28324U = C12010c.DISPOSED;
            this.f28325c.onComplete();
        }
    }

    public C12269s(MaybeSource<T> maybeSource) {
        this.f28323c = maybeSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f28323c.mo30113a(new C12270a(completableObserver));
    }

    /* renamed from: c */
    public Maybe<T> mo30363c() {
        return C11915a.m38447a((Maybe<T>) new C12267r<T>(this.f28323c));
    }
}
