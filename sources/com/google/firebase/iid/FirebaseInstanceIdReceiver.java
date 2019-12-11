package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C9948l;
import p096e.p147m.p148a.C4235a;

/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class FirebaseInstanceIdReceiver extends C4235a {

    /* renamed from: V */
    private static C10462b0 f24800V;

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m33032a(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        boolean z = true;
        boolean z2 = C9948l.m30996i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return m33034b(broadcastReceiver, context, intent);
        }
        int a = C10493q.m33097b().mo27332a(context, intent);
        if (!C9948l.m30996i() || a != 402) {
            return a;
        }
        m33034b(broadcastReceiver, context, intent);
        return 403;
    }

    /* renamed from: b */
    private static int m33034b(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Binding to service");
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m33033a(context, "com.google.firebase.MESSAGING_EVENT").mo27292a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    /* renamed from: c */
    private final void m33035c(Context context, Intent intent) {
        int i;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                String str = "FirebaseInstanceId";
                if (Log.isLoggable(str, 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(valueOf);
                    Log.d(str, sb.toString());
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.getInstance().zze();
                } else if ("SYNC".equals(stringExtra)) {
                    FirebaseInstanceId.getInstance().zzg();
                }
            }
            i = -1;
        } else {
            String str2 = "gcm.rawData64";
            String stringExtra2 = intent.getStringExtra(str2);
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra(str2);
            }
            i = m33032a(this, context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m33035c(context, intent2);
            } else {
                m33035c(context, intent);
            }
        }
    }

    /* renamed from: a */
    private static synchronized C10462b0 m33033a(Context context, String str) {
        C10462b0 b0Var;
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (f24800V == null) {
                f24800V = new C10462b0(context, str);
            }
            b0Var = f24800V;
        }
        return b0Var;
    }
}
