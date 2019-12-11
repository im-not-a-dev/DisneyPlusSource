package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.Callable;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12041d;

/* renamed from: io.reactivex.y.e.e.d */
/* compiled from: ObservableCollectSingle */
public final class C12306d<T, U> extends Single<U> implements C12041d<U> {

    /* renamed from: U */
    final Callable<? extends U> f28403U;

    /* renamed from: V */
    final C11946b<? super U, ? super T> f28404V;

    /* renamed from: c */
    final ObservableSource<T> f28405c;

    /* renamed from: io.reactivex.y.e.e.d$a */
    /* compiled from: ObservableCollectSingle */
    static final class C12307a<T, U> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final C11946b<? super U, ? super T> f28406U;

        /* renamed from: V */
        final U f28407V;

        /* renamed from: W */
        Disposable f28408W;

        /* renamed from: X */
        boolean f28409X;

        /* renamed from: c */
        final C11987u<? super U> f28410c;

        C12307a(C11987u<? super U> uVar, U u, C11946b<? super U, ? super T> bVar) {
            this.f28410c = uVar;
            this.f28406U = bVar;
            this.f28407V = u;
        }

        public void dispose() {
            this.f28408W.dispose();
        }

        public boolean isDisposed() {
            return this.f28408W.isDisposed();
        }

        public void onComplete() {
            if (!this.f28409X) {
                this.f28409X = true;
                this.f28410c.onSuccess(this.f28407V);
            }
        }

        public void onError(Throwable th) {
            if (this.f28409X) {
                C11915a.m38466b(th);
                return;
            }
            this.f28409X = true;
            this.f28410c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28409X) {
                try {
                    this.f28406U.accept(this.f28407V, t);
                } catch (Throwable th) {
                    this.f28408W.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28408W, disposable)) {
                this.f28408W = disposable;
                this.f28410c.onSubscribe(this);
            }
        }
    }

    public C12306d(ObservableSource<T> observableSource, Callable<? extends U> callable, C11946b<? super U, ? super T> bVar) {
        this.f28405c = observableSource;
        this.f28403U = callable;
        this.f28404V = bVar;
    }

    /* renamed from: a */
    public Observable<U> mo30364a() {
        return C11915a.m38448a((Observable<T>) new C12302c<T>(this.f28405c, this.f28403U, this.f28404V));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super U> uVar) {
        try {
            Object call = this.f28403U.call();
            C12036b.m38663a(call, "The initialSupplier returned a null value");
            this.f28405c.mo30162a(new C12307a(uVar, call, this.f28404V));
        } catch (Throwable th) {
            C12011d.m38632a(th, uVar);
        }
    }
}
