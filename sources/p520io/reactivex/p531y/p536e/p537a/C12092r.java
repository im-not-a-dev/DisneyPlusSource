package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.a.r */
/* compiled from: CompletableNever */
public final class C12092r extends Completable {

    /* renamed from: c */
    public static final Completable f27836c = new C12092r();

    private C12092r() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        completableObserver.onSubscribe(C12011d.NEVER);
    }
}
