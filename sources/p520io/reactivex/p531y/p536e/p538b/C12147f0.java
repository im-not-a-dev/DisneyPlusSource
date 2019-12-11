package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.p531y.p546i.C12536d;
import p520io.reactivex.p531y.p546i.C12538f;
import p520io.reactivex.processors.C11964a;

/* renamed from: io.reactivex.y.e.b.f0 */
/* compiled from: FlowableRepeatWhen */
abstract class C12147f0<T, U> extends C12538f implements C11955i<T> {

    /* renamed from: b0 */
    protected final Subscriber<? super T> f27980b0;

    /* renamed from: c0 */
    protected final C11964a<U> f27981c0;

    /* renamed from: d0 */
    protected final C14314c f27982d0;

    /* renamed from: e0 */
    private long f27983e0;

    C12147f0(Subscriber<? super T> subscriber, C11964a<U> aVar, C14314c cVar) {
        super(false);
        this.f27980b0 = subscriber;
        this.f27981c0 = aVar;
        this.f27982d0 = cVar;
    }

    /* renamed from: a */
    public final void mo29945a(C14314c cVar) {
        mo30659b(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo30415b(U u) {
        mo30659b((C14314c) C12536d.INSTANCE);
        long j = this.f27983e0;
        if (j != 0) {
            this.f27983e0 = 0;
            mo30657a(j);
        }
        this.f27982d0.mo29946b(1);
        this.f27981c0.onNext(u);
    }

    public final void cancel() {
        super.cancel();
        this.f27982d0.cancel();
    }

    public final void onNext(T t) {
        this.f27983e0++;
        this.f27980b0.onNext(t);
    }
}
