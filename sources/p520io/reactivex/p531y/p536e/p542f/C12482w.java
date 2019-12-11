package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.disposables.C11929b;

/* renamed from: io.reactivex.y.e.f.w */
/* compiled from: SingleJust */
public final class C12482w<T> extends Single<T> {

    /* renamed from: c */
    final T f28902c;

    public C12482w(T t) {
        this.f28902c = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        uVar.onSubscribe(C11929b.m38490a());
        uVar.onSuccess(this.f28902c);
    }
}
