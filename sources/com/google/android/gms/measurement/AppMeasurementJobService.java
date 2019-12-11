package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C10016c8;
import com.google.android.gms.measurement.internal.C10250y7;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C10016c8 {

    /* renamed from: c */
    private C10250y7<AppMeasurementJobService> f23257c;

    /* renamed from: a */
    private final C10250y7<AppMeasurementJobService> m31062a() {
        if (this.f23257c == null) {
            this.f23257c = new C10250y7<>(this);
        }
        return this.f23257c;
    }

    /* renamed from: a */
    public final void mo25517a(Intent intent) {
    }

    public final void onCreate() {
        super.onCreate();
        m31062a().mo26203a();
    }

    public final void onDestroy() {
        m31062a().mo26207b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m31062a().mo26208b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m31062a().mo26206a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return m31062a().mo26209c(intent);
    }

    /* renamed from: a */
    public final boolean mo25518a(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo25516a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
