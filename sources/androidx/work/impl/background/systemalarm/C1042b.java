package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C1034h;
import androidx.work.impl.C1039a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p011m.C1111j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* compiled from: CommandHandler */
public class C1042b implements C1039a {

    /* renamed from: W */
    private static final String f4095W = C1034h.m5551a("CommandHandler");

    /* renamed from: U */
    private final Map<String, C1039a> f4096U = new HashMap();

    /* renamed from: V */
    private final Object f4097V = new Object();

    /* renamed from: c */
    private final Context f4098c;

    C1042b(Context context) {
        this.f4098c = context;
    }

    /* renamed from: a */
    static Intent m5596a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    static Intent m5600b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m5602c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    private void m5604d(Intent intent, int i, C1045e eVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        C1034h.m5550a().mo5697a(f4095W, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo5713a(string, z);
    }

    /* renamed from: e */
    private void m5605e(Intent intent, int i, C1045e eVar) {
        C1034h.m5550a().mo5697a(f4095W, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        eVar.mo5731c().mo5782j();
    }

    /* renamed from: f */
    private void m5606f(Intent intent, int i, C1045e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1034h.m5550a().mo5697a(f4095W, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase g = eVar.mo5731c().mo5779g();
        g.beginTransaction();
        try {
            C1111j f = g.mo5705d().mo5881f(string);
            String str = "Skipping scheduling ";
            if (f == null) {
                C1034h a = C1034h.m5550a();
                String str2 = f4095W;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(string);
                sb.append(" because it's no longer in the DB");
                a.mo5701e(str2, sb.toString(), new Throwable[0]);
            } else if (f.f4281b.mo5635a()) {
                C1034h a2 = C1034h.m5550a();
                String str3 = f4095W;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(string);
                sb2.append("because it is finished.");
                a2.mo5701e(str3, sb2.toString(), new Throwable[0]);
                g.endTransaction();
            } else {
                long a3 = f.mo5849a();
                if (!f.mo5853b()) {
                    C1034h.m5550a().mo5697a(f4095W, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a3)}), new Throwable[0]);
                    C1041a.m5592a(this.f4098c, eVar.mo5731c(), string, a3);
                } else {
                    C1034h.m5550a().mo5697a(f4095W, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a3)}), new Throwable[0]);
                    C1041a.m5592a(this.f4098c, eVar.mo5731c(), string, a3);
                    eVar.mo5728a((Runnable) new C1047b(eVar, m5595a(this.f4098c), i));
                }
                g.setTransactionSuccessful();
                g.endTransaction();
            }
        } finally {
            g.endTransaction();
        }
    }

    /* renamed from: g */
    private void m5607g(Intent intent, int i, C1045e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C1034h.m5550a().mo5697a(f4095W, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.mo5731c().mo5777e(string);
        C1041a.m5591a(this.f4098c, eVar.mo5731c(), string);
        eVar.mo5713a(string, false);
    }

    /* renamed from: a */
    static Intent m5595a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m5599b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: c */
    private void m5603c(Intent intent, int i, C1045e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f4097V) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C1034h.m5550a().mo5697a(f4095W, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f4096U.containsKey(string)) {
                C1044d dVar = new C1044d(this.f4098c, i, string, eVar);
                this.f4096U.put(string, dVar);
                dVar.mo5722a();
            } else {
                C1034h.m5550a().mo5697a(f4095W, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    static Intent m5597a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: b */
    private void m5601b(Intent intent, int i, C1045e eVar) {
        C1034h.m5550a().mo5697a(f4095W, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new C1043c(this.f4098c, i, eVar).mo5721a();
    }

    /* renamed from: a */
    public void mo5713a(String str, boolean z) {
        synchronized (this.f4097V) {
            C1039a aVar = (C1039a) this.f4096U.remove(str);
            if (aVar != null) {
                aVar.mo5713a(str, z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5720a() {
        boolean z;
        synchronized (this.f4097V) {
            z = !this.f4096U.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5719a(Intent intent, int i, C1045e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m5601b(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m5605e(intent, i, eVar);
        } else {
            String str = "KEY_WORKSPEC_ID";
            if (!m5598a(intent.getExtras(), str)) {
                C1034h.m5550a().mo5698b(f4095W, String.format("Invalid request for %s, requires %s.", new Object[]{action, str}), new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                m5606f(intent, i, eVar);
            } else if ("ACTION_DELAY_MET".equals(action)) {
                m5603c(intent, i, eVar);
            } else if ("ACTION_STOP_WORK".equals(action)) {
                m5607g(intent, i, eVar);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                m5604d(intent, i, eVar);
            } else {
                C1034h.m5550a().mo5701e(f4095W, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    private static boolean m5598a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}
