package com.google.android.material.internal;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: com.google.android.material.internal.d */
/* compiled from: DrawableUtils */
public class C10315d {

    /* renamed from: a */
    private static Method f24434a;

    /* renamed from: b */
    private static boolean f24435b;

    /* renamed from: a */
    public static boolean m32544a(DrawableContainer drawableContainer, ConstantState constantState) {
        return m32545b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m32545b(DrawableContainer drawableContainer, ConstantState constantState) {
        String str = "DrawableUtils";
        if (!f24435b) {
            try {
                f24434a = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                f24434a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.e(str, "Could not fetch setConstantState(). Oh well.");
            }
            f24435b = true;
        }
        Method method = f24434a;
        if (method != null) {
            try {
                method.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
                Log.e(str, "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}
