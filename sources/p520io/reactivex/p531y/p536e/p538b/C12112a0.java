package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.a0 */
/* compiled from: FlowableOnBackpressureError */
public final class C12112a0<T> extends C12111a<T, T> {

    /* renamed from: io.reactivex.y.e.b.a0$a */
    /* compiled from: FlowableOnBackpressureError */
    static final class C12113a<T> extends AtomicLong implements C11955i<T>, C14314c {

        /* renamed from: U */
        C14314c f27889U;

        /* renamed from: V */
        boolean f27890V;

        /* renamed from: c */
        final Subscriber<? super T> f27891c;

        C12113a(Subscriber<? super T> subscriber) {
            this.f27891c = subscriber;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f27889U, cVar)) {
                this.f27889U = cVar;
                this.f27891c.mo29945a(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f27889U.cancel();
        }

        public void onComplete() {
            if (!this.f27890V) {
                this.f27890V = true;
                this.f27891c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f27890V) {
                C11915a.m38466b(th);
                return;
            }
            this.f27890V = true;
            this.f27891c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f27890V) {
                if (get() != 0) {
                    this.f27891c.onNext(t);
                    C12544d.m39343c(this, 1);
                } else {
                    onError(new C12004c("could not emit value due to lack of requests"));
                }
            }
        }
    }

    public C12112a0(Flowable<T> flowable) {
        super(flowable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12113a<Object>(subscriber));
    }
}
