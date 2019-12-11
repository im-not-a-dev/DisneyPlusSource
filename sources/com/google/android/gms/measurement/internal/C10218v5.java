package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C9733f;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.util.C9942f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p096e.p113e.C3926a;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
public final class C10218v5 extends C10046f5 {

    /* renamed from: c */
    protected C10147o6 f23992c;

    /* renamed from: d */
    private C10168q5 f23993d;

    /* renamed from: e */
    private final Set<C10198t5> f23994e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f23995f;

    /* renamed from: g */
    private final AtomicReference<String> f23996g = new AtomicReference<>();

    /* renamed from: h */
    protected boolean f23997h = true;

    protected C10218v5(C10145o4 o4Var) {
        super(o4Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m31876M() {
        if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23663k0)) {
            mo25662j();
            String a = mo25899f().f23947s.mo25580a();
            if (a != null) {
                if ("unset".equals(a)) {
                    mo26152a("app", "_npa", (Object) null, mo25896c().mo25474c());
                } else {
                    mo26152a("app", "_npa", (Object) Long.valueOf("true".equals(a) ? 1 : 0), mo25896c().mo25474c());
                }
            }
        }
        if (!this.f23701a.mo26028f() || !this.f23997h) {
            mo25898e().mo25868A().mo25908a("Updating Scion state (FE)");
            mo25667r().mo25588F();
            return;
        }
        mo25898e().mo25868A().mo25908a("Recording app launch after enabling measurement for the first time (FE)");
        mo26139L();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m31890c(boolean z) {
        mo25662j();
        mo25661h();
        mo25754x();
        mo25898e().mo25868A().mo25909a("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        mo25899f().mo26089a(z);
        m31876M();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m31891d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "creation_timestamp";
        String str2 = "origin";
        String str3 = "app_id";
        mo25662j();
        mo25754x();
        C9908u.m30853a(bundle);
        String str4 = "name";
        C9908u.m30863b(bundle2.getString(str4));
        if (!this.f23701a.mo26028f()) {
            mo25898e().mo25868A().mo25908a("Conditional property not cleared since collection is disabled");
            return;
        }
        C10201t8 t8Var = new C10201t8(bundle2.getString(str4), 0, null, null);
        try {
            C10084j a = mo25903m().mo26216a(bundle2.getString(str3), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString(str2), bundle2.getLong(str), true, false);
            C10201t8 t8Var2 = t8Var;
            C10061g9 g9Var = new C10061g9(bundle2.getString(str3), bundle2.getString(str2), t8Var2, bundle2.getLong(str), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), a);
            mo25667r().mo25593a(g9Var);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: B */
    public final String mo26129B() {
        C10229w6 C = this.f23701a.mo26017B().mo26166C();
        if (C != null) {
            return C.f24020b;
        }
        return null;
    }

    /* renamed from: C */
    public final String mo26130C() {
        C10229w6 C = this.f23701a.mo26017B().mo26166C();
        if (C != null) {
            return C.f24019a;
        }
        return null;
    }

    /* renamed from: D */
    public final String mo26131D() {
        if (this.f23701a.mo26036n() != null) {
            return this.f23701a.mo26036n();
        }
        try {
            return C9733f.m30272a();
        } catch (IllegalStateException e) {
            this.f23701a.mo25898e().mo25874t().mo25909a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: E */
    public final String mo26132E() {
        mo25661h();
        return (String) this.f23996g.get();
    }

    /* renamed from: F */
    public final void mo26133F() {
        if (mo25895b().getApplicationContext() instanceof Application) {
            ((Application) mo25895b().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f23992c);
        }
    }

    /* renamed from: G */
    public final Boolean mo26134G() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) mo25897d().mo25798a(atomicReference, 15000, "boolean test flag value", new C10208u5(this, atomicReference));
    }

    /* renamed from: H */
    public final String mo26135H() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) mo25897d().mo25798a(atomicReference, 15000, "String test flag value", new C10014c6(this, atomicReference));
    }

    /* renamed from: I */
    public final Long mo26136I() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) mo25897d().mo25798a(atomicReference, 15000, "long test flag value", new C10047f6(this, atomicReference));
    }

    /* renamed from: J */
    public final Integer mo26137J() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) mo25897d().mo25798a(atomicReference, 15000, "int test flag value", new C10080i6(this, atomicReference));
    }

    /* renamed from: K */
    public final Double mo26138K() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) mo25897d().mo25798a(atomicReference, 15000, "double test flag value", new C10069h6(this, atomicReference));
    }

    /* renamed from: L */
    public final void mo26139L() {
        mo25662j();
        mo25661h();
        mo25754x();
        if (this.f23701a.mo26043u()) {
            mo25667r().mo25587E();
            this.f23997h = false;
            String y = mo25899f().mo26102y();
            if (!TextUtils.isEmpty(y)) {
                mo25901k().mo25884p();
                if (!y.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", y);
                    mo26161b("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26156a(boolean z) {
        mo25754x();
        mo25661h();
        mo25897d().mo25800a((Runnable) new C10102k6(this, z));
    }

    /* renamed from: b */
    public final void mo26162b(boolean z) {
        mo25754x();
        mo25661h();
        mo25897d().mo25800a((Runnable) new C10091j6(this, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo25604z() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26149a(String str, String str2, long j, Bundle bundle) {
        mo25661h();
        mo25662j();
        m31881a(str, str2, j, bundle, true, this.f23993d == null || C10251y8.m31988h(str2), false, null);
    }

    /* renamed from: b */
    public final void mo26158b(long j) {
        mo25661h();
        mo25897d().mo25800a((Runnable) new C10124m6(this, j));
    }

    /* renamed from: c */
    public final void mo26163c(long j) {
        mo25661h();
        mo25897d().mo25800a((Runnable) new C10113l6(this, j));
    }

    /* renamed from: b */
    public final void mo26161b(String str, String str2, Bundle bundle) {
        mo26151a(str, str2, bundle, true, true, mo25896c().mo25474c());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31881a(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C10229w6 w6Var;
        int i;
        int i2;
        ArrayList arrayList;
        long j2;
        Bundle bundle2;
        Class cls;
        String str9 = str;
        String str10 = str2;
        long j3 = j;
        Bundle bundle3 = bundle;
        String str11 = str3;
        C9908u.m30863b(str);
        if (!mo25900g().mo25821e(str11, C10106l.f23673p0)) {
            C9908u.m30863b(str2);
        }
        C9908u.m30853a(bundle);
        mo25662j();
        mo25754x();
        if (!this.f23701a.mo26028f()) {
            mo25898e().mo25868A().mo25908a("Event not sent since app measurement is disabled");
            return;
        }
        if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23687w0)) {
            List E = mo25666q().mo25643E();
            if (E != null && !E.contains(str10)) {
                mo25898e().mo25868A().mo25910a("Dropping non-safelisted event. event name, origin", str10, str9);
                return;
            }
        }
        int i3 = 0;
        if (!this.f23995f) {
            this.f23995f = true;
            try {
                if (!this.f23701a.mo26039q()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, mo25895b().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{mo25895b()});
                } catch (Exception e) {
                    mo25898e().mo25877w().mo25909a("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                mo25898e().mo25880z().mo25908a("Tag Manager is not found and thus will not be used");
            }
        }
        if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23617D0) && "_cmp".equals(str10)) {
            String str12 = "gclid";
            if (bundle3.containsKey(str12)) {
                mo26152a("auto", "_lgclid", (Object) bundle3.getString(str12), mo25896c().mo25474c());
            }
        }
        if (z3) {
            mo25894a();
            if (!"_iap".equals(str10)) {
                C10251y8 G = this.f23701a.mo26022G();
                String str13 = "event";
                int i4 = 2;
                if (G.mo26234b(str13, str10)) {
                    if (!G.mo26231a(str13, C10157p5.f23851a, str10)) {
                        i4 = 13;
                    } else if (G.mo26230a(str13, 40, str10)) {
                        i4 = 0;
                    }
                }
                if (i4 != 0) {
                    mo25898e().mo25876v().mo25909a("Invalid public event name. Event will not be logged (FE)", mo25902l().mo25795a(str10));
                    this.f23701a.mo26022G();
                    this.f23701a.mo26022G().mo26219a(i4, "_ev", C10251y8.m31969a(str10, 40, true), str10 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        mo25894a();
        C10229w6 B = mo25668s().mo26165B();
        String str14 = "_sc";
        if (B != null && !bundle3.containsKey(str14)) {
            B.f24022d = true;
        }
        C10219v6.m31932a(B, bundle3, z && z3);
        boolean equals = "am".equals(str9);
        boolean h = C10251y8.m31988h(str2);
        if (z && this.f23993d != null && !h && !equals) {
            mo25898e().mo25868A().mo25910a("Passing event to registered event handler (FE)", mo25902l().mo25795a(str10), mo25902l().mo25792a(bundle3));
            this.f23993d.mo25574a(str, str2, bundle, j);
        } else if (this.f23701a.mo26043u()) {
            int a = mo25903m().mo26211a(str10);
            if (a != 0) {
                mo25898e().mo25876v().mo25909a("Invalid event name. Event will not be logged (FE)", mo25902l().mo25795a(str10));
                mo25903m();
                String a2 = C10251y8.m31969a(str10, 40, true);
                if (str10 != null) {
                    i3 = str2.length();
                }
                this.f23701a.mo26022G().mo26229a(str3, a, "_ev", a2, i3);
                return;
            }
            String str15 = "_sn";
            String str16 = "_o";
            String str17 = "_si";
            List a3 = C9942f.m30974a((T[]) new String[]{str16, str15, str14, str17});
            String str18 = str11;
            String str19 = str10;
            Bundle a4 = mo25903m().mo26215a(str3, str2, bundle, a3, z3, true);
            C10229w6 w6Var2 = (a4 == null || !a4.containsKey(str14) || !a4.containsKey(str17)) ? null : new C10229w6(a4.getString(str15), a4.getString(str14), Long.valueOf(a4.getLong(str17)).longValue());
            C10229w6 w6Var3 = w6Var2 == null ? B : w6Var2;
            String str20 = "_ae";
            if (mo25900g().mo25839r(str18)) {
                mo25894a();
                if (mo25668s().mo26165B() != null && str20.equals(str19)) {
                    long D = mo25670u().mo25634D();
                    if (D > 0) {
                        mo25903m().mo26220a(a4, D);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a4);
            long nextLong = mo25903m().mo26241u().nextLong();
            if (!mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23649d0) || mo25899f().f23950v.mo26196a() <= 0 || !mo25899f().mo26090a(j) || !mo25899f().f23953y.mo26127a()) {
                str4 = str16;
            } else {
                mo25898e().mo25869B().mo25908a("Current session is expired, remove the session number and Id");
                if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23641Z)) {
                    str4 = str16;
                    mo26152a("auto", "_sid", (Object) null, mo25896c().mo25474c());
                } else {
                    str4 = str16;
                }
                if (mo25900g().mo25821e(mo25666q().mo25641C(), C10106l.f23643a0)) {
                    mo26152a("auto", "_sno", (Object) null, mo25896c().mo25474c());
                }
            }
            if (!mo25900g().mo25837q(mo25666q().mo25641C()) || a4.getLong("extend_session", 0) != 1) {
                long j4 = j;
            } else {
                mo25898e().mo25869B().mo25908a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.f23701a.mo26019D().mo25635a(j, true);
            }
            String[] strArr = (String[]) a4.keySet().toArray(new String[bundle.size()]);
            Arrays.sort(strArr);
            int length = strArr.length;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                str5 = "_eid";
                if (i5 >= length) {
                    break;
                }
                String str21 = strArr[i5];
                Object obj = a4.get(str21);
                mo25903m();
                String[] strArr2 = strArr;
                Bundle[] a5 = C10251y8.m31979a(obj);
                if (a5 != null) {
                    i = length;
                    a4.putInt(str21, a5.length);
                    int i7 = 0;
                    while (i7 < a5.length) {
                        Bundle bundle4 = a5[i7];
                        C10219v6.m31932a(w6Var3, bundle4, true);
                        String str22 = str5;
                        int i8 = i6;
                        int i9 = i7;
                        int i10 = i5;
                        long j5 = nextLong;
                        Bundle bundle5 = bundle4;
                        ArrayList arrayList3 = arrayList2;
                        C10229w6 w6Var4 = w6Var3;
                        String str23 = str20;
                        Bundle bundle6 = a4;
                        Bundle a6 = mo25903m().mo26215a(str3, "_ep", bundle5, a3, z3, false);
                        a6.putString("_en", str19);
                        a6.putLong(str22, j5);
                        a6.putString("_gn", str21);
                        a6.putInt("_ll", a5.length);
                        int i11 = i9;
                        a6.putInt("_i", i11);
                        arrayList3.add(a6);
                        int i12 = i11 + 1;
                        a4 = bundle6;
                        nextLong = j5;
                        arrayList2 = arrayList3;
                        i7 = i12;
                        i5 = i10;
                        w6Var3 = w6Var4;
                        i6 = i8;
                        str20 = str23;
                        str5 = str22;
                    }
                    w6Var = w6Var3;
                    i2 = i5;
                    j2 = nextLong;
                    arrayList = arrayList2;
                    str8 = str20;
                    bundle2 = a4;
                    i6 += a5.length;
                } else {
                    w6Var = w6Var3;
                    i = length;
                    i2 = i5;
                    int i13 = i6;
                    j2 = nextLong;
                    arrayList = arrayList2;
                    str8 = str20;
                    bundle2 = a4;
                }
                a4 = bundle2;
                nextLong = j2;
                arrayList2 = arrayList;
                length = i;
                w6Var3 = w6Var;
                str20 = str8;
                long j6 = j;
                i5 = i2 + 1;
                strArr = strArr2;
            }
            String str24 = str5;
            int i14 = i6;
            long j7 = nextLong;
            ArrayList arrayList4 = arrayList2;
            String str25 = str20;
            Bundle bundle7 = a4;
            if (i14 != 0) {
                bundle7.putLong(str24, j7);
                bundle7.putInt("_epc", i14);
            }
            int i15 = 0;
            while (i15 < arrayList4.size()) {
                Bundle bundle8 = (Bundle) arrayList4.get(i15);
                if (i15 != 0) {
                    str7 = "_ep";
                    str6 = str19;
                } else {
                    str7 = str19;
                    str6 = str7;
                }
                String str26 = str4;
                bundle8.putString(str26, str);
                if (z2) {
                    bundle8 = mo25903m().mo26214a(bundle8);
                }
                Bundle bundle9 = bundle8;
                mo25898e().mo25868A().mo25910a("Logging event (FE)", mo25902l().mo25795a(str6), mo25902l().mo25792a(bundle9));
                ArrayList arrayList5 = arrayList4;
                C10084j jVar = new C10084j(str7, new C10073i(bundle9), str, j);
                mo25667r().mo25594a(jVar, str3);
                if (!equals) {
                    for (C10198t5 a7 : this.f23994e) {
                        a7.mo25573a(str, str2, new Bundle(bundle9), j);
                    }
                }
                i15++;
                str19 = str6;
                str4 = str26;
                arrayList4 = arrayList5;
            }
            String str27 = str19;
            mo25894a();
            if (mo25668s().mo26165B() != null && str25.equals(str27)) {
                mo25670u().mo25636a(true, true);
            }
        }
    }

    /* renamed from: b */
    private final void m31887b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = C10251y8.m31980b(bundle);
        C10078i4 d = mo25897d();
        C10238x5 x5Var = new C10238x5(this, str, str2, j, b, z, z2, z3, str3);
        d.mo25800a((Runnable) x5Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo26164c(String str, String str2, Bundle bundle) {
        mo25661h();
        mo25662j();
        mo26149a(str, str2, mo25896c().mo25474c(), bundle);
    }

    /* renamed from: b */
    public final void mo26160b(C10198t5 t5Var) {
        mo25661h();
        mo25754x();
        C9908u.m30853a(t5Var);
        if (!this.f23994e.remove(t5Var)) {
            mo25898e().mo25877w().mo25908a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m31889c(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = "app_id";
        mo25662j();
        mo25754x();
        C9908u.m30853a(bundle);
        String str2 = "name";
        C9908u.m30863b(bundle2.getString(str2));
        String str3 = "origin";
        C9908u.m30863b(bundle2.getString(str3));
        String str4 = "value";
        C9908u.m30853a(bundle2.get(str4));
        if (!this.f23701a.mo26028f()) {
            mo25898e().mo25868A().mo25908a("Conditional property not sent since collection is disabled");
            return;
        }
        C10201t8 t8Var = new C10201t8(bundle2.getString(str2), bundle2.getLong("triggered_timestamp"), bundle2.get(str4), bundle2.getString(str3));
        try {
            C10084j a = mo25903m().mo26216a(bundle2.getString(str), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString(str3), 0, true, false);
            C10061g9 g9Var = new C10061g9(bundle2.getString(str), bundle2.getString(str3), t8Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), mo25903m().mo26216a(bundle2.getString(str), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString(str3), 0, true, false), bundle2.getLong("trigger_timeout"), a, bundle2.getLong("time_to_live"), mo25903m().mo26216a(bundle2.getString(str), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString(str3), 0, true, false));
            mo25667r().mo25593a(g9Var);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo26159b(Bundle bundle) {
        C9908u.m30853a(bundle);
        C9908u.m30863b(bundle.getString("app_id"));
        mo25663n();
        throw null;
    }

    /* renamed from: b */
    private final void m31885b(Bundle bundle, long j) {
        C9908u.m30853a(bundle);
        C10123m5.m31568a(bundle, "app_id", String.class, null);
        String str = "origin";
        C10123m5.m31568a(bundle, str, String.class, null);
        String str2 = "name";
        C10123m5.m31568a(bundle, str2, String.class, null);
        String str3 = "value";
        C10123m5.m31568a(bundle, str3, Object.class, null);
        String str4 = "trigger_event_name";
        C10123m5.m31568a(bundle, str4, String.class, null);
        Long valueOf = Long.valueOf(0);
        String str5 = "trigger_timeout";
        C10123m5.m31568a(bundle, str5, Long.class, valueOf);
        C10123m5.m31568a(bundle, "timed_out_event_name", String.class, null);
        C10123m5.m31568a(bundle, "timed_out_event_params", Bundle.class, null);
        C10123m5.m31568a(bundle, "triggered_event_name", String.class, null);
        C10123m5.m31568a(bundle, "triggered_event_params", Bundle.class, null);
        String str6 = "time_to_live";
        C10123m5.m31568a(bundle, str6, Long.class, valueOf);
        C10123m5.m31568a(bundle, "expired_event_name", String.class, null);
        C10123m5.m31568a(bundle, "expired_event_params", Bundle.class, null);
        C9908u.m30863b(bundle.getString(str2));
        C9908u.m30863b(bundle.getString(str));
        C9908u.m30853a(bundle.get(str3));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString(str2);
        Object obj = bundle.get(str3);
        if (mo25903m().mo26232b(string) != 0) {
            mo25898e().mo25874t().mo25909a("Invalid conditional user property name", mo25902l().mo25797c(string));
        } else if (mo25903m().mo26233b(string, obj) != 0) {
            mo25898e().mo25874t().mo25910a("Invalid conditional user property value", mo25902l().mo25797c(string), obj);
        } else {
            Object c = mo25903m().mo26235c(string, obj);
            if (c == null) {
                mo25898e().mo25874t().mo25910a("Unable to normalize conditional user property value", mo25902l().mo25797c(string), obj);
                return;
            }
            C10123m5.m31569a(bundle, c);
            long j2 = bundle.getLong(str5);
            if (TextUtils.isEmpty(bundle.getString(str4)) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong(str6);
                if (j3 > 15552000000L || j3 < 1) {
                    mo25898e().mo25874t().mo25910a("Invalid conditional user property time to live", mo25902l().mo25797c(string), Long.valueOf(j3));
                    return;
                }
                mo25897d().mo25800a((Runnable) new C10003b6(this, bundle));
                return;
            }
            mo25898e().mo25874t().mo25910a("Invalid conditional user property timeout", mo25902l().mo25797c(string), Long.valueOf(j2));
        }
    }

    /* renamed from: b */
    private final void m31888b(String str, String str2, String str3, Bundle bundle) {
        long c = mo25896c().mo25474c();
        C9908u.m30863b(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", c);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        mo25897d().mo25800a((Runnable) new C9992a6(this, bundle2));
    }

    /* renamed from: b */
    public final ArrayList<Bundle> mo26157b(String str, String str2) {
        mo25661h();
        return m31883b((String) null, str, str2);
    }

    /* renamed from: b */
    private final ArrayList<Bundle> m31883b(String str, String str2, String str3) {
        if (mo25897d().mo25804t()) {
            mo25898e().mo25874t().mo25908a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C10072h9.m31319a()) {
            mo25898e().mo25874t().mo25908a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C10078i4 d = this.f23701a.mo25897d();
                C10025d6 d6Var = new C10025d6(this, atomicReference, str, str2, str3);
                d.mo25800a((Runnable) d6Var);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo25898e().mo25877w().mo25910a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List list = (List) atomicReference.get();
            if (list != null) {
                return C10251y8.m31981b(list);
            }
            mo25898e().mo25877w().mo25909a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    /* renamed from: b */
    private final Map<String, Object> m31884b(String str, String str2, String str3, boolean z) {
        if (mo25897d().mo25804t()) {
            mo25898e().mo25874t().mo25908a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C10072h9.m31319a()) {
            mo25898e().mo25874t().mo25908a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C10078i4 d = this.f23701a.mo25897d();
                C10058g6 g6Var = new C10058g6(this, atomicReference, str, str2, str3, z);
                d.mo25800a((Runnable) g6Var);
                try {
                    atomicReference.wait(5000);
                } catch (InterruptedException e) {
                    mo25898e().mo25877w().mo25909a("Interrupted waiting for get user properties", e);
                }
            }
            List<C10201t8> list = (List) atomicReference.get();
            if (list == null) {
                mo25898e().mo25877w().mo25908a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            C3926a aVar = new C3926a(list.size());
            for (C10201t8 t8Var : list) {
                aVar.put(t8Var.f23959U, t8Var.mo26106c());
            }
            return aVar;
        }
    }

    /* renamed from: a */
    public final void mo26151a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        mo25661h();
        m31887b(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.f23993d == null || C10251y8.m31988h(str2), !z, null);
    }

    /* renamed from: a */
    public final void mo26153a(String str, String str2, Object obj, boolean z) {
        mo26154a(str, str2, obj, z, mo25896c().mo25474c());
    }

    /* renamed from: a */
    public final void mo26154a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo25903m().mo26232b(str2);
        } else {
            C10251y8 m = mo25903m();
            String str4 = "user property";
            if (m.mo26234b(str4, str2)) {
                if (!m.mo26231a(str4, C10178r5.f23887a, str2)) {
                    i = 15;
                } else if (m.mo26230a(str4, 24, str2)) {
                    i = 0;
                }
            }
        }
        String str5 = "_ev";
        if (i != 0) {
            mo25903m();
            String a = C10251y8.m31969a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f23701a.mo26022G().mo26219a(i, str5, a, i2);
        } else if (obj != null) {
            int b = mo25903m().mo26233b(str2, obj);
            if (b != 0) {
                mo25903m();
                String a2 = C10251y8.m31969a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f23701a.mo26022G().mo26219a(b, str5, a2, i2);
                return;
            }
            Object c = mo25903m().mo26235c(str2, obj);
            if (c != null) {
                m31882a(str3, str2, j, c);
            }
        } else {
            m31882a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m31882a(String str, String str2, long j, Object obj) {
        C10078i4 d = mo25897d();
        C10228w5 w5Var = new C10228w5(this, str, str2, obj, j);
        d.mo25800a((Runnable) w5Var);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r10v14, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=null, for r11v0, types: [java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2
      assigns: []
      uses: []
      mth insns count: 71
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26152a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C9908u.m30863b(r9)
            com.google.android.gms.common.internal.C9908u.m30863b(r10)
            r8.mo25662j()
            r8.mo25661h()
            r8.mo25754x()
            com.google.android.gms.measurement.internal.i9 r0 = r8.mo25900g()
            com.google.android.gms.measurement.internal.c3 r1 = r8.mo25666q()
            java.lang.String r1 = r1.mo25641C()
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C10106l.f23663k0
            boolean r0 = r0.mo25821e(r1, r2)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0077
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0067
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0067
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x004c
            r4 = r2
            goto L_0x004e
        L_0x004c:
            r4 = 0
        L_0x004e:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.t3 r0 = r8.mo25899f()
            com.google.android.gms.measurement.internal.a4 r0 = r0.f23947s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x0062
            java.lang.String r11 = "true"
        L_0x0062:
            r0.mo25581a(r11)
            r6 = r10
            goto L_0x0075
        L_0x0067:
            if (r11 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.t3 r10 = r8.mo25899f()
            com.google.android.gms.measurement.internal.a4 r10 = r10.f23947s
            java.lang.String r0 = "unset"
            r10.mo25581a(r0)
            r6 = r11
        L_0x0075:
            r3 = r1
            goto L_0x0079
        L_0x0077:
            r3 = r10
            r6 = r11
        L_0x0079:
            com.google.android.gms.measurement.internal.o4 r10 = r8.f23701a
            boolean r10 = r10.mo26028f()
            if (r10 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.k3 r9 = r8.mo25898e()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25868A()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo25908a(r10)
            return
        L_0x008f:
            com.google.android.gms.measurement.internal.o4 r10 = r8.f23701a
            boolean r10 = r10.mo26043u()
            if (r10 != 0) goto L_0x0098
            return
        L_0x0098:
            com.google.android.gms.measurement.internal.k3 r10 = r8.mo25898e()
            com.google.android.gms.measurement.internal.m3 r10 = r10.mo25868A()
            com.google.android.gms.measurement.internal.i3 r11 = r8.mo25902l()
            java.lang.String r11 = r11.mo25795a(r3)
            java.lang.String r0 = "Setting user property (FE)"
            r10.mo25910a(r0, r11, r6)
            com.google.android.gms.measurement.internal.t8 r10 = new com.google.android.gms.measurement.internal.t8
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.a7 r9 = r8.mo25667r()
            r9.mo25595a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10218v5.mo26152a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26148a(String str) {
        this.f23996g.set(str);
    }

    /* renamed from: a */
    public final void mo26143a(long j) {
        mo26148a((String) null);
        mo25897d().mo25800a((Runnable) new C10258z5(this, j));
    }

    /* renamed from: a */
    public final void mo26146a(C10168q5 q5Var) {
        mo25662j();
        mo25661h();
        mo25754x();
        if (q5Var != null) {
            C10168q5 q5Var2 = this.f23993d;
            if (q5Var != q5Var2) {
                C9908u.m30865b(q5Var2 == null, "EventInterceptor already set.");
            }
        }
        this.f23993d = q5Var;
    }

    /* renamed from: a */
    public final void mo26147a(C10198t5 t5Var) {
        mo25661h();
        mo25754x();
        C9908u.m30853a(t5Var);
        if (!this.f23994e.add(t5Var)) {
            mo25898e().mo25877w().mo25908a("OnEventListener already registered");
        }
    }

    /* renamed from: a */
    public final void mo26144a(Bundle bundle) {
        mo26145a(bundle, mo25896c().mo25474c());
    }

    /* renamed from: a */
    public final void mo26145a(Bundle bundle, long j) {
        C9908u.m30853a(bundle);
        mo25661h();
        Bundle bundle2 = new Bundle(bundle);
        String str = "app_id";
        if (!TextUtils.isEmpty(bundle2.getString(str))) {
            mo25898e().mo25877w().mo25908a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove(str);
        m31885b(bundle2, j);
    }

    /* renamed from: a */
    public final void mo26150a(String str, String str2, Bundle bundle) {
        mo25661h();
        m31888b((String) null, str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo26155a(String str, String str2, String str3, Bundle bundle) {
        C9908u.m30863b(str);
        mo25663n();
        throw null;
    }

    /* renamed from: a */
    public final ArrayList<Bundle> mo26140a(String str, String str2, String str3) {
        C9908u.m30863b(str);
        mo25663n();
        throw null;
    }

    /* renamed from: a */
    public final Map<String, Object> mo26142a(String str, String str2, boolean z) {
        mo25661h();
        return m31884b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final Map<String, Object> mo26141a(String str, String str2, String str3, boolean z) {
        C9908u.m30863b(str);
        mo25663n();
        throw null;
    }
}
