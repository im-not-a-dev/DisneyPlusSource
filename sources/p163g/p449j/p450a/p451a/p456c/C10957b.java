package p163g.p449j.p450a.p451a.p456c;

import android.os.IBinder;
import java.lang.reflect.Field;
import p163g.p449j.p450a.p451a.p456c.C10954a.C10955a;

/* renamed from: g.j.a.a.c.b */
public final class C10957b<T> extends C10955a {

    /* renamed from: a */
    private final T f26008a;

    private C10957b(T t) {
        this.f26008a = t;
    }

    /* renamed from: a */
    public static <T> C10954a m34643a(T t) {
        return new C10957b(t);
    }

    /* renamed from: a */
    public static <T> T m34644a(C10954a aVar) {
        if (aVar instanceof C10957b) {
            return ((C10957b) aVar).f26008a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
