package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.f.z */
/* compiled from: SingleObserveOn */
public final class C12486z<T> extends Single<T> {

    /* renamed from: U */
    final C11969r f28908U;

    /* renamed from: c */
    final SingleSource<T> f28909c;

    /* renamed from: io.reactivex.y.e.f.z$a */
    /* compiled from: SingleObserveOn */
    static final class C12487a<T> extends AtomicReference<Disposable> implements C11987u<T>, Disposable, Runnable {

        /* renamed from: U */
        final C11969r f28910U;

        /* renamed from: V */
        T f28911V;

        /* renamed from: W */
        Throwable f28912W;

        /* renamed from: c */
        final C11987u<? super T> f28913c;

        C12487a(C11987u<? super T> uVar, C11969r rVar) {
            this.f28913c = uVar;
            this.f28910U = rVar;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onError(Throwable th) {
            this.f28912W = th;
            C12010c.m38622a((AtomicReference<Disposable>) this, this.f28910U.mo30289a(this));
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38624c(this, disposable)) {
                this.f28913c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28911V = t;
            C12010c.m38622a((AtomicReference<Disposable>) this, this.f28910U.mo30289a(this));
        }

        public void run() {
            Throwable th = this.f28912W;
            if (th != null) {
                this.f28913c.onError(th);
            } else {
                this.f28913c.onSuccess(this.f28911V);
            }
        }
    }

    public C12486z(SingleSource<T> singleSource, C11969r rVar) {
        this.f28909c = singleSource;
        this.f28908U = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28909c.mo30216a(new C12487a(uVar, this.f28908U));
    }
}
