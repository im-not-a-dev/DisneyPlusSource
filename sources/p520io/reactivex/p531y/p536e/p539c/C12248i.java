package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.Maybe;
import p520io.reactivex.disposables.C11929b;

/* renamed from: io.reactivex.y.e.c.i */
/* compiled from: MaybeError */
public final class C12248i<T> extends Maybe<T> {

    /* renamed from: c */
    final Throwable f28286c;

    public C12248i(Throwable th) {
        this.f28286c = th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        lVar.onSubscribe(C11929b.m38490a());
        lVar.onError(this.f28286c);
    }
}
