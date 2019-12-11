package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.f.i */
/* compiled from: SingleDoOnDispose */
public final class C12453i<T> extends Single<T> {

    /* renamed from: U */
    final C11945a f28843U;

    /* renamed from: c */
    final SingleSource<T> f28844c;

    /* renamed from: io.reactivex.y.e.f.i$a */
    /* compiled from: SingleDoOnDispose */
    static final class C12454a<T> extends AtomicReference<C11945a> implements C11987u<T>, Disposable {

        /* renamed from: U */
        Disposable f28845U;

        /* renamed from: c */
        final C11987u<? super T> f28846c;

        C12454a(C11987u<? super T> uVar, C11945a aVar) {
            this.f28846c = uVar;
            lazySet(aVar);
        }

        public void dispose() {
            C11945a aVar = (C11945a) getAndSet(null);
            if (aVar != null) {
                try {
                    aVar.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    C11915a.m38466b(th);
                }
                this.f28845U.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f28845U.isDisposed();
        }

        public void onError(Throwable th) {
            this.f28846c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28845U, disposable)) {
                this.f28845U = disposable;
                this.f28846c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28846c.onSuccess(t);
        }
    }

    public C12453i(SingleSource<T> singleSource, C11945a aVar) {
        this.f28844c = singleSource;
        this.f28843U = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28844c.mo30216a(new C12454a(uVar, this.f28843U));
    }
}
