package p163g.p449j.p450a.p451a.p457d.p464g;

import android.content.Context;
import android.os.Bundle;

/* renamed from: g.j.a.a.d.g.jc */
final class C11175jc extends C11190a {

    /* renamed from: X */
    private final /* synthetic */ String f26283X;

    /* renamed from: Y */
    private final /* synthetic */ String f26284Y;

    /* renamed from: Z */
    private final /* synthetic */ Context f26285Z;

    /* renamed from: a0 */
    private final /* synthetic */ Bundle f26286a0;

    /* renamed from: b0 */
    private final /* synthetic */ C11189kc f26287b0;

    C11175jc(C11189kc kcVar, String str, String str2, Context context, Bundle bundle) {
        this.f26287b0 = kcVar;
        this.f26283X = str;
        this.f26284Y = str2;
        this.f26285Z = context;
        this.f26286a0 = bundle;
        super(kcVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r4 < r3) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ RemoteException -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ RemoteException -> 0x009e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28291a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            g.j.a.a.d.g.kc r2 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x009e }
            r3.<init>()     // Catch:{ RemoteException -> 0x009e }
            r2.f26316d = r3     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.kc r2 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            java.lang.String r3 = r14.f26283X     // Catch:{ RemoteException -> 0x009e }
            java.lang.String r4 = r14.f26284Y     // Catch:{ RemoteException -> 0x009e }
            boolean r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11189kc.m35497b(r3, r4)     // Catch:{ RemoteException -> 0x009e }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f26284Y     // Catch:{ RemoteException -> 0x009e }
            java.lang.String r2 = r14.f26283X     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.kc r4 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            java.lang.String r4 = r4.f26313a     // Catch:{ RemoteException -> 0x009e }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f26285Z     // Catch:{ RemoteException -> 0x009e }
            p163g.p449j.p450a.p451a.p457d.p464g.C11189kc.m35501e(r2)     // Catch:{ RemoteException -> 0x009e }
            java.lang.Boolean r2 = p163g.p449j.p450a.p451a.p457d.p464g.C11189kc.f26308j     // Catch:{ RemoteException -> 0x009e }
            boolean r2 = r2.booleanValue()     // Catch:{ RemoteException -> 0x009e }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            g.j.a.a.d.g.kc r3 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.kc r4 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            android.content.Context r5 = r14.f26285Z     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.i9 r4 = r4.mo28628a(r5, r2)     // Catch:{ RemoteException -> 0x009e }
            r3.f26319g = r4     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.kc r3 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.i9 r3 = r3.f26319g     // Catch:{ RemoteException -> 0x009e }
            if (r3 != 0) goto L_0x0060
            g.j.a.a.d.g.kc r2 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            java.lang.String r2 = r2.f26313a     // Catch:{ RemoteException -> 0x009e }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ RemoteException -> 0x009e }
            return
        L_0x0060:
            android.content.Context r3 = r14.f26285Z     // Catch:{ RemoteException -> 0x009e }
            int r3 = p163g.p449j.p450a.p451a.p457d.p464g.C11189kc.m35500d(r3)     // Catch:{ RemoteException -> 0x009e }
            android.content.Context r4 = r14.f26285Z     // Catch:{ RemoteException -> 0x009e }
            int r4 = p163g.p449j.p450a.p451a.p457d.p464g.C11189kc.m35498c(r4)     // Catch:{ RemoteException -> 0x009e }
            if (r2 == 0) goto L_0x0079
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ RemoteException -> 0x009e }
            if (r4 >= r3) goto L_0x0076
        L_0x0074:
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r8 = r3
            goto L_0x0081
        L_0x0079:
            if (r3 <= 0) goto L_0x007d
            r2 = r3
            goto L_0x007e
        L_0x007d:
            r2 = r4
        L_0x007e:
            if (r3 <= 0) goto L_0x0076
            goto L_0x0074
        L_0x0081:
            g.j.a.a.d.g.ic r13 = new g.j.a.a.d.g.ic     // Catch:{ RemoteException -> 0x009e }
            r4 = 16250(0x3f7a, double:8.0286E-320)
            long r6 = (long) r2     // Catch:{ RemoteException -> 0x009e }
            android.os.Bundle r12 = r14.f26286a0     // Catch:{ RemoteException -> 0x009e }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.kc r2 = r14.f26287b0     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.d.g.i9 r2 = r2.f26319g     // Catch:{ RemoteException -> 0x009e }
            android.content.Context r3 = r14.f26285Z     // Catch:{ RemoteException -> 0x009e }
            g.j.a.a.c.a r3 = p163g.p449j.p450a.p451a.p456c.C10957b.m34643a(r3)     // Catch:{ RemoteException -> 0x009e }
            long r4 = r14.f26323c     // Catch:{ RemoteException -> 0x009e }
            r2.initialize(r3, r13, r4)     // Catch:{ RemoteException -> 0x009e }
            return
        L_0x009e:
            r2 = move-exception
            g.j.a.a.d.g.kc r3 = r14.f26287b0
            r3.m35489a(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11175jc.mo28291a():void");
    }
}
