package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p546i.C12534b;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.c0 */
/* compiled from: FlowableRange */
public final class C12125c0 extends Flowable<Integer> {

    /* renamed from: U */
    final int f27925U;

    /* renamed from: V */
    final int f27926V;

    /* renamed from: io.reactivex.y.e.b.c0$a */
    /* compiled from: FlowableRange */
    static abstract class C12126a extends C12534b<Integer> {

        /* renamed from: U */
        int f27927U;

        /* renamed from: V */
        volatile boolean f27928V;

        /* renamed from: c */
        final int f27929c;

        C12126a(int i, int i2) {
            this.f27927U = i;
            this.f27929c = i2;
        }

        /* renamed from: a */
        public final int mo30285a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo30399a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo30400a(long j);

        /* renamed from: b */
        public final void mo29946b(long j) {
            if (C12539g.m39330c(j) && C12544d.m39341a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo30399a();
                } else {
                    mo30400a(j);
                }
            }
        }

        public final void cancel() {
            this.f27928V = true;
        }

        public final void clear() {
            this.f27927U = this.f27929c;
        }

        public final boolean isEmpty() {
            return this.f27927U == this.f27929c;
        }

        public final Integer poll() {
            int i = this.f27927U;
            if (i == this.f27929c) {
                return null;
            }
            this.f27927U = i + 1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: io.reactivex.y.e.b.c0$b */
    /* compiled from: FlowableRange */
    static final class C12127b extends C12126a {

        /* renamed from: W */
        final C12038a<? super Integer> f27930W;

        C12127b(C12038a<? super Integer> aVar, int i, int i2) {
            super(i, i2);
            this.f27930W = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30399a() {
            int i = this.f27929c;
            C12038a<? super Integer> aVar = this.f27930W;
            int i2 = this.f27927U;
            while (i2 != i) {
                if (!this.f27928V) {
                    aVar.mo30361a(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.f27928V) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30400a(long j) {
            int i = this.f27929c;
            int i2 = this.f27927U;
            C12038a<? super Integer> aVar = this.f27930W;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.f27928V) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f27927U = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f27928V) {
                        if (aVar.mo30361a(Integer.valueOf(i2))) {
                            j3++;
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: io.reactivex.y.e.b.c0$c */
    /* compiled from: FlowableRange */
    static final class C12128c extends C12126a {

        /* renamed from: W */
        final Subscriber<? super Integer> f27931W;

        C12128c(Subscriber<? super Integer> subscriber, int i, int i2) {
            super(i, i2);
            this.f27931W = subscriber;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30399a() {
            int i = this.f27929c;
            Subscriber<? super Integer> subscriber = this.f27931W;
            int i2 = this.f27927U;
            while (i2 != i) {
                if (!this.f27928V) {
                    subscriber.onNext(Integer.valueOf(i2));
                    i2++;
                } else {
                    return;
                }
            }
            if (!this.f27928V) {
                subscriber.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30400a(long j) {
            int i = this.f27929c;
            int i2 = this.f27927U;
            Subscriber<? super Integer> subscriber = this.f27931W;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i2 == i) {
                        if (i2 == i) {
                            if (!this.f27928V) {
                                subscriber.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f27927U = i2;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f27928V) {
                        subscriber.onNext(Integer.valueOf(i2));
                        j3++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    public C12125c0(int i, int i2) {
        this.f27925U = i;
        this.f27926V = i + i2;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super Integer> subscriber) {
        if (subscriber instanceof C12038a) {
            subscriber.mo29945a(new C12127b((C12038a) subscriber, this.f27925U, this.f27926V));
        } else {
            subscriber.mo29945a(new C12128c(subscriber, this.f27925U, this.f27926V));
        }
    }
}
