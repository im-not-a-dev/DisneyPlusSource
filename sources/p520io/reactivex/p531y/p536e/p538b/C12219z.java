package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.z */
/* compiled from: FlowableOnBackpressureDrop */
public final class C12219z<T> extends C12111a<T, T> implements Consumer<T> {

    /* renamed from: V */
    final Consumer<? super T> f28229V = this;

    /* renamed from: io.reactivex.y.e.b.z$a */
    /* compiled from: FlowableOnBackpressureDrop */
    static final class C12220a<T> extends AtomicLong implements C11955i<T>, C14314c {

        /* renamed from: U */
        final Consumer<? super T> f28230U;

        /* renamed from: V */
        C14314c f28231V;

        /* renamed from: W */
        boolean f28232W;

        /* renamed from: c */
        final Subscriber<? super T> f28233c;

        C12220a(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            this.f28233c = subscriber;
            this.f28230U = consumer;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28231V, cVar)) {
                this.f28231V = cVar;
                this.f28233c.mo29945a(this);
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
            this.f28231V.cancel();
        }

        public void onComplete() {
            if (!this.f28232W) {
                this.f28232W = true;
                this.f28233c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f28232W) {
                C11915a.m38466b(th);
                return;
            }
            this.f28232W = true;
            this.f28233c.onError(th);
        }

        public void onNext(T t) {
            if (!this.f28232W) {
                if (get() != 0) {
                    this.f28233c.onNext(t);
                    C12544d.m39343c(this, 1);
                } else {
                    try {
                        this.f28230U.accept(t);
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        cancel();
                        onError(th);
                    }
                }
            }
        }
    }

    public C12219z(Flowable<T> flowable) {
        super(flowable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12220a<Object>(subscriber, this.f28229V));
    }

    public void accept(T t) {
    }
}
