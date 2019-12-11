package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
final class C10026d7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C9993a7 f23368U;

    /* renamed from: c */
    private final /* synthetic */ C10028d9 f23369c;

    C10026d7(C9993a7 a7Var, C10028d9 d9Var) {
        this.f23368U = a7Var;
        this.f23369c = d9Var;
    }

    public final void run() {
        C10000b3 d = this.f23368U.f23283d;
        if (d == null) {
            this.f23368U.mo25898e().mo25874t().mo25908a("Failed to reset data on the service; null service");
            return;
        }
        try {
            d.mo25625b(this.f23369c);
        } catch (RemoteException e) {
            this.f23368U.mo25898e().mo25874t().mo25909a("Failed to reset data on the service", e);
        }
        this.f23368U.m31091J();
    }
}
