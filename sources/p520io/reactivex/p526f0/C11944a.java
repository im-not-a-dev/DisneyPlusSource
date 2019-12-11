package p520io.reactivex.p526f0;

import org.reactivestreams.C14314c;
import org.reactivestreams.Subscriber;
import p520io.reactivex.C11955i;
import p520io.reactivex.p531y.p546i.C12539g;
import p520io.reactivex.p531y.p547j.C12540a;
import p520io.reactivex.p531y.p547j.C12551j;

/* renamed from: io.reactivex.f0.a */
/* compiled from: SerializedSubscriber */
public final class C11944a<T> implements C11955i<T>, C14314c {

    /* renamed from: U */
    final boolean f27621U;

    /* renamed from: V */
    C14314c f27622V;

    /* renamed from: W */
    boolean f27623W;

    /* renamed from: X */
    C12540a<Object> f27624X;

    /* renamed from: Y */
    volatile boolean f27625Y;

    /* renamed from: c */
    final Subscriber<? super T> f27626c;

    public C11944a(Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    /* renamed from: a */
    public void mo29945a(C14314c cVar) {
        if (C12539g.m39329a(this.f27622V, cVar)) {
            this.f27622V = cVar;
            this.f27626c.mo29945a(this);
        }
    }

    /* renamed from: b */
    public void mo29946b(long j) {
        this.f27622V.mo29946b(j);
    }

    public void cancel() {
        this.f27622V.cancel();
    }

    public void onComplete() {
        if (!this.f27625Y) {
            synchronized (this) {
                if (!this.f27625Y) {
                    if (this.f27623W) {
                        C12540a<Object> aVar = this.f27624X;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27624X = aVar;
                        }
                        aVar.mo30663a(C12551j.m39357a());
                        return;
                    }
                    this.f27625Y = true;
                    this.f27623W = true;
                    this.f27626c.onComplete();
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
        r2.f27626c.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f27625Y
            if (r0 == 0) goto L_0x0008
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f27625Y     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f27623W     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f27625Y = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.y.j.a<java.lang.Object> r0 = r2.f27624X     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.y.j.a r0 = new io.reactivex.y.j.a     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f27624X = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p520io.reactivex.p531y.p547j.C12551j.m39359a(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f27621U     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo30663a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo30666b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f27625Y = r1     // Catch:{ all -> 0x0044 }
            r2.f27623W = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p520io.reactivex.p523c0.C11915a.m38466b(r3)
            return
        L_0x003e:
            org.reactivestreams.Subscriber<? super T> r0 = r2.f27626c
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p520io.reactivex.p526f0.C11944a.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f27625Y) {
            if (t == null) {
                this.f27622V.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f27625Y) {
                    if (this.f27623W) {
                        C12540a<Object> aVar = this.f27624X;
                        if (aVar == null) {
                            aVar = new C12540a<>(4);
                            this.f27624X = aVar;
                        }
                        aVar.mo30663a(C12551j.m39368e(t));
                        return;
                    }
                    this.f27623W = true;
                    this.f27626c.onNext(t);
                    mo30262a();
                }
            }
        }
    }

    public C11944a(Subscriber<? super T> subscriber, boolean z) {
        this.f27626c = subscriber;
        this.f27621U = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30262a() {
        C12540a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f27624X;
                if (aVar == null) {
                    this.f27623W = false;
                    return;
                }
                this.f27624X = null;
            }
        } while (!aVar.mo30665a(this.f27626c));
    }
}
