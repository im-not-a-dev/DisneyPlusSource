package androidx.work.impl.p008l.p010f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import androidx.work.C1034h;

/* renamed from: androidx.work.impl.l.f.a */
/* compiled from: BatteryChargingTracker */
public class C1088a extends C1090c<Boolean> {

    /* renamed from: h */
    private static final String f4243h = C1034h.m5551a("BatteryChrgTracker");

    public C1088a(Context context) {
        super(context);
    }

    /* renamed from: d */
    public IntentFilter mo5821d() {
        IntentFilter intentFilter = new IntentFilter();
        if (VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* renamed from: a */
    public Boolean m5771a() {
        Intent registerReceiver = this.f4249a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m5769a(registerReceiver));
        }
        C1034h.m5550a().mo5698b(f4243h, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    /* renamed from: a */
    public void mo5820a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            C1034h.m5550a().mo5697a(f4243h, String.format("Received %s", new Object[]{action}), new Throwable[0]);
            char c = 65535;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        c = 1;
                        break;
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                mo5826a(Boolean.valueOf(true));
            } else if (c == 1) {
                mo5826a(Boolean.valueOf(false));
            } else if (c == 2) {
                mo5826a(Boolean.valueOf(true));
            } else if (c == 3) {
                mo5826a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    private boolean m5769a(Intent intent) {
        if (VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }
}
