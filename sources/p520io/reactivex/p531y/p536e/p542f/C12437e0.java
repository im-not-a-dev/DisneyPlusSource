package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.f.e0 */
/* compiled from: SingleTimer */
public final class C12437e0 extends Single<Long> {

    /* renamed from: U */
    final TimeUnit f28811U;

    /* renamed from: V */
    final C11969r f28812V;

    /* renamed from: c */
    final long f28813c;

    /* renamed from: io.reactivex.y.e.f.e0$a */
    /* compiled from: SingleTimer */
    static final class C12438a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: c */
        final C11987u<? super Long> f28814c;

        C12438a(C11987u<? super Long> uVar) {
            this.f28814c = uVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30575a(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void run() {
            this.f28814c.onSuccess(Long.valueOf(0));
        }
    }

    public C12437e0(long j, TimeUnit timeUnit, C11969r rVar) {
        this.f28813c = j;
        this.f28811U = timeUnit;
        this.f28812V = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super Long> uVar) {
        C12438a aVar = new C12438a(uVar);
        uVar.onSubscribe(aVar);
        aVar.mo30575a(this.f28812V.mo30291a(aVar, this.f28813c, this.f28811U));
    }
}
