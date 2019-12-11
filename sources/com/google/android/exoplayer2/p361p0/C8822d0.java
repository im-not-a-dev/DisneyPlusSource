package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.p0.d0 */
/* compiled from: WavUtil */
public final class C8822d0 {

    /* renamed from: a */
    public static final int f18799a = Util.m29428b("RIFF");

    /* renamed from: b */
    public static final int f18800b = Util.m29428b("WAVE");

    /* renamed from: c */
    public static final int f18801c = Util.m29428b("fmt ");

    /* renamed from: d */
    public static final int f18802d = Util.m29428b("data");

    /* renamed from: a */
    public static int m25594a(int i, int i2) {
        if (i != 1) {
            int i3 = 0;
            if (i == 3) {
                if (i2 == 32) {
                    i3 = 4;
                }
                return i3;
            } else if (i != 65534) {
                if (i != 6) {
                    return i != 7 ? 0 : 268435456;
                }
                return 536870912;
            }
        }
        return Util.getPcmEncoding(i2);
    }
}
