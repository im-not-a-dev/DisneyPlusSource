package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.functions.C11945a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p534c.C12050m;
import p520io.reactivex.p531y.p543f.C12490b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p546i.C12533a;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.y */
/* compiled from: FlowableOnBackpressureBuffer */
public final class C12217y<T> extends C12111a<T, T> {

    /* renamed from: V */
    final int f28215V;

    /* renamed from: W */
    final boolean f28216W;

    /* renamed from: X */
    final boolean f28217X;

    /* renamed from: Y */
    final C11945a f28218Y;

    /* renamed from: io.reactivex.y.e.b.y$a */
    /* compiled from: FlowableOnBackpressureBuffer */
    static final class C12218a<T> extends C12533a<T> implements C11955i<T> {

        /* renamed from: U */
        final C12050m<T> f28219U;

        /* renamed from: V */
        final boolean f28220V;

        /* renamed from: W */
        final C11945a f28221W;

        /* renamed from: X */
        C14314c f28222X;

        /* renamed from: Y */
        volatile boolean f28223Y;

        /* renamed from: Z */
        volatile boolean f28224Z;

        /* renamed from: a0 */
        Throwable f28225a0;

        /* renamed from: b0 */
        final AtomicLong f28226b0 = new AtomicLong();

        /* renamed from: c */
        final Subscriber<? super T> f28227c;

        /* renamed from: c0 */
        boolean f28228c0;

        C12218a(Subscriber<? super T> subscriber, int i, boolean z, boolean z2, C11945a aVar) {
            C12050m<T> mVar;
            this.f28227c = subscriber;
            this.f28221W = aVar;
            this.f28220V = z2;
            if (z) {
                mVar = new C12491c<>(i);
            } else {
                mVar = new C12490b<>(i);
            }
            this.f28219U = mVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28222X, cVar)) {
                this.f28222X = cVar;
                this.f28227c.mo29945a(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (!this.f28228c0 && C12539g.m39330c(j)) {
                C12544d.m39341a(this.f28226b0, j);
                mo30465a();
            }
        }

        public void cancel() {
            if (!this.f28223Y) {
                this.f28223Y = true;
                this.f28222X.cancel();
                if (getAndIncrement() == 0) {
                    this.f28219U.clear();
                }
            }
        }

        public void clear() {
            this.f28219U.clear();
        }

        public boolean isEmpty() {
            return this.f28219U.isEmpty();
        }

        public void onComplete() {
            this.f28224Z = true;
            if (this.f28228c0) {
                this.f28227c.onComplete();
            } else {
                mo30465a();
            }
        }

        public void onError(Throwable th) {
            this.f28225a0 = th;
            this.f28224Z = true;
            if (this.f28228c0) {
                this.f28227c.onError(th);
            } else {
                mo30465a();
            }
        }

        public void onNext(T t) {
            if (!this.f28219U.offer(t)) {
                this.f28222X.cancel();
                C12004c cVar = new C12004c("Buffer is full");
                try {
                    this.f28221W.run();
                } catch (Throwable th) {
                    C12003b.m38614b(th);
                    cVar.initCause(th);
                }
                onError(cVar);
                return;
            }
            if (this.f28228c0) {
                this.f28227c.onNext(null);
            } else {
                mo30465a();
            }
        }

        public T poll() throws Exception {
            return this.f28219U.poll();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30465a() {
            int i;
            if (getAndIncrement() == 0) {
                C12050m<T> mVar = this.f28219U;
                Subscriber<? super T> subscriber = this.f28227c;
                int i2 = 1;
                while (!mo30466a(this.f28224Z, mVar.isEmpty(), subscriber)) {
                    long j = this.f28226b0.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z = this.f28224Z;
                        Object poll = mVar.poll();
                        boolean z2 = poll == null;
                        if (!mo30466a(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !mo30466a(this.f28224Z, mVar.isEmpty(), subscriber)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f28226b0.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30466a(boolean z, boolean z2, Subscriber<? super T> subscriber) {
            if (this.f28223Y) {
                this.f28219U.clear();
                return true;
            }
            if (z) {
                if (!this.f28220V) {
                    Throwable th = this.f28225a0;
                    if (th != null) {
                        this.f28219U.clear();
                        subscriber.onError(th);
                        return true;
                    } else if (z2) {
                        subscriber.onComplete();
                        return true;
                    }
                } else if (z2) {
                    Throwable th2 = this.f28225a0;
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f28228c0 = true;
            return 2;
        }
    }

    public C12217y(Flowable<T> flowable, int i, boolean z, boolean z2, C11945a aVar) {
        super(flowable);
        this.f28215V = i;
        this.f28216W = z;
        this.f28217X = z2;
        this.f28218Y = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        Flowable<T> flowable = this.f27888U;
        C12218a aVar = new C12218a(subscriber, this.f28215V, this.f28216W, this.f28217X, this.f28218Y);
        flowable.mo30080a((C11955i<? super T>) aVar);
    }
}
