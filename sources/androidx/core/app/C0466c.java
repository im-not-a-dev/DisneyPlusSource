package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.c */
/* compiled from: ActivityRecreator */
final class C0466c {

    /* renamed from: a */
    protected static final Class<?> f2083a = m2498a();

    /* renamed from: b */
    protected static final Field f2084b = m2502b();

    /* renamed from: c */
    protected static final Field f2085c = m2504c();

    /* renamed from: d */
    protected static final Method f2086d = m2503b(f2083a);

    /* renamed from: e */
    protected static final Method f2087e = m2499a(f2083a);

    /* renamed from: f */
    protected static final Method f2088f = m2505c(f2083a);

    /* renamed from: g */
    private static final Handler f2089g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.c$a */
    /* compiled from: ActivityRecreator */
    static class C0467a implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Object f2090U;

        /* renamed from: c */
        final /* synthetic */ C0470d f2091c;

        C0467a(C0470d dVar, Object obj) {
            this.f2091c = dVar;
            this.f2090U = obj;
        }

        public void run() {
            this.f2091c.f2100c = this.f2090U;
        }
    }

    /* renamed from: androidx.core.app.c$b */
    /* compiled from: ActivityRecreator */
    static class C0468b implements Runnable {

        /* renamed from: U */
        final /* synthetic */ C0470d f2092U;

        /* renamed from: c */
        final /* synthetic */ Application f2093c;

        C0468b(Application application, C0470d dVar) {
            this.f2093c = application;
            this.f2092U = dVar;
        }

        public void run() {
            this.f2093c.unregisterActivityLifecycleCallbacks(this.f2092U);
        }
    }

    /* renamed from: androidx.core.app.c$c */
    /* compiled from: ActivityRecreator */
    static class C0469c implements Runnable {

        /* renamed from: U */
        final /* synthetic */ Object f2094U;

        /* renamed from: c */
        final /* synthetic */ Object f2095c;

        C0469c(Object obj, Object obj2) {
            this.f2095c = obj;
            this.f2094U = obj2;
        }

        public void run() {
            try {
                if (C0466c.f2086d != null) {
                    C0466c.f2086d.invoke(this.f2095c, new Object[]{this.f2094U, Boolean.valueOf(false), "AppCompat recreation"});
                    return;
                }
                C0466c.f2087e.invoke(this.f2095c, new Object[]{this.f2094U, Boolean.valueOf(false)});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.c$d */
    /* compiled from: ActivityRecreator */
    private static final class C0470d implements ActivityLifecycleCallbacks {

        /* renamed from: U */
        private Activity f2096U;

        /* renamed from: V */
        private boolean f2097V = false;

        /* renamed from: W */
        private boolean f2098W = false;

        /* renamed from: X */
        private boolean f2099X = false;

        /* renamed from: c */
        Object f2100c;

        C0470d(Activity activity) {
            this.f2096U = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2096U == activity) {
                this.f2096U = null;
                this.f2098W = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2098W && !this.f2099X && !this.f2097V && C0466c.m2501a(this.f2100c, activity)) {
                this.f2099X = true;
                this.f2100c = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2096U == activity) {
                this.f2097V = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static boolean m2500a(Activity activity) {
        Application application;
        C0470d dVar;
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2506d() && f2088f == null) {
            return false;
        } else {
            if (f2087e == null && f2086d == null) {
                return false;
            }
            try {
                Object obj = f2085c.get(activity);
                if (obj == null) {
                    return false;
                }
                Object obj2 = f2084b.get(activity);
                if (obj2 == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0470d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f2089g.post(new C0467a(dVar, obj));
                if (m2506d()) {
                    f2088f.invoke(obj2, new Object[]{obj, null, null, Integer.valueOf(0), Boolean.valueOf(false), null, null, Boolean.valueOf(false), Boolean.valueOf(false)});
                } else {
                    activity.recreate();
                }
                f2089g.post(new C0468b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: b */
    private static Method m2503b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2505c(Class<?> cls) {
        if (m2506d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m2506d() {
        int i = VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: b */
    private static Field m2502b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m2504c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static boolean m2501a(Object obj, Activity activity) {
        try {
            Object obj2 = f2085c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f2089g.postAtFrontOfQueue(new C0469c(f2084b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: a */
    private static Method m2499a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Class<?> m2498a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }
}
