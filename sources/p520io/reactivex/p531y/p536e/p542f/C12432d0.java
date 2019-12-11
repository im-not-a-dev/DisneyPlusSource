package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.y.e.f.d0 */
/* compiled from: SingleTimeout */
public final class C12432d0<T> extends Single<T> {

    /* renamed from: U */
    final long f28795U;

    /* renamed from: V */
    final TimeUnit f28796V;

    /* renamed from: W */
    final C11969r f28797W;

    /* renamed from: X */
    final SingleSource<? extends T> f28798X;

    /* renamed from: c */
    final SingleSource<T> f28799c;

    /* renamed from: io.reactivex.y.e.f.d0$a */
    /* compiled from: SingleTimeout */
    static final class C12433a<T> extends AtomicReference<Disposable> implements C11987u<T>, Runnable, Disposable {

        /* renamed from: U */
        final AtomicReference<Disposable> f28800U = new AtomicReference<>();

        /* renamed from: V */
        final C12434a<T> f28801V;

        /* renamed from: W */
        SingleSource<? extends T> f28802W;

        /* renamed from: X */
        final long f28803X;

        /* renamed from: Y */
        final TimeUnit f28804Y;

        /* renamed from: c */
        final C11987u<? super T> f28805c;

        /* renamed from: io.reactivex.y.e.f.d0$a$a */
        /* compiled from: SingleTimeout */
        static final class C12434a<T> extends AtomicReference<Disposable> implements C11987u<T> {

            /* renamed from: c */
            final C11987u<? super T> f28806c;

            C12434a(C11987u<? super T> uVar) {
                this.f28806c = uVar;
            }

            public void onError(Throwable th) {
                this.f28806c.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12010c.m38624c(this, disposable);
            }

            public void onSuccess(T t) {
                this.f28806c.onSuccess(t);
            }
        }

        C12433a(C11987u<? super T> uVar, SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit) {
            this.f28805c = uVar;
            this.f28802W = singleSource;
            this.f28803X = j;
            this.f28804Y = timeUnit;
            if (singleSource != null) {
                this.f28801V = new C12434a<>(uVar);
            } else {
                this.f28801V = null;
            }
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
            C12010c.m38621a(this.f28800U);
            C12434a<T> aVar = this.f28801V;
            if (aVar != null) {
                C12010c.m38621a((AtomicReference<Disposable>) aVar);
            }
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void onError(Throwable th) {
            Disposable disposable = (Disposable) get();
            C12010c cVar = C12010c.DISPOSED;
            if (disposable == cVar || !compareAndSet(disposable, cVar)) {
                C11915a.m38466b(th);
                return;
            }
            C12010c.m38621a(this.f28800U);
            this.f28805c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12010c.m38624c(this, disposable);
        }

        public void onSuccess(T t) {
            Disposable disposable = (Disposable) get();
            C12010c cVar = C12010c.DISPOSED;
            if (disposable != cVar && compareAndSet(disposable, cVar)) {
                C12010c.m38621a(this.f28800U);
                this.f28805c.onSuccess(t);
            }
        }

        public void run() {
            Disposable disposable = (Disposable) get();
            C12010c cVar = C12010c.DISPOSED;
            if (disposable != cVar && compareAndSet(disposable, cVar)) {
                if (disposable != null) {
                    disposable.dispose();
                }
                SingleSource<? extends T> singleSource = this.f28802W;
                if (singleSource == null) {
                    this.f28805c.onError(new TimeoutException(C12548h.m39350a(this.f28803X, this.f28804Y)));
                    return;
                }
                this.f28802W = null;
                singleSource.mo30216a(this.f28801V);
            }
        }
    }

    public C12432d0(SingleSource<T> singleSource, long j, TimeUnit timeUnit, C11969r rVar, SingleSource<? extends T> singleSource2) {
        this.f28799c = singleSource;
        this.f28795U = j;
        this.f28796V = timeUnit;
        this.f28797W = rVar;
        this.f28798X = singleSource2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        C12433a aVar = new C12433a(uVar, this.f28798X, this.f28795U, this.f28796V);
        uVar.onSubscribe(aVar);
        C12010c.m38622a(aVar.f28800U, this.f28797W.mo30291a(aVar, this.f28795U, this.f28796V));
        this.f28799c.mo30216a(aVar);
    }
}
