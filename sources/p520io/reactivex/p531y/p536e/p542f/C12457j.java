package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;

/* renamed from: io.reactivex.y.e.f.j */
/* compiled from: SingleDoOnError */
public final class C12457j<T> extends Single<T> {

    /* renamed from: U */
    final Consumer<? super Throwable> f28850U;

    /* renamed from: c */
    final SingleSource<T> f28851c;

    /* renamed from: io.reactivex.y.e.f.j$a */
    /* compiled from: SingleDoOnError */
    final class C12458a implements C11987u<T> {

        /* renamed from: c */
        private final C11987u<? super T> f28853c;

        C12458a(C11987u<? super T> uVar) {
            this.f28853c = uVar;
        }

        public void onError(Throwable th) {
            try {
                C12457j.this.f28850U.accept(th);
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                th = new C11998a(th, th2);
            }
            this.f28853c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28853c.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f28853c.onSuccess(t);
        }
    }

    public C12457j(SingleSource<T> singleSource, Consumer<? super Throwable> consumer) {
        this.f28851c = singleSource;
        this.f28850U = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28851c.mo30216a(new C12458a(uVar));
    }
}
