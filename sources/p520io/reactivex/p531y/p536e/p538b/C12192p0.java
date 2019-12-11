package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11969r;
import p520io.reactivex.Flowable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p546i.C12539g;

/* renamed from: io.reactivex.y.e.b.p0 */
/* compiled from: FlowableUnsubscribeOn */
public final class C12192p0<T> extends C12111a<T, T> {

    /* renamed from: V */
    final C11969r f28140V;

    /* renamed from: io.reactivex.y.e.b.p0$a */
    /* compiled from: FlowableUnsubscribeOn */
    static final class C12193a<T> extends AtomicBoolean implements C11955i<T>, C14314c {

        /* renamed from: U */
        final C11969r f28141U;

        /* renamed from: V */
        C14314c f28142V;

        /* renamed from: c */
        final Subscriber<? super T> f28143c;

        /* renamed from: io.reactivex.y.e.b.p0$a$a */
        /* compiled from: FlowableUnsubscribeOn */
        final class C12194a implements Runnable {
            C12194a() {
            }

            public void run() {
                C12193a.this.f28142V.cancel();
            }
        }

        C12193a(Subscriber<? super T> subscriber, C11969r rVar) {
            this.f28143c = subscriber;
            this.f28141U = rVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28142V, cVar)) {
                this.f28142V = cVar;
                this.f28143c.mo29945a(this);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            this.f28142V.mo29946b(j);
        }

        public void cancel() {
            if (compareAndSet(false, true)) {
                this.f28141U.mo30289a(new C12194a());
            }
        }

        public void onComplete() {
            if (!get()) {
                this.f28143c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get()) {
                C11915a.m38466b(th);
            } else {
                this.f28143c.onError(th);
            }
        }

        public void onNext(T t) {
            if (!get()) {
                this.f28143c.onNext(t);
            }
        }
    }

    public C12192p0(Flowable<T> flowable, C11969r rVar) {
        super(flowable);
        this.f28140V = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12193a<Object>(subscriber, this.f28140V));
    }
}
