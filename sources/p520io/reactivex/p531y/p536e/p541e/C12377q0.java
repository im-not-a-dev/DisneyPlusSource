package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.e.q0 */
/* compiled from: ObservableScan */
public final class C12377q0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final C11947c<T, T, T> f28619U;

    /* renamed from: io.reactivex.y.e.e.q0$a */
    /* compiled from: ObservableScan */
    static final class C12378a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final C11947c<T, T, T> f28620U;

        /* renamed from: V */
        Disposable f28621V;

        /* renamed from: W */
        T f28622W;

        /* renamed from: X */
        boolean f28623X;

        /* renamed from: c */
        final C11968q<? super T> f28624c;

        C12378a(C11968q<? super T> qVar, C11947c<T, T, T> cVar) {
            this.f28624c = qVar;
            this.f28620U = cVar;
        }

        public void dispose() {
            this.f28621V.dispose();
        }

        public boolean isDisposed() {
            return this.f28621V.isDisposed();
        }

        public void onComplete() {
            if (!this.f28623X) {
                this.f28623X = true;
                this.f28624c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28623X) {
                C11915a.m38466b(th);
                return;
            }
            this.f28623X = true;
            this.f28624c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28623X) {
                C11968q<? super T> qVar = this.f28624c;
                T t2 = this.f28622W;
                if (t2 == null) {
                    this.f28622W = t;
                    qVar.onNext(t);
                } else {
                    try {
                        T apply = this.f28620U.apply(t2, t);
                        C12036b.m38663a(apply, "The value returned by the accumulator is null");
                        this.f28622W = apply;
                        qVar.onNext(apply);
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        this.f28621V.dispose();
                        onError(th);
                    }
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28621V, disposable)) {
                this.f28621V = disposable;
                this.f28624c.onSubscribe(this);
            }
        }
    }

    public C12377q0(ObservableSource<T> observableSource, C11947c<T, T, T> cVar) {
        super(observableSource);
        this.f28619U = cVar;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12378a(qVar, this.f28619U));
    }
}
