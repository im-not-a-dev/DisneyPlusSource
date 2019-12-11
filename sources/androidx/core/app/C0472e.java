package androidx.core.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.e */
/* compiled from: BundleCompat */
public final class C0472e {

    /* renamed from: androidx.core.app.e$a */
    /* compiled from: BundleCompat */
    static class C0473a {

        /* renamed from: a */
        private static Method f2101a;

        /* renamed from: b */
        private static boolean f2102b;

        /* renamed from: c */
        private static Method f2103c;

        /* renamed from: d */
        private static boolean f2104d;

        /* renamed from: a */
        public static IBinder m2511a(Bundle bundle, String str) {
            String str2 = "BundleCompatBaseImpl";
            if (!f2102b) {
                try {
                    f2101a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2101a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve getIBinder method", e);
                }
                f2102b = true;
            }
            Method method = f2101a;
            if (method != null) {
                try {
                    return (IBinder) method.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke getIBinder via reflection", e2);
                    f2101a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m2512a(Bundle bundle, String str, IBinder iBinder) {
            String str2 = "BundleCompatBaseImpl";
            if (!f2104d) {
                try {
                    f2103c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2103c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve putIBinder method", e);
                }
                f2104d = true;
            }
            Method method = f2103c;
            if (method != null) {
                try {
                    method.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke putIBinder via reflection", e2);
                    f2103c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m2509a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0473a.m2511a(bundle, str);
    }

    /* renamed from: a */
    public static void m2510a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0473a.m2512a(bundle, str, iBinder);
        }
    }
}
