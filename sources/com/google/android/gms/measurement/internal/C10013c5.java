package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c5 */
final class C10013c5 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10028d9 f23342U;

    /* renamed from: V */
    private final /* synthetic */ C10156p4 f23343V;

    /* renamed from: c */
    private final /* synthetic */ C10084j f23344c;

    C10013c5(C10156p4 p4Var, C10084j jVar, C10028d9 d9Var) {
        this.f23343V = p4Var;
        this.f23344c = jVar;
        this.f23342U = d9Var;
    }

    public final void run() {
        C10084j b = this.f23343V.mo26064b(this.f23344c, this.f23342U);
        this.f23343V.f23848a.mo25943p();
        this.f23343V.f23848a.mo25920a(b, this.f23342U);
    }
}
