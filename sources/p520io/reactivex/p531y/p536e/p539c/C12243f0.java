package p520io.reactivex.p531y.p536e.p539c;

import java.util.NoSuchElementException;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11987u;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12042e;

/* renamed from: io.reactivex.y.e.c.f0 */
/* compiled from: MaybeToSingle */
public final class C12243f0<T> extends Single<T> implements C12042e<T> {

    /* renamed from: U */
    final T f28276U;

    /* renamed from: c */
    final MaybeSource<T> f28277c;

    /* renamed from: io.reactivex.y.e.c.f0$a */
    /* compiled from: MaybeToSingle */
    static final class C12244a<T> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final T f28278U;

        /* renamed from: V */
        Disposable f28279V;

        /* renamed from: c */
        final C11987u<? super T> f28280c;

        C12244a(C11987u<? super T> uVar, T t) {
            this.f28280c = uVar;
            this.f28278U = t;
        }

        public void dispose() {
            this.f28279V.dispose();
            this.f28279V = C12010c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f28279V.isDisposed();
        }

        public void onComplete() {
            this.f28279V = C12010c.DISPOSED;
            T t = this.f28278U;
            if (t != null) {
                this.f28280c.onSuccess(t);
            } else {
                this.f28280c.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        public void onError(Throwable th) {
            this.f28279V = C12010c.DISPOSED;
            this.f28280c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28279V, disposable)) {
                this.f28279V = disposable;
                this.f28280c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28279V = C12010c.DISPOSED;
            this.f28280c.onSuccess(t);
        }
    }

    public C12243f0(MaybeSource<T> maybeSource, T t) {
        this.f28277c = maybeSource;
        this.f28276U = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28277c.mo30113a(new C12244a(uVar, this.f28276U));
    }
}
