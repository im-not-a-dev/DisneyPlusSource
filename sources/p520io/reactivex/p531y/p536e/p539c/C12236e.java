package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.e */
/* compiled from: MaybeDelayWithCompletable */
public final class C12236e<T> extends Maybe<T> {

    /* renamed from: U */
    final CompletableSource f28264U;

    /* renamed from: c */
    final MaybeSource<T> f28265c;

    /* renamed from: io.reactivex.y.e.c.e$a */
    /* compiled from: MaybeDelayWithCompletable */
    static final class C12237a<T> implements C11958l<T> {

        /* renamed from: U */
        final C11958l<? super T> f28266U;

        /* renamed from: c */
        final AtomicReference<Disposable> f28267c;

        C12237a(AtomicReference<Disposable> atomicReference, C11958l<? super T> lVar) {
            this.f28267c = atomicReference;
            this.f28266U = lVar;
        }

        public void onComplete() {
            this.f28266U.onComplete();
        }

        public void onError(Throwable th) {
            this.f28266U.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a(this.f28267c, disposable);
        }

        public void onSuccess(T t) {
            this.f28266U.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.y.e.c.e$b */
    /* compiled from: MaybeDelayWithCompletable */
    static final class C12238b<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: U */
        final MaybeSource<T> f28268U;

        /* renamed from: c */
        final C11958l<? super T> f28269c;

        C12238b(C11958l<? super T> lVar, MaybeSource<T> maybeSource) {
            this.f28269c = lVar;
            this.f28268U = maybeSource;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28268U.mo30113a(new C12237a(this, this.f28269c));
        }

        public void onError(Throwable th) {
            this.f28269c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28269c.onSubscribe(this);
            }
        }
    }

    public C12236e(MaybeSource<T> maybeSource, CompletableSource completableSource) {
        this.f28265c = maybeSource;
        this.f28264U = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28264U.subscribe(new C12238b(lVar, this.f28265c));
    }
}
