package p096e.p154p;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.p.g0 */
/* compiled from: ViewUtilsApi22 */
class C4295g0 extends C4293f0 {

    /* renamed from: i */
    private static Method f10680i;

    /* renamed from: j */
    private static boolean f10681j;

    C4295g0() {
    }

    /* renamed from: a */
    public void mo15062a(View view, int i, int i2, int i3, int i4) {
        m14753a();
        Method method = f10680i;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m14753a() {
        if (!f10681j) {
            try {
                f10680i = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f10680i.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f10681j = true;
        }
    }
}
