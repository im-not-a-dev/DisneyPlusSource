package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import p163g.p449j.p450a.p451a.p457d.p464g.C11142h7;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
public final class C10082i8 extends C10138n8 {

    /* renamed from: d */
    private final AlarmManager f23553d = ((AlarmManager) mo25895b().getSystemService("alarm"));

    /* renamed from: e */
    private final C9996b f23554e;

    /* renamed from: f */
    private Integer f23555f;

    protected C10082i8(C10126m8 m8Var) {
        super(m8Var);
        this.f23554e = new C10115l8(this, m8Var.mo25945r(), m8Var);
    }

    /* renamed from: w */
    private final int m31354w() {
        if (this.f23555f == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo25895b().getPackageName());
            this.f23555f = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f23555f.intValue();
    }

    @TargetApi(24)
    /* renamed from: x */
    private final void m31355x() {
        JobScheduler jobScheduler = (JobScheduler) mo25895b().getSystemService("jobscheduler");
        int w = m31354w();
        mo25898e().mo25869B().mo25909a("Cancelling job. JobID", Integer.valueOf(w));
        jobScheduler.cancel(w);
    }

    /* renamed from: y */
    private final PendingIntent m31356y() {
        Context b = mo25895b();
        return PendingIntent.getBroadcast(b, 0, new Intent().setClassName(b, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: a */
    public final void mo25808a(long j) {
        mo25969t();
        mo25894a();
        Context b = mo25895b();
        if (!C10034e4.m31212a(b)) {
            mo25898e().mo25868A().mo25908a("Receiver not registered/enabled");
        }
        if (!C10251y8.m31971a(b, false)) {
            mo25898e().mo25868A().mo25908a("Service not registered/enabled");
        }
        mo25809v();
        long a = mo25896c().mo25472a() + j;
        if (j < Math.max(0, ((Long) C10106l.f23614C.mo26194a(null)).longValue()) && !this.f23554e.mo25610c()) {
            mo25898e().mo25869B().mo25908a("Scheduling upload with DelayedRunnable");
            this.f23554e.mo25608a(j);
        }
        mo25894a();
        if (VERSION.SDK_INT >= 24) {
            mo25898e().mo25869B().mo25908a("Scheduling upload with JobScheduler");
            Context b2 = mo25895b();
            ComponentName componentName = new ComponentName(b2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int w = m31354w();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(w, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            mo25898e().mo25869B().mo25909a("Scheduling job. JobID", Integer.valueOf(w));
            C11142h7.m35271a(b2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        mo25898e().mo25869B().mo25908a("Scheduling upload with AlarmManager");
        this.f23553d.setInexactRepeating(2, a, Math.max(((Long) C10106l.f23688x.mo26194a(null)).longValue(), j), m31356y());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo25760u() {
        this.f23553d.cancel(m31356y());
        if (VERSION.SDK_INT >= 24) {
            m31355x();
        }
        return false;
    }

    /* renamed from: v */
    public final void mo25809v() {
        mo25969t();
        this.f23553d.cancel(m31356y());
        this.f23554e.mo25607a();
        if (VERSION.SDK_INT >= 24) {
            m31355x();
        }
    }
}
