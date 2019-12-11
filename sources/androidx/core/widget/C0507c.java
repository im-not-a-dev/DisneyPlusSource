package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* compiled from: CompoundButtonCompat */
public final class C0507c {

    /* renamed from: a */
    private static Field f2276a;

    /* renamed from: b */
    private static boolean f2277b;

    /* renamed from: a */
    public static void m2747a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0515j) {
            ((C0515j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2748a(CompoundButton compoundButton, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C0515j) {
            ((C0515j) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m2746a(CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        String str = "CompoundButtonCompat";
        if (!f2277b) {
            try {
                f2276a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2276a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(str, "Failed to retrieve mButtonDrawable field", e);
            }
            f2277b = true;
        }
        Field field = f2276a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(str, "Failed to get button drawable via reflection", e2);
                f2276a = null;
            }
        }
        return null;
    }
}
