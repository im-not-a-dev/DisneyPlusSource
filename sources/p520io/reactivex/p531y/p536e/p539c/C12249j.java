package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p532a.C12010c;

/* renamed from: io.reactivex.y.e.c.j */
/* compiled from: MaybeFilter */
public final class C12249j<T> extends C12221a<T, T> {

    /* renamed from: U */
    final C11952h<? super T> f28287U;

    /* renamed from: io.reactivex.y.e.c.j$a */
    /* compiled from: MaybeFilter */
    static final class C12250a<T> implements C11958l<T>, Disposable {

        /* renamed from: U */
        final C11952h<? super T> f28288U;

        /* renamed from: V */
        Disposable f28289V;

        /* renamed from: c */
        final C11958l<? super T> f28290c;

        C12250a(C11958l<? super T> lVar, C11952h<? super T> hVar) {
            this.f28290c = lVar;
            this.f28288U = hVar;
        }

        public void dispose() {
            Disposable disposable = this.f28289V;
            this.f28289V = C12010c.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f28289V.isDisposed();
        }

        public void onComplete() {
            this.f28290c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28290c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28289V, disposable)) {
                this.f28289V = disposable;
                this.f28290c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.f28288U.test(t)) {
                    this.f28290c.onSuccess(t);
                } else {
                    this.f28290c.onComplete();
                }
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28290c.onError(th);
            }
        }
    }

    public C12249j(MaybeSource<T> maybeSource, C11952h<? super T> hVar) {
        super(maybeSource);
        this.f28287U = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo29936b(C11958l<? super T> lVar) {
        this.f28234c.mo30113a(new C12250a(lVar, this.f28287U));
    }
}
