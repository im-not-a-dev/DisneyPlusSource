package p096e.p154p;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.p.e0 */
/* compiled from: ViewUtilsApi19 */
class C4291e0 extends C4297h0 {

    /* renamed from: a */
    private static Method f10672a;

    /* renamed from: b */
    private static boolean f10673b;

    /* renamed from: c */
    private static Method f10674c;

    /* renamed from: d */
    private static boolean f10675d;

    C4291e0() {
    }

    /* renamed from: a */
    public void mo15055a(View view) {
    }

    /* renamed from: a */
    public void mo15056a(View view, float f) {
        m14742b();
        Method method = f10672a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public float mo15057b(View view) {
        m14741a();
        Method method = f10674c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo15057b(view);
    }

    /* renamed from: c */
    public void mo15058c(View view) {
    }

    /* renamed from: a */
    private void m14741a() {
        if (!f10675d) {
            try {
                f10674c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f10674c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f10675d = true;
        }
    }

    /* renamed from: b */
    private void m14742b() {
        if (!f10673b) {
            try {
                f10672a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f10672a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f10673b = true;
        }
    }
}
