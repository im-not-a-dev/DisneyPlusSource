package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.a.e */
/* compiled from: CompletableDoFinally */
public final class C12071e extends Completable {

    /* renamed from: U */
    final C11945a f27796U;

    /* renamed from: c */
    final CompletableSource f27797c;

    /* renamed from: io.reactivex.y.e.a.e$a */
    /* compiled from: CompletableDoFinally */
    static final class C12072a extends AtomicInteger implements CompletableObserver, Disposable {

        /* renamed from: U */
        final C11945a f27798U;

        /* renamed from: V */
        Disposable f27799V;

        /* renamed from: c */
        final CompletableObserver f27800c;

        C12072a(CompletableObserver completableObserver, C11945a aVar) {
            this.f27800c = completableObserver;
            this.f27798U = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30381a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f27798U.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    C11915a.m38466b(th);
                }
            }
        }

        public void dispose() {
            this.f27799V.dispose();
            mo30381a();
        }

        public boolean isDisposed() {
            return this.f27799V.isDisposed();
        }

        public void onComplete() {
            this.f27800c.onComplete();
            mo30381a();
        }

        public void onError(Throwable th) {
            this.f27800c.onError(th);
            mo30381a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f27799V, disposable)) {
                this.f27799V = disposable;
                this.f27800c.onSubscribe(this);
            }
        }
    }

    public C12071e(CompletableSource completableSource, C11945a aVar) {
        this.f27797c = completableSource;
        this.f27796U = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27797c.subscribe(new C12072a(completableObserver, this.f27796U));
    }
}
