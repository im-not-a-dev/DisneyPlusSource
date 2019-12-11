package com.bamtech.shadow.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.bamtech.shadow.gson.internal.j */
/* compiled from: UnsafeAllocator */
public abstract class C2228j {

    /* renamed from: com.bamtech.shadow.gson.internal.j$a */
    /* compiled from: UnsafeAllocator */
    static class C2229a extends C2228j {

        /* renamed from: a */
        final /* synthetic */ Method f6330a;

        /* renamed from: b */
        final /* synthetic */ Object f6331b;

        C2229a(Method method, Object obj) {
            this.f6330a = method;
            this.f6331b = obj;
        }

        /* renamed from: a */
        public <T> T mo11254a(Class<T> cls) throws Exception {
            C2228j.m8577b(cls);
            return this.f6330a.invoke(this.f6331b, new Object[]{cls});
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.j$b */
    /* compiled from: UnsafeAllocator */
    static class C2230b extends C2228j {

        /* renamed from: a */
        final /* synthetic */ Method f6332a;

        /* renamed from: b */
        final /* synthetic */ int f6333b;

        C2230b(Method method, int i) {
            this.f6332a = method;
            this.f6333b = i;
        }

        /* renamed from: a */
        public <T> T mo11254a(Class<T> cls) throws Exception {
            C2228j.m8577b(cls);
            return this.f6332a.invoke(null, new Object[]{cls, Integer.valueOf(this.f6333b)});
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.j$c */
    /* compiled from: UnsafeAllocator */
    static class C2231c extends C2228j {

        /* renamed from: a */
        final /* synthetic */ Method f6334a;

        C2231c(Method method) {
            this.f6334a = method;
        }

        /* renamed from: a */
        public <T> T mo11254a(Class<T> cls) throws Exception {
            C2228j.m8577b(cls);
            return this.f6334a.invoke(null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.bamtech.shadow.gson.internal.j$d */
    /* compiled from: UnsafeAllocator */
    static class C2232d extends C2228j {
        C2232d() {
        }

        /* renamed from: a */
        public <T> T mo11254a(Class<T> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot allocate ");
            sb.append(cls);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: a */
    public static C2228j m8576a() {
        String str = "newInstance";
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C2229a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(str, new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C2230b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(str, new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C2231c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C2232d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m8577b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    /* renamed from: a */
    public abstract <T> T mo11254a(Class<T> cls) throws Exception;
}
