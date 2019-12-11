package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.a.t */
/* compiled from: CompletableOnErrorComplete */
public final class C12095t extends Completable {

    /* renamed from: U */
    final C11952h<? super Throwable> f27842U;

    /* renamed from: c */
    final CompletableSource f27843c;

    /* renamed from: io.reactivex.y.e.a.t$a */
    /* compiled from: CompletableOnErrorComplete */
    final class C12096a implements CompletableObserver {

        /* renamed from: c */
        private final CompletableObserver f27845c;

        C12096a(CompletableObserver completableObserver) {
            this.f27845c = completableObserver;
        }

        public void onComplete() {
            this.f27845c.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (C12095t.this.f27842U.test(th)) {
                    this.f27845c.onComplete();
                } else {
                    this.f27845c.onError(th);
                }
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                this.f27845c.onError(new C11998a(th, th2));
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f27845c.onSubscribe(disposable);
        }
    }

    public C12095t(CompletableSource completableSource, C11952h<? super Throwable> hVar) {
        this.f27843c = completableSource;
        this.f27842U = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27843c.subscribe(new C12096a(completableObserver));
    }
}
