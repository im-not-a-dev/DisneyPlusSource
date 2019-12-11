package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.k */
/* compiled from: ObservableDoOnEach */
public final class C12339k<T> extends C12294a<T, T> {

    /* renamed from: U */
    final Consumer<? super T> f28515U;

    /* renamed from: V */
    final Consumer<? super Throwable> f28516V;

    /* renamed from: W */
    final C11945a f28517W;

    /* renamed from: X */
    final C11945a f28518X;

    /* renamed from: io.reactivex.y.e.e.k$a */
    /* compiled from: ObservableDoOnEach */
    static final class C12340a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final Consumer<? super T> f28519U;

        /* renamed from: V */
        final Consumer<? super Throwable> f28520V;

        /* renamed from: W */
        final C11945a f28521W;

        /* renamed from: X */
        final C11945a f28522X;

        /* renamed from: Y */
        Disposable f28523Y;

        /* renamed from: Z */
        boolean f28524Z;

        /* renamed from: c */
        final C11968q<? super T> f28525c;

        C12340a(C11968q<? super T> qVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2) {
            this.f28525c = qVar;
            this.f28519U = consumer;
            this.f28520V = consumer2;
            this.f28521W = aVar;
            this.f28522X = aVar2;
        }

        public void dispose() {
            this.f28523Y.dispose();
        }

        public boolean isDisposed() {
            return this.f28523Y.isDisposed();
        }

        public void onComplete() {
            if (!this.f28524Z) {
                try {
                    this.f28521W.run();
                    this.f28524Z = true;
                    this.f28525c.onComplete();
                    try {
                        this.f28522X.run();
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        C11915a.m38466b(th);
                    }
                } catch (Throwable th2) {
                    C12003b.m38614b(th2);
                    onError(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f28524Z) {
                C11915a.m38466b(th);
                return;
            }
            this.f28524Z = true;
            try {
                this.f28520V.accept(th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                th = new C11998a(th, th2);
            }
            this.f28525c.onError(th);
            try {
                this.f28522X.run();
            } catch (Throwable th3) {
                C12003b.m38614b(th3);
                C11915a.m38466b(th3);
            }
        }

        public void onNext(T t) {
            if (!this.f28524Z) {
                try {
                    this.f28519U.accept(t);
                    this.f28525c.onNext(t);
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f28523Y.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28523Y, disposable)) {
                this.f28523Y = disposable;
                this.f28525c.onSubscribe(this);
            }
        }
    }

    public C12339k(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2) {
        super(observableSource);
        this.f28515U = consumer;
        this.f28516V = consumer2;
        this.f28517W = aVar;
        this.f28518X = aVar2;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        ObservableSource<T> observableSource = this.f28379c;
        C12340a aVar = new C12340a(qVar, this.f28515U, this.f28516V, this.f28517W, this.f28518X);
        observableSource.mo30162a(aVar);
    }
}
