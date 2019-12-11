package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.t0 */
/* compiled from: ObservableSkipWhile */
public final class C12391t0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final C11952h<? super T> f28677U;

    /* renamed from: io.reactivex.y.e.e.t0$a */
    /* compiled from: ObservableSkipWhile */
    static final class C12392a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final C11952h<? super T> f28678U;

        /* renamed from: V */
        Disposable f28679V;

        /* renamed from: W */
        boolean f28680W;

        /* renamed from: c */
        final C11968q<? super T> f28681c;

        C12392a(C11968q<? super T> qVar, C11952h<? super T> hVar) {
            this.f28681c = qVar;
            this.f28678U = hVar;
        }

        public void dispose() {
            this.f28679V.dispose();
        }

        public boolean isDisposed() {
            return this.f28679V.isDisposed();
        }

        public void onComplete() {
            this.f28681c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28681c.onError(th);
        }

        public void onNext(T t) {
            if (this.f28680W) {
                this.f28681c.onNext(t);
            } else {
                try {
                    if (!this.f28678U.test(t)) {
                        this.f28680W = true;
                        this.f28681c.onNext(t);
                    }
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f28679V.dispose();
                    this.f28681c.onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28679V, disposable)) {
                this.f28679V = disposable;
                this.f28681c.onSubscribe(this);
            }
        }
    }

    public C12391t0(ObservableSource<T> observableSource, C11952h<? super T> hVar) {
        super(observableSource);
        this.f28677U = hVar;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12392a(qVar, this.f28677U));
    }
}
