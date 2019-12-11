package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9949m;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.measurement.internal.i9 */
public final class C10083i9 extends C10112l5 {

    /* renamed from: b */
    private Boolean f23556b;

    /* renamed from: c */
    private C10105k9 f23557c = C10116l9.f23712a;

    /* renamed from: d */
    private Boolean f23558d;

    C10083i9(C10145o4 o4Var) {
        super(o4Var);
        C10106l.m31492a(o4Var);
    }

    /* renamed from: u */
    static String m31360u() {
        return (String) C10106l.f23652f.mo26194a(null);
    }

    /* renamed from: v */
    private final Bundle m31361v() {
        try {
            if (mo25895b().getPackageManager() == null) {
                mo25898e().mo25874t().mo25908a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = C9931c.m30956a(mo25895b()).mo25459a(mo25895b().getPackageName(), 128);
            if (a != null) {
                return a.metaData;
            }
            mo25898e().mo25874t().mo25908a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (NameNotFoundException e) {
            mo25898e().mo25874t().mo25909a("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: w */
    public static long m31362w() {
        return ((Long) C10106l.f23624I.mo26194a(null)).longValue();
    }

    /* renamed from: x */
    public static long m31363x() {
        return ((Long) C10106l.f23658i.mo26194a(null)).longValue();
    }

    /* renamed from: y */
    public static boolean m31364y() {
        return ((Boolean) C10106l.f23650e.mo26194a(null)).booleanValue();
    }

    /* renamed from: z */
    static boolean m31365z() {
        return ((Boolean) C10106l.f23640Y.mo26194a(null)).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25812a(C10105k9 k9Var) {
        this.f23557c = k9Var;
    }

    /* renamed from: b */
    public final int mo25814b(String str, C10245y2<Integer> y2Var) {
        if (str == null) {
            return ((Integer) y2Var.mo26194a(null)).intValue();
        }
        String a = this.f23557c.mo25846a(str, y2Var.mo26195a());
        if (TextUtils.isEmpty(a)) {
            return ((Integer) y2Var.mo26194a(null)).intValue();
        }
        try {
            return ((Integer) y2Var.mo26194a(Integer.valueOf(Integer.parseInt(a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) y2Var.mo26194a(null)).intValue();
        }
    }

    /* renamed from: c */
    public final double mo25816c(String str, C10245y2<Double> y2Var) {
        if (str == null) {
            return ((Double) y2Var.mo26194a(null)).doubleValue();
        }
        String a = this.f23557c.mo25846a(str, y2Var.mo26195a());
        if (TextUtils.isEmpty(a)) {
            return ((Double) y2Var.mo26194a(null)).doubleValue();
        }
        try {
            return ((Double) y2Var.mo26194a(Double.valueOf(Double.parseDouble(a)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) y2Var.mo26194a(null)).doubleValue();
        }
    }

    /* renamed from: d */
    public final boolean mo25819d(String str, C10245y2<Boolean> y2Var) {
        if (str == null) {
            return ((Boolean) y2Var.mo26194a(null)).booleanValue();
        }
        String a = this.f23557c.mo25846a(str, y2Var.mo26195a());
        if (TextUtils.isEmpty(a)) {
            return ((Boolean) y2Var.mo26194a(null)).booleanValue();
        }
        return ((Boolean) y2Var.mo26194a(Boolean.valueOf(Boolean.parseBoolean(a)))).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo25821e(String str, C10245y2<Boolean> y2Var) {
        return mo25819d(str, y2Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo25822f(String str) {
        return mo25819d(str, C10106l.f23634S);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final boolean mo25823g(String str) {
        return mo25819d(str, C10106l.f23628M);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final String mo25824h(String str) {
        C10245y2<String> y2Var = C10106l.f23629N;
        if (str == null) {
            return (String) y2Var.mo26194a(null);
        }
        return (String) y2Var.mo26194a(this.f23557c.mo25846a(str, y2Var.mo26195a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final boolean mo25825i(String str) {
        return mo25819d(str, C10106l.f23635T);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo25826j(String str) {
        return mo25819d(str, C10106l.f23636U);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo25827k(String str) {
        return mo25819d(str, C10106l.f23637V);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final boolean mo25828l(String str) {
        return mo25819d(str, C10106l.f23639X);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final boolean mo25829m(String str) {
        return mo25819d(str, C10106l.f23638W);
    }

    /* renamed from: n */
    public final long mo25830n() {
        mo25894a();
        return 16250;
    }

    /* renamed from: o */
    public final boolean mo25832o() {
        if (this.f23558d == null) {
            synchronized (this) {
                if (this.f23558d == null) {
                    ApplicationInfo applicationInfo = mo25895b().getApplicationInfo();
                    String a = C9949m.m30998a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f23558d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.f23558d == null) {
                        this.f23558d = Boolean.TRUE;
                        mo25898e().mo25874t().mo25908a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f23558d.booleanValue();
    }

    /* renamed from: p */
    public final boolean mo25834p() {
        mo25894a();
        Boolean b = mo25815b("firebase_analytics_collection_deactivated");
        return b != null && b.booleanValue();
    }

    /* renamed from: q */
    public final Boolean mo25836q() {
        mo25894a();
        return mo25815b("firebase_analytics_collection_enabled");
    }

    /* renamed from: r */
    public final Boolean mo25838r() {
        mo25661h();
        Boolean b = mo25815b("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(b == null || b.booleanValue());
    }

    /* renamed from: s */
    public final String mo25840s() {
        String str = "";
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", str});
        } catch (ClassNotFoundException e) {
            mo25898e().mo25874t().mo25909a("Could not find SystemProperties class", e);
            return str;
        } catch (NoSuchMethodException e2) {
            mo25898e().mo25874t().mo25909a("Could not find SystemProperties.get() method", e2);
            return str;
        } catch (IllegalAccessException e3) {
            mo25898e().mo25874t().mo25909a("Could not access SystemProperties.get()", e3);
            return str;
        } catch (InvocationTargetException e4) {
            mo25898e().mo25874t().mo25909a("SystemProperties.get() threw an exception", e4);
            return str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final boolean mo25841t() {
        if (this.f23556b == null) {
            this.f23556b = mo25815b("app_measurement_lite");
            if (this.f23556b == null) {
                this.f23556b = Boolean.valueOf(false);
            }
        }
        if (this.f23556b.booleanValue() || !this.f23701a.mo26039q()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo25810a(String str) {
        return mo25814b(str, C10106l.f23680t);
    }

    /* renamed from: e */
    public final boolean mo25820e(String str) {
        return "1".equals(this.f23557c.mo25846a(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final boolean mo25831n(String str) {
        return mo25819d(str, C10106l.f23641Z);
    }

    /* renamed from: a */
    public final long mo25811a(String str, C10245y2<Long> y2Var) {
        if (str == null) {
            return ((Long) y2Var.mo26194a(null)).longValue();
        }
        String a = this.f23557c.mo25846a(str, y2Var.mo26195a());
        if (TextUtils.isEmpty(a)) {
            return ((Long) y2Var.mo26194a(null)).longValue();
        }
        try {
            return ((Long) y2Var.mo26194a(Long.valueOf(Long.parseLong(a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) y2Var.mo26194a(null)).longValue();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final boolean mo25837q(String str) {
        return mo25819d(str, C10106l.f23647c0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final boolean mo25835p(String str) {
        return mo25819d(str, C10106l.f23645b0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final boolean mo25839r(String str) {
        return mo25819d(str, C10106l.f23657h0);
    }

    /* renamed from: d */
    public final boolean mo25818d(String str) {
        return "1".equals(this.f23557c.mo25846a(str, "gaia_collection_enabled"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Boolean mo25815b(String str) {
        C9908u.m30863b(str);
        Bundle v = m31361v();
        if (v == null) {
            mo25898e().mo25874t().mo25908a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!v.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(v.getBoolean(str));
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo25817c(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.C9908u.m30863b(r4)
            android.os.Bundle r0 = r3.m31361v()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.k3 r4 = r3.mo25898e()
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.mo25908a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.mo25895b()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.k3 r0 = r3.mo25898e()
            com.google.android.gms.measurement.internal.m3 r0 = r0.mo25874t()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.mo25909a(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10083i9.mo25817c(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo25813a(C10245y2<Boolean> y2Var) {
        return mo25819d(null, y2Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final boolean mo25833o(String str) {
        return mo25819d(str, C10106l.f23643a0);
    }
}
