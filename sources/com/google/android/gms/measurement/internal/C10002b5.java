package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b5 */
final class C10002b5 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23306U;

    /* renamed from: V */
    private final /* synthetic */ C10156p4 f23307V;

    /* renamed from: c */
    private final /* synthetic */ C10084j f23308c;

    C10002b5(C10156p4 p4Var, C10084j jVar, String str) {
        this.f23307V = p4Var;
        this.f23308c = jVar;
        this.f23306U = str;
    }

    public final void run() {
        this.f23307V.f23848a.mo25943p();
        this.f23307V.f23848a.mo25921a(this.f23308c, this.f23306U);
    }
}
