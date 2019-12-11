package p520io.reactivex.p531y.p536e.p539c;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11987u;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.c.m */
/* compiled from: MaybeFlatMapSingle */
public final class C12255m<T, R> extends Single<R> {

    /* renamed from: U */
    final Function<? super T, ? extends SingleSource<? extends R>> f28300U;

    /* renamed from: c */
    final MaybeSource<T> f28301c;

    /* renamed from: io.reactivex.y.e.c.m$a */
    /* compiled from: MaybeFlatMapSingle */
    static final class C12256a<T, R> extends AtomicReference<Disposable> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends SingleSource<? extends R>> f28302U;

        /* renamed from: c */
        final C11987u<? super R> f28303c;

        C12256a(C11987u<? super R> uVar, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f28303c = uVar;
            this.f28302U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28303c.onError(new NoSuchElementException());
        }

        public void onError(Throwable th) {
            this.f28303c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28303c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f28302U.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) apply;
                if (!isDisposed()) {
                    singleSource.mo30216a(new C12257b(this, this.f28303c));
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.y.e.c.m$b */
    /* compiled from: MaybeFlatMapSingle */
    static final class C12257b<R> implements C11987u<R> {

        /* renamed from: U */
        final C11987u<? super R> f28304U;

        /* renamed from: c */
        final AtomicReference<Disposable> f28305c;

        C12257b(AtomicReference<Disposable> atomicReference, C11987u<? super R> uVar) {
            this.f28305c = atomicReference;
            this.f28304U = uVar;
        }

        public void onError(Throwable th) {
            this.f28304U.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a(this.f28305c, disposable);
        }

        public void onSuccess(R r) {
            this.f28304U.onSuccess(r);
        }
    }

    public C12255m(MaybeSource<T> maybeSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f28301c = maybeSource;
        this.f28300U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super R> uVar) {
        this.f28301c.mo30113a(new C12256a(uVar, this.f28300U));
    }
}
