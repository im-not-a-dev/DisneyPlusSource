package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.g */
/* compiled from: Nat256 */
public abstract class C13963g {
    /* renamed from: a */
    public static int m43939a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: a */
    public static int[] m43945a() {
        return new int[8];
    }

    /* renamed from: b */
    public static int m43947b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: b */
    public static long[] m43953b() {
        return new long[4];
    }

    /* renamed from: c */
    public static boolean m43960c(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static int[] m43961c() {
        return new int[16];
    }

    /* renamed from: d */
    public static int m43962d(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[0]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr2[7]) & 4294967295L;
        long j10 = 0;
        int i = 0;
        while (i < 8) {
            long j11 = j9;
            long j12 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j13 = j6;
            long j14 = (j12 * j7) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j14;
            int i3 = i + 1;
            long j15 = j2;
            long j16 = (j14 >>> 32) + (j12 * j2) + (((long) iArr3[i3]) & j);
            iArr3[i3] = (int) j16;
            int i4 = i + 2;
            long j17 = (j16 >>> 32) + (j12 * j3) + (((long) iArr3[i4]) & j);
            iArr3[i4] = (int) j17;
            int i5 = i + 3;
            long j18 = (j17 >>> 32) + (j12 * j4) + (((long) iArr3[i5]) & j);
            iArr3[i5] = (int) j18;
            int i6 = i + 4;
            long j19 = (j18 >>> 32) + (j12 * j5) + (((long) iArr3[i6]) & j);
            iArr3[i6] = (int) j19;
            int i7 = i + 5;
            long j20 = (j19 >>> 32) + (j12 * j13) + (((long) iArr3[i7]) & j);
            iArr3[i7] = (int) j20;
            int i8 = i + 6;
            long j21 = (j20 >>> 32) + (j12 * j8) + (((long) iArr3[i8]) & j);
            iArr3[i8] = (int) j21;
            int i9 = i + 7;
            long j22 = (j21 >>> 32) + (j12 * j11) + (((long) iArr3[i9]) & j);
            iArr3[i9] = (int) j22;
            int i10 = i + 8;
            long j23 = (j22 >>> 32) + j10 + (((long) iArr3[i10]) & j);
            iArr3[i10] = (int) j23;
            j10 = j23 >>> 32;
            i = i3;
            j9 = j11;
            j6 = j13;
            j2 = j15;
            j = 4294967295L;
        }
        return (int) j10;
    }

    /* renamed from: d */
    public static long[] m43965d() {
        return new long[8];
    }

    /* renamed from: e */
    public static int m43967e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    /* renamed from: c */
    public static void m43959c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = (j9 * j) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j5);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j3);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j4);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[7] = (int) j17;
        int i = (int) (j17 >>> 32);
        iArr3[8] = i;
        int i2 = 1;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j18 = ((long) iArr[i2]) & 4294967295L;
            int i4 = i2 + 0;
            long j19 = j;
            long j20 = (j18 * j) + (((long) iArr3[i4]) & 4294967295L) + 0;
            iArr3[i4] = (int) j20;
            int i5 = i2 + 1;
            int i6 = i5;
            long j21 = (j20 >>> 32) + (j18 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i6] = (int) j21;
            int i7 = i2 + 2;
            long j22 = (j21 >>> 32) + (j18 * j5) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j22;
            int i8 = i2 + 3;
            long j23 = (j22 >>> 32) + (j18 * j3) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j23;
            int i9 = i2 + 4;
            long j24 = (j23 >>> 32) + (j18 * j4) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j24;
            int i10 = i2 + 5;
            long j25 = (j24 >>> 32) + (j18 * j6) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j25;
            int i11 = i2 + 6;
            long j26 = (j25 >>> 32) + (j18 * j7) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j26;
            int i12 = i2 + 7;
            long j27 = (j26 >>> 32) + (j18 * j8) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j27;
            iArr3[i2 + 8] = (int) (j27 >>> 32);
            j = j19;
            i2 = i6;
        }
    }

    /* renamed from: a */
    public static int m43938a(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: b */
    public static boolean m43951b(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static int m43966e(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7])));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    /* renamed from: b */
    public static long[] m43954b(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] b = m43953b();
        int i = 0;
        while (bigInteger.signum() != 0) {
            int i2 = i + 1;
            b[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i = i2;
        }
        return b;
    }

    /* renamed from: b */
    public static boolean m43950b(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m43949b(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m43952b(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m43948b(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = ((long) iArr2[i2 + 7]) & 4294967295L;
        long j9 = ((long) iArr[i + 0]) & 4294967295L;
        long j10 = (j9 * j) + 0;
        long j11 = j;
        iArr3[i3 + 0] = (int) j10;
        long j12 = (j10 >>> 32) + (j9 * j2);
        long j13 = j2;
        iArr3[i3 + 1] = (int) j12;
        long j14 = (j12 >>> 32) + (j9 * j3);
        iArr3[i3 + 2] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j4);
        iArr3[i3 + 3] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j5);
        iArr3[i3 + 4] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j6);
        iArr3[i3 + 5] = (int) j17;
        long j18 = (j17 >>> 32) + (j9 * j7);
        iArr3[i3 + 6] = (int) j18;
        long j19 = (j18 >>> 32) + (j9 * j8);
        iArr3[i3 + 7] = (int) j19;
        iArr3[i3 + 8] = (int) (j19 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 8) {
            i5 += i4;
            long j20 = ((long) iArr[i + i6]) & 4294967295L;
            int i7 = i5 + 0;
            long j21 = (j20 * j11) + (((long) iArr3[i7]) & 4294967295L) + 0;
            iArr3[i7] = (int) j21;
            int i8 = i5 + 1;
            long j22 = j6;
            long j23 = (j21 >>> 32) + (j20 * j13) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j23;
            int i9 = i5 + 2;
            long j24 = j3;
            long j25 = (j23 >>> 32) + (j20 * j3) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j25;
            int i10 = i5 + 3;
            long j26 = (j25 >>> 32) + (j20 * j4) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j26;
            int i11 = i5 + 4;
            long j27 = (j26 >>> 32) + (j20 * j5) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j27;
            int i12 = i5 + 5;
            long j28 = (j27 >>> 32) + (j20 * j22) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j28;
            int i13 = i5 + 6;
            long j29 = (j28 >>> 32) + (j20 * j7) + (((long) iArr3[i13]) & 4294967295L);
            iArr3[i13] = (int) j29;
            int i14 = i5 + 7;
            long j30 = (j29 >>> 32) + (j20 * j8) + (((long) iArr3[i14]) & 4294967295L);
            iArr3[i14] = (int) j30;
            iArr3[i5 + 8] = (int) (j30 >>> 32);
            i6++;
            j6 = j22;
            j3 = j24;
            i4 = 1;
        }
    }

    /* renamed from: d */
    public static void m43964d(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 7;
        int i2 = 16;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j2 = ((long) iArr[i]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i2 - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 = i5 - 1;
            iArr2[i2] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i6 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = j5 + (j6 * j);
                int i7 = (int) j8;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & 4294967295L;
                long j11 = ((long) iArr2[3]) & 4294967295L;
                long j12 = ((long) iArr2[4]) & 4294967295L;
                long j13 = j9 + (j10 * j);
                int i8 = (int) j13;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long j14 = j11 + (j13 >>> 32) + (j10 * j6);
                long j15 = j12 + (j14 >>> 32);
                long j16 = j;
                long j17 = ((long) iArr[3]) & 4294967295L;
                long j18 = j10;
                long j19 = (((long) iArr2[5]) & 4294967295L) + (j15 >>> 32);
                long j20 = j15 & 4294967295L;
                long j21 = j6;
                long j22 = (((long) iArr2[6]) & 4294967295L) + (j19 >>> 32);
                long j23 = j19 & 4294967295L;
                long j24 = (j14 & 4294967295L) + (j17 * j16);
                int i9 = (int) j24;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long j25 = j20 + (j24 >>> 32) + (j17 * j21);
                long j26 = j23 + (j25 >>> 32) + (j17 * j18);
                long j27 = j22 + (j26 >>> 32);
                long j28 = j26 & 4294967295L;
                long j29 = ((long) iArr[4]) & 4294967295L;
                long j30 = (((long) iArr2[7]) & 4294967295L) + (j27 >>> 32);
                long j31 = j27 & 4294967295L;
                long j32 = j17;
                long j33 = (((long) iArr2[8]) & 4294967295L) + (j30 >>> 32);
                long j34 = j30 & 4294967295L;
                long j35 = (j25 & 4294967295L) + (j29 * j16);
                int i11 = (int) j35;
                iArr2[4] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long j36 = j28 + (j35 >>> 32) + (j29 * j21);
                long j37 = j31 + (j36 >>> 32) + (j29 * j18);
                long j38 = j34 + (j37 >>> 32) + (j29 * j32);
                long j39 = j37 & 4294967295L;
                long j40 = j33 + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = ((long) iArr[5]) & 4294967295L;
                long j43 = (((long) iArr2[9]) & 4294967295L) + (j40 >>> 32);
                long j44 = j40 & 4294967295L;
                long j45 = j29;
                long j46 = (((long) iArr2[10]) & 4294967295L) + (j43 >>> 32);
                long j47 = j43 & 4294967295L;
                long j48 = (j36 & 4294967295L) + (j42 * j16);
                int i13 = (int) j48;
                iArr2[5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long j49 = j39 + (j48 >>> 32) + (j42 * j21);
                long j50 = j41 + (j49 >>> 32) + (j42 * j18);
                long j51 = j44 + (j50 >>> 32) + (j42 * j32);
                long j52 = j50 & 4294967295L;
                long j53 = j47 + (j51 >>> 32) + (j42 * j45);
                long j54 = j51 & 4294967295L;
                long j55 = j46 + (j53 >>> 32);
                long j56 = j53 & 4294967295L;
                long j57 = j49 & 4294967295L;
                long j58 = ((long) iArr[6]) & 4294967295L;
                long j59 = (((long) iArr2[11]) & 4294967295L) + (j55 >>> 32);
                long j60 = j55 & 4294967295L;
                long j61 = j42;
                long j62 = (((long) iArr2[12]) & 4294967295L) + (j59 >>> 32);
                long j63 = j59 & 4294967295L;
                long j64 = j57 + (j58 * j16);
                int i15 = (int) j64;
                iArr2[6] = (i15 << 1) | i14;
                long j65 = j52 + (j64 >>> 32) + (j58 * j21);
                long j66 = j54 + (j65 >>> 32) + (j58 * j18);
                long j67 = j56 + (j66 >>> 32) + (j58 * j32);
                long j68 = j66 & 4294967295L;
                long j69 = j60 + (j67 >>> 32) + (j58 * j45);
                long j70 = j67 & 4294967295L;
                long j71 = j63 + (j69 >>> 32) + (j58 * j61);
                long j72 = j69 & 4294967295L;
                long j73 = j62 + (j71 >>> 32);
                long j74 = j58;
                long j75 = ((long) iArr[7]) & 4294967295L;
                long j76 = j71 & 4294967295L;
                long j77 = (((long) iArr2[13]) & 4294967295L) + (j73 >>> 32);
                long j78 = j73 & 4294967295L;
                long j79 = (((long) iArr2[14]) & 4294967295L) + (j77 >>> 32);
                long j80 = j77 & 4294967295L;
                long j81 = (j65 & 4294967295L) + (j75 * j16);
                int i16 = (int) j81;
                iArr2[7] = (i16 << 1) | (i15 >>> 31);
                long j82 = j68 + (j81 >>> 32) + (j75 * j21);
                long j83 = j70 + (j82 >>> 32) + (j75 * j18);
                long j84 = j72 + (j83 >>> 32) + (j75 * j32);
                long j85 = j76 + (j84 >>> 32) + (j75 * j45);
                long j86 = j85;
                long j87 = j78 + (j85 >>> 32) + (j75 * j61);
                long j88 = j80 + (j87 >>> 32) + (j75 * j74);
                long j89 = j79 + (j88 >>> 32);
                int i17 = (int) j82;
                iArr2[8] = (i17 << 1) | (i16 >>> 31);
                int i18 = i17 >>> 31;
                int i19 = (int) j83;
                iArr2[9] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j84;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j86;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j87;
                iArr2[12] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j88;
                iArr2[13] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j89;
                iArr2[14] = i28 | (i29 << 1);
                iArr2[15] = (i29 >>> 31) | ((iArr2[15] + ((int) (j89 >>> 32))) << 1);
                return;
            }
            i = i4;
            i3 = i6;
        }
    }

    /* renamed from: a */
    public static int m43937a(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j = (((long) i3) & 4294967295L) + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L);
        iArr2[i9] = (int) j6;
        int i10 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L);
        iArr2[i10] = (int) j7;
        int i11 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i11]));
        iArr2[i11] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: c */
    public static void m43958c(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i + 0]) & 4294967295L;
        int i3 = 16;
        int i4 = 7;
        int i5 = 0;
        while (true) {
            int i6 = i4 - 1;
            long j2 = ((long) iArr[i + i4]) & 4294967295L;
            long j3 = j2 * j2;
            int i7 = i3 - 1;
            iArr2[i2 + i7] = (i5 << 31) | ((int) (j3 >>> 33));
            i3 = i7 - 1;
            iArr2[i2 + i3] = (int) (j3 >>> 1);
            int i8 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (((long) (i8 << 31)) & 4294967295L) | (j4 >>> 33);
                iArr2[i2 + 0] = (int) j4;
                long j6 = ((long) iArr[i + 1]) & 4294967295L;
                int i9 = i2 + 2;
                long j7 = ((long) iArr2[i9]) & 4294967295L;
                long j8 = j5 + (j6 * j);
                int i10 = (int) j8;
                iArr2[i2 + 1] = (i10 << 1) | (((int) (j4 >>> 32)) & 1);
                int i11 = i10 >>> 31;
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[i + 2]) & 4294967295L;
                int i12 = i2 + 3;
                long j11 = j6;
                int i13 = i2 + 4;
                long j12 = ((long) iArr2[i12]) & 4294967295L;
                long j13 = ((long) iArr2[i13]) & 4294967295L;
                long j14 = j9 + (j10 * j);
                int i14 = (int) j14;
                iArr2[i9] = (i14 << 1) | i11;
                int i15 = i14 >>> 31;
                long j15 = j12 + (j14 >>> 32) + (j10 * j11);
                long j16 = j13 + (j15 >>> 32);
                long j17 = j10;
                long j18 = ((long) iArr[i + 3]) & 4294967295L;
                int i16 = i2 + 5;
                long j19 = (((long) iArr2[i16]) & 4294967295L) + (j16 >>> 32);
                long j20 = j16 & 4294967295L;
                int i17 = i2 + 6;
                int i18 = i16;
                int i19 = i13;
                long j21 = (((long) iArr2[i17]) & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j15 & 4294967295L) + (j18 * j);
                int i20 = (int) j23;
                iArr2[i12] = (i20 << 1) | i15;
                long j24 = j20 + (j23 >>> 32) + (j18 * j11);
                long j25 = j22 + (j24 >>> 32) + (j18 * j17);
                long j26 = j21 + (j25 >>> 32);
                long j27 = j25 & 4294967295L;
                long j28 = ((long) iArr[i + 4]) & 4294967295L;
                int i21 = i2 + 7;
                long j29 = j18;
                long j30 = (((long) iArr2[i21]) & 4294967295L) + (j26 >>> 32);
                int i22 = i2 + 8;
                int i23 = i21;
                long j31 = j26 & 4294967295L;
                long j32 = (((long) iArr2[i22]) & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j24 & 4294967295L) + (j28 * j);
                int i24 = (int) j34;
                iArr2[i19] = (i20 >>> 31) | (i24 << 1);
                int i25 = i24 >>> 31;
                long j35 = j27 + (j34 >>> 32) + (j28 * j11);
                long j36 = j31 + (j35 >>> 32) + (j28 * j17);
                long j37 = j33 + (j36 >>> 32) + (j28 * j29);
                long j38 = j36 & 4294967295L;
                long j39 = j32 + (j37 >>> 32);
                long j40 = j28;
                long j41 = ((long) iArr[i + 5]) & 4294967295L;
                int i26 = i2 + 9;
                long j42 = j37 & 4294967295L;
                long j43 = (((long) iArr2[i26]) & 4294967295L) + (j39 >>> 32);
                int i27 = i2 + 10;
                int i28 = i26;
                long j44 = j39 & 4294967295L;
                long j45 = (((long) iArr2[i27]) & 4294967295L) + (j43 >>> 32);
                long j46 = j43 & 4294967295L;
                long j47 = (j35 & 4294967295L) + (j41 * j);
                int i29 = (int) j47;
                iArr2[i18] = i25 | (i29 << 1);
                int i30 = i29 >>> 31;
                long j48 = j38 + (j47 >>> 32) + (j41 * j11);
                long j49 = j42 + (j48 >>> 32) + (j41 * j17);
                long j50 = j44 + (j49 >>> 32) + (j41 * j29);
                long j51 = j49 & 4294967295L;
                long j52 = j46 + (j50 >>> 32) + (j41 * j40);
                long j53 = j50 & 4294967295L;
                long j54 = j45 + (j52 >>> 32);
                long j55 = j41;
                long j56 = ((long) iArr[i + 6]) & 4294967295L;
                int i31 = i2 + 11;
                long j57 = j52 & 4294967295L;
                long j58 = (((long) iArr2[i31]) & 4294967295L) + (j54 >>> 32);
                int i32 = i2 + 12;
                int i33 = i31;
                long j59 = j54 & 4294967295L;
                long j60 = (((long) iArr2[i32]) & 4294967295L) + (j58 >>> 32);
                long j61 = j58 & 4294967295L;
                long j62 = (j48 & 4294967295L) + (j56 * j);
                int i34 = (int) j62;
                iArr2[i17] = i30 | (i34 << 1);
                int i35 = i34 >>> 31;
                long j63 = j51 + (j62 >>> 32) + (j56 * j11);
                long j64 = j53 + (j63 >>> 32) + (j56 * j17);
                long j65 = j57 + (j64 >>> 32) + (j56 * j29);
                long j66 = j64 & 4294967295L;
                long j67 = j59 + (j65 >>> 32) + (j56 * j40);
                long j68 = j65 & 4294967295L;
                long j69 = j61 + (j67 >>> 32) + (j56 * j55);
                long j70 = j67 & 4294967295L;
                long j71 = j60 + (j69 >>> 32);
                long j72 = j56;
                long j73 = ((long) iArr[i + 7]) & 4294967295L;
                int i36 = i2 + 13;
                long j74 = j69 & 4294967295L;
                long j75 = (((long) iArr2[i36]) & 4294967295L) + (j71 >>> 32);
                int i37 = i2 + 14;
                int i38 = i36;
                long j76 = j71 & 4294967295L;
                long j77 = (((long) iArr2[i37]) & 4294967295L) + (j75 >>> 32);
                long j78 = j75 & 4294967295L;
                long j79 = (j63 & 4294967295L) + (j * j73);
                int i39 = (int) j79;
                iArr2[i23] = (i39 << 1) | i35;
                long j80 = j66 + (j79 >>> 32) + (j73 * j11);
                long j81 = j68 + (j80 >>> 32) + (j73 * j17);
                long j82 = j70 + (j81 >>> 32) + (j73 * j29);
                long j83 = j74 + (j82 >>> 32) + (j73 * j40);
                long j84 = j83;
                long j85 = j76 + (j83 >>> 32) + (j73 * j55);
                long j86 = j78 + (j85 >>> 32) + (j73 * j72);
                long j87 = j77 + (j86 >>> 32);
                int i40 = (int) j80;
                iArr2[i22] = (i39 >>> 31) | (i40 << 1);
                int i41 = (int) j81;
                iArr2[i28] = (i40 >>> 31) | (i41 << 1);
                int i42 = i41 >>> 31;
                int i43 = (int) j82;
                iArr2[i27] = i42 | (i43 << 1);
                int i44 = (int) j84;
                iArr2[i33] = (i43 >>> 31) | (i44 << 1);
                int i45 = (int) j85;
                iArr2[i32] = (i44 >>> 31) | (i45 << 1);
                int i46 = i45 >>> 31;
                int i47 = (int) j86;
                iArr2[i38] = i46 | (i47 << 1);
                int i48 = i47 >>> 31;
                int i49 = (int) j87;
                iArr2[i37] = i48 | (i49 << 1);
                int i50 = i49 >>> 31;
                int i51 = i2 + 15;
                iArr2[i51] = i50 | ((iArr2[i51] + ((int) (j87 >>> 32))) << 1);
                return;
            }
            i5 = i8;
            i4 = i6;
        }
    }

    /* renamed from: a */
    public static int m43936a(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i + 0;
        int i4 = i2 + 0;
        long j = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + 0;
        int i5 = (int) j;
        iArr[i3] = i5;
        iArr2[i4] = i5;
        int i6 = i + 1;
        int i7 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i6]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        int i8 = (int) j2;
        iArr[i6] = i8;
        iArr2[i7] = i8;
        int i9 = i + 2;
        int i10 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i9]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L);
        int i11 = (int) j3;
        iArr[i9] = i11;
        iArr2[i10] = i11;
        int i12 = i + 3;
        int i13 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i12]) & 4294967295L) + (((long) iArr2[i13]) & 4294967295L);
        int i14 = (int) j4;
        iArr[i12] = i14;
        iArr2[i13] = i14;
        int i15 = i + 4;
        int i16 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
        int i17 = (int) j5;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i + 5;
        int i19 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i18]) & 4294967295L) + (((long) iArr2[i19]) & 4294967295L);
        int i20 = (int) j6;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        int i21 = i + 6;
        int i22 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i21]) & 4294967295L) + (((long) iArr2[i22]) & 4294967295L);
        int i23 = (int) j7;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        int i24 = i + 7;
        int i25 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i24]) & 4294967295L) + (4294967295L & ((long) iArr2[i25]));
        int i26 = (int) j8;
        iArr[i24] = i26;
        iArr2[i25] = i26;
        return (int) (j8 >>> 32);
    }

    /* renamed from: d */
    public static void m43963d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    /* renamed from: a */
    public static boolean m43942a(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean b = m43950b(iArr, i, iArr2, i2);
        if (b) {
            m43955c(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            m43955c(iArr2, i2, iArr, i, iArr3, i3);
        }
        return b;
    }

    /* renamed from: a */
    public static boolean m43944a(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int[] m43946a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] a = m43945a();
        int i = 0;
        while (bigInteger.signum() != 0) {
            int i2 = i + 1;
            a[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i = i2;
        }
        return a;
    }

    /* renamed from: c */
    public static int m43955c(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i2 + 0]) & 4294967295L)) + 0;
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L));
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L));
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
    }

    /* renamed from: a */
    public static int m43935a(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else if ((i & 255) != i) {
            return 0;
        } else {
            int i3 = i >>> 5;
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: a */
    public static boolean m43941a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m43943a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static long m43940a(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) iArr[i2 + 0]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr2[i3 + 0]) & 4294967295L) + 0;
        iArr3[i4 + 0] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j8 = j6 + (j * j7) + j4 + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr3[i4 + 3] = (int) j10;
        long j11 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr3[i4 + 4] = (int) j12;
        long j13 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr3[i4 + 5] = (int) j14;
        long j15 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (((long) iArr2[i3 + 6]) & 4294967295L);
        iArr3[i4 + 6] = (int) j16;
        long j17 = ((long) iArr[i2 + 7]) & 4294967295L;
        long j18 = (j16 >>> 32) + (j * j17) + j15 + (4294967295L & ((long) iArr2[i3 + 7]));
        iArr3[i4 + 7] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    /* renamed from: c */
    public static BigInteger m43956c(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C14087h.m44470a(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: c */
    public static BigInteger m43957c(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                C14087h.m44471a(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static int m43934a(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) iArr2[0]) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[1]) & 4294967295L) * j) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * j) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * j) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * j) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * j) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * j) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7]));
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    /* renamed from: a */
    public static int m43933a(int i, long j, int[] iArr, int i2) {
        int[] iArr2 = iArr;
        int i3 = i2;
        long j2 = ((long) i) & 4294967295L;
        long j3 = j & 4294967295L;
        int i4 = i3 + 0;
        long j4 = (j2 * j3) + (((long) iArr2[i4]) & 4294967295L) + 0;
        iArr2[i4] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i5 = i3 + 1;
        long j7 = (j4 >>> 32) + j6 + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j7;
        int i6 = i3 + 2;
        long j8 = (j7 >>> 32) + j5 + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j8;
        int i7 = i3 + 3;
        long j9 = (j8 >>> 32) + (4294967295L & ((long) iArr2[i7]));
        iArr2[i7] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return C13969m.m43998a(8, iArr2, i3, 4);
    }

    /* renamed from: a */
    public static int m43932a(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i2) & 4294967295L;
        int i4 = i3 + 0;
        long j2 = ((((long) i) & 4294967295L) * j) + (((long) iArr[i4]) & 4294967295L) + 0;
        iArr[i4] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (j2 >>> 32) + j + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j3;
        long j4 = j3 >>> 32;
        int i6 = i3 + 2;
        long j5 = j4 + (((long) iArr[i6]) & 4294967295L);
        iArr[i6] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return C13969m.m43998a(8, iArr, i3, 3);
    }
}
