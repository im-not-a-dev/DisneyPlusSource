package androidx.fragment.app;

import androidx.fragment.app.Fragment.C0523e;
import java.lang.reflect.InvocationTargetException;
import p096e.p113e.C3941i;

/* renamed from: androidx.fragment.app.g */
/* compiled from: FragmentFactory */
public class C0536g {

    /* renamed from: a */
    private static final C3941i<String, Class<?>> f2338a = new C3941i<>();

    /* renamed from: b */
    static boolean m2861b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2862c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m2862c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        Class<?> cls = (Class) f2338a.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f2338a.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m2863d(ClassLoader classLoader, String str) {
        String str2 = "Unable to instantiate fragment ";
        try {
            return m2862c(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new C0523e(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new C0523e(sb2.toString(), e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3141a(ClassLoader classLoader, String str) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            return (Fragment) m2863d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str2);
            throw new C0523e(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new C0523e(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new C0523e(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new C0523e(sb4.toString(), e4);
        }
    }
}
