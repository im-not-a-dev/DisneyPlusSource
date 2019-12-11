package androidx.work.impl.p008l.p010f;

import android.content.Context;
import androidx.work.C1034h;
import androidx.work.impl.p008l.C1075a;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: androidx.work.impl.l.f.d */
/* compiled from: ConstraintTracker */
public abstract class C1092d<T> {

    /* renamed from: e */
    private static final String f4248e = C1034h.m5551a("ConstraintTracker");

    /* renamed from: a */
    protected final Context f4249a;

    /* renamed from: b */
    private final Object f4250b = new Object();

    /* renamed from: c */
    private final Set<C1075a<T>> f4251c = new LinkedHashSet();

    /* renamed from: d */
    private T f4252d;

    C1092d(Context context) {
        this.f4249a = context.getApplicationContext();
    }

    /* renamed from: a */
    public abstract T mo5819a();

    /* renamed from: a */
    public void mo5825a(C1075a<T> aVar) {
        synchronized (this.f4250b) {
            if (this.f4251c.add(aVar)) {
                if (this.f4251c.size() == 1) {
                    this.f4252d = mo5819a();
                    C1034h.m5550a().mo5697a(f4248e, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f4252d}), new Throwable[0]);
                    mo5822b();
                }
                aVar.mo5793a(this.f4252d);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo5822b();

    /* renamed from: b */
    public void mo5827b(C1075a<T> aVar) {
        synchronized (this.f4250b) {
            if (this.f4251c.remove(aVar) && this.f4251c.isEmpty()) {
                mo5823c();
            }
        }
    }

    /* renamed from: c */
    public abstract void mo5823c();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5826a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4250b
            monitor-enter(r0)
            T r1 = r3.f4252d     // Catch:{ all -> 0x0037 }
            if (r1 == r4) goto L_0x0035
            T r1 = r3.f4252d     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.f4252d     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0035
        L_0x0014:
            r3.f4252d = r4     // Catch:{ all -> 0x0037 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0037 }
            java.util.Set<androidx.work.impl.l.a<T>> r1 = r3.f4251c     // Catch:{ all -> 0x0037 }
            r4.<init>(r1)     // Catch:{ all -> 0x0037 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0037 }
            androidx.work.impl.l.a r1 = (androidx.work.impl.p008l.C1075a) r1     // Catch:{ all -> 0x0037 }
            T r2 = r3.f4252d     // Catch:{ all -> 0x0037 }
            r1.mo5793a(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0021
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p008l.p010f.C1092d.mo5826a(java.lang.Object):void");
    }
}
