package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.f.a0 */
/* compiled from: SingleOnErrorReturn */
public final class C12421a0<T> extends Single<T> {

    /* renamed from: U */
    final Function<? super Throwable, ? extends T> f28769U;

    /* renamed from: V */
    final T f28770V;

    /* renamed from: c */
    final SingleSource<? extends T> f28771c;

    /* renamed from: io.reactivex.y.e.f.a0$a */
    /* compiled from: SingleOnErrorReturn */
    final class C12422a implements C11987u<T> {

        /* renamed from: c */
        private final C11987u<? super T> f28773c;

        C12422a(C11987u<? super T> uVar) {
            this.f28773c = uVar;
        }

        public void onError(Throwable th) {
            T t;
            C12421a0 a0Var = C12421a0.this;
            Function<? super Throwable, ? extends T> function = a0Var.f28769U;
            if (function != null) {
                try {
                    t = function.apply(th);
                } catch (Throwable th2) {
                    C12003b.m38614b(th2);
                    this.f28773c.onError(new C11998a(th, th2));
                    return;
                }
            } else {
                t = a0Var.f28770V;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f28773c.onError(nullPointerException);
                return;
            }
            this.f28773c.onSuccess(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28773c.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f28773c.onSuccess(t);
        }
    }

    public C12421a0(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends T> function, T t) {
        this.f28771c = singleSource;
        this.f28769U = function;
        this.f28770V = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28771c.mo30216a(new C12422a(uVar));
    }
}
