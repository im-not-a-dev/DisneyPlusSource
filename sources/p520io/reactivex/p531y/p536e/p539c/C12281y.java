package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.c.y */
/* compiled from: MaybePeek */
public final class C12281y<T> extends C12221a<T, T> {

    /* renamed from: U */
    final Consumer<? super Disposable> f28347U;

    /* renamed from: V */
    final Consumer<? super T> f28348V;

    /* renamed from: W */
    final Consumer<? super Throwable> f28349W;

    /* renamed from: X */
    final C11945a f28350X;

    /* renamed from: Y */
    final C11945a f28351Y;

    /* renamed from: Z */
    final C11945a f28352Z;

    /* renamed from: io.reactivex.y.e.c.y$a */
    /* compiled from: MaybePeek */
    static final class C12282a<T> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final C12281y<T> f28353U;

        /* renamed from: V */
        Disposable f28354V;

        /* renamed from: c */
        final C11958l<? super T> f28355c;

        C12282a(C11958l<? super T> lVar, C12281y<T> yVar) {
            this.f28355c = lVar;
            this.f28353U = yVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30474a(Throwable th) {
            try {
                this.f28353U.f28349W.accept(th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                th = new C11998a(th, th2);
            }
            this.f28354V = C12010c.DISPOSED;
            this.f28355c.onError(th);
            mo30473a();
        }

        public void dispose() {
            try {
                this.f28353U.f28352Z.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
            this.f28354V.dispose();
            this.f28354V = C12010c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f28354V.isDisposed();
        }

        public void onComplete() {
            if (this.f28354V != C12010c.DISPOSED) {
                try {
                    this.f28353U.f28350X.run();
                    this.f28354V = C12010c.DISPOSED;
                    this.f28355c.onComplete();
                    mo30473a();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    mo30474a(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f28354V == C12010c.DISPOSED) {
                C11915a.m38466b(th);
            } else {
                mo30474a(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28354V, disposable)) {
                try {
                    this.f28353U.f28347U.accept(disposable);
                    this.f28354V = disposable;
                    this.f28355c.onSubscribe(this);
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    disposable.dispose();
                    this.f28354V = C12010c.DISPOSED;
                    C12011d.m38630a(th, this.f28355c);
                }
            }
        }

        public void onSuccess(T t) {
            if (this.f28354V != C12010c.DISPOSED) {
                try {
                    this.f28353U.f28348V.accept(t);
                    this.f28354V = C12010c.DISPOSED;
                    this.f28355c.onSuccess(t);
                    mo30473a();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    mo30474a(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30473a() {
            try {
                this.f28353U.f28351Y.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
        }
    }

    public C12281y(MaybeSource<T> maybeSource, Consumer<? super Disposable> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, C11945a aVar, C11945a aVar2, C11945a aVar3) {
        super(maybeSource);
        this.f28347U = consumer;
        this.f28348V = consumer2;
        this.f28349W = consumer3;
        this.f28350X = aVar;
        this.f28351Y = aVar2;
        this.f28352Z = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12282a(lVar, this));
    }
}
