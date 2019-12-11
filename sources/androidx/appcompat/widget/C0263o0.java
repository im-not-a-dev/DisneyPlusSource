package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p096e.p121h.p125k.C4045a;

/* renamed from: androidx.appcompat.widget.o0 */
/* compiled from: ThemeUtils */
class C0263o0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1184a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1185b = {-16842910};

    /* renamed from: c */
    static final int[] f1186c = {16842908};

    /* renamed from: d */
    static final int[] f1187d = {16842919};

    /* renamed from: e */
    static final int[] f1188e = {16842912};

    /* renamed from: f */
    static final int[] f1189f = new int[0];

    /* renamed from: g */
    private static final int[] f1190g = new int[1];

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    /* renamed from: a */
    public static int m1433a(Context context, int i) {
        ColorStateList c = m1437c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f1185b, c.getDefaultColor());
        }
        TypedValue a = m1435a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1434a(context, i, a.getFloat());
    }

    /* renamed from: b */
    public static int m1436b(Context context, int i) {
        int[] iArr = f1190g;
        iArr[0] = i;
        C0284t0 a = C0284t0.m1485a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1905a(0, 0);
        } finally {
            a.mo1908a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m1437c(Context context, int i) {
        int[] iArr = f1190g;
        iArr[0] = i;
        C0284t0 a = C0284t0.m1485a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1906a(0);
        } finally {
            a.mo1908a();
        }
    }

    /* renamed from: a */
    private static TypedValue m1435a() {
        TypedValue typedValue = (TypedValue) f1184a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1184a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    static int m1434a(Context context, int i, float f) {
        int b = m1436b(context, i);
        return C4045a.m13882c(b, Math.round(((float) Color.alpha(b)) * f));
    }
}
