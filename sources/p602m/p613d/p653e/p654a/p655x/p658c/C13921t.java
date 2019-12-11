package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.t */
/* compiled from: SecP192R1Field */
public class C13921t {

    /* renamed from: a */
    static final int[] f30803a = {-1, -1, -2, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30804b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30805c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    /* renamed from: a */
    public static void m43557a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13961e.m43882a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && C13961e.m43895b(iArr3, f30803a))) {
            m43554a(iArr3);
        }
    }

    /* renamed from: b */
    public static void m43561b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] c = C13961e.m43905c();
        C13961e.m43904c(iArr, iArr2, c);
        m43562c(c, iArr3);
    }

    /* renamed from: c */
    public static void m43563c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13961e.m43907d(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && C13969m.m44027c(12, iArr3, f30804b))) {
            int[] iArr4 = f30805c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(12, iArr3, f30805c.length);
            }
        }
    }

    /* renamed from: d */
    public static void m43564d(int[] iArr, int[] iArr2) {
        int[] c = C13961e.m43905c();
        C13961e.m43903c(iArr, c);
        m43562c(c, iArr2);
    }

    /* renamed from: e */
    public static void m43566e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && C13961e.m43895b(iArr2, f30803a))) {
            m43554a(iArr2);
        }
    }

    /* renamed from: a */
    public static void m43556a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && C13961e.m43895b(iArr2, f30803a))) {
            m43554a(iArr2);
        }
    }

    /* renamed from: b */
    public static void m43560b(int[] iArr, int[] iArr2) {
        if (C13961e.m43893b(iArr)) {
            C13961e.m43908d(iArr2);
        } else {
            C13961e.m43910e(f30803a, iArr, iArr2);
        }
    }

    /* renamed from: d */
    public static void m43565d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13961e.m43910e(iArr, iArr2, iArr3) != 0) {
            m43559b(iArr3);
        }
    }

    /* renamed from: c */
    public static void m43562c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = j2;
        long j8 = (((long) iArr[0]) & 4294967295L) + j5 + 0;
        int i = (int) j8;
        long j9 = j;
        long j10 = (j8 >> 32) + (((long) iArr[1]) & 4294967295L) + j6;
        iArr3[1] = (int) j10;
        long j11 = j5 + j3;
        long j12 = j6 + j4;
        long j13 = (j10 >> 32) + (((long) iArr[2]) & 4294967295L) + j11;
        long j14 = j13 & 4294967295L;
        long j15 = (j13 >> 32) + (((long) iArr[3]) & 4294967295L) + j12;
        iArr3[3] = (int) j15;
        long j16 = j12 - j7;
        long j17 = (j15 >> 32) + (((long) iArr[4]) & 4294967295L) + (j11 - j9);
        iArr3[4] = (int) j17;
        long j18 = (j17 >> 32) + (((long) iArr[5]) & 4294967295L) + j16;
        iArr3[5] = (int) j18;
        long j19 = j18 >> 32;
        long j20 = j14 + j19;
        long j21 = j19 + (((long) i) & 4294967295L);
        iArr3[0] = (int) j21;
        long j22 = j21 >> 32;
        if (j22 != 0) {
            long j23 = j22 + (4294967295L & ((long) iArr3[1]));
            iArr3[1] = (int) j23;
            j20 += j23 >> 32;
        }
        iArr3[2] = (int) j20;
        if (((j20 >> 32) != 0 && C13969m.m44016b(6, iArr3, 3) != 0) || (iArr3[5] == -1 && C13961e.m43895b(iArr3, f30803a))) {
            m43554a(iArr2);
        }
    }

    /* renamed from: a */
    public static int[] m43558a(BigInteger bigInteger) {
        int[] a = C13961e.m43890a(bigInteger);
        if (a[5] == -1 && C13961e.m43895b(a, f30803a)) {
            C13961e.m43906d(f30803a, a);
        }
        return a;
    }

    /* renamed from: b */
    private static void m43559b(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((4294967295L & ((long) iArr[2])) - 1);
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            C13969m.m43997a(6, iArr, 3);
        }
    }

    /* renamed from: a */
    public static void m43553a(int i, int[] iArr) {
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
            long j6 = j4 + (4294967295L & ((long) iArr[2])) + j2;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C13969m.m44016b(6, iArr, 3) != 0) || (iArr[5] == -1 && C13961e.m43895b(iArr, f30803a))) {
            m43554a(iArr);
        }
    }

    /* renamed from: a */
    public static void m43555a(int[] iArr, int i, int[] iArr2) {
        int[] c = C13961e.m43905c();
        C13961e.m43903c(iArr, c);
        m43562c(c, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13961e.m43903c(iArr2, c);
                m43562c(c, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m43554a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (4294967295L & ((long) iArr[2])) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            C13969m.m44016b(6, iArr, 3);
        }
    }
}
