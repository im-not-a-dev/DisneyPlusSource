package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.p393v0.C9554k0;

/* renamed from: com.google.android.exoplayer2.p0.d0 */
/* compiled from: WavUtil */
public final class C8822d0 {

    /* renamed from: a */
    public static final int f18799a = C9554k0.m29428b("RIFF");

    /* renamed from: b */
    public static final int f18800b = C9554k0.m29428b("WAVE");

    /* renamed from: c */
    public static final int f18801c = C9554k0.m29428b("fmt ");

    /* renamed from: d */
    public static final int f18802d = C9554k0.m29428b("data");

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
        return C9554k0.m29424b(i2);
    }
}
