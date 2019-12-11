package p520io.reactivex.p531y.p536e.p537a;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p532a.C12014g;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.a.b */
/* compiled from: CompletableConcatIterable */
public final class C12066b extends Completable {

    /* renamed from: c */
    final Iterable<? extends CompletableSource> f27789c;

    /* renamed from: io.reactivex.y.e.a.b$a */
    /* compiled from: CompletableConcatIterable */
    static final class C12067a extends AtomicInteger implements CompletableObserver {

        /* renamed from: U */
        final Iterator<? extends CompletableSource> f27790U;

        /* renamed from: V */
        final C12014g f27791V = new C12014g();

        /* renamed from: c */
        final CompletableObserver f27792c;

        C12067a(CompletableObserver completableObserver, Iterator<? extends CompletableSource> it) {
            this.f27792c = completableObserver;
            this.f27790U = it;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30377a() {
            if (!this.f27791V.isDisposed() && getAndIncrement() == 0) {
                Iterator<? extends CompletableSource> it = this.f27790U;
                while (!this.f27791V.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            this.f27792c.onComplete();
                            return;
                        }
                        try {
                            Object next = it.next();
                            C12036b.m38663a(next, "The CompletableSource returned is null");
                            ((CompletableSource) next).subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            C12003b.m38614b(th);
                            this.f27792c.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        C12003b.m38614b(th2);
                        this.f27792c.onError(th2);
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            mo30377a();
        }

        public void onError(Throwable th) {
            this.f27792c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f27791V.mo30345a(disposable);
        }
    }

    public C12066b(Iterable<? extends CompletableSource> iterable) {
        this.f27789c = iterable;
    }

    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        try {
            Iterator it = this.f27789c.iterator();
            C12036b.m38663a(it, "The iterator returned is null");
            C12067a aVar = new C12067a(completableObserver, it);
            completableObserver.onSubscribe(aVar.f27791V);
            aVar.mo30377a();
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38629a(th, completableObserver);
        }
    }
}
