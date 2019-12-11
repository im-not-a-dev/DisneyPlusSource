package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.a8 */
final /* synthetic */ class C9994a8 implements Runnable {

    /* renamed from: U */
    private final C10099k3 f23289U;

    /* renamed from: V */
    private final JobParameters f23290V;

    /* renamed from: c */
    private final C10250y7 f23291c;

    C9994a8(C10250y7 y7Var, C10099k3 k3Var, JobParameters jobParameters) {
        this.f23291c = y7Var;
        this.f23289U = k3Var;
        this.f23290V = jobParameters;
    }

    public final void run() {
        this.f23291c.mo26205a(this.f23289U, this.f23290V);
    }
}
