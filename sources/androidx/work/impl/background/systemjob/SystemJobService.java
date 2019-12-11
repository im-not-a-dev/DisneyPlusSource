package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.text.TextUtils;
import androidx.work.C1034h;
import androidx.work.impl.C1039a;
import androidx.work.impl.C1068h;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements C1039a {

    /* renamed from: V */
    private static final String f4140V = C1034h.m5551a("SystemJobService");

    /* renamed from: U */
    private final Map<String, JobParameters> f4141U = new HashMap();

    /* renamed from: c */
    private C1068h f4142c;

    /* renamed from: a */
    public void mo5713a(String str, boolean z) {
        JobParameters jobParameters;
        C1034h.m5550a().mo5697a(f4140V, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f4141U) {
            jobParameters = (JobParameters) this.f4141U.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f4142c = C1068h.m5674a();
        C1068h hVar = this.f4142c;
        if (hVar != null) {
            hVar.mo5776e().mo5750a((C1039a) this);
        } else if (Application.class.equals(getApplication().getClass())) {
            C1034h.m5550a().mo5701e(f4140V, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        } else {
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C1068h hVar = this.f4142c;
        if (hVar != null) {
            hVar.mo5776e().mo5753b((C1039a) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        r2 = new androidx.work.WorkerParameters.C1023a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r8.f4142c.mo5771a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            androidx.work.impl.h r0 = r8.f4142c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            androidx.work.h r0 = androidx.work.C1034h.m5550a()
            java.lang.String r3 = f4140V
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            java.lang.String r5 = "WorkManager is not initialized; requesting retry."
            r0.mo5697a(r3, r5, r4)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            android.os.PersistableBundle r0 = r9.getExtras()
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0035
            androidx.work.h r9 = androidx.work.C1034h.m5550a()
            java.lang.String r0 = f4140V
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "WorkSpec id not found!"
            r9.mo5698b(r0, r3, r1)
            return r2
        L_0x0035:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f4141U
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f4141U     // Catch:{ all -> 0x00a7 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0057
            androidx.work.h r9 = androidx.work.C1034h.m5550a()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = f4140V     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a7 }
            r1[r2] = r0     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00a7 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a7 }
            r9.mo5697a(r4, r0, r1)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a7 }
            return r2
        L_0x0057:
            androidx.work.h r4 = androidx.work.C1034h.m5550a()     // Catch:{ all -> 0x00a7 }
            java.lang.String r5 = f4140V     // Catch:{ all -> 0x00a7 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a7 }
            r7[r2] = r0     // Catch:{ all -> 0x00a7 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00a7 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a7 }
            r4.mo5697a(r5, r6, r2)     // Catch:{ all -> 0x00a7 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f4141U     // Catch:{ all -> 0x00a7 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00a7 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a7 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x00a1
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            if (r3 == 0) goto L_0x008b
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            java.util.Arrays.asList(r3)
        L_0x008b:
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x0098
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            java.util.Arrays.asList(r3)
        L_0x0098:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x00a1
            r9.getNetwork()
        L_0x00a1:
            androidx.work.impl.h r9 = r8.f4142c
            r9.mo5771a(r0, r2)
            return r1
        L_0x00a7:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a7 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4142c == null) {
            C1034h.m5550a().mo5697a(f4140V, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String string = jobParameters.getExtras().getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            C1034h.m5550a().mo5698b(f4140V, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        C1034h.m5550a().mo5697a(f4140V, String.format("onStopJob for %s", new Object[]{string}), new Throwable[0]);
        synchronized (this.f4141U) {
            this.f4141U.remove(string);
        }
        this.f4142c.mo5777e(string);
        return !this.f4142c.mo5776e().mo5751a(string);
    }
}
