package p602m.p613d.p653e.p654a.p655x.p657b;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.b.b */
/* compiled from: SM2P256V1Field */
public class C13842b {

    /* renamed from: a */
    static final int[] f30711a = {-1, -1, 0, -1, -1, -1, -1, -2};

    /* renamed from: b */
    static final int[] f30712b = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    /* renamed from: a */
    public static void m42704a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13963g.m43939a(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && C13963g.m43960c(iArr3, f30711a))) {
            m42701a(iArr3);
        }
    }

    /* renamed from: b */
    public static void m42708b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] c = C13963g.m43961c();
        C13963g.m43959c(iArr, iArr2, c);
        m42709c(c, iArr3);
    }

    /* renamed from: c */
    public static void m42710c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13963g.m43962d(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && C13969m.m44027c(16, iArr3, f30712b))) {
            C13969m.m44032e(16, f30712b, iArr3);
        }
    }

    /* renamed from: d */
    public static void m42711d(int[] iArr, int[] iArr2) {
        int[] c = C13963g.m43961c();
        C13963g.m43964d(iArr, c);
        m42709c(c, iArr2);
    }

    /* renamed from: e */
    public static void m42713e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && C13963g.m43960c(iArr2, f30711a))) {
            m42701a(iArr2);
        }
    }

    /* renamed from: a */
    public static void m42703a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && C13963g.m43960c(iArr2, f30711a))) {
            m42701a(iArr2);
        }
    }

    /* renamed from: b */
    public static void m42707b(int[] iArr, int[] iArr2) {
        if (C13963g.m43949b(iArr)) {
            C13963g.m43963d(iArr2);
        } else {
            C13963g.m43967e(f30711a, iArr, iArr2);
        }
    }

    /* renamed from: c */
    public static void m42709c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = j5;
        long j15 = (((long) iArr[0]) & 4294967295L) + j13 + j6 + j7 + j8 + 0;
        iArr3[0] = (int) j15;
        long j16 = j4;
        long j17 = (j15 >> 32) + (((((long) iArr[1]) & 4294967295L) + j13) - j) + j7 + j8;
        iArr3[1] = (int) j17;
        long j18 = j8;
        long j19 = (j17 >> 32) + ((((long) iArr[2]) & 4294967295L) - j12);
        iArr3[2] = (int) j19;
        long j20 = (j19 >> 32) + ((((((long) iArr[3]) & 4294967295L) + j13) - j2) - j3) + j6;
        iArr3[3] = (int) j20;
        long j21 = (j20 >> 32) + ((((((long) iArr[4]) & 4294967295L) + j13) - j9) - j) + j7;
        iArr3[4] = (int) j21;
        long j22 = (j21 >> 32) + (((long) iArr[5]) & 4294967295L) + j11 + j3;
        iArr3[5] = (int) j22;
        long j23 = (j22 >> 32) + (((long) iArr[6]) & 4294967295L) + j16 + j7 + j18;
        iArr3[6] = (int) j23;
        long j24 = (j23 >> 32) + (4294967295L & ((long) iArr[7])) + j13 + j11 + j14;
        iArr3[7] = (int) j24;
        m42700a((int) (j24 >> 32), iArr3);
    }

    /* renamed from: d */
    public static void m42712d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13963g.m43967e(iArr, iArr2, iArr3) != 0) {
            m42706b(iArr3);
        }
    }

    /* renamed from: a */
    public static int[] m42705a(BigInteger bigInteger) {
        int[] a = C13963g.m43946a(bigInteger);
        if ((a[7] >>> 1) >= Integer.MAX_VALUE && C13963g.m43960c(a, f30711a)) {
            C13963g.m43966e(f30711a, a);
        }
        return a;
    }

    /* renamed from: b */
    private static void m42706b(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (((long) iArr[2]) & 4294967295L) + 1;
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + ((4294967295L & ((long) iArr[7])) - 1));
    }

    /* renamed from: a */
    public static void m42700a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + ((((long) iArr[2]) & 4294967295L) - j2);
            iArr[2] = (int) j6;
            long j7 = (j6 >> 32) + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = j8 + (4294967295L & ((long) iArr[7])) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && C13963g.m43960c(iArr, f30711a))) {
            m42701a(iArr);
        }
    }

    /* renamed from: a */
    public static void m42702a(int[] iArr, int i, int[] iArr2) {
        int[] c = C13963g.m43961c();
        C13963g.m43964d(iArr, c);
        m42709c(c, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13963g.m43964d(iArr2, c);
                m42709c(c, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m42701a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((((long) iArr[2]) & 4294967295L) - 1);
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + (4294967295L & ((long) iArr[7])) + 1);
    }
}
