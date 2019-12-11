package p163g.p449j.p450a.p451a.p457d.p464g;

/* renamed from: g.j.a.a.d.g.u4 */
public class C11330u4 {

    /* renamed from: a */
    private volatile C11259p5 f26560a;

    /* renamed from: b */
    private volatile C11342v2 f26561b;

    static {
        C11285r3.m36043c();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p163g.p449j.p450a.p451a.p457d.p464g.C11259p5 m36423b(p163g.p449j.p450a.p451a.p457d.p464g.C11259p5 r2) {
        /*
            r1 = this;
            g.j.a.a.d.g.p5 r0 = r1.f26560a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            g.j.a.a.d.g.p5 r0 = r1.f26560a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f26560a = r2     // Catch:{ p4 -> 0x0012 }
            g.j.a.a.d.g.v2 r0 = p163g.p449j.p450a.p451a.p457d.p464g.C11342v2.f26574U     // Catch:{ p4 -> 0x0012 }
            r1.f26561b = r0     // Catch:{ p4 -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f26560a = r2     // Catch:{ all -> 0x001a }
            g.j.a.a.d.g.v2 r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11342v2.f26574U     // Catch:{ all -> 0x001a }
            r1.f26561b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            g.j.a.a.d.g.p5 r2 = r1.f26560a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11330u4.m36423b(g.j.a.a.d.g.p5):g.j.a.a.d.g.p5");
    }

    /* renamed from: a */
    public final C11259p5 mo29046a(C11259p5 p5Var) {
        C11259p5 p5Var2 = this.f26560a;
        this.f26561b = null;
        this.f26560a = p5Var;
        return p5Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11330u4)) {
            return false;
        }
        C11330u4 u4Var = (C11330u4) obj;
        C11259p5 p5Var = this.f26560a;
        C11259p5 p5Var2 = u4Var.f26560a;
        if (p5Var == null && p5Var2 == null) {
            return mo29047a().equals(u4Var.mo29047a());
        }
        if (p5Var != null && p5Var2 != null) {
            return p5Var.equals(p5Var2);
        }
        if (p5Var != null) {
            return p5Var.equals(u4Var.m36423b(p5Var.mo28424a()));
        }
        return m36423b(p5Var2.mo28424a()).equals(p5Var2);
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: a */
    public final C11342v2 mo29047a() {
        if (this.f26561b != null) {
            return this.f26561b;
        }
        synchronized (this) {
            if (this.f26561b != null) {
                C11342v2 v2Var = this.f26561b;
                return v2Var;
            }
            if (this.f26560a == null) {
                this.f26561b = C11342v2.f26574U;
            } else {
                this.f26561b = this.f26560a.mo28655c();
            }
            C11342v2 v2Var2 = this.f26561b;
            return v2Var2;
        }
    }

    /* renamed from: b */
    public final int mo29048b() {
        if (this.f26561b != null) {
            return this.f26561b.size();
        }
        if (this.f26560a != null) {
            return this.f26560a.mo28427b();
        }
        return 0;
    }
}
