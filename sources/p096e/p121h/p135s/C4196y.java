package p096e.p121h.p135s;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: e.h.s.y */
/* compiled from: ViewConfigurationCompat */
public final class C4196y {

    /* renamed from: a */
    private static Method f10499a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f10499a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    private static float m14432a(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25) {
            Method method = f10499a;
            if (method != null) {
                try {
                    return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
                } catch (Exception unused) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m14434b(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return m14432a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static float m14435c(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return m14432a(viewConfiguration, context);
    }

    /* renamed from: d */
    public static boolean m14436d(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }

    /* renamed from: a */
    public static int m14433a(ViewConfiguration viewConfiguration) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }
}
