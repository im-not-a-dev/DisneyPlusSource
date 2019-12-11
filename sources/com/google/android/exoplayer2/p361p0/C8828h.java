package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.C9571v;
import com.google.android.exoplayer2.util.C9572w;
import java.nio.ByteBuffer;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.p0.h */
/* compiled from: Ac4Util */
public final class C8828h {

    /* renamed from: a */
    private static final int[] f18820a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, DateUtils.FORMAT_NO_MIDNIGHT};

    /* renamed from: com.google.android.exoplayer2.p0.h$b */
    /* compiled from: Ac4Util */
    public static final class C8830b {

        /* renamed from: a */
        public final int f18821a;

        /* renamed from: b */
        public final int f18822b;

        /* renamed from: c */
        public final int f18823c;

        /* renamed from: d */
        public final int f18824d;

        private C8830b(int i, int i2, int i3, int i4, int i5) {
            this.f18822b = i2;
            this.f18821a = i3;
            this.f18823c = i4;
            this.f18824d = i5;
        }
    }

    /* renamed from: a */
    public static Format m25608a(C9572w wVar, String str, String str2, DrmInitData drmInitData) {
        wVar.mo24695f(1);
        return Format.m24875a(str, "audio/ac4", (String) null, -1, -1, 2, ((wVar.mo24711v() & 32) >> 5) == 1 ? 48000 : 44100, null, drmInitData, 0, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r10 != 11) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r10 != 8) goto L_0x0093;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.p361p0.C8828h.C8830b m25609a(com.google.android.exoplayer2.util.C9571v r10) {
        /*
            r0 = 16
            int r1 = r10.mo24660a(r0)
            int r0 = r10.mo24660a(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.mo24660a(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.mo24660a(r0)
            r3 = 3
            if (r1 != r3) goto L_0x002f
            int r4 = m25605a(r10, r0)
            int r1 = r1 + r4
        L_0x002f:
            r4 = r1
            r1 = 10
            int r1 = r10.mo24660a(r1)
            boolean r5 = r10.mo24673e()
            if (r5 == 0) goto L_0x0045
            int r5 = r10.mo24660a(r3)
            if (r5 <= 0) goto L_0x0045
            r10.mo24670c(r0)
        L_0x0045:
            boolean r5 = r10.mo24673e()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L_0x0055
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0058
        L_0x0055:
            r9 = 44100(0xac44, float:6.1797E-41)
        L_0x0058:
            int r10 = r10.mo24660a(r2)
            r5 = 0
            if (r9 != r8) goto L_0x0069
            r8 = 13
            if (r10 != r8) goto L_0x0069
            int[] r0 = f18820a
            r10 = r0[r10]
            r8 = r10
            goto L_0x0099
        L_0x0069:
            if (r9 != r6) goto L_0x0098
            int[] r6 = f18820a
            int r8 = r6.length
            if (r10 >= r8) goto L_0x0098
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L_0x008e
            r8 = 11
            if (r1 == r0) goto L_0x0089
            if (r1 == r3) goto L_0x008e
            if (r1 == r2) goto L_0x0082
            goto L_0x0093
        L_0x0082:
            if (r10 == r3) goto L_0x0095
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x0089:
            if (r10 == r6) goto L_0x0095
            if (r10 != r8) goto L_0x0093
            goto L_0x0095
        L_0x008e:
            if (r10 == r3) goto L_0x0095
            if (r10 != r6) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r8 = r5
            goto L_0x0099
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x0098:
            r8 = 0
        L_0x0099:
            com.google.android.exoplayer2.p0.h$b r10 = new com.google.android.exoplayer2.p0.h$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p361p0.C8828h.m25609a(com.google.android.exoplayer2.v0.v):com.google.android.exoplayer2.p0.h$b");
    }

    /* renamed from: a */
    public static int m25607a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b == 65535) {
            b = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return b + i2;
    }

    /* renamed from: a */
    public static int m25606a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m25609a(new C9571v(bArr)).f18824d;
    }

    /* renamed from: a */
    public static void m25610a(int i, C9572w wVar) {
        wVar.mo24689c(7);
        byte[] bArr = wVar.f22333a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* renamed from: a */
    private static int m25605a(C9571v vVar, int i) {
        int i2 = 0;
        while (true) {
            int a = i2 + vVar.mo24660a(i);
            if (!vVar.mo24673e()) {
                return a;
            }
            i2 = (a + 1) << i;
        }
    }
}
