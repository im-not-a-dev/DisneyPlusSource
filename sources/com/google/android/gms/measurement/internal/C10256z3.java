package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.p399o.C9928a;
import com.google.android.gms.common.p400p.C9930b;
import com.google.android.gms.common.p400p.C9931c;
import java.util.List;
import p163g.p449j.p450a.p451a.p457d.p464g.C11125g4;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
public final class C10256z3 {

    /* renamed from: a */
    final C10145o4 f24087a;

    C10256z3(C10145o4 o4Var) {
        this.f24087a = o4Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26245a(String str) {
        if (str == null || str.isEmpty()) {
            this.f24087a.mo25898e().mo25880z().mo25908a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f24087a.mo25897d().mo25662j();
        if (!m32026a()) {
            this.f24087a.mo25898e().mo25880z().mo25908a("Install Referrer Reporter is not available");
            return;
        }
        this.f24087a.mo25898e().mo25880z().mo25908a("Install Referrer Reporter is initializing");
        C10012c4 c4Var = new C10012c4(this, str);
        this.f24087a.mo25897d().mo25662j();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        String str2 = "com.android.vending";
        intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f24087a.mo25895b().getPackageManager();
        if (packageManager == null) {
            this.f24087a.mo25898e().mo25877w().mo25908a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f24087a.mo25898e().mo25880z().mo25908a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            String str3 = serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !str2.equals(str3) || !m32026a()) {
                this.f24087a.mo25898e().mo25880z().mo25908a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.f24087a.mo25898e().mo25880z().mo25909a("Install Referrer Service is", C9928a.m30943a().mo25456a(this.f24087a.mo25895b(), new Intent(intent), c4Var, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.f24087a.mo25898e().mo25874t().mo25909a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m32026a() {
        boolean z = false;
        try {
            C9930b a = C9931c.m30956a(this.f24087a.mo25895b());
            if (a == null) {
                this.f24087a.mo25898e().mo25880z().mo25908a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (a.mo25464b("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f24087a.mo25898e().mo25880z().mo25909a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo26244a(String str, C11125g4 g4Var) {
        this.f24087a.mo25897d().mo25662j();
        if (g4Var == null) {
            this.f24087a.mo25898e().mo25877w().mo25908a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle d = g4Var.mo28521d(bundle);
            if (d != null) {
                return d;
            }
            this.f24087a.mo25898e().mo25874t().mo25908a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f24087a.mo25898e().mo25874t().mo25909a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
