package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.f.k */
/* compiled from: SingleDoOnEvent */
public final class C12459k<T> extends Single<T> {

    /* renamed from: U */
    final C11946b<? super T, ? super Throwable> f28854U;

    /* renamed from: c */
    final SingleSource<T> f28855c;

    /* renamed from: io.reactivex.y.e.f.k$a */
    /* compiled from: SingleDoOnEvent */
    final class C12460a implements C11987u<T> {

        /* renamed from: c */
        private final C11987u<? super T> f28857c;

        C12460a(C11987u<? super T> uVar) {
            this.f28857c = uVar;
        }

        public void onError(Throwable th) {
            try {
                C12459k.this.f28854U.accept(null, th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                th = new C11998a(th, th2);
            }
            this.f28857c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28857c.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                C12459k.this.f28854U.accept(t, null);
                this.f28857c.onSuccess(t);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28857c.onError(th);
            }
        }
    }

    public C12459k(SingleSource<T> singleSource, C11946b<? super T, ? super Throwable> bVar) {
        this.f28855c = singleSource;
        this.f28854U = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28855c.mo30216a(new C12460a(uVar));
    }
}
