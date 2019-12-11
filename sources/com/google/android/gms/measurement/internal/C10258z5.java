package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z5 */
final class C10258z5 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f24090U;

    /* renamed from: c */
    private final /* synthetic */ long f24091c;

    C10258z5(C10218v5 v5Var, long j) {
        this.f24090U = v5Var;
        this.f24091c = j;
    }

    public final void run() {
        C10218v5 v5Var = this.f24090U;
        long j = this.f24091c;
        v5Var.mo25662j();
        v5Var.mo25661h();
        v5Var.mo25754x();
        v5Var.mo25898e().mo25868A().mo25908a("Resetting analytics data (FE)");
        v5Var.mo25670u().mo25632B();
        if (v5Var.mo25900g().mo25826j(v5Var.mo25666q().mo25641C())) {
            v5Var.mo25899f().f23938j.mo26197a(j);
        }
        boolean f = v5Var.f23701a.mo26028f();
        if (!v5Var.mo25900g().mo25834p()) {
            v5Var.mo25899f().mo26096d(!f);
        }
        v5Var.mo25667r().mo25586D();
        v5Var.f23997h = !f;
        this.f24090U.mo25667r().mo25601a(new AtomicReference<>());
    }
}
