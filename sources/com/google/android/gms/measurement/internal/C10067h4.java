package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
final class C10067h4 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ long f23510U;

    /* renamed from: V */
    private final /* synthetic */ Bundle f23511V;

    /* renamed from: W */
    private final /* synthetic */ Context f23512W;

    /* renamed from: X */
    private final /* synthetic */ C10099k3 f23513X;

    /* renamed from: Y */
    private final /* synthetic */ PendingResult f23514Y;

    /* renamed from: c */
    private final /* synthetic */ C10145o4 f23515c;

    C10067h4(C10034e4 e4Var, C10145o4 o4Var, long j, Bundle bundle, Context context, C10099k3 k3Var, PendingResult pendingResult) {
        this.f23515c = o4Var;
        this.f23510U = j;
        this.f23511V = bundle;
        this.f23512W = context;
        this.f23513X = k3Var;
        this.f23514Y = pendingResult;
    }

    public final void run() {
        long a = this.f23515c.mo26030h().f23938j.mo26196a();
        long j = this.f23510U;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f23511V.putLong("click_timestamp", j);
        }
        this.f23511V.putString("_cis", "referrer broadcast");
        C10145o4.m31729a(this.f23512W, (C11161ic) null).mo26047y().mo26161b("auto", "_cmp", this.f23511V);
        this.f23513X.mo25869B().mo25908a("Install campaign recorded");
        PendingResult pendingResult = this.f23514Y;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
