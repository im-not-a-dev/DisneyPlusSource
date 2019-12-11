package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.core.graphics.drawable.C0492a;
import androidx.core.graphics.drawable.C0495d;
import java.lang.reflect.Field;
import p096e.p097a.p100l.p101a.C3882c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.b0 */
/* compiled from: DrawableUtils */
public class C0204b0 {

    /* renamed from: a */
    private static final int[] f961a = {16842912};

    /* renamed from: b */
    private static final int[] f962b = new int[0];

    /* renamed from: c */
    public static final Rect f963c = new Rect();

    /* renamed from: d */
    private static Class<?> f964d;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f964d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1172a(Drawable drawable) {
        if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                    if (!m1172a(a)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof C0495d) {
            return m1172a(((C0495d) drawable).mo2712a());
        } else {
            if (drawable instanceof C3882c) {
                return m1172a(((C3882c) drawable).mo13867a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m1172a(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: b */
    static void m1173b(Drawable drawable) {
        if (VERSION.SDK_INT == 21) {
            if ("android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                m1174c(drawable);
            }
        }
    }

    /* renamed from: c */
    private static void m1174c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f961a);
        } else {
            drawable.setState(f962b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m1175d(Drawable drawable) {
        Field[] fields;
        if (VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f964d != null) {
            try {
                Drawable h = C0492a.m2651h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f964d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f963c;
    }

    /* renamed from: a */
    public static Mode m1171a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
