package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11969r;
import p520io.reactivex.Maybe;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.c0 */
/* compiled from: MaybeTimer */
public final class C12231c0 extends Maybe<Long> {

    /* renamed from: U */
    final TimeUnit f28257U;

    /* renamed from: V */
    final C11969r f28258V;

    /* renamed from: c */
    final long f28259c;

    /* renamed from: io.reactivex.y.e.c.c0$a */
    /* compiled from: MaybeTimer */
    static final class C12232a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* renamed from: c */
        final C11958l<? super Long> f28260c;

        C12232a(C11958l<? super Long> lVar) {
            this.f28260c = lVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30468a(Disposable disposable) {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
        }

        public void dispose() {
            C12010c.m38621a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12010c.m38619a((Disposable) get());
        }

        public void run() {
            this.f28260c.onSuccess(Long.valueOf(0));
        }
    }

    public C12231c0(long j, TimeUnit timeUnit, C11969r rVar) {
        this.f28259c = j;
        this.f28257U = timeUnit;
        this.f28258V = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super Long> lVar) {
        C12232a aVar = new C12232a(lVar);
        lVar.onSubscribe(aVar);
        aVar.mo30468a(this.f28258V.mo30291a(aVar, this.f28259c, this.f28257U));
    }
}
