package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.p401p.C9953b;
import java.util.concurrent.ScheduledExecutorService;
import p163g.p449j.p450a.p451a.p457d.p463f.C11002a;
import p163g.p449j.p450a.p451a.p457d.p463f.C11007f;
import p163g.p449j.p450a.p451a.p467f.C11435h;

/* renamed from: com.google.firebase.iid.w0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
public final class C10506w0 {

    /* renamed from: e */
    private static C10506w0 f24893e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f24894a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f24895b;

    /* renamed from: c */
    private C10508x0 f24896c = new C10508x0(this);

    /* renamed from: d */
    private int f24897d = 1;

    private C10506w0(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f24895b = scheduledExecutorService;
        this.f24894a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C10506w0 m33147a(Context context) {
        C10506w0 w0Var;
        synchronized (C10506w0.class) {
            if (f24893e == null) {
                f24893e = new C10506w0(context, C11002a.m34718a().mo28232a(1, new C9953b("MessengerIpcClient"), C11007f.f26031a));
            }
            w0Var = f24893e;
        }
        return w0Var;
    }

    /* renamed from: b */
    public final C11435h<Bundle> mo27360b(int i, Bundle bundle) {
        return m33148a((C10475h<T>) new C10479j<T>(m33145a(), 1, bundle));
    }

    /* renamed from: a */
    public final C11435h<Void> mo27359a(int i, Bundle bundle) {
        return m33148a((C10475h<T>) new C10468e<T>(m33145a(), 2, bundle));
    }

    /* renamed from: a */
    private final synchronized <T> C11435h<T> m33148a(C10475h<T> hVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(hVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f24896c.mo27368a(hVar)) {
            this.f24896c = new C10508x0(this);
            this.f24896c.mo27368a(hVar);
        }
        return hVar.f24826b.mo29271a();
    }

    /* renamed from: a */
    private final synchronized int m33145a() {
        int i;
        i = this.f24897d;
        this.f24897d = i + 1;
        return i;
    }
}
