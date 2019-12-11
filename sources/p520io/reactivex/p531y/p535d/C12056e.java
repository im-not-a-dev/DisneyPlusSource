package p520io.reactivex.p531y.p535d;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p521a0.C11910c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p530x.C12005d;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.d.e */
/* compiled from: CallbackCompletableObserver */
public final class C12056e extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Consumer<Throwable>, C11910c {

    /* renamed from: U */
    final C11945a f27767U;

    /* renamed from: c */
    final Consumer<? super Throwable> f27768c;

    public C12056e(Consumer<? super Throwable> consumer, C11945a aVar) {
        this.f27768c = consumer;
        this.f27767U = aVar;
    }

    /* renamed from: a */
    public void accept(Throwable th) {
        C11915a.m38466b((Throwable) new C12005d(th));
    }

    public void dispose() {
        C12010c.m38621a((AtomicReference<Disposable>) this);
    }

    public boolean isDisposed() {
        return get() == C12010c.DISPOSED;
    }

    public void onComplete() {
        try {
            this.f27767U.run();
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C11915a.m38466b(th);
        }
        lazySet(C12010c.DISPOSED);
    }

    public void onError(Throwable th) {
        try {
            this.f27768c.accept(th);
        } catch (Throwable th2) {
            C12003b.m38614b(th2);
            C11915a.m38466b(th2);
        }
        lazySet(C12010c.DISPOSED);
    }

    public void onSubscribe(Disposable disposable) {
        C12010c.m38624c(this, disposable);
    }
}
