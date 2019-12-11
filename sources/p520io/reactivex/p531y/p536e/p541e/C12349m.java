package p520io.reactivex.p531y.p536e.p541e;

import java.util.NoSuchElementException;
import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.e.m */
/* compiled from: ObservableElementAt */
public final class C12349m<T> extends C12294a<T, T> {

    /* renamed from: U */
    final long f28548U;

    /* renamed from: V */
    final T f28549V;

    /* renamed from: W */
    final boolean f28550W;

    /* renamed from: io.reactivex.y.e.e.m$a */
    /* compiled from: ObservableElementAt */
    static final class C12350a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final long f28551U;

        /* renamed from: V */
        final T f28552V;

        /* renamed from: W */
        final boolean f28553W;

        /* renamed from: X */
        Disposable f28554X;

        /* renamed from: Y */
        long f28555Y;

        /* renamed from: Z */
        boolean f28556Z;

        /* renamed from: c */
        final C11968q<? super T> f28557c;

        C12350a(C11968q<? super T> qVar, long j, T t, boolean z) {
            this.f28557c = qVar;
            this.f28551U = j;
            this.f28552V = t;
            this.f28553W = z;
        }

        public void dispose() {
            this.f28554X.dispose();
        }

        public boolean isDisposed() {
            return this.f28554X.isDisposed();
        }

        public void onComplete() {
            if (!this.f28556Z) {
                this.f28556Z = true;
                T t = this.f28552V;
                if (t != null || !this.f28553W) {
                    if (t != null) {
                        this.f28557c.onNext(t);
                    }
                    this.f28557c.onComplete();
                    return;
                }
                this.f28557c.onError(new NoSuchElementException());
            }
        }

        public void onError(Throwable th) {
            if (this.f28556Z) {
                C11915a.m38466b(th);
                return;
            }
            this.f28556Z = true;
            this.f28557c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28556Z) {
                long j = this.f28555Y;
                if (j == this.f28551U) {
                    this.f28556Z = true;
                    this.f28554X.dispose();
                    this.f28557c.onNext(t);
                    this.f28557c.onComplete();
                    return;
                }
                this.f28555Y = j + 1;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28554X, disposable)) {
                this.f28554X = disposable;
                this.f28557c.onSubscribe(this);
            }
        }
    }

    public C12349m(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.f28548U = j;
        this.f28549V = t;
        this.f28550W = z;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        ObservableSource<T> observableSource = this.f28379c;
        C12350a aVar = new C12350a(qVar, this.f28548U, this.f28549V, this.f28550W);
        observableSource.mo30162a(aVar);
    }
}
