package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
/* compiled from: DrawableCompat */
public final class C0492a {

    /* renamed from: a */
    private static Method f2200a;

    /* renamed from: b */
    private static boolean f2201b;

    /* renamed from: c */
    private static Method f2202c;

    /* renamed from: d */
    private static boolean f2203d;

    /* renamed from: a */
    public static void m2641a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static void m2645b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0494c) {
            ((C0494c) drawable).setTint(i);
        }
    }

    /* renamed from: c */
    public static int m2646c(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static ColorFilter m2647d(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: e */
    public static int m2648e(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            String str = "DrawableCompat";
            if (!f2203d) {
                try {
                    f2202c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2202c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve getLayoutDirection() method", e);
                }
                f2203d = true;
            }
            Method method = f2202c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke getLayoutDirection() via reflection", e2);
                    f2202c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m2649f(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: g */
    public static void m2650g(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: h */
    public static <T extends Drawable> T m2651h(Drawable drawable) {
        return drawable instanceof C0495d ? ((C0495d) drawable).mo2712a() : drawable;
    }

    /* renamed from: i */
    public static Drawable m2652i(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof C0494c) ? new C0497f(drawable) : drawable : !(drawable instanceof C0494c) ? new C0496e(drawable) : drawable;
    }

    /* renamed from: a */
    public static void m2635a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m2636a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public static void m2644b(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m2644b(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof C0495d) {
                m2644b(((C0495d) drawable).mo2712a());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        Drawable child = drawableContainerState.getChild(i2);
                        if (child != null) {
                            m2644b(child);
                        }
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: a */
    public static void m2637a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0494c) {
            ((C0494c) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2640a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0494c) {
            ((C0494c) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m2638a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static boolean m2642a(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2639a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static boolean m2643a(Drawable drawable, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            String str = "DrawableCompat";
            if (!f2201b) {
                try {
                    f2200a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f2200a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f2201b = true;
            }
            Method method = f2200a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f2200a = null;
                }
            }
        }
        return false;
    }
}
