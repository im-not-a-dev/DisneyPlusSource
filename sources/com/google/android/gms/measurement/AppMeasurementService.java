package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C10016c8;
import com.google.android.gms.measurement.internal.C10250y7;
import p096e.p147m.p148a.C4235a;

public final class AppMeasurementService extends Service implements C10016c8 {

    /* renamed from: c */
    private C10250y7<AppMeasurementService> f23259c;

    /* renamed from: a */
    private final C10250y7<AppMeasurementService> m31068a() {
        if (this.f23259c == null) {
            this.f23259c = new C10250y7<>(this);
        }
        return this.f23259c;
    }

    public final IBinder onBind(Intent intent) {
        return m31068a().mo26202a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        m31068a().mo26203a();
    }

    public final void onDestroy() {
        m31068a().mo26207b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m31068a().mo26208b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m31068a().mo26201a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return m31068a().mo26209c(intent);
    }

    /* renamed from: a */
    public final boolean mo25518a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: a */
    public final void mo25516a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo25517a(Intent intent) {
        C4235a.m14565a(intent);
    }
}
