package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
final /* synthetic */ class C10240x7 implements Runnable {

    /* renamed from: U */
    private final int f24048U;

    /* renamed from: V */
    private final C10099k3 f24049V;

    /* renamed from: W */
    private final Intent f24050W;

    /* renamed from: c */
    private final C10250y7 f24051c;

    C10240x7(C10250y7 y7Var, int i, C10099k3 k3Var, Intent intent) {
        this.f24051c = y7Var;
        this.f24048U = i;
        this.f24049V = k3Var;
        this.f24050W = intent;
    }

    public final void run() {
        this.f24051c.mo26204a(this.f24048U, this.f24049V, this.f24050W);
    }
}
