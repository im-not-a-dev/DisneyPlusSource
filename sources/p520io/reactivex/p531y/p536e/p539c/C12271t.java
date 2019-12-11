package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.Maybe;
import p520io.reactivex.disposables.C11929b;
import p520io.reactivex.p531y.p534c.C12049l;

/* renamed from: io.reactivex.y.e.c.t */
/* compiled from: MaybeJust */
public final class C12271t<T> extends Maybe<T> implements C12049l<T> {

    /* renamed from: c */
    final T f28326c;

    public C12271t(T t) {
        this.f28326c = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        lVar.onSubscribe(C11929b.m38490a());
        lVar.onSuccess(this.f28326c);
    }

    public T call() {
        return this.f28326c;
    }
}
