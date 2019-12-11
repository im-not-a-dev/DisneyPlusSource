package p520io.reactivex.p531y.p545h;

import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p534c.C12048k;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.h.b */
/* compiled from: BasicFuseableSubscriber */
public abstract class C12530b<T, R> implements C11955i<T>, C12048k<R> {

    /* renamed from: U */
    protected C14314c f29040U;

    /* renamed from: V */
    protected C12048k<T> f29041V;

    /* renamed from: W */
    protected boolean f29042W;

    /* renamed from: X */
    protected int f29043X;

    /* renamed from: c */
    protected final Subscriber<? super R> f29044c;

    public C12530b(Subscriber<? super R> subscriber) {
        this.f29044c = subscriber;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30650a() {
    }

    /* renamed from: a */
    public final void mo29945a(C14314c cVar) {
        if (C12539g.m39329a(this.f29040U, cVar)) {
            this.f29040U = cVar;
            if (cVar instanceof C12048k) {
                this.f29041V = (C12048k) cVar;
            }
            if (mo30653b()) {
                this.f29044c.mo29945a(this);
                mo30650a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo30652b(int i) {
        C12048k<T> kVar = this.f29041V;
        if (kVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = kVar.mo30285a(i);
        if (a != 0) {
            this.f29043X = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo30653b() {
        return true;
    }

    public void cancel() {
        this.f29040U.cancel();
    }

    public void clear() {
        this.f29041V.clear();
    }

    public boolean isEmpty() {
        return this.f29041V.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f29042W) {
            this.f29042W = true;
            this.f29044c.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f29042W) {
            C11915a.m38466b(th);
            return;
        }
        this.f29042W = true;
        this.f29044c.onError(th);
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        this.f29040U.mo29946b(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30651a(Throwable th) {
        C12003b.m38614b(th);
        this.f29040U.cancel();
        onError(th);
    }
}
