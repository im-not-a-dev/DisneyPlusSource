package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p521a0.C11910c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.b */
/* compiled from: MaybeCallbackObserver */
public final class C12225b<T> extends AtomicReference<Disposable> implements C11958l<T>, Disposable, C11910c {

    /* renamed from: U */
    final Consumer<? super Throwable> f28240U;

    /* renamed from: V */
    final C11945a f28241V;

    /* renamed from: c */
    final Consumer<? super T> f28242c;

    public C12225b(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar) {
        this.f28242c = consumer;
        this.f28240U = consumer2;
        this.f28241V = aVar;
    }

    public void dispose() {
        C12010c.m38621a((AtomicReference<Disposable>) this);
    }

    public boolean isDisposed() {
        return C12010c.m38619a((Disposable) get());
    }

    public void onComplete() {
        lazySet(C12010c.DISPOSED);
        try {
            this.f28241V.run();
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C11915a.m38466b(th);
        }
    }

    public void onError(Throwable th) {
        lazySet(C12010c.DISPOSED);
        try {
            this.f28240U.accept(th);
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
            this.f28242c.accept(t);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C11915a.m38466b(th);
        }
    }
}
