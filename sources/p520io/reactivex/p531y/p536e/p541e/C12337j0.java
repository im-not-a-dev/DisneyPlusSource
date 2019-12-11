package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.j0 */
/* compiled from: ObservableOnErrorReturn */
public final class C12337j0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final Function<? super Throwable, ? extends T> f28511U;

    /* renamed from: io.reactivex.y.e.e.j0$a */
    /* compiled from: ObservableOnErrorReturn */
    static final class C12338a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final Function<? super Throwable, ? extends T> f28512U;

        /* renamed from: V */
        Disposable f28513V;

        /* renamed from: c */
        final C11968q<? super T> f28514c;

        C12338a(C11968q<? super T> qVar, Function<? super Throwable, ? extends T> function) {
            this.f28514c = qVar;
            this.f28512U = function;
        }

        public void dispose() {
            this.f28513V.dispose();
        }

        public boolean isDisposed() {
            return this.f28513V.isDisposed();
        }

        public void onComplete() {
            this.f28514c.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f28512U.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f28514c.onError(nullPointerException);
                    return;
                }
                this.f28514c.onNext(apply);
                this.f28514c.onComplete();
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                this.f28514c.onError(new C11998a(th, th2));
            }
        }

        public void onNext(T t) {
            this.f28514c.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28513V, disposable)) {
                this.f28513V = disposable;
                this.f28514c.onSubscribe(this);
            }
        }
    }

    public C12337j0(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.f28511U = function;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12338a(qVar, this.f28511U));
    }
}
