package p520io.reactivex.p531y.p536e.p540d;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14313b;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.CompletableObserver;
import p520io.reactivex.CompletableSource;
import p520io.reactivex.Flowable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.d.b */
/* compiled from: CompletableAndThenPublisher */
public final class C12288b<R> extends Flowable<R> {

    /* renamed from: U */
    final CompletableSource f28365U;

    /* renamed from: V */
    final C14313b<? extends R> f28366V;

    /* renamed from: io.reactivex.y.e.d.b$a */
    /* compiled from: CompletableAndThenPublisher */
    static final class C12289a<R> extends AtomicReference<C14314c> implements C11955i<R>, CompletableObserver, C14314c {

        /* renamed from: U */
        C14313b<? extends R> f28367U;

        /* renamed from: V */
        Disposable f28368V;

        /* renamed from: W */
        final AtomicLong f28369W = new AtomicLong();

        /* renamed from: c */
        final Subscriber<? super R> f28370c;

        C12289a(Subscriber<? super R> subscriber, C14313b<? extends R> bVar) {
            this.f28370c = subscriber;
            this.f28367U = bVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            C12539g.m39327a((AtomicReference<C14314c>) this, this.f28369W, cVar);
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            C12539g.m39325a((AtomicReference<C14314c>) this, this.f28369W, j);
        }

        public void cancel() {
            this.f28368V.dispose();
            C12539g.m39326a((AtomicReference<C14314c>) this);
        }

        public void onComplete() {
            C14313b<? extends R> bVar = this.f28367U;
            if (bVar == null) {
                this.f28370c.onComplete();
                return;
            }
            this.f28367U = null;
            bVar.subscribe(this);
        }

        public void onError(Throwable th) {
            this.f28370c.onError(th);
        }

        public void onNext(R r) {
            this.f28370c.onNext(r);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28368V, disposable)) {
                this.f28368V = disposable;
                this.f28370c.mo29945a(this);
            }
        }
    }

    public C12288b(CompletableSource completableSource, C14313b<? extends R> bVar) {
        this.f28365U = completableSource;
        this.f28366V = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super R> subscriber) {
        this.f28365U.subscribe(new C12289a(subscriber, this.f28366V));
    }
}
