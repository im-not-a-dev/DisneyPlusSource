package p161f.p162a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.a.u3 */
public final class C4598u3 {
    /* renamed from: a */
    public static Method m15985a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m15986a(String str, String str2, Class<?>... clsArr) {
        try {
            return m15985a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m15984a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
