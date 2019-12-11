package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.C0727p;
import androidx.work.C1034h;
import androidx.work.impl.utils.C1158j;

public class SystemAlarmService extends C0727p implements C1048c {

    /* renamed from: V */
    private static final String f4092V = C1034h.m5551a("SystemAlarmService");

    /* renamed from: U */
    private C1045e f4093U;

    /* renamed from: c */
    public void mo5718c() {
        C1034h.m5550a().mo5697a(f4092V, "All commands completed in dispatcher", new Throwable[0]);
        C1158j.m5972a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        this.f4093U = new C1045e(this);
        this.f4093U.mo5727a((C1048c) this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4093U.mo5733e();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            this.f4093U.mo5729a(intent, i2);
        }
        return 3;
    }
}
