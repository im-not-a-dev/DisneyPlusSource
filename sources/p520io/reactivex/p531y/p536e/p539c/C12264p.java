package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.Callable;
import p520io.reactivex.C11958l;
import p520io.reactivex.Maybe;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.c.p */
/* compiled from: MaybeFromCallable */
public final class C12264p<T> extends Maybe<T> implements Callable<T> {

    /* renamed from: c */
    final Callable<? extends T> f28317c;

    public C12264p(Callable<? extends T> callable) {
        this.f28317c = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        Disposable b = C11929b.m38493b();
        lVar.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object call = this.f28317c.call();
                if (b.isDisposed()) {
                    return;
                }
                if (call == null) {
                    lVar.onComplete();
                } else {
                    lVar.onSuccess(call);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                if (!b.isDisposed()) {
                    lVar.onError(th);
                } else {
                    C11915a.m38466b(th);
                }
            }
        }
    }

    public T call() throws Exception {
        return this.f28317c.call();
    }
}
