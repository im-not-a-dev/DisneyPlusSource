package p161f.p162a;

import com.appboy.C1440a;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: f.a.o6 */
public final class C4544o6 implements C4562q6 {

    /* renamed from: g */
    private static final String f11294g = C1557c.m7461a(C4544o6.class);

    /* renamed from: a */
    private final C4603v0 f11295a;

    /* renamed from: b */
    private final C4464h3 f11296b;

    /* renamed from: c */
    private final LinkedBlockingQueue<C4463h2> f11297c = new LinkedBlockingQueue<>(1000);

    /* renamed from: d */
    private final C1489b f11298d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, C4432e1> f11299e;

    /* renamed from: f */
    private final ConcurrentHashMap<String, C4432e1> f11300f;

    public C4544o6(C4464h3 h3Var, C4603v0 v0Var, C1489b bVar) {
        this.f11296b = h3Var;
        this.f11295a = v0Var;
        this.f11298d = bVar;
        this.f11299e = new ConcurrentHashMap<>();
        this.f11300f = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public synchronized void mo15659a(C4470i1 i1Var) {
        if (!this.f11300f.isEmpty()) {
            C1557c.m7458a(f11294g, "Flushing pending events to dispatcher map");
            for (C4432e1 a : this.f11300f.values()) {
                a.mo15518a(i1Var);
            }
            this.f11299e.putAll(this.f11300f);
            this.f11300f.clear();
        }
    }

    /* renamed from: b */
    public synchronized void mo15660b(C4432e1 e1Var) {
        if (e1Var == null) {
            C1557c.m7473e(f11294g, "Tried to add null AppboyEvent to pending dispatch.");
        } else {
            this.f11300f.putIfAbsent(e1Var.mo15524g(), e1Var);
        }
    }

    /* renamed from: c */
    public C4463h2 mo15756c() {
        C4463h2 h2Var = (C4463h2) this.f11297c.poll();
        if (h2Var != null) {
            mo15752a(h2Var);
        }
        return h2Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized C4404b1 mo15757d() {
        ArrayList arrayList;
        Collection values = this.f11299e.values();
        arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4432e1 e1Var = (C4432e1) it.next();
            arrayList.add(e1Var);
            values.remove(e1Var);
            String str = f11294g;
            StringBuilder sb = new StringBuilder();
            sb.append("Event dispatched: ");
            sb.append(e1Var.mo6750b());
            sb.append(" with uid: ");
            sb.append(e1Var.mo15524g());
            C1557c.m7458a(str, sb.toString());
            if (arrayList.size() >= 32) {
                C1557c.m7469c(f11294g, "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch");
                break;
            }
        }
        return new C4404b1(new HashSet(arrayList));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo15758e() {
        return C1440a.m6946q();
    }

    /* renamed from: c */
    private void m15724c(C4463h2 h2Var) {
        if (this.f11295a.mo15820c() != null) {
            h2Var.mo15583a(this.f11295a.mo15820c());
        }
        if (this.f11298d.mo6707a() != null) {
            h2Var.mo15587d(this.f11298d.mo6707a().toString());
        }
        h2Var.mo15586c("3.2.2");
        h2Var.mo15578a(C4472i3.m15480a());
    }

    /* renamed from: b */
    public C4463h2 mo15754b() {
        return mo15752a((C4463h2) this.f11297c.take());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo15755b(C4463h2 h2Var) {
        h2Var.mo15584b(this.f11295a.mo15822e());
        h2Var.mo15579a(this.f11298d.mo6727t());
        C4498l1 d = this.f11295a.mo15821d();
        h2Var.mo15581a(d);
        if (d != null && d.mo15669c()) {
            this.f11296b.mo15604d();
        }
        h2Var.mo15582a((C4535o1) this.f11296b.mo15793b());
        h2Var.mo15580a(mo15757d());
    }

    /* renamed from: a */
    public void mo15658a(C4432e1 e1Var) {
        if (e1Var == null) {
            C1557c.m7473e(f11294g, "Tried to add null AppboyEvent to dispatch.");
        } else {
            this.f11299e.putIfAbsent(e1Var.mo15524g(), e1Var);
        }
    }

    /* renamed from: a */
    public void mo15657a(C4419d dVar, C4463h2 h2Var) {
        if (h2Var == null) {
            throw new NullPointerException();
        } else if (mo15758e()) {
            C1557c.m7469c(f11294g, "Network requests are offline, not adding request to queue.");
        } else {
            String str = f11294g;
            StringBuilder sb = new StringBuilder();
            sb.append("Adding request to dispatcher with parameters: \n");
            sb.append(C4569r3.m15868a(h2Var.mo15462i()));
            C1557c.m7468b(str, sb.toString(), false);
            h2Var.mo15624b(dVar);
            this.f11297c.add(h2Var);
        }
    }

    /* renamed from: a */
    public boolean mo15753a() {
        return !this.f11297c.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0024, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p161f.p162a.C4463h2 mo15752a(p161f.p162a.C4463h2 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L_0x0006
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x0006:
            r1.m15724c(r2)     // Catch:{ all -> 0x0025 }
            boolean r0 = r2 instanceof p161f.p162a.C4520n2     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r1)
            return r2
        L_0x000f:
            boolean r0 = r2 instanceof p161f.p162a.C4446f2     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0023
            boolean r0 = r2 instanceof p161f.p162a.C4454g2     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            boolean r0 = r2 instanceof p161f.p162a.C4405b2     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r1)
            return r2
        L_0x001e:
            r1.mo15755b(r2)     // Catch:{ all -> 0x0025 }
            monitor-exit(r1)
            return r2
        L_0x0023:
            monitor-exit(r1)
            return r2
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4544o6.mo15752a(f.a.h2):f.a.h2");
    }
}
