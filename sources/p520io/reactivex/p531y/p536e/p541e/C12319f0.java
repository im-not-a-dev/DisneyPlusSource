package p520io.reactivex.p531y.p536e.p541e;

import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.p531y.p534c.C12049l;
import p520io.reactivex.p531y.p536e.p541e.C12372p0.C12373a;

/* renamed from: io.reactivex.y.e.e.f0 */
/* compiled from: ObservableJust */
public final class C12319f0<T> extends Observable<T> implements C12049l<T> {

    /* renamed from: c */
    private final T f28457c;

    public C12319f0(T t) {
        this.f28457c = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C12373a aVar = new C12373a(qVar, this.f28457c);
        qVar.onSubscribe(aVar);
        aVar.run();
    }

    public T call() {
        return this.f28457c;
    }
}
