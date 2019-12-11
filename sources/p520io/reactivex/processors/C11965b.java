package p520io.reactivex.processors;

import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.p531y.p547j.C12540a;
import p520io.reactivex.p531y.p547j.C12551j;

/* renamed from: io.reactivex.processors.b */
/* compiled from: SerializedProcessor */
final class C11965b<T> extends C11964a<T> {

    /* renamed from: U */
    final C11964a<T> f27635U;

    /* renamed from: V */
    boolean f27636V;

    /* renamed from: W */
    C12540a<Object> f27637W;

    /* renamed from: X */
    volatile boolean f27638X;

    C11965b(C11964a<T> aVar) {
        this.f27635U = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29935a(Subscriber<? super T> subscriber) {
        this.f27635U.subscribe(subscriber);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo30279k() {
        C12540a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f27637W;
                if (aVar == null) {
                    this.f27636V = false;
                    return;
                }
                this.f27637W = null;
            }
            aVar.mo30665a((Subscriber<? super U>) this.f27635U);
        }
        while (true) {
        }
    }

    public void onComplete() {
        if (!this.f27638X) {
            synchronized (this) {
                if (!this.f27638X) {
                    this.f27638X = true;
                    if (this.f27636V) {
                        C12540a<Object> aVar = this.f27637W;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27637W = aVar;
                        }
                        aVar.mo30663a(C12551j.m39357a());
                        return;
                    }
                    this.f27636V = true;
                    this.f27635U.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p520io.reactivex.p523c0.C11915a.m38466b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f27635U.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f27638X
            if (r0 == 0) goto L_0x0008
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f27638X     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f27638X = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f27636V     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            io.reactivex.y.j.a<java.lang.Object> r0 = r2.f27637W     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            io.reactivex.y.j.a r0 = new io.reactivex.y.j.a     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f27637W = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p520io.reactivex.p531y.p547j.C12551j.m39359a(r3)     // Catch:{ all -> 0x003b }
            r0.mo30666b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f27636V = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x0035:
            io.reactivex.processors.a<T> r0 = r2.f27635U
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.processors.C11965b.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f27638X) {
            synchronized (this) {
                if (!this.f27638X) {
                    if (this.f27636V) {
                        C12540a<Object> aVar = this.f27637W;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27637W = aVar;
                        }
                        aVar.mo30663a(C12551j.m39368e(t));
                        return;
                    }
                    this.f27636V = true;
                    this.f27635U.onNext(t);
                    mo30279k();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        boolean z = true;
        if (!this.f27638X) {
            synchronized (this) {
                if (!this.f27638X) {
                    if (this.f27636V) {
                        C12540a<Object> aVar = this.f27637W;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27637W = aVar;
                        }
                        aVar.mo30663a(C12551j.m39360a(cVar));
                        return;
                    }
                    this.f27636V = true;
                    z = false;
                }
            }
        }
        if (z) {
            cVar.cancel();
        } else {
            this.f27635U.mo29945a(cVar);
            mo30279k();
        }
    }
}
