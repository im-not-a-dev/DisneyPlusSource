package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
final class C10091j6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23582U;

    /* renamed from: c */
    private final /* synthetic */ boolean f23583c;

    C10091j6(C10218v5 v5Var, boolean z) {
        this.f23582U = v5Var;
        this.f23583c = z;
    }

    public final void run() {
        boolean f = this.f23582U.f23701a.mo26028f();
        boolean r = this.f23582U.f23701a.mo26040r();
        this.f23582U.f23701a.mo26027a(this.f23583c);
        if (r == this.f23583c) {
            this.f23582U.f23701a.mo25898e().mo25869B().mo25909a("Default data collection state already set to", Boolean.valueOf(this.f23583c));
        }
        if (this.f23582U.f23701a.mo26028f() == f || this.f23582U.f23701a.mo26028f() != this.f23582U.f23701a.mo26040r()) {
            this.f23582U.f23701a.mo25898e().mo25879y().mo25910a("Default data collection is different than actual status", Boolean.valueOf(this.f23583c), Boolean.valueOf(f));
        }
        this.f23582U.m31876M();
    }
}
