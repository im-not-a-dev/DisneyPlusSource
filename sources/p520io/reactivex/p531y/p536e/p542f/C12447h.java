package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicInteger;
import p520io.reactivex.C11987u;
import p520io.reactivex.Single;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.f.h */
/* compiled from: SingleDoFinally */
public final class C12447h<T> extends Single<T> {

    /* renamed from: U */
    final C11945a f28829U;

    /* renamed from: c */
    final SingleSource<T> f28830c;

    /* renamed from: io.reactivex.y.e.f.h$a */
    /* compiled from: SingleDoFinally */
    static final class C12448a<T> extends AtomicInteger implements C11987u<T>, Disposable {

        /* renamed from: U */
        final C11945a f28831U;

        /* renamed from: V */
        Disposable f28832V;

        /* renamed from: c */
        final C11987u<? super T> f28833c;

        C12448a(C11987u<? super T> uVar, C11945a aVar) {
            this.f28833c = uVar;
            this.f28831U = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30577a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f28831U.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    C11915a.m38466b(th);
                }
            }
        }

        public void dispose() {
            this.f28832V.dispose();
            mo30577a();
        }

        public boolean isDisposed() {
            return this.f28832V.isDisposed();
        }

        public void onError(Throwable th) {
            this.f28833c.onError(th);
            mo30577a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28832V, disposable)) {
                this.f28832V = disposable;
                this.f28833c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28833c.onSuccess(t);
            mo30577a();
        }
    }

    public C12447h(SingleSource<T> singleSource, C11945a aVar) {
        this.f28830c = singleSource;
        this.f28829U = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17771b(C11987u<? super T> uVar) {
        this.f28830c.mo30216a(new C12448a(uVar, this.f28829U));
    }
}
