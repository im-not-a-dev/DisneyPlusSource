package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.google.android.gms.common.internal.C9908u;
import com.google.android.gms.common.internal.C9915x0;
import com.google.android.gms.common.p400p.C9931c;
import com.google.android.gms.common.util.C9945i;
import com.google.android.gms.common.util.C9948l;
import com.google.android.gms.common.util.C9951o;
import com.google.android.gms.common.util.C9956q;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.i */
public class C9832i {
    @Deprecated

    /* renamed from: a */
    public static final int f23040a = 12451000;

    /* renamed from: b */
    private static boolean f23041b = false;

    /* renamed from: c */
    private static boolean f23042c = false;

    /* renamed from: d */
    static final AtomicBoolean f23043d = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f23044e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static String m30625a(int i) {
        return C9820b.m30590f(i);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m30630b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m30631b(Context context, int i) {
        return C9951o.m31001a(context, i);
    }

    /* renamed from: c */
    public static Context m30632c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Resources m30634d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m30635e(Context context) {
        if (!f23042c) {
            try {
                PackageInfo b = C9931c.m30956a(context).mo25464b("com.google.android.gms", 64);
                C9923j.m30933a(context);
                if (b == null || C9923j.m30935a(b, false) || !C9923j.m30935a(b, true)) {
                    f23041b = false;
                } else {
                    f23041b = true;
                }
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                f23042c = true;
            }
        }
        return f23041b || !C9945i.m30981a();
    }

    @TargetApi(18)
    /* renamed from: f */
    public static boolean m30636f(Context context) {
        if (C9948l.m30991d()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null) {
                if ("true".equals(applicationRestrictions.getString("restricted_profile"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public static int m30623a(Context context, int i) {
        try {
            context.getResources().getString(C9924k.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f23044e.get()) {
            int b = C9915x0.m30885b(context);
            if (b != 0) {
                int i2 = f23040a;
                if (b != i2) {
                    StringBuilder sb = new StringBuilder(320);
                    sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                    sb.append(i2);
                    sb.append(" but found ");
                    sb.append(b);
                    sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        return m30624a(context, !C9945i.m30984c(context) && !C9945i.m30985d(context), i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m30629b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m30633c(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m30628a(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: a */
    private static int m30624a(Context context, boolean z, int i) {
        String str = "com.google.android.gms";
        C9908u.m30860a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        String str2 = "GooglePlayServicesUtil";
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException unused) {
                Log.w(str2, "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(str, 64);
            C9923j.m30933a(context);
            if (!C9923j.m30935a(packageInfo2, true)) {
                Log.w(str2, "Google Play services signature invalid.");
                return 9;
            } else if (z && (!C9923j.m30935a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w(str2, "Google Play Store signature invalid.");
                return 9;
            } else if (C9956q.m31003a(packageInfo2.versionCode) < C9956q.m31003a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w(str2, sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo(str, 0);
                    } catch (NameNotFoundException e) {
                        Log.wtf(str2, "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                if (!applicationInfo.enabled) {
                    return 3;
                }
                return 0;
            }
        } catch (NameNotFoundException unused2) {
            Log.w(str2, "Google Play services is missing.");
            return 1;
        }
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: a */
    public static boolean m30627a(Context context, int i, String str) {
        return C9951o.m31002a(context, i, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m30626a(Context context) {
        if (!f23043d.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    static boolean m30628a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C9948l.m30994g()) {
            try {
                for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, ContentServiceClientExtras.URL_SIZE_LIMIT);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m30636f(context);
        } catch (NameNotFoundException unused2) {
        }
    }
}
