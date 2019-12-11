package p096e.p121h.p125k;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.h.k.g */
/* compiled from: TypefaceCompatApi28Impl */
public class C4053g extends C4052f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo14565a(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f10261g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f10267m.invoke(null, new Object[]{newInstance, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1)});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Method mo14570d(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
