package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.C1034h;
import androidx.work.impl.C1060d;
import androidx.work.impl.p011m.C1111j;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* compiled from: SystemAlarmScheduler */
public class C1050f implements C1060d {

    /* renamed from: U */
    private static final String f4129U = C1034h.m5551a("SystemAlarmScheduler");

    /* renamed from: c */
    private final Context f4130c;

    public C1050f(Context context) {
        this.f4130c = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo5738a(C1111j... jVarArr) {
        for (C1111j a : jVarArr) {
            m5632a(a);
        }
    }

    /* renamed from: a */
    public void mo5737a(String str) {
        this.f4130c.startService(C1042b.m5602c(this.f4130c, str));
    }

    /* renamed from: a */
    private void m5632a(C1111j jVar) {
        C1034h.m5550a().mo5697a(f4129U, String.format("Scheduling work with workSpecId %s", new Object[]{jVar.f4280a}), new Throwable[0]);
        this.f4130c.startService(C1042b.m5600b(this.f4130c, jVar.f4280a));
    }
}
