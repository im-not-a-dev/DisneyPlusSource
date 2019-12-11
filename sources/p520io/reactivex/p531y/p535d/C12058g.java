package p520io.reactivex.p531y.p535d;

import p520io.reactivex.C11968q;
import p520io.reactivex.p523c0.C11915a;

/* renamed from: io.reactivex.y.d.g */
/* compiled from: DeferredScalarDisposable */
public class C12058g<T> extends C12053b<T> {

    /* renamed from: U */
    protected T f27771U;

    /* renamed from: c */
    protected final C11968q<? super T> f27772c;

    public C12058g(C11968q<? super T> qVar) {
        this.f27772c = qVar;
    }

    /* renamed from: a */
    public final int mo30285a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void clear() {
        lazySet(32);
        this.f27771U = null;
    }

    public void dispose() {
        set(4);
        this.f27771U = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f27771U;
        this.f27771U = null;
        lazySet(32);
        return t;
    }

    /* renamed from: a */
    public final void mo30375a(T t) {
        int i = get();
        if ((i & 54) == 0) {
            C11968q<? super T> qVar = this.f27772c;
            if (i == 8) {
                this.f27771U = t;
                lazySet(16);
                qVar.onNext(null);
            } else {
                lazySet(2);
                qVar.onNext(t);
            }
            if (get() != 4) {
                qVar.onComplete();
            }
        }
    }

    /* renamed from: a */
    public final void mo30376a(Throwable th) {
        if ((get() & 54) != 0) {
            C11915a.m38466b(th);
            return;
        }
        lazySet(2);
        this.f27772c.onError(th);
    }

    /* renamed from: a */
    public final void mo30374a() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f27772c.onComplete();
        }
    }
}
