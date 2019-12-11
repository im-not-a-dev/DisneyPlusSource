package p520io.reactivex.subjects;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12011d;
import p520io.reactivex.p531y.p533b.C12036b;
import p520io.reactivex.p531y.p534c.C12051n;
import p520io.reactivex.p531y.p535d.C12053b;
import p520io.reactivex.p531y.p543f.C12491c;

/* renamed from: io.reactivex.subjects.f */
/* compiled from: UnicastSubject */
public final class C11984f<T> extends C11983e<T> {

    /* renamed from: U */
    final AtomicReference<C11968q<? super T>> f27705U;

    /* renamed from: V */
    final AtomicReference<Runnable> f27706V = new AtomicReference<>();

    /* renamed from: W */
    final boolean f27707W;

    /* renamed from: X */
    volatile boolean f27708X;

    /* renamed from: Y */
    volatile boolean f27709Y;

    /* renamed from: Z */
    Throwable f27710Z;

    /* renamed from: a0 */
    final AtomicBoolean f27711a0;

    /* renamed from: b0 */
    final C12053b<T> f27712b0;

    /* renamed from: c */
    final C12491c<T> f27713c;

    /* renamed from: c0 */
    boolean f27714c0;

    /* renamed from: io.reactivex.subjects.f$a */
    /* compiled from: UnicastSubject */
    final class C11985a extends C12053b<T> {
        C11985a() {
        }

        /* renamed from: a */
        public int mo30285a(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C11984f.this.f27714c0 = true;
            return 2;
        }

        public void clear() {
            C11984f.this.f27713c.clear();
        }

        public void dispose() {
            if (!C11984f.this.f27708X) {
                C11984f fVar = C11984f.this;
                fVar.f27708X = true;
                fVar.mo30325o();
                C11984f.this.f27705U.lazySet(null);
                if (C11984f.this.f27712b0.getAndIncrement() == 0) {
                    C11984f.this.f27705U.lazySet(null);
                    C11984f.this.f27713c.clear();
                }
            }
        }

        public boolean isDisposed() {
            return C11984f.this.f27708X;
        }

        public boolean isEmpty() {
            return C11984f.this.f27713c.isEmpty();
        }

        public T poll() throws Exception {
            return C11984f.this.f27713c.poll();
        }
    }

    C11984f(int i, boolean z) {
        C12036b.m38660a(i, "capacityHint");
        this.f27713c = new C12491c<>(i);
        this.f27707W = z;
        this.f27705U = new AtomicReference<>();
        this.f27711a0 = new AtomicBoolean();
        this.f27712b0 = new C11985a();
    }

    /* renamed from: q */
    public static <T> C11984f<T> m38584q() {
        return new C11984f<>(Observable.m38313l(), true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30321a(C12051n<T> nVar, C11968q<? super T> qVar) {
        Throwable th = this.f27710Z;
        if (th == null) {
            return false;
        }
        this.f27705U.lazySet(null);
        nVar.clear();
        qVar.onError(th);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        if (this.f27711a0.get() || !this.f27711a0.compareAndSet(false, true)) {
            C12011d.m38631a((Throwable) new IllegalStateException("Only a single observer allowed."), qVar);
        } else {
            qVar.onSubscribe(this.f27712b0);
            this.f27705U.lazySet(qVar);
            if (this.f27708X) {
                this.f27705U.lazySet(null);
                return;
            }
            mo30326p();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30322c(C11968q<? super T> qVar) {
        C12491c<T> cVar = this.f27713c;
        int i = 1;
        boolean z = !this.f27707W;
        while (!this.f27708X) {
            boolean z2 = this.f27709Y;
            if (!z || !z2 || !mo30321a(cVar, qVar)) {
                qVar.onNext(null);
                if (z2) {
                    mo30324e(qVar);
                    return;
                }
                i = this.f27712b0.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f27705U.lazySet(null);
        cVar.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo30323d(C11968q<? super T> qVar) {
        C12491c<T> cVar = this.f27713c;
        boolean z = !this.f27707W;
        boolean z2 = true;
        int i = 1;
        while (!this.f27708X) {
            boolean z3 = this.f27709Y;
            Object poll = this.f27713c.poll();
            boolean z4 = poll == null;
            if (z3) {
                if (z && z2) {
                    if (!mo30321a(cVar, qVar)) {
                        z2 = false;
                    } else {
                        return;
                    }
                }
                if (z4) {
                    mo30324e(qVar);
                    return;
                }
            }
            if (z4) {
                i = this.f27712b0.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                qVar.onNext(poll);
            }
        }
        this.f27705U.lazySet(null);
        cVar.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo30324e(C11968q<? super T> qVar) {
        this.f27705U.lazySet(null);
        Throwable th = this.f27710Z;
        if (th != null) {
            qVar.onError(th);
        } else {
            qVar.onComplete();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo30325o() {
        Runnable runnable = (Runnable) this.f27706V.get();
        if (runnable != null && this.f27706V.compareAndSet(runnable, null)) {
            runnable.run();
        }
    }

    public void onComplete() {
        if (!this.f27709Y && !this.f27708X) {
            this.f27709Y = true;
            mo30325o();
            mo30326p();
        }
    }

    public void onError(Throwable th) {
        C12036b.m38663a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f27709Y || this.f27708X) {
            C11915a.m38466b(th);
            return;
        }
        this.f27710Z = th;
        this.f27709Y = true;
        mo30325o();
        mo30326p();
    }

    public void onNext(T t) {
        C12036b.m38663a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f27709Y && !this.f27708X) {
            this.f27713c.offer(t);
            mo30326p();
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f27709Y || this.f27708X) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo30326p() {
        if (this.f27712b0.getAndIncrement() == 0) {
            C11968q qVar = (C11968q) this.f27705U.get();
            int i = 1;
            while (qVar == null) {
                i = this.f27712b0.addAndGet(-i);
                if (i != 0) {
                    qVar = (C11968q) this.f27705U.get();
                } else {
                    return;
                }
            }
            if (this.f27714c0) {
                mo30322c(qVar);
            } else {
                mo30323d(qVar);
            }
        }
    }
}
