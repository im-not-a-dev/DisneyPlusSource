package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.e */
/* compiled from: Nat192 */
public abstract class C13961e {
    /* renamed from: a */
    public static int m43882a(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    /* renamed from: a */
    public static int[] m43889a() {
        return new int[6];
    }

    /* renamed from: b */
    public static int m43891b(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    /* renamed from: b */
    public static long[] m43897b() {
        return new long[3];
    }

    /* renamed from: c */
    public static void m43904c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j5);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j3);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j4);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        int i = (int) (j13 >>> 32);
        iArr3[6] = i;
        int i2 = 1;
        for (int i3 = 6; i2 < i3; i3 = 6) {
            long j14 = ((long) iArr[i2]) & 4294967295L;
            int i4 = i2 + 0;
            long j15 = j;
            long j16 = (j14 * j) + (((long) iArr3[i4]) & 4294967295L) + 0;
            iArr3[i4] = (int) j16;
            int i5 = i2 + 1;
            int i6 = i5;
            long j17 = (j16 >>> 32) + (j14 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i6] = (int) j17;
            int i7 = i2 + 2;
            long j18 = (j17 >>> 32) + (j14 * j5) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j18;
            int i8 = i2 + 3;
            long j19 = (j18 >>> 32) + (j14 * j3) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j19;
            int i9 = i2 + 4;
            long j20 = (j19 >>> 32) + (j14 * j4) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j20;
            int i10 = i2 + 5;
            long j21 = (j20 >>> 32) + (j14 * j6) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j21;
            iArr3[i2 + 6] = (int) (j21 >>> 32);
            j = j15;
            i2 = i6;
        }
    }

    /* renamed from: c */
    public static int[] m43905c() {
        return new int[12];
    }

    /* renamed from: d */
    public static int m43907d(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = 0;
        while (i < 6) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j11 = j2;
            long j12 = (j10 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j12;
            int i3 = i + 1;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j13;
            int i4 = i + 2;
            long j14 = j3;
            long j15 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j15;
            int i5 = i + 3;
            long j16 = j4;
            long j17 = (j15 >>> 32) + (j10 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j17;
            int i6 = i + 4;
            long j18 = (j17 >>> 32) + (j10 * j6) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j18;
            int i7 = i + 5;
            long j19 = (j18 >>> 32) + (j10 * j9) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j19;
            int i8 = i + 6;
            long j20 = (j19 >>> 32) + j8 + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j20;
            j8 = j20 >>> 32;
            i = i3;
            j = 4294967295L;
            j7 = j9;
            j2 = j11;
            j3 = j14;
            j4 = j16;
        }
        return (int) j8;
    }

    /* renamed from: d */
    public static long[] m43909d() {
        return new long[6];
    }

    /* renamed from: e */
    public static int m43910e(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >> 32);
    }

    /* renamed from: a */
    public static int m43881a(int[] iArr, int i, int[] iArr2, int i2, int i3) {
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
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i9]));
        iArr2[i9] = (int) j6;
        return (int) (j6 >>> 32);
    }

    /* renamed from: b */
    public static long[] m43898b(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] b = m43897b();
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
    public static boolean m43895b(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
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

    /* renamed from: b */
    public static boolean m43894b(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
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

    /* renamed from: d */
    public static int m43906d(int[] iArr, int[] iArr2) {
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
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5])));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    /* renamed from: b */
    public static boolean m43893b(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m43896b(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int m43880a(int[] iArr, int i, int[] iArr2, int i2) {
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
        long j6 = (j5 >>> 32) + (((long) iArr[i18]) & 4294967295L) + (4294967295L & ((long) iArr2[i19]));
        int i20 = (int) j6;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        return (int) (j6 >>> 32);
    }

    /* renamed from: b */
    public static void m43892b(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr[i + 0]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        long j9 = j;
        iArr3[i3 + 0] = (int) j8;
        long j10 = (j8 >>> 32) + (j7 * j2);
        long j11 = j2;
        iArr3[i3 + 1] = (int) j10;
        long j12 = (j10 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j15;
        iArr3[i3 + 6] = (int) (j15 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 6) {
            i5 += i4;
            long j16 = ((long) iArr[i + i6]) & 4294967295L;
            int i7 = i5 + 0;
            long j17 = (j16 * j9) + (((long) iArr3[i7]) & 4294967295L) + 0;
            iArr3[i7] = (int) j17;
            int i8 = i5 + 1;
            long j18 = j6;
            long j19 = (j17 >>> 32) + (j16 * j11) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j19;
            int i9 = i5 + 2;
            long j20 = j3;
            long j21 = (j19 >>> 32) + (j16 * j3) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j21;
            int i10 = i5 + 3;
            long j22 = (j21 >>> 32) + (j16 * j4) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j22;
            int i11 = i5 + 4;
            long j23 = (j22 >>> 32) + (j16 * j5) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j23;
            int i12 = i5 + 5;
            long j24 = (j23 >>> 32) + (j16 * j18) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j24;
            iArr3[i5 + 6] = (int) (j24 >>> 32);
            i6++;
            j3 = j20;
            j6 = j18;
            i4 = 1;
        }
    }

    /* renamed from: c */
    public static void m43903c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 5;
        int i2 = 12;
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
                long j18 = (((long) iArr2[5]) & 4294967295L) + (j15 >>> 32);
                long j19 = j15 & 4294967295L;
                long j20 = j10;
                long j21 = (((long) iArr2[6]) & 4294967295L) + (j18 >>> 32);
                long j22 = j18 & 4294967295L;
                long j23 = (j14 & 4294967295L) + (j17 * j16);
                int i9 = (int) j23;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long j24 = j19 + (j23 >>> 32) + (j17 * j6);
                long j25 = j22 + (j24 >>> 32) + (j17 * j20);
                long j26 = j21 + (j25 >>> 32);
                long j27 = j25 & 4294967295L;
                long j28 = ((long) iArr[4]) & 4294967295L;
                long j29 = j17;
                long j30 = (((long) iArr2[7]) & 4294967295L) + (j26 >>> 32);
                long j31 = j26 & 4294967295L;
                long j32 = (((long) iArr2[8]) & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j24 & 4294967295L) + (j28 * j16);
                int i11 = (int) j34;
                iArr2[4] = (i11 << 1) | i10;
                long j35 = j27 + (j34 >>> 32) + (j28 * j6);
                long j36 = j31 + (j35 >>> 32) + (j28 * j20);
                long j37 = j33 + (j36 >>> 32) + (j28 * j29);
                long j38 = j36 & 4294967295L;
                long j39 = j32 + (j37 >>> 32);
                long j40 = j28;
                long j41 = ((long) iArr[5]) & 4294967295L;
                long j42 = j37 & 4294967295L;
                long j43 = (((long) iArr2[9]) & 4294967295L) + (j39 >>> 32);
                long j44 = j39 & 4294967295L;
                long j45 = (((long) iArr2[10]) & 4294967295L) + (j43 >>> 32);
                long j46 = j43 & 4294967295L;
                long j47 = (j35 & 4294967295L) + (j41 * j16);
                int i12 = (int) j47;
                iArr2[5] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long j48 = j38 + (j47 >>> 32) + (j6 * j41);
                long j49 = j42 + (j48 >>> 32) + (j41 * j20);
                long j50 = j44 + (j49 >>> 32) + (j41 * j29);
                long j51 = j46 + (j50 >>> 32) + (j41 * j40);
                long j52 = j45 + (j51 >>> 32);
                int i14 = (int) j48;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = (int) j49;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j50;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = (int) j51;
                iArr2[9] = (i18 << 1) | (i17 >>> 31);
                int i19 = i18 >>> 31;
                int i20 = (int) j52;
                iArr2[10] = i19 | (i20 << 1);
                iArr2[11] = (i20 >>> 31) | ((iArr2[11] + ((int) (j52 >>> 32))) << 1);
                return;
            }
            i = i4;
            i3 = i6;
        }
    }

    /* renamed from: d */
    public static void m43908d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    /* renamed from: a */
    public static boolean m43885a(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean b = m43894b(iArr, i, iArr2, i2);
        if (b) {
            m43899c(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            m43899c(iArr2, i2, iArr, i, iArr3, i3);
        }
        return b;
    }

    /* renamed from: a */
    public static boolean m43886a(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m43888a(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int[] m43890a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] a = m43889a();
        int i = 0;
        while (bigInteger.signum() != 0) {
            int i2 = i + 1;
            a[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i = i2;
        }
        return a;
    }

    /* renamed from: a */
    public static int m43879a(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: a */
    public static boolean m43884a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m43887a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static long m43883a(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
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
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (4294967295L & ((long) iArr2[i3 + 5]));
        iArr3[i4 + 5] = (int) j14;
        return (j14 >>> 32) + j13;
    }

    /* renamed from: c */
    public static void m43902c(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i + 0]) & 4294967295L;
        int i3 = 12;
        int i4 = 5;
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
                long j47 = (j35 & 4294967295L) + (j * j41);
                int i29 = (int) j47;
                iArr2[i18] = (i29 << 1) | i25;
                long j48 = j38 + (j47 >>> 32) + (j41 * j11);
                long j49 = j42 + (j48 >>> 32) + (j41 * j17);
                long j50 = j44 + (j49 >>> 32) + (j41 * j29);
                long j51 = j46 + (j50 >>> 32) + (j41 * j40);
                long j52 = j45 + (j51 >>> 32);
                int i30 = (int) j48;
                iArr2[i17] = (i29 >>> 31) | (i30 << 1);
                int i31 = (int) j49;
                iArr2[i23] = (i30 >>> 31) | (i31 << 1);
                int i32 = (int) j50;
                iArr2[i22] = (i31 >>> 31) | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) j51;
                iArr2[i28] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j52;
                iArr2[i27] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = i2 + 11;
                iArr2[i38] = i37 | ((iArr2[i38] + ((int) (j52 >>> 32))) << 1);
                return;
            }
            i5 = i8;
            i4 = i6;
        }
    }

    /* renamed from: a */
    public static int m43878a(int i, long j, int[] iArr, int i2) {
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
        return C13969m.m43998a(6, iArr2, i3, 4);
    }

    /* renamed from: a */
    public static int m43877a(int i, int i2, int[] iArr, int i3) {
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
        return C13969m.m43998a(6, iArr, i3, 3);
    }

    /* renamed from: c */
    public static int m43899c(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
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
        return (int) (j6 >> 32);
    }

    /* renamed from: c */
    public static BigInteger m43900c(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C14087h.m44470a(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: c */
    public static BigInteger m43901c(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                C14087h.m44471a(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
