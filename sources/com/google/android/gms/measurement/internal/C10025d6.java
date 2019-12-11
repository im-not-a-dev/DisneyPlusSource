package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
final class C10025d6 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23363U;

    /* renamed from: V */
    private final /* synthetic */ String f23364V;

    /* renamed from: W */
    private final /* synthetic */ String f23365W;

    /* renamed from: X */
    private final /* synthetic */ C10218v5 f23366X;

    /* renamed from: c */
    private final /* synthetic */ AtomicReference f23367c;

    C10025d6(C10218v5 v5Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f23366X = v5Var;
        this.f23367c = atomicReference;
        this.f23363U = str;
        this.f23364V = str2;
        this.f23365W = str3;
    }

    public final void run() {
        this.f23366X.f23701a.mo26016A().mo25602a(this.f23367c, this.f23363U, this.f23364V, this.f23365W);
    }
}
