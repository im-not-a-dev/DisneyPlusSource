package p520io.reactivex.p531y.p536e.p539c;

import p520io.reactivex.C11958l;
import p520io.reactivex.C11968q;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12042e;
import p520io.reactivex.p531y.p535d.C12058g;

/* renamed from: io.reactivex.y.e.c.e0 */
/* compiled from: MaybeToObservable */
public final class C12239e0<T> extends Observable<T> implements C12042e<T> {

    /* renamed from: c */
    final MaybeSource<T> f28270c;

    /* renamed from: io.reactivex.y.e.c.e0$a */
    /* compiled from: MaybeToObservable */
    static final class C12240a<T> extends C12058g<T> implements C11958l<T> {

        /* renamed from: V */
        Disposable f28271V;

        C12240a(C11968q<? super T> qVar) {
            super(qVar);
        }

        public void dispose() {
            super.dispose();
            this.f28271V.dispose();
        }

        public void onComplete() {
            mo30374a();
        }

        public void onError(Throwable th) {
            mo30376a(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28271V, disposable)) {
                this.f28271V = disposable;
                this.f27772c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo30375a(t);
        }
    }

    public C12239e0(MaybeSource<T> maybeSource) {
        this.f28270c = maybeSource;
    }

    /* renamed from: c */
    public static <T> C11958l<T> m38950c(C11968q<? super T> qVar) {
        return new C12240a(qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28270c.mo30113a(m38950c(qVar));
    }
}
