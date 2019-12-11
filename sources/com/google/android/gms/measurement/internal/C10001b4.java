package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.p399o.C9928a;
import p163g.p449j.p450a.p451a.p457d.p464g.C11125g4;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
final class C10001b4 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ ServiceConnection f23303U;

    /* renamed from: V */
    private final /* synthetic */ C10012c4 f23304V;

    /* renamed from: c */
    private final /* synthetic */ C11125g4 f23305c;

    C10001b4(C10012c4 c4Var, C11125g4 g4Var, ServiceConnection serviceConnection) {
        this.f23304V = c4Var;
        this.f23305c = g4Var;
        this.f23303U = serviceConnection;
    }

    public final void run() {
        C10012c4 c4Var = this.f23304V;
        C10256z3 z3Var = c4Var.f23340U;
        String a = c4Var.f23341c;
        C11125g4 g4Var = this.f23305c;
        ServiceConnection serviceConnection = this.f23303U;
        Bundle a2 = z3Var.mo26244a(a, g4Var);
        z3Var.f24087a.mo25897d().mo25662j();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                z3Var.f24087a.mo25898e().mo25874t().mo25908a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    z3Var.f24087a.mo25898e().mo25874t().mo25908a("No referrer defined in install referrer response");
                } else {
                    z3Var.f24087a.mo25898e().mo25869B().mo25909a("InstallReferrer API result", string);
                    C10251y8 G = z3Var.f24087a.mo26022G();
                    String str = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a3 = G.mo26213a(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
                    if (a3 == null) {
                        z3Var.f24087a.mo25898e().mo25874t().mo25908a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a3.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                z3Var.f24087a.mo25898e().mo25874t().mo25908a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a3.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == z3Var.f24087a.mo26030h().f23939k.mo26196a()) {
                            z3Var.f24087a.mo25894a();
                            z3Var.f24087a.mo25898e().mo25869B().mo25908a("Campaign has already been logged");
                        } else {
                            z3Var.f24087a.mo26030h().f23939k.mo26197a(j);
                            z3Var.f24087a.mo25894a();
                            String str2 = "referrer API";
                            z3Var.f24087a.mo25898e().mo25869B().mo25909a("Logging Install Referrer campaign from sdk with ", str2);
                            a3.putString("_cis", str2);
                            z3Var.f24087a.mo26047y().mo26161b("auto", "_cmp", a3);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C9928a.m30943a().mo25455a(z3Var.f24087a.mo25895b(), serviceConnection);
        }
    }
}
