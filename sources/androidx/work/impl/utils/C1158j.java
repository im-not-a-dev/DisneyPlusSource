package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import androidx.work.C1034h;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: androidx.work.impl.utils.j */
/* compiled from: WakeLocks */
public class C1158j {

    /* renamed from: a */
    private static final String f4380a = C1034h.m5551a("WakeLocks");

    /* renamed from: b */
    private static final WeakHashMap<WakeLock, String> f4381b = new WeakHashMap<>();

    /* renamed from: a */
    public static WakeLock m5971a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        StringBuilder sb = new StringBuilder();
        sb.append("WorkManager: ");
        sb.append(str);
        String sb2 = sb.toString();
        WakeLock newWakeLock = powerManager.newWakeLock(1, sb2);
        synchronized (f4381b) {
            f4381b.put(newWakeLock, sb2);
        }
        return newWakeLock;
    }

    /* renamed from: a */
    public static void m5972a() {
        HashMap hashMap = new HashMap();
        synchronized (f4381b) {
            hashMap.putAll(f4381b);
        }
        for (WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                C1034h.m5550a().mo5701e(f4380a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }
}
