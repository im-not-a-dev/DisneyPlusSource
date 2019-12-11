package com.google.android.exoplayer2.p361p0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p393v0.C9571v;
import java.nio.ByteBuffer;
import java.util.Arrays;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.p0.v */
/* compiled from: DtsUtil */
public final class C8865v {

    /* renamed from: a */
    private static final int[] f18964a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f18965b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f18966c = {64, 112, 128, 192, 224, 256, 384, 448, DateUtils.FORMAT_NO_NOON, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, DateUtils.FORMAT_NO_MIDNIGHT, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static Format m25814a(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        C9571v b = m25816b(bArr);
        b.mo24670c(60);
        int i = f18964a[b.mo24660a(6)];
        int i2 = f18965b[b.mo24660a(4)];
        int a = b.mo24660a(5);
        int[] iArr = f18966c;
        int i3 = a >= iArr.length ? -1 : (iArr[a] * 1000) / 2;
        b.mo24670c(10);
        return Format.m24875a(str, "audio/vnd.dts", (String) null, i3, -1, i + (b.mo24660a(2) > 0 ? 1 : 0), i2, null, drmInitData, 0, str2);
    }

    /* renamed from: a */
    public static boolean m25815a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: b */
    private static C9571v m25816b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new C9571v(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m25817c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        C9571v vVar = new C9571v(copyOf);
        if (copyOf[0] == 31) {
            C9571v vVar2 = new C9571v(copyOf);
            while (vVar2.mo24659a() >= 16) {
                vVar2.mo24670c(2);
                vVar.mo24661a(vVar2.mo24660a(14), 14);
            }
        }
        vVar.mo24663a(copyOf);
        return vVar;
    }

    /* renamed from: c */
    private static boolean m25817c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    /* renamed from: d */
    public static int m25818d(byte[] bArr) {
        int i;
        byte b;
        byte b2;
        int i2;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            b2 = b3 & 60;
            return (((b2 >> 2) | i2) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        b2 = b & 252;
        return (((b2 >> 2) | i2) + 1) * 32;
    }

    /* renamed from: a */
    public static int m25812a(ByteBuffer byteBuffer) {
        int i;
        byte b;
        byte b2;
        int i2;
        byte b3;
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                b = byteBuffer.get(position + 5);
            } else {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            }
            b2 = b3 & 60;
            return (((b2 >> 2) | i2) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b = byteBuffer.get(position + 4);
        b2 = b & 252;
        return (((b2 >> 2) | i2) + 1) * 32;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m25813a(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004f
            r2 = -1
            if (r1 == r2) goto L_0x0037
            r2 = 31
            if (r1 == r2) goto L_0x0026
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0020:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L_0x005e
        L_0x0026:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0047
        L_0x0037:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0047:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L_0x005e
        L_0x004f:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0020
        L_0x005e:
            if (r0 == 0) goto L_0x0064
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0064:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p361p0.C8865v.m25813a(byte[]):int");
    }
}
