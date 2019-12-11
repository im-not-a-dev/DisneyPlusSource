package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.Flowable;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.b0 */
/* compiled from: FlowableOnBackpressureLatest */
public final class C12122b0<T> extends C12111a<T, T> {

    /* renamed from: io.reactivex.y.e.b.b0$a */
    /* compiled from: FlowableOnBackpressureLatest */
    static final class C12123a<T> extends AtomicInteger implements C11955i<T>, C14314c {

        /* renamed from: U */
        C14314c f27914U;

        /* renamed from: V */
        volatile boolean f27915V;

        /* renamed from: W */
        Throwable f27916W;

        /* renamed from: X */
        volatile boolean f27917X;

        /* renamed from: Y */
        final AtomicLong f27918Y = new AtomicLong();

        /* renamed from: Z */
        final AtomicReference<T> f27919Z = new AtomicReference<>();

        /* renamed from: c */
        final Subscriber<? super T> f27920c;

        C12123a(Subscriber<? super T> subscriber) {
            this.f27920c = subscriber;
        }

        /* renamed from: a */
        public void mo29945a(C14314c cVar) {
            if (C12539g.m39329a(this.f27914U, cVar)) {
                this.f27914U = cVar;
                this.f27920c.mo29945a(this);
                cVar.mo29946b(Long.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a(this.f27918Y, j);
                mo30397a();
            }
        }

        public void cancel() {
            if (!this.f27917X) {
                this.f27917X = true;
                this.f27914U.cancel();
                if (getAndIncrement() == 0) {
                    this.f27919Z.lazySet(null);
                }
            }
        }

        public void onComplete() {
            this.f27915V = true;
            mo30397a();
        }

        public void onError(Throwable th) {
            this.f27916W = th;
            this.f27915V = true;
            mo30397a();
        }

        public void onNext(T t) {
            this.f27919Z.lazySet(t);
            mo30397a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30397a() {
            boolean z;
            if (getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.f27920c;
                AtomicLong atomicLong = this.f27918Y;
                AtomicReference<T> atomicReference = this.f27919Z;
                int i = 1;
                do {
                    long j = 0;
                    while (true) {
                        z = false;
                        if (j == atomicLong.get()) {
                            break;
                        }
                        boolean z2 = this.f27915V;
                        Object andSet = atomicReference.getAndSet(null);
                        boolean z3 = andSet == null;
                        if (!mo30398a(z2, z3, subscriber, atomicReference)) {
                            if (z3) {
                                break;
                            }
                            subscriber.onNext(andSet);
                            j++;
                        } else {
                            return;
                        }
                    }
                    if (j == atomicLong.get()) {
                        boolean z4 = this.f27915V;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (mo30398a(z4, z, subscriber, atomicReference)) {
                            return;
                        }
                    }
                    if (j != 0) {
                        C12544d.m39343c(atomicLong, j);
                    }
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30398a(boolean z, boolean z2, Subscriber<?> subscriber, AtomicReference<T> atomicReference) {
            if (this.f27917X) {
                atomicReference.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th = this.f27916W;
                if (th != null) {
                    atomicReference.lazySet(null);
                    subscriber.onError(th);
                    return true;
                } else if (z2) {
                    subscriber.onComplete();
                    return true;
                }
            }
            return false;
        }
    }

    public C12122b0(Flowable<T> flowable) {
        super(flowable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27888U.mo30080a((C11955i<? super T>) new C12123a<Object>(subscriber));
    }
}
