package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11958l;
import p520io.reactivex.C11968q;
import p520io.reactivex.Maybe;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12041d;

/* renamed from: io.reactivex.y.e.e.n */
/* compiled from: ObservableElementAtMaybe */
public final class C12352n<T> extends Maybe<T> implements C12041d<T> {

    /* renamed from: U */
    final long f28558U;

    /* renamed from: c */
    final ObservableSource<T> f28559c;

    /* renamed from: io.reactivex.y.e.e.n$a */
    /* compiled from: ObservableElementAtMaybe */
    static final class C12353a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final long f28560U;

        /* renamed from: V */
        Disposable f28561V;

        /* renamed from: W */
        long f28562W;

        /* renamed from: X */
        boolean f28563X;

        /* renamed from: c */
        final C11958l<? super T> f28564c;

        C12353a(C11958l<? super T> lVar, long j) {
            this.f28564c = lVar;
            this.f28560U = j;
        }

        public void dispose() {
            this.f28561V.dispose();
        }

        public boolean isDisposed() {
            return this.f28561V.isDisposed();
        }

        public void onComplete() {
            if (!this.f28563X) {
                this.f28563X = true;
                this.f28564c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28563X) {
                C11915a.m38466b(th);
                return;
            }
            this.f28563X = true;
            this.f28564c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28563X) {
                long j = this.f28562W;
                if (j == this.f28560U) {
                    this.f28563X = true;
                    this.f28561V.dispose();
                    this.f28564c.onSuccess(t);
                    return;
                }
                this.f28562W = j + 1;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28561V, disposable)) {
                this.f28561V = disposable;
                this.f28564c.onSubscribe(this);
            }
        }
    }

    public C12352n(ObservableSource<T> observableSource, long j) {
        this.f28559c = observableSource;
        this.f28558U = j;
    }

    /* renamed from: a */
    public Observable<T> mo30364a() {
        C12349m mVar = new C12349m(this.f28559c, this.f28558U, null, false);
        return C11915a.m38448a((Observable<T>) mVar);
    }

    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28559c.mo30162a(new C12353a(lVar, this.f28558U));
    }
}
