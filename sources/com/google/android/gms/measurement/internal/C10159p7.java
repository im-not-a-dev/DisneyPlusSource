package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
final class C10159p7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23853U;

    /* renamed from: V */
    private final /* synthetic */ boolean f23854V;

    /* renamed from: W */
    private final /* synthetic */ C10028d9 f23855W;

    /* renamed from: X */
    private final /* synthetic */ C11048bc f23856X;

    /* renamed from: Y */
    private final /* synthetic */ C9993a7 f23857Y;

    /* renamed from: c */
    private final /* synthetic */ String f23858c;

    C10159p7(C9993a7 a7Var, String str, String str2, boolean z, C10028d9 d9Var, C11048bc bcVar) {
        this.f23857Y = a7Var;
        this.f23858c = str;
        this.f23853U = str2;
        this.f23854V = z;
        this.f23855W = d9Var;
        this.f23856X = bcVar;
    }

    public final void run() {
        String str = "Failed to get user properties";
        Bundle bundle = new Bundle();
        try {
            C10000b3 d = this.f23857Y.f23283d;
            if (d == null) {
                this.f23857Y.mo25898e().mo25874t().mo25910a(str, this.f23858c, this.f23853U);
                return;
            }
            bundle = C10251y8.m31967a(d.mo25617a(this.f23858c, this.f23853U, this.f23854V, this.f23855W));
            this.f23857Y.m31091J();
            this.f23857Y.mo25903m().mo26224a(this.f23856X, bundle);
        } catch (RemoteException e) {
            this.f23857Y.mo25898e().mo25874t().mo25910a(str, this.f23858c, e);
        } finally {
            this.f23857Y.mo25903m().mo26224a(this.f23856X, bundle);
        }
    }
}
