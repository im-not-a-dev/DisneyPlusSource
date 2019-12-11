package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.i0 */
/* compiled from: TsUtil */
public final class C9035i0 {
    /* renamed from: a */
    public static int m26717a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static long m26718a(C9572w wVar, int i, int i2) {
        wVar.mo24693e(i);
        if (wVar.mo24679a() < 5) {
            return -9223372036854775807L;
        }
        int i3 = wVar.mo24698i();
        if ((8388608 & i3) != 0 || ((2096896 & i3) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((i3 & 32) != 0) && wVar.mo24711v() >= 7 && wVar.mo24679a() >= 7) {
            if ((wVar.mo24711v() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                wVar.mo24685a(bArr, 0, bArr.length);
                return m26719a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m26719a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
