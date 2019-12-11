package p520io.reactivex.p548z;

import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p533b.C12015a;
import p520io.reactivex.p531y.p536e.p541e.C12299b;
import p520io.reactivex.p531y.p536e.p541e.C12346l0;
import p520io.reactivex.p531y.p536e.p541e.C12351m0;
import p520io.reactivex.p531y.p536e.p541e.C12354n0;

/* renamed from: io.reactivex.z.a */
/* compiled from: ConnectableObservable */
public abstract class C12557a<T> extends Observable<T> {
    /* renamed from: o */
    private C12557a<T> m39376o() {
        return this instanceof C12351m0 ? C11915a.m38456a((C12557a<T>) new C12346l0<T>(((C12351m0) this).mo30497a())) : this;
    }

    /* renamed from: a */
    public Observable<T> mo30682a(int i, Consumer<? super Disposable> consumer) {
        if (i > 0) {
            return C11915a.m38448a((Observable<T>) new C12299b<T>(this, i, consumer));
        }
        mo30498g(consumer);
        return C11915a.m38456a(this);
    }

    /* renamed from: c */
    public Observable<T> mo30683c(int i) {
        return mo30682a(i, C12015a.m38648b());
    }

    /* renamed from: g */
    public abstract void mo30498g(Consumer<? super Disposable> consumer);

    /* renamed from: n */
    public Observable<T> mo30684n() {
        return C11915a.m38448a((Observable<T>) new C12354n0<T>(m39376o()));
    }
}
