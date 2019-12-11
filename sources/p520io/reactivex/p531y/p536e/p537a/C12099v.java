package p520io.reactivex.p531y.p536e.p537a;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.a.v */
/* compiled from: CompletableResumeNext */
public final class C12099v extends Completable {

    /* renamed from: U */
    final Function<? super Throwable, ? extends CompletableSource> f27856U;

    /* renamed from: c */
    final CompletableSource f27857c;

    /* renamed from: io.reactivex.y.e.a.v$a */
    /* compiled from: CompletableResumeNext */
    static final class C12100a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* renamed from: U */
        final Function<? super Throwable, ? extends CompletableSource> f27858U;

        /* renamed from: V */
        boolean f27859V;

        /* renamed from: c */
        final CompletableObserver f27860c;

        C12100a(CompletableObserver completableObserver, Function<? super Throwable, ? extends CompletableSource> function) {
            this.f27860c = completableObserver;
            this.f27858U = function;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            this.f27860c.onComplete();
        }

        public void onError(Throwable th) {
            if (this.f27859V) {
                this.f27860c.onError(th);
                return;
            }
            this.f27859V = true;
            try {
                Object apply = this.f27858U.apply(th);
                C12036b.m38663a(apply, "The errorMapper returned a null CompletableSource");
                ((CompletableSource) apply).subscribe(this);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                this.f27860c.onError(new C11998a(th, th2));
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }
    }

    public C12099v(CompletableSource completableSource, Function<? super Throwable, ? extends CompletableSource> function) {
        this.f27857c = completableSource;
        this.f27856U = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C12100a aVar = new C12100a(completableObserver, this.f27856U);
        completableObserver.onSubscribe(aVar);
        this.f27857c.subscribe(aVar);
    }
}
