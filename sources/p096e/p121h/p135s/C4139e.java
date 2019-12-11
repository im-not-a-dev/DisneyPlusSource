package p096e.p121h.p135s;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

/* renamed from: e.h.s.e */
/* compiled from: GravityCompat */
public final class C4139e {
    /* renamed from: a */
    public static void m14174a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: a */
    public static int m14173a(int i, int i2) {
        return VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
