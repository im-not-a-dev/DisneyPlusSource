package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.c */
/* compiled from: Nat128 */
public abstract class C13959c {
    /* renamed from: a */
    public static int m43833a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    /* renamed from: a */
    public static int[] m43838a() {
        return new int[4];
    }

    /* renamed from: b */
    public static int m43840b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    /* renamed from: b */
    public static long[] m43844b() {
        return new long[2];
    }

    /* renamed from: c */
    public static void m43849c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr[0]) & 4294967295L;
        long j6 = (j5 * j) + 0;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (j5 * j2);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (j5 * j3);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (j5 * j4);
        iArr3[3] = (int) j9;
        int i2 = (int) (j9 >>> 32);
        iArr3[4] = i2;
        for (int i3 = 4; i < i3; i3 = 4) {
            long j10 = ((long) iArr[i]) & 4294967295L;
            int i4 = i + 0;
            long j11 = j;
            long j12 = (j10 * j) + (((long) iArr3[i4]) & 4294967295L) + 0;
            iArr3[i4] = (int) j12;
            int i5 = i + 1;
            long j13 = (j12 >>> 32) + (j10 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j13;
            int i6 = i + 2;
            long j14 = (j13 >>> 32) + (j10 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j14;
            int i7 = i + 3;
            long j15 = (j14 >>> 32) + (j10 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j15;
            iArr3[i + 4] = (int) (j15 >>> 32);
            i = i5;
            j = j11;
        }
    }

    /* renamed from: c */
    public static int[] m43850c() {
        return new int[8];
    }

    /* renamed from: d */
    public static int m43852d(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = 0;
        while (i < 4) {
            long j7 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j8 = j2;
            long j9 = (j7 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j9;
            int i3 = i + 1;
            long j10 = (j9 >>> 32) + (j7 * j3) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j10;
            int i4 = i + 2;
            long j11 = j3;
            int i5 = i3;
            long j12 = (j10 >>> 32) + (j7 * j4) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j12;
            int i6 = i + 3;
            long j13 = (j12 >>> 32) + (j7 * j5) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j13;
            int i7 = i + 4;
            long j14 = (j13 >>> 32) + j6 + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j14;
            j6 = j14 >>> 32;
            i = i5;
            j = 4294967295L;
            j2 = j8;
            j3 = j11;
        }
        return (int) j6;
    }

    /* renamed from: d */
    public static long[] m43854d() {
        return new long[4];
    }

    /* renamed from: e */
    public static int m43855e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    /* renamed from: a */
    public static boolean m43835a(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static long[] m43845b(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        long[] b = m43844b();
        int i = 0;
        while (bigInteger.signum() != 0) {
            int i2 = i + 1;
            b[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i = i2;
        }
        return b;
    }

    /* renamed from: a */
    public static boolean m43837a(long[] jArr, long[] jArr2) {
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static int[] m43839a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        }
        int[] a = m43838a();
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
    public static boolean m43842b(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
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
    public static int m43851d(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (4294967295L & ((long) iArr[3])));
        iArr2[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    /* renamed from: a */
    public static int m43832a(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 4) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    /* renamed from: b */
    public static boolean m43841b(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m43843b(long[] jArr) {
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m43834a(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m43836a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m43848c(int[] iArr, int[] iArr2) {
        long j = 4294967295L;
        long j2 = ((long) iArr[0]) & 4294967295L;
        char c = 3;
        int i = 3;
        int i2 = 8;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j3 = ((long) iArr[i]) & j;
            long j4 = j3 * j3;
            int i5 = i2 - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j4 >>> 33));
            i2 = i5 - 1;
            iArr2[i2] = (int) (j4 >>> 1);
            int i6 = (int) j4;
            if (i4 <= 0) {
                long j5 = j2 * j2;
                long j6 = (j5 >>> 33) | (((long) (i6 << 31)) & j);
                iArr2[0] = (int) j5;
                long j7 = ((long) iArr[1]) & j;
                long j8 = ((long) iArr2[2]) & j;
                long j9 = j6 + (j7 * j2);
                int i7 = (int) j9;
                iArr2[1] = (i7 << 1) | (((int) (j5 >>> 32)) & 1);
                long j10 = j8 + (j9 >>> 32);
                long j11 = ((long) iArr[2]) & j;
                long j12 = ((long) iArr2[c]) & j;
                long j13 = ((long) iArr2[4]) & j;
                long j14 = j10 + (j11 * j2);
                int i8 = (int) j14;
                iArr2[2] = (i7 >>> 31) | (i8 << 1);
                long j15 = j12 + (j14 >>> 32) + (j11 * j7);
                long j16 = j13 + (j15 >>> 32);
                long j17 = ((long) iArr[3]) & 4294967295L;
                long j18 = j11;
                long j19 = (((long) iArr2[5]) & 4294967295L) + (j16 >>> 32);
                long j20 = j16 & 4294967295L;
                long j21 = (((long) iArr2[6]) & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (j15 & 4294967295L) + (j2 * j17);
                int i9 = (int) j23;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long j24 = j20 + (j23 >>> 32) + (j7 * j17);
                long j25 = j22 + (j24 >>> 32) + (j17 * j18);
                long j26 = j21 + (j25 >>> 32);
                long j27 = j25 & 4294967295L;
                int i11 = (int) j24;
                iArr2[4] = i10 | (i11 << 1);
                int i12 = (int) j27;
                iArr2[5] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) j26;
                iArr2[6] = i13 | (i14 << 1);
                iArr2[7] = (i14 >>> 31) | ((iArr2[7] + ((int) (j26 >>> 32))) << 1);
                return;
            }
            j = j;
            i = i4;
            i3 = i6;
            c = 3;
        }
    }

    /* renamed from: d */
    public static void m43853d(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
    }

    /* renamed from: c */
    public static BigInteger m43846c(int[] iArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                C14087h.m44470a(i2, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: c */
    public static BigInteger m43847c(long[] jArr) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j = jArr[i];
            if (j != 0) {
                C14087h.m44471a(j, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }
}
