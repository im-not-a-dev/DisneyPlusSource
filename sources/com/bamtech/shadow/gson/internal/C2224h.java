package com.bamtech.shadow.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bamtech.shadow.gson.internal.h */
/* compiled from: Primitives */
public final class C2224h {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f6326a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m8571a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m8571a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m8571a(hashMap, hashMap2, Character.TYPE, Character.class);
        m8571a(hashMap, hashMap2, Double.TYPE, Double.class);
        m8571a(hashMap, hashMap2, Float.TYPE, Float.class);
        m8571a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m8571a(hashMap, hashMap2, Long.TYPE, Long.class);
        m8571a(hashMap, hashMap2, Short.TYPE, Short.class);
        m8571a(hashMap, hashMap2, Void.TYPE, Void.class);
        f6326a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m8571a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m8572a(Type type) {
        return f6326a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m8570a(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f6326a;
        C2135a.m8282a(cls);
        Class cls2 = (Class) map.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
