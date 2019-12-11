package p520io.reactivex.p531y.p536e.p539c;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11958l;
import p520io.reactivex.Flowable;
import p520io.reactivex.MaybeSource;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12014g;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;
import p520io.reactivex.p531y.p547j.C12551j;

/* renamed from: io.reactivex.y.e.c.c */
/* compiled from: MaybeConcatArray */
public final class C12229c<T> extends Flowable<T> {

    /* renamed from: U */
    final MaybeSource<? extends T>[] f28249U;

    /* renamed from: io.reactivex.y.e.c.c$a */
    /* compiled from: MaybeConcatArray */
    static final class C12230a<T> extends AtomicInteger implements C11958l<T>, C14314c {

        /* renamed from: U */
        final AtomicLong f28250U = new AtomicLong();

        /* renamed from: V */
        final AtomicReference<Object> f28251V = new AtomicReference<>(C12551j.COMPLETE);

        /* renamed from: W */
        final C12014g f28252W = new C12014g();

        /* renamed from: X */
        final MaybeSource<? extends T>[] f28253X;

        /* renamed from: Y */
        int f28254Y;

        /* renamed from: Z */
        long f28255Z;

        /* renamed from: c */
        final Subscriber<? super T> f28256c;

        C12230a(Subscriber<? super T> subscriber, MaybeSource<? extends T>[] maybeSourceArr) {
            this.f28256c = subscriber;
            this.f28253X = maybeSourceArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30467a() {
            if (getAndIncrement() == 0) {
                AtomicReference<Object> atomicReference = this.f28251V;
                Subscriber<? super T> subscriber = this.f28256c;
                C12014g gVar = this.f28252W;
                while (!gVar.isDisposed()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        boolean z = true;
                        if (obj != C12551j.COMPLETE) {
                            long j = this.f28255Z;
                            if (j != this.f28250U.get()) {
                                this.f28255Z = j + 1;
                                atomicReference.lazySet(null);
                                subscriber.onNext(obj);
                            } else {
                                z = false;
                            }
                        } else {
                            atomicReference.lazySet(null);
                        }
                        if (z && !gVar.isDisposed()) {
                            int i = this.f28254Y;
                            MaybeSource<? extends T>[] maybeSourceArr = this.f28253X;
                            if (i == maybeSourceArr.length) {
                                subscriber.onComplete();
                                return;
                            } else {
                                this.f28254Y = i + 1;
                                maybeSourceArr[i].mo30113a(this);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a(this.f28250U, j);
                mo30467a();
            }
        }

        public void cancel() {
            this.f28252W.dispose();
        }

        public void onComplete() {
            this.f28251V.lazySet(C12551j.COMPLETE);
            mo30467a();
        }

        public void onError(Throwable th) {
            this.f28256c.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f28252W.mo30345a(disposable);
        }

        public void onSuccess(T t) {
            this.f28251V.lazySet(t);
            mo30467a();
        }
    }

    public C12229c(MaybeSource<? extends T>[] maybeSourceArr) {
        this.f28249U = maybeSourceArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        C12230a aVar = new C12230a(subscriber, this.f28249U);
        subscriber.mo29945a(aVar);
        aVar.mo30467a();
    }
}
