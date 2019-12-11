package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.Callable;
import p520io.reactivex.C11958l;
import p520io.reactivex.Maybe;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;

/* renamed from: io.reactivex.y.e.c.d */
/* compiled from: MaybeDefer */
public final class C12233d<T> extends Maybe<T> {

    /* renamed from: c */
    final Callable<? extends MaybeSource<? extends T>> f28261c;

    public C12233d(Callable<? extends MaybeSource<? extends T>> callable) {
        this.f28261c = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        try {
            Object call = this.f28261c.call();
            C12036b.m38663a(call, "The maybeSupplier returned a null MaybeSource");
            ((MaybeSource) call).mo30113a(lVar);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            C12011d.m38630a(th, lVar);
        }
    }
}
