package p520io.reactivex.p531y.p536e.p542f;

import java.util.Iterator;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.Observable;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12053b;

/* renamed from: io.reactivex.y.e.f.q */
/* compiled from: SingleFlatMapIterableObservable */
public final class C12471q<T, R> extends Observable<R> {

    /* renamed from: U */
    final Function<? super T, ? extends Iterable<? extends R>> f28878U;

    /* renamed from: c */
    final SingleSource<T> f28879c;

    /* renamed from: io.reactivex.y.e.f.q$a */
    /* compiled from: SingleFlatMapIterableObservable */
    static final class C12472a<T, R> extends C12053b<R> implements C11987u<T> {

        /* renamed from: U */
        final Function<? super T, ? extends Iterable<? extends R>> f28880U;

        /* renamed from: V */
        Disposable f28881V;

        /* renamed from: W */
        volatile Iterator<? extends R> f28882W;

        /* renamed from: X */
        volatile boolean f28883X;

        /* renamed from: Y */
        boolean f28884Y;

        /* renamed from: c */
        final C11968q<? super R> f28885c;

        C12472a(C11968q<? super R> qVar, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f28885c = qVar;
            this.f28880U = function;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f28884Y = true;
            return 2;
        }

        public void clear() {
            this.f28882W = null;
        }

        public void dispose() {
            this.f28883X = true;
            this.f28881V.dispose();
            this.f28881V = C12010c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f28883X;
        }

        public boolean isEmpty() {
            return this.f28882W == null;
        }

        public void onError(Throwable th) {
            this.f28881V = C12010c.DISPOSED;
            this.f28885c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28881V, disposable)) {
                this.f28881V = disposable;
                this.f28885c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            C11968q<? super R> qVar = this.f28885c;
            try {
                Iterator<? extends R> it = ((Iterable) this.f28880U.apply(t)).iterator();
                if (!it.hasNext()) {
                    qVar.onComplete();
                } else if (this.f28884Y) {
                    this.f28882W = it;
                    qVar.onNext(null);
                    qVar.onComplete();
                } else {
                    while (!this.f28883X) {
                        try {
                            qVar.onNext(it.next());
                            if (!this.f28883X) {
                                try {
                                    if (!it.hasNext()) {
                                        qVar.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C12003b.m38614b(th);
                                    qVar.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            C12003b.m38614b(th2);
                            qVar.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                C12003b.m38614b(th3);
                this.f28885c.onError(th3);
            }
        }

        public R poll() throws Exception {
            Iterator<? extends R> it = this.f28882W;
            if (it == null) {
                return null;
            }
            R next = it.next();
            C12036b.m38663a(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f28882W = null;
            }
            return next;
        }
    }

    public C12471q(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f28879c = singleSource;
        this.f28878U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super R> qVar) {
        this.f28879c.mo30216a(new C12472a(qVar, this.f28878U));
    }
}
