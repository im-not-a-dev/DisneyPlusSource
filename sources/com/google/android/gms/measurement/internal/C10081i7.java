package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.i7 */
final class C10081i7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C9993a7 f23551U;

    /* renamed from: c */
    private final /* synthetic */ C10229w6 f23552c;

    C10081i7(C9993a7 a7Var, C10229w6 w6Var) {
        this.f23551U = a7Var;
        this.f23552c = w6Var;
    }

    public final void run() {
        C10000b3 d = this.f23551U.f23283d;
        if (d == null) {
            this.f23551U.mo25898e().mo25874t().mo25908a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f23552c == null) {
                d.mo25618a(0, (String) null, (String) null, this.f23551U.mo25895b().getPackageName());
            } else {
                d.mo25618a(this.f23552c.f24021c, this.f23552c.f24019a, this.f23552c.f24020b, this.f23551U.mo25895b().getPackageName());
            }
            this.f23551U.m31091J();
        } catch (RemoteException e) {
            this.f23551U.mo25898e().mo25874t().mo25909a("Failed to send current screen to the service", e);
        }
    }
}
