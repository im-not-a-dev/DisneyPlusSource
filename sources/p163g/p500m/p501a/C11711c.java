package p163g.p500m.p501a;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p163g.p500m.p501a.p502z.C11781a;

/* renamed from: g.m.a.c */
/* compiled from: ClassFactory */
abstract class C11711c<T> {

    /* renamed from: g.m.a.c$a */
    /* compiled from: ClassFactory */
    class C11712a extends C11711c<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f27273a;

        /* renamed from: b */
        final /* synthetic */ Class f27274b;

        C11712a(Constructor constructor, Class cls) {
            this.f27273a = constructor;
            this.f27274b = cls;
        }

        /* renamed from: a */
        public T mo29726a() throws IllegalAccessException, InvocationTargetException, InstantiationException {
            return this.f27273a.newInstance(null);
        }

        public String toString() {
            return this.f27274b.getName();
        }
    }

    /* renamed from: g.m.a.c$b */
    /* compiled from: ClassFactory */
    class C11713b extends C11711c<T> {

        /* renamed from: a */
        final /* synthetic */ Method f27275a;

        /* renamed from: b */
        final /* synthetic */ Object f27276b;

        /* renamed from: c */
        final /* synthetic */ Class f27277c;

        C11713b(Method method, Object obj, Class cls) {
            this.f27275a = method;
            this.f27276b = obj;
            this.f27277c = cls;
        }

        /* renamed from: a */
        public T mo29726a() throws InvocationTargetException, IllegalAccessException {
            return this.f27275a.invoke(this.f27276b, new Object[]{this.f27277c});
        }

        public String toString() {
            return this.f27277c.getName();
        }
    }

    /* renamed from: g.m.a.c$c */
    /* compiled from: ClassFactory */
    class C11714c extends C11711c<T> {

        /* renamed from: a */
        final /* synthetic */ Method f27278a;

        /* renamed from: b */
        final /* synthetic */ Class f27279b;

        /* renamed from: c */
        final /* synthetic */ int f27280c;

        C11714c(Method method, Class cls, int i) {
            this.f27278a = method;
            this.f27279b = cls;
            this.f27280c = i;
        }

        /* renamed from: a */
        public T mo29726a() throws InvocationTargetException, IllegalAccessException {
            return this.f27278a.invoke(null, new Object[]{this.f27279b, Integer.valueOf(this.f27280c)});
        }

        public String toString() {
            return this.f27279b.getName();
        }
    }

    /* renamed from: g.m.a.c$d */
    /* compiled from: ClassFactory */
    class C11715d extends C11711c<T> {

        /* renamed from: a */
        final /* synthetic */ Method f27281a;

        /* renamed from: b */
        final /* synthetic */ Class f27282b;

        C11715d(Method method, Class cls) {
            this.f27281a = method;
            this.f27282b = cls;
        }

        /* renamed from: a */
        public T mo29726a() throws InvocationTargetException, IllegalAccessException {
            return this.f27281a.invoke(null, new Object[]{this.f27282b, Object.class});
        }

        public String toString() {
            return this.f27282b.getName();
        }
    }

    C11711c() {
    }

    /* renamed from: a */
    public static <T> C11711c<T> m37682a(Class<?> cls) {
        String str = "newInstance";
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C11712a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C11713b(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get(null), cls);
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(str, new Class[]{Class.class, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new C11714c(declaredMethod2, cls, intValue);
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e) {
                    C11781a.m37910a(e);
                    throw null;
                } catch (NoSuchMethodException unused5) {
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod(str, new Class[]{Class.class, Class.class});
                        declaredMethod3.setAccessible(true);
                        return new C11715d(declaredMethod3, cls);
                    } catch (Exception unused6) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("cannot construct instances of ");
                        sb.append(cls.getName());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo29726a() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
