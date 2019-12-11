package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.Callable;
import p520io.reactivex.C11987u;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.a.z */
/* compiled from: CompletableToSingle */
public final class C12109z<T> extends Single<T> {

    /* renamed from: U */
    final Callable<? extends T> f27883U;

    /* renamed from: V */
    final T f27884V;

    /* renamed from: c */
    final CompletableSource f27885c;

    /* renamed from: io.reactivex.y.e.a.z$a */
    /* compiled from: CompletableToSingle */
    final class C12110a implements CompletableObserver {

        /* renamed from: c */
        private final C11987u<? super T> f27887c;

        C12110a(C11987u<? super T> uVar) {
            this.f27887c = uVar;
        }

        public void onComplete() {
            T t;
            C12109z zVar = C12109z.this;
            Callable<? extends T> callable = zVar.f27883U;
            if (callable != null) {
                try {
                    t = callable.call();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f27887c.onError(th);
                    return;
                }
            } else {
                t = zVar.f27884V;
            }
            if (t == null) {
                this.f27887c.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f27887c.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            this.f27887c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f27887c.onSubscribe(disposable);
        }
    }

    public C12109z(CompletableSource completableSource, Callable<? extends T> callable, T t) {
        this.f27885c = completableSource;
        this.f27884V = t;
        this.f27883U = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f27885c.subscribe(new C12110a(uVar));
    }
}
