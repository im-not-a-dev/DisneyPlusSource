package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.C1034h;
import androidx.work.impl.C1061e;
import androidx.work.impl.C1068h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.p011m.C1115k;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {

    /* renamed from: V */
    private static final String f4318V = C1034h.m5551a("ForceStopRunnable");

    /* renamed from: W */
    private static final long f4319W = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: U */
    private final C1068h f4320U;

    /* renamed from: c */
    private final Context f4321c;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f4322a = C1034h.m5551a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    C1034h.m5550a().mo5700d(f4322a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                    ForceStopRunnable.m5891b(context);
                }
            }
        }
    }

    public ForceStopRunnable(Context context, C1068h hVar) {
        this.f4321c = context.getApplicationContext();
        this.f4320U = hVar;
    }

    /* renamed from: a */
    public boolean mo5891a() {
        if (m5889a(this.f4321c, 536870912) != null) {
            return false;
        }
        m5891b(this.f4321c);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5892b() {
        return this.f4320U.mo5774d().mo5907a();
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        if (mo5892b()) {
            C1034h.m5550a().mo5697a(f4318V, "Rescheduling Workers.", new Throwable[0]);
            this.f4320U.mo5782j();
            this.f4320U.mo5774d().mo5906a(false);
        } else if (mo5891a()) {
            C1034h.m5550a().mo5697a(f4318V, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f4320U.mo5782j();
        } else {
            WorkDatabase g = this.f4320U.mo5779g();
            C1115k d = g.mo5705d();
            try {
                g.beginTransaction();
                List<C1111j> b = d.mo5873b();
                if (b != null && !b.isEmpty()) {
                    C1034h.m5550a().mo5697a(f4318V, "Found unfinished work, scheduling it.", new Throwable[0]);
                    for (C1111j jVar : b) {
                        d.mo5867a(jVar.f4280a, -1);
                    }
                    C1061e.m5661a(this.f4320U.mo5773c(), g, this.f4320U.mo5778f());
                }
                g.setTransactionSuccessful();
                g.endTransaction();
                C1034h.m5550a().mo5697a(f4318V, "Unfinished Workers exist, rescheduling.", new Throwable[0]);
            } catch (Throwable th) {
                g.endTransaction();
                throw th;
            }
        }
        this.f4320U.mo5781i();
    }

    /* renamed from: b */
    static void m5891b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = m5889a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f4319W;
        if (alarmManager == null) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, a);
        } else {
            alarmManager.set(0, currentTimeMillis, a);
        }
    }

    /* renamed from: a */
    private static PendingIntent m5889a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m5890a(context), i);
    }

    /* renamed from: a */
    static Intent m5890a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }
}
