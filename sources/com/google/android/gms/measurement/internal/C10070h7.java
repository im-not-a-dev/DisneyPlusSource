package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
final class C10070h7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23521U;

    /* renamed from: V */
    private final /* synthetic */ C11048bc f23522V;

    /* renamed from: W */
    private final /* synthetic */ C9993a7 f23523W;

    /* renamed from: c */
    private final /* synthetic */ C10084j f23524c;

    C10070h7(C9993a7 a7Var, C10084j jVar, String str, C11048bc bcVar) {
        this.f23523W = a7Var;
        this.f23524c = jVar;
        this.f23521U = str;
        this.f23522V = bcVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C10000b3 d = this.f23523W.f23283d;
            if (d == null) {
                this.f23523W.mo25898e().mo25874t().mo25908a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = d.mo25624a(this.f23524c, this.f23521U);
            this.f23523W.m31091J();
            this.f23523W.mo25903m().mo26228a(this.f23522V, bArr);
        } catch (RemoteException e) {
            this.f23523W.mo25898e().mo25874t().mo25909a("Failed to send event to the service to bundle", e);
        } finally {
            this.f23523W.mo25903m().mo26228a(this.f23522V, bArr);
        }
    }
}
