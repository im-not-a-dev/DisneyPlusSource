package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1027c;
import androidx.work.C1034h;
import androidx.work.C1036i;
import androidx.work.impl.p011m.C1111j;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4089a = C1034h.m5551a("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m5588a(Context context, List<C1111j> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C1111j jVar : list) {
            C1027c cVar = jVar.f4289j;
            z |= cVar.mo5677f();
            z2 |= cVar.mo5678g();
            z3 |= cVar.mo5681i();
            z4 |= cVar.mo5668b() != C1036i.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m5589a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C1034h.m5550a().mo5697a(f4089a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C1042b.m5595a(context));
    }
}
