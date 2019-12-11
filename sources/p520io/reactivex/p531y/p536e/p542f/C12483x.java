package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.x */
/* compiled from: SingleMap */
public final class C12483x<T, R> extends Single<R> {

    /* renamed from: U */
    final Function<? super T, ? extends R> f28903U;

    /* renamed from: c */
    final SingleSource<? extends T> f28904c;

    /* renamed from: io.reactivex.y.e.f.x$a */
    /* compiled from: SingleMap */
    static final class C12484a<T, R> implements C11987u<T> {

        /* renamed from: U */
        final Function<? super T, ? extends R> f28905U;

        /* renamed from: c */
        final C11987u<? super R> f28906c;

        C12484a(C11987u<? super R> uVar, Function<? super T, ? extends R> function) {
            this.f28906c = uVar;
            this.f28905U = function;
        }

        public void onError(Throwable th) {
            this.f28906c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28906c.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                this.f28906c.onSuccess(C12036b.m38663a(this.f28905U.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C12003b.m38614b(th);
                onError(th);
            }
        }
    }

    public C12483x(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.f28904c = singleSource;
        this.f28903U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super R> uVar) {
        this.f28904c.mo30216a(new C12484a(uVar, this.f28903U));
    }
}
