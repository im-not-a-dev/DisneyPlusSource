package p163g.p449j.p450a.p451a.p467f;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: g.j.a.a.f.a0 */
final class C11425a0<TResult> {

    /* renamed from: a */
    private final Object f26762a = new Object();

    /* renamed from: b */
    private Queue<C11456z<TResult>> f26763b;

    /* renamed from: c */
    private boolean f26764c;

    C11425a0() {
    }

    /* renamed from: a */
    public final void mo29245a(C11456z<TResult> zVar) {
        synchronized (this.f26762a) {
            if (this.f26763b == null) {
                this.f26763b = new ArrayDeque();
            }
            this.f26763b.add(zVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f26762a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (p163g.p449j.p450a.p451a.p467f.C11456z) r2.f26763b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f26764c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo29279a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29244a(p163g.p449j.p450a.p451a.p467f.C11435h<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f26762a
            monitor-enter(r0)
            java.util.Queue<g.j.a.a.f.z<TResult>> r1 = r2.f26763b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f26764c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f26764c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f26762a
            monitor-enter(r1)
            java.util.Queue<g.j.a.a.f.z<TResult>> r0 = r2.f26763b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            g.j.a.a.f.z r0 = (p163g.p449j.p450a.p451a.p467f.C11456z) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f26764c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo29279a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p467f.C11425a0.mo29244a(g.j.a.a.f.h):void");
    }
}
