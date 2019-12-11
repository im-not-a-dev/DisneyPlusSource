package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.r6 */
final /* synthetic */ class C10179r6 implements Runnable {

    /* renamed from: U */
    private final int f23889U;

    /* renamed from: V */
    private final Exception f23890V;

    /* renamed from: W */
    private final byte[] f23891W;

    /* renamed from: X */
    private final Map f23892X;

    /* renamed from: c */
    private final C10189s6 f23893c;

    C10179r6(C10189s6 s6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f23893c = s6Var;
        this.f23889U = i;
        this.f23890V = exc;
        this.f23891W = bArr;
        this.f23892X = map;
    }

    public final void run() {
        this.f23893c.mo26080a(this.f23889U, this.f23890V, this.f23891W, this.f23892X);
    }
}
