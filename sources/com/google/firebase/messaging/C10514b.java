package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.analytics.p403a.C10419a;
import p163g.p449j.p482b.C11512c;

/* renamed from: com.google.firebase.messaging.b */
/* compiled from: com.google.firebase:firebase-messaging@@19.0.1 */
public class C10514b {
    /* renamed from: a */
    public static void m33175a(Intent intent) {
        m33176a("_nd", intent);
    }

    /* renamed from: b */
    public static void m33177b(Intent intent) {
        m33176a("_nf", intent);
    }

    /* renamed from: c */
    public static void m33178c(Intent intent) {
        if (intent != null) {
            String str = "FirebaseMessaging";
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                C10419a aVar = (C10419a) C11512c.m37128i().mo29429a(C10419a.class);
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    String str2 = "fcm";
                    aVar.mo27212a(str2, "_ln", (Object) stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString("medium", "notification");
                    bundle.putString("campaign", stringExtra);
                    aVar.mo27211a(str2, "_cmp", bundle);
                } else {
                    Log.w(str, "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            } else if (Log.isLoggable(str, 3)) {
                Log.d(str, "Received event with track-conversion=false. Do not set user property");
            }
        }
        m33176a("_no", intent);
    }

    /* renamed from: d */
    public static void m33179d(Intent intent) {
        m33176a("_nr", intent);
    }

    /* renamed from: e */
    public static boolean m33180e(Intent intent) {
        if (intent == null) {
            return false;
        }
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: a */
    private static void m33176a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        String str2 = "google.c.a.ts";
        String str3 = "FirebaseMessaging";
        if (intent.hasExtra(str2)) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra(str2)));
            } catch (NumberFormatException e) {
                Log.w(str3, "Error while parsing timestamp in GCM event", e);
            }
        }
        String str4 = "google.c.a.udt";
        if (intent.hasExtra(str4)) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra(str4)));
            } catch (NumberFormatException e2) {
                Log.w(str3, "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", (intent.getExtras() == null || !C10517e.m33190b(intent.getExtras())) ? "data" : "display");
        }
        if (Log.isLoggable(str3, 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(valueOf).length());
            sb.append("Sending event=");
            sb.append(str);
            sb.append(" params=");
            sb.append(valueOf);
            Log.d(str3, sb.toString());
        }
        C10419a aVar = (C10419a) C11512c.m37128i().mo29429a(C10419a.class);
        if (aVar != null) {
            aVar.mo27211a("fcm", str, bundle);
        } else {
            Log.w(str3, "Unable to log event: analytics library is missing");
        }
    }
}
