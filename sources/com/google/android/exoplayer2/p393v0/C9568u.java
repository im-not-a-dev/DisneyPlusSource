package com.google.android.exoplayer2.p393v0;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.v0.u */
/* compiled from: NalUnitUtil */
public final class C9568u {

    /* renamed from: a */
    public static final byte[] f22309a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f22310b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f22311c = new Object();

    /* renamed from: d */
    private static int[] f22312d = new int[10];

    /* renamed from: com.google.android.exoplayer2.v0.u$a */
    /* compiled from: NalUnitUtil */
    public static final class C9569a {

        /* renamed from: a */
        public final int f22313a;

        /* renamed from: b */
        public final int f22314b;

        /* renamed from: c */
        public final boolean f22315c;

        public C9569a(int i, int i2, boolean z) {
            this.f22313a = i;
            this.f22314b = i2;
            this.f22315c = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.v0.u$b */
    /* compiled from: NalUnitUtil */
    public static final class C9570b {

        /* renamed from: a */
        public final int f22316a;

        /* renamed from: b */
        public final int f22317b;

        /* renamed from: c */
        public final int f22318c;

        /* renamed from: d */
        public final int f22319d;

        /* renamed from: e */
        public final int f22320e;

        /* renamed from: f */
        public final int f22321f;

        /* renamed from: g */
        public final float f22322g;

        /* renamed from: h */
        public final boolean f22323h;

        /* renamed from: i */
        public final boolean f22324i;

        /* renamed from: j */
        public final int f22325j;

        /* renamed from: k */
        public final int f22326k;

        /* renamed from: l */
        public final int f22327l;

        /* renamed from: m */
        public final boolean f22328m;

        public C9570b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f22316a = i;
            this.f22317b = i2;
            this.f22318c = i3;
            this.f22319d = i4;
            this.f22320e = i5;
            this.f22321f = i6;
            this.f22322g = f;
            this.f22323h = z;
            this.f22324i = z2;
            this.f22325j = i7;
            this.f22326k = i8;
            this.f22327l = i9;
            this.f22328m = z3;
        }
    }

    /* renamed from: a */
    public static void m29524a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b == 0) {
                    i2++;
                }
                if (b != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: b */
    public static int m29527b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: c */
    public static int m29529c(byte[] bArr, int i) {
        int i2;
        synchronized (f22311c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m29521a(bArr, i3, i);
                    if (i3 < i) {
                        if (f22312d.length <= i4) {
                            f22312d = Arrays.copyOf(f22312d, f22312d.length * 2);
                        }
                        int i5 = i4 + 1;
                        f22312d[i4] = i3;
                        i3 += 3;
                        i4 = i5;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = f22312d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* renamed from: b */
    public static C9569a m29528b(byte[] bArr, int i, int i2) {
        C9573x xVar = new C9573x(bArr, i, i2);
        xVar.mo24722c(8);
        int d = xVar.mo24723d();
        int d2 = xVar.mo24723d();
        xVar.mo24724e();
        return new C9569a(d, d2, xVar.mo24720b());
    }

    /* renamed from: a */
    public static boolean m29526a(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m29520a(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0097, code lost:
        r8 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29522a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            com.google.android.exoplayer2.p393v0.Assertions.checkState(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            m29525a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            m29525a(r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            m29525a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0067
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0062
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0062
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0062
            if (r10 == 0) goto L_0x0061
            m29525a(r10)
        L_0x0061:
            return r5
        L_0x0062:
            int r8 = r8 + -2
        L_0x0064:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0067:
            if (r10 == 0) goto L_0x00bb
            if (r0 <= r3) goto L_0x007e
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x007c:
            r8 = 0
            goto L_0x0098
        L_0x007e:
            if (r0 != r3) goto L_0x008f
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x007c
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
            goto L_0x0097
        L_0x008f:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x007c
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x007c
        L_0x0097:
            r8 = 1
        L_0x0098:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a7
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
            goto L_0x00af
        L_0x00a7:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
        L_0x00af:
            r8 = 1
            goto L_0x00b2
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b9
            r1 = 1
        L_0x00b9:
            r10[r3] = r1
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p393v0.C9568u.m29522a(byte[], int, int, boolean[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0145  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.p393v0.C9568u.C9570b m29530c(byte[] r20, int r21, int r22) {
        /*
            com.google.android.exoplayer2.v0.x r0 = new com.google.android.exoplayer2.v0.x
            r1 = r20
            r2 = r21
            r3 = r22
            r0.<init>(r1, r2, r3)
            r1 = 8
            r0.mo24722c(r1)
            int r3 = r0.mo24719b(r1)
            int r4 = r0.mo24719b(r1)
            int r5 = r0.mo24719b(r1)
            int r6 = r0.mo24723d()
            r2 = 3
            r9 = 1
            r10 = 100
            if (r3 == r10) goto L_0x004e
            r10 = 110(0x6e, float:1.54E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 122(0x7a, float:1.71E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 244(0xf4, float:3.42E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 44
            if (r3 == r10) goto L_0x004e
            r10 = 83
            if (r3 == r10) goto L_0x004e
            r10 = 86
            if (r3 == r10) goto L_0x004e
            r10 = 118(0x76, float:1.65E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 128(0x80, float:1.794E-43)
            if (r3 == r10) goto L_0x004e
            r10 = 138(0x8a, float:1.93E-43)
            if (r3 != r10) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r10 = 1
            r11 = 0
            goto L_0x0087
        L_0x004e:
            int r10 = r0.mo24723d()
            if (r10 != r2) goto L_0x0059
            boolean r11 = r0.mo24720b()
            goto L_0x005a
        L_0x0059:
            r11 = 0
        L_0x005a:
            r0.mo24723d()
            r0.mo24723d()
            r0.mo24724e()
            boolean r12 = r0.mo24720b()
            if (r12 == 0) goto L_0x0087
            if (r10 == r2) goto L_0x006e
            r12 = 8
            goto L_0x0070
        L_0x006e:
            r12 = 12
        L_0x0070:
            r13 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x0087
            boolean r14 = r0.mo24720b()
            if (r14 == 0) goto L_0x0084
            r14 = 6
            if (r13 >= r14) goto L_0x007f
            r14 = 16
            goto L_0x0081
        L_0x007f:
            r14 = 64
        L_0x0081:
            m29523a(r0, r14)
        L_0x0084:
            int r13 = r13 + 1
            goto L_0x0071
        L_0x0087:
            int r12 = r0.mo24723d()
            int r12 = r12 + 4
            int r13 = r0.mo24723d()
            if (r13 != 0) goto L_0x009a
            int r14 = r0.mo24723d()
            int r14 = r14 + 4
            goto L_0x00bb
        L_0x009a:
            if (r13 != r9) goto L_0x00ba
            boolean r14 = r0.mo24720b()
            r0.mo24721c()
            r0.mo24721c()
            int r15 = r0.mo24723d()
            long r1 = (long) r15
            r15 = 0
        L_0x00ac:
            long r7 = (long) r15
            int r17 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b7
            r0.mo24723d()
            int r15 = r15 + 1
            goto L_0x00ac
        L_0x00b7:
            r15 = r14
            r14 = 0
            goto L_0x00bc
        L_0x00ba:
            r14 = 0
        L_0x00bb:
            r15 = 0
        L_0x00bc:
            r0.mo24723d()
            r0.mo24724e()
            int r1 = r0.mo24723d()
            int r1 = r1 + r9
            int r2 = r0.mo24723d()
            int r2 = r2 + r9
            boolean r16 = r0.mo24720b()
            r7 = 2
            int r8 = 2 - r16
            int r8 = r8 * r2
            if (r16 != 0) goto L_0x00da
            r0.mo24724e()
        L_0x00da:
            r0.mo24724e()
            r2 = 16
            int r1 = r1 * 16
            int r8 = r8 * 16
            boolean r2 = r0.mo24720b()
            if (r2 == 0) goto L_0x0119
            int r2 = r0.mo24723d()
            int r17 = r0.mo24723d()
            int r18 = r0.mo24723d()
            int r19 = r0.mo24723d()
            if (r10 != 0) goto L_0x0100
            int r7 = 2 - r16
            r9 = r7
            r7 = 1
            goto L_0x010e
        L_0x0100:
            r7 = 3
            if (r10 != r7) goto L_0x0105
            r7 = 1
            goto L_0x0106
        L_0x0105:
            r7 = 2
        L_0x0106:
            if (r10 != r9) goto L_0x0109
            r9 = 2
        L_0x0109:
            r10 = 2
            int r10 = 2 - r16
            int r9 = r9 * r10
        L_0x010e:
            int r2 = r2 + r17
            int r2 = r2 * r7
            int r1 = r1 - r2
            int r18 = r18 + r19
            int r18 = r18 * r9
            int r8 = r8 - r18
        L_0x0119:
            r7 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = r0.mo24720b()
            if (r2 == 0) goto L_0x0164
            boolean r2 = r0.mo24720b()
            if (r2 == 0) goto L_0x0164
            r2 = 8
            int r2 = r0.mo24719b(r2)
            r9 = 255(0xff, float:3.57E-43)
            if (r2 != r9) goto L_0x0145
            r9 = 16
            int r2 = r0.mo24719b(r9)
            int r0 = r0.mo24719b(r9)
            if (r2 == 0) goto L_0x0143
            if (r0 == 0) goto L_0x0143
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0143:
            r9 = r1
            goto L_0x0166
        L_0x0145:
            float[] r0 = f22310b
            int r9 = r0.length
            if (r2 >= r9) goto L_0x014e
            r0 = r0[r2]
            r9 = r0
            goto L_0x0166
        L_0x014e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "Unexpected aspect_ratio_idc value: "
            r0.append(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "NalUnitUtil"
            com.google.android.exoplayer2.p393v0.Log.m29500d(r2, r0)
        L_0x0164:
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x0166:
            com.google.android.exoplayer2.v0.u$b r0 = new com.google.android.exoplayer2.v0.u$b
            r2 = r0
            r10 = r11
            r11 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p393v0.C9568u.m29530c(byte[], int, int):com.google.android.exoplayer2.v0.u$b");
    }

    /* renamed from: a */
    public static void m29525a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: a */
    private static int m29521a(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    private static void m29523a(C9573x xVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((xVar.mo24721c() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }
}
