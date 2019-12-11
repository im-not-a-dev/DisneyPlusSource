package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1034h;
import androidx.work.impl.C1068h;
import androidx.work.impl.p011m.C1102d;
import androidx.work.impl.p011m.C1103e;
import androidx.work.impl.utils.C1136c;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* compiled from: Alarms */
class C1041a {

    /* renamed from: a */
    private static final String f4094a = C1034h.m5551a("Alarms");

    /* renamed from: a */
    public static void m5592a(Context context, C1068h hVar, String str, long j) {
        C1103e b = hVar.mo5779g().mo5703b();
        C1102d a = b.mo5843a(str);
        if (a != null) {
            m5593a(context, str, a.f4270b);
            m5594a(context, str, a.f4270b, j);
            return;
        }
        int a2 = new C1136c(context).mo5904a();
        b.mo5844a(new C1102d(str, a2));
        m5594a(context, str, a2, j);
    }

    /* renamed from: a */
    public static void m5591a(Context context, C1068h hVar, String str) {
        C1103e b = hVar.mo5779g().mo5703b();
        C1102d a = b.mo5843a(str);
        if (a != null) {
            m5593a(context, str, a.f4270b);
            C1034h.m5550a().mo5697a(f4094a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            b.mo5845b(str);
        }
    }

    /* renamed from: a */
    private static void m5593a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1042b.m5596a(context, str), 536870912);
        if (service != null && alarmManager != null) {
            C1034h.m5550a().mo5697a(f4094a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: a */
    private static void m5594a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1042b.m5596a(context, str), 1073741824);
        if (alarmManager == null) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
