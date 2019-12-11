package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.d */
/* compiled from: Nat160 */
public abstract class C13960d {
    /* renamed from: a */
    public static int m43859a(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    /* renamed from: a */
    public static int[] m43863a() {
        return new int[5];
    }

    /* renamed from: b */
    public static int m43866b(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >>> 32);
    }

    /* renamed from: b */
    public static int[] m43869b() {
        return new int[10];
    }

    /* renamed from: c */
    public static void m43872c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[3]) & 4294967295L;
        long j4 = ((long) iArr2[4]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = (j6 * j) + 0;
        iArr3[0] = (int) j7;
        long j8 = (j7 >>> 32) + (j6 * j2);
        iArr3[1] = (int) j8;
        long j9 = (j8 >>> 32) + (j6 * j5);
        iArr3[2] = (int) j9;
        long j10 = (j9 >>> 32) + (j6 * j3);
        iArr3[3] = (int) j10;
        long j11 = (j10 >>> 32) + (j6 * j4);
        iArr3[4] = (int) j11;
        int i2 = (int) (j11 >>> 32);
        iArr3[5] = i2;
        for (int i3 = 5; i < i3; i3 = 5) {
            long j12 = ((long) iArr[i]) & 4294967295L;
            int i4 = i + 0;
            long j13 = j;
            long j14 = (j12 * j) + (((long) iArr3[i4]) & 4294967295L) + 0;
            iArr3[i4] = (int) j14;
            int i5 = i + 1;
            long j15 = j2;
            long j16 = (j14 >>> 32) + (j12 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j16;
            int i6 = i + 2;
            long j17 = j4;
            long j18 = (j16 >>> 32) + (j12 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j18;
            int i7 = i + 3;
            long j19 = (j18 >>> 32) + (j12 * j3) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j19;
            int i8 = i + 4;
            long j20 = (j19 >>> 32) + (j12 * j17) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j20;
            iArr3[i + 5] = (int) (j20 >>> 32);
            i = i5;
            j4 = j17;
            j = j13;
            j2 = j15;
        }
    }

    /* renamed from: d */
    public static int m43874d(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = 0;
        while (i < 5) {
            long j8 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j9 = j2;
            long j10 = (j8 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j10;
            int i3 = i + 1;
            long j11 = j3;
            long j12 = (j10 >>> 32) + (j8 * j3) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j12;
            int i4 = i + 2;
            long j13 = j4;
            long j14 = (j12 >>> 32) + (j8 * j4) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j14;
            int i5 = i + 3;
            long j15 = (j14 >>> 32) + (j8 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j15;
            int i6 = i + 4;
            long j16 = (j15 >>> 32) + (j8 * j6) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j16;
            int i7 = i + 5;
            long j17 = (j16 >>> 32) + j7 + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j17;
            j7 = j17 >>> 32;
            i = i3;
            j = 4294967295L;
            j2 = j9;
            j4 = j13;
            j3 = j11;
        }
        return (int) j7;
    }

    /* renamed from: e */
    public static int m43876e(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j5 >> 32);
    }

    /* renamed from: a */
    public static boolean m43862a(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m43868b(int[] iArr, int[] iArr2) {
        for (int i = 4; i >= 0; i--) {
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

    /* renamed from: a */
    public static int[] m43864a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] a = m43863a();
        int i = 0;
        while (bigInteger.signum() != 0) {
            int i2 = i + 1;
            a[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i = i2;
        }
        return a;
    }

    /* renamed from: b */
    public static boolean m43867b(int[] iArr) {
        for (int i = 0; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m43865b(int i, int i2, int[] iArr, int i3) {
        int i4 = i3 + 0;
        long j = ((((long) i2) & 4294967295L) * (((long) i) & 4294967295L)) + (((long) iArr[i4]) & 4294967295L) + 0;
        iArr[i4] = (int) j;
        int i5 = i3 + 1;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[i5]));
        iArr[i5] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return C13969m.m43998a(5, iArr, i3, 2);
    }

    /* renamed from: a */
    public static int m43858a(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 5) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: d */
    public static int m43873d(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4])));
        iArr2[4] = (int) j5;
        return (int) (j5 >> 32);
    }

    /* renamed from: a */
    public static boolean m43861a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static long m43860a(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
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
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (4294967295L & ((long) iArr2[i3 + 4]));
        iArr3[i4 + 4] = (int) j12;
        return (j12 >>> 32) + j11;
    }

    /* renamed from: c */
    public static void m43871c(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 4;
        int i2 = 10;
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
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
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
                int i10 = (int) j34;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                long j35 = (j34 >>> 32) + (j6 * j28) + j27;
                long j36 = j31 + (j35 >>> 32) + (j28 * j20);
                long j37 = j33 + (j36 >>> 32) + (j28 * j29);
                long j38 = j32 + (j37 >>> 32);
                int i11 = (int) j35;
                iArr2[5] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) j36;
                iArr2[6] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j37;
                iArr2[7] = (i13 << 1) | (i12 >>> 31);
                int i14 = i13 >>> 31;
                int i15 = (int) j38;
                iArr2[8] = i14 | (i15 << 1);
                iArr2[9] = (i15 >>> 31) | ((iArr2[9] + ((int) (j38 >>> 32))) << 1);
                return;
            }
            i = i4;
            i3 = i6;
        }
    }

    /* renamed from: d */
    public static void m43875d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
    }

    /* renamed from: a */
    public static int m43857a(int i, long j, int[] iArr, int i2) {
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
        return C13969m.m43998a(5, iArr2, i3, 4);
    }

    /* renamed from: a */
    public static int m43856a(int i, int i2, int[] iArr, int i3) {
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
        return C13969m.m43998a(5, iArr, i3, 3);
    }

    /* renamed from: c */
    public static BigInteger m43870c(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C14087h.m44470a(i2, bArr, (4 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
