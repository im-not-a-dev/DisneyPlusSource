package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11987u;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.c.n */
/* compiled from: MaybeFlatMapSingleElement */
public final class C12258n<T, R> extends Maybe<R> {

    /* renamed from: U */
    final Function<? super T, ? extends SingleSource<? extends R>> f28306U;

    /* renamed from: c */
    final MaybeSource<T> f28307c;

    /* renamed from: io.reactivex.y.e.c.n$a */
    /* compiled from: MaybeFlatMapSingleElement */
    static final class C12259a<T, R> extends AtomicReference<Disposable> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends SingleSource<? extends R>> f28308U;

        /* renamed from: c */
        final C11958l<? super R> f28309c;

        C12259a(C11958l<? super R> lVar, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f28309c = lVar;
            this.f28308U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28309c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28309c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28309c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f28308U.apply(t);
                C12036b.m38663a(apply, "The mapper returned a null SingleSource");
                ((SingleSource) apply).mo30216a(new C12260b(this, this.f28309c));
            } catch (Throwable th) {
                C12003b.m38614b(th);
                onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.y.e.c.n$b */
    /* compiled from: MaybeFlatMapSingleElement */
    static final class C12260b<R> implements C11987u<R> {

        /* renamed from: U */
        final C11958l<? super R> f28310U;

        /* renamed from: c */
        final AtomicReference<Disposable> f28311c;

        C12260b(AtomicReference<Disposable> atomicReference, C11958l<? super R> lVar) {
            this.f28311c = atomicReference;
            this.f28310U = lVar;
        }

        public void onError(Throwable th) {
            this.f28310U.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a(this.f28311c, disposable);
        }

        public void onSuccess(R r) {
            this.f28310U.onSuccess(r);
        }
    }

    public C12258n(MaybeSource<T> maybeSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f28307c = maybeSource;
        this.f28306U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super R> lVar) {
        this.f28307c.mo30113a(new C12259a(lVar, this.f28306U));
    }
}
