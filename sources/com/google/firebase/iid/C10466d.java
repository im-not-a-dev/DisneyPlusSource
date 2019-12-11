package com.google.firebase.iid;

/* renamed from: com.google.firebase.iid.d */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final /* synthetic */ class C10466d implements Runnable {

    /* renamed from: c */
    private final C10508x0 f24816c;

    C10466d(C10508x0 x0Var) {
        this.f24816c = x0Var;
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.w0.a(com.google.firebase.iid.w0):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r3 = java.lang.String.valueOf(r1);
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 8);
        r5.append("Sending ");
        r5.append(r3);
        android.util.Log.d("MessengerIpcClient", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r3 = com.google.firebase.iid.C10506w0.m33146a(r0.f24905Y);
        r4 = r0.f24901U;
        r5 = android.os.Message.obtain();
        r5.what = r1.f24827c;
        r5.arg1 = r1.f24825a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", r1.mo27300a());
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f24828d);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.f24902V.mo27301a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r0.mo27366a(2, r1.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.firebase.iid.x0 r0 = r8.f24816c
        L_0x0002:
            monitor-enter(r0)
            int r1 = r0.f24906c     // Catch:{ all -> 0x00ae }
            r2 = 2
            if (r1 == r2) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x000a:
            java.util.Queue<com.google.firebase.iid.h<?>> r1 = r0.f24903W     // Catch:{ all -> 0x00ae }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r1 == 0) goto L_0x0017
            r0.mo27364a()     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x0017:
            java.util.Queue<com.google.firebase.iid.h<?>> r1 = r0.f24903W     // Catch:{ all -> 0x00ae }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x00ae }
            com.google.firebase.iid.h r1 = (com.google.firebase.iid.C10475h) r1     // Catch:{ all -> 0x00ae }
            android.util.SparseArray<com.google.firebase.iid.h<?>> r3 = r0.f24904X     // Catch:{ all -> 0x00ae }
            int r4 = r1.f24825a     // Catch:{ all -> 0x00ae }
            r3.put(r4, r1)     // Catch:{ all -> 0x00ae }
            com.google.firebase.iid.w0 r3 = r0.f24905Y     // Catch:{ all -> 0x00ae }
            java.util.concurrent.ScheduledExecutorService r3 = r3.f24895b     // Catch:{ all -> 0x00ae }
            com.google.firebase.iid.b1 r4 = new com.google.firebase.iid.b1     // Catch:{ all -> 0x00ae }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x00ae }
            r5 = 30
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ae }
            r3.schedule(r4, r5, r7)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            r3 = 3
            java.lang.String r4 = "MessengerIpcClient"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L_0x0066
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Sending "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "MessengerIpcClient"
            android.util.Log.d(r4, r3)
        L_0x0066:
            com.google.firebase.iid.w0 r3 = r0.f24905Y
            android.content.Context r3 = r3.f24894a
            android.os.Messenger r4 = r0.f24901U
            android.os.Message r5 = android.os.Message.obtain()
            int r6 = r1.f24827c
            r5.what = r6
            int r6 = r1.f24825a
            r5.arg1 = r6
            r5.replyTo = r4
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r6 = r1.mo27300a()
            java.lang.String r7 = "oneWay"
            r4.putBoolean(r7, r6)
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r6 = "pkg"
            r4.putString(r6, r3)
            android.os.Bundle r1 = r1.f24828d
            java.lang.String r3 = "data"
            r4.putBundle(r3, r1)
            r5.setData(r4)
            com.google.firebase.iid.f r1 = r0.f24902V     // Catch:{ RemoteException -> 0x00a4 }
            r1.mo27301a(r5)     // Catch:{ RemoteException -> 0x00a4 }
            goto L_0x0002
        L_0x00a4:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            r0.mo27366a(r2, r1)
            goto L_0x0002
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10466d.run():void");
    }
}
