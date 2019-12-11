package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.C9733f;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9941e;
import com.google.android.gms.common.util.C9944h;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;
import p163g.p449j.p450a.p451a.p457d.p464g.C11283r1;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
public class C10145o4 implements C10135n5 {

    /* renamed from: G */
    private static volatile C10145o4 f23793G;

    /* renamed from: A */
    private volatile Boolean f23794A;

    /* renamed from: B */
    private Boolean f23795B;

    /* renamed from: C */
    private Boolean f23796C;

    /* renamed from: D */
    private int f23797D;

    /* renamed from: E */
    private AtomicInteger f23798E = new AtomicInteger(0);

    /* renamed from: F */
    private final long f23799F;

    /* renamed from: a */
    private final Context f23800a;

    /* renamed from: b */
    private final String f23801b;

    /* renamed from: c */
    private final String f23802c;

    /* renamed from: d */
    private final String f23803d;

    /* renamed from: e */
    private final boolean f23804e;

    /* renamed from: f */
    private final C10072h9 f23805f;

    /* renamed from: g */
    private final C10083i9 f23806g;

    /* renamed from: h */
    private final C10196t3 f23807h;

    /* renamed from: i */
    private final C10099k3 f23808i;

    /* renamed from: j */
    private final C10078i4 f23809j;

    /* renamed from: k */
    private final C10005b8 f23810k;

    /* renamed from: l */
    private final C10251y8 f23811l;

    /* renamed from: m */
    private final C10077i3 f23812m;

    /* renamed from: n */
    private final C9941e f23813n;

    /* renamed from: o */
    private final C10219v6 f23814o;

    /* renamed from: p */
    private final C10218v5 f23815p;

    /* renamed from: q */
    private final C9985a f23816q;

    /* renamed from: r */
    private final C10169q6 f23817r;

    /* renamed from: s */
    private C10055g3 f23818s;

    /* renamed from: t */
    private C9993a7 f23819t;

    /* renamed from: u */
    private C10018d f23820u;

    /* renamed from: v */
    private C10011c3 f23821v;

    /* renamed from: w */
    private C10256z3 f23822w;

    /* renamed from: x */
    private boolean f23823x = false;

    /* renamed from: y */
    private Boolean f23824y;

    /* renamed from: z */
    private long f23825z;

    private C10145o4(C10188s5 s5Var) {
        boolean z = false;
        C9908u.m30853a(s5Var);
        this.f23805f = new C10072h9(s5Var.f23909a);
        C10106l.m31491a(this.f23805f);
        this.f23800a = s5Var.f23909a;
        this.f23801b = s5Var.f23910b;
        this.f23802c = s5Var.f23911c;
        this.f23803d = s5Var.f23912d;
        this.f23804e = s5Var.f23916h;
        this.f23794A = s5Var.f23913e;
        C11161ic icVar = s5Var.f23915g;
        if (icVar != null) {
            Bundle bundle = icVar.f26258Z;
            if (bundle != null) {
                Object obj = bundle.get("measurementEnabled");
                if (obj instanceof Boolean) {
                    this.f23795B = (Boolean) obj;
                }
                Object obj2 = icVar.f26258Z.get("measurementDeactivated");
                if (obj2 instanceof Boolean) {
                    this.f23796C = (Boolean) obj2;
                }
            }
        }
        C11283r1.m36013a(this.f23800a);
        this.f23813n = C9944h.m30977d();
        this.f23799F = this.f23813n.mo25474c();
        this.f23806g = new C10083i9(this);
        C10196t3 t3Var = new C10196t3(this);
        t3Var.mo25882n();
        this.f23807h = t3Var;
        C10099k3 k3Var = new C10099k3(this);
        k3Var.mo25882n();
        this.f23808i = k3Var;
        C10251y8 y8Var = new C10251y8(this);
        y8Var.mo25882n();
        this.f23811l = y8Var;
        C10077i3 i3Var = new C10077i3(this);
        i3Var.mo25882n();
        this.f23812m = i3Var;
        this.f23816q = new C9985a(this);
        C10219v6 v6Var = new C10219v6(this);
        v6Var.mo25752v();
        this.f23814o = v6Var;
        C10218v5 v5Var = new C10218v5(this);
        v5Var.mo25752v();
        this.f23815p = v5Var;
        C10005b8 b8Var = new C10005b8(this);
        b8Var.mo25752v();
        this.f23810k = b8Var;
        C10169q6 q6Var = new C10169q6(this);
        q6Var.mo25882n();
        this.f23817r = q6Var;
        C10078i4 i4Var = new C10078i4(this);
        i4Var.mo25882n();
        this.f23809j = i4Var;
        C11161ic icVar2 = s5Var.f23915g;
        if (!(icVar2 == null || icVar2.f26253U == 0)) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f23800a.getApplicationContext() instanceof Application) {
            C10218v5 y = mo26047y();
            if (y.mo25895b().getApplicationContext() instanceof Application) {
                Application application = (Application) y.mo25895b().getApplicationContext();
                if (y.f23992c == null) {
                    y.f23992c = new C10147o6(y, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(y.f23992c);
                    application.registerActivityLifecycleCallbacks(y.f23992c);
                    y.mo25898e().mo25869B().mo25908a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo25898e().mo25877w().mo25908a("Application context is not an Application");
        }
        this.f23809j.mo25800a((Runnable) new C10167q4(this, s5Var));
    }

    /* renamed from: H */
    private final void m31727H() {
        if (!this.f23823x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: I */
    private final C10169q6 m31728I() {
        m31735b((C10101k5) this.f23817r);
        return this.f23817r;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31733a(C10188s5 s5Var) {
        String str;
        C10121m3 m3Var;
        mo25897d().mo25662j();
        C10083i9.m31360u();
        C10018d dVar = new C10018d(this);
        dVar.mo25882n();
        this.f23820u = dVar;
        C10011c3 c3Var = new C10011c3(this, s5Var.f23914f);
        c3Var.mo25752v();
        this.f23821v = c3Var;
        C10055g3 g3Var = new C10055g3(this);
        g3Var.mo25752v();
        this.f23818s = g3Var;
        C9993a7 a7Var = new C9993a7(this);
        a7Var.mo25752v();
        this.f23819t = a7Var;
        this.f23811l.mo25885q();
        this.f23807h.mo25885q();
        this.f23822w = new C10256z3(this);
        this.f23821v.mo25755y();
        mo25898e().mo25880z().mo25909a("App measurement is starting up, version", Long.valueOf(this.f23806g.mo25830n()));
        mo25898e().mo25880z().mo25908a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String C = c3Var.mo25641C();
        if (TextUtils.isEmpty(this.f23801b)) {
            if (mo26022G().mo26238d(C)) {
                m3Var = mo25898e().mo25880z();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                m3Var = mo25898e().mo25880z();
                String str2 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
                String valueOf = String.valueOf(C);
                str = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            m3Var.mo25908a(str);
        }
        mo25898e().mo25868A().mo25908a("Debug-level message logging enabled");
        if (this.f23797D != this.f23798E.get()) {
            mo25898e().mo25874t().mo25910a("Not all components initialized", Integer.valueOf(this.f23797D), Integer.valueOf(this.f23798E.get()));
        }
        this.f23823x = true;
    }

    /* renamed from: A */
    public final C9993a7 mo26016A() {
        m31734b((C10046f5) this.f23819t);
        return this.f23819t;
    }

    /* renamed from: B */
    public final C10219v6 mo26017B() {
        m31734b((C10046f5) this.f23814o);
        return this.f23814o;
    }

    /* renamed from: C */
    public final C10055g3 mo26018C() {
        m31734b((C10046f5) this.f23818s);
        return this.f23818s;
    }

    /* renamed from: D */
    public final C10005b8 mo26019D() {
        m31734b((C10046f5) this.f23810k);
        return this.f23810k;
    }

    /* renamed from: E */
    public final C10018d mo26020E() {
        m31735b((C10101k5) this.f23820u);
        return this.f23820u;
    }

    /* renamed from: F */
    public final C10077i3 mo26021F() {
        m31731a((C10112l5) this.f23812m);
        return this.f23812m;
    }

    /* renamed from: G */
    public final C10251y8 mo26022G() {
        m31731a((C10112l5) this.f23811l);
        return this.f23811l;
    }

    /* renamed from: b */
    public final Context mo25895b() {
        return this.f23800a;
    }

    /* renamed from: c */
    public final C9941e mo25896c() {
        return this.f23813n;
    }

    /* renamed from: d */
    public final C10078i4 mo25897d() {
        m31735b((C10101k5) this.f23809j);
        return this.f23809j;
    }

    /* renamed from: e */
    public final C10099k3 mo25898e() {
        m31735b((C10101k5) this.f23808i);
        return this.f23808i;
    }

    /* renamed from: f */
    public final boolean mo26028f() {
        boolean z;
        mo25897d().mo25662j();
        m31727H();
        if (this.f23806g.mo25813a(C10106l.f23665l0)) {
            if (this.f23806g.mo25834p()) {
                return false;
            }
            Boolean bool = this.f23796C;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            Boolean x = mo26030h().mo26101x();
            if (x != null) {
                return x.booleanValue();
            }
            Boolean q = this.f23806g.mo25836q();
            if (q != null) {
                return q.booleanValue();
            }
            Boolean bool2 = this.f23795B;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (C9733f.m30273b()) {
                return false;
            }
            if (!this.f23806g.mo25813a(C10106l.f23655g0) || this.f23794A == null) {
                return true;
            }
            return this.f23794A.booleanValue();
        } else if (this.f23806g.mo25834p()) {
            return false;
        } else {
            Boolean q2 = this.f23806g.mo25836q();
            if (q2 != null) {
                z = q2.booleanValue();
            } else {
                z = !C9733f.m30273b();
                if (z && this.f23794A != null && ((Boolean) C10106l.f23655g0.mo26194a(null)).booleanValue()) {
                    z = this.f23794A.booleanValue();
                }
            }
            return mo26030h().mo26094c(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo26029g() {
        mo25897d().mo25662j();
        if (mo26030h().f23933e.mo26196a() == 0) {
            mo26030h().f23933e.mo26197a(this.f23813n.mo25474c());
        }
        if (Long.valueOf(mo26030h().f23938j.mo26196a()).longValue() == 0) {
            mo25898e().mo25869B().mo25909a("Persisting first open", Long.valueOf(this.f23799F));
            mo26030h().f23938j.mo26197a(this.f23799F);
        }
        if (mo26043u()) {
            if (!TextUtils.isEmpty(mo26048z().mo25640B()) || !TextUtils.isEmpty(mo26048z().mo25642D())) {
                mo26022G();
                if (C10251y8.m31976a(mo26048z().mo25640B(), mo26030h().mo26097t(), mo26048z().mo25642D(), mo26030h().mo26098u())) {
                    mo25898e().mo25880z().mo25908a("Rechecking which service to use due to a GMP App Id change");
                    mo26030h().mo26100w();
                    mo26018C().mo25763B();
                    this.f23819t.mo25584B();
                    this.f23819t.mo25589G();
                    mo26030h().f23938j.mo26197a(this.f23799F);
                    mo26030h().f23940l.mo25581a(null);
                }
                mo26030h().mo26093c(mo26048z().mo25640B());
                mo26030h().mo26095d(mo26048z().mo25642D());
            }
            mo26047y().mo26148a(mo26030h().f23940l.mo25580a());
            if (!TextUtils.isEmpty(mo26048z().mo25640B()) || !TextUtils.isEmpty(mo26048z().mo25642D())) {
                boolean f = mo26028f();
                if (!mo26030h().mo26087A() && !this.f23806g.mo25834p()) {
                    mo26030h().mo26096d(!f);
                }
                if (f) {
                    mo26047y().mo26139L();
                }
                mo26016A().mo25601a(new AtomicReference<>());
            }
        } else if (mo26028f()) {
            if (!mo26022G().mo26236c("android.permission.INTERNET")) {
                mo25898e().mo25874t().mo25908a("App is missing INTERNET permission");
            }
            if (!mo26022G().mo26236c("android.permission.ACCESS_NETWORK_STATE")) {
                mo25898e().mo25874t().mo25908a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C9931c.m30956a(this.f23800a).mo25461a() && !this.f23806g.mo25841t()) {
                if (!C10034e4.m31212a(this.f23800a)) {
                    mo25898e().mo25874t().mo25908a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C10251y8.m31971a(this.f23800a, false)) {
                    mo25898e().mo25874t().mo25908a("AppMeasurementService not registered/enabled");
                }
            }
            mo25898e().mo25874t().mo25908a("Uploading is not possible. App measurement disabled");
        }
        mo26030h().f23948t.mo26126a(this.f23806g.mo25813a(C10106l.f23681t0));
        mo26030h().f23949u.mo26126a(this.f23806g.mo25813a(C10106l.f23683u0));
    }

    /* renamed from: h */
    public final C10196t3 mo26030h() {
        m31731a((C10112l5) this.f23807h);
        return this.f23807h;
    }

    /* renamed from: i */
    public final C10083i9 mo26031i() {
        return this.f23806g;
    }

    /* renamed from: j */
    public final C10099k3 mo26032j() {
        C10099k3 k3Var = this.f23808i;
        if (k3Var == null || !k3Var.mo25883o()) {
            return null;
        }
        return this.f23808i;
    }

    /* renamed from: k */
    public final C10256z3 mo26033k() {
        return this.f23822w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final C10078i4 mo26034l() {
        return this.f23809j;
    }

    /* renamed from: m */
    public final boolean mo26035m() {
        return TextUtils.isEmpty(this.f23801b);
    }

    /* renamed from: n */
    public final String mo26036n() {
        return this.f23801b;
    }

    /* renamed from: o */
    public final String mo26037o() {
        return this.f23802c;
    }

    /* renamed from: p */
    public final String mo26038p() {
        return this.f23803d;
    }

    /* renamed from: q */
    public final boolean mo26039q() {
        return this.f23804e;
    }

    /* renamed from: r */
    public final boolean mo26040r() {
        return this.f23794A != null && this.f23794A.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final long mo26041s() {
        Long valueOf = Long.valueOf(mo26030h().f23938j.mo26196a());
        if (valueOf.longValue() == 0) {
            return this.f23799F;
        }
        return Math.min(this.f23799F, valueOf.longValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final void mo26042t() {
        this.f23798E.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo26043u() {
        m31727H();
        mo25897d().mo25662j();
        Boolean bool = this.f23824y;
        if (bool == null || this.f23825z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f23813n.mo25472a() - this.f23825z) > 1000)) {
            this.f23825z = this.f23813n.mo25472a();
            boolean z = true;
            this.f23824y = Boolean.valueOf(mo26022G().mo26236c("android.permission.INTERNET") && mo26022G().mo26236c("android.permission.ACCESS_NETWORK_STATE") && (C9931c.m30956a(this.f23800a).mo25461a() || this.f23806g.mo25841t() || (C10034e4.m31212a(this.f23800a) && C10251y8.m31971a(this.f23800a, false))));
            if (this.f23824y.booleanValue()) {
                if (!mo26022G().mo26239d(mo26048z().mo25640B(), mo26048z().mo25642D()) && TextUtils.isEmpty(mo26048z().mo25642D())) {
                    z = false;
                }
                this.f23824y = Boolean.valueOf(z);
            }
        }
        return this.f23824y.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final void mo26044v() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo26045w() {
    }

    /* renamed from: x */
    public final C9985a mo26046x() {
        C9985a aVar = this.f23816q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: y */
    public final C10218v5 mo26047y() {
        m31734b((C10046f5) this.f23815p);
        return this.f23815p;
    }

    /* renamed from: z */
    public final C10011c3 mo26048z() {
        m31734b((C10046f5) this.f23821v);
        return this.f23821v;
    }

    /* renamed from: b */
    private static void m31735b(C10101k5 k5Var) {
        if (k5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!k5Var.mo25883o()) {
            String valueOf = String.valueOf(k5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m31734b(C10046f5 f5Var) {
        if (f5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!f5Var.mo25753w()) {
            String valueOf = String.valueOf(f5Var.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final C10072h9 mo25894a() {
        return this.f23805f;
    }

    /* renamed from: a */
    public static C10145o4 m31730a(Context context, String str, String str2, Bundle bundle) {
        C11161ic icVar = new C11161ic(0, 0, true, null, null, null, bundle);
        return m31729a(context, icVar);
    }

    /* renamed from: a */
    public static C10145o4 m31729a(Context context, C11161ic icVar) {
        if (icVar != null && (icVar.f26256X == null || icVar.f26257Y == null)) {
            C11161ic icVar2 = new C11161ic(icVar.f26259c, icVar.f26253U, icVar.f26254V, icVar.f26255W, null, null, icVar.f26258Z);
            icVar = icVar2;
        }
        C9908u.m30853a(context);
        C9908u.m30853a(context.getApplicationContext());
        if (f23793G == null) {
            synchronized (C10145o4.class) {
                if (f23793G == null) {
                    f23793G = new C10145o4(new C10188s5(context, icVar));
                }
            }
        } else if (icVar != null) {
            Bundle bundle = icVar.f26258Z;
            if (bundle != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
                f23793G.mo26027a(icVar.f26258Z.getBoolean("dataCollectionDefaultEnabled"));
            }
        }
        return f23793G;
    }

    /* renamed from: a */
    private static void m31731a(C10112l5 l5Var) {
        if (l5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26027a(boolean z) {
        this.f23794A = Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26024a(C10101k5 k5Var) {
        this.f23797D++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26023a(C10046f5 f5Var) {
        this.f23797D++;
    }

    /* renamed from: a */
    public final void mo26025a(C11048bc bcVar) {
        mo25897d().mo25662j();
        m31735b((C10101k5) m31728I());
        String C = mo26048z().mo25641C();
        Pair a = mo26030h().mo26088a(C);
        String str = "";
        if (!this.f23806g.mo25838r().booleanValue() || ((Boolean) a.second).booleanValue()) {
            mo25898e().mo25868A().mo25908a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            mo26022G().mo26225a(bcVar, str);
        } else if (!m31728I().mo26069t()) {
            mo25898e().mo25877w().mo25908a("Network is not available for Deferred Deep Link request. Skipping");
            mo26022G().mo26225a(bcVar, str);
        } else {
            URL a2 = mo26022G().mo26218a(mo26048z().mo25900g().mo25830n(), C, (String) a.first);
            C10169q6 I = m31728I();
            C10134n4 n4Var = new C10134n4(this, bcVar);
            I.mo25662j();
            I.mo25884p();
            C9908u.m30853a(a2);
            C9908u.m30853a(n4Var);
            C10078i4 d = I.mo25897d();
            C10189s6 s6Var = new C10189s6(I, C, a2, null, null, n4Var);
            d.mo25802b((Runnable) s6Var);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0081 A[Catch:{ JSONException -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096 A[Catch:{ JSONException -> 0x00b2 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo26026a(p163g.p449j.p450a.p451a.p457d.p464g.C11048bc r7, java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            r6 = this;
            java.lang.String r8 = "gclid"
            java.lang.String r12 = "deeplink"
            r0 = 1
            r1 = 0
            r2 = 200(0xc8, float:2.8E-43)
            if (r9 == r2) goto L_0x0012
            r2 = 204(0xcc, float:2.86E-43)
            if (r9 == r2) goto L_0x0012
            r2 = 304(0x130, float:4.26E-43)
            if (r9 != r2) goto L_0x0016
        L_0x0012:
            if (r10 != 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.k3 r8 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo25877w()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r11 = "Network Request for Deferred Deep Link failed. response, exception"
            r8.mo25910a(r11, r9, r10)
            com.google.android.gms.measurement.internal.y8 r8 = r6.mo26022G()
            r8.mo26225a(r7, r3)
            return
        L_0x0034:
            int r9 = r11.length
            if (r9 != 0) goto L_0x003f
            com.google.android.gms.measurement.internal.y8 r8 = r6.mo26022G()
            r8.mo26225a(r7, r3)
            return
        L_0x003f:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r11)
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b2 }
            r10.<init>(r9)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r9 = r10.optString(r12, r3)     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r10 = r10.optString(r8, r3)     // Catch:{ JSONException -> 0x00b2 }
            com.google.android.gms.measurement.internal.y8 r11 = r6.mo26022G()     // Catch:{ JSONException -> 0x00b2 }
            r11.mo25661h()     // Catch:{ JSONException -> 0x00b2 }
            boolean r2 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x00b2 }
            if (r2 != 0) goto L_0x007e
            android.content.Context r11 = r11.mo25895b()     // Catch:{ JSONException -> 0x00b2 }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ JSONException -> 0x00b2 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r5 = android.net.Uri.parse(r9)     // Catch:{ JSONException -> 0x00b2 }
            r2.<init>(r4, r5)     // Catch:{ JSONException -> 0x00b2 }
            java.util.List r11 = r11.queryIntentActivities(r2, r1)     // Catch:{ JSONException -> 0x00b2 }
            if (r11 == 0) goto L_0x007e
            boolean r11 = r11.isEmpty()     // Catch:{ JSONException -> 0x00b2 }
            if (r11 != 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r0 = 0
        L_0x007f:
            if (r0 != 0) goto L_0x0096
            com.google.android.gms.measurement.internal.k3 r8 = r6.mo25898e()     // Catch:{ JSONException -> 0x00b2 }
            com.google.android.gms.measurement.internal.m3 r8 = r8.mo25877w()     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r11 = "Deferred Deep Link validation failed. gclid, deep link"
            r8.mo25910a(r11, r10, r9)     // Catch:{ JSONException -> 0x00b2 }
            com.google.android.gms.measurement.internal.y8 r8 = r6.mo26022G()     // Catch:{ JSONException -> 0x00b2 }
            r8.mo26225a(r7, r3)     // Catch:{ JSONException -> 0x00b2 }
            return
        L_0x0096:
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b2 }
            r11.<init>()     // Catch:{ JSONException -> 0x00b2 }
            r11.putString(r12, r9)     // Catch:{ JSONException -> 0x00b2 }
            r11.putString(r8, r10)     // Catch:{ JSONException -> 0x00b2 }
            com.google.android.gms.measurement.internal.v5 r8 = r6.f23815p     // Catch:{ JSONException -> 0x00b2 }
            java.lang.String r10 = "auto"
            java.lang.String r12 = "_cmp"
            r8.mo26161b(r10, r12, r11)     // Catch:{ JSONException -> 0x00b2 }
            com.google.android.gms.measurement.internal.y8 r8 = r6.mo26022G()     // Catch:{ JSONException -> 0x00b2 }
            r8.mo26225a(r7, r9)     // Catch:{ JSONException -> 0x00b2 }
            return
        L_0x00b2:
            r8 = move-exception
            com.google.android.gms.measurement.internal.k3 r9 = r6.mo25898e()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25874t()
            java.lang.String r10 = "Failed to parse the Deferred Deep Link response. exception"
            r9.mo25909a(r10, r8)
            com.google.android.gms.measurement.internal.y8 r8 = r6.mo26022G()
            r8.mo26225a(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10145o4.mo26026a(g.j.a.a.d.g.bc, java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
