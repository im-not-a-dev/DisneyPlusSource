package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.c.x */
/* compiled from: MaybeOnErrorNext */
public final class C12278x<T> extends C12221a<T, T> {

    /* renamed from: U */
    final Function<? super Throwable, ? extends MaybeSource<? extends T>> f28340U;

    /* renamed from: V */
    final boolean f28341V;

    /* renamed from: io.reactivex.y.e.c.x$a */
    /* compiled from: MaybeOnErrorNext */
    static final class C12279a<T> extends AtomicReference<Disposable> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final Function<? super Throwable, ? extends MaybeSource<? extends T>> f28342U;

        /* renamed from: V */
        final boolean f28343V;

        /* renamed from: c */
        final C11958l<? super T> f28344c;

        /* renamed from: io.reactivex.y.e.c.x$a$a */
        /* compiled from: MaybeOnErrorNext */
        static final class C12280a<T> implements C11958l<T> {

            /* renamed from: U */
            final AtomicReference<Disposable> f28345U;

            /* renamed from: c */
            final C11958l<? super T> f28346c;

            C12280a(C11958l<? super T> lVar, AtomicReference<Disposable> atomicReference) {
                this.f28346c = lVar;
                this.f28345U = atomicReference;
            }

            public void onComplete() {
                this.f28346c.onComplete();
            }

            public void onError(Throwable th) {
                this.f28346c.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this.f28345U, disposable);
            }

            public void onSuccess(T t) {
                this.f28346c.onSuccess(t);
            }
        }

        C12279a(C11958l<? super T> lVar, Function<? super Throwable, ? extends MaybeSource<? extends T>> function, boolean z) {
            this.f28344c = lVar;
            this.f28342U = function;
            this.f28343V = z;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28344c.onComplete();
        }

        public void onError(Throwable th) {
            if (this.f28343V || (th instanceof Exception)) {
                try {
                    MaybeSource maybeSource = (MaybeSource) C12036b.m38663a(this.f28342U.apply(th), "The resumeFunction returned a null MaybeSource");
                    C12010c.m38622a((AtomicReference<Disposable>) this, (Disposable) null);
                    maybeSource.mo30113a(new C12280a(this.f28344c, this));
                } catch (Throwable th2) {
                    C12003b.m38614b(th2);
                    this.f28344c.onError(new C11998a(th, th2));
                }
            } else {
                this.f28344c.onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28344c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28344c.onSuccess(t);
        }
    }

    public C12278x(MaybeSource<T> maybeSource, Function<? super Throwable, ? extends MaybeSource<? extends T>> function, boolean z) {
        super(maybeSource);
        this.f28340U = function;
        this.f28341V = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12279a(lVar, this.f28340U, this.f28341V));
    }
}
