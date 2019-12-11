package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p548z.C12557a;

/* renamed from: io.reactivex.y.e.e.b */
/* compiled from: ObservableAutoConnect */
public final class C12299b<T> extends Observable<T> {

    /* renamed from: U */
    final int f28387U;

    /* renamed from: V */
    final Consumer<? super Disposable> f28388V;

    /* renamed from: W */
    final AtomicInteger f28389W = new AtomicInteger();

    /* renamed from: c */
    final C12557a<? extends T> f28390c;

    public C12299b(C12557a<? extends T> aVar, int i, Consumer<? super Disposable> consumer) {
        this.f28390c = aVar;
        this.f28387U = i;
        this.f28388V = consumer;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28390c.mo30162a(qVar);
        if (this.f28389W.incrementAndGet() == this.f28387U) {
            this.f28390c.mo30498g(this.f28388V);
        }
    }
}
