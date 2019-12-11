package p520io.reactivex.p531y.p536e.p537a;

import p520io.reactivex.Completable;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.p531y.p532a.C12011d;

/* renamed from: io.reactivex.y.e.a.h */
/* compiled from: CompletableError */
public final class C12076h extends Completable {

    /* renamed from: c */
    final Throwable f27806c;

    public C12076h(Throwable th) {
        this.f27806c = th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29934a(CompletableObserver completableObserver) {
        C12011d.m38629a(this.f27806c, completableObserver);
    }
}
