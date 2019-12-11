package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.q */
/* compiled from: Lifecycling */
public class C0728q {

    /* renamed from: a */
    private static Map<Class, Integer> f3012a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0713g>>> f3013b = new HashMap();

    /* renamed from: a */
    static C0720k m3771a(Object obj) {
        boolean z = obj instanceof C0720k;
        boolean z2 = obj instanceof C0712f;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0712f) obj, (C0720k) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0712f) obj, null);
        }
        if (z) {
            return (C0720k) obj;
        }
        Class cls = obj.getClass();
        if (m3774b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f3013b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m3770a((Constructor) list.get(0), obj));
        }
        C0713g[] gVarArr = new C0713g[list.size()];
        for (int i = 0; i < list.size(); i++) {
            gVarArr[i] = m3770a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(gVarArr);
    }

    /* renamed from: b */
    private static int m3774b(Class<?> cls) {
        Integer num = (Integer) f3012a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int d = m3776d(cls);
        f3012a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m3775c(Class<?> cls) {
        return cls != null && C0721l.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m3776d(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m3773a(cls);
        if (a != null) {
            f3013b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0704b.f2985c.mo4113b(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m3775c(superclass)) {
                if (m3774b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f3013b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m3775c(cls2)) {
                    if (m3774b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f3013b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3013b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static C0713g m3770a(Constructor<? extends C0713g> constructor, Object obj) {
        try {
            return (C0713g) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0713g> m3773a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m3772a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C0713g> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m3772a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
