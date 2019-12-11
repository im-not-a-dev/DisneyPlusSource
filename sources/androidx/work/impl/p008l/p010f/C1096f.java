package androidx.work.impl.p008l.p010f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1034h;

/* renamed from: androidx.work.impl.l.f.f */
/* compiled from: StorageNotLowTracker */
public class C1096f extends C1090c<Boolean> {

    /* renamed from: h */
    private static final String f4259h = C1034h.m5551a("StorageNotLowTracker");

    public C1096f(Context context) {
        super(context);
    }

    /* renamed from: d */
    public IntentFilter mo5821d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: a */
    public Boolean m5796a() {
        Intent registerReceiver = this.f4249a.registerReceiver(null, mo5821d());
        Boolean valueOf = Boolean.valueOf(true);
        if (!(registerReceiver == null || registerReceiver.getAction() == null)) {
            String action = registerReceiver.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    return null;
                }
                return Boolean.valueOf(false);
            }
        }
        return valueOf;
    }

    /* renamed from: a */
    public void mo5820a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1034h.m5550a().mo5697a(f4259h, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c == 0) {
                mo5826a(Boolean.valueOf(true));
            } else if (c == 1) {
                mo5826a(Boolean.valueOf(false));
            }
        }
    }
}
