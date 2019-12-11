package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
final class C10238x5 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f24037U;

    /* renamed from: V */
    private final /* synthetic */ long f24038V;

    /* renamed from: W */
    private final /* synthetic */ Bundle f24039W;

    /* renamed from: X */
    private final /* synthetic */ boolean f24040X;

    /* renamed from: Y */
    private final /* synthetic */ boolean f24041Y;

    /* renamed from: Z */
    private final /* synthetic */ boolean f24042Z;

    /* renamed from: a0 */
    private final /* synthetic */ String f24043a0;

    /* renamed from: b0 */
    private final /* synthetic */ C10218v5 f24044b0;

    /* renamed from: c */
    private final /* synthetic */ String f24045c;

    C10238x5(C10218v5 v5Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f24044b0 = v5Var;
        this.f24045c = str;
        this.f24037U = str2;
        this.f24038V = j;
        this.f24039W = bundle;
        this.f24040X = z;
        this.f24041Y = z2;
        this.f24042Z = z3;
        this.f24043a0 = str3;
    }

    public final void run() {
        this.f24044b0.m31881a(this.f24045c, this.f24037U, this.f24038V, this.f24039W, this.f24040X, this.f24041Y, this.f24042Z, this.f24043a0);
    }
}
