package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.f.m */
/* compiled from: SingleDoOnSuccess */
public final class C12463m<T> extends Single<T> {

    /* renamed from: U */
    final Consumer<? super T> f28863U;

    /* renamed from: c */
    final SingleSource<T> f28864c;

    /* renamed from: io.reactivex.y.e.f.m$a */
    /* compiled from: SingleDoOnSuccess */
    final class C12464a implements C11987u<T> {

        /* renamed from: c */
        final C11987u<? super T> f28866c;

        C12464a(C11987u<? super T> uVar) {
            this.f28866c = uVar;
        }

        public void onError(Throwable th) {
            this.f28866c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28866c.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                C12463m.this.f28863U.accept(t);
                this.f28866c.onSuccess(t);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28866c.onError(th);
            }
        }
    }

    public C12463m(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f28864c = singleSource;
        this.f28863U = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28864c.mo30216a(new C12464a(uVar));
    }
}
