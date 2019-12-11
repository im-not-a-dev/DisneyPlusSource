package p520io.reactivex.p531y.p536e.p542f;

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

/* renamed from: io.reactivex.y.e.f.r */
/* compiled from: SingleFlatMapMaybe */
public final class C12473r<T, R> extends Maybe<R> {

    /* renamed from: U */
    final Function<? super T, ? extends MaybeSource<? extends R>> f28886U;

    /* renamed from: c */
    final SingleSource<? extends T> f28887c;

    /* renamed from: io.reactivex.y.e.f.r$a */
    /* compiled from: SingleFlatMapMaybe */
    static final class C12474a<R> implements C11958l<R> {

        /* renamed from: U */
        final C11958l<? super R> f28888U;

        /* renamed from: c */
        final AtomicReference<Disposable> f28889c;

        C12474a(AtomicReference<Disposable> atomicReference, C11958l<? super R> lVar) {
            this.f28889c = atomicReference;
            this.f28888U = lVar;
        }

        public void onComplete() {
            this.f28888U.onComplete();
        }

        public void onError(Throwable th) {
            this.f28888U.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a(this.f28889c, disposable);
        }

        public void onSuccess(R r) {
            this.f28888U.onSuccess(r);
        }
    }

    /* renamed from: io.reactivex.y.e.f.r$b */
    /* compiled from: SingleFlatMapMaybe */
    static final class C12475b<T, R> extends AtomicReference<Disposable> implements C11987u<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends MaybeSource<? extends R>> f28890U;

        /* renamed from: c */
        final C11958l<? super R> f28891c;

        C12475b(C11958l<? super R> lVar, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f28891c = lVar;
            this.f28890U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onError(Throwable th) {
            this.f28891c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28891c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                MaybeSource maybeSource = (MaybeSource) C12036b.m38663a(this.f28890U.apply(t), "The mapper returned a null MaybeSource");
                if (!isDisposed()) {
                    maybeSource.mo30113a(new C12474a(this, this.f28891c));
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                onError(th);
            }
        }
    }

    public C12473r(SingleSource<? extends T> singleSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        this.f28886U = function;
        this.f28887c = singleSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super R> lVar) {
        this.f28887c.mo30216a(new C12475b(lVar, this.f28886U));
    }
}
