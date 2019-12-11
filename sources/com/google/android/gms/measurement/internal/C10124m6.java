package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
final class C10124m6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10218v5 f23724U;

    /* renamed from: c */
    private final /* synthetic */ long f23725c;

    C10124m6(C10218v5 v5Var, long j) {
        this.f23724U = v5Var;
        this.f23725c = j;
    }

    public final void run() {
        this.f23724U.mo25899f().f23944p.mo26197a(this.f23725c);
        this.f23724U.mo25898e().mo25868A().mo25909a("Minimum session duration set", Long.valueOf(this.f23725c));
    }
}
