package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12038a;
import p520io.reactivex.p531y.p546i.C12534b;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.r */
/* compiled from: FlowableFromArray */
public final class C12201r<T> extends Flowable<T> {

    /* renamed from: U */
    final T[] f28180U;

    /* renamed from: io.reactivex.y.e.b.r$a */
    /* compiled from: FlowableFromArray */
    static final class C12202a<T> extends C12204c<T> {

        /* renamed from: W */
        final C12038a<? super T> f28181W;

        C12202a(C12038a<? super T> aVar, T[] tArr) {
            super(tArr);
            this.f28181W = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30456a() {
            T[] tArr = this.f28185c;
            int length = tArr.length;
            C12038a<? super T> aVar = this.f28181W;
            int i = this.f28183U;
            while (i != length) {
                if (!this.f28184V) {
                    T t = tArr[i];
                    if (t == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("The element at index ");
                        sb.append(i);
                        sb.append(" is null");
                        aVar.onError(new NullPointerException(sb.toString()));
                        return;
                    }
                    aVar.mo30361a(t);
                    i++;
                } else {
                    return;
                }
            }
            if (!this.f28184V) {
                aVar.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30457a(long j) {
            T[] tArr = this.f28185c;
            int length = tArr.length;
            int i = this.f28183U;
            C12038a<? super T> aVar = this.f28181W;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.f28184V) {
                                aVar.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f28183U = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f28184V) {
                        T t = tArr[i];
                        if (t == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("The element at index ");
                            sb.append(i);
                            sb.append(" is null");
                            aVar.onError(new NullPointerException(sb.toString()));
                            return;
                        }
                        if (aVar.mo30361a(t)) {
                            j3++;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: io.reactivex.y.e.b.r$b */
    /* compiled from: FlowableFromArray */
    static final class C12203b<T> extends C12204c<T> {

        /* renamed from: W */
        final Subscriber<? super T> f28182W;

        C12203b(Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.f28182W = subscriber;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30456a() {
            T[] tArr = this.f28185c;
            int length = tArr.length;
            Subscriber<? super T> subscriber = this.f28182W;
            int i = this.f28183U;
            while (i != length) {
                if (!this.f28184V) {
                    T t = tArr[i];
                    if (t == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("The element at index ");
                        sb.append(i);
                        sb.append(" is null");
                        subscriber.onError(new NullPointerException(sb.toString()));
                        return;
                    }
                    subscriber.onNext(t);
                    i++;
                } else {
                    return;
                }
            }
            if (!this.f28184V) {
                subscriber.onComplete();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30457a(long j) {
            T[] tArr = this.f28185c;
            int length = tArr.length;
            int i = this.f28183U;
            Subscriber<? super T> subscriber = this.f28182W;
            long j2 = j;
            do {
                long j3 = 0;
                while (true) {
                    if (j3 == j2 || i == length) {
                        if (i == length) {
                            if (!this.f28184V) {
                                subscriber.onComplete();
                            }
                            return;
                        }
                        j2 = get();
                        if (j3 == j2) {
                            this.f28183U = i;
                            j2 = addAndGet(-j3);
                        }
                    } else if (!this.f28184V) {
                        T t = tArr[i];
                        if (t == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("The element at index ");
                            sb.append(i);
                            sb.append(" is null");
                            subscriber.onError(new NullPointerException(sb.toString()));
                            return;
                        }
                        subscriber.onNext(t);
                        j3++;
                        i++;
                    } else {
                        return;
                    }
                }
            } while (j2 != 0);
        }
    }

    /* renamed from: io.reactivex.y.e.b.r$c */
    /* compiled from: FlowableFromArray */
    static abstract class C12204c<T> extends C12534b<T> {

        /* renamed from: U */
        int f28183U;

        /* renamed from: V */
        volatile boolean f28184V;

        /* renamed from: c */
        final T[] f28185c;

        C12204c(T[] tArr) {
            this.f28185c = tArr;
        }

        /* renamed from: a */
        public final int mo30285a(int i) {
            return i & 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo30456a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo30457a(long j);

        /* renamed from: b */
        public final void mo29946b(long j) {
            if (C12539g.m39330c(j) && C12544d.m39341a((AtomicLong) this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo30456a();
                } else {
                    mo30457a(j);
                }
            }
        }

        public final void cancel() {
            this.f28184V = true;
        }

        public final void clear() {
            this.f28183U = this.f28185c.length;
        }

        public final boolean isEmpty() {
            return this.f28183U == this.f28185c.length;
        }

        public final T poll() {
            int i = this.f28183U;
            T[] tArr = this.f28185c;
            if (i == tArr.length) {
                return null;
            }
            this.f28183U = i + 1;
            T t = tArr[i];
            C12036b.m38663a(t, "array element is null");
            return t;
        }
    }

    public C12201r(T[] tArr) {
        this.f28180U = tArr;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        if (subscriber instanceof C12038a) {
            subscriber.mo29945a(new C12202a((C12038a) subscriber, this.f28180U));
        } else {
            subscriber.mo29945a(new C12203b(subscriber, this.f28180U));
        }
    }
}
