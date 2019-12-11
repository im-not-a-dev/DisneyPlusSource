package p520io.reactivex.p531y.p536e.p541e;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p520io.reactivex.C11968q;
import p520io.reactivex.C11969r;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p523c0.C11915a;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p532a.C12013f;
import p520io.reactivex.p548z.C12557a;

/* renamed from: io.reactivex.y.e.e.n0 */
/* compiled from: ObservableRefCount */
public final class C12354n0<T> extends Observable<T> {

    /* renamed from: U */
    final int f28565U;

    /* renamed from: V */
    final long f28566V;

    /* renamed from: W */
    final TimeUnit f28567W;

    /* renamed from: X */
    final C11969r f28568X;

    /* renamed from: Y */
    C12355a f28569Y;

    /* renamed from: c */
    final C12557a<T> f28570c;

    /* renamed from: io.reactivex.y.e.e.n0$a */
    /* compiled from: ObservableRefCount */
    static final class C12355a extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* renamed from: U */
        Disposable f28571U;

        /* renamed from: V */
        long f28572V;

        /* renamed from: W */
        boolean f28573W;

        /* renamed from: X */
        boolean f28574X;

        /* renamed from: c */
        final C12354n0<?> f28575c;

        C12355a(C12354n0<?> n0Var) {
            this.f28575c = n0Var;
        }

        /* renamed from: a */
        public void accept(Disposable disposable) throws Exception {
            C12010c.m38622a((AtomicReference<Disposable>) this, disposable);
            synchronized (this.f28575c) {
                if (this.f28574X) {
                    ((C12013f) this.f28575c.f28570c).mo30344a(disposable);
                }
            }
        }

        public void run() {
            this.f28575c.mo30508e(this);
        }
    }

    /* renamed from: io.reactivex.y.e.e.n0$b */
    /* compiled from: ObservableRefCount */
    static final class C12356b<T> extends AtomicBoolean implements C11968q<T>, Disposable {

        /* renamed from: U */
        final C12354n0<T> f28576U;

        /* renamed from: V */
        final C12355a f28577V;

        /* renamed from: W */
        Disposable f28578W;

        /* renamed from: c */
        final C11968q<? super T> f28579c;

        C12356b(C11968q<? super T> qVar, C12354n0<T> n0Var, C12355a aVar) {
            this.f28579c = qVar;
            this.f28576U = n0Var;
            this.f28577V = aVar;
        }

        public void dispose() {
            this.f28578W.dispose();
            if (compareAndSet(false, true)) {
                this.f28576U.mo30504a(this.f28577V);
            }
        }

        public boolean isDisposed() {
            return this.f28578W.isDisposed();
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f28576U.mo30507d(this.f28577V);
                this.f28579c.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f28576U.mo30507d(this.f28577V);
                this.f28579c.onError(th);
                return;
            }
            C11915a.m38466b(th);
        }

        public void onNext(T t) {
            this.f28579c.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12010c.m38620a(this.f28578W, disposable)) {
                this.f28578W = disposable;
                this.f28579c.onSubscribe(this);
            }
        }
    }

    public C12354n0(C12557a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, null);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30504a(p520io.reactivex.p531y.p536e.p541e.C12354n0.C12355a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.reactivex.y.e.e.n0$a r0 = r5.f28569Y     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003f
            io.reactivex.y.e.e.n0$a r0 = r5.f28569Y     // Catch:{ all -> 0x0041 }
            if (r0 == r6) goto L_0x000a
            goto L_0x003f
        L_0x000a:
            long r0 = r6.f28572V     // Catch:{ all -> 0x0041 }
            r2 = 1
            long r0 = r0 - r2
            r6.f28572V = r0     // Catch:{ all -> 0x0041 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            boolean r0 = r6.f28573W     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x001c
            goto L_0x003d
        L_0x001c:
            long r0 = r5.f28566V     // Catch:{ all -> 0x0041 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            r5.mo30508e(r6)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0027:
            io.reactivex.y.a.g r0 = new io.reactivex.y.a.g     // Catch:{ all -> 0x0041 }
            r0.<init>()     // Catch:{ all -> 0x0041 }
            r6.f28571U = r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            io.reactivex.r r1 = r5.f28568X
            long r2 = r5.f28566V
            java.util.concurrent.TimeUnit r4 = r5.f28567W
            io.reactivex.disposables.Disposable r6 = r1.mo30291a(r6, r2, r4)
            r0.mo30345a(r6)
            return
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p531y.p536e.p541e.C12354n0.mo30504a(io.reactivex.y.e.e.n0$a):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27408b(C11968q<? super T> qVar) {
        C12355a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.f28569Y;
            if (aVar == null) {
                aVar = new C12355a(this);
                this.f28569Y = aVar;
            }
            long j = aVar.f28572V;
            if (j == 0 && aVar.f28571U != null) {
                aVar.f28571U.dispose();
            }
            long j2 = j + 1;
            aVar.f28572V = j2;
            z = true;
            if (aVar.f28573W || j2 != ((long) this.f28565U)) {
                z = false;
            } else {
                aVar.f28573W = true;
            }
        }
        this.f28570c.mo30162a((C11968q<? super T>) new C12356b<Object>(qVar, this, aVar));
        if (z) {
            this.f28570c.mo30498g(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo30506c(C12355a aVar) {
        C12557a<T> aVar2 = this.f28570c;
        if (aVar2 instanceof Disposable) {
            ((Disposable) aVar2).dispose();
        } else if (aVar2 instanceof C12013f) {
            ((C12013f) aVar2).mo30344a((Disposable) aVar.get());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo30507d(C12355a aVar) {
        synchronized (this) {
            if (this.f28570c instanceof C12351m0) {
                if (this.f28569Y != null && this.f28569Y == aVar) {
                    this.f28569Y = null;
                    mo30505b(aVar);
                }
                long j = aVar.f28572V - 1;
                aVar.f28572V = j;
                if (j == 0) {
                    mo30506c(aVar);
                }
            } else if (this.f28569Y != null && this.f28569Y == aVar) {
                mo30505b(aVar);
                long j2 = aVar.f28572V - 1;
                aVar.f28572V = j2;
                if (j2 == 0) {
                    this.f28569Y = null;
                    mo30506c(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo30508e(C12355a aVar) {
        synchronized (this) {
            if (aVar.f28572V == 0 && aVar == this.f28569Y) {
                this.f28569Y = null;
                Disposable disposable = (Disposable) aVar.get();
                C12010c.m38621a((AtomicReference<Disposable>) aVar);
                if (this.f28570c instanceof Disposable) {
                    ((Disposable) this.f28570c).dispose();
                } else if (this.f28570c instanceof C12013f) {
                    if (disposable == null) {
                        aVar.f28574X = true;
                    } else {
                        ((C12013f) this.f28570c).mo30344a(disposable);
                    }
                }
            }
        }
    }

    public C12354n0(C12557a<T> aVar, int i, long j, TimeUnit timeUnit, C11969r rVar) {
        this.f28570c = aVar;
        this.f28565U = i;
        this.f28566V = j;
        this.f28567W = timeUnit;
        this.f28568X = rVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo30505b(C12355a aVar) {
        Disposable disposable = aVar.f28571U;
        if (disposable != null) {
            disposable.dispose();
            aVar.f28571U = null;
        }
    }
}
