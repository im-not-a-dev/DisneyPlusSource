package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.measurement.internal.C10016c8;
import p163g.p449j.p450a.p451a.p457d.p464g.C11161ic;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
public final class C10250y7<T extends Context & C10016c8> {

    /* renamed from: a */
    private final T f24078a;

    public C10250y7(T t) {
        C9908u.m30853a(t);
        this.f24078a = t;
    }

    /* renamed from: a */
    public final void mo26203a() {
        C10145o4 a = C10145o4.m31729a((Context) this.f24078a, (C11161ic) null);
        C10099k3 e = a.mo25898e();
        a.mo25894a();
        e.mo25869B().mo25908a("Local AppMeasurementService is starting up");
    }

    /* renamed from: b */
    public final void mo26207b() {
        C10145o4 a = C10145o4.m31729a((Context) this.f24078a, (C11161ic) null);
        C10099k3 e = a.mo25898e();
        a.mo25894a();
        e.mo25869B().mo25908a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: c */
    public final boolean mo26209c(Intent intent) {
        if (intent == null) {
            m31955c().mo25874t().mo25908a("onUnbind called with null intent");
            return true;
        }
        m31955c().mo25869B().mo25909a("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* renamed from: c */
    private final C10099k3 m31955c() {
        return C10145o4.m31729a((Context) this.f24078a, (C11161ic) null).mo25898e();
    }

    /* renamed from: a */
    public final int mo26201a(Intent intent, int i, int i2) {
        C10145o4 a = C10145o4.m31729a((Context) this.f24078a, (C11161ic) null);
        C10099k3 e = a.mo25898e();
        if (intent == null) {
            e.mo25877w().mo25908a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a.mo25894a();
        e.mo25869B().mo25910a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m31954a((Runnable) new C10240x7(this, i2, e, intent));
        }
        return 2;
    }

    /* renamed from: b */
    public final void mo26208b(Intent intent) {
        if (intent == null) {
            m31955c().mo25874t().mo25908a("onRebind called with null intent");
            return;
        }
        m31955c().mo25869B().mo25909a("onRebind called. action", intent.getAction());
    }

    /* renamed from: a */
    private final void m31954a(Runnable runnable) {
        C10126m8 a = C10126m8.m31577a((Context) this.f24078a);
        a.mo25897d().mo25800a((Runnable) new C10260z7(this, a, runnable));
    }

    /* renamed from: a */
    public final IBinder mo26202a(Intent intent) {
        if (intent == null) {
            m31955c().mo25874t().mo25908a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C10156p4(C10126m8.m31577a((Context) this.f24078a));
        }
        m31955c().mo25877w().mo25909a("onBind received unknown action", action);
        return null;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean mo26206a(JobParameters jobParameters) {
        C10145o4 a = C10145o4.m31729a((Context) this.f24078a, (C11161ic) null);
        C10099k3 e = a.mo25898e();
        String string = jobParameters.getExtras().getString("action");
        a.mo25894a();
        e.mo25869B().mo25909a("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m31954a((Runnable) new C9994a8(this, e, jobParameters));
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo26205a(C10099k3 k3Var, JobParameters jobParameters) {
        k3Var.mo25869B().mo25908a("AppMeasurementJobService processed last upload request.");
        ((C10016c8) this.f24078a).mo25516a(jobParameters, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo26204a(int i, C10099k3 k3Var, Intent intent) {
        if (((C10016c8) this.f24078a).mo25518a(i)) {
            k3Var.mo25869B().mo25909a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m31955c().mo25869B().mo25908a("Completed wakeful intent.");
            ((C10016c8) this.f24078a).mo25517a(intent);
        }
    }
}
