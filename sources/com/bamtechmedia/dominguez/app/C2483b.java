package com.bamtechmedia.dominguez.app;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;
import androidx.lifecycle.C0722m;
import androidx.lifecycle.C0733v;
import androidx.work.WorkManager;
import com.bamtechmedia.dominguez.core.BuildInfo;
import com.bamtechmedia.dominguez.core.utils.C5837i;
import com.bamtechmedia.dominguez.core.utils.C5850n;
import java.io.File;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import p096e.p121h.p122j.C4025a;
import p163g.p500m.p501a.C11760v;

/* renamed from: com.bamtechmedia.dominguez.app.b */
/* compiled from: BaseApplicationModule */
public abstract class C2483b {
    /* renamed from: a */
    static Boolean m9101a() {
        return Boolean.valueOf(false);
    }

    /* renamed from: b */
    static C11760v m9105b() {
        return C2684x.f7431b.mo11722a();
    }

    /* renamed from: c */
    static C0722m m9107c() {
        return C0733v.m3782i();
    }

    /* renamed from: d */
    static WorkManager m9108d() {
        return WorkManager.m5490a();
    }

    /* renamed from: e */
    static boolean m9110e(Context context) {
        return C5837i.m18843e(context);
    }

    /* renamed from: f */
    static Resources m9111f(Context context) {
        return context.getResources();
    }

    /* renamed from: a */
    static BuildInfo m9100a(C2481a aVar) {
        return aVar.mo11593b();
    }

    /* renamed from: b */
    static ConnectivityManager m9104b(Context context) {
        return (ConnectivityManager) C4025a.m13792a(context, ConnectivityManager.class);
    }

    /* renamed from: c */
    static SharedPreferences m9106c(Context context) {
        return new C5850n(context, "default");
    }

    /* renamed from: d */
    static boolean m9109d(Context context) {
        return C5837i.m18842d(context);
    }

    /* renamed from: a */
    static OkHttpClient m9102a(Application application) {
        return new Builder().mo35817a(new Cache(new File(application.getCacheDir(), "http-cache"), 2097152)).mo35820a();
    }

    /* renamed from: b */
    static SharedPreferences m9103b(Application application) {
        return new C5850n(application, "DMGZ_DEBUG");
    }

    /* renamed from: a */
    static DisplayMetrics m9099a(Resources resources) {
        return resources.getDisplayMetrics();
    }

    /* renamed from: a */
    static ActivityManager m9098a(Context context) {
        return (ActivityManager) context.getSystemService("activity");
    }
}
