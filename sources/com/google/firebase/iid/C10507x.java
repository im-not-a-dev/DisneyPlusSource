package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import p096e.p113e.C3926a;
import p163g.p449j.p450a.p451a.p467f.C11435h;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.firebase.iid.x */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10507x {

    /* renamed from: a */
    private int f24898a = 0;

    /* renamed from: b */
    private final Map<Integer, C11436i<Void>> f24899b = new C3926a();

    /* renamed from: c */
    private final C10499t f24900c;

    C10507x(C10499t tVar) {
        this.f24900c = tVar;
    }

    /* renamed from: b */
    private final String m33153b() {
        String a;
        synchronized (this.f24900c) {
            a = this.f24900c.mo27342a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C11435h<Void> mo27361a(String str) {
        String a;
        C11436i iVar;
        int i;
        synchronized (this.f24900c) {
            a = this.f24900c.mo27342a();
            C10499t tVar = this.f24900c;
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(str).length());
            sb.append(a);
            sb.append(",");
            sb.append(str);
            tVar.mo27343a(sb.toString());
        }
        iVar = new C11436i();
        Map<Integer, C11436i<Void>> map = this.f24899b;
        if (TextUtils.isEmpty(a)) {
            i = 0;
        } else {
            i = a.split(",").length - 1;
        }
        map.put(Integer.valueOf(this.f24898a + i), iVar);
        return iVar.mo29271a();
    }

    /* renamed from: b */
    private final synchronized boolean m33154b(String str) {
        synchronized (this.f24900c) {
            String a = this.f24900c.mo27342a();
            String str2 = ",";
            String valueOf = String.valueOf(str);
            if (!a.startsWith(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))) {
                return false;
            }
            String str3 = ",";
            String valueOf2 = String.valueOf(str);
            this.f24900c.mo27343a(a.substring((valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3)).length()));
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo27362a() {
        return m33153b() != null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (m33152a(r5, r0) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = (p163g.p449j.p450a.p451a.p467f.C11436i) r4.f24899b.remove(java.lang.Integer.valueOf(r4.f24898a));
        m33154b(r0);
        r4.f24898a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r2.mo29273a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27363a(com.google.firebase.iid.FirebaseInstanceId r5) throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.m33153b()     // Catch:{ all -> 0x0042 }
            r1 = 1
            if (r0 != 0) goto L_0x0017
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.zzd()     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0015
            java.lang.String r5 = "FirebaseInstanceId"
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0042 }
        L_0x0015:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            return r1
        L_0x0017:
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            boolean r2 = m33152a(r5, r0)
            if (r2 != 0) goto L_0x0020
            r5 = 0
            return r5
        L_0x0020:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, g.j.a.a.f.i<java.lang.Void>> r2 = r4.f24899b     // Catch:{ all -> 0x003f }
            int r3 = r4.f24898a     // Catch:{ all -> 0x003f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x003f }
            g.j.a.a.f.i r2 = (p163g.p449j.p450a.p451a.p467f.C11436i) r2     // Catch:{ all -> 0x003f }
            r4.m33154b(r0)     // Catch:{ all -> 0x003f }
            int r0 = r4.f24898a     // Catch:{ all -> 0x003f }
            int r0 = r0 + r1
            r4.f24898a = r0     // Catch:{ all -> 0x003f }
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.mo29273a(r0)
            goto L_0x0000
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003f }
            throw r5
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0042 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10507x.mo27363a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    /* renamed from: a */
    private static boolean m33152a(FirebaseInstanceId firebaseInstanceId, String str) throws IOException {
        String str2 = "FirebaseInstanceId";
        String[] split = str.split("!");
        if (split.length == 2) {
            String str3 = split[0];
            String str4 = split[1];
            char c = 65535;
            try {
                int hashCode = str3.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str3.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str3.equals("S")) {
                    c = 0;
                }
                if (c == 0) {
                    firebaseInstanceId.zzb(str4);
                    if (FirebaseInstanceId.zzd()) {
                        Log.d(str2, "subscribe operation succeeded");
                    }
                } else if (c == 1) {
                    firebaseInstanceId.zzc(str4);
                    if (FirebaseInstanceId.zzd()) {
                        Log.d(str2, "unsubscribe operation succeeded");
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage())) {
                    if (!"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                        if (e.getMessage() == null) {
                            Log.e(str2, "Topic operation failed without exception message. Will retry Topic operation.");
                            return false;
                        }
                        throw e;
                    }
                }
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 53);
                sb.append("Topic operation failed: ");
                sb.append(message);
                sb.append(". Will retry Topic operation.");
                Log.e(str2, sb.toString());
                return false;
            }
        }
        return true;
    }
}
