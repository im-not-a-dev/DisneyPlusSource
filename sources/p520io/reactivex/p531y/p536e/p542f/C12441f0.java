package p520io.reactivex.p531y.p536e.p542f;

import org.reactivestreams.Subscriber;
import p520io.reactivex.C11987u;
import p520io.reactivex.Flowable;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p546i.C12535c;

/* renamed from: io.reactivex.y.e.f.f0 */
/* compiled from: SingleToFlowable */
public final class C12441f0<T> extends Flowable<T> {

    /* renamed from: U */
    final SingleSource<? extends T> f28820U;

    /* renamed from: io.reactivex.y.e.f.f0$a */
    /* compiled from: SingleToFlowable */
    static final class C12442a<T> extends C12535c<T> implements C11987u<T> {

        /* renamed from: V */
        Disposable f28821V;

        C12442a(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void cancel() {
            super.cancel();
            this.f28821V.dispose();
        }

        public void onError(Throwable th) {
            this.f29056c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28821V, disposable)) {
                this.f28821V = disposable;
                this.f29056c.mo29945a(this);
            }
        }

        public void onSuccess(T t) {
            mo30654b(t);
        }
    }

    public C12441f0(SingleSource<? extends T> singleSource) {
        this.f28820U = singleSource;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f28820U.mo30216a(new C12442a(subscriber));
    }
}
