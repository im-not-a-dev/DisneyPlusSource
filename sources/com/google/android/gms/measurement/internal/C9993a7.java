package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.google.android.gms.common.C9832i;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p399o.C9928a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;

/* renamed from: com.google.android.gms.measurement.internal.a7 */
public final class C9993a7 extends C10046f5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C10190s7 f23282c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C10000b3 f23283d;

    /* renamed from: e */
    private volatile Boolean f23284e;

    /* renamed from: f */
    private final C9996b f23285f;

    /* renamed from: g */
    private final C10093j8 f23286g;

    /* renamed from: h */
    private final List<Runnable> f23287h = new ArrayList();

    /* renamed from: i */
    private final C9996b f23288i;

    protected C9993a7(C10145o4 o4Var) {
        super(o4Var);
        this.f23286g = new C10093j8(o4Var.mo25896c());
        this.f23282c = new C10190s7(this);
        this.f23285f = new C10259z6(this, o4Var);
        this.f23288i = new C10103k7(this, o4Var);
    }

    /* renamed from: I */
    private final boolean m31090I() {
        mo25894a();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m31091J() {
        mo25662j();
        this.f23286g.mo25863b();
        this.f23285f.mo25608a(((Long) C10106l.f23627L.mo26194a(null)).longValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public final void m31092K() {
        mo25662j();
        if (mo25585C()) {
            mo25898e().mo25869B().mo25908a("Inactivity, disconnecting from the service");
            mo25584B();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m31093L() {
        mo25662j();
        mo25898e().mo25869B().mo25909a("Processing queued up service tasks", Integer.valueOf(this.f23287h.size()));
        for (Runnable run : this.f23287h) {
            try {
                run.run();
            } catch (Exception e) {
                mo25898e().mo25874t().mo25909a("Task exception while flushing queue", e);
            }
        }
        this.f23287h.clear();
        this.f23288i.mo25607a();
    }

    /* renamed from: B */
    public final void mo25584B() {
        mo25662j();
        mo25754x();
        this.f23282c.mo26082a();
        try {
            C9928a.m30943a().mo25455a(mo25895b(), this.f23282c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f23283d = null;
    }

    /* renamed from: C */
    public final boolean mo25585C() {
        mo25662j();
        mo25754x();
        return this.f23283d != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo25586D() {
        mo25662j();
        mo25661h();
        mo25754x();
        C10028d9 a = m31095a(false);
        if (m31090I()) {
            mo25669t().mo25763B();
        }
        m31099a((Runnable) new C10026d7(this, a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo25587E() {
        mo25662j();
        mo25754x();
        C10028d9 a = m31095a(true);
        boolean a2 = mo25900g().mo25813a(C10106l.f23615C0);
        if (a2) {
            mo25669t().mo25764C();
        }
        m31099a((Runnable) new C10048f7(this, a, a2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo25588F() {
        mo25662j();
        mo25754x();
        m31099a((Runnable) new C10092j7(this, m31095a(true)));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25589G() {
        /*
            r6 = this;
            r6.mo25662j()
            r6.mo25754x()
            boolean r0 = r6.mo25585C()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r6.f23284e
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x011a
            r6.mo25662j()
            r6.mo25754x()
            com.google.android.gms.measurement.internal.t3 r0 = r6.mo25899f()
            java.lang.Boolean r0 = r0.mo26099v()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x0114
        L_0x002c:
            r6.mo25894a()
            com.google.android.gms.measurement.internal.c3 r0 = r6.mo25666q()
            int r0 = r0.mo25645G()
            if (r0 != r2) goto L_0x003d
        L_0x0039:
            r0 = 1
        L_0x003a:
            r3 = 1
            goto L_0x00f1
        L_0x003d:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25869B()
            java.lang.String r3 = "Checking service availability"
            r0.mo25908a(r3)
            com.google.android.gms.measurement.internal.y8 r0 = r6.mo25903m()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r0.mo26210a(r3)
            if (r0 == 0) goto L_0x00e2
            if (r0 == r2) goto L_0x00d2
            r3 = 2
            if (r0 == r3) goto L_0x00a6
            r3 = 3
            if (r0 == r3) goto L_0x0098
            r3 = 9
            if (r0 == r3) goto L_0x008a
            r3 = 18
            if (r0 == r3) goto L_0x007c
            com.google.android.gms.measurement.internal.k3 r3 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25877w()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "Unexpected service status"
            r3.mo25909a(r4, r0)
        L_0x0078:
            r0 = 0
        L_0x0079:
            r3 = 0
            goto L_0x00f1
        L_0x007c:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25877w()
            java.lang.String r3 = "Service updating"
            r0.mo25908a(r3)
            goto L_0x0039
        L_0x008a:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25877w()
            java.lang.String r3 = "Service invalid"
            r0.mo25908a(r3)
            goto L_0x0078
        L_0x0098:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25877w()
            java.lang.String r3 = "Service disabled"
            r0.mo25908a(r3)
            goto L_0x0078
        L_0x00a6:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25868A()
            java.lang.String r3 = "Service container out of date"
            r0.mo25908a(r3)
            com.google.android.gms.measurement.internal.y8 r0 = r6.mo25903m()
            int r0 = r0.mo26242v()
            r3 = 15300(0x3bc4, float:2.144E-41)
            if (r0 >= r3) goto L_0x00c0
            goto L_0x00df
        L_0x00c0:
            com.google.android.gms.measurement.internal.t3 r0 = r6.mo25899f()
            java.lang.Boolean r0 = r0.mo26099v()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0078
        L_0x00d0:
            r0 = 1
            goto L_0x0079
        L_0x00d2:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25869B()
            java.lang.String r3 = "Service missing"
            r0.mo25908a(r3)
        L_0x00df:
            r0 = 0
            goto L_0x003a
        L_0x00e2:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25869B()
            java.lang.String r3 = "Service available"
            r0.mo25908a(r3)
            goto L_0x0039
        L_0x00f1:
            if (r0 != 0) goto L_0x010b
            com.google.android.gms.measurement.internal.i9 r4 = r6.mo25900g()
            boolean r4 = r4.mo25841t()
            if (r4 == 0) goto L_0x010b
            com.google.android.gms.measurement.internal.k3 r3 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.mo25908a(r4)
            r3 = 0
        L_0x010b:
            if (r3 == 0) goto L_0x0114
            com.google.android.gms.measurement.internal.t3 r3 = r6.mo25899f()
            r3.mo26092b(r0)
        L_0x0114:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f23284e = r0
        L_0x011a:
            java.lang.Boolean r0 = r6.f23284e
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0128
            com.google.android.gms.measurement.internal.s7 r0 = r6.f23282c
            r0.mo26084b()
            return
        L_0x0128:
            com.google.android.gms.measurement.internal.i9 r0 = r6.mo25900g()
            boolean r0 = r0.mo25841t()
            if (r0 != 0) goto L_0x0186
            r6.mo25894a()
            android.content.Context r0 = r6.mo25895b()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r6.mo25895b()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x015b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x015b
            r1 = 1
        L_0x015b:
            if (r1 == 0) goto L_0x0179
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r6.mo25895b()
            r6.mo25894a()
            r1.<init>(r2, r5)
            r0.setComponent(r1)
            com.google.android.gms.measurement.internal.s7 r1 = r6.f23282c
            r1.mo26083a(r0)
            return
        L_0x0179:
            com.google.android.gms.measurement.internal.k3 r0 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25874t()
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.mo25908a(r1)
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9993a7.mo25589G():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final Boolean mo25590H() {
        return this.f23284e;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25592a(com.google.android.gms.measurement.internal.C10000b3 r12, com.google.android.gms.common.internal.p397z.C9918a r13, com.google.android.gms.measurement.internal.C10028d9 r14) {
        /*
            r11 = this;
            r11.mo25662j()
            r11.mo25661h()
            r11.mo25754x()
            boolean r0 = r11.m31090I()
            r1 = 0
            r2 = 100
            r3 = 0
            r4 = 100
        L_0x0013:
            r5 = 1001(0x3e9, float:1.403E-42)
            if (r3 >= r5) goto L_0x00a7
            if (r4 != r2) goto L_0x00a7
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.measurement.internal.g3 r5 = r11.mo25669t()
            java.util.List r5 = r5.mo25766a(r2)
            if (r5 == 0) goto L_0x0032
            r4.addAll(r5)
            int r5 = r5.size()
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r13 == 0) goto L_0x003a
            if (r5 >= r2) goto L_0x003a
            r4.add(r13)
        L_0x003a:
            int r6 = r4.size()
            r7 = 0
        L_0x003f:
            if (r7 >= r6) goto L_0x00a2
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            com.google.android.gms.common.internal.z.a r8 = (com.google.android.gms.common.internal.p397z.C9918a) r8
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.C10084j
            if (r9 == 0) goto L_0x0062
            com.google.android.gms.measurement.internal.j r8 = (com.google.android.gms.measurement.internal.C10084j) r8     // Catch:{ RemoteException -> 0x0053 }
            r12.mo25621a(r8, r14)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x003f
        L_0x0053:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k3 r9 = r11.mo25898e()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25874t()
            java.lang.String r10 = "Failed to send event to the service"
            r9.mo25909a(r10, r8)
            goto L_0x003f
        L_0x0062:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.C10201t8
            if (r9 == 0) goto L_0x007b
            com.google.android.gms.measurement.internal.t8 r8 = (com.google.android.gms.measurement.internal.C10201t8) r8     // Catch:{ RemoteException -> 0x006c }
            r12.mo25623a(r8, r14)     // Catch:{ RemoteException -> 0x006c }
            goto L_0x003f
        L_0x006c:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k3 r9 = r11.mo25898e()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25874t()
            java.lang.String r10 = "Failed to send attribute to the service"
            r9.mo25909a(r10, r8)
            goto L_0x003f
        L_0x007b:
            boolean r9 = r8 instanceof com.google.android.gms.measurement.internal.C10061g9
            if (r9 == 0) goto L_0x0094
            com.google.android.gms.measurement.internal.g9 r8 = (com.google.android.gms.measurement.internal.C10061g9) r8     // Catch:{ RemoteException -> 0x0085 }
            r12.mo25620a(r8, r14)     // Catch:{ RemoteException -> 0x0085 }
            goto L_0x003f
        L_0x0085:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k3 r9 = r11.mo25898e()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25874t()
            java.lang.String r10 = "Failed to send conditional property to the service"
            r9.mo25909a(r10, r8)
            goto L_0x003f
        L_0x0094:
            com.google.android.gms.measurement.internal.k3 r8 = r11.mo25898e()
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo25874t()
            java.lang.String r9 = "Discarding data. Unrecognized parcel type."
            r8.mo25908a(r9)
            goto L_0x003f
        L_0x00a2:
            int r3 = r3 + 1
            r4 = r5
            goto L_0x0013
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9993a7.mo25592a(com.google.android.gms.measurement.internal.b3, com.google.android.gms.common.internal.z.a, com.google.android.gms.measurement.internal.d9):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo25604z() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25594a(C10084j jVar, String str) {
        C9908u.m30853a(jVar);
        mo25662j();
        mo25754x();
        boolean I = m31090I();
        C10125m7 m7Var = new C10125m7(this, I, I && mo25669t().mo25768a(jVar), jVar, m31095a(true), str);
        m31099a((Runnable) m7Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25593a(C10061g9 g9Var) {
        C9908u.m30853a(g9Var);
        mo25662j();
        mo25754x();
        mo25894a();
        C10114l7 l7Var = new C10114l7(this, true, mo25669t().mo25767a(g9Var), new C10061g9(g9Var), m31095a(true), g9Var);
        m31099a((Runnable) l7Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25602a(AtomicReference<List<C10061g9>> atomicReference, String str, String str2, String str3) {
        mo25662j();
        mo25754x();
        C10148o7 o7Var = new C10148o7(this, atomicReference, str, str2, str3, m31095a(false));
        m31099a((Runnable) o7Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25599a(C11048bc bcVar, String str, String str2) {
        mo25662j();
        mo25754x();
        C10137n7 n7Var = new C10137n7(this, str, str2, m31095a(false), bcVar);
        m31099a((Runnable) n7Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25603a(AtomicReference<List<C10201t8>> atomicReference, String str, String str2, String str3, boolean z) {
        mo25662j();
        mo25754x();
        C10170q7 q7Var = new C10170q7(this, atomicReference, str, str2, str3, z, m31095a(false));
        m31099a((Runnable) q7Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25600a(C11048bc bcVar, String str, String str2, boolean z) {
        mo25662j();
        mo25754x();
        C10159p7 p7Var = new C10159p7(this, str, str2, z, m31095a(false), bcVar);
        m31099a((Runnable) p7Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25595a(C10201t8 t8Var) {
        mo25662j();
        mo25754x();
        m31099a((Runnable) new C10004b7(this, m31090I() && mo25669t().mo25769a(t8Var), t8Var, m31095a(true)));
    }

    /* renamed from: a */
    public final void mo25601a(AtomicReference<String> atomicReference) {
        mo25662j();
        mo25754x();
        m31099a((Runnable) new C10015c7(this, atomicReference, m31095a(false)));
    }

    /* renamed from: a */
    public final void mo25597a(C11048bc bcVar) {
        mo25662j();
        mo25754x();
        m31099a((Runnable) new C10059g7(this, m31095a(false), bcVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25596a(C10229w6 w6Var) {
        mo25662j();
        mo25754x();
        m31099a((Runnable) new C10081i7(this, w6Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25591a(C10000b3 b3Var) {
        mo25662j();
        C9908u.m30853a(b3Var);
        this.f23283d = b3Var;
        m31091J();
        m31093L();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31097a(ComponentName componentName) {
        mo25662j();
        if (this.f23283d != null) {
            this.f23283d = null;
            mo25898e().mo25869B().mo25909a("Disconnected from device MeasurementService", componentName);
            mo25662j();
            mo25589G();
        }
    }

    /* renamed from: a */
    private final void m31099a(Runnable runnable) throws IllegalStateException {
        mo25662j();
        if (mo25585C()) {
            runnable.run();
        } else if (((long) this.f23287h.size()) >= 1000) {
            mo25898e().mo25874t().mo25908a("Discarding data. Max runnable queue size reached");
        } else {
            this.f23287h.add(runnable);
            this.f23288i.mo25608a(60000);
            mo25589G();
        }
    }

    /* renamed from: a */
    private final C10028d9 m31095a(boolean z) {
        mo25894a();
        return mo25666q().mo25646a(z ? mo25898e().mo25870C() : null);
    }

    /* renamed from: a */
    public final void mo25598a(C11048bc bcVar, C10084j jVar, String str) {
        mo25662j();
        mo25754x();
        if (mo25903m().mo26210a((int) C9832i.f23040a) != 0) {
            mo25898e().mo25877w().mo25908a("Not bundling data. Service unavailable or out of date");
            mo25903m().mo26228a(bcVar, new byte[0]);
            return;
        }
        m31099a((Runnable) new C10070h7(this, jVar, str, bcVar));
    }
}
