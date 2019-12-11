package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayDeque;
import java.util.Queue;
import p096e.p147m.p148a.C4235a;

/* renamed from: com.google.firebase.iid.q */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C10493q {

    /* renamed from: e */
    private static C10493q f24868e;

    /* renamed from: a */
    private String f24869a = null;

    /* renamed from: b */
    private Boolean f24870b = null;

    /* renamed from: c */
    private Boolean f24871c = null;

    /* renamed from: d */
    private final Queue<Intent> f24872d = new ArrayDeque();

    private C10493q() {
    }

    /* renamed from: b */
    public static synchronized C10493q m33097b() {
        C10493q qVar;
        synchronized (C10493q.class) {
            if (f24868e == null) {
                f24868e = new C10493q();
            }
            qVar = f24868e;
        }
        return qVar;
    }

    /* renamed from: c */
    private final synchronized String m33098c(Context context, Intent intent) {
        if (this.f24869a != null) {
            return this.f24869a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        if (serviceInfo.name.startsWith(".")) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            this.f24869a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            this.f24869a = serviceInfo.name;
                        }
                        return this.f24869a;
                    }
                }
                String str = "FirebaseInstanceId";
                String str2 = serviceInfo.packageName;
                String str3 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 94 + String.valueOf(str3).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str2);
                sb.append("/");
                sb.append(str3);
                Log.e(str, sb.toString());
                return null;
            }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: a */
    public final Intent mo27333a() {
        return (Intent) this.f24872d.poll();
    }

    /* renamed from: a */
    public final int mo27332a(Context context, Intent intent) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Starting service");
        }
        this.f24872d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m33096b(context, intent2);
    }

    /* renamed from: b */
    private final int m33096b(Context context, Intent intent) {
        ComponentName componentName;
        String c = m33098c(context, intent);
        String str = "FirebaseInstanceId";
        if (c != null) {
            if (Log.isLoggable(str, 3)) {
                String str2 = "Restricting intent to a specific service: ";
                String valueOf = String.valueOf(c);
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            intent.setClassName(context.getPackageName(), c);
        }
        try {
            if (mo27334a(context)) {
                componentName = C4235a.m14566b(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d(str, "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e(str, "Error while delivering the message: ServiceIntent not found.");
            return HttpStatus.HTTP_NOT_FOUND;
        } catch (SecurityException e) {
            Log.e(str, "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e(str, sb.toString());
            return 402;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo27334a(Context context) {
        if (this.f24870b == null) {
            this.f24870b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f24870b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f24870b.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo27335b(Context context) {
        if (this.f24871c == null) {
            this.f24871c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f24870b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f24871c.booleanValue();
    }
}
