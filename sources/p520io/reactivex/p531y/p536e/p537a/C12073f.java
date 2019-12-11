package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.a.f */
/* compiled from: CompletableDoOnEvent */
public final class C12073f extends Completable {

    /* renamed from: U */
    final Consumer<? super Throwable> f27801U;

    /* renamed from: c */
    final CompletableSource f27802c;

    /* renamed from: io.reactivex.y.e.a.f$a */
    /* compiled from: CompletableDoOnEvent */
    final class C12074a implements CompletableObserver {

        /* renamed from: c */
        private final CompletableObserver f27804c;

        C12074a(CompletableObserver completableObserver) {
            this.f27804c = completableObserver;
        }

        public void onComplete() {
            try {
                C12073f.this.f27801U.accept(null);
                this.f27804c.onComplete();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f27804c.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                C12073f.this.f27801U.accept(th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                th = new C11998a(th, th2);
            }
            this.f27804c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f27804c.onSubscribe(disposable);
        }
    }

    public C12073f(CompletableSource completableSource, Consumer<? super Throwable> consumer) {
        this.f27802c = completableSource;
        this.f27801U = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27802c.subscribe(new C12074a(completableObserver));
    }
}
