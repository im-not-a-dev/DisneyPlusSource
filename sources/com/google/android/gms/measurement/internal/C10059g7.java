package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;

/* renamed from: com.google.android.gms.measurement.internal.g7 */
final class C10059g7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C11048bc f23489U;

    /* renamed from: V */
    private final /* synthetic */ C9993a7 f23490V;

    /* renamed from: c */
    private final /* synthetic */ C10028d9 f23491c;

    C10059g7(C9993a7 a7Var, C10028d9 d9Var, C11048bc bcVar) {
        this.f23490V = a7Var;
        this.f23491c = d9Var;
        this.f23489U = bcVar;
    }

    public final void run() {
        String str = "Failed to get app instance id";
        try {
            C10000b3 d = this.f23490V.f23283d;
            if (d == null) {
                this.f23490V.mo25898e().mo25874t().mo25908a(str);
                return;
            }
            String a = d.mo25612a(this.f23491c);
            if (a != null) {
                this.f23490V.mo25665p().mo26148a(a);
                this.f23490V.mo25899f().f23940l.mo25581a(a);
            }
            this.f23490V.m31091J();
            this.f23490V.mo25903m().mo26225a(this.f23489U, a);
        } catch (RemoteException e) {
            this.f23490V.mo25898e().mo25874t().mo25909a(str, e);
        } finally {
            this.f23490V.mo25903m().mo26225a(this.f23489U, (String) null);
        }
    }
}
