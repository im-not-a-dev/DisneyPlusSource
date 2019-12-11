package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l6 */
final class C10113l6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23702U;

    /* renamed from: c */
    private final /* synthetic */ long f23703c;

    C10113l6(C10218v5 v5Var, long j) {
        this.f23702U = v5Var;
        this.f23703c = j;
    }

    public final void run() {
        this.f23702U.mo25899f().f23945q.mo26197a(this.f23703c);
        this.f23702U.mo25898e().mo25868A().mo25909a("Session timeout duration set", Long.valueOf(this.f23703c));
    }
}
