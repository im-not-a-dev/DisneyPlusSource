package p163g.p449j.p450a.p451a.p467f;

import java.util.concurrent.Executor;

/* renamed from: g.j.a.a.f.v */
final class C11452v<TResult> implements C11456z<TResult> {

    /* renamed from: a */
    private final Executor f26802a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f26803b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11432e<? super TResult> f26804c;

    public C11452v(Executor executor, C11432e<? super TResult> eVar) {
        this.f26802a = executor;
        this.f26804c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f26802a.execute(new p163g.p449j.p450a.p451a.p467f.C11453w(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29279a(p163g.p449j.p450a.p451a.p467f.C11435h<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo29268e()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f26803b
            monitor-enter(r0)
            g.j.a.a.f.e<? super TResult> r1 = r2.f26804c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f26802a
            g.j.a.a.f.w r1 = new g.j.a.a.f.w
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p467f.C11452v.mo29279a(g.j.a.a.f.h):void");
    }
}
