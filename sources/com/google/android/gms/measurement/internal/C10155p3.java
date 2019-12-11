package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.p3 */
final class C10155p3 implements Runnable {

    /* renamed from: U */
    private final int f23842U;

    /* renamed from: V */
    private final Throwable f23843V;

    /* renamed from: W */
    private final byte[] f23844W;

    /* renamed from: X */
    private final String f23845X;

    /* renamed from: Y */
    private final Map<String, List<String>> f23846Y;

    /* renamed from: c */
    private final C10166q3 f23847c;

    private C10155p3(String str, C10166q3 q3Var, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        C9908u.m30853a(q3Var);
        this.f23847c = q3Var;
        this.f23842U = i;
        this.f23843V = th;
        this.f23844W = bArr;
        this.f23845X = str;
        this.f23846Y = map;
    }

    public final void run() {
        this.f23847c.mo26057a(this.f23845X, this.f23842U, this.f23843V, this.f23844W, this.f23846Y);
    }
}
