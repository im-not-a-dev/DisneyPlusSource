package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.ArrayList;
import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;

/* renamed from: com.google.android.gms.measurement.internal.n7 */
final class C10137n7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23772U;

    /* renamed from: V */
    private final /* synthetic */ C10028d9 f23773V;

    /* renamed from: W */
    private final /* synthetic */ C11048bc f23774W;

    /* renamed from: X */
    private final /* synthetic */ C9993a7 f23775X;

    /* renamed from: c */
    private final /* synthetic */ String f23776c;

    C10137n7(C9993a7 a7Var, String str, String str2, C10028d9 d9Var, C11048bc bcVar) {
        this.f23775X = a7Var;
        this.f23776c = str;
        this.f23772U = str2;
        this.f23773V = d9Var;
        this.f23774W = bcVar;
    }

    public final void run() {
        String str = "Failed to get conditional properties";
        ArrayList arrayList = new ArrayList();
        try {
            C10000b3 d = this.f23775X.f23283d;
            if (d == null) {
                this.f23775X.mo25898e().mo25874t().mo25910a(str, this.f23776c, this.f23772U);
                return;
            }
            arrayList = C10251y8.m31981b(d.mo25614a(this.f23776c, this.f23772U, this.f23773V));
            this.f23775X.m31091J();
            this.f23775X.mo25903m().mo26226a(this.f23774W, arrayList);
        } catch (RemoteException e) {
            this.f23775X.mo25898e().mo25874t().mo25911a(str, this.f23776c, this.f23772U, e);
        } finally {
            this.f23775X.mo25903m().mo26226a(this.f23774W, arrayList);
        }
    }
}
