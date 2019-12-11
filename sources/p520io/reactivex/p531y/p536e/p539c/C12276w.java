package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p530x.C11998a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.w */
/* compiled from: MaybeOnErrorComplete */
public final class C12276w<T> extends C12221a<T, T> {

    /* renamed from: U */
    final C11952h<? super Throwable> f28336U;

    /* renamed from: io.reactivex.y.e.c.w$a */
    /* compiled from: MaybeOnErrorComplete */
    static final class C12277a<T> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final C11952h<? super Throwable> f28337U;

        /* renamed from: V */
        Disposable f28338V;

        /* renamed from: c */
        final C11958l<? super T> f28339c;

        C12277a(C11958l<? super T> lVar, C11952h<? super Throwable> hVar) {
            this.f28339c = lVar;
            this.f28337U = hVar;
        }

        public void dispose() {
            this.f28338V.dispose();
        }

        public boolean isDisposed() {
            return this.f28338V.isDisposed();
        }

        public void onComplete() {
            this.f28339c.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (this.f28337U.test(th)) {
                    this.f28339c.onComplete();
                } else {
                    this.f28339c.onError(th);
                }
            } catch (Throwable th2) {
                C12003b.m38614b(th2);
                this.f28339c.onError(new C11998a(th, th2));
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28338V, disposable)) {
                this.f28338V = disposable;
                this.f28339c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f28339c.onSuccess(t);
        }
    }

    public C12276w(MaybeSource<T> maybeSource, C11952h<? super Throwable> hVar) {
        super(maybeSource);
        this.f28336U = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12277a(lVar, this.f28336U));
    }
}
