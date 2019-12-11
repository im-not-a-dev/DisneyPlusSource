package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.Callable;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.t */
/* compiled from: SingleFromCallable */
public final class C12478t<T> extends Single<T> {

    /* renamed from: c */
    final Callable<? extends T> f28898c;

    public C12478t(Callable<? extends T> callable) {
        this.f28898c = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        Disposable b = C11929b.m38493b();
        uVar.onSubscribe(b);
        if (!b.isDisposed()) {
            try {
                Object call = this.f28898c.call();
                C12036b.m38663a(call, "The callable returned a null value");
                if (!b.isDisposed()) {
                    uVar.onSuccess(call);
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                if (!b.isDisposed()) {
                    uVar.onError(th);
                } else {
                    C11915a.m38466b(th);
                }
            }
        }
    }
}
