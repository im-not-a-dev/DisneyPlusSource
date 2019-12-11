package p520io.reactivex.p531y.p535d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p521a0.C11910c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.d.f */
/* compiled from: ConsumerSingleObserver */
public final class C12057f<T> extends AtomicReference<Disposable> implements C11987u<T>, Disposable, C11910c {

    /* renamed from: U */
    final Consumer<? super Throwable> f27769U;

    /* renamed from: c */
    final Consumer<? super T> f27770c;

    public C12057f(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        this.f27770c = consumer;
        this.f27769U = consumer2;
    }

    public void dispose() {
        C12010c.m38621a((AtomicReference<Disposable>) this);
    }

    public boolean isDisposed() {
        return get() == C12010c.DISPOSED;
    }

    public void onError(Throwable th) {
        lazySet(C12010c.DISPOSED);
        try {
            this.f27769U.accept(th);
        } catch (Throwable th2) {
            C12003b.m38614b(th2);
            C11915a.m38466b((Throwable) new C11998a(th, th2));
        }
    }

    public void onSubscribe(Disposable disposable) {
        C12010c.m38624c(this, disposable);
    }

    public void onSuccess(T t) {
        lazySet(C12010c.DISPOSED);
        try {
            this.f27770c.accept(t);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C11915a.m38466b(th);
        }
    }
}
