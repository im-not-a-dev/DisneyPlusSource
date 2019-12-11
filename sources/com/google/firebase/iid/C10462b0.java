package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p401p.C9953b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.firebase.iid.b0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C10462b0 implements ServiceConnection {

    /* renamed from: U */
    private final Intent f24806U;

    /* renamed from: V */
    private final ScheduledExecutorService f24807V;

    /* renamed from: W */
    private final Queue<C10459a0> f24808W;

    /* renamed from: X */
    private C10505w f24809X;

    /* renamed from: Y */
    private boolean f24810Y;

    /* renamed from: c */
    private final Context f24811c;

    public C10462b0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C9953b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: b */
    private final void m33038b() {
        while (!this.f24808W.isEmpty()) {
            ((C10459a0) this.f24808W.poll()).mo27290a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo27292a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
        }
        this.f24808W.add(new C10459a0(intent, pendingResult, this.f24807V));
        m33037a();
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        this.f24810Y = false;
        if (!(iBinder instanceof C10505w)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("FirebaseInstanceId", sb2.toString());
            m33038b();
            return;
        }
        this.f24809X = (C10505w) iBinder;
        m33037a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d(str, sb.toString());
        }
        m33037a();
    }

    private C10462b0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f24808W = new ArrayDeque();
        this.f24810Y = false;
        this.f24811c = context.getApplicationContext();
        this.f24806U = new Intent(str).setPackage(this.f24811c.getPackageName());
        this.f24807V = scheduledExecutorService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m33037a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0011:
            java.util.Queue<com.google.firebase.iid.a0> r0 = r6.f24808W     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a9
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0028:
            com.google.firebase.iid.w r0 = r6.f24809X     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            com.google.firebase.iid.w r0 = r6.f24809X     // Catch:{ all -> 0x00ab }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00ab }
        L_0x0043:
            java.util.Queue<com.google.firebase.iid.a0> r0 = r6.f24808W     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00ab }
            com.google.firebase.iid.a0 r0 = (com.google.firebase.iid.C10459a0) r0     // Catch:{ all -> 0x00ab }
            com.google.firebase.iid.w r2 = r6.f24809X     // Catch:{ all -> 0x00ab }
            r2.mo27358a(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ab }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r3 = r6.f24810Y     // Catch:{ all -> 0x00ab }
            if (r3 != 0) goto L_0x0063
            r3 = 1
            goto L_0x0064
        L_0x0063:
            r3 = 0
        L_0x0064:
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r5.<init>(r4)     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "binder is dead. start connection? "
            r5.append(r4)     // Catch:{ all -> 0x00ab }
            r5.append(r3)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00ab }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ab }
        L_0x007a:
            boolean r0 = r6.f24810Y     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a7
            r6.f24810Y = r2     // Catch:{ all -> 0x00ab }
            com.google.android.gms.common.o.a r0 = com.google.android.gms.common.p399o.C9928a.m30943a()     // Catch:{ SecurityException -> 0x009a }
            android.content.Context r2 = r6.f24811c     // Catch:{ SecurityException -> 0x009a }
            android.content.Intent r3 = r6.f24806U     // Catch:{ SecurityException -> 0x009a }
            r4 = 65
            boolean r0 = r0.mo25456a(r2, r3, r6, r4)     // Catch:{ SecurityException -> 0x009a }
            if (r0 == 0) goto L_0x0092
            monitor-exit(r6)
            return
        L_0x0092:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x009a }
            goto L_0x00a2
        L_0x009a:
            r0 = move-exception
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00ab }
        L_0x00a2:
            r6.f24810Y = r1     // Catch:{ all -> 0x00ab }
            r6.m33038b()     // Catch:{ all -> 0x00ab }
        L_0x00a7:
            monitor-exit(r6)
            return
        L_0x00a9:
            monitor-exit(r6)
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10462b0.m33037a():void");
    }
}
