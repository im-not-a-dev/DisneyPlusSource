package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p163g.p449j.p450a.p451a.p457d.p464g.C11124g3;
import p163g.p449j.p450a.p451a.p457d.p464g.C11125g4;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
public final class C10012c4 implements ServiceConnection {

    /* renamed from: U */
    final /* synthetic */ C10256z3 f23340U;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f23341c;

    C10012c4(C10256z3 z3Var, String str) {
        this.f23340U = z3Var;
        this.f23341c = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f23340U.f24087a.mo25898e().mo25877w().mo25908a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C11125g4 a = C11124g3.m35243a(iBinder);
            if (a == null) {
                this.f23340U.f24087a.mo25898e().mo25877w().mo25908a("Install Referrer Service implementation was not found");
                return;
            }
            this.f23340U.f24087a.mo25898e().mo25880z().mo25908a("Install Referrer Service connected");
            this.f23340U.f24087a.mo25897d().mo25800a((Runnable) new C10001b4(this, a, this));
        } catch (Exception e) {
            this.f23340U.f24087a.mo25898e().mo25877w().mo25909a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f23340U.f24087a.mo25898e().mo25880z().mo25908a("Install Referrer Service disconnected");
    }
}
