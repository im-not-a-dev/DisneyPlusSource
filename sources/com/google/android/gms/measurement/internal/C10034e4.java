package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.C9908u;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
public final class C10034e4 {

    /* renamed from: a */
    private final C10056g4 f23399a;

    public C10034e4(C10056g4 g4Var) {
        C9908u.m30853a(g4Var);
        this.f23399a = g4Var;
    }

    /* renamed from: a */
    public static boolean m31212a(Context context) {
        C9908u.m30853a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo25678a(Context context, Intent intent) {
        C10145o4 a = C10145o4.m31729a(context, (C11161ic) null);
        C10099k3 e = a.mo25898e();
        if (intent == null) {
            e.mo25877w().mo25908a("Receiver called with null intent");
            return;
        }
        a.mo25894a();
        String action = intent.getAction();
        e.mo25869B().mo25909a("Local receiver got", action);
        String str = "com.google.android.gms.measurement.UPLOAD";
        if (str.equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction(str);
            e.mo25869B().mo25908a("Starting wakeful intent.");
            this.f23399a.mo25514a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo25897d().mo25800a((Runnable) new C10023d4(this, a, e));
            } catch (Exception e2) {
                e.mo25877w().mo25909a("Install Referrer Reporter encountered a problem", e2);
            }
            PendingResult a2 = this.f23399a.mo25513a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                e.mo25869B().mo25908a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                }
                return;
            }
            e.mo25880z().mo25909a("Install referrer extras are", stringExtra);
            String str2 = "?";
            if (!stringExtra.contains(str2)) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            Bundle a3 = a.mo26022G().mo26213a(Uri.parse(stringExtra));
            if (a3 == null) {
                e.mo25869B().mo25908a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    e.mo25877w().mo25908a("Install referrer is missing timestamp");
                }
                C10078i4 d = a.mo25897d();
                C10067h4 h4Var = new C10067h4(this, a, longExtra, a3, context, e, a2);
                d.mo25800a((Runnable) h4Var);
            }
        }
    }
}
