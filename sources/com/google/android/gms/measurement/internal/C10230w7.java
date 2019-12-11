package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.w7 */
final class C10230w7 implements Runnable {

    /* renamed from: c */
    private final /* synthetic */ C10190s7 f24023c;

    C10230w7(C10190s7 s7Var) {
        this.f24023c = s7Var;
    }

    public final void run() {
        C9993a7 a7Var = this.f24023c.f23923V;
        Context b = a7Var.mo25895b();
        this.f24023c.f23923V.mo25894a();
        a7Var.m31097a(new ComponentName(b, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
