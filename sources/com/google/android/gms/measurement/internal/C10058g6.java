package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.g6 */
final class C10058g6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23483U;

    /* renamed from: V */
    private final /* synthetic */ String f23484V;

    /* renamed from: W */
    private final /* synthetic */ String f23485W;

    /* renamed from: X */
    private final /* synthetic */ boolean f23486X;

    /* renamed from: Y */
    private final /* synthetic */ C10218v5 f23487Y;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23488c;

    C10058g6(C10218v5 v5Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f23487Y = v5Var;
        this.f23488c = atomicReference;
        this.f23483U = str;
        this.f23484V = str2;
        this.f23485W = str3;
        this.f23486X = z;
    }

    public final void run() {
        this.f23487Y.f23701a.mo26016A().mo25603a(this.f23488c, this.f23483U, this.f23484V, this.f23485W, this.f23486X);
    }
}
