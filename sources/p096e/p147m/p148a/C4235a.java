package p096e.p147m.p148a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: e.m.a.a */
/* compiled from: WakefulBroadcastReceiver */
public abstract class C4235a extends BroadcastReceiver {

    /* renamed from: U */
    private static int f10563U = 1;

    /* renamed from: c */
    private static final SparseArray<WakeLock> f10564c = new SparseArray<>();

    /* renamed from: a */
    public static boolean m14565a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f10564c) {
            WakeLock wakeLock = (WakeLock) f10564c.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f10564c.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }

    /* renamed from: b */
    public static ComponentName m14566b(Context context, Intent intent) {
        synchronized (f10564c) {
            int i = f10563U;
            f10563U++;
            if (f10563U <= 0) {
                f10563U = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f10564c.put(i, newWakeLock);
            return startService;
        }
    }
}
