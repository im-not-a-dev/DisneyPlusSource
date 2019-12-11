package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C10034e4;
import com.google.android.gms.measurement.internal.C10056g4;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C10056g4 {

    /* renamed from: c */
    private C10034e4 f23256c;

    /* renamed from: a */
    public final PendingResult mo25513a() {
        return goAsync();
    }

    /* renamed from: a */
    public final void mo25514a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f23256c == null) {
            this.f23256c = new C10034e4(this);
        }
        this.f23256c.mo25678a(context, intent);
    }
}
