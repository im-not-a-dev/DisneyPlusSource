package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1034h;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import androidx.work.impl.utils.C1137d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4090a = C1034h.m5551a("ConstrntProxyUpdtRecvr");

    /* renamed from: a */
    public static Intent m5589a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C1034h.m5550a().mo5697a(f4090a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
        boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
        boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
        C1034h.m5550a().mo5697a(f4090a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
        C1137d.m5916a(context, BatteryNotLowProxy.class, booleanExtra);
        C1137d.m5916a(context, BatteryChargingProxy.class, booleanExtra2);
        C1137d.m5916a(context, StorageNotLowProxy.class, booleanExtra3);
        C1137d.m5916a(context, NetworkStateProxy.class, booleanExtra4);
    }
}
