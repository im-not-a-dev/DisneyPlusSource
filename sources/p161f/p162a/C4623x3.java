package p161f.p162a;

import android.app.AlarmManager;
import android.content.Context;
import com.appboy.p024n.C1489b;
import com.appboy.p033s.C1557c;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: f.a.x3 */
public final class C4623x3 {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final String f11518r = C1557c.m7461a(C4623x3.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4464h3 f11519a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4597u2 f11520b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4410c f11521c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4492k6 f11522d;

    /* renamed from: e */
    private final C4546p0 f11523e;

    /* renamed from: f */
    private final C4621x2 f11524f;

    /* renamed from: g */
    private final C4388b f11525g;

    /* renamed from: h */
    private final C4412c0 f11526h;

    /* renamed from: i */
    private final C4423d2 f11527i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4525n6 f11528j;

    /* renamed from: k */
    private final C4564r0 f11529k;

    /* renamed from: l */
    private final C4619x0 f11530l;

    /* renamed from: m */
    private final C4539o5 f11531m;

    /* renamed from: n */
    private final C4424d3 f11532n;

    /* renamed from: o */
    private final C4506m0 f11533o;

    /* renamed from: p */
    private final C4496l0 f11534p;

    /* renamed from: q */
    private final C4589t2 f11535q;

    /* renamed from: f.a.x3$a */
    class C4624a implements Runnable {
        C4624a() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|(3:17|18|19)|20|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|8)|9|10) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002e */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0036 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                f.a.x3 r0 = p161f.p162a.C4623x3.this     // Catch:{ Exception -> 0x0074 }
                f.a.h3 r0 = r0.f11519a     // Catch:{ Exception -> 0x0074 }
                monitor-enter(r0)     // Catch:{ Exception -> 0x0074 }
                f.a.x3 r1 = p161f.p162a.C4623x3.this     // Catch:{ all -> 0x0071 }
                f.a.h3 r1 = r1.f11519a     // Catch:{ all -> 0x0071 }
                boolean r1 = r1.mo15795c()     // Catch:{ all -> 0x0071 }
                if (r1 == 0) goto L_0x002e
                java.lang.String r1 = p161f.p162a.C4623x3.f11518r     // Catch:{ all -> 0x0071 }
                java.lang.String r2 = "User cache was locked, waiting."
                com.appboy.p033s.C1557c.m7469c(r1, r2)     // Catch:{ all -> 0x0071 }
                f.a.x3 r1 = p161f.p162a.C4623x3.this     // Catch:{ InterruptedException -> 0x002e }
                f.a.h3 r1 = r1.f11519a     // Catch:{ InterruptedException -> 0x002e }
                r1.wait()     // Catch:{ InterruptedException -> 0x002e }
                java.lang.String r1 = p161f.p162a.C4623x3.f11518r     // Catch:{ InterruptedException -> 0x002e }
                java.lang.String r2 = "User cache notified. Continuing UserDependencyManager shutdown"
                com.appboy.p033s.C1557c.m7458a(r1, r2)     // Catch:{ InterruptedException -> 0x002e }
            L_0x002e:
                monitor-exit(r0)     // Catch:{ all -> 0x0071 }
                f.a.x3 r0 = p161f.p162a.C4623x3.this     // Catch:{ Exception -> 0x0074 }
                f.a.u2 r0 = r0.f11520b     // Catch:{ Exception -> 0x0074 }
                monitor-enter(r0)     // Catch:{ Exception -> 0x0074 }
                f.a.x3 r1 = p161f.p162a.C4623x3.this     // Catch:{ all -> 0x006e }
                f.a.u2 r1 = r1.f11520b     // Catch:{ all -> 0x006e }
                boolean r1 = r1.mo15795c()     // Catch:{ all -> 0x006e }
                if (r1 == 0) goto L_0x005d
                java.lang.String r1 = p161f.p162a.C4623x3.f11518r     // Catch:{ all -> 0x006e }
                java.lang.String r2 = "Device cache was locked, waiting."
                com.appboy.p033s.C1557c.m7469c(r1, r2)     // Catch:{ all -> 0x006e }
                f.a.x3 r1 = p161f.p162a.C4623x3.this     // Catch:{ InterruptedException -> 0x005d }
                f.a.u2 r1 = r1.f11520b     // Catch:{ InterruptedException -> 0x005d }
                r1.wait()     // Catch:{ InterruptedException -> 0x005d }
                java.lang.String r1 = p161f.p162a.C4623x3.f11518r     // Catch:{ InterruptedException -> 0x005d }
                java.lang.String r2 = "Device cache notified. Continuing UserDependencyManager shutdown"
                com.appboy.p033s.C1557c.m7458a(r1, r2)     // Catch:{ InterruptedException -> 0x005d }
            L_0x005d:
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                f.a.x3 r0 = p161f.p162a.C4623x3.this     // Catch:{ Exception -> 0x0074 }
                f.a.k6 r0 = r0.f11522d     // Catch:{ Exception -> 0x0074 }
                f.a.x3 r1 = p161f.p162a.C4623x3.this     // Catch:{ Exception -> 0x0074 }
                f.a.c r1 = r1.f11521c     // Catch:{ Exception -> 0x0074 }
                r0.mo15656a(r1)     // Catch:{ Exception -> 0x0074 }
                goto L_0x007e
            L_0x006e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006e }
                throw r1     // Catch:{ Exception -> 0x0074 }
            L_0x0071:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0071 }
                throw r1     // Catch:{ Exception -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                java.lang.String r1 = p161f.p162a.C4623x3.f11518r
                java.lang.String r2 = "Exception while shutting down dispatch manager. Continuing."
                com.appboy.p033s.C1557c.m7474e(r1, r2, r0)
            L_0x007e:
                f.a.x3 r0 = p161f.p162a.C4623x3.this     // Catch:{ Exception -> 0x0088 }
                f.a.n6 r0 = r0.f11528j     // Catch:{ Exception -> 0x0088 }
                r0.mo15729b()     // Catch:{ Exception -> 0x0088 }
                goto L_0x0092
            L_0x0088:
                r0 = move-exception
                java.lang.String r1 = p161f.p162a.C4623x3.f11518r
                java.lang.String r2 = "Exception while un-registering data refresh broadcast receivers. Continuing."
                com.appboy.p033s.C1557c.m7474e(r1, r2, r0)
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p161f.p162a.C4623x3.C4624a.run():void");
        }
    }

    public C4623x3(Context context, C4475i6 i6Var, C1489b bVar, C4419d dVar, C4486k0 k0Var, C4628y0 y0Var, boolean z, boolean z2, C4381a1 a1Var) {
        C4568r2 r2Var;
        Context context2 = context;
        C1489b bVar2 = bVar;
        String a = i6Var.mo15626a();
        String j1Var = bVar.mo6707a().toString();
        C4415c3 c3Var = new C4415c3(context2);
        C4627y yVar = new C4627y();
        this.f11526h = new C4412c0("user_dependency_manager_parallel_executor_identifier", yVar);
        this.f11521c = new C4410c(this.f11526h, c3Var);
        this.f11532n = new C4424d3(context2, j1Var);
        if (a.equals("")) {
            this.f11519a = new C4464h3(context2, y0Var, this.f11532n, c3Var);
            this.f11520b = new C4597u2(context2);
            r2Var = C4568r2.m15863a(context2, null, j1Var);
        } else {
            C4464h3 h3Var = new C4464h3(context, a, j1Var, y0Var, this.f11532n, c3Var);
            this.f11519a = h3Var;
            this.f11520b = new C4597u2(context2, a, j1Var);
            r2Var = C4568r2.m15863a(context2, a, j1Var);
        }
        C4575s0 s0Var = new C4575s0(context2, bVar2, k0Var, this.f11520b);
        this.f11527i = new C4423d2();
        C4544o6 o6Var = new C4544o6(this.f11519a, s0Var, bVar2);
        C4613w2 w2Var = new C4613w2(new C4455g3(context2, a, j1Var), this.f11521c);
        C4420d0 d0Var = new C4420d0("user_dependency_manager_database_serial_identifier", yVar);
        yVar.mo15914a(new C4380a0(this.f11521c));
        this.f11534p = new C4496l0(m16056a(context2, a, j1Var), m16057a(r2Var, d0Var));
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
        C4410c cVar = this.f11521c;
        C4424d3 d3Var = this.f11532n;
        C4575s0 s0Var2 = s0Var;
        C4564r0 r0Var = r1;
        C4420d0 d0Var2 = d0Var;
        int u = bVar.mo6728u();
        C4544o6 o6Var2 = o6Var;
        C4564r0 r0Var2 = new C4564r0(context, w2Var, cVar, alarmManager, d3Var, u, bVar.mo6724q());
        this.f11529k = r0Var;
        this.f11524f = new C4621x2(context2, a);
        this.f11535q = new C4589t2(context2, a, j1Var);
        C4508m2 m2Var = new C4508m2(this.f11527i, C4434e3.m15317a(), this.f11521c, dVar, this.f11526h, this.f11524f, this.f11532n, this.f11535q);
        C4525n6 n6Var = new C4525n6(context, this.f11521c, new C4504l6(), alarmManager, new C4514m6(context2), a);
        this.f11528j = n6Var;
        this.f11528j.mo15726a(this.f11521c);
        this.f11528j.mo15727a(z2);
        C4627y yVar2 = yVar;
        C4492k6 k6Var = r1;
        C4492k6 k6Var2 = new C4492k6(bVar, this.f11521c, m2Var, o6Var2, yVar2, z);
        this.f11522d = k6Var;
        C4555q0 q0Var = new C4555q0(context2, this.f11521c, this.f11532n);
        C4564r0 r0Var3 = this.f11529k;
        C4564r0 r0Var4 = r0Var3;
        String str = j1Var;
        String str2 = a;
        C1489b bVar3 = bVar2;
        C4546p0 p0Var = new C4546p0(r0Var4, this.f11522d, this.f11521c, s0Var2, bVar, this.f11532n, this.f11534p, str2, z2, q0Var, c3Var);
        this.f11523e = p0Var;
        Context context3 = context;
        C1489b bVar4 = bVar3;
        C1489b bVar5 = bVar;
        C4539o5 o5Var = new C4539o5(context3, this.f11523e, this.f11521c, bVar5, str2, str);
        this.f11531m = o5Var;
        C4506m0 m0Var = new C4506m0(context3, str, this.f11523e, bVar5, this.f11532n);
        this.f11533o = m0Var;
        if (!z) {
            m2Var.mo15689a((C4595u0) this.f11523e);
        }
        this.f11524f.mo15892a(this.f11523e);
        this.f11535q.mo15838a(this.f11523e);
        this.f11526h.mo15949a((C4595u0) this.f11523e);
        d0Var2.mo15949a((C4595u0) this.f11523e);
        this.f11530l = new C4534o0(context2, this.f11523e, bVar4);
        C4619x0 x0Var = this.f11530l;
        C4492k6 k6Var3 = this.f11522d;
        C4546p0 p0Var2 = this.f11523e;
        C4464h3 h3Var2 = this.f11519a;
        C4597u2 u2Var = this.f11520b;
        C4424d3 d3Var2 = this.f11532n;
        C4539o5 o5Var2 = this.f11531m;
        C4388b bVar6 = new C4388b(context, x0Var, k6Var3, p0Var2, h3Var2, u2Var, d3Var2, o5Var2, o5Var2.mo15743a(), this.f11534p, this.f11533o, a1Var, dVar);
        this.f11525g = bVar6;
    }

    /* renamed from: f */
    public C4410c mo15901f() {
        return this.f11521c;
    }

    /* renamed from: g */
    public C4464h3 mo15902g() {
        return this.f11519a;
    }

    /* renamed from: h */
    public ThreadPoolExecutor mo15903h() {
        return this.f11526h;
    }

    /* renamed from: i */
    public C4621x2 mo15904i() {
        return this.f11524f;
    }

    /* renamed from: j */
    public C4619x0 mo15905j() {
        return this.f11530l;
    }

    /* renamed from: k */
    public C4496l0 mo15906k() {
        return this.f11534p;
    }

    /* renamed from: l */
    public C4539o5 mo15907l() {
        return this.f11531m;
    }

    /* renamed from: m */
    public C4506m0 mo15908m() {
        return this.f11533o;
    }

    /* renamed from: n */
    public C4589t2 mo15909n() {
        return this.f11535q;
    }

    /* renamed from: o */
    public void mo15910o() {
        this.f11526h.execute(new C4624a());
    }

    /* renamed from: a */
    public C4424d3 mo15896a() {
        return this.f11532n;
    }

    /* renamed from: b */
    public C4525n6 mo15897b() {
        return this.f11528j;
    }

    /* renamed from: c */
    public C4388b mo15898c() {
        return this.f11525g;
    }

    /* renamed from: d */
    public C4546p0 mo15899d() {
        return this.f11523e;
    }

    /* renamed from: e */
    public C4492k6 mo15900e() {
        return this.f11522d;
    }

    /* renamed from: a */
    private C4630y2 m16057a(C4568r2 r2Var, C4420d0 d0Var) {
        return new C4605v2(new C4577s2(new C4406b3(r2Var), d0Var), this.f11521c);
    }

    /* renamed from: a */
    private C4630y2 m16056a(Context context, String str, String str2) {
        return new C4605v2(new C4577s2(new C4447f3(context, str, str2), this.f11526h), this.f11521c);
    }
}
