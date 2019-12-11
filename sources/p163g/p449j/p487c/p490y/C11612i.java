package p163g.p449j.p487c.p490y;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.j.c.y.i */
/* compiled from: Primitives */
public final class C11612i {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f27084a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m37399a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m37399a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m37399a(hashMap, hashMap2, Character.TYPE, Character.class);
        m37399a(hashMap, hashMap2, Double.TYPE, Double.class);
        m37399a(hashMap, hashMap2, Float.TYPE, Float.class);
        m37399a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m37399a(hashMap, hashMap2, Long.TYPE, Long.class);
        m37399a(hashMap, hashMap2, Short.TYPE, Short.class);
        m37399a(hashMap, hashMap2, Void.TYPE, Void.class);
        f27084a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m37399a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m37400a(Type type) {
        return f27084a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m37398a(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f27084a;
        C11579a.m37329a(cls);
        Class cls2 = (Class) map.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
