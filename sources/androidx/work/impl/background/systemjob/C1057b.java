package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.C1034h;
import androidx.work.WorkInfo.State;
import androidx.work.impl.C1060d;
import androidx.work.impl.C1068h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p011m.C1102d;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.utils.C1136c;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.work.impl.background.systemjob.b */
/* compiled from: SystemJobScheduler */
public class C1057b implements C1060d {

    /* renamed from: X */
    private static final String f4146X = C1034h.m5551a("SystemJobScheduler");

    /* renamed from: U */
    private final C1068h f4147U;

    /* renamed from: V */
    private final C1136c f4148V;

    /* renamed from: W */
    private final C1055a f4149W;

    /* renamed from: c */
    private final JobScheduler f4150c;

    public C1057b(Context context, C1068h hVar) {
        this(context, hVar, (JobScheduler) context.getSystemService("jobscheduler"), new C1055a(context));
    }

    /* renamed from: a */
    public void mo5738a(C1111j... jVarArr) {
        int i;
        WorkDatabase g = this.f4147U.mo5779g();
        int length = jVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C1111j jVar = jVarArr[i2];
            g.beginTransaction();
            try {
                C1111j f = g.mo5705d().mo5881f(jVar.f4280a);
                String str = "Skipping scheduling ";
                if (f == null) {
                    C1034h a = C1034h.m5550a();
                    String str2 = f4146X;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(jVar.f4280a);
                    sb.append(" because it's no longer in the DB");
                    a.mo5701e(str2, sb.toString(), new Throwable[0]);
                } else if (f.f4281b != State.ENQUEUED) {
                    C1034h a2 = C1034h.m5550a();
                    String str3 = f4146X;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(jVar.f4280a);
                    sb2.append(" because it is no longer enqueued");
                    a2.mo5701e(str3, sb2.toString(), new Throwable[0]);
                } else {
                    C1102d a3 = g.mo5703b().mo5843a(jVar.f4280a);
                    if (a3 == null || m5643a(this.f4150c, jVar.f4280a) == null) {
                        if (a3 != null) {
                            i = a3.f4270b;
                        } else {
                            i = this.f4148V.mo5905a(this.f4147U.mo5773c().mo5658d(), this.f4147U.mo5773c().mo5656b());
                        }
                        if (a3 == null) {
                            this.f4147U.mo5779g().mo5703b().mo5844a(new C1102d(jVar.f4280a, i));
                        }
                        mo5749a(jVar, i);
                        if (VERSION.SDK_INT == 23) {
                            mo5749a(jVar, this.f4148V.mo5905a(this.f4147U.mo5773c().mo5658d(), this.f4147U.mo5773c().mo5656b()));
                        }
                        g.setTransactionSuccessful();
                    } else {
                        C1034h.m5550a().mo5697a(f4146X, String.format("Skipping scheduling %s because JobScheduler is aware of it already.", new Object[]{jVar.f4280a}), new Throwable[0]);
                    }
                }
                i2++;
            } finally {
                g.endTransaction();
            }
        }
    }

    public C1057b(Context context, C1068h hVar, JobScheduler jobScheduler, C1055a aVar) {
        this.f4147U = hVar;
        this.f4150c = jobScheduler;
        this.f4148V = new C1136c(context);
        this.f4149W = aVar;
    }

    /* renamed from: a */
    public void mo5749a(C1111j jVar, int i) {
        int i2;
        JobInfo a = this.f4149W.mo5748a(jVar, i);
        C1034h.m5550a().mo5697a(f4146X, String.format("Scheduling work ID %s Job ID %s", new Object[]{jVar.f4280a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            this.f4150c.schedule(a);
        } catch (IllegalStateException e) {
            List<JobInfo> allPendingJobs = this.f4150c.getAllPendingJobs();
            if (allPendingJobs != null) {
                i2 = 0;
                for (JobInfo extras : allPendingJobs) {
                    if (extras.getExtras().getString("EXTRA_WORK_SPEC_ID") != null) {
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f4147U.mo5779g().mo5705d().mo5868a().size()), Integer.valueOf(this.f4147U.mo5773c().mo5657c())});
            C1034h.m5550a().mo5698b(f4146X, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        }
    }

    /* renamed from: a */
    public void mo5737a(String str) {
        List<JobInfo> allPendingJobs = this.f4150c.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                if (str.equals(jobInfo.getExtras().getString("EXTRA_WORK_SPEC_ID"))) {
                    this.f4147U.mo5779g().mo5703b().mo5845b(str);
                    this.f4150c.cancel(jobInfo.getId());
                    if (VERSION.SDK_INT != 23) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5644a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs != null) {
                for (JobInfo jobInfo : allPendingJobs) {
                    if (jobInfo.getExtras().containsKey("EXTRA_WORK_SPEC_ID")) {
                        jobScheduler.cancel(jobInfo.getId());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static JobInfo m5643a(JobScheduler jobScheduler, String str) {
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        if (allPendingJobs != null) {
            for (JobInfo jobInfo : allPendingJobs) {
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    String str2 = "EXTRA_WORK_SPEC_ID";
                    if (extras.containsKey(str2) && str.equals(extras.getString(str2))) {
                        return jobInfo;
                    }
                }
            }
        }
        return null;
    }
}
