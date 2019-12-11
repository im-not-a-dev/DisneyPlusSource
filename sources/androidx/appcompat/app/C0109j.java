package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.j */
/* compiled from: ResourcesFlusher */
class C0109j {

    /* renamed from: a */
    private static Field f395a;

    /* renamed from: b */
    private static boolean f396b;

    /* renamed from: c */
    private static Class<?> f397c;

    /* renamed from: d */
    private static boolean f398d;

    /* renamed from: e */
    private static Field f399e;

    /* renamed from: f */
    private static boolean f400f;

    /* renamed from: g */
    private static Field f401g;

    /* renamed from: h */
    private static boolean f402h;

    /* renamed from: a */
    static void m631a(Resources resources) {
        int i = VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m635d(resources);
            } else if (i >= 23) {
                m634c(resources);
            } else if (i >= 21) {
                m633b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m633b(Resources resources) {
        Map map;
        String str = "ResourcesFlusher";
        if (!f396b) {
            try {
                f395a = Resources.class.getDeclaredField("mDrawableCache");
                f395a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f396b = true;
        }
        Field field = f395a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m634c(Resources resources) {
        String str = "ResourcesFlusher";
        if (!f396b) {
            try {
                f395a = Resources.class.getDeclaredField("mDrawableCache");
                f395a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f396b = true;
        }
        Object obj = null;
        Field field = f395a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m632a(obj);
        }
    }

    /* renamed from: d */
    private static void m635d(Resources resources) {
        Object obj;
        String str = "ResourcesFlusher";
        if (!f402h) {
            try {
                f401g = Resources.class.getDeclaredField("mResourcesImpl");
                f401g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f402h = true;
        }
        Field field = f401g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f396b) {
                    try {
                        f395a = obj.getClass().getDeclaredField("mDrawableCache");
                        f395a.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e(str, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f396b = true;
                }
                Field field2 = f395a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e(str, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m632a(obj2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m632a(Object obj) {
        LongSparseArray longSparseArray;
        String str = "ResourcesFlusher";
        if (!f398d) {
            try {
                f397c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(str, "Could not find ThemedResourceCache class", e);
            }
            f398d = true;
        }
        Class<?> cls = f397c;
        if (cls != null) {
            if (!f400f) {
                try {
                    f399e = cls.getDeclaredField("mUnthemedEntries");
                    f399e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(str, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f400f = true;
            }
            Field field = f399e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(str, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
