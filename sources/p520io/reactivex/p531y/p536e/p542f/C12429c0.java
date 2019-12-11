package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12014g;

/* renamed from: io.reactivex.y.e.f.c0 */
/* compiled from: SingleSubscribeOn */
public final class C12429c0<T> extends Single<T> {

    /* renamed from: U */
    final C11969r f28789U;

    /* renamed from: c */
    final SingleSource<? extends T> f28790c;

    /* renamed from: io.reactivex.y.e.f.c0$a */
    /* compiled from: SingleSubscribeOn */
    static final class C12430a<T> extends AtomicReference<Disposable> implements C11987u<T>, Disposable, Runnable {

        /* renamed from: U */
        final C12014g f28791U = new C12014g();

        /* renamed from: V */
        final SingleSource<? extends T> f28792V;

        /* renamed from: c */
        final C11987u<? super T> f28793c;

        C12430a(C11987u<? super T> uVar, SingleSource<? extends T> singleSource) {
            this.f28793c = uVar;
            this.f28792V = singleSource;
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
            this.f28791U.dispose();
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onError(Throwable th) {
            this.f28793c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void onSuccess(T t) {
            this.f28793c.onSuccess(t);
        }

        public void run() {
            this.f28792V.mo30216a(this);
        }
    }

    public C12429c0(SingleSource<? extends T> singleSource, C11969r rVar) {
        this.f28790c = singleSource;
        this.f28789U = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        C12430a aVar = new C12430a(uVar, this.f28790c);
        uVar.onSubscribe(aVar);
        aVar.f28791U.mo30345a(this.f28789U.mo30289a(aVar));
    }
}
