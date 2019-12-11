package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C9698f.C9700b;
import com.google.android.gms.common.api.C9698f.C9701c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p163g.p449j.p450a.p451a.p457d.p461d.C10997h;

/* renamed from: com.google.android.gms.common.internal.i */
public final class C9876i implements Callback {

    /* renamed from: U */
    private final ArrayList<C9700b> f23136U = new ArrayList<>();

    /* renamed from: V */
    private final ArrayList<C9700b> f23137V = new ArrayList<>();

    /* renamed from: W */
    private final ArrayList<C9701c> f23138W = new ArrayList<>();

    /* renamed from: X */
    private volatile boolean f23139X = false;

    /* renamed from: Y */
    private final AtomicInteger f23140Y = new AtomicInteger(0);

    /* renamed from: Z */
    private boolean f23141Z = false;

    /* renamed from: a0 */
    private final Handler f23142a0;

    /* renamed from: b0 */
    private final Object f23143b0 = new Object();

    /* renamed from: c */
    private final C9877a f23144c;

    /* renamed from: com.google.android.gms.common.internal.i$a */
    public interface C9877a {
        /* renamed from: c */
        boolean mo25214c();

        /* renamed from: n */
        Bundle mo25215n();
    }

    public C9876i(Looper looper, C9877a aVar) {
        this.f23144c = aVar;
        this.f23142a0 = new C10997h(looper, this);
    }

    /* renamed from: a */
    public final void mo25377a() {
        this.f23139X = false;
        this.f23140Y.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo25383b() {
        this.f23139X = true;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C9700b bVar = (C9700b) message.obj;
            synchronized (this.f23143b0) {
                if (this.f23139X && this.f23144c.mo25214c() && this.f23136U.contains(bVar)) {
                    bVar.mo25077b(this.f23144c.mo25215n());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    /* renamed from: a */
    public final void mo25379a(Bundle bundle) {
        C9908u.m30858a(this.f23142a0, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f23143b0) {
            boolean z = true;
            C9908u.m30864b(!this.f23141Z);
            this.f23142a0.removeMessages(1);
            this.f23141Z = true;
            if (this.f23137V.size() != 0) {
                z = false;
            }
            C9908u.m30864b(z);
            ArrayList arrayList = new ArrayList(this.f23136U);
            int i = this.f23140Y.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C9700b bVar = (C9700b) obj;
                if (!this.f23139X || !this.f23144c.mo25214c() || this.f23140Y.get() != i) {
                    break;
                } else if (!this.f23137V.contains(bVar)) {
                    bVar.mo25077b(bundle);
                }
            }
            this.f23137V.clear();
            this.f23141Z = false;
        }
    }

    /* renamed from: a */
    public final void mo25378a(int i) {
        C9908u.m30858a(this.f23142a0, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f23142a0.removeMessages(1);
        synchronized (this.f23143b0) {
            this.f23141Z = true;
            ArrayList arrayList = new ArrayList(this.f23136U);
            int i2 = this.f23140Y.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                C9700b bVar = (C9700b) obj;
                if (!this.f23139X || this.f23140Y.get() != i2) {
                    break;
                } else if (this.f23136U.contains(bVar)) {
                    bVar.mo25076b(i);
                }
            }
            this.f23137V.clear();
            this.f23141Z = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25382a(com.google.android.gms.common.C9820b r8) {
        /*
            r7 = this;
            android.os.Handler r0 = r7.f23142a0
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C9908u.m30858a(r0, r1)
            android.os.Handler r0 = r7.f23142a0
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r7.f23143b0
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r2 = r7.f23138W     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f23140Y     // Catch:{ all -> 0x0049 }
            int r2 = r2.get()     // Catch:{ all -> 0x0049 }
            int r3 = r1.size()     // Catch:{ all -> 0x0049 }
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x0047
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0049 }
            int r4 = r4 + 1
            com.google.android.gms.common.api.f$c r5 = (com.google.android.gms.common.api.C9698f.C9701c) r5     // Catch:{ all -> 0x0049 }
            boolean r6 = r7.f23139X     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f23140Y     // Catch:{ all -> 0x0049 }
            int r6 = r6.get()     // Catch:{ all -> 0x0049 }
            if (r6 == r2) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r6 = r7.f23138W     // Catch:{ all -> 0x0049 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0022
            r5.mo25078a(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0022
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C9876i.mo25382a(com.google.android.gms.common.b):void");
    }

    /* renamed from: a */
    public final void mo25380a(C9700b bVar) {
        C9908u.m30853a(bVar);
        synchronized (this.f23143b0) {
            if (this.f23136U.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f23136U.add(bVar);
            }
        }
        if (this.f23144c.mo25214c()) {
            Handler handler = this.f23142a0;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: a */
    public final void mo25381a(C9701c cVar) {
        C9908u.m30853a(cVar);
        synchronized (this.f23143b0) {
            if (this.f23138W.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f23138W.add(cVar);
            }
        }
    }
}
