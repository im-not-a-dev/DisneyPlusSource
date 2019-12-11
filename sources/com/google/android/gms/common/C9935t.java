package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9909u0;
import com.google.android.gms.common.internal.C9911v0;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C9963a;
import java.util.concurrent.Callable;
import p163g.p449j.p450a.p451a.p456c.C10957b;

/* renamed from: com.google.android.gms.common.t */
final class C9935t {

    /* renamed from: a */
    private static volatile C9909u0 f23210a;

    /* renamed from: b */
    private static final Object f23211b = new Object();

    /* renamed from: c */
    private static Context f23212c;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m30961a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.t> r0 = com.google.android.gms.common.C9935t.class
            monitor-enter(r0)
            android.content.Context r1 = f23212c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f23212c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C9935t.m30961a(android.content.Context):void");
    }

    /* renamed from: b */
    private static C9825d0 m30962b(String str, C9958v vVar, boolean z, boolean z2) {
        try {
            if (f23210a == null) {
                C9908u.m30853a(f23212c);
                synchronized (f23211b) {
                    if (f23210a == null) {
                        f23210a = C9911v0.m30872a(DynamiteModule.m31015a(f23212c, DynamiteModule.f23244j, "com.google.android.gms.googlecertificates").mo25482a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C9908u.m30853a(f23212c);
            try {
                if (f23210a.mo25437a(new C9821b0(str, vVar, z, z2), C10957b.m34643a(f23212c.getPackageManager()))) {
                    return C9825d0.m30604c();
                }
                return C9825d0.m30602a((Callable<String>) new C9936u<String>(z, str, vVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C9825d0.m30601a("module call", e);
            }
        } catch (C9963a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return C9825d0.m30601a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }

    /* renamed from: a */
    static C9825d0 m30959a(String str, C9958v vVar, boolean z, boolean z2) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m30962b(str, vVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m30960a(boolean z, String str, C9958v vVar) throws Exception {
        boolean z2 = true;
        if (z || !m30962b(str, vVar, true, false).f23034a) {
            z2 = false;
        }
        return C9825d0.m30603a(str, vVar, z, z2);
    }
}
