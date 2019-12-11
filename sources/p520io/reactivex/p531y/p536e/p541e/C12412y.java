package p520io.reactivex.p531y.p536e.p541e;

import java.util.Iterator;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p535d.C12054c;

/* renamed from: io.reactivex.y.e.e.y */
/* compiled from: ObservableFromIterable */
public final class C12412y<T> extends Observable<T> {

    /* renamed from: c */
    final Iterable<? extends T> f28747c;

    /* renamed from: io.reactivex.y.e.e.y$a */
    /* compiled from: ObservableFromIterable */
    static final class C12413a<T> extends C12054c<T> {

        /* renamed from: U */
        final Iterator<? extends T> f28748U;

        /* renamed from: V */
        volatile boolean f28749V;

        /* renamed from: W */
        boolean f28750W;

        /* renamed from: X */
        boolean f28751X;

        /* renamed from: Y */
        boolean f28752Y;

        /* renamed from: c */
        final C11968q<? super T> f28753c;

        C12413a(C11968q<? super T> qVar, Iterator<? extends T> it) {
            this.f28753c = qVar;
            this.f28748U = it;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30566a() {
            while (!isDisposed()) {
                try {
                    Object next = this.f28748U.next();
                    C12036b.m38663a(next, "The iterator returned a null value");
                    this.f28753c.onNext(next);
                    if (!isDisposed()) {
                        try {
                            if (!this.f28748U.hasNext()) {
                                if (!isDisposed()) {
                                    this.f28753c.onComplete();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C12003b.m38614b(th);
                            this.f28753c.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12003b.m38614b(th2);
                    this.f28753c.onError(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.f28751X = true;
        }

        public void dispose() {
            this.f28749V = true;
        }

        public boolean isDisposed() {
            return this.f28749V;
        }

        public boolean isEmpty() {
            return this.f28751X;
        }

        public T poll() {
            if (this.f28751X) {
                return null;
            }
            if (!this.f28752Y) {
                this.f28752Y = true;
            } else if (!this.f28748U.hasNext()) {
                this.f28751X = true;
                return null;
            }
            T next = this.f28748U.next();
            C12036b.m38663a(next, "The iterator returned a null value");
            return next;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f28750W = true;
            return 1;
        }
    }

    public C12412y(Iterable<? extends T> iterable) {
        this.f28747c = iterable;
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        try {
            Iterator it = this.f28747c.iterator();
            try {
                if (!it.hasNext()) {
                    C12011d.m38628a(qVar);
                    return;
                }
                C12413a aVar = new C12413a(qVar, it);
                qVar.onSubscribe(aVar);
                if (!aVar.f28750W) {
                    aVar.mo30566a();
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C12011d.m38631a(th, qVar);
            }
        } catch (Throwable th2) {
            C12003b.m38614b(th2);
            C12011d.m38631a(th2, qVar);
        }
    }
}
