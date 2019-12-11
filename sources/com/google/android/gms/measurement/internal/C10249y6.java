package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y6 */
final class C10249y6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10229w6 f24074U;

    /* renamed from: V */
    private final /* synthetic */ C10229w6 f24075V;

    /* renamed from: W */
    private final /* synthetic */ C10219v6 f24076W;

    /* renamed from: c */
    private final /* synthetic */ boolean f24077c;

    C10249y6(C10219v6 v6Var, boolean z, C10229w6 w6Var, C10229w6 w6Var2) {
        this.f24076W = v6Var;
        this.f24077c = z;
        this.f24074U = w6Var;
        this.f24075V = w6Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (com.google.android.gms.measurement.internal.C10251y8.m31985e(r10.f24074U.f24019a, r10.f24075V.f24019a) != false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.v6 r0 = r10.f24076W
            com.google.android.gms.measurement.internal.i9 r0 = r0.mo25900g()
            com.google.android.gms.measurement.internal.v6 r1 = r10.f24076W
            com.google.android.gms.measurement.internal.c3 r1 = r1.mo25666q()
            java.lang.String r1 = r1.mo25641C()
            boolean r0 = r0.mo25839r(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002f
            boolean r0 = r10.f24077c
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.measurement.internal.v6 r0 = r10.f24076W
            com.google.android.gms.measurement.internal.w6 r0 = r0.f23998c
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.measurement.internal.v6 r3 = r10.f24076W
            com.google.android.gms.measurement.internal.w6 r4 = r3.f23998c
            r3.m31933a(r4, r2)
            goto L_0x003d
        L_0x002f:
            boolean r0 = r10.f24077c
            if (r0 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.v6 r0 = r10.f24076W
            com.google.android.gms.measurement.internal.w6 r3 = r0.f23998c
            if (r3 == 0) goto L_0x003c
            r0.m31933a(r3, r2)
        L_0x003c:
            r0 = 0
        L_0x003d:
            com.google.android.gms.measurement.internal.w6 r3 = r10.f24074U
            if (r3 == 0) goto L_0x0063
            long r4 = r3.f24021c
            com.google.android.gms.measurement.internal.w6 r6 = r10.f24075V
            long r7 = r6.f24021c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0063
            java.lang.String r3 = r3.f24020b
            java.lang.String r4 = r6.f24020b
            boolean r3 = com.google.android.gms.measurement.internal.C10251y8.m31985e(r3, r4)
            if (r3 == 0) goto L_0x0063
            com.google.android.gms.measurement.internal.w6 r3 = r10.f24074U
            java.lang.String r3 = r3.f24019a
            com.google.android.gms.measurement.internal.w6 r4 = r10.f24075V
            java.lang.String r4 = r4.f24019a
            boolean r3 = com.google.android.gms.measurement.internal.C10251y8.m31985e(r3, r4)
            if (r3 != 0) goto L_0x0064
        L_0x0063:
            r1 = 1
        L_0x0064:
            if (r1 == 0) goto L_0x00cd
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.w6 r3 = r10.f24075V
            com.google.android.gms.measurement.internal.C10219v6.m31932a(r3, r1, r2)
            com.google.android.gms.measurement.internal.w6 r2 = r10.f24074U
            if (r2 == 0) goto L_0x008f
            java.lang.String r2 = r2.f24019a
            if (r2 == 0) goto L_0x007d
            java.lang.String r3 = "_pn"
            r1.putString(r3, r2)
        L_0x007d:
            com.google.android.gms.measurement.internal.w6 r2 = r10.f24074U
            java.lang.String r2 = r2.f24020b
            java.lang.String r3 = "_pc"
            r1.putString(r3, r2)
            com.google.android.gms.measurement.internal.w6 r2 = r10.f24074U
            long r2 = r2.f24021c
            java.lang.String r4 = "_pi"
            r1.putLong(r4, r2)
        L_0x008f:
            com.google.android.gms.measurement.internal.v6 r2 = r10.f24076W
            com.google.android.gms.measurement.internal.i9 r2 = r2.mo25900g()
            com.google.android.gms.measurement.internal.v6 r3 = r10.f24076W
            com.google.android.gms.measurement.internal.c3 r3 = r3.mo25666q()
            java.lang.String r3 = r3.mo25641C()
            boolean r2 = r2.mo25839r(r3)
            if (r2 == 0) goto L_0x00c0
            if (r0 == 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.v6 r0 = r10.f24076W
            com.google.android.gms.measurement.internal.b8 r0 = r0.mo25670u()
            long r2 = r0.mo25634D()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c0
            com.google.android.gms.measurement.internal.v6 r0 = r10.f24076W
            com.google.android.gms.measurement.internal.y8 r0 = r0.mo25903m()
            r0.mo26220a(r1, r2)
        L_0x00c0:
            com.google.android.gms.measurement.internal.v6 r0 = r10.f24076W
            com.google.android.gms.measurement.internal.v5 r0 = r0.mo25665p()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r0.mo26164c(r2, r3, r1)
        L_0x00cd:
            com.google.android.gms.measurement.internal.v6 r0 = r10.f24076W
            com.google.android.gms.measurement.internal.w6 r1 = r10.f24075V
            r0.f23998c = r1
            com.google.android.gms.measurement.internal.a7 r0 = r0.mo25667r()
            com.google.android.gms.measurement.internal.w6 r1 = r10.f24075V
            r0.mo25596a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10249y6.run():void");
    }
}
