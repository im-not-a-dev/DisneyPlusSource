package p161f.p162a;

import com.appboy.p027p.C1518c;
import com.appboy.p033s.C1557c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: f.a.c */
public class C4410c implements C4419d {

    /* renamed from: i */
    private static final String f10986i = C1557c.m7461a(C4410c.class);

    /* renamed from: a */
    private final ConcurrentMap<Class, CopyOnWriteArraySet<C1518c>> f10987a = new ConcurrentHashMap();

    /* renamed from: b */
    private final ConcurrentMap<Class, CopyOnWriteArraySet<C1518c>> f10988b = new ConcurrentHashMap();

    /* renamed from: c */
    private final ConcurrentMap<Class, Object> f10989c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Executor f10990d;

    /* renamed from: e */
    private final C4415c3 f10991e;

    /* renamed from: f */
    private final Object f10992f = new Object();

    /* renamed from: g */
    private final Object f10993g = new Object();

    /* renamed from: h */
    private final Object f10994h = new Object();

    /* renamed from: f.a.c$a */
    class C4411a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Object f10995U;

        /* renamed from: c */
        final /* synthetic */ C1518c f10996c;

        C4411a(C4410c cVar, C1518c cVar2, Object obj) {
            this.f10996c = cVar2;
            this.f10995U = obj;
        }

        public void run() {
            this.f10996c.trigger(this.f10995U);
        }
    }

    public C4410c(Executor executor, C4415c3 c3Var) {
        this.f10990d = executor;
        this.f10991e = c3Var;
    }

    /* renamed from: a */
    public <T> boolean mo15486a(C1518c<T> cVar, Class<T> cls) {
        boolean a;
        synchronized (this.f10992f) {
            a = m15231a(cVar, cls, this.f10987a);
        }
        return a;
    }

    /* renamed from: b */
    public <T> boolean mo15487b(C1518c<T> cVar, Class<T> cls) {
        boolean a;
        synchronized (this.f10993g) {
            a = m15231a(cVar, cls, this.f10988b);
        }
        return a;
    }

    /* renamed from: c */
    public <T> boolean mo15488c(C1518c<T> cVar, Class<T> cls) {
        boolean a;
        synchronized (this.f10992f) {
            a = m15232a((CopyOnWriteArraySet) this.f10987a.get(cls), cVar);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a6, code lost:
        if (r0.isEmpty() == false) goto L_0x00aa;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void mo15485a(T r8, java.lang.Class<T> r9) {
        /*
            r7 = this;
            f.a.c3 r0 = r7.f10991e
            boolean r0 = r0.mo15491a()
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = f10986i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SDK is disabled. Not publishing event class: "
            r1.append(r2)
            java.lang.String r9 = r9.getName()
            r1.append(r9)
            java.lang.String r9 = " and message: "
            r1.append(r9)
            java.lang.String r8 = r8.toString()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.appboy.p033s.C1557c.m7458a(r0, r8)
            return
        L_0x002f:
            java.lang.String r0 = f10986i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.getName()
            r1.append(r2)
            java.lang.String r2 = " fired: "
            r1.append(r2)
            java.lang.String r2 = r8.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.appboy.p033s.C1557c.m7460a(r0, r1, r2)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.util.concurrent.CopyOnWriteArraySet<com.appboy.p.c>> r0 = r7.f10987a
            java.lang.Object r0 = r0.get(r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            r1 = 1
            if (r0 == 0) goto L_0x0081
            r7.m15229a(r9, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0063:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007a
            java.lang.Object r4 = r3.next()
            com.appboy.p.c r4 = (com.appboy.p027p.C1518c) r4
            java.util.concurrent.Executor r5 = r7.f10990d
            f.a.c$a r6 = new f.a.c$a
            r6.<init>(r7, r4, r8)
            r5.execute(r6)
            goto L_0x0063
        L_0x007a:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0081
            r2 = 1
        L_0x0081:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.util.concurrent.CopyOnWriteArraySet<com.appboy.p.c>> r0 = r7.f10988b
            java.lang.Object r0 = r0.get(r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
            if (r0 == 0) goto L_0x00a9
            r7.m15229a(r9, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0092:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a2
            java.lang.Object r4 = r3.next()
            com.appboy.p.c r4 = (com.appboy.p027p.C1518c) r4
            r4.trigger(r8)
            goto L_0x0092
        L_0x00a2:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r1 = r2
        L_0x00aa:
            if (r1 != 0) goto L_0x00d1
            if (r8 == 0) goto L_0x00d1
            java.lang.String r0 = f10986i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.appboy.p033s.C1557c.m7469c(r0, r1)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Object> r0 = r7.f10989c
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Object> r1 = r7.f10989c     // Catch:{ all -> 0x00ce }
            r1.put(r9, r8)     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00d1
        L_0x00ce:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            throw r8
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4410c.mo15485a(java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: a */
    public void mo15484a() {
        synchronized (this.f10992f) {
            this.f10987a.clear();
        }
        synchronized (this.f10993g) {
            this.f10988b.clear();
        }
    }

    /* renamed from: a */
    private <T> boolean m15231a(C1518c<T> cVar, Class<T> cls, ConcurrentMap<Class, CopyOnWriteArraySet<C1518c>> concurrentMap) {
        if (cVar == null) {
            String name = cls == null ? "null eventClass" : cls.getName();
            String str = f10986i;
            StringBuilder sb = new StringBuilder();
            sb.append("Error: Attempted to add a null subscriber for eventClass ");
            sb.append(name);
            sb.append(". This subscriber is being ignored. Please check your calling code to ensure that all potential subscriptions are valid.");
            C1557c.m7465b(str, sb.toString());
            return false;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentMap.get(cls);
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = new CopyOnWriteArraySet();
            CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentMap.putIfAbsent(cls, copyOnWriteArraySet);
            if (copyOnWriteArraySet2 != null) {
                copyOnWriteArraySet = copyOnWriteArraySet2;
            }
        }
        boolean add = copyOnWriteArraySet.add(cVar);
        m15230a(cls);
        return add;
    }

    /* renamed from: a */
    private <T> void m15230a(Class<T> cls) {
        synchronized (this.f10994h) {
            if (this.f10989c.containsKey(cls)) {
                String str = f10986i;
                StringBuilder sb = new StringBuilder();
                sb.append("Publishing cached event for class: ");
                sb.append(cls);
                C1557c.m7471d(str, sb.toString());
                Object remove = this.f10989c.remove(cls);
                if (remove != null) {
                    mo15485a((T) remove, cls);
                }
            }
        }
    }

    /* renamed from: a */
    private <T> boolean m15232a(CopyOnWriteArraySet<C1518c> copyOnWriteArraySet, C1518c<T> cVar) {
        return (copyOnWriteArraySet == null || cVar == null || !copyOnWriteArraySet.remove(cVar)) ? false : true;
    }

    /* renamed from: a */
    private <T> CopyOnWriteArraySet<C1518c<T>> m15229a(Class<T> cls, CopyOnWriteArraySet<C1518c> copyOnWriteArraySet) {
        String str = f10986i;
        StringBuilder sb = new StringBuilder();
        sb.append("Triggering ");
        sb.append(cls.getName());
        sb.append(" on ");
        sb.append(copyOnWriteArraySet.size());
        sb.append(" subscribers.");
        C1557c.m7460a(str, sb.toString(), false);
        return copyOnWriteArraySet;
    }
}
