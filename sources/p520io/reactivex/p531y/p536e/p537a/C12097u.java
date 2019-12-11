package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.a.u */
/* compiled from: CompletablePeek */
public final class C12097u extends Completable {

    /* renamed from: U */
    final Consumer<? super Disposable> f27846U;

    /* renamed from: V */
    final Consumer<? super Throwable> f27847V;

    /* renamed from: W */
    final C11945a f27848W;

    /* renamed from: X */
    final C11945a f27849X;

    /* renamed from: Y */
    final C11945a f27850Y;

    /* renamed from: Z */
    final C11945a f27851Z;

    /* renamed from: c */
    final CompletableSource f27852c;

    /* renamed from: io.reactivex.y.e.a.u$a */
    /* compiled from: CompletablePeek */
    final class C12098a implements CompletableObserver, Disposable {

        /* renamed from: U */
        Disposable f27853U;

        /* renamed from: c */
        final CompletableObserver f27855c;

        C12098a(CompletableObserver completableObserver) {
            this.f27855c = completableObserver;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30387a() {
            try {
                C12097u.this.f27850Y.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
        }

        public void dispose() {
            try {
                C12097u.this.f27851Z.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
            this.f27853U.dispose();
        }

        public boolean isDisposed() {
            return this.f27853U.isDisposed();
        }

        public void onComplete() {
            if (this.f27853U != C12010c.DISPOSED) {
                try {
                    C12097u.this.f27848W.run();
                    C12097u.this.f27849X.run();
                    this.f27855c.onComplete();
                    mo30387a();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    this.f27855c.onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f27853U == C12010c.DISPOSED) {
                C11915a.m38466b(th);
                return;
            }
            try {
                C12097u.this.f27847V.accept(th);
                C12097u.this.f27849X.run();
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                th = new C11998a(th, th2);
            }
            this.f27855c.onError(th);
            mo30387a();
        }

        public void onSubscribe(Disposable disposable) {
            try {
                C12097u.this.f27846U.accept(disposable);
                if (C12010c.m38620a(this.f27853U, disposable)) {
                    this.f27853U = disposable;
                    this.f27855c.onSubscribe(this);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                disposable.dispose();
                this.f27853U = C12010c.DISPOSED;
                C12011d.m38629a(th, this.f27855c);
            }
        }
    }

    public C12097u(CompletableSource completableSource, Consumer<? super Disposable> consumer, Consumer<? super Throwable> consumer2, C11945a aVar, C11945a aVar2, C11945a aVar3, C11945a aVar4) {
        this.f27852c = completableSource;
        this.f27846U = consumer;
        this.f27847V = consumer2;
        this.f27848W = aVar;
        this.f27849X = aVar2;
        this.f27850Y = aVar3;
        this.f27851Z = aVar4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        this.f27852c.subscribe(new C12098a(completableObserver));
    }
}
