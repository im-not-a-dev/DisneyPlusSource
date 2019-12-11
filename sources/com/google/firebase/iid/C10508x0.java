package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.p399o.C9928a;
import java.util.ArrayDeque;
import java.util.Queue;
import p163g.p449j.p450a.p451a.p457d.p463f.C11006e;

/* renamed from: com.google.firebase.iid.x0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10508x0 implements ServiceConnection {

    /* renamed from: U */
    final Messenger f24901U;

    /* renamed from: V */
    C10470f f24902V;

    /* renamed from: W */
    final Queue<C10475h<?>> f24903W;

    /* renamed from: X */
    final SparseArray<C10475h<?>> f24904X;

    /* renamed from: Y */
    final /* synthetic */ C10506w0 f24905Y;

    /* renamed from: c */
    int f24906c;

    private C10508x0(C10506w0 w0Var) {
        this.f24905Y = w0Var;
        this.f24906c = 0;
        this.f24901U = new Messenger(new C11006e(Looper.getMainLooper(), new C10460a1(this)));
        this.f24903W = new ArrayDeque();
        this.f24904X = new SparseArray<>();
    }

    /* renamed from: c */
    private final void m33158c() {
        this.f24905Y.f24895b.execute(new C10466d(this));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo27368a(com.google.firebase.iid.C10475h<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f24906c     // Catch:{ all -> 0x0097 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            int r0 = r5.f24906c     // Catch:{ all -> 0x0097 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r2.<init>(r1)     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x0097 }
            r2.append(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0097 }
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<com.google.firebase.iid.h<?>> r0 = r5.f24903W     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            r5.m33158c()     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.firebase.iid.h<?>> r0 = r5.f24903W     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.firebase.iid.h<?>> r0 = r5.f24903W     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            int r6 = r5.f24906c     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            com.google.android.gms.common.internal.C9908u.m30864b(r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x0097 }
        L_0x005f:
            r5.f24906c = r3     // Catch:{ all -> 0x0097 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.o.a r0 = com.google.android.gms.common.p399o.C9928a.m30943a()     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.w0 r1 = r5.f24905Y     // Catch:{ all -> 0x0097 }
            android.content.Context r1 = r1.f24894a     // Catch:{ all -> 0x0097 }
            boolean r6 = r0.mo25456a(r1, r6, r5, r3)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "Unable to bind to service"
            r5.mo27366a(r2, r6)     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0083:
            com.google.firebase.iid.w0 r6 = r5.f24905Y     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f24895b     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.z0 r0 = new com.google.firebase.iid.z0     // Catch:{ all -> 0x0097 }
            r0.<init>(r5)     // Catch:{ all -> 0x0097 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0097 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r5)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10508x0.mo27368a(com.google.firebase.iid.h):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo27369b() {
        if (this.f24906c == 1) {
            mo27366a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            mo27366a(0, "Null service connection");
            return;
        }
        try {
            this.f24902V = new C10470f(iBinder);
            this.f24906c = 2;
            m33158c();
        } catch (RemoteException e) {
            mo27366a(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        mo27366a(2, "Service disconnected");
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.h.a(com.google.firebase.iid.g):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.firebase.iid.h.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.mo27310a(new com.google.firebase.iid.C10473g(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo27299a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27367a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MessengerIpcClient"
            android.util.Log.d(r2, r1)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.h<?>> r1 = r4.f24904X     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            com.google.firebase.iid.h r1 = (com.google.firebase.iid.C10475h) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Received response for unknown request: "
            r3.append(r1)     // Catch:{ all -> 0x006f }
            r3.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray<com.google.firebase.iid.h<?>> r3 = r4.f24904X     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.mo27364a()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x006b
            com.google.firebase.iid.g r5 = new com.google.firebase.iid.g
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo27310a(r5)
            goto L_0x006e
        L_0x006b:
            r1.mo27299a(r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10508x0.mo27367a(android.os.Message):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo27366a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        int i2 = this.f24906c;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f24906c = 4;
            C9928a.m30943a().mo25455a(this.f24905Y.f24894a, this);
            C10473g gVar = new C10473g(i, str);
            for (C10475h a : this.f24903W) {
                a.mo27310a(gVar);
            }
            this.f24903W.clear();
            for (int i3 = 0; i3 < this.f24904X.size(); i3++) {
                ((C10475h) this.f24904X.valueAt(i3)).mo27310a(gVar);
            }
            this.f24904X.clear();
        } else if (i2 == 3) {
            this.f24906c = 4;
        } else if (i2 != 4) {
            int i4 = this.f24906c;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo27364a() {
        if (this.f24906c == 2 && this.f24903W.isEmpty() && this.f24904X.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f24906c = 3;
            C9928a.m30943a().mo25455a(this.f24905Y.f24894a, this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo27365a(int i) {
        C10475h hVar = (C10475h) this.f24904X.get(i);
        if (hVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f24904X.remove(i);
            hVar.mo27310a(new C10473g(3, "Timed out waiting for response"));
            mo27364a();
        }
    }
}
