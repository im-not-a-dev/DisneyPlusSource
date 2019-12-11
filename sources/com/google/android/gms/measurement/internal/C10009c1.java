package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c1 */
final class C10009c1 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ long f23325U;

    /* renamed from: V */
    private final /* synthetic */ C9985a f23326V;

    /* renamed from: c */
    private final /* synthetic */ String f23327c;

    C10009c1(C9985a aVar, String str, long j) {
        this.f23326V = aVar;
        this.f23327c = str;
        this.f23325U = j;
    }

    public final void run() {
        this.f23326V.m31082c(this.f23327c, this.f23325U);
    }
}
