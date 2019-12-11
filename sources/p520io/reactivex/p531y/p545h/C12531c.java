package p520io.reactivex.p531y.p545h;

import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import p520io.reactivex.C11955i;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p521a0.C11910c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.h.c */
/* compiled from: LambdaSubscriber */
public final class C12531c<T> extends AtomicReference<C14314c> implements C11955i<T>, C14314c, Disposable, C11910c {

    /* renamed from: U */
    final Consumer<? super Throwable> f29045U;

    /* renamed from: V */
    final C11945a f29046V;

    /* renamed from: W */
    final Consumer<? super C14314c> f29047W;

    /* renamed from: c */
    final Consumer<? super T> f29048c;

    public C12531c(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, Consumer<? super C14314c> consumer3) {
        this.f29048c = consumer;
        this.f29045U = consumer2;
        this.f29046V = aVar;
        this.f29047W = consumer3;
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        if (C12539g.m39328a((AtomicReference<C14314c>) this, cVar)) {
            try {
                this.f29047W.accept(this);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                cVar.cancel();
                onError(th);
            }
        }
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        ((C14314c) get()).mo29946b(j);
    }

    public void cancel() {
        C12539g.m39326a((AtomicReference<C14314c>) this);
    }

    public void dispose() {
        cancel();
    }

    public boolean isDisposed() {
        return get() == C12539g.CANCELLED;
    }

    public void onComplete() {
        Object obj = get();
        C12539g gVar = C12539g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f29046V.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
        }
    }

    public void onError(Throwable th) {
        Object obj = get();
        C12539g gVar = C12539g.CANCELLED;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f29045U.accept(th);
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
                this.f29048c.accept(t);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                ((C14314c) get()).cancel();
                onError(th);
            }
        }
    }
}
