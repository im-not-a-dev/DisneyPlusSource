package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12014g;

/* renamed from: io.reactivex.y.e.e.i0 */
/* compiled from: ObservableOnErrorNext */
public final class C12333i0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final Function<? super Throwable, ? extends ObservableSource<? extends T>> f28497U;

    /* renamed from: V */
    final boolean f28498V;

    /* renamed from: io.reactivex.y.e.e.i0$a */
    /* compiled from: ObservableOnErrorNext */
    static final class C12334a<T> implements C11968q<T> {

        /* renamed from: U */
        final Function<? super Throwable, ? extends ObservableSource<? extends T>> f28499U;

        /* renamed from: V */
        final boolean f28500V;

        /* renamed from: W */
        final C12014g f28501W = new C12014g();

        /* renamed from: X */
        boolean f28502X;

        /* renamed from: Y */
        boolean f28503Y;

        /* renamed from: c */
        final C11968q<? super T> f28504c;

        C12334a(C11968q<? super T> qVar, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
            this.f28504c = qVar;
            this.f28499U = function;
            this.f28500V = z;
        }

        public void onComplete() {
            if (!this.f28503Y) {
                this.f28503Y = true;
                this.f28502X = true;
                this.f28504c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f28502X) {
                this.f28502X = true;
                if (!this.f28500V || (th instanceof Exception)) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.f28499U.apply(th);
                        if (observableSource == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f28504c.onError(nullPointerException);
                            return;
                        }
                        observableSource.mo30162a(this);
                    } catch (Throwable th2) {
                        C12003b.m38614b(th2);
                        this.f28504c.onError(new C11998a(th, th2));
                    }
                } else {
                    this.f28504c.onError(th);
                }
            } else if (this.f28503Y) {
                C11915a.m38466b(th);
            } else {
                this.f28504c.onError(th);
            }
        }

        public void onNext(T t) {
            if (!this.f28503Y) {
                this.f28504c.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f28501W.mo30345a(disposable);
        }
    }

    public C12333i0(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.f28497U = function;
        this.f28498V = z;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C12334a aVar = new C12334a(qVar, this.f28497U, this.f28498V);
        qVar.onSubscribe(aVar.f28501W);
        this.f28379c.mo30162a(aVar);
    }
}
