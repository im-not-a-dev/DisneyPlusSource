package p520io.reactivex.processors;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p546i.C12533a;
import p520io.reactivex.p531y.p546i.C12536d;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.processors.c */
/* compiled from: UnicastProcessor */
public final class C11966c<T> extends C11964a<T> {

    /* renamed from: U */
    final C12491c<T> f27639U;

    /* renamed from: V */
    final AtomicReference<Runnable> f27640V;

    /* renamed from: W */
    final boolean f27641W;

    /* renamed from: X */
    volatile boolean f27642X;

    /* renamed from: Y */
    Throwable f27643Y;

    /* renamed from: Z */
    final AtomicReference<Subscriber<? super T>> f27644Z;

    /* renamed from: a0 */
    volatile boolean f27645a0;

    /* renamed from: b0 */
    final AtomicBoolean f27646b0;

    /* renamed from: c0 */
    final C12533a<T> f27647c0;

    /* renamed from: d0 */
    final AtomicLong f27648d0;

    /* renamed from: e0 */
    boolean f27649e0;

    /* renamed from: io.reactivex.processors.c$a */
    /* compiled from: UnicastProcessor */
    final class C11967a extends C12533a<T> {
        C11967a() {
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C11966c.this.f27649e0 = true;
            return 2;
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a(C11966c.this.f27648d0, j);
                C11966c.this.mo30284l();
            }
        }

        public void cancel() {
            if (!C11966c.this.f27645a0) {
                C11966c cVar = C11966c.this;
                cVar.f27645a0 = true;
                cVar.mo30283k();
                C11966c cVar2 = C11966c.this;
                if (!cVar2.f27649e0 && cVar2.f27647c0.getAndIncrement() == 0) {
                    C11966c.this.f27639U.clear();
                    C11966c.this.f27644Z.lazySet(null);
                }
            }
        }

        public void clear() {
            C11966c.this.f27639U.clear();
        }

        public boolean isEmpty() {
            return C11966c.this.f27639U.isEmpty();
        }

        public T poll() {
            return C11966c.this.f27639U.poll();
        }
    }

    C11966c(int i) {
        this(i, null, true);
    }

    /* renamed from: a */
    public static <T> C11966c<T> m38535a(int i) {
        return new C11966c<>(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30281b(Subscriber<? super T> subscriber) {
        C12491c<T> cVar = this.f27639U;
        int i = 1;
        boolean z = !this.f27641W;
        while (!this.f27645a0) {
            boolean z2 = this.f27642X;
            if (!z || !z2 || this.f27643Y == null) {
                subscriber.onNext(null);
                if (z2) {
                    this.f27644Z.lazySet(null);
                    Throwable th = this.f27643Y;
                    if (th != null) {
                        subscriber.onError(th);
                    } else {
                        subscriber.onComplete();
                    }
                    return;
                }
                i = this.f27647c0.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                cVar.clear();
                this.f27644Z.lazySet(null);
                subscriber.onError(this.f27643Y);
                return;
            }
        }
        cVar.clear();
        this.f27644Z.lazySet(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30282c(Subscriber<? super T> subscriber) {
        int i;
        long j;
        C12491c<T> cVar = this.f27639U;
        boolean z = !this.f27641W;
        int i2 = 1;
        while (true) {
            long j2 = this.f27648d0.get();
            long j3 = 0;
            while (true) {
                i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                if (i == 0) {
                    j = j3;
                    break;
                }
                boolean z2 = this.f27642X;
                Object poll = cVar.poll();
                boolean z3 = poll == null;
                Object obj = poll;
                j = j3;
                if (!mo30280a(z, z2, z3, subscriber, cVar)) {
                    if (z3) {
                        break;
                    }
                    subscriber.onNext(obj);
                    j3 = 1 + j;
                } else {
                    return;
                }
            }
            Subscriber<? super T> subscriber2 = subscriber;
            if (i == 0) {
                if (mo30280a(z, this.f27642X, cVar.isEmpty(), subscriber, cVar)) {
                    return;
                }
            }
            if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                this.f27648d0.addAndGet(-j);
            }
            i2 = this.f27647c0.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo30283k() {
        Runnable runnable = (Runnable) this.f27640V.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo30284l() {
        if (this.f27647c0.getAndIncrement() == 0) {
            int i = 1;
            Subscriber subscriber = (Subscriber) this.f27644Z.get();
            while (subscriber == null) {
                i = this.f27647c0.addAndGet(-i);
                if (i != 0) {
                    subscriber = (Subscriber) this.f27644Z.get();
                } else {
                    return;
                }
            }
            if (this.f27649e0) {
                mo30281b(subscriber);
            } else {
                mo30282c(subscriber);
            }
        }
    }

    public void onComplete() {
        if (!this.f27642X && !this.f27645a0) {
            this.f27642X = true;
            mo30283k();
            mo30284l();
        }
    }

    public void onError(Throwable th) {
        C12036b.m38663a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f27642X || this.f27645a0) {
            C11915a.m38466b(th);
            return;
        }
        this.f27643Y = th;
        this.f27642X = true;
        mo30283k();
        mo30284l();
    }

    public void onNext(T t) {
        C12036b.m38663a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f27642X && !this.f27645a0) {
            this.f27639U.offer(t);
            mo30284l();
        }
    }

    C11966c(int i, Runnable runnable, boolean z) {
        C12036b.m38660a(i, "capacityHint");
        this.f27639U = new C12491c<>(i);
        this.f27640V = new AtomicReference<>(runnable);
        this.f27641W = z;
        this.f27644Z = new AtomicReference<>();
        this.f27646b0 = new AtomicBoolean();
        this.f27647c0 = new C11967a();
        this.f27648d0 = new AtomicLong();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30280a(boolean z, boolean z2, boolean z3, Subscriber<? super T> subscriber, C12491c<T> cVar) {
        if (this.f27645a0) {
            cVar.clear();
            this.f27644Z.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.f27643Y != null) {
                cVar.clear();
                this.f27644Z.lazySet(null);
                subscriber.onError(this.f27643Y);
                return true;
            } else if (z3) {
                Throwable th = this.f27643Y;
                this.f27644Z.lazySet(null);
                if (th != null) {
                    subscriber.onError(th);
                } else {
                    subscriber.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        if (this.f27642X || this.f27645a0) {
            cVar.cancel();
        } else {
            cVar.mo29946b(Long.MAX_VALUE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        if (this.f27646b0.get() || !this.f27646b0.compareAndSet(false, true)) {
            C12536d.m39310a(new IllegalStateException("This processor allows only a single Subscriber"), subscriber);
            return;
        }
        subscriber.mo29945a(this.f27647c0);
        this.f27644Z.set(subscriber);
        if (this.f27645a0) {
            this.f27644Z.lazySet(null);
        } else {
            mo30284l();
        }
    }
}
