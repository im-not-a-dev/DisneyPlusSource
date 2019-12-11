package p520io.reactivex.p531y.p536e.p538b;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11907a;
import p520io.reactivex.C11943f;
import p520io.reactivex.C11953g;
import p520io.reactivex.Flowable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p530x.C12003b;
import p520io.reactivex.p530x.C12004c;
import p520io.reactivex.p531y.p532a.C12014g;
import p520io.reactivex.p531y.p543f.C12491c;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12544d;

/* renamed from: io.reactivex.y.e.b.d */
/* compiled from: FlowableCreate */
public final class C12129d<T> extends Flowable<T> {

    /* renamed from: U */
    final C11953g<T> f27932U;

    /* renamed from: V */
    final C11907a f27933V;

    /* renamed from: io.reactivex.y.e.b.d$a */
    /* compiled from: FlowableCreate */
    static /* synthetic */ class C12130a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27934a = new int[C11907a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.reactivex.a[] r0 = p520io.reactivex.C11907a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27934a = r0
                int[] r0 = f27934a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.reactivex.a r1 = p520io.reactivex.C11907a.MISSING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f27934a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.reactivex.a r1 = p520io.reactivex.C11907a.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27934a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.reactivex.a r1 = p520io.reactivex.C11907a.DROP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f27934a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.reactivex.a r1 = p520io.reactivex.C11907a.LATEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p538b.C12129d.C12130a.<clinit>():void");
        }
    }

    /* renamed from: io.reactivex.y.e.b.d$b */
    /* compiled from: FlowableCreate */
    static abstract class C12131b<T> extends AtomicLong implements C11943f<T>, C14314c {

        /* renamed from: U */
        final C12014g f27935U = new C12014g();

        /* renamed from: c */
        final Subscriber<? super T> f27936c;

        C12131b(Subscriber<? super T> subscriber) {
            this.f27936c = subscriber;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo30401a() {
            if (!isCancelled()) {
                try {
                    this.f27936c.onComplete();
                } finally {
                    this.f27935U.dispose();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30403b() {
        }

        /* renamed from: b */
        public boolean mo30404b(Throwable th) {
            return mo30402a(th);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30405c() {
        }

        public final void cancel() {
            this.f27935U.dispose();
            mo30405c();
        }

        public final boolean isCancelled() {
            return this.f27935U.isDisposed();
        }

        public final void onError(Throwable th) {
            if (!mo30404b(th)) {
                C11915a.m38466b(th);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        /* renamed from: b */
        public final void mo29946b(long j) {
            if (C12539g.m39330c(j)) {
                C12544d.m39341a((AtomicLong) this, j);
                mo30403b();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo30402a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.f27936c.onError(th);
                this.f27935U.dispose();
                return true;
            } catch (Throwable th2) {
                this.f27935U.dispose();
                throw th2;
            }
        }

        /* renamed from: a */
        public final void mo30260a(Disposable disposable) {
            this.f27935U.mo30346b(disposable);
        }
    }

    /* renamed from: io.reactivex.y.e.b.d$c */
    /* compiled from: FlowableCreate */
    static final class C12132c<T> extends C12131b<T> {

        /* renamed from: V */
        final C12491c<T> f27937V;

        /* renamed from: W */
        Throwable f27938W;

        /* renamed from: X */
        volatile boolean f27939X;

        /* renamed from: Y */
        final AtomicInteger f27940Y = new AtomicInteger();

        C12132c(Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.f27937V = new C12491c<>(i);
        }

        /* renamed from: b */
        public boolean mo30404b(Throwable th) {
            if (this.f27939X || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f27938W = th;
            this.f27939X = true;
            mo30407d();
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30405c() {
            if (this.f27940Y.getAndIncrement() == 0) {
                this.f27937V.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30407d() {
            int i;
            if (this.f27940Y.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.f27936c;
                C12491c<T> cVar = this.f27937V;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            cVar.clear();
                            return;
                        } else {
                            boolean z = this.f27939X;
                            Object poll = cVar.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable th = this.f27938W;
                                if (th != null) {
                                    mo30402a(th);
                                } else {
                                    mo30401a();
                                }
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                subscriber.onNext(poll);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            cVar.clear();
                            return;
                        }
                        boolean z3 = this.f27939X;
                        boolean isEmpty = cVar.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.f27938W;
                            if (th2 != null) {
                                mo30402a(th2);
                            } else {
                                mo30401a();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C12544d.m39343c(this, j2);
                    }
                    i2 = this.f27940Y.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        public void onNext(T t) {
            if (!this.f27939X && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f27937V.offer(t);
                    mo30407d();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30403b() {
            mo30407d();
        }
    }

    /* renamed from: io.reactivex.y.e.b.d$d */
    /* compiled from: FlowableCreate */
    static final class C12133d<T> extends C12137h<T> {
        C12133d(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30408d() {
        }
    }

    /* renamed from: io.reactivex.y.e.b.d$e */
    /* compiled from: FlowableCreate */
    static final class C12134e<T> extends C12137h<T> {
        C12134e(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30408d() {
            onError(new C12004c("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: io.reactivex.y.e.b.d$f */
    /* compiled from: FlowableCreate */
    static final class C12135f<T> extends C12131b<T> {

        /* renamed from: V */
        final AtomicReference<T> f27941V = new AtomicReference<>();

        /* renamed from: W */
        Throwable f27942W;

        /* renamed from: X */
        volatile boolean f27943X;

        /* renamed from: Y */
        final AtomicInteger f27944Y = new AtomicInteger();

        C12135f(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        /* renamed from: b */
        public boolean mo30404b(Throwable th) {
            if (this.f27943X || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.f27942W = th;
            this.f27943X = true;
            mo30409d();
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo30405c() {
            if (this.f27944Y.getAndIncrement() == 0) {
                this.f27941V.lazySet(null);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo30409d() {
            boolean z;
            int i;
            if (this.f27944Y.getAndIncrement() == 0) {
                Subscriber<? super T> subscriber = this.f27936c;
                AtomicReference<T> atomicReference = this.f27941V;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z2 = this.f27943X;
                            Object andSet = atomicReference.getAndSet(null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.f27942W;
                                if (th != null) {
                                    mo30402a(th);
                                } else {
                                    mo30401a();
                                }
                                return;
                            } else if (z3) {
                                break;
                            } else {
                                subscriber.onNext(andSet);
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z4 = this.f27943X;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.f27942W;
                            if (th2 != null) {
                                mo30402a(th2);
                            } else {
                                mo30401a();
                            }
                            return;
                        }
                    }
                    if (j2 != 0) {
                        C12544d.m39343c(this, j2);
                    }
                    i2 = this.f27944Y.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        public void onNext(T t) {
            if (!this.f27943X && !isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f27941V.set(t);
                    mo30409d();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30403b() {
            mo30409d();
        }
    }

    /* renamed from: io.reactivex.y.e.b.d$g */
    /* compiled from: FlowableCreate */
    static final class C12136g<T> extends C12131b<T> {
        C12136g(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            long j;
            if (!isCancelled()) {
                if (t != null) {
                    this.f27936c.onNext(t);
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: io.reactivex.y.e.b.d$h */
    /* compiled from: FlowableCreate */
    static abstract class C12137h<T> extends C12131b<T> {
        C12137h(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo30408d();

        public final void onNext(T t) {
            if (!isCancelled()) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0) {
                    this.f27936c.onNext(t);
                    C12544d.m39343c(this, 1);
                } else {
                    mo30408d();
                }
            }
        }
    }

    public C12129d(C11953g<T> gVar, C11907a aVar) {
        this.f27932U = gVar;
        this.f27933V = aVar;
    }

    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        C12131b bVar;
        int i = C12130a.f27934a[this.f27933V.ordinal()];
        if (i == 1) {
            bVar = new C12136g(subscriber);
        } else if (i == 2) {
            bVar = new C12134e(subscriber);
        } else if (i == 3) {
            bVar = new C12133d(subscriber);
        } else if (i != 4) {
            bVar = new C12132c(subscriber, Flowable.m38208h());
        } else {
            bVar = new C12135f(subscriber);
        }
        subscriber.mo29945a(bVar);
        try {
            this.f27932U.mo5273a(bVar);
        } catch (Throwable th) {
            C12003b.m38614b(th);
            bVar.onError(th);
        }
    }
}
