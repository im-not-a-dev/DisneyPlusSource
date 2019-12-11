package com.google.android.exoplayer2.p393v0;

/* renamed from: com.google.android.exoplayer2.v0.a0 */
/* compiled from: RepeatModeUtil */
public final class C9528a0 {
    /* renamed from: a */
    public static int m29280a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m29281b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m29281b(int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                if ((i2 & 2) == 0) {
                    z = false;
                }
                return z;
            } else if ((i2 & 1) == 0) {
                z = false;
            }
        }
        return z;
    }
}
