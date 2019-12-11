package androidx.work.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1025b;
import androidx.work.C1034h;
import androidx.work.impl.background.systemalarm.C1050f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C1057b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.p011m.C1115k;
import androidx.work.impl.utils.C1137d;
import java.util.List;

/* renamed from: androidx.work.impl.e */
/* compiled from: Schedulers */
public class C1061e {

    /* renamed from: a */
    private static final String f4164a = C1034h.m5551a("Schedulers");

    /* renamed from: a */
    public static void m5661a(C1025b bVar, WorkDatabase workDatabase, List<C1060d> list) {
        if (list != null && list.size() != 0) {
            C1115k d = workDatabase.mo5705d();
            workDatabase.beginTransaction();
            try {
                List<C1111j> a = d.mo5869a(bVar.mo5657c());
                if (a != null && a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C1111j jVar : a) {
                        d.mo5867a(jVar.f4280a, currentTimeMillis);
                    }
                }
                workDatabase.setTransactionSuccessful();
                if (a != null && a.size() > 0) {
                    C1111j[] jVarArr = (C1111j[]) a.toArray(new C1111j[0]);
                    for (C1060d a2 : list) {
                        a2.mo5738a(jVarArr);
                    }
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    static C1060d m5660a(Context context, C1068h hVar) {
        if (VERSION.SDK_INT >= 23) {
            C1057b bVar = new C1057b(context, hVar);
            C1137d.m5916a(context, SystemJobService.class, true);
            C1034h.m5550a().mo5697a(f4164a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        C1060d a = m5659a(context);
        if (a != null) {
            return a;
        }
        C1050f fVar = new C1050f(context);
        C1137d.m5916a(context, SystemAlarmService.class, true);
        C1034h.m5550a().mo5697a(f4164a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    /* renamed from: a */
    private static C1060d m5659a(Context context) {
        try {
            C1060d dVar = (C1060d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C1034h.m5550a().mo5697a(f4164a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return dVar;
        } catch (Throwable th) {
            C1034h.m5550a().mo5697a(f4164a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
