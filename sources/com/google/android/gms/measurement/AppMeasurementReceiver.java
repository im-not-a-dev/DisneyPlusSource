package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C10034e4;
import com.google.android.gms.measurement.internal.C10056g4;
import p096e.p147m.p148a.C4235a;

public final class AppMeasurementReceiver extends C4235a implements C10056g4 {

    /* renamed from: V */
    private C10034e4 f23258V;

    /* renamed from: a */
    public final void mo25514a(Context context, Intent intent) {
        C4235a.m14566b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f23258V == null) {
            this.f23258V = new C10034e4(this);
        }
        this.f23258V.mo25678a(context, intent);
    }

    /* renamed from: a */
    public final PendingResult mo25513a() {
        return goAsync();
    }
}
