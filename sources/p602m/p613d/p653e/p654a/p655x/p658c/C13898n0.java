package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13965i;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.n0 */
/* compiled from: SecP384R1Field */
public class C13898n0 {

    /* renamed from: a */
    static final int[] f30777a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30778b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30779c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    /* renamed from: a */
    public static void m43306a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13969m.m44005a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && C13969m.m44027c(12, iArr3, f30777a))) {
            m43303a(iArr3);
        }
    }

    /* renamed from: b */
    public static void m43310b(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13969m.m44005a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && C13969m.m44027c(24, iArr3, f30778b))) {
            int[] iArr4 = f30779c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(24, iArr3, f30779c.length);
            }
        }
    }

    /* renamed from: c */
    public static void m43312c(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] a = C13969m.m44011a(24);
        C13965i.m43976a(iArr, iArr2, a);
        m43311c(a, iArr3);
    }

    /* renamed from: d */
    public static void m43313d(int[] iArr, int[] iArr2) {
        int[] a = C13969m.m44011a(24);
        C13965i.m43975a(iArr, a);
        m43311c(a, iArr2);
    }

    /* renamed from: e */
    public static void m43315e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && C13969m.m44027c(12, iArr2, f30777a))) {
            m43303a(iArr2);
        }
    }

    /* renamed from: a */
    public static void m43305a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && C13969m.m44027c(12, iArr2, f30777a))) {
            m43303a(iArr2);
        }
    }

    /* renamed from: c */
    public static void m43311c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[17]) & 4294967295L;
        long j2 = ((long) iArr[20]) & 4294967295L;
        long j3 = ((long) iArr[21]) & 4294967295L;
        long j4 = ((long) iArr[19]) & 4294967295L;
        long j5 = ((long) iArr[22]) & 4294967295L;
        long j6 = ((long) iArr[18]) & 4294967295L;
        long j7 = ((long) iArr[23]) & 4294967295L;
        long j8 = ((long) iArr[16]) & 4294967295L;
        long j9 = ((((long) iArr[12]) & 4294967295L) + j2) - 1;
        long j10 = j2;
        long j11 = (((long) iArr[13]) & 4294967295L) + j5;
        long j12 = (((long) iArr[14]) & 4294967295L) + j5 + j7;
        long j13 = (((long) iArr[15]) & 4294967295L) + j7;
        long j14 = j + j3;
        long j15 = j3 - j7;
        long j16 = j9 + j15;
        long j17 = j5 - j7;
        long j18 = (((long) iArr[0]) & 4294967295L) + j16 + 0;
        iArr3[0] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[1]) & 4294967295L) + j7) - j9) + j11;
        iArr3[1] = (int) j19;
        long j20 = (j19 >> 32) + (((((long) iArr[2]) & 4294967295L) - j3) - j11) + j12;
        iArr3[2] = (int) j20;
        long j21 = (j20 >> 32) + ((((long) iArr[3]) & 4294967295L) - j12) + j13 + j16;
        iArr3[3] = (int) j21;
        long j22 = (j21 >> 32) + (((((((long) iArr[4]) & 4294967295L) + j8) + j3) + j11) - j13) + j16;
        iArr3[4] = (int) j22;
        long j23 = (j22 >> 32) + ((((long) iArr[5]) & 4294967295L) - j8) + j11 + j12 + j14;
        iArr3[5] = (int) j23;
        long j24 = (j23 >> 32) + (((((long) iArr[6]) & 4294967295L) + j6) - j) + j12 + j13;
        iArr3[6] = (int) j24;
        long j25 = (j24 >> 32) + ((((((long) iArr[7]) & 4294967295L) + j8) + j4) - j6) + j13;
        iArr3[7] = (int) j25;
        long j26 = (j25 >> 32) + (((((((long) iArr[8]) & 4294967295L) + j8) + j) + j10) - j4);
        iArr3[8] = (int) j26;
        long j27 = (j26 >> 32) + (((((long) iArr[9]) & 4294967295L) + j6) - j10) + j14;
        iArr3[9] = (int) j27;
        long j28 = (j27 >> 32) + ((((((long) iArr[10]) & 4294967295L) + j6) + j4) - j15) + j17;
        iArr3[10] = (int) j28;
        long j29 = (j28 >> 32) + ((((((long) iArr[11]) & 4294967295L) + j4) + j10) - j17);
        iArr3[11] = (int) j29;
        m43302a((int) ((j29 >> 32) + 1), iArr3);
    }

    /* renamed from: d */
    public static void m43314d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13969m.m44026c(12, iArr, iArr2, iArr3) != 0) {
            m43308b(iArr3);
        }
    }

    /* renamed from: b */
    public static void m43309b(int[] iArr, int[] iArr2) {
        if (C13969m.m44033e(12, iArr)) {
            C13969m.m44035g(12, iArr2);
        } else {
            C13969m.m44026c(12, f30777a, iArr, iArr2);
        }
    }

    /* renamed from: a */
    public static int[] m43307a(BigInteger bigInteger) {
        int[] a = C13969m.m44012a(384, bigInteger);
        if (a[11] == -1 && C13969m.m44027c(12, a, f30777a)) {
            C13969m.m44032e(12, f30777a, a);
        }
        return a;
    }

    /* renamed from: b */
    private static void m43308b(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + (((long) iArr[1]) & 4294967295L) + 1;
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + ((4294967295L & ((long) iArr[4])) - 1);
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            C13969m.m43997a(12, iArr, 5);
        }
    }

    /* renamed from: a */
    public static void m43302a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = (j3 >> 32) + ((((long) iArr[1]) & 4294967295L) - j2);
            iArr[1] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j5 = j6 >> 32;
            }
            long j7 = j5 + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = (j7 >> 32) + (4294967295L & ((long) iArr[4])) + j2;
            iArr[4] = (int) j8;
            j = j8 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C13969m.m44016b(12, iArr, 5) != 0) || (iArr[11] == -1 && C13969m.m44027c(12, iArr, f30777a))) {
            m43303a(iArr);
        }
    }

    /* renamed from: a */
    public static void m43304a(int[] iArr, int i, int[] iArr2) {
        int[] a = C13969m.m44011a(24);
        C13965i.m43975a(iArr, a);
        m43311c(a, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13965i.m43975a(iArr2, a);
                m43311c(a, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m43303a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - 1);
        iArr[1] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j3 = j4 >> 32;
        }
        long j5 = j3 + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = (j5 >> 32) + (4294967295L & ((long) iArr[4])) + 1;
        iArr[4] = (int) j6;
        if ((j6 >> 32) != 0) {
            C13969m.m44016b(12, iArr, 5);
        }
    }
}
