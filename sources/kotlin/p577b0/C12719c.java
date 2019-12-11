package kotlin.p577b0;

/* renamed from: kotlin.b0.c */
/* compiled from: progressionUtil.kt */
public final class C12719c {
    /* renamed from: a */
    private static final int m39855a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: b */
    public static final int m39857b(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m39856a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m39856a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: a */
    private static final int m39856a(int i, int i2, int i3) {
        return m39855a(m39855a(i, i3) - m39855a(i2, i3), i3);
    }
}
