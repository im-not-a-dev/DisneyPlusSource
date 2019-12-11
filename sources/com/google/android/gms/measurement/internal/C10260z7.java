package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
final class C10260z7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ Runnable f24093U;

    /* renamed from: c */
    private final /* synthetic */ C10126m8 f24094c;

    C10260z7(C10250y7 y7Var, C10126m8 m8Var, Runnable runnable) {
        this.f24094c = m8Var;
        this.f24093U = runnable;
    }

    public final void run() {
        this.f24094c.mo25943p();
        this.f24094c.mo25924a(this.f24093U);
        this.f24094c.mo25942o();
    }
}
