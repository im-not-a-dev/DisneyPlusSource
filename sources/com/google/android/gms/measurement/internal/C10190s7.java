package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.C9820b;
import com.google.android.gms.common.internal.C9850c.C9851a;
import com.google.android.gms.common.internal.C9850c.C9852b;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.p399o.C9928a;

/* renamed from: com.google.android.gms.measurement.internal.s7 */
public final class C10190s7 implements ServiceConnection, C9851a, C9852b {

    /* renamed from: U */
    private volatile C10066h3 f23922U;

    /* renamed from: V */
    final /* synthetic */ C9993a7 f23923V;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f23924c;

    protected C10190s7(C9993a7 a7Var) {
        this.f23923V = a7Var;
    }

    /* renamed from: a */
    public final void mo26083a(Intent intent) {
        this.f23923V.mo25662j();
        Context b = this.f23923V.mo25895b();
        C9928a a = C9928a.m30943a();
        synchronized (this) {
            if (this.f23924c) {
                this.f23923V.mo25898e().mo25869B().mo25908a("Connection attempt already in progress");
                return;
            }
            this.f23923V.mo25898e().mo25869B().mo25908a("Using local app measurement service");
            this.f23924c = true;
            a.mo25456a(b, intent, this.f23923V.f23282c, 129);
        }
    }

    /* renamed from: b */
    public final void mo26084b() {
        this.f23923V.mo25662j();
        Context b = this.f23923V.mo25895b();
        synchronized (this) {
            if (this.f23924c) {
                this.f23923V.mo25898e().mo25869B().mo25908a("Connection attempt already in progress");
            } else if (this.f23922U == null || (!this.f23922U.mo25320e() && !this.f23922U.mo25319c())) {
                this.f23922U = new C10066h3(b, Looper.getMainLooper(), this, this);
                this.f23923V.mo25898e().mo25869B().mo25908a("Connecting to remote service");
                this.f23924c = true;
                this.f23922U.mo25327o();
            } else {
                this.f23923V.mo25898e().mo25869B().mo25908a("Already awaiting connection attempt");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f23923V.mo25898e().mo25874t().mo25908a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C9908u.m30859a(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f23924c = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.a7 r4 = r3.f23923V     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.k3 r4 = r4.mo25898e()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.m3 r4 = r4.mo25874t()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo25908a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0099
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            if (r5 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0062 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C10000b3     // Catch:{ RemoteException -> 0x0062 }
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.b3 r1 = (com.google.android.gms.measurement.internal.C10000b3) r1     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0041
        L_0x003c:
            com.google.android.gms.measurement.internal.d3 r1 = new com.google.android.gms.measurement.internal.d3     // Catch:{ RemoteException -> 0x0062 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0062 }
        L_0x0041:
            r0 = r1
        L_0x0042:
            com.google.android.gms.measurement.internal.a7 r5 = r3.f23923V     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25869B()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo25908a(r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0052:
            com.google.android.gms.measurement.internal.a7 r5 = r3.f23923V     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25874t()     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo25909a(r2, r1)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0071
        L_0x0062:
            com.google.android.gms.measurement.internal.a7 r5 = r3.f23923V     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo25898e()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo25874t()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo25908a(r1)     // Catch:{ all -> 0x001c }
        L_0x0071:
            if (r0 != 0) goto L_0x0089
            r3.f23924c = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.o.a r4 = com.google.android.gms.common.p399o.C9928a.m30943a()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.a7 r5 = r3.f23923V     // Catch:{ IllegalArgumentException -> 0x0097 }
            android.content.Context r5 = r5.mo25895b()     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.a7 r0 = r3.f23923V     // Catch:{ IllegalArgumentException -> 0x0097 }
            com.google.android.gms.measurement.internal.s7 r0 = r0.f23282c     // Catch:{ IllegalArgumentException -> 0x0097 }
            r4.mo25455a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0097 }
            goto L_0x0097
        L_0x0089:
            com.google.android.gms.measurement.internal.a7 r4 = r3.f23923V     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.i4 r4 = r4.mo25897d()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r7 r5 = new com.google.android.gms.measurement.internal.r7     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo25800a(r5)     // Catch:{ all -> 0x001c }
        L_0x0097:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0099:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C10190s7.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C9908u.m30859a("MeasurementServiceConnection.onServiceDisconnected");
        this.f23923V.mo25898e().mo25868A().mo25908a("Service disconnected");
        this.f23923V.mo25897d().mo25800a((Runnable) new C10210u7(this, componentName));
    }

    /* renamed from: a */
    public final void mo26082a() {
        if (this.f23922U != null && (this.f23922U.mo25319c() || this.f23922U.mo25320e())) {
            this.f23922U.mo25306a();
        }
        this.f23922U = null;
    }

    /* renamed from: a */
    public final void mo25339a(C9820b bVar) {
        C9908u.m30859a("MeasurementServiceConnection.onConnectionFailed");
        C10099k3 j = this.f23923V.f23701a.mo26032j();
        if (j != null) {
            j.mo25877w().mo25909a("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f23924c = false;
            this.f23922U = null;
        }
        this.f23923V.mo25897d().mo25800a((Runnable) new C10220v7(this));
    }

    /* renamed from: b */
    public final void mo25338b(Bundle bundle) {
        C9908u.m30859a("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f23923V.mo25897d().mo25800a((Runnable) new C10200t7(this, (C10000b3) this.f23922U.mo25336x()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f23922U = null;
                this.f23924c = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo25337b(int i) {
        C9908u.m30859a("MeasurementServiceConnection.onConnectionSuspended");
        this.f23923V.mo25898e().mo25868A().mo25908a("Service connection suspended");
        this.f23923V.mo25897d().mo25800a((Runnable) new C10230w7(this));
    }
}
