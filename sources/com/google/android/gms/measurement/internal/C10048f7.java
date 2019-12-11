package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.p397z.C9918a;

/* renamed from: com.google.android.gms.measurement.internal.f7 */
final class C10048f7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ boolean f23463U;

    /* renamed from: V */
    private final /* synthetic */ C9993a7 f23464V;

    /* renamed from: c */
    private final /* synthetic */ C10028d9 f23465c;

    C10048f7(C9993a7 a7Var, C10028d9 d9Var, boolean z) {
        this.f23464V = a7Var;
        this.f23465c = d9Var;
        this.f23463U = z;
    }

    public final void run() {
        C10000b3 d = this.f23464V.f23283d;
        if (d == null) {
            this.f23464V.mo25898e().mo25874t().mo25908a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            d.mo25626c(this.f23465c);
            if (this.f23463U) {
                this.f23464V.mo25669t().mo25765D();
            }
            this.f23464V.mo25592a(d, (C9918a) null, this.f23465c);
            this.f23464V.m31091J();
        } catch (RemoteException e) {
            this.f23464V.mo25898e().mo25874t().mo25909a("Failed to send app launch to the service", e);
        }
    }
}
