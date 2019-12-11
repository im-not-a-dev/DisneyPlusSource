package p520io.reactivex.processors;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.processors.PublishProcessor */
public final class PublishProcessor<T> extends C11964a<T> {

    /* renamed from: W */
    static final C11963a[] f27629W = new C11963a[0];

    /* renamed from: X */
    static final C11963a[] f27630X = new C11963a[0];

    /* renamed from: U */
    final AtomicReference<C11963a<T>[]> f27631U = new AtomicReference<>(f27630X);

    /* renamed from: V */
    Throwable f27632V;

    /* renamed from: io.reactivex.processors.PublishProcessor$a */
    static final class C11963a<T> extends AtomicLong implements C14314c {

        /* renamed from: U */
        final PublishProcessor<T> f27633U;

        /* renamed from: c */
        final Subscriber<? super T> f27634c;

        C11963a(Subscriber<? super T> subscriber, PublishProcessor<T> publishProcessor) {
            this.f27634c = subscriber;
            this.f27633U = publishProcessor;
        }

        /* renamed from: a */
        public void mo30274a(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    this.f27634c.onNext(t);
                    C12544d.m39344d(this, 1);
                } else {
                    cancel();
                    this.f27634c.onError(new C12004c("Could not emit value due to lack of requests"));
                }
            }
        }

        /* renamed from: b */
        public void mo30277b() {
            if (get() != Long.MIN_VALUE) {
                this.f27634c.onComplete();
            }
        }

        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f27633U.mo30273b(this);
            }
        }

        /* renamed from: b */
        public void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39342b(this, j);
            }
        }

        /* renamed from: a */
        public void mo30275a(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f27634c.onError(th);
            } else {
                C11915a.m38466b(th);
            }
        }

        /* renamed from: a */
        public boolean mo30276a() {
            return get() == Long.MIN_VALUE;
        }
    }

    PublishProcessor() {
    }

    /* renamed from: k */
    public static <T> PublishProcessor<T> m38521k() {
        return new PublishProcessor<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        C11963a aVar = new C11963a(subscriber, this);
        subscriber.mo29945a(aVar);
        if (!mo30272a(aVar)) {
            Throwable th = this.f27632V;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        } else if (aVar.mo30276a()) {
            mo30273b(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30273b(C11963a<T> aVar) {
        C11963a<T>[] aVarArr;
        C11963a[] aVarArr2;
        do {
            aVarArr = (C11963a[]) this.f27631U.get();
            if (aVarArr != f27629W && aVarArr != f27630X) {
                int length = aVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f27630X;
                    } else {
                        C11963a[] aVarArr3 = new C11963a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            }
        } while (!this.f27631U.compareAndSet(aVarArr, aVarArr2));
    }

    public void onComplete() {
        Object obj = this.f27631U.get();
        Object obj2 = f27629W;
        if (obj != obj2) {
            for (C11963a b : (C11963a[]) this.f27631U.getAndSet(obj2)) {
                b.mo30277b();
            }
        }
    }

    public void onError(Throwable th) {
        C12036b.m38663a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.f27631U.get();
        Object obj2 = f27629W;
        if (obj == obj2) {
            C11915a.m38466b(th);
            return;
        }
        this.f27632V = th;
        for (C11963a a : (C11963a[]) this.f27631U.getAndSet(obj2)) {
            a.mo30275a(th);
        }
    }

    public void onNext(T t) {
        C12036b.m38663a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (C11963a a : (C11963a[]) this.f27631U.get()) {
            a.mo30274a(t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30272a(C11963a<T> aVar) {
        C11963a[] aVarArr;
        C11963a[] aVarArr2;
        do {
            aVarArr = (C11963a[]) this.f27631U.get();
            if (aVarArr == f27629W) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C11963a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f27631U.compareAndSet(aVarArr, aVarArr2));
        return true;
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        if (this.f27631U.get() == f27629W) {
            cVar.cancel();
        } else {
            cVar.mo29946b(Long.MAX_VALUE);
        }
    }
}
