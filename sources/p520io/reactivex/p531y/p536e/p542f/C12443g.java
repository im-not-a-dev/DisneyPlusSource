package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.f.g */
/* compiled from: SingleDoAfterTerminate */
public final class C12443g<T> extends Single<T> {

    /* renamed from: U */
    final C11945a f28822U;

    /* renamed from: c */
    final SingleSource<T> f28823c;

    /* renamed from: io.reactivex.y.e.f.g$a */
    /* compiled from: SingleDoAfterTerminate */
    static final class C12444a<T> implements C11987u<T>, Disposable {

        /* renamed from: U */
        final C11945a f28824U;

        /* renamed from: V */
        Disposable f28825V;

        /* renamed from: c */
        final C11987u<? super T> f28826c;

        C12444a(C11987u<? super T> uVar, C11945a aVar) {
            this.f28826c = uVar;
            this.f28824U = aVar;
        }

        /* renamed from: a */
        private void m39171a() {
            try {
                this.f28824U.run();
            } catch (Throwable th) {
                C12003b.m38614b(th);
                C11915a.m38466b(th);
            }
        }

        public void dispose() {
            this.f28825V.dispose();
        }

        public boolean isDisposed() {
            return this.f28825V.isDisposed();
        }

        public void onError(Throwable th) {
            this.f28826c.onError(th);
            m39171a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28825V, disposable)) {
                this.f28825V = disposable;
                this.f28826c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28826c.onSuccess(t);
            m39171a();
        }
    }

    public C12443g(SingleSource<T> singleSource, C11945a aVar) {
        this.f28823c = singleSource;
        this.f28822U = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28823c.mo30216a(new C12444a(uVar, this.f28822U));
    }
}
