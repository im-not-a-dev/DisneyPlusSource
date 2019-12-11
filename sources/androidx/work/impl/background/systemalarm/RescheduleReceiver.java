package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.C1034h;
import androidx.work.impl.C1068h;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4091a = C1034h.m5551a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C1034h.m5550a().mo5697a(f4091a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (VERSION.SDK_INT >= 23) {
            C1068h a = C1068h.m5674a();
            if (a == null) {
                C1034h.m5550a().mo5698b(f4091a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
                return;
            }
            a.mo5770a(goAsync());
            return;
        }
        context.startService(C1042b.m5599b(context));
    }
}
