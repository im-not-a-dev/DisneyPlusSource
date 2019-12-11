package p163g.p449j.p487c.p490y;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: g.j.c.y.k */
/* compiled from: UnsafeAllocator */
public abstract class C11616k {

    /* renamed from: g.j.c.y.k$a */
    /* compiled from: UnsafeAllocator */
    static class C11617a extends C11616k {

        /* renamed from: a */
        final /* synthetic */ Method f27088a;

        /* renamed from: b */
        final /* synthetic */ Object f27089b;

        C11617a(Method method, Object obj) {
            this.f27088a = method;
            this.f27089b = obj;
        }

        /* renamed from: a */
        public <T> T mo29649a(Class<T> cls) throws Exception {
            C11616k.m37405b(cls);
            return this.f27088a.invoke(this.f27089b, new Object[]{cls});
        }
    }

    /* renamed from: g.j.c.y.k$b */
    /* compiled from: UnsafeAllocator */
    static class C11618b extends C11616k {

        /* renamed from: a */
        final /* synthetic */ Method f27090a;

        /* renamed from: b */
        final /* synthetic */ int f27091b;

        C11618b(Method method, int i) {
            this.f27090a = method;
            this.f27091b = i;
        }

        /* renamed from: a */
        public <T> T mo29649a(Class<T> cls) throws Exception {
            C11616k.m37405b(cls);
            return this.f27090a.invoke(null, new Object[]{cls, Integer.valueOf(this.f27091b)});
        }
    }

    /* renamed from: g.j.c.y.k$c */
    /* compiled from: UnsafeAllocator */
    static class C11619c extends C11616k {

        /* renamed from: a */
        final /* synthetic */ Method f27092a;

        C11619c(Method method) {
            this.f27092a = method;
        }

        /* renamed from: a */
        public <T> T mo29649a(Class<T> cls) throws Exception {
            C11616k.m37405b(cls);
            return this.f27092a.invoke(null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: g.j.c.y.k$d */
    /* compiled from: UnsafeAllocator */
    static class C11620d extends C11616k {
        C11620d() {
        }

        /* renamed from: a */
        public <T> T mo29649a(Class<T> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot allocate ");
            sb.append(cls);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* renamed from: a */
    public static C11616k m37404a() {
        String str = "newInstance";
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C11617a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get(null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(str, new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C11618b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(str, new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C11619c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C11620d();
                }
            }
        }
    }

    /* renamed from: b */
    static void m37405b(Class<?> cls) {
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
    public abstract <T> T mo29649a(Class<T> cls) throws Exception;
}
