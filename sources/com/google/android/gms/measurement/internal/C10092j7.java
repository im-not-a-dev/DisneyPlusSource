package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
final class C10092j7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C9993a7 f23584U;

    /* renamed from: c */
    private final /* synthetic */ C10028d9 f23585c;

    C10092j7(C9993a7 a7Var, C10028d9 d9Var) {
        this.f23584U = a7Var;
        this.f23585c = d9Var;
    }

    public final void run() {
        C10000b3 d = this.f23584U.f23283d;
        if (d == null) {
            this.f23584U.mo25898e().mo25874t().mo25908a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            d.mo25627d(this.f23585c);
            this.f23584U.m31091J();
        } catch (RemoteException e) {
            this.f23584U.mo25898e().mo25874t().mo25909a("Failed to send measurementEnabled to the service", e);
        }
    }
}
