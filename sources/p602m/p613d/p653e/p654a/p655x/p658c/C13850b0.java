package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13962f;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.b0 */
/* compiled from: SecP224R1Field */
public class C13850b0 {

    /* renamed from: a */
    static final int[] f30723a = {1, 0, 0, -1, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30724b = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30725c = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    /* renamed from: a */
    public static void m42801a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13962f.m43914a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && C13962f.m43926c(iArr3, f30723a))) {
            m42798a(iArr3);
        }
    }

    /* renamed from: b */
    public static void m42805b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] b = C13962f.m43923b();
        C13962f.m43925c(iArr, iArr2, b);
        m42806c(b, iArr3);
    }

    /* renamed from: c */
    public static void m42807c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13962f.m43927d(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && C13969m.m44027c(14, iArr3, f30724b))) {
            int[] iArr4 = f30725c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(14, iArr3, f30725c.length);
            }
        }
    }

    /* renamed from: d */
    public static void m42808d(int[] iArr, int[] iArr2) {
        int[] b = C13962f.m43923b();
        C13962f.m43929d(iArr, b);
        m42806c(b, iArr2);
    }

    /* renamed from: e */
    public static void m42810e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && C13962f.m43926c(iArr2, f30723a))) {
            m42798a(iArr2);
        }
    }

    /* renamed from: a */
    public static void m42800a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && C13962f.m43926c(iArr2, f30723a))) {
            m42798a(iArr2);
        }
    }

    /* renamed from: b */
    public static void m42804b(int[] iArr, int[] iArr2) {
        if (C13962f.m43921b(iArr)) {
            C13962f.m43928d(iArr2);
        } else {
            C13962f.m43931e(f30723a, iArr, iArr2);
        }
    }

    /* renamed from: d */
    public static void m42809d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13962f.m43931e(iArr, iArr2, iArr3) != 0) {
            m42803b(iArr3);
        }
    }

    /* renamed from: c */
    public static void m42806c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = j3;
        long j8 = (((long) iArr[9]) & 4294967295L) + j4;
        long j9 = j4;
        long j10 = ((((long) iArr[0]) & 4294967295L) - j5) + 0;
        long j11 = j10 & 4294967295L;
        long j12 = j2;
        long j13 = (j10 >> 32) + ((((long) iArr[1]) & 4294967295L) - j6);
        iArr3[1] = (int) j13;
        long j14 = (j13 >> 32) + ((((long) iArr[2]) & 4294967295L) - j8);
        iArr3[2] = (int) j14;
        long j15 = (j14 >> 32) + (((((long) iArr[3]) & 4294967295L) + j5) - j);
        long j16 = j15 & 4294967295L;
        long j17 = (j15 >> 32) + (((((long) iArr[4]) & 4294967295L) + j6) - j12);
        iArr3[4] = (int) j17;
        long j18 = (j17 >> 32) + (((((long) iArr[5]) & 4294967295L) + j8) - j7);
        iArr3[5] = (int) j18;
        long j19 = (j18 >> 32) + (((((long) iArr[6]) & 4294967295L) + j) - j9);
        iArr3[6] = (int) j19;
        long j20 = (j19 >> 32) + 1;
        long j21 = j16 + j20;
        long j22 = j11 - j20;
        iArr3[0] = (int) j22;
        long j23 = j22 >> 32;
        if (j23 != 0) {
            long j24 = j23 + (((long) iArr3[1]) & 4294967295L);
            iArr3[1] = (int) j24;
            long j25 = (j24 >> 32) + (4294967295L & ((long) iArr3[2]));
            iArr3[2] = (int) j25;
            j21 += j25 >> 32;
        }
        iArr3[3] = (int) j21;
        if (((j21 >> 32) != 0 && C13969m.m44016b(7, iArr3, 4) != 0) || (iArr3[6] == -1 && C13962f.m43926c(iArr3, f30723a))) {
            m42798a(iArr2);
        }
    }

    /* renamed from: a */
    public static int[] m42802a(BigInteger bigInteger) {
        int[] a = C13962f.m43919a(bigInteger);
        if (a[6] == -1 && C13962f.m43926c(a, f30723a)) {
            C13962f.m43930e(f30723a, a);
        }
        return a;
    }

    /* renamed from: b */
    private static void m42803b(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + ((4294967295L & ((long) iArr[3])) - 1);
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            C13969m.m43997a(7, iArr, 4);
        }
    }

    /* renamed from: a */
    public static void m42797a(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = ((((long) iArr[0]) & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + (4294967295L & ((long) iArr[3])) + j2;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C13969m.m44016b(7, iArr, 4) != 0) || (iArr[6] == -1 && C13962f.m43926c(iArr, f30723a))) {
            m42798a(iArr);
        }
    }

    /* renamed from: a */
    public static void m42799a(int[] iArr, int i, int[] iArr2) {
        int[] b = C13962f.m43923b();
        C13962f.m43929d(iArr, b);
        m42806c(b, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13962f.m43929d(iArr2, b);
                m42806c(b, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m42798a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (4294967295L & ((long) iArr[3])) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            C13969m.m44016b(7, iArr, 4);
        }
    }
}
