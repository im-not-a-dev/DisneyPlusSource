package p520io.reactivex.p531y.p536e.p538b;

import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11968q;
import p520io.reactivex.Flowable;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.y.e.b.s */
/* compiled from: FlowableFromObservable */
public final class C12205s<T> extends Flowable<T> {

    /* renamed from: U */
    private final Observable<T> f28186U;

    /* renamed from: io.reactivex.y.e.b.s$a */
    /* compiled from: FlowableFromObservable */
    static final class C12206a<T> implements C11968q<T>, C14314c {

        /* renamed from: U */
        Disposable f28187U;

        /* renamed from: c */
        final Subscriber<? super T> f28188c;

        C12206a(Subscriber<? super T> subscriber) {
            this.f28188c = subscriber;
        }

        /* renamed from: b */
        public void mo29946b(long j) {
        }

        public void cancel() {
            this.f28187U.dispose();
        }

        public void onComplete() {
            this.f28188c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28188c.onError(th);
        }

        public void onNext(T t) {
            this.f28188c.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28187U = disposable;
            this.f28188c.mo29945a(this);
        }
    }

    public C12205s(Observable<T> observable) {
        this.f28186U = observable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f28186U.mo30162a((C11968q<? super T>) new C12206a<Object>(subscriber));
    }
}
