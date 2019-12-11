package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11946b;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.g */
/* compiled from: MaybeDoOnEvent */
public final class C12245g<T> extends C12221a<T, T> {

    /* renamed from: U */
    final C11946b<? super T, ? super Throwable> f28281U;

    /* renamed from: io.reactivex.y.e.c.g$a */
    /* compiled from: MaybeDoOnEvent */
    static final class C12246a<T> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final C11946b<? super T, ? super Throwable> f28282U;

        /* renamed from: V */
        Disposable f28283V;

        /* renamed from: c */
        final C11958l<? super T> f28284c;

        C12246a(C11958l<? super T> lVar, C11946b<? super T, ? super Throwable> bVar) {
            this.f28284c = lVar;
            this.f28282U = bVar;
        }

        public void dispose() {
            this.f28283V.dispose();
            this.f28283V = C12010c.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f28283V.isDisposed();
        }

        public void onComplete() {
            this.f28283V = C12010c.DISPOSED;
            try {
                this.f28282U.accept(null, null);
                this.f28284c.onComplete();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28284c.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f28283V = C12010c.DISPOSED;
            try {
                this.f28282U.accept(null, th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                th = new C11998a(th, th2);
            }
            this.f28284c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28283V, disposable)) {
                this.f28283V = disposable;
                this.f28284c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28283V = C12010c.DISPOSED;
            try {
                this.f28282U.accept(t, null);
                this.f28284c.onSuccess(t);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28284c.onError(th);
            }
        }
    }

    public C12245g(MaybeSource<T> maybeSource, C11946b<? super T, ? super Throwable> bVar) {
        super(maybeSource);
        this.f28281U = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12246a(lVar, this.f28281U));
    }
}
