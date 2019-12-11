package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.e.w0 */
/* compiled from: ObservableTake */
public final class C12407w0<T> extends C12294a<T, T> {

    /* renamed from: U */
    final long f28736U;

    /* renamed from: io.reactivex.y.e.e.w0$a */
    /* compiled from: ObservableTake */
    static final class C12408a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        boolean f28737U;

        /* renamed from: V */
        Disposable f28738V;

        /* renamed from: W */
        long f28739W;

        /* renamed from: c */
        final C11968q<? super T> f28740c;

        C12408a(C11968q<? super T> qVar, long j) {
            this.f28740c = qVar;
            this.f28739W = j;
        }

        public void dispose() {
            this.f28738V.dispose();
        }

        public boolean isDisposed() {
            return this.f28738V.isDisposed();
        }

        public void onComplete() {
            if (!this.f28737U) {
                this.f28737U = true;
                this.f28738V.dispose();
                this.f28740c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28737U) {
                C11915a.m38466b(th);
                return;
            }
            this.f28737U = true;
            this.f28738V.dispose();
            this.f28740c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28737U) {
                long j = this.f28739W;
                this.f28739W = j - 1;
                if (j > 0) {
                    boolean z = this.f28739W == 0;
                    this.f28740c.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28738V, disposable)) {
                this.f28738V = disposable;
                if (this.f28739W == 0) {
                    this.f28737U = true;
                    disposable.dispose();
                    C12011d.m38628a(this.f28740c);
                    return;
                }
                this.f28740c.onSubscribe(this);
            }
        }
    }

    public C12407w0(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f28736U = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28379c.mo30162a(new C12408a(qVar, this.f28736U));
    }
}
