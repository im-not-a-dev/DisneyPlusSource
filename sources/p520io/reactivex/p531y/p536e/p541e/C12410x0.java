package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.x0 */
/* compiled from: ObservableTakeUntilPredicate */
public final class C12410x0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final C11952h<? super T> f28742U;

    /* renamed from: io.reactivex.y.e.e.x0$a */
    /* compiled from: ObservableTakeUntilPredicate */
    static final class C12411a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final C11952h<? super T> f28743U;

        /* renamed from: V */
        Disposable f28744V;

        /* renamed from: W */
        boolean f28745W;

        /* renamed from: c */
        final C11968q<? super T> f28746c;

        C12411a(C11968q<? super T> qVar, C11952h<? super T> hVar) {
            this.f28746c = qVar;
            this.f28743U = hVar;
        }

        public void dispose() {
            this.f28744V.dispose();
        }

        public boolean isDisposed() {
            return this.f28744V.isDisposed();
        }

        public void onComplete() {
            if (!this.f28745W) {
                this.f28745W = true;
                this.f28746c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f28745W) {
                this.f28745W = true;
                this.f28746c.onError(th);
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            if (!this.f28745W) {
                this.f28746c.onNext(t);
                try {
                    if (this.f28743U.test(t)) {
                        this.f28745W = true;
                        this.f28744V.dispose();
                        this.f28746c.onComplete();
                    }
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f28744V.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28744V, disposable)) {
                this.f28744V = disposable;
                this.f28746c.onSubscribe(this);
            }
        }
    }

    public C12410x0(ObservableSource<T> observableSource, C11952h<? super T> hVar) {
        super(observableSource);
        this.f28742U = hVar;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12411a(qVar, this.f28742U));
    }
}
