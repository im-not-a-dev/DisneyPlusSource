package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.Callable;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.e.c */
/* compiled from: ObservableCollect */
public final class C12302c<T, U> extends C12294a<T, U> {

    /* renamed from: U */
    final Callable<? extends U> f28393U;

    /* renamed from: V */
    final C11946b<? super U, ? super T> f28394V;

    /* renamed from: io.reactivex.y.e.e.c$a */
    /* compiled from: ObservableCollect */
    static final class C12303a<T, U> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final C11946b<? super U, ? super T> f28395U;

        /* renamed from: V */
        final U f28396V;

        /* renamed from: W */
        Disposable f28397W;

        /* renamed from: X */
        boolean f28398X;

        /* renamed from: c */
        final C11968q<? super U> f28399c;

        C12303a(C11968q<? super U> qVar, U u, C11946b<? super U, ? super T> bVar) {
            this.f28399c = qVar;
            this.f28395U = bVar;
            this.f28396V = u;
        }

        public void dispose() {
            this.f28397W.dispose();
        }

        public boolean isDisposed() {
            return this.f28397W.isDisposed();
        }

        public void onComplete() {
            if (!this.f28398X) {
                this.f28398X = true;
                this.f28399c.onNext(this.f28396V);
                this.f28399c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28398X) {
                C11915a.m38466b(th);
                return;
            }
            this.f28398X = true;
            this.f28399c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28398X) {
                try {
                    this.f28395U.accept(this.f28396V, t);
                } catch (Throwable th) {
                    this.f28397W.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28397W, disposable)) {
                this.f28397W = disposable;
                this.f28399c.onSubscribe(this);
            }
        }
    }

    public C12302c(ObservableSource<T> observableSource, Callable<? extends U> callable, C11946b<? super U, ? super T> bVar) {
        super(observableSource);
        this.f28393U = callable;
        this.f28394V = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super U> qVar) {
        try {
            Object call = this.f28393U.call();
            C12036b.m38663a(call, "The initialSupplier returned a null value");
            this.f28379c.mo30162a(new C12303a(qVar, call, this.f28394V));
        } catch (Throwable th) {
            C12011d.m38631a(th, qVar);
        }
    }
}
