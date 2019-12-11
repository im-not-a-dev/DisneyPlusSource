package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.C11987u;
import p520io.reactivex.Maybe;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12045h;

/* renamed from: io.reactivex.y.e.c.q */
/* compiled from: MaybeFromSingle */
public final class C12265q<T> extends Maybe<T> implements C12045h<T> {

    /* renamed from: c */
    final SingleSource<T> f28318c;

    /* renamed from: io.reactivex.y.e.c.q$a */
    /* compiled from: MaybeFromSingle */
    static final class C12266a<T> implements C11987u<T>, Disposable {

        /* renamed from: U */
        Disposable f28319U;

        /* renamed from: c */
        final C11958l<? super T> f28320c;

        C12266a(C11958l<? super T> lVar) {
            this.f28320c = lVar;
        }

        public void dispose() {
            this.f28319U.dispose();
            this.f28319U = C12010c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f28319U.isDisposed();
        }

        public void onError(Throwable th) {
            this.f28319U = C12010c.DISPOSED;
            this.f28320c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28319U, disposable)) {
                this.f28319U = disposable;
                this.f28320c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28319U = C12010c.DISPOSED;
            this.f28320c.onSuccess(t);
        }
    }

    public C12265q(SingleSource<T> singleSource) {
        this.f28318c = singleSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28318c.mo30216a(new C12266a(lVar));
    }
}
