package androidx.core.app;

import android.app.ActivityManager;
import android.os.Build.VERSION;

/* renamed from: androidx.core.app.b */
/* compiled from: ActivityManagerCompat */
public final class C0465b {
    /* renamed from: a */
    public static boolean m2497a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return false;
    }
}
