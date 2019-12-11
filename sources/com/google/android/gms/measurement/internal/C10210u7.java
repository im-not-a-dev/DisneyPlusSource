package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.u7 */
final class C10210u7 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ C10190s7 f23977U;

    /* renamed from: c */
    private final /* synthetic */ ComponentName f23978c;

    C10210u7(C10190s7 s7Var, ComponentName componentName) {
        this.f23977U = s7Var;
        this.f23978c = componentName;
    }

    public final void run() {
        this.f23977U.f23923V.m31097a(this.f23978c);
    }
}
