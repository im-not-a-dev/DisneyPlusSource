package p520io.reactivex.p531y.p536e.p541e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.e.z0 */
/* compiled from: ObservableToList */
public final class C12417z0<T, U extends Collection<? super T>> extends C12294a<T, U> {

    /* renamed from: U */
    final Callable<U> f28759U;

    /* renamed from: io.reactivex.y.e.e.z0$a */
    /* compiled from: ObservableToList */
    static final class C12418a<T, U extends Collection<? super T>> implements C11968q<T>, Disposable {

        /* renamed from: U */
        Disposable f28760U;

        /* renamed from: V */
        U f28761V;

        /* renamed from: c */
        final C11968q<? super U> f28762c;

        C12418a(C11968q<? super U> qVar, U u) {
            this.f28762c = qVar;
            this.f28761V = u;
        }

        public void dispose() {
            this.f28760U.dispose();
        }

        public boolean isDisposed() {
            return this.f28760U.isDisposed();
        }

        public void onComplete() {
            U u = this.f28761V;
            this.f28761V = null;
            this.f28762c.onNext(u);
            this.f28762c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28761V = null;
            this.f28762c.onError(th);
        }

        public void onNext(T t) {
            this.f28761V.add(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28760U, disposable)) {
                this.f28760U = disposable;
                this.f28762c.onSubscribe(this);
            }
        }
    }

    public C12417z0(ObservableSource<T> observableSource, Callable<U> callable) {
        super(observableSource);
        this.f28759U = callable;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super U> qVar) {
        try {
            Object call = this.f28759U.call();
            C12036b.m38663a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f28379c.mo30162a(new C12418a(qVar, (Collection) call));
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38631a(th, qVar);
        }
    }
}
