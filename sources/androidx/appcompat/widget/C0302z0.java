package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.appcompat.widget.z0 */
/* compiled from: ViewUtils */
public class C0302z0 {

    /* renamed from: a */
    private static Method f1324a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1324a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f1324a.isAccessible()) {
                    f1324a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static boolean m1635a(View view) {
        return C4187x.m14399n(view) == 1;
    }

    /* renamed from: b */
    public static void m1636b(View view) {
        String str = "Could not invoke makeOptionalFitsSystemWindows";
        String str2 = "ViewUtils";
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d(str2, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e) {
                Log.d(str2, str, e);
            } catch (IllegalAccessException e2) {
                Log.d(str2, str, e2);
            }
        }
    }

    /* renamed from: a */
    public static void m1634a(View view, Rect rect, Rect rect2) {
        Method method = f1324a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
