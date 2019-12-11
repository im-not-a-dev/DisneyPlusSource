package p520io.reactivex.p531y.p535d;

import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12046i;

/* renamed from: io.reactivex.y.d.a */
/* compiled from: BasicFuseableObserver */
public abstract class C12052a<T, R> implements C11968q<T>, C12046i<R> {

    /* renamed from: U */
    protected Disposable f27758U;

    /* renamed from: V */
    protected C12046i<T> f27759V;

    /* renamed from: W */
    protected boolean f27760W;

    /* renamed from: X */
    protected int f27761X;

    /* renamed from: c */
    protected final C11968q<? super R> f27762c;

    public C12052a(C11968q<? super R> qVar) {
        this.f27762c = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30366a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30367a(Throwable th) {
        C12003b.m38614b(th);
        this.f27758U.dispose();
        onError(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo30368b(int i) {
        C12046i<T> iVar = this.f27759V;
        if (iVar == null || (i & 4) != 0) {
            return 0;
        }
        int a = iVar.mo30285a(i);
        if (a != 0) {
            this.f27761X = a;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo30369b() {
        return true;
    }

    public void clear() {
        this.f27759V.clear();
    }

    public void dispose() {
        this.f27758U.dispose();
    }

    public boolean isDisposed() {
        return this.f27758U.isDisposed();
    }

    public boolean isEmpty() {
        return this.f27759V.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f27760W) {
            this.f27760W = true;
            this.f27762c.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f27760W) {
            C11915a.m38466b(th);
            return;
        }
        this.f27760W = true;
        this.f27762c.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (C12010c.m38620a(this.f27758U, disposable)) {
            this.f27758U = disposable;
            if (disposable instanceof C12046i) {
                this.f27759V = (C12046i) disposable;
            }
            if (mo30369b()) {
                this.f27762c.onSubscribe(this);
                mo30366a();
            }
        }
    }
}
