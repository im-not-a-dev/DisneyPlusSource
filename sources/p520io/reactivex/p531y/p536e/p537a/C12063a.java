package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.a.a */
/* compiled from: CompletableAndThenCompletable */
public final class C12063a extends Completable {

    /* renamed from: U */
    final CompletableSource f27783U;

    /* renamed from: c */
    final CompletableSource f27784c;

    /* renamed from: io.reactivex.y.e.a.a$a */
    /* compiled from: CompletableAndThenCompletable */
    static final class C12064a implements CompletableObserver {

        /* renamed from: U */
        final CompletableObserver f27785U;

        /* renamed from: c */
        final AtomicReference<Disposable> f27786c;

        public C12064a(AtomicReference<Disposable> atomicReference, CompletableObserver completableObserver) {
            this.f27786c = atomicReference;
            this.f27785U = completableObserver;
        }

        public void onComplete() {
            this.f27785U.onComplete();
        }

        public void onError(Throwable th) {
            this.f27785U.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a(this.f27786c, disposable);
        }
    }

    /* renamed from: io.reactivex.y.e.a.a$b */
    /* compiled from: CompletableAndThenCompletable */
    static final class C12065b extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: U */
        final CompletableSource f27787U;

        /* renamed from: c */
        final CompletableObserver f27788c;

        C12065b(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f27788c = completableObserver;
            this.f27787U = completableSource;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f27787U.subscribe(new C12064a(this, this.f27788c));
        }

        public void onError(Throwable th) {
            this.f27788c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f27788c.onSubscribe(this);
            }
        }
    }

    public C12063a(CompletableSource completableSource, CompletableSource completableSource2) {
        this.f27784c = completableSource;
        this.f27783U = completableSource2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27784c.subscribe(new C12065b(completableObserver, this.f27783U));
    }
}
