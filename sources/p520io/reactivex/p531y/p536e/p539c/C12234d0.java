package p520io.reactivex.p531y.p536e.p539c;

import org.reactivestreams.Subscriber;
import p520io.reactivex.C11958l;
import p520io.reactivex.Flowable;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p534c.C12042e;
import p520io.reactivex.p531y.p546i.C12535c;

/* renamed from: io.reactivex.y.e.c.d0 */
/* compiled from: MaybeToFlowable */
public final class C12234d0<T> extends Flowable<T> implements C12042e<T> {

    /* renamed from: U */
    final MaybeSource<T> f28262U;

    /* renamed from: io.reactivex.y.e.c.d0$a */
    /* compiled from: MaybeToFlowable */
    static final class C12235a<T> extends C12535c<T> implements C11958l<T> {

        /* renamed from: V */
        Disposable f28263V;

        C12235a(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void cancel() {
            super.cancel();
            this.f28263V.dispose();
        }

        public void onComplete() {
            this.f29056c.onComplete();
        }

        public void onError(Throwable th) {
            this.f29056c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28263V, disposable)) {
                this.f28263V = disposable;
                this.f29056c.mo29945a(this);
            }
        }

        public void onSuccess(T t) {
            mo30654b(t);
        }
    }

    public C12234d0(MaybeSource<T> maybeSource) {
        this.f28262U = maybeSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f28262U.mo30113a(new C12235a(subscriber));
    }
}
