package androidx.work.impl.p008l.p010f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1034h;

/* renamed from: androidx.work.impl.l.f.b */
/* compiled from: BatteryNotLowTracker */
public class C1089b extends C1090c<Boolean> {

    /* renamed from: h */
    private static final String f4244h = C1034h.m5551a("BatteryNotLowTracker");

    public C1089b(Context context) {
        super(context);
    }

    /* renamed from: d */
    public IntentFilter mo5821d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: a */
    public Boolean m5775a() {
        Intent registerReceiver = this.f4249a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            C1034h.m5550a().mo5698b(f4244h, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra == 0 && intExtra2 != 1 && intExtra3 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public void mo5820a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1034h.m5550a().mo5697a(f4244h, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            if (c == 0) {
                mo5826a(Boolean.valueOf(true));
            } else if (c == 1) {
                mo5826a(Boolean.valueOf(false));
            }
        }
    }
}
