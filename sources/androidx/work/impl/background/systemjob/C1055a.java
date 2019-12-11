package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo.TriggerContentUri;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.C1024a;
import androidx.work.C1027c;
import androidx.work.C1029d.C1030a;
import androidx.work.C1034h;
import androidx.work.C1036i;
import androidx.work.impl.p011m.C1111j;

/* renamed from: androidx.work.impl.background.systemjob.a */
/* compiled from: SystemJobInfoConverter */
class C1055a {

    /* renamed from: b */
    private static final String f4143b = C1034h.m5551a("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f4144a;

    /* renamed from: androidx.work.impl.background.systemjob.a$a */
    /* compiled from: SystemJobInfoConverter */
    static /* synthetic */ class C1056a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4145a = new int[C1036i.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.work.i[] r0 = androidx.work.C1036i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4145a = r0
                int[] r0 = f4145a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.work.i r1 = androidx.work.C1036i.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4145a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.work.i r1 = androidx.work.C1036i.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4145a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.work.i r1 = androidx.work.C1036i.UNMETERED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4145a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.work.i r1 = androidx.work.C1036i.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f4145a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.work.i r1 = androidx.work.C1036i.METERED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C1055a.C1056a.<clinit>():void");
        }
    }

    C1055a(Context context) {
        this.f4144a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JobInfo mo5748a(C1111j jVar, int i) {
        C1027c cVar = jVar.f4289j;
        int a = m5640a(cVar.mo5668b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", jVar.f4280a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", jVar.mo5855d());
        Builder extras = new Builder(i, this.f4144a).setRequiredNetworkType(a).setRequiresCharging(cVar.mo5678g()).setRequiresDeviceIdle(cVar.mo5679h()).setExtras(persistableBundle);
        if (!cVar.mo5679h()) {
            extras.setBackoffCriteria(jVar.f4292m, jVar.f4291l == C1024a.LINEAR ? 0 : 1);
        }
        if (!jVar.mo5855d()) {
            extras.setMinimumLatency(jVar.f4286g);
        } else if (VERSION.SDK_INT >= 24) {
            extras.setPeriodic(jVar.f4287h, jVar.f4288i);
        } else {
            C1034h.m5550a().mo5697a(f4143b, "Flex duration is currently not supported before API 24. Ignoring.", new Throwable[0]);
            extras.setPeriodic(jVar.f4287h);
        }
        if (VERSION.SDK_INT >= 24 && cVar.mo5675e()) {
            for (C1030a a2 : cVar.mo5663a().mo5688a()) {
                extras.addTriggerContentUri(m5641a(a2));
            }
            extras.setTriggerContentUpdateDelay(cVar.mo5671c());
            extras.setTriggerContentMaxDelay(cVar.mo5673d());
        }
        extras.setPersisted(false);
        if (VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.mo5677f());
            extras.setRequiresStorageNotLow(cVar.mo5681i());
        }
        return extras.build();
    }

    /* renamed from: a */
    private static TriggerContentUri m5641a(C1030a aVar) {
        return new TriggerContentUri(aVar.mo5693a(), aVar.mo5694b() ? 1 : 0);
    }

    /* renamed from: a */
    static int m5640a(C1036i iVar) {
        int i = C1056a.f4145a[iVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (VERSION.SDK_INT >= 24) {
            return 3;
        }
        C1034h.m5550a().mo5697a(f4143b, String.format("API version too low. Cannot convert network type value %s", new Object[]{iVar}), new Throwable[0]);
        return 1;
    }
}
