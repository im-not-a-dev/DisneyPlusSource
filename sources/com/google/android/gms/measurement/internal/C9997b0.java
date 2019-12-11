package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b0 */
final class C9997b0 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ long f23298U;

    /* renamed from: V */
    private final /* synthetic */ C9985a f23299V;

    /* renamed from: c */
    private final /* synthetic */ String f23300c;

    C9997b0(C9985a aVar, String str, long j) {
        this.f23299V = aVar;
        this.f23300c = str;
        this.f23298U = j;
    }

    public final void run() {
        this.f23299V.m31083d(this.f23300c, this.f23298U);
    }
}
