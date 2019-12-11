package p520io.reactivex.p531y.p536e.p541e;

import java.util.Collection;
import java.util.concurrent.Callable;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12015a;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12041d;

/* renamed from: io.reactivex.y.e.e.a1 */
/* compiled from: ObservableToListSingle */
public final class C12297a1<T, U extends Collection<? super T>> extends Single<U> implements C12041d<U> {

    /* renamed from: U */
    final Callable<U> f28382U;

    /* renamed from: c */
    final ObservableSource<T> f28383c;

    /* renamed from: io.reactivex.y.e.e.a1$a */
    /* compiled from: ObservableToListSingle */
    static final class C12298a<T, U extends Collection<? super T>> implements C11968q<T>, Disposable {

        /* renamed from: U */
        U f28384U;

        /* renamed from: V */
        Disposable f28385V;

        /* renamed from: c */
        final C11987u<? super U> f28386c;

        C12298a(C11987u<? super U> uVar, U u) {
            this.f28386c = uVar;
            this.f28384U = u;
        }

        public void dispose() {
            this.f28385V.dispose();
        }

        public boolean isDisposed() {
            return this.f28385V.isDisposed();
        }

        public void onComplete() {
            U u = this.f28384U;
            this.f28384U = null;
            this.f28386c.onSuccess(u);
        }

        public void onError(Throwable th) {
            this.f28384U = null;
            this.f28386c.onError(th);
        }

        public void onNext(T t) {
            this.f28384U.add(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28385V, disposable)) {
                this.f28385V = disposable;
                this.f28386c.onSubscribe(this);
            }
        }
    }

    public C12297a1(ObservableSource<T> observableSource, int i) {
        this.f28383c = observableSource;
        this.f28382U = C12015a.m38646a(i);
    }

    /* renamed from: a */
    public Observable<U> mo30364a() {
        return C11915a.m38448a((Observable<T>) new C12417z0<T>(this.f28383c, this.f28382U));
    }

    /* renamed from: b */
    public void mo17771b(C11987u<? super U> uVar) {
        try {
            Object call = this.f28382U.call();
            C12036b.m38663a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f28383c.mo30162a(new C12298a(uVar, (Collection) call));
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38632a(th, uVar);
        }
    }
}
