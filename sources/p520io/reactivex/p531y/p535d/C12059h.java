package p520io.reactivex.p531y.p535d;

import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.d.h */
/* compiled from: DisposableLambdaObserver */
public final class C12059h<T> implements C11968q<T>, Disposable {

    /* renamed from: U */
    final Consumer<? super Disposable> f27773U;

    /* renamed from: V */
    final C11945a f27774V;

    /* renamed from: W */
    Disposable f27775W;

    /* renamed from: c */
    final C11968q<? super T> f27776c;

    public C12059h(C11968q<? super T> qVar, Consumer<? super Disposable> consumer, C11945a aVar) {
        this.f27776c = qVar;
        this.f27773U = consumer;
        this.f27774V = aVar;
    }

    public void dispose() {
        Disposable disposable = this.f27775W;
        C12010c cVar = C12010c.DISPOSED;
        if (disposable != cVar) {
            this.f27775W = cVar;
            try {
                this.f27774V.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
            disposable.dispose();
        }
    }

    public boolean isDisposed() {
        return this.f27775W.isDisposed();
    }

    public void onComplete() {
        Disposable disposable = this.f27775W;
        C12010c cVar = C12010c.DISPOSED;
        if (disposable != cVar) {
            this.f27775W = cVar;
            this.f27776c.onComplete();
        }
    }

    public void onError(Throwable th) {
        Disposable disposable = this.f27775W;
        C12010c cVar = C12010c.DISPOSED;
        if (disposable != cVar) {
            this.f27775W = cVar;
            this.f27776c.onError(th);
            return;
        }
        C11915a.m38466b(th);
    }

    public void onNext(T t) {
        this.f27776c.onNext(t);
    }

    public void onSubscribe(Disposable disposable) {
        try {
            this.f27773U.accept(disposable);
            if (C12010c.m38620a(this.f27775W, disposable)) {
                this.f27775W = disposable;
                this.f27776c.onSubscribe(this);
            }
        } catch (Throwable th) {
            C12003b.m38614b(th);
            disposable.dispose();
            this.f27775W = C12010c.DISPOSED;
            C12011d.m38631a(th, this.f27776c);
        }
    }
}
