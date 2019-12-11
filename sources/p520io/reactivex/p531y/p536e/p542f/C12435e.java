package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p535d.C12062k;

/* renamed from: io.reactivex.y.e.f.e */
/* compiled from: SingleDelayWithCompletable */
public final class C12435e<T> extends Single<T> {

    /* renamed from: U */
    final CompletableSource f28807U;

    /* renamed from: c */
    final SingleSource<T> f28808c;

    /* renamed from: io.reactivex.y.e.f.e$a */
    /* compiled from: SingleDelayWithCompletable */
    static final class C12436a<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: U */
        final SingleSource<T> f28809U;

        /* renamed from: c */
        final C11987u<? super T> f28810c;

        C12436a(C11987u<? super T> uVar, SingleSource<T> singleSource) {
            this.f28810c = uVar;
            this.f28809U = singleSource;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f28809U.mo30216a(new C12062k(this, this.f28810c));
        }

        public void onError(Throwable th) {
            this.f28810c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28810c.onSubscribe(this);
            }
        }
    }

    public C12435e(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.f28808c = singleSource;
        this.f28807U = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28807U.subscribe(new C12436a(uVar, this.f28808c));
    }
}
