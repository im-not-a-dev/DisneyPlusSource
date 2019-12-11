package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.r */
/* compiled from: MaybeIgnoreElement */
public final class C12267r<T> extends C12221a<T, T> {

    /* renamed from: io.reactivex.y.e.c.r$a */
    /* compiled from: MaybeIgnoreElement */
    static final class C12268a<T> implements C11958l<T>, Disposable {

        /* renamed from: U */
        Disposable f28321U;

        /* renamed from: c */
        final C11958l<? super T> f28322c;

        C12268a(C11958l<? super T> lVar) {
            this.f28322c = lVar;
        }

        public void dispose() {
            this.f28321U.dispose();
            this.f28321U = C12010c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f28321U.isDisposed();
        }

        public void onComplete() {
            this.f28321U = C12010c.DISPOSED;
            this.f28322c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28321U = C12010c.DISPOSED;
            this.f28322c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28321U, disposable)) {
                this.f28321U = disposable;
                this.f28322c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28321U = C12010c.DISPOSED;
            this.f28322c.onComplete();
        }
    }

    public C12267r(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12268a(lVar));
    }
}
