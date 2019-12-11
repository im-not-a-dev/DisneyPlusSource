package androidx.core.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p096e.p121h.p135s.C4139e;
import p096e.p121h.p135s.C4187x;

/* renamed from: androidx.core.widget.h */
/* compiled from: PopupWindowCompat */
public final class C0512h {

    /* renamed from: a */
    private static Method f2279a;

    /* renamed from: b */
    private static boolean f2280b;

    /* renamed from: c */
    private static Field f2281c;

    /* renamed from: d */
    private static boolean f2282d;

    /* renamed from: a */
    public static void m2760a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C4139e.m14173a(i3, C4187x.m14399n(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m2761a(PopupWindow popupWindow, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            String str = "PopupWindowCompatApi21";
            if (!f2282d) {
                try {
                    f2281c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2281c.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i(str, "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f2282d = true;
            }
            Field field = f2281c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i(str, "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2759a(PopupWindow popupWindow, int i) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f2280b) {
            try {
                f2279a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f2279a.setAccessible(true);
            } catch (Exception unused) {
            }
            f2280b = true;
        }
        Method method = f2279a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
