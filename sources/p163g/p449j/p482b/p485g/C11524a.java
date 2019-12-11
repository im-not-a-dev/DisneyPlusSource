package p163g.p449j.p482b.p485g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import java.util.concurrent.atomic.AtomicBoolean;
import p096e.p121h.p122j.C4025a;
import p163g.p449j.p482b.p483e.C11521c;

/* renamed from: g.j.b.g.a */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public class C11524a {

    /* renamed from: a */
    private final Context f26934a;

    /* renamed from: b */
    private final SharedPreferences f26935b;

    /* renamed from: c */
    private final AtomicBoolean f26936c = new AtomicBoolean(m37154b());

    public C11524a(Context context, String str, C11521c cVar) {
        this.f26934a = m37153a(context);
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        this.f26935b = context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: a */
    private static Context m37153a(Context context) {
        return (VERSION.SDK_INT < 24 || C4025a.m13799c(context)) ? context : C4025a.m13790a(context);
    }

    /* renamed from: b */
    private boolean m37154b() {
        String str = "firebase_data_collection_default_enabled";
        if (this.f26935b.contains(str)) {
            return this.f26935b.getBoolean(str, true);
        }
        try {
            PackageManager packageManager = this.f26934a.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f26934a.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo29450a() {
        return this.f26936c.get();
    }
}
