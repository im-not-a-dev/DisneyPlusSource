package p096e.p121h.p122j;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import java.io.File;
import java.util.HashMap;

/* renamed from: e.h.j.a */
/* compiled from: ContextCompat */
public class C4025a {

    /* renamed from: a */
    private static final Object f10224a = new Object();

    /* renamed from: b */
    private static TypedValue f10225b;

    /* renamed from: e.h.j.a$a */
    /* compiled from: ContextCompat */
    private static final class C4026a {

        /* renamed from: a */
        static final HashMap<Class<?>, String> f10226a = new HashMap<>();

        static {
            if (VERSION.SDK_INT >= 22) {
                f10226a.put(SubscriptionManager.class, "telephony_subscription_service");
                f10226a.put(UsageStatsManager.class, "usagestats");
            }
            if (VERSION.SDK_INT >= 21) {
                f10226a.put(AppWidgetManager.class, "appwidget");
                f10226a.put(BatteryManager.class, "batterymanager");
                f10226a.put(CameraManager.class, "camera");
                f10226a.put(JobScheduler.class, "jobscheduler");
                f10226a.put(LauncherApps.class, "launcherapps");
                f10226a.put(MediaProjectionManager.class, "media_projection");
                f10226a.put(MediaSessionManager.class, "media_session");
                f10226a.put(RestrictionsManager.class, "restrictions");
                f10226a.put(TelecomManager.class, "telecom");
                f10226a.put(TvInputManager.class, "tv_input");
            }
            if (VERSION.SDK_INT >= 19) {
                f10226a.put(AppOpsManager.class, "appops");
                f10226a.put(CaptioningManager.class, "captioning");
                f10226a.put(ConsumerIrManager.class, "consumer_ir");
                f10226a.put(PrintManager.class, "print");
            }
            if (VERSION.SDK_INT >= 18) {
                f10226a.put(BluetoothManager.class, "bluetooth");
            }
            if (VERSION.SDK_INT >= 17) {
                f10226a.put(DisplayManager.class, "display");
                f10226a.put(UserManager.class, "user");
            }
            if (VERSION.SDK_INT >= 16) {
                f10226a.put(InputManager.class, "input");
                f10226a.put(MediaRouter.class, "media_router");
                f10226a.put(NsdManager.class, "servicediscovery");
            }
            f10226a.put(AccessibilityManager.class, "accessibility");
            f10226a.put(AccountManager.class, SubjectTokenTypes.ACCOUNT);
            f10226a.put(ActivityManager.class, "activity");
            f10226a.put(AlarmManager.class, "alarm");
            f10226a.put(AudioManager.class, "audio");
            f10226a.put(ClipboardManager.class, "clipboard");
            f10226a.put(ConnectivityManager.class, "connectivity");
            f10226a.put(DevicePolicyManager.class, "device_policy");
            f10226a.put(DownloadManager.class, "download");
            f10226a.put(DropBoxManager.class, "dropbox");
            f10226a.put(InputMethodManager.class, "input_method");
            f10226a.put(KeyguardManager.class, "keyguard");
            f10226a.put(LayoutInflater.class, "layout_inflater");
            f10226a.put(LocationManager.class, "location");
            f10226a.put(NfcManager.class, "nfc");
            f10226a.put(NotificationManager.class, "notification");
            f10226a.put(PowerManager.class, "power");
            f10226a.put(SearchManager.class, "search");
            f10226a.put(SensorManager.class, "sensor");
            f10226a.put(StorageManager.class, "storage");
            f10226a.put(TelephonyManager.class, "phone");
            f10226a.put(TextServicesManager.class, "textservices");
            f10226a.put(UiModeManager.class, "uimode");
            f10226a.put(UsbManager.class, "usb");
            f10226a.put(Vibrator.class, "vibrator");
            f10226a.put(WallpaperManager.class, "wallpaper");
            f10226a.put(WifiP2pManager.class, "wifip2p");
            f10226a.put(WifiManager.class, "wifi");
            f10226a.put(WindowManager.class, "window");
        }
    }

    /* renamed from: a */
    public static boolean m13794a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    /* renamed from: b */
    public static ColorStateList m13795b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: c */
    public static Drawable m13798c(Context context, int i) {
        int i2;
        int i3 = VERSION.SDK_INT;
        if (i3 >= 21) {
            return context.getDrawable(i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f10224a) {
            if (f10225b == null) {
                f10225b = new TypedValue();
            }
            context.getResources().getValue(i, f10225b, true);
            i2 = f10225b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: a */
    public static void m13793a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: b */
    public static File m13796b(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return m13791a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: a */
    public static int m13788a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    public static String m13797b(Context context, Class<?> cls) {
        if (VERSION.SDK_INT >= 23) {
            return context.getSystemServiceName(cls);
        }
        return (String) C4026a.f10226a.get(cls);
    }

    /* renamed from: a */
    public static int m13789a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m13791a(java.io.File r4) {
        /*
            java.lang.Class<e.h.j.a> r0 = p096e.p121h.p122j.C4025a.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r4
        L_0x0017:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r2.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x0036 }
            r2.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0036 }
            android.util.Log.w(r1, r4)     // Catch:{ all -> 0x0036 }
            r4 = 0
            monitor-exit(r0)
            return r4
        L_0x0034:
            monitor-exit(r0)
            return r4
        L_0x0036:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p121h.p122j.C4025a.m13791a(java.io.File):java.io.File");
    }

    /* renamed from: c */
    public static boolean m13799c(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    /* renamed from: a */
    public static Context m13790a(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    /* renamed from: a */
    public static <T> T m13792a(Context context, Class<T> cls) {
        if (VERSION.SDK_INT >= 23) {
            return context.getSystemService(cls);
        }
        String b = m13797b(context, cls);
        return b != null ? context.getSystemService(b) : null;
    }
}
