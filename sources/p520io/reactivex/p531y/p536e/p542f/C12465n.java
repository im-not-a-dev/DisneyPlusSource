package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.Callable;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.f.n */
/* compiled from: SingleError */
public final class C12465n<T> extends Single<T> {

    /* renamed from: c */
    final Callable<? extends Throwable> f28867c;

    public C12465n(Callable<? extends Throwable> callable) {
        this.f28867c = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        try {
            Object call = this.f28867c.call();
            C12036b.m38663a(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            C12003b.m38614b(th);
        }
        C12011d.m38632a(th, uVar);
    }
}
