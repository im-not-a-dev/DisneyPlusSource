package com.google.android.exoplayer2.p366s0.p371v;

import com.bamtech.sdk4.internal.configuration.ContentServiceClientExtras;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.s0.v.f */
/* compiled from: FixedSampleSizeRechunker */
final class C8969f {

    /* renamed from: com.google.android.exoplayer2.s0.v.f$b */
    /* compiled from: FixedSampleSizeRechunker */
    public static final class C8971b {

        /* renamed from: a */
        public final long[] f19541a;

        /* renamed from: b */
        public final int[] f19542b;

        /* renamed from: c */
        public final int f19543c;

        /* renamed from: d */
        public final long[] f19544d;

        /* renamed from: e */
        public final int[] f19545e;

        /* renamed from: f */
        public final long f19546f;

        private C8971b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f19541a = jArr;
            this.f19542b = iArr;
            this.f19543c = i;
            this.f19544d = jArr2;
            this.f19545e = iArr2;
            this.f19546f = j;
        }
    }

    /* renamed from: a */
    public static C8971b m26400a(int i, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i2 = ContentServiceClientExtras.URL_SIZE_LIMIT / i;
        int i3 = 0;
        for (int a : iArr2) {
            i3 += Util.m29381a(a, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr3 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr4 = new int[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            int i8 = iArr2[i7];
            long j2 = jArr[i7];
            while (i8 > 0) {
                int min = Math.min(i2, i8);
                jArr2[i5] = j2;
                iArr3[i5] = i * min;
                i6 = Math.max(i6, iArr3[i5]);
                jArr3[i5] = ((long) i4) * j;
                iArr4[i5] = 1;
                j2 += (long) iArr3[i5];
                i4 += min;
                i8 -= min;
                i5++;
            }
        }
        C8971b bVar = new C8971b(jArr2, iArr3, i6, jArr3, iArr4, j * ((long) i4));
        return bVar;
    }
}
