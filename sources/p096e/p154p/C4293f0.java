package p096e.p154p;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.p.f0 */
/* compiled from: ViewUtilsApi21 */
class C4293f0 extends C4291e0 {

    /* renamed from: e */
    private static Method f10676e;

    /* renamed from: f */
    private static boolean f10677f;

    /* renamed from: g */
    private static Method f10678g;

    /* renamed from: h */
    private static boolean f10679h;

    C4293f0() {
    }

    /* renamed from: a */
    public void mo15059a(View view, Matrix matrix) {
        m14748a();
        Method method = f10676e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public void mo15060b(View view, Matrix matrix) {
        m14749b();
        Method method = f10678g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    private void m14748a() {
        if (!f10677f) {
            try {
                f10676e = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f10676e.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f10677f = true;
        }
    }

    /* renamed from: b */
    private void m14749b() {
        if (!f10679h) {
            try {
                f10678g = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f10678g.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f10679h = true;
        }
    }
}
