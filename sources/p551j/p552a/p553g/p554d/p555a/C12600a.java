package p551j.p552a.p553g.p554d.p555a;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bamtech.sdk4.internal.configuration.SubjectTokenTypes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import p520io.sentry.event.C12562b;
import p520io.sentry.event.p549e.C12570c;
import p520io.sentry.event.p550f.C12574a;
import p520io.sentry.event.p550f.C12574a.C12575a;
import p520io.sentry.event.p550f.C12582h;
import p520io.sentry.event.p550f.C12585k;
import p551j.p552a.p569r.C12677b;

/* renamed from: j.a.g.d.a.a */
/* compiled from: AndroidEventBuilderHelper */
public class C12600a implements C12570c {

    /* renamed from: b */
    public static final String f29232b = "j.a.g.d.a.a";

    /* renamed from: c */
    private static final Boolean f29233c = m39583h();

    /* renamed from: d */
    private static final String f29234d = m39574c();

    /* renamed from: e */
    private static String[] f29235e = null;

    /* renamed from: a */
    private Context f29236a;

    public C12600a(Context context) {
        this.f29236a = context;
    }

    /* renamed from: b */
    protected static String m39572b() {
        try {
            return Build.MODEL.split(" ")[0];
        } catch (Exception e) {
            Log.e(f29232b, "Error getting device family.", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041 A[SYNTHETIC, Splitter:B:22:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e A[SYNTHETIC, Splitter:B:28:0x004e] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String m39574c() {
        /*
            java.lang.String r0 = "Exception while attempting to read kernel information"
            java.lang.String r1 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0039 }
            java.lang.String r4 = "/proc/version"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0039 }
            boolean r4 = r3.canRead()     // Catch:{ Exception -> 0x0039 }
            if (r4 != 0) goto L_0x0017
            return r1
        L_0x0017:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0039 }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ Exception -> 0x0039 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0039 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = r4.readLine()     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r4.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x002f
        L_0x0029:
            r2 = move-exception
            java.lang.String r3 = f29232b
            android.util.Log.e(r3, r0, r2)
        L_0x002f:
            return r1
        L_0x0030:
            r1 = move-exception
            r2 = r4
            goto L_0x004c
        L_0x0033:
            r2 = move-exception
            r3 = r2
            r2 = r4
            goto L_0x003a
        L_0x0037:
            r1 = move-exception
            goto L_0x004c
        L_0x0039:
            r3 = move-exception
        L_0x003a:
            java.lang.String r4 = f29232b     // Catch:{ all -> 0x0037 }
            android.util.Log.e(r4, r0, r3)     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r2 = move-exception
            java.lang.String r3 = f29232b
            android.util.Log.e(r3, r0, r2)
        L_0x004b:
            return r1
        L_0x004c:
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r2 = move-exception
            java.lang.String r3 = f29232b
            android.util.Log.e(r3, r0, r2)
        L_0x0058:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p551j.p552a.p553g.p554d.p555a.C12600a.m39574c():java.lang.String");
    }

    /* renamed from: d */
    protected static MemoryInfo m39575d(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            MemoryInfo memoryInfo = new MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception e) {
            Log.e(f29232b, "Error getting MemoryInfo.", e);
            return null;
        }
    }

    /* renamed from: e */
    protected static String m39578e(Context context) {
        String str = null;
        try {
            int i = context.getResources().getConfiguration().orientation;
            if (i == 1) {
                str = "portrait";
            } else if (i == 2) {
                str = "landscape";
            }
            return str;
        } catch (Exception e) {
            Log.e(f29232b, "Error getting device orientation.", e);
            return null;
        }
    }

    /* renamed from: f */
    protected static PackageInfo m39579f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException e) {
            Log.e(f29232b, "Error getting package info.", e);
            return null;
        }
    }

    /* renamed from: g */
    protected static String[] m39582g(Context context) {
        String[] strArr = f29235e;
        if (strArr != null) {
            return strArr;
        }
        String[] strArr2 = new String[0];
        try {
            InputStream open = context.getAssets().open("sentry-debug-meta.properties");
            Properties properties = new Properties();
            properties.load(open);
            open.close();
            String property = properties.getProperty("io.sentry.ProguardUuids");
            if (!C12677b.m39771a(property)) {
                strArr2 = property.split("\\|");
            }
        } catch (FileNotFoundException unused) {
            Log.d(f29232b, "Proguard UUIDs file not found.");
        } catch (Exception e) {
            Log.e(f29232b, "Error getting Proguard UUIDs.", e);
        }
        f29235e = strArr2;
        return strArr2;
    }

    /* renamed from: h */
    protected static Boolean m39583h() {
        boolean z;
        String str = "google_sdk";
        String str2 = "generic";
        try {
            if (!Build.FINGERPRINT.startsWith(str2) && !Build.FINGERPRINT.startsWith("unknown") && !Build.MODEL.contains(str) && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && (!Build.BRAND.startsWith(str2) || !Build.DEVICE.startsWith(str2))) {
                if (!str.equals(Build.PRODUCT)) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Exception e) {
            Log.e(f29232b, "Error checking whether application is running in an emulator.", e);
            return null;
        }
    }

    /* renamed from: i */
    protected static boolean m39585i() {
        return Environment.getExternalStorageState().equals("mounted") && !Environment.isExternalStorageEmulated();
    }

    /* renamed from: j */
    protected static Boolean m39587j() {
        String str = Build.TAGS;
        Boolean valueOf = Boolean.valueOf(true);
        if (str != null && str.contains("test-keys")) {
            return valueOf;
        }
        String[] strArr = {"/data/local/bin/su", "/data/local/su", "/data/local/xbin/su", "/sbin/su", "/su/bin", "/su/bin/su", "/system/app/SuperSU", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/Superuser.apk", "/system/bin/failsafe/su", "/system/bin/su", "/system/sd/xbin/su", "/system/xbin/daemonsu", "/system/xbin/su"};
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                if (new File(strArr[i]).exists()) {
                    return valueOf;
                }
                i++;
            } catch (Exception e) {
                Log.e(f29232b, "Exception while attempting to detect whether the device is rooted", e);
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public void mo30761a(C12562b bVar) {
        bVar.mo30750e("android");
        PackageInfo f = m39579f(this.f29236a);
        if (f != null) {
            if (bVar.mo30746b().getRelease() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(f.packageName);
                sb.append("-");
                sb.append(f.versionName);
                bVar.mo30749d(sb.toString());
            }
            if (bVar.mo30746b().getDist() == null) {
                bVar.mo30741a(Integer.toString(f.versionCode));
            }
        }
        String string = Secure.getString(this.f29236a.getContentResolver(), "android_id");
        if (string != null && !string.trim().equals("")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("android:");
            sb2.append(string);
            bVar.mo30740a((C12582h) new C12585k(sb2.toString(), null, null, null), false);
        }
        String[] g = m39582g(this.f29236a);
        if (g != null && g.length > 0) {
            C12574a aVar = new C12574a();
            for (String aVar2 : g) {
                aVar.mo30765a(new C12575a(aVar2));
            }
            bVar.mo30739a((C12582h) aVar);
        }
        bVar.mo30745a(mo30912a());
    }

    /* renamed from: i */
    protected static boolean m39586i(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    protected static Float m39571b(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return null;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra != -1) {
                if (intExtra2 != -1) {
                    return Float.valueOf((((float) intExtra) / ((float) intExtra2)) * 100.0f);
                }
            }
            return null;
        } catch (Exception e) {
            Log.e(f29232b, "Error getting device battery level.", e);
            return null;
        }
    }

    /* renamed from: e */
    protected static Long m39577e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Exception e) {
            Log.e(f29232b, "Error getting total internal storage amount.", e);
            return null;
        }
    }

    /* renamed from: f */
    protected static Long m39580f() {
        try {
            if (m39585i()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return Long.valueOf(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
            }
        } catch (Exception e) {
            Log.e(f29232b, "Error getting unused external storage amount.", e);
        }
        return null;
    }

    /* renamed from: h */
    protected static Boolean m39584h(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return null;
            }
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1) {
                if (intExtra != 2) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        } catch (Exception e) {
            Log.e(f29232b, "Error getting device charging state.", e);
            return null;
        }
    }

    /* renamed from: d */
    protected static Long m39576d() {
        try {
            if (m39585i()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return Long.valueOf(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
            }
        } catch (Exception e) {
            Log.e(f29232b, "Error getting total external storage amount.", e);
        }
        return null;
    }

    /* renamed from: g */
    protected static Long m39581g() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        } catch (Exception e) {
            Log.e(f29232b, "Error getting unused internal storage amount.", e);
            return null;
        }
    }

    /* renamed from: c */
    protected static DisplayMetrics m39573c(Context context) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Exception e) {
            Log.e(f29232b, "Error getting DisplayMetrics.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, Map<String, Object>> mo30912a() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        hashMap.put("os", hashMap3);
        hashMap.put(SubjectTokenTypes.DEVICE, hashMap2);
        hashMap.put("app", hashMap4);
        hashMap2.put("manufacturer", Build.MANUFACTURER);
        hashMap2.put("brand", Build.BRAND);
        hashMap2.put("model", Build.MODEL);
        hashMap2.put("family", m39572b());
        hashMap2.put("model_id", Build.ID);
        hashMap2.put("battery_level", m39571b(this.f29236a));
        hashMap2.put("orientation", m39578e(this.f29236a));
        hashMap2.put("simulator", f29233c);
        hashMap2.put("arch", Build.CPU_ABI);
        hashMap2.put("storage_size", m39577e());
        hashMap2.put("free_storage", m39581g());
        hashMap2.put("external_storage_size", m39576d());
        hashMap2.put("external_free_storage", m39580f());
        hashMap2.put("charging", m39584h(this.f29236a));
        hashMap2.put("online", Boolean.valueOf(m39586i(this.f29236a)));
        DisplayMetrics c = m39573c(this.f29236a);
        if (c != null) {
            int max = Math.max(c.widthPixels, c.heightPixels);
            int min = Math.min(c.widthPixels, c.heightPixels);
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(max));
            sb.append("x");
            sb.append(Integer.toString(min));
            hashMap2.put("screen_resolution", sb.toString());
            hashMap2.put("screen_density", Float.valueOf(c.density));
            hashMap2.put("screen_dpi", Integer.valueOf(c.densityDpi));
        }
        MemoryInfo d = m39575d(this.f29236a);
        if (d != null) {
            hashMap2.put("free_memory", Long.valueOf(d.availMem));
            if (VERSION.SDK_INT >= 16) {
                hashMap2.put("memory_size", Long.valueOf(d.totalMem));
            }
            hashMap2.put("low_memory", Boolean.valueOf(d.lowMemory));
        }
        hashMap3.put("name", "Android");
        hashMap3.put("version", VERSION.RELEASE);
        hashMap3.put("build", Build.DISPLAY);
        hashMap3.put("kernel_version", f29234d);
        hashMap3.put("rooted", m39587j());
        PackageInfo f = m39579f(this.f29236a);
        if (f != null) {
            hashMap4.put("app_version", f.versionName);
            hashMap4.put("app_build", Integer.valueOf(f.versionCode));
            hashMap4.put("app_identifier", f.packageName);
        }
        hashMap4.put("app_name", m39569a(this.f29236a));
        hashMap4.put("app_start_time", m39570a(new Date()));
        return hashMap;
    }

    /* renamed from: a */
    protected static String m39570a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH).format(date);
    }

    /* renamed from: a */
    protected static String m39569a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            if (applicationInfo.nonLocalizedLabel != null) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return null;
        } catch (Exception e) {
            Log.e(f29232b, "Error getting application name.", e);
        }
    }
}
