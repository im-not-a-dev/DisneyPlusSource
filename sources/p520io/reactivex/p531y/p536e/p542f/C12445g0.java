package p520io.reactivex.p531y.p536e.p542f;

import p520io.reactivex.C11968q;
import p520io.reactivex.C11987u;
import p520io.reactivex.Observable;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p535d.C12058g;

/* renamed from: io.reactivex.y.e.f.g0 */
/* compiled from: SingleToObservable */
public final class C12445g0<T> extends Observable<T> {

    /* renamed from: c */
    final SingleSource<? extends T> f28827c;

    /* renamed from: io.reactivex.y.e.f.g0$a */
    /* compiled from: SingleToObservable */
    static final class C12446a<T> extends C12058g<T> implements C11987u<T> {

        /* renamed from: V */
        Disposable f28828V;

        C12446a(C11968q<? super T> qVar) {
            super(qVar);
        }

        public void dispose() {
            super.dispose();
            this.f28828V.dispose();
        }

        public void onError(Throwable th) {
            mo30376a(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28828V, disposable)) {
                this.f28828V = disposable;
                this.f27772c.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            mo30375a(t);
        }
    }

    public C12445g0(SingleSource<? extends T> singleSource) {
        this.f28827c = singleSource;
    }

    /* renamed from: c */
    public static <T> C11987u<T> m39172c(C11968q<? super T> qVar) {
        return new C12446a(qVar);
    }

    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        this.f28827c.mo30216a(m39172c(qVar));
    }
}
