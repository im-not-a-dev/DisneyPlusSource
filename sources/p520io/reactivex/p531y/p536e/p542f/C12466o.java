package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.o */
/* compiled from: SingleFlatMap */
public final class C12466o<T, R> extends Single<R> {

    /* renamed from: U */
    final Function<? super T, ? extends SingleSource<? extends R>> f28868U;

    /* renamed from: c */
    final SingleSource<? extends T> f28869c;

    /* renamed from: io.reactivex.y.e.f.o$a */
    /* compiled from: SingleFlatMap */
    static final class C12467a<T, R> extends AtomicReference<Disposable> implements C11987u<T>, Disposable {

        /* renamed from: U */
        final Function<? super T, ? extends SingleSource<? extends R>> f28870U;

        /* renamed from: c */
        final C11987u<? super R> f28871c;

        /* renamed from: io.reactivex.y.e.f.o$a$a */
        /* compiled from: SingleFlatMap */
        static final class C12468a<R> implements C11987u<R> {

            /* renamed from: U */
            final C11987u<? super R> f28872U;

            /* renamed from: c */
            final AtomicReference<Disposable> f28873c;

            C12468a(AtomicReference<Disposable> atomicReference, C11987u<? super R> uVar) {
                this.f28873c = atomicReference;
                this.f28872U = uVar;
            }

            public void onError(Throwable th) {
                this.f28872U.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38622a(this.f28873c, disposable);
            }

            public void onSuccess(R r) {
                this.f28872U.onSuccess(r);
            }
        }

        C12467a(C11987u<? super R> uVar, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f28871c = uVar;
            this.f28870U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onError(Throwable th) {
            this.f28871c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28871c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                SingleSource singleSource = (SingleSource) C12036b.m38663a(this.f28870U.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    singleSource.mo30216a(new C12468a(this, this.f28871c));
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28871c.onError(th);
            }
        }
    }

    public C12466o(SingleSource<? extends T> singleSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f28868U = function;
        this.f28869c = singleSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super R> uVar) {
        this.f28869c.mo30216a(new C12467a(uVar, this.f28868U));
    }
}
