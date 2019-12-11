package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.C11969r;
import p520io.reactivex.C11969r.C11972c;
import p520io.reactivex.Flowable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p534c.C12048k;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p543f.C12490b;
import p520io.reactivex.p531y.p546i.C12533a;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.x */
/* compiled from: FlowableObserveOn */
public final class C12213x<T> extends C12111a<T, T> {

    /* renamed from: V */
    final C11969r f28196V;

    /* renamed from: W */
    final boolean f28197W;

    /* renamed from: X */
    final int f28198X;

    /* renamed from: io.reactivex.y.e.b.x$a */
    /* compiled from: FlowableObserveOn */
    static abstract class C12214a<T> extends C12533a<T> implements C11955i<T>, Runnable {

        /* renamed from: U */
        final boolean f28199U;

        /* renamed from: V */
        final int f28200V;

        /* renamed from: W */
        final int f28201W;

        /* renamed from: X */
        final AtomicLong f28202X = new AtomicLong();

        /* renamed from: Y */
        C14314c f28203Y;

        /* renamed from: Z */
        C12051n<T> f28204Z;

        /* renamed from: a0 */
        volatile boolean f28205a0;

        /* renamed from: b0 */
        volatile boolean f28206b0;

        /* renamed from: c */
        final C11972c f28207c;

        /* renamed from: c0 */
        Throwable f28208c0;

        /* renamed from: d0 */
        int f28209d0;

        /* renamed from: e0 */
        long f28210e0;

        /* renamed from: f0 */
        boolean f28211f0;

        C12214a(C11972c cVar, boolean z, int i) {
            this.f28207c = cVar;
            this.f28199U = z;
            this.f28200V = i;
            this.f28201W = i - (i >> 2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo30459a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo30460a(boolean z, boolean z2, Subscriber<?> subscriber) {
            if (this.f28205a0) {
                clear();
                return true;
            }
            if (z) {
                if (!this.f28199U) {
                    Throwable th = this.f28208c0;
                    if (th != null) {
                        this.f28205a0 = true;
                        clear();
                        subscriber.onError(th);
                        this.f28207c.dispose();
                        return true;
                    } else if (z2) {
                        this.f28205a0 = true;
                        subscriber.onComplete();
                        this.f28207c.dispose();
                        return true;
                    }
                } else if (z2) {
                    this.f28205a0 = true;
                    Throwable th2 = this.f28208c0;
                    if (th2 != null) {
                        subscriber.onError(th2);
                    } else {
                        subscriber.onComplete();
                    }
                    this.f28207c.dispose();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo30461b();

        /* renamed from: b */
        public final void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a(this.f28202X, j);
                mo30463d();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract void mo30462c();

        public final void cancel() {
            if (!this.f28205a0) {
                this.f28205a0 = true;
                this.f28203Y.cancel();
                this.f28207c.dispose();
                if (getAndIncrement() == 0) {
                    this.f28204Z.clear();
                }
            }
        }

        public final void clear() {
            this.f28204Z.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo30463d() {
            if (getAndIncrement() == 0) {
                this.f28207c.mo30296a((Runnable) this);
            }
        }

        public final boolean isEmpty() {
            return this.f28204Z.isEmpty();
        }

        public final void onComplete() {
            if (!this.f28206b0) {
                this.f28206b0 = true;
                mo30463d();
            }
        }

        public final void onError(Throwable th) {
            if (this.f28206b0) {
                C11915a.m38466b(th);
                return;
            }
            this.f28208c0 = th;
            this.f28206b0 = true;
            mo30463d();
        }

        public final void onNext(T t) {
            if (!this.f28206b0) {
                if (this.f28209d0 == 2) {
                    mo30463d();
                    return;
                }
                if (!this.f28204Z.offer(t)) {
                    this.f28203Y.cancel();
                    this.f28208c0 = new C12004c("Queue is full?!");
                    this.f28206b0 = true;
                }
                mo30463d();
            }
        }

        public final void run() {
            if (this.f28211f0) {
                mo30461b();
            } else if (this.f28209d0 == 1) {
                mo30462c();
            } else {
                mo30459a();
            }
        }

        /* renamed from: a */
        public final int mo30285a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f28211f0 = true;
            return 2;
        }
    }

    /* renamed from: io.reactivex.y.e.b.x$b */
    /* compiled from: FlowableObserveOn */
    static final class C12215b<T> extends C12214a<T> {

        /* renamed from: g0 */
        final C12038a<? super T> f28212g0;

        /* renamed from: h0 */
        long f28213h0;

        C12215b(C12038a<? super T> aVar, C11972c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f28212g0 = aVar;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28203Y, cVar)) {
                this.f28203Y = cVar;
                if (cVar instanceof C12048k) {
                    C12048k kVar = (C12048k) cVar;
                    int a = kVar.mo30285a(7);
                    if (a == 1) {
                        this.f28209d0 = 1;
                        this.f28204Z = kVar;
                        this.f28206b0 = true;
                        this.f28212g0.mo29945a(this);
                        return;
                    } else if (a == 2) {
                        this.f28209d0 = 2;
                        this.f28204Z = kVar;
                        this.f28212g0.mo29945a(this);
                        cVar.mo29946b((long) this.f28200V);
                        return;
                    }
                }
                this.f28204Z = new C12490b(this.f28200V);
                this.f28212g0.mo29945a(this);
                cVar.mo29946b((long) this.f28200V);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30461b() {
            int i = 1;
            while (!this.f28205a0) {
                boolean z = this.f28206b0;
                this.f28212g0.onNext(null);
                if (z) {
                    this.f28205a0 = true;
                    Throwable th = this.f28208c0;
                    if (th != null) {
                        this.f28212g0.onError(th);
                    } else {
                        this.f28212g0.onComplete();
                    }
                    this.f28207c.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30462c() {
            C12038a<? super T> aVar = this.f28212g0;
            C12051n<T> nVar = this.f28204Z;
            long j = this.f28210e0;
            int i = 1;
            while (true) {
                long j2 = this.f28202X.get();
                while (j != j2) {
                    try {
                        Object poll = nVar.poll();
                        if (!this.f28205a0) {
                            if (poll == null) {
                                this.f28205a0 = true;
                                aVar.onComplete();
                                this.f28207c.dispose();
                                return;
                            } else if (aVar.mo30361a(poll)) {
                                j++;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        this.f28205a0 = true;
                        this.f28203Y.cancel();
                        aVar.onError(th);
                        this.f28207c.dispose();
                        return;
                    }
                }
                if (!this.f28205a0) {
                    if (nVar.isEmpty()) {
                        this.f28205a0 = true;
                        aVar.onComplete();
                        this.f28207c.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f28210e0 = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.f28204Z.poll();
            if (!(poll == null || this.f28209d0 == 1)) {
                long j = this.f28213h0 + 1;
                if (j == ((long) this.f28201W)) {
                    this.f28213h0 = 0;
                    this.f28203Y.mo29946b(j);
                } else {
                    this.f28213h0 = j;
                }
            }
            return poll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30459a() {
            int i;
            C12038a<? super T> aVar = this.f28212g0;
            C12051n<T> nVar = this.f28204Z;
            long j = this.f28210e0;
            long j2 = this.f28213h0;
            int i2 = 1;
            while (true) {
                long j3 = this.f28202X.get();
                while (true) {
                    i = (j > j3 ? 1 : (j == j3 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f28206b0;
                    try {
                        Object poll = nVar.poll();
                        boolean z2 = poll == null;
                        if (!mo30460a(z, z2, aVar)) {
                            if (z2) {
                                break;
                            }
                            if (aVar.mo30361a(poll)) {
                                j++;
                            }
                            j2++;
                            if (j2 == ((long) this.f28201W)) {
                                this.f28203Y.mo29946b(j2);
                                j2 = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        this.f28205a0 = true;
                        this.f28203Y.cancel();
                        nVar.clear();
                        aVar.onError(th);
                        this.f28207c.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo30460a(this.f28206b0, nVar.isEmpty(), aVar)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f28210e0 = j;
                        this.f28213h0 = j2;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: io.reactivex.y.e.b.x$c */
    /* compiled from: FlowableObserveOn */
    static final class C12216c<T> extends C12214a<T> implements C11955i<T> {

        /* renamed from: g0 */
        final Subscriber<? super T> f28214g0;

        C12216c(Subscriber<? super T> subscriber, C11972c cVar, boolean z, int i) {
            super(cVar, z, i);
            this.f28214g0 = subscriber;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f28203Y, cVar)) {
                this.f28203Y = cVar;
                if (cVar instanceof C12048k) {
                    C12048k kVar = (C12048k) cVar;
                    int a = kVar.mo30285a(7);
                    if (a == 1) {
                        this.f28209d0 = 1;
                        this.f28204Z = kVar;
                        this.f28206b0 = true;
                        this.f28214g0.mo29945a(this);
                        return;
                    } else if (a == 2) {
                        this.f28209d0 = 2;
                        this.f28204Z = kVar;
                        this.f28214g0.mo29945a(this);
                        cVar.mo29946b((long) this.f28200V);
                        return;
                    }
                }
                this.f28204Z = new C12490b(this.f28200V);
                this.f28214g0.mo29945a(this);
                cVar.mo29946b((long) this.f28200V);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30461b() {
            int i = 1;
            while (!this.f28205a0) {
                boolean z = this.f28206b0;
                this.f28214g0.onNext(null);
                if (z) {
                    this.f28205a0 = true;
                    Throwable th = this.f28208c0;
                    if (th != null) {
                        this.f28214g0.onError(th);
                    } else {
                        this.f28214g0.onComplete();
                    }
                    this.f28207c.dispose();
                    return;
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30462c() {
            Subscriber<? super T> subscriber = this.f28214g0;
            C12051n<T> nVar = this.f28204Z;
            long j = this.f28210e0;
            int i = 1;
            while (true) {
                long j2 = this.f28202X.get();
                while (j != j2) {
                    try {
                        Object poll = nVar.poll();
                        if (!this.f28205a0) {
                            if (poll == null) {
                                this.f28205a0 = true;
                                subscriber.onComplete();
                                this.f28207c.dispose();
                                return;
                            }
                            subscriber.onNext(poll);
                            j++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        this.f28205a0 = true;
                        this.f28203Y.cancel();
                        subscriber.onError(th);
                        this.f28207c.dispose();
                        return;
                    }
                }
                if (!this.f28205a0) {
                    if (nVar.isEmpty()) {
                        this.f28205a0 = true;
                        subscriber.onComplete();
                        this.f28207c.dispose();
                        return;
                    }
                    int i2 = get();
                    if (i == i2) {
                        this.f28210e0 = j;
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        i = i2;
                    }
                } else {
                    return;
                }
            }
        }

        public T poll() throws Exception {
            T poll = this.f28204Z.poll();
            if (!(poll == null || this.f28209d0 == 1)) {
                long j = this.f28210e0 + 1;
                if (j == ((long) this.f28201W)) {
                    this.f28210e0 = 0;
                    this.f28203Y.mo29946b(j);
                } else {
                    this.f28210e0 = j;
                }
            }
            return poll;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30459a() {
            int i;
            Subscriber<? super T> subscriber = this.f28214g0;
            C12051n<T> nVar = this.f28204Z;
            long j = this.f28210e0;
            int i2 = 1;
            while (true) {
                long j2 = this.f28202X.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i == 0) {
                        break;
                    }
                    boolean z = this.f28206b0;
                    try {
                        Object poll = nVar.poll();
                        boolean z2 = poll == null;
                        if (!mo30460a(z, z2, subscriber)) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j++;
                            if (j == ((long) this.f28201W)) {
                                if (j2 != Long.MAX_VALUE) {
                                    j2 = this.f28202X.addAndGet(-j);
                                }
                                this.f28203Y.mo29946b(j);
                                j = 0;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12003b.m38614b(th);
                        this.f28205a0 = true;
                        this.f28203Y.cancel();
                        nVar.clear();
                        subscriber.onError(th);
                        this.f28207c.dispose();
                        return;
                    }
                }
                if (i != 0 || !mo30460a(this.f28206b0, nVar.isEmpty(), subscriber)) {
                    int i3 = get();
                    if (i2 == i3) {
                        this.f28210e0 = j;
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        i2 = i3;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C12213x(Flowable<T> flowable, C11969r rVar, boolean z, int i) {
        super(flowable);
        this.f28196V = rVar;
        this.f28197W = z;
        this.f28198X = i;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        C11972c a = this.f28196V.mo30292a();
        if (subscriber instanceof C12038a) {
            this.f27888U.mo30080a((C11955i<? super T>) new C12215b<Object>((C12038a) subscriber, a, this.f28197W, this.f28198X));
        } else {
            this.f27888U.mo30080a((C11955i<? super T>) new C12216c<Object>(subscriber, a, this.f28197W, this.f28198X));
        }
    }
}
