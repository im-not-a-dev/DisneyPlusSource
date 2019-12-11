package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.Callable;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.d */
/* compiled from: SingleDefer */
public final class C12431d<T> extends Single<T> {

    /* renamed from: c */
    final Callable<? extends SingleSource<? extends T>> f28794c;

    public C12431d(Callable<? extends SingleSource<? extends T>> callable) {
        this.f28794c = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        try {
            Object call = this.f28794c.call();
            C12036b.m38663a(call, "The singleSupplier returned a null SingleSource");
            ((SingleSource) call).mo30216a(uVar);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38632a(th, uVar);
        }
    }
}
