package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11969r;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.v */
/* compiled from: MaybeObserveOn */
public final class C12274v<T> extends C12221a<T, T> {

    /* renamed from: U */
    final C11969r f28331U;

    /* renamed from: io.reactivex.y.e.c.v$a */
    /* compiled from: MaybeObserveOn */
    static final class C12275a<T> extends AtomicReference<Disposable> implements C11958l<T>, Disposable, Runnable {

        /* renamed from: U */
        final C11969r f28332U;

        /* renamed from: V */
        T f28333V;

        /* renamed from: W */
        Throwable f28334W;

        /* renamed from: c */
        final C11958l<? super T> f28335c;

        C12275a(C11958l<? super T> lVar, C11969r rVar) {
            this.f28335c = lVar;
            this.f28332U = rVar;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onComplete() {
            C12010c.m38622a((AtomicReference<Disposable>) this, this.f28332U.mo30289a(this));
        }

        public void onError(Throwable th) {
            this.f28334W = th;
            C12010c.m38622a((AtomicReference<Disposable>) this, this.f28332U.mo30289a(this));
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28335c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28333V = t;
            C12010c.m38622a((AtomicReference<Disposable>) this, this.f28332U.mo30289a(this));
        }

        public void run() {
            Throwable th = this.f28334W;
            if (th != null) {
                this.f28334W = null;
                this.f28335c.onError(th);
                return;
            }
            T t = this.f28333V;
            if (t != null) {
                this.f28333V = null;
                this.f28335c.onSuccess(t);
                return;
            }
            this.f28335c.onComplete();
        }
    }

    public C12274v(MaybeSource<T> maybeSource, C11969r rVar) {
        super(maybeSource);
        this.f28331U = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12275a(lVar, this.f28331U));
    }
}
