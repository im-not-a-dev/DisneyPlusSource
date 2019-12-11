package p520io.reactivex.p531y.p536e.p542f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11987u;
import p520io.reactivex.Flowable;
import p520io.reactivex.SingleSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.f.s */
/* compiled from: SingleFlatMapPublisher */
public final class C12476s<T, R> extends Flowable<R> {

    /* renamed from: U */
    final SingleSource<T> f28892U;

    /* renamed from: V */
    final Function<? super T, ? extends C14313b<? extends R>> f28893V;

    /* renamed from: io.reactivex.y.e.f.s$a */
    /* compiled from: SingleFlatMapPublisher */
    static final class C12477a<S, T> extends AtomicLong implements C11987u<S>, C11955i<T>, C14314c {

        /* renamed from: U */
        final Function<? super S, ? extends C14313b<? extends T>> f28894U;

        /* renamed from: V */
        final AtomicReference<C14314c> f28895V = new AtomicReference<>();

        /* renamed from: W */
        Disposable f28896W;

        /* renamed from: c */
        final Subscriber<? super T> f28897c;

        C12477a(Subscriber<? super T> subscriber, Function<? super S, ? extends C14313b<? extends T>> function) {
            this.f28897c = subscriber;
            this.f28894U = function;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            C12539g.m39327a(this.f28895V, (AtomicLong) this, cVar);
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            C12539g.m39325a(this.f28895V, (AtomicLong) this, j);
        }

        public void cancel() {
            this.f28896W.dispose();
            C12539g.m39326a(this.f28895V);
        }

        public void onComplete() {
            this.f28897c.onComplete();
        }

        public void onError(Throwable th) {
            this.f28897c.onError(th);
        }

        public void onNext(T t) {
            this.f28897c.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28896W = disposable;
            this.f28897c.mo29945a(this);
        }

        public void onSuccess(S s) {
            try {
                ((C14313b) C12036b.m38663a(this.f28894U.apply(s), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                C12003b.m38614b(th);
                this.f28897c.onError(th);
            }
        }
    }

    public C12476s(SingleSource<T> singleSource, Function<? super T, ? extends C14313b<? extends R>> function) {
        this.f28892U = singleSource;
        this.f28893V = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super R> subscriber) {
        this.f28892U.mo30216a(new C12477a(subscriber, this.f28893V));
    }
}
