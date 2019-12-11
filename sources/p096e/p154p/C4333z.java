package p096e.p154p;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.p.z */
/* compiled from: ViewGroupUtilsApi18 */
class C4333z {

    /* renamed from: a */
    private static Method f10782a;

    /* renamed from: b */
    private static boolean f10783b;

    /* renamed from: a */
    static void m14905a(ViewGroup viewGroup, boolean z) {
        String str = "ViewUtilsApi18";
        m14904a();
        Method method = f10782a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e) {
                Log.i(str, "Failed to invoke suppressLayout method", e);
            } catch (InvocationTargetException e2) {
                Log.i(str, "Error invoking suppressLayout method", e2);
            }
        }
    }

    /* renamed from: a */
    private static void m14904a() {
        if (!f10783b) {
            try {
                f10782a = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f10782a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f10783b = true;
        }
    }
}
