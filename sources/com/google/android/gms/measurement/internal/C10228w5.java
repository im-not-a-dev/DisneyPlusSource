package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w5 */
final class C10228w5 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f24014U;

    /* renamed from: V */
    private final /* synthetic */ Object f24015V;

    /* renamed from: W */
    private final /* synthetic */ long f24016W;

    /* renamed from: X */
    private final /* synthetic */ C10218v5 f24017X;

    /* renamed from: c */
    private final /* synthetic */ String f24018c;

    C10228w5(C10218v5 v5Var, String str, String str2, Object obj, long j) {
        this.f24017X = v5Var;
        this.f24018c = str;
        this.f24014U = str2;
        this.f24015V = obj;
        this.f24016W = j;
    }

    public final void run() {
        this.f24017X.mo26152a(this.f24018c, this.f24014U, this.f24015V, this.f24016W);
    }
}
