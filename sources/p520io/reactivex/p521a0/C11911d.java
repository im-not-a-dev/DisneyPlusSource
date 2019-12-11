package p520io.reactivex.p521a0;

import p520io.reactivex.C11968q;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.p531y.p532a.C12010c;
import p520io.reactivex.p531y.p547j.C12540a;
import p520io.reactivex.p531y.p547j.C12551j;

/* renamed from: io.reactivex.a0.d */
/* compiled from: SerializedObserver */
public final class C11911d<T> implements C11968q<T>, Disposable {

    /* renamed from: U */
    final boolean f27571U;

    /* renamed from: V */
    Disposable f27572V;

    /* renamed from: W */
    boolean f27573W;

    /* renamed from: X */
    C12540a<Object> f27574X;

    /* renamed from: Y */
    volatile boolean f27575Y;

    /* renamed from: c */
    final C11968q<? super T> f27576c;

    public C11911d(C11968q<? super T> qVar) {
        this(qVar, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30241a() {
        C12540a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f27574X;
                if (aVar == null) {
                    this.f27573W = false;
                    return;
                }
                this.f27574X = null;
            }
        } while (!aVar.mo30664a(this.f27576c));
    }

    public void dispose() {
        this.f27572V.dispose();
    }

    public boolean isDisposed() {
        return this.f27572V.isDisposed();
    }

    public void onComplete() {
        if (!this.f27575Y) {
            synchronized (this) {
                if (!this.f27575Y) {
                    if (this.f27573W) {
                        C12540a<Object> aVar = this.f27574X;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27574X = aVar;
                        }
                        aVar.mo30663a(C12551j.m39357a());
                        return;
                    }
                    this.f27575Y = true;
                    this.f27573W = true;
                    this.f27576c.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p520io.reactivex.p523c0.C11915a.m38466b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f27576c.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f27575Y
            if (r0 == 0) goto L_0x0008
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f27575Y     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f27573W     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f27575Y = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.y.j.a<java.lang.Object> r0 = r2.f27574X     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.y.j.a r0 = new io.reactivex.y.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f27574X = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p520io.reactivex.p531y.p547j.C12551j.m39359a(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f27571U     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo30663a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo30666b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f27575Y = r1     // Catch:{ all -> 0x0044 }
            r2.f27573W = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x003e:
            io.reactivex.q<? super T> r0 = r2.f27576c
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p521a0.C11911d.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f27575Y) {
            if (t == null) {
                this.f27572V.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f27575Y) {
                    if (this.f27573W) {
                        C12540a<Object> aVar = this.f27574X;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27574X = aVar;
                        }
                        C12551j.m39368e(t);
                        aVar.mo30663a(t);
                        return;
                    }
                    this.f27573W = true;
                    this.f27576c.onNext(t);
                    mo30241a();
                }
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (C12010c.m38620a(this.f27572V, disposable)) {
            this.f27572V = disposable;
            this.f27576c.onSubscribe(this);
        }
    }

    public C11911d(C11968q<? super T> qVar, boolean z) {
        this.f27576c = qVar;
        this.f27571U = z;
    }
}
