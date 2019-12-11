package p163g.p449j.p450a.p468b.p477s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import p096e.p097a.p098k.p099a.C3868a;

/* renamed from: g.j.a.b.s.a */
/* compiled from: MaterialResources */
public class C11499a {
    /* renamed from: a */
    public static ColorStateList m37087a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C3868a.m12945b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m37088b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable c = C3868a.m12946c(context, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: c */
    public static C11500b m37089c(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return new C11500b(context, resourceId);
            }
        }
        return null;
    }

    /* renamed from: a */
    static int m37086a(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
