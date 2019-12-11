package com.google.android.gms.measurement.internal;

import android.content.Context;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.c3 */
public final class C10011c3 extends C10046f5 {

    /* renamed from: c */
    private String f23329c;

    /* renamed from: d */
    private String f23330d;

    /* renamed from: e */
    private int f23331e;

    /* renamed from: f */
    private String f23332f;

    /* renamed from: g */
    private long f23333g;

    /* renamed from: h */
    private long f23334h;

    /* renamed from: i */
    private long f23335i;

    /* renamed from: j */
    private List<String> f23336j;

    /* renamed from: k */
    private int f23337k;

    /* renamed from: l */
    private String f23338l;

    /* renamed from: m */
    private String f23339m;

    C10011c3(C10145o4 o4Var, long j) {
        super(o4Var);
        this.f23335i = j;
    }

    /* renamed from: H */
    private final String m31165H() {
        try {
            Class loadClass = mo25895b().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{mo25895b()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    mo25898e().mo25879y().mo25908a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                mo25898e().mo25878x().mo25908a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195 A[Catch:{ IllegalStateException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0196 A[Catch:{ IllegalStateException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019f A[Catch:{ IllegalStateException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b2 A[Catch:{ IllegalStateException -> 0x01c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0242  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25639A() {
        /*
            r13 = this;
            android.content.Context r0 = r13.mo25895b()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r13.mo25895b()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            com.google.android.gms.measurement.internal.k3 r7 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo25909a(r9, r8)
            goto L_0x0088
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0043
        L_0x0032:
            com.google.android.gms.measurement.internal.k3 r7 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo25909a(r9, r8)
        L_0x0043:
            if (r5 != 0) goto L_0x0048
            java.lang.String r5 = "manual_install"
            goto L_0x0051
        L_0x0048:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0051
            r5 = r3
        L_0x0051:
            android.content.Context r7 = r13.mo25895b()     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0076 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r7 == 0) goto L_0x0088
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0076 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0076 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0076 }
            if (r9 != 0) goto L_0x0070
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0076 }
            goto L_0x0071
        L_0x0070:
            r8 = r2
        L_0x0071:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x0088
        L_0x0076:
            r8 = r2
        L_0x0077:
            com.google.android.gms.measurement.internal.k3 r7 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r7 = r7.mo25874t()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r7.mo25910a(r10, r9, r8)
        L_0x0088:
            r13.f23329c = r0
            r13.f23332f = r5
            r13.f23330d = r2
            r13.f23331e = r6
            r5 = 0
            r13.f23333g = r5
            r13.mo25894a()
            android.content.Context r2 = r13.mo25895b()
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.internal.C9733f.m30270a(r2)
            r7 = 1
            if (r2 == 0) goto L_0x00aa
            boolean r8 = r2.mo25010f()
            if (r8 == 0) goto L_0x00aa
            r8 = 1
            goto L_0x00ab
        L_0x00aa:
            r8 = 0
        L_0x00ab:
            com.google.android.gms.measurement.internal.o4 r9 = r13.f23701a
            java.lang.String r9 = r9.mo26036n()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r10 = "am"
            if (r9 != 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.o4 r9 = r13.f23701a
            java.lang.String r9 = r9.mo26037o()
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00c7
            r9 = 1
            goto L_0x00c8
        L_0x00c7:
            r9 = 0
        L_0x00c8:
            r8 = r8 | r9
            if (r8 != 0) goto L_0x00f4
            if (r2 != 0) goto L_0x00db
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25874t()
            java.lang.String r9 = "GoogleService failed to initialize (no status)"
            r2.mo25908a(r9)
            goto L_0x00f4
        L_0x00db:
            com.google.android.gms.measurement.internal.k3 r9 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r9 = r9.mo25874t()
            int r11 = r2.mo25006c()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r2 = r2.mo25007d()
            java.lang.String r12 = "GoogleService failed to initialize, status"
            r9.mo25910a(r12, r11, r2)
        L_0x00f4:
            if (r8 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.i9 r2 = r13.mo25900g()
            java.lang.Boolean r2 = r2.mo25836q()
            com.google.android.gms.measurement.internal.i9 r8 = r13.mo25900g()
            boolean r8 = r8.mo25834p()
            if (r8 == 0) goto L_0x011e
            com.google.android.gms.measurement.internal.o4 r2 = r13.f23701a
            boolean r2 = r2.mo26035m()
            if (r2 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25880z()
            java.lang.String r8 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r2.mo25908a(r8)
            goto L_0x0161
        L_0x011e:
            if (r2 == 0) goto L_0x013c
            boolean r8 = r2.booleanValue()
            if (r8 != 0) goto L_0x013c
            com.google.android.gms.measurement.internal.o4 r2 = r13.f23701a
            boolean r2 = r2.mo26035m()
            if (r2 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25880z()
            java.lang.String r8 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r2.mo25908a(r8)
            goto L_0x0161
        L_0x013c:
            if (r2 != 0) goto L_0x0152
            boolean r2 = com.google.android.gms.common.api.internal.C9733f.m30273b()
            if (r2 == 0) goto L_0x0152
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25880z()
            java.lang.String r8 = "Collection disabled with google_app_measurement_enable=0"
            r2.mo25908a(r8)
            goto L_0x0161
        L_0x0152:
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()
            java.lang.String r8 = "Collection enabled"
            r2.mo25908a(r8)
            r2 = 1
            goto L_0x0162
        L_0x0161:
            r2 = 0
        L_0x0162:
            r13.f23338l = r3
            r13.f23339m = r3
            r13.f23334h = r5
            r13.mo25894a()
            com.google.android.gms.measurement.internal.o4 r5 = r13.f23701a
            java.lang.String r5 = r5.mo26036n()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x018b
            com.google.android.gms.measurement.internal.o4 r5 = r13.f23701a
            java.lang.String r5 = r5.mo26037o()
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x018b
            com.google.android.gms.measurement.internal.o4 r5 = r13.f23701a
            java.lang.String r5 = r5.mo26036n()
            r13.f23339m = r5
        L_0x018b:
            java.lang.String r5 = com.google.android.gms.common.api.internal.C9733f.m30272a()     // Catch:{ IllegalStateException -> 0x01c4 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IllegalStateException -> 0x01c4 }
            if (r6 == 0) goto L_0x0196
            goto L_0x0197
        L_0x0196:
            r3 = r5
        L_0x0197:
            r13.f23338l = r3     // Catch:{ IllegalStateException -> 0x01c4 }
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IllegalStateException -> 0x01c4 }
            if (r3 != 0) goto L_0x01b0
            com.google.android.gms.common.internal.y r3 = new com.google.android.gms.common.internal.y     // Catch:{ IllegalStateException -> 0x01c4 }
            android.content.Context r5 = r13.mo25895b()     // Catch:{ IllegalStateException -> 0x01c4 }
            r3.<init>(r5)     // Catch:{ IllegalStateException -> 0x01c4 }
            java.lang.String r5 = "admob_app_id"
            java.lang.String r3 = r3.mo25448a(r5)     // Catch:{ IllegalStateException -> 0x01c4 }
            r13.f23339m = r3     // Catch:{ IllegalStateException -> 0x01c4 }
        L_0x01b0:
            if (r2 == 0) goto L_0x01d6
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo25898e()     // Catch:{ IllegalStateException -> 0x01c4 }
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25869B()     // Catch:{ IllegalStateException -> 0x01c4 }
            java.lang.String r3 = "App package, google app id"
            java.lang.String r5 = r13.f23329c     // Catch:{ IllegalStateException -> 0x01c4 }
            java.lang.String r6 = r13.f23338l     // Catch:{ IllegalStateException -> 0x01c4 }
            r2.mo25910a(r3, r5, r6)     // Catch:{ IllegalStateException -> 0x01c4 }
            goto L_0x01d6
        L_0x01c4:
            r2 = move-exception
            com.google.android.gms.measurement.internal.k3 r3 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r3 = r3.mo25874t()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C10099k3.m31423a(r0)
            java.lang.String r5 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            r3.mo25910a(r5, r0, r2)
        L_0x01d6:
            r0 = 0
            r13.f23336j = r0
            com.google.android.gms.measurement.internal.i9 r0 = r13.mo25900g()
            java.lang.String r2 = r13.f23329c
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C10106l.f23687w0
            boolean r0 = r0.mo25821e(r2, r3)
            if (r0 == 0) goto L_0x022c
            r13.mo25894a()
            com.google.android.gms.measurement.internal.i9 r0 = r13.mo25900g()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo25817c(r2)
            if (r0 == 0) goto L_0x0228
            int r2 = r0.size()
            if (r2 != 0) goto L_0x020b
            com.google.android.gms.measurement.internal.k3 r2 = r13.mo25898e()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo25877w()
            java.lang.String r3 = "Safelisted event list cannot be empty. Ignoring"
            r2.mo25908a(r3)
        L_0x0209:
            r7 = 0
            goto L_0x0228
        L_0x020b:
            java.util.Iterator r2 = r0.iterator()
        L_0x020f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.y8 r5 = r13.mo25903m()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r5.mo26237c(r6, r3)
            if (r3 != 0) goto L_0x020f
            goto L_0x0209
        L_0x0228:
            if (r7 == 0) goto L_0x022c
            r13.f23336j = r0
        L_0x022c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r0 < r2) goto L_0x0242
            if (r1 == 0) goto L_0x023f
            android.content.Context r0 = r13.mo25895b()
            boolean r0 = com.google.android.gms.common.p400p.C9929a.m30947a(r0)
            r13.f23337k = r0
            return
        L_0x023f:
            r13.f23337k = r4
            return
        L_0x0242:
            r13.f23337k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10011c3.mo25639A():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public final String mo25640B() {
        mo25754x();
        return this.f23338l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public final String mo25641C() {
        mo25754x();
        return this.f23329c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public final String mo25642D() {
        mo25754x();
        return this.f23339m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final List<String> mo25643E() {
        return this.f23336j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public final int mo25644F() {
        mo25754x();
        return this.f23331e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final int mo25645G() {
        mo25754x();
        return this.f23337k;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C10028d9 mo25646a(java.lang.String r35) {
        /*
            r34 = this;
            r0 = r34
            r34.mo25662j()
            r34.mo25661h()
            com.google.android.gms.measurement.internal.d9 r29 = new com.google.android.gms.measurement.internal.d9
            java.lang.String r2 = r34.mo25641C()
            java.lang.String r3 = r34.mo25640B()
            r34.mo25754x()
            java.lang.String r4 = r0.f23330d
            int r1 = r34.mo25644F()
            long r5 = (long) r1
            r34.mo25754x()
            java.lang.String r7 = r0.f23332f
            com.google.android.gms.measurement.internal.i9 r1 = r34.mo25900g()
            long r8 = r1.mo25830n()
            r34.mo25754x()
            r34.mo25662j()
            long r10 = r0.f23333g
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x004f
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23701a
            com.google.android.gms.measurement.internal.y8 r1 = r1.mo26022G()
            android.content.Context r10 = r34.mo25895b()
            android.content.Context r11 = r34.mo25895b()
            java.lang.String r11 = r11.getPackageName()
            long r10 = r1.mo26212a(r10, r11)
            r0.f23333g = r10
        L_0x004f:
            long r10 = r0.f23333g
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23701a
            boolean r13 = r1.mo26028f()
            com.google.android.gms.measurement.internal.t3 r1 = r34.mo25899f()
            boolean r1 = r1.f23952x
            r12 = 1
            r14 = r1 ^ 1
            r34.mo25662j()
            r34.mo25661h()
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23701a
            boolean r1 = r1.mo26028f()
            if (r1 != 0) goto L_0x0071
            r16 = 0
            goto L_0x0077
        L_0x0071:
            java.lang.String r1 = r34.m31165H()
            r16 = r1
        L_0x0077:
            r34.mo25754x()
            r17 = r13
            long r12 = r0.f23334h
            com.google.android.gms.measurement.internal.o4 r1 = r0.f23701a
            long r19 = r1.mo26041s()
            int r21 = r34.mo25645G()
            com.google.android.gms.measurement.internal.i9 r1 = r34.mo25900g()
            java.lang.Boolean r1 = r1.mo25838r()
            boolean r22 = r1.booleanValue()
            com.google.android.gms.measurement.internal.i9 r1 = r34.mo25900g()
            r1.mo25661h()
            java.lang.String r15 = "google_analytics_ssaid_collection_enabled"
            java.lang.Boolean r1 = r1.mo25815b(r15)
            if (r1 == 0) goto L_0x00ac
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r1 = 0
            goto L_0x00ad
        L_0x00ac:
            r1 = 1
        L_0x00ad:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r24 = r1.booleanValue()
            com.google.android.gms.measurement.internal.t3 r1 = r34.mo25899f()
            boolean r25 = r1.mo26103z()
            java.lang.String r26 = r34.mo25642D()
            com.google.android.gms.measurement.internal.i9 r1 = r34.mo25900g()
            java.lang.String r15 = r34.mo25641C()
            r27 = r12
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C10106l.f23661j0
            boolean r1 = r1.mo25821e(r15, r12)
            if (r1 == 0) goto L_0x00ec
            com.google.android.gms.measurement.internal.i9 r1 = r34.mo25900g()
            java.lang.String r12 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r1 = r1.mo25815b(r12)
            if (r1 == 0) goto L_0x00ec
            boolean r1 = r1.booleanValue()
            r12 = 1
            r1 = r1 ^ r12
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r30 = r1
            goto L_0x00ee
        L_0x00ec:
            r30 = 0
        L_0x00ee:
            long r12 = r0.f23335i
            com.google.android.gms.measurement.internal.i9 r1 = r34.mo25900g()
            java.lang.String r15 = r34.mo25641C()
            r31 = r12
            com.google.android.gms.measurement.internal.y2<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.C10106l.f23687w0
            boolean r1 = r1.mo25821e(r15, r12)
            if (r1 == 0) goto L_0x0107
            java.util.List<java.lang.String> r1 = r0.f23336j
            r33 = r1
            goto L_0x0109
        L_0x0107:
            r33 = 0
        L_0x0109:
            r1 = r29
            r12 = r35
            r13 = r17
            r15 = r16
            r16 = r27
            r18 = r19
            r20 = r21
            r21 = r22
            r22 = r24
            r23 = r25
            r24 = r26
            r25 = r30
            r26 = r31
            r28 = r33
            r1.<init>(r2, r3, r4, r5, r7, r8, r10, r12, r13, r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r28)
            return r29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10011c3.mo25646a(java.lang.String):com.google.android.gms.measurement.internal.d9");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo25604z() {
        return true;
    }
}
