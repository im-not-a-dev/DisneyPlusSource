package p520io.reactivex.p531y.p535d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p521a0.C11910c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.d.j */
/* compiled from: LambdaObserver */
public final class C12061j<T> extends AtomicReference<Disposable> implements C11968q<T>, Disposable, C11910c {

    /* renamed from: U */
    final Consumer<? super Throwable> f27777U;

    /* renamed from: V */
    final C11945a f27778V;

    /* renamed from: W */
    final Consumer<? super Disposable> f27779W;

    /* renamed from: c */
    final Consumer<? super T> f27780c;

    public C12061j(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, Consumer<? super Disposable> consumer3) {
        this.f27780c = consumer;
        this.f27777U = consumer2;
        this.f27778V = aVar;
        this.f27779W = consumer3;
    }

    public void dispose() {
        C12010c.m38621a((AtomicReference<Disposable>) this);
    }

    public boolean isDisposed() {
        return get() == C12010c.DISPOSED;
    }

    public void onComplete() {
        if (!isDisposed()) {
            lazySet(C12010c.DISPOSED);
            try {
                this.f27778V.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
        }
    }

    public void onError(Throwable th) {
        if (!isDisposed()) {
            lazySet(C12010c.DISPOSED);
            try {
                this.f27777U.accept(th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                C11915a.m38466b((Throwable) new C11998a(th, th2));
            }
        } else {
            C11915a.m38466b(th);
        }
    }

    public void onNext(T t) {
        if (!isDisposed()) {
            try {
                this.f27780c.accept(t);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                ((Disposable) get()).dispose();
                onError(th);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (C12010c.m38624c(this, disposable)) {
            try {
                this.f27779W.accept(this);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                disposable.dispose();
                onError(th);
            }
        }
    }
}
