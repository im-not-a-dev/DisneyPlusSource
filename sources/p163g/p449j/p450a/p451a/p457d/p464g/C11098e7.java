package p163g.p449j.p450a.p451a.p457d.p464g;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: g.j.a.a.d.g.e7 */
final class C11098e7 implements PrivilegedExceptionAction<Unsafe> {
    C11098e7() {
    }

    public final /* synthetic */ Object run() throws Exception {
        Field[] declaredFields;
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (Unsafe) cls.cast(obj);
            }
        }
        return null;
    }
}
