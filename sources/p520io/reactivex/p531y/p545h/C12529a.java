package p520io.reactivex.p531y.p545h;

import org.reactivestreams.C14314c;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p534c.C12048k;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.h.a */
/* compiled from: BasicFuseableConditionalSubscriber */
public abstract class C12529a<T, R> implements C12038a<T>, C12048k<R> {

    /* renamed from: U */
    protected C14314c f29035U;

    /* renamed from: V */
    protected C12048k<T> f29036V;

    /* renamed from: W */
    protected boolean f29037W;

    /* renamed from: X */
    protected int f29038X;

    /* renamed from: c */
    protected final C12038a<? super R> f29039c;

    public C12529a(C12038a<? super R> aVar) {
        this.f29039c = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30646a() {
    }

    /* renamed from: a */
    public final void mo29945a(C14314c cVar) {
        if (C12539g.m39329a(this.f29035U, cVar)) {
            this.f29035U = cVar;
            if (cVar instanceof C12048k) {
                this.f29036V = (C12048k) cVar;
            }
            if (mo30649b()) {
                this.f29039c.mo29945a(this);
                mo30646a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo30648b(int i) {
        C12048k<T> kVar = this.f29036V;
        if (kVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = kVar.mo30285a(i);
        if (a != 0) {
            this.f29038X = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo30649b() {
        return true;
    }

    public void cancel() {
        this.f29035U.cancel();
    }

    public void clear() {
        this.f29036V.clear();
    }

    public boolean isEmpty() {
        return this.f29036V.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f29037W) {
            this.f29037W = true;
            this.f29039c.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f29037W) {
            C11915a.m38466b(th);
            return;
        }
        this.f29037W = true;
        this.f29039c.onError(th);
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        this.f29035U.mo29946b(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30647a(Throwable th) {
        C12003b.m38614b(th);
        this.f29035U.cancel();
        onError(th);
    }
}
