package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C9908u;
import java.util.Map;
import p096e.p113e.C3926a;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
public final class C10219v6 extends C10046f5 {

    /* renamed from: c */
    protected C10229w6 f23998c;

    /* renamed from: d */
    private volatile C10229w6 f23999d;

    /* renamed from: e */
    private C10229w6 f24000e;

    /* renamed from: f */
    private final Map<Activity, C10229w6> f24001f = new C3926a();

    /* renamed from: g */
    private String f24002g;

    public C10219v6(C10145o4 o4Var) {
        super(o4Var);
    }

    /* renamed from: d */
    private final C10229w6 m31934d(Activity activity) {
        C9908u.m30853a(activity);
        C10229w6 w6Var = (C10229w6) this.f24001f.get(activity);
        if (w6Var != null) {
            return w6Var;
        }
        C10229w6 w6Var2 = new C10229w6(null, m31929a(activity.getClass().getCanonicalName()), mo25903m().mo26240t());
        this.f24001f.put(activity, w6Var2);
        return w6Var2;
    }

    /* renamed from: B */
    public final C10229w6 mo26165B() {
        mo25754x();
        mo25662j();
        return this.f23998c;
    }

    /* renamed from: C */
    public final C10229w6 mo26166C() {
        mo25661h();
        return this.f23999d;
    }

    /* renamed from: a */
    public final void mo26169a(Activity activity, String str, String str2) {
        if (this.f23999d == null) {
            mo25898e().mo25879y().mo25908a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f24001f.get(activity) == null) {
            mo25898e().mo25879y().mo25908a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m31929a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f23999d.f24020b.equals(str2);
            boolean e = C10251y8.m31985e(this.f23999d.f24019a, str);
            if (equals && e) {
                mo25898e().mo25879y().mo25908a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                mo25898e().mo25879y().mo25909a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                mo25898e().mo25869B().mo25910a("Setting current screen to name, class", str == null ? "null" : str, str2);
                C10229w6 w6Var = new C10229w6(str, str2, mo25903m().mo26240t());
                this.f24001f.put(activity, w6Var);
                m31930a(activity, w6Var, true);
            } else {
                mo25898e().mo25879y().mo25909a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: b */
    public final void mo26171b(Activity activity) {
        C10229w6 d = m31934d(activity);
        this.f24000e = this.f23999d;
        this.f23999d = null;
        mo25897d().mo25800a((Runnable) new C10239x6(this, d));
    }

    /* renamed from: c */
    public final void mo26173c(Activity activity) {
        m31930a(activity, m31934d(activity), false);
        C9985a o = mo25664o();
        o.mo25897d().mo25800a((Runnable) new C10033e3(o, o.mo25896c().mo25472a()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo25604z() {
        return false;
    }

    /* renamed from: b */
    public final void mo26172b(Activity activity, Bundle bundle) {
        if (bundle != null) {
            C10229w6 w6Var = (C10229w6) this.f24001f.get(activity);
            if (w6Var != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("id", w6Var.f24021c);
                bundle2.putString("name", w6Var.f24019a);
                bundle2.putString("referrer_name", w6Var.f24020b);
                bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
            }
        }
    }

    /* renamed from: a */
    private final void m31930a(Activity activity, C10229w6 w6Var, boolean z) {
        C10229w6 w6Var2 = this.f23999d == null ? this.f24000e : this.f23999d;
        if (w6Var.f24020b == null) {
            w6Var = new C10229w6(w6Var.f24019a, m31929a(activity.getClass().getCanonicalName()), w6Var.f24021c);
        }
        this.f24000e = this.f23999d;
        this.f23999d = w6Var;
        mo25897d().mo25800a((Runnable) new C10249y6(this, z, w6Var2, w6Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m31933a(C10229w6 w6Var, boolean z) {
        mo25664o().mo25575a(mo25896c().mo25472a());
        if (mo25670u().mo25636a(w6Var.f24022d, z)) {
            w6Var.f24022d = false;
        }
    }

    /* renamed from: a */
    public static void m31932a(C10229w6 w6Var, Bundle bundle, boolean z) {
        String str = "_si";
        String str2 = "_sn";
        String str3 = "_sc";
        if (bundle == null || w6Var == null || (bundle.containsKey(str3) && !z)) {
            if (bundle != null && w6Var == null && z) {
                bundle.remove(str2);
                bundle.remove(str3);
                bundle.remove(str);
            }
            return;
        }
        String str4 = w6Var.f24019a;
        if (str4 != null) {
            bundle.putString(str2, str4);
        } else {
            bundle.remove(str2);
        }
        bundle.putString(str3, w6Var.f24020b);
        bundle.putLong(str, w6Var.f24021c);
    }

    /* renamed from: a */
    public final void mo26170a(String str, C10229w6 w6Var) {
        mo25662j();
        synchronized (this) {
            if (this.f24002g == null || this.f24002g.equals(str) || w6Var != null) {
                this.f24002g = str;
            }
        }
    }

    /* renamed from: a */
    private static String m31929a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: a */
    public final void mo26168a(Activity activity, Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("com.google.app_measurement.screen_service");
            if (bundle2 != null) {
                this.f24001f.put(activity, new C10229w6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
            }
        }
    }

    /* renamed from: a */
    public final void mo26167a(Activity activity) {
        this.f24001f.remove(activity);
    }
}
