package com.google.android.gms.measurement.internal;

import p163g.p449j.p450a.p451a.p457d.p464g.C11048bc;

/* renamed from: com.google.android.gms.measurement.internal.b9 */
final class C10006b9 implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ String f23320U;

    /* renamed from: V */
    private final /* synthetic */ String f23321V;

    /* renamed from: W */
    private final /* synthetic */ AppMeasurementDynamiteService f23322W;

    /* renamed from: c */
    private final /* synthetic */ C11048bc f23323c;

    C10006b9(AppMeasurementDynamiteService appMeasurementDynamiteService, C11048bc bcVar, String str, String str2) {
        this.f23322W = appMeasurementDynamiteService;
        this.f23323c = bcVar;
        this.f23320U = str;
        this.f23321V = str2;
    }

    public final void run() {
        this.f23322W.f23260a.mo26016A().mo25599a(this.f23323c, this.f23320U, this.f23321V);
    }
}
