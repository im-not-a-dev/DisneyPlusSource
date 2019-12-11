package p520io.reactivex.p531y.p535d;

import java.util.concurrent.CountDownLatch;
import p520io.reactivex.C11958l;
import p520io.reactivex.C11987u;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p547j.C12545e;
import p520io.reactivex.p531y.p547j.C12548h;

/* renamed from: io.reactivex.y.d.d */
/* compiled from: BlockingMultiObserver */
public final class C12055d<T> extends CountDownLatch implements C11987u<T>, CompletableObserver, C11958l<T> {

    /* renamed from: U */
    Throwable f27763U;

    /* renamed from: V */
    Disposable f27764V;

    /* renamed from: W */
    volatile boolean f27765W;

    /* renamed from: c */
    T f27766c;

    public C12055d() {
        super(1);
    }

    /* renamed from: a */
    public T mo30370a() {
        if (getCount() != 0) {
            try {
                C12545e.m39345a();
                await();
            } catch (InterruptedException e) {
                mo30372c();
                throw C12548h.m39353b(e);
            }
        }
        Throwable th = this.f27763U;
        if (th == null) {
            return this.f27766c;
        }
        throw C12548h.m39353b(th);
    }

    /* renamed from: b */
    public Throwable mo30371b() {
        if (getCount() != 0) {
            try {
                C12545e.m39345a();
                await();
            } catch (InterruptedException e) {
                mo30372c();
                return e;
            }
        }
        return this.f27763U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30372c() {
        this.f27765W = true;
        Disposable disposable = this.f27764V;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void onComplete() {
        countDown();
    }

    public void onError(Throwable th) {
        this.f27763U = th;
        countDown();
    }

    public void onSubscribe(Disposable disposable) {
        this.f27764V = disposable;
        if (this.f27765W) {
            disposable.dispose();
        }
    }

    public void onSuccess(T t) {
        this.f27766c = t;
        countDown();
    }
}
