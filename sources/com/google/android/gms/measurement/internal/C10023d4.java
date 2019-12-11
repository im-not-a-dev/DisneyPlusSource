package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
final class C10023d4 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10099k3 f23358U;

    /* renamed from: c */
    private final /* synthetic */ C10145o4 f23359c;

    C10023d4(C10034e4 e4Var, C10145o4 o4Var, C10099k3 k3Var) {
        this.f23359c = o4Var;
        this.f23358U = k3Var;
    }

    public final void run() {
        if (this.f23359c.mo26033k() == null) {
            this.f23358U.mo25874t().mo25908a("Install Referrer Reporter is null");
            return;
        }
        C10256z3 k = this.f23359c.mo26033k();
        k.f24087a.mo26045w();
        k.mo26245a(k.f24087a.mo25895b().getPackageName());
    }
}
