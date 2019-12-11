package p096e.p121h.p135s;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: e.h.s.h */
/* compiled from: MarginLayoutParamsCompat */
public final class C4146h {
    /* renamed from: a */
    public static int m14189a(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m14191b(MarginLayoutParams marginLayoutParams) {
        if (VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    /* renamed from: a */
    public static void m14190a(MarginLayoutParams marginLayoutParams, int i) {
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }
}
