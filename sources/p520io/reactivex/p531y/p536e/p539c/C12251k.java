package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.C11987u;
import p520io.reactivex.Maybe;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.k */
/* compiled from: MaybeFilterSingle */
public final class C12251k<T> extends Maybe<T> {

    /* renamed from: U */
    final C11952h<? super T> f28291U;

    /* renamed from: c */
    final SingleSource<T> f28292c;

    /* renamed from: io.reactivex.y.e.c.k$a */
    /* compiled from: MaybeFilterSingle */
    static final class C12252a<T> implements C11987u<T>, Disposable {

        /* renamed from: U */
        final C11952h<? super T> f28293U;

        /* renamed from: V */
        Disposable f28294V;

        /* renamed from: c */
        final C11958l<? super T> f28295c;

        C12252a(C11958l<? super T> lVar, C11952h<? super T> hVar) {
            this.f28295c = lVar;
            this.f28293U = hVar;
        }

        public void dispose() {
            Disposable disposable = this.f28294V;
            this.f28294V = C12010c.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f28294V.isDisposed();
        }

        public void onError(Throwable th) {
            this.f28295c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28294V, disposable)) {
                this.f28294V = disposable;
                this.f28295c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.f28293U.test(t)) {
                    this.f28295c.onSuccess(t);
                } else {
                    this.f28295c.onComplete();
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28295c.onError(th);
            }
        }
    }

    public C12251k(SingleSource<T> singleSource, C11952h<? super T> hVar) {
        this.f28292c = singleSource;
        this.f28291U = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28292c.mo30216a(new C12252a(lVar, this.f28291U));
    }
}
