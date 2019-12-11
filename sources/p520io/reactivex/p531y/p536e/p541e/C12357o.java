package p520io.reactivex.p531y.p536e.p541e;

import java.util.NoSuchElementException;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12041d;

/* renamed from: io.reactivex.y.e.e.o */
/* compiled from: ObservableElementAtSingle */
public final class C12357o<T> extends Single<T> implements C12041d<T> {

    /* renamed from: U */
    final long f28580U;

    /* renamed from: V */
    final T f28581V;

    /* renamed from: c */
    final ObservableSource<T> f28582c;

    /* renamed from: io.reactivex.y.e.e.o$a */
    /* compiled from: ObservableElementAtSingle */
    static final class C12358a<T> implements C11968q<T>, Disposable {

        /* renamed from: U */
        final long f28583U;

        /* renamed from: V */
        final T f28584V;

        /* renamed from: W */
        Disposable f28585W;

        /* renamed from: X */
        long f28586X;

        /* renamed from: Y */
        boolean f28587Y;

        /* renamed from: c */
        final C11987u<? super T> f28588c;

        C12358a(C11987u<? super T> uVar, long j, T t) {
            this.f28588c = uVar;
            this.f28583U = j;
            this.f28584V = t;
        }

        public void dispose() {
            this.f28585W.dispose();
        }

        public boolean isDisposed() {
            return this.f28585W.isDisposed();
        }

        public void onComplete() {
            if (!this.f28587Y) {
                this.f28587Y = true;
                T t = this.f28584V;
                if (t != null) {
                    this.f28588c.onSuccess(t);
                } else {
                    this.f28588c.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f28587Y) {
                C11915a.m38466b(th);
                return;
            }
            this.f28587Y = true;
            this.f28588c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28587Y) {
                long j = this.f28586X;
                if (j == this.f28583U) {
                    this.f28587Y = true;
                    this.f28585W.dispose();
                    this.f28588c.onSuccess(t);
                    return;
                }
                this.f28586X = j + 1;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28585W, disposable)) {
                this.f28585W = disposable;
                this.f28588c.onSubscribe(this);
            }
        }
    }

    public C12357o(ObservableSource<T> observableSource, long j, T t) {
        this.f28582c = observableSource;
        this.f28580U = j;
        this.f28581V = t;
    }

    /* renamed from: a */
    public Observable<T> mo30364a() {
        C12349m mVar = new C12349m(this.f28582c, this.f28580U, this.f28581V, true);
        return C11915a.m38448a((Observable<T>) mVar);
    }

    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28582c.mo30162a(new C12358a(uVar, this.f28580U, this.f28581V));
    }
}
