package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11987u;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12042e;

/* renamed from: io.reactivex.y.e.c.b0 */
/* compiled from: MaybeSwitchIfEmptySingle */
public final class C12226b0<T> extends Single<T> implements C12042e<T> {

    /* renamed from: U */
    final SingleSource<? extends T> f28243U;

    /* renamed from: c */
    final MaybeSource<T> f28244c;

    /* renamed from: io.reactivex.y.e.c.b0$a */
    /* compiled from: MaybeSwitchIfEmptySingle */
    static final class C12227a<T> extends AtomicReference<Disposable> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final SingleSource<? extends T> f28245U;

        /* renamed from: c */
        final C11987u<? super T> f28246c;

        /* renamed from: io.reactivex.y.e.c.b0$a$a */
        /* compiled from: MaybeSwitchIfEmptySingle */
        static final class C12228a<T> implements C11987u<T> {

            /* renamed from: U */
            final AtomicReference<Disposable> f28247U;

            /* renamed from: c */
            final C11987u<? super T> f28248c;

            C12228a(C11987u<? super T> uVar, AtomicReference<Disposable> atomicReference) {
                this.f28248c = uVar;
                this.f28247U = atomicReference;
            }

            public void onError(Throwable th) {
                this.f28248c.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this.f28247U, disposable);
            }

            public void onSuccess(T t) {
                this.f28248c.onSuccess(t);
            }
        }

        C12227a(C11987u<? super T> uVar, SingleSource<? extends T> singleSource) {
            this.f28246c = uVar;
            this.f28245U = singleSource;
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
                this.f28245U.mo30216a(new C12228a(this.f28246c, this));
            }
        }

        public void onError(Throwable th) {
            this.f28246c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28246c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28246c.onSuccess(t);
        }
    }

    public C12226b0(MaybeSource<T> maybeSource, SingleSource<? extends T> singleSource) {
        this.f28244c = maybeSource;
        this.f28243U = singleSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28244c.mo30113a(new C12227a(uVar, this.f28243U));
    }
}
