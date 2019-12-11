package p096e.p121h.p125k;

import android.graphics.Color;

/* renamed from: e.h.k.a */
/* compiled from: ColorUtils */
public final class C4045a {
    static {
        new ThreadLocal();
    }

    /* renamed from: a */
    private static int m13879a(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: b */
    public static int m13881b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int a = m13879a(alpha2, alpha);
        return Color.argb(a, m13880a(Color.red(i), alpha2, Color.red(i2), alpha, a), m13880a(Color.green(i), alpha2, Color.green(i2), alpha, a), m13880a(Color.blue(i), alpha2, Color.blue(i2), alpha, a));
    }

    /* renamed from: c */
    public static int m13882c(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: a */
    private static int m13880a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }
}
