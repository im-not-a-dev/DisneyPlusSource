package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.f */
/* compiled from: Nat224 */
public abstract class C13962f {
    /* renamed from: a */
    public static int m43914a(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j7 >>> 32);
    }

    /* renamed from: a */
    public static int[] m43918a() {
        return new int[7];
    }

    /* renamed from: b */
    public static int m43920b(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j7 >>> 32);
    }

    /* renamed from: b */
    public static int[] m43923b() {
        return new int[14];
    }

    /* renamed from: c */
    public static boolean m43926c(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
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

    /* renamed from: d */
    public static int m43927d(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[0]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 7) {
            long j10 = j8;
            long j11 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j12 = j6;
            long j13 = (j11 * j7) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j13;
            int i3 = i + 1;
            long j14 = j2;
            long j15 = (j13 >>> 32) + (j11 * j2) + (((long) iArr3[i3]) & j);
            iArr3[i3] = (int) j15;
            int i4 = i + 2;
            long j16 = (j15 >>> 32) + (j11 * j3) + (((long) iArr3[i4]) & j);
            iArr3[i4] = (int) j16;
            int i5 = i + 3;
            long j17 = (j16 >>> 32) + (j11 * j4) + (((long) iArr3[i5]) & j);
            iArr3[i5] = (int) j17;
            int i6 = i + 4;
            long j18 = (j17 >>> 32) + (j11 * j5) + (((long) iArr3[i6]) & j);
            iArr3[i6] = (int) j18;
            int i7 = i + 5;
            long j19 = (j18 >>> 32) + (j11 * j12) + (((long) iArr3[i7]) & j);
            iArr3[i7] = (int) j19;
            int i8 = i + 6;
            long j20 = (j19 >>> 32) + (j11 * j10) + (((long) iArr3[i8]) & j);
            iArr3[i8] = (int) j20;
            int i9 = i + 7;
            long j21 = (j20 >>> 32) + j9 + (((long) iArr3[i9]) & j);
            iArr3[i9] = (int) j21;
            j9 = j21 >>> 32;
            i = i3;
            j8 = j10;
            j6 = j12;
            j2 = j14;
            j = 4294967295L;
        }
        return (int) j9;
    }

    /* renamed from: e */
    public static int m43931e(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j7 >> 32);
    }

    /* renamed from: c */
    public static void m43925c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = (j8 * j) + 0;
        iArr3[0] = (int) j9;
        long j10 = (j9 >>> 32) + (j8 * j2);
        iArr3[1] = (int) j10;
        long j11 = (j10 >>> 32) + (j8 * j5);
        iArr3[2] = (int) j11;
        long j12 = (j11 >>> 32) + (j8 * j3);
        iArr3[3] = (int) j12;
        long j13 = (j12 >>> 32) + (j8 * j4);
        iArr3[4] = (int) j13;
        long j14 = (j13 >>> 32) + (j8 * j6);
        iArr3[5] = (int) j14;
        long j15 = (j14 >>> 32) + (j8 * j7);
        iArr3[6] = (int) j15;
        int i = (int) (j15 >>> 32);
        iArr3[7] = i;
        int i2 = 1;
        for (int i3 = 7; i2 < i3; i3 = 7) {
            long j16 = ((long) iArr[i2]) & 4294967295L;
            int i4 = i2 + 0;
            long j17 = j;
            long j18 = (j16 * j) + (((long) iArr3[i4]) & 4294967295L) + 0;
            iArr3[i4] = (int) j18;
            int i5 = i2 + 1;
            int i6 = i5;
            long j19 = (j18 >>> 32) + (j16 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i6] = (int) j19;
            int i7 = i2 + 2;
            long j20 = (j19 >>> 32) + (j16 * j5) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j20;
            int i8 = i2 + 3;
            long j21 = (j20 >>> 32) + (j16 * j3) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j21;
            int i9 = i2 + 4;
            long j22 = (j21 >>> 32) + (j16 * j4) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j22;
            int i10 = i2 + 5;
            long j23 = (j22 >>> 32) + (j16 * j6) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j23;
            int i11 = i2 + 6;
            long j24 = (j23 >>> 32) + (j16 * j7) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j24;
            iArr3[i2 + 7] = (int) (j24 >>> 32);
            j = j17;
            i2 = i6;
        }
    }

    /* renamed from: a */
    public static void m43916a(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    /* renamed from: b */
    public static boolean m43922b(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static int m43930e(int[] iArr, int[] iArr2) {
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
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6])));
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    /* renamed from: b */
    public static boolean m43921b(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int[] m43919a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] a = m43918a();
        int i = 0;
        while (bigInteger.signum() != 0) {
            int i2 = i + 1;
            a[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i = i2;
        }
        return a;
    }

    /* renamed from: d */
    public static void m43929d(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 6;
        int i2 = 14;
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
                long j21 = (((long) iArr2[6]) & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j14 & 4294967295L) + (j17 * j16);
                int i9 = (int) j23;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long j24 = j20 + (j23 >>> 32) + (j17 * j6);
                long j25 = j22 + (j24 >>> 32) + (j17 * j18);
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
                iArr2[4] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long j35 = j27 + (j34 >>> 32) + (j28 * j6);
                long j36 = j31 + (j35 >>> 32) + (j28 * j18);
                long j37 = j33 + (j36 >>> 32) + (j28 * j29);
                long j38 = j36 & 4294967295L;
                long j39 = j32 + (j37 >>> 32);
                long j40 = ((long) iArr[5]) & 4294967295L;
                long j41 = j28;
                long j42 = (((long) iArr2[9]) & 4294967295L) + (j39 >>> 32);
                long j43 = j39 & 4294967295L;
                long j44 = j37 & 4294967295L;
                long j45 = (((long) iArr2[10]) & 4294967295L) + (j42 >>> 32);
                long j46 = j42 & 4294967295L;
                long j47 = (j35 & 4294967295L) + (j40 * j16);
                int i13 = (int) j47;
                iArr2[5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long j48 = j38 + (j47 >>> 32) + (j40 * j6);
                long j49 = j44 + (j48 >>> 32) + (j40 * j18);
                long j50 = j43 + (j49 >>> 32) + (j40 * j29);
                long j51 = j49 & 4294967295L;
                long j52 = j46 + (j50 >>> 32) + (j40 * j41);
                long j53 = j50 & 4294967295L;
                long j54 = j45 + (j52 >>> 32);
                long j55 = j40;
                long j56 = ((long) iArr[6]) & 4294967295L;
                long j57 = j52 & 4294967295L;
                long j58 = (((long) iArr2[11]) & 4294967295L) + (j54 >>> 32);
                long j59 = j54 & 4294967295L;
                long j60 = (((long) iArr2[12]) & 4294967295L) + (j58 >>> 32);
                long j61 = 4294967295L & j58;
                long j62 = (j48 & 4294967295L) + (j56 * j16);
                int i15 = (int) j62;
                iArr2[6] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                long j63 = j51 + (j62 >>> 32) + (j6 * j56);
                long j64 = j53 + (j63 >>> 32) + (j56 * j18);
                long j65 = j57 + (j64 >>> 32) + (j56 * j29);
                long j66 = j59 + (j65 >>> 32) + (j56 * j41);
                long j67 = j61 + (j66 >>> 32) + (j56 * j55);
                long j68 = j60 + (j67 >>> 32);
                int i17 = (int) j63;
                iArr2[7] = i16 | (i17 << 1);
                int i18 = (int) j64;
                iArr2[8] = (i17 >>> 31) | (i18 << 1);
                int i19 = (int) j65;
                iArr2[9] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j66;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) j67;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) j68;
                iArr2[12] = i24 | (i25 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j68 >>> 32))) << 1) | (i25 >>> 31);
                return;
            }
            i = i4;
            i3 = i6;
        }
    }

    /* renamed from: a */
    public static int m43913a(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: a */
    public static boolean m43917a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static long m43915a(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
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
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (4294967295L & ((long) iArr2[i3 + 6]));
        iArr3[i4 + 6] = (int) j16;
        return (j16 >>> 32) + j15;
    }

    /* renamed from: c */
    public static BigInteger m43924c(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C14087h.m44470a(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static int m43912a(int i, long j, int[] iArr, int i2) {
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
        return C13969m.m43998a(7, iArr2, i3, 4);
    }

    /* renamed from: d */
    public static void m43928d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }

    /* renamed from: a */
    public static int m43911a(int i, int i2, int[] iArr, int i3) {
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
        return C13969m.m43998a(7, iArr, i3, 3);
    }
}
