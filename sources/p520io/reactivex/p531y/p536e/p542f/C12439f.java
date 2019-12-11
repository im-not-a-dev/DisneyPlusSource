package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.f.f */
/* compiled from: SingleDoAfterSuccess */
public final class C12439f<T> extends Single<T> {

    /* renamed from: U */
    final Consumer<? super T> f28815U;

    /* renamed from: c */
    final SingleSource<T> f28816c;

    /* renamed from: io.reactivex.y.e.f.f$a */
    /* compiled from: SingleDoAfterSuccess */
    static final class C12440a<T> implements C11987u<T>, Disposable {

        /* renamed from: U */
        final Consumer<? super T> f28817U;

        /* renamed from: V */
        Disposable f28818V;

        /* renamed from: c */
        final C11987u<? super T> f28819c;

        C12440a(C11987u<? super T> uVar, Consumer<? super T> consumer) {
            this.f28819c = uVar;
            this.f28817U = consumer;
        }

        public void dispose() {
            this.f28818V.dispose();
        }

        public boolean isDisposed() {
            return this.f28818V.isDisposed();
        }

        public void onError(Throwable th) {
            this.f28819c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28818V, disposable)) {
                this.f28818V = disposable;
                this.f28819c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28819c.onSuccess(t);
            try {
                this.f28817U.accept(t);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
        }
    }

    public C12439f(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f28816c = singleSource;
        this.f28815U = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28816c.mo30216a(new C12440a(uVar, this.f28815U));
    }
}
