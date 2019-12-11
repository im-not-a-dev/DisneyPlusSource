package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.a0 */
/* compiled from: MaybeSwitchIfEmpty */
public final class C12222a0<T> extends C12221a<T, T> {

    /* renamed from: U */
    final MaybeSource<? extends T> f28235U;

    /* renamed from: io.reactivex.y.e.c.a0$a */
    /* compiled from: MaybeSwitchIfEmpty */
    static final class C12223a<T> extends AtomicReference<Disposable> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final MaybeSource<? extends T> f28236U;

        /* renamed from: c */
        final C11958l<? super T> f28237c;

        /* renamed from: io.reactivex.y.e.c.a0$a$a */
        /* compiled from: MaybeSwitchIfEmpty */
        static final class C12224a<T> implements C11958l<T> {

            /* renamed from: U */
            final AtomicReference<Disposable> f28238U;

            /* renamed from: c */
            final C11958l<? super T> f28239c;

            C12224a(C11958l<? super T> lVar, AtomicReference<Disposable> atomicReference) {
                this.f28239c = lVar;
                this.f28238U = atomicReference;
            }

            public void onComplete() {
                this.f28239c.onComplete();
            }

            public void onError(Throwable th) {
                this.f28239c.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this.f28238U, disposable);
            }

            public void onSuccess(T t) {
                this.f28239c.onSuccess(t);
            }
        }

        C12223a(C11958l<? super T> lVar, MaybeSource<? extends T> maybeSource) {
            this.f28237c = lVar;
            this.f28236U = maybeSource;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            Disposable disposable = (Disposable) get();
            if (disposable != C12010c.DISPOSED && compareAndSet(disposable, null)) {
                this.f28236U.mo30113a(new C12224a(this.f28237c, this));
            }
        }

        public void onError(Throwable th) {
            this.f28237c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28237c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28237c.onSuccess(t);
        }
    }

    public C12222a0(MaybeSource<T> maybeSource, MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.f28235U = maybeSource2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12223a(lVar, this.f28235U));
    }
}
