package p163g.p413f.p414a.p418s;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: g.f.a.s.e */
/* compiled from: ManifestParser */
public final class C10712e {

    /* renamed from: a */
    private final Context f25327a;

    public C10712e(Context context) {
        this.f25327a = context;
    }

    /* renamed from: a */
    public List<C10710c> mo27667a() {
        String str = "ManifestParser";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f25327a.getPackageManager().getApplicationInfo(this.f25327a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
                Log.v(str, sb.toString());
            }
            for (String str2 : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str2))) {
                    arrayList.add(m33701a(str2));
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(str2);
                        Log.d(str, sb2.toString());
                    }
                }
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Finished loading Glide modules");
            }
            return arrayList;
        } catch (NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    /* renamed from: a */
    private static C10710c m33701a(String str) {
        try {
            Class cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof C10710c) {
                    return (C10710c) newInstance;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected instanceof GlideModule, but found: ");
                sb.append(newInstance);
                throw new RuntimeException(sb.toString());
            } catch (InstantiationException e) {
                m33702a(cls, e);
                throw null;
            } catch (IllegalAccessException e2) {
                m33702a(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m33702a(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m33702a(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: a */
    private static void m33702a(Class<?> cls, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(cls);
        throw new RuntimeException(sb.toString(), exc);
    }
}
