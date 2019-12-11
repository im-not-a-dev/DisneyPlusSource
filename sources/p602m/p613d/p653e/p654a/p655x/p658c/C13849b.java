package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13959c;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.b */
/* compiled from: SecP128R1Field */
public class C13849b {

    /* renamed from: a */
    static final int[] f30720a = {-1, -1, -1, -3};

    /* renamed from: b */
    static final int[] f30721b = {1, 0, 0, 4, -2, -1, 3, -4};

    /* renamed from: c */
    private static final int[] f30722c = {-1, -1, -1, -5, 1, 0, -4, 3};

    /* renamed from: a */
    public static void m42787a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13959c.m43833a(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && C13959c.m43842b(iArr3, f30720a))) {
            m42784a(iArr3);
        }
    }

    /* renamed from: b */
    public static void m42791b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] c = C13959c.m43850c();
        C13959c.m43849c(iArr, iArr2, c);
        m42792c(c, iArr3);
    }

    /* renamed from: c */
    public static void m42793c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13959c.m43852d(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && C13963g.m43960c(iArr3, f30721b))) {
            int[] iArr4 = f30722c;
            C13969m.m44004a(iArr4.length, iArr4, iArr3);
        }
    }

    /* renamed from: d */
    public static void m42794d(int[] iArr, int[] iArr2) {
        int[] c = C13959c.m43850c();
        C13959c.m43848c(iArr, c);
        m42792c(c, iArr2);
    }

    /* renamed from: e */
    public static void m42796e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && C13959c.m43842b(iArr2, f30720a))) {
            m42784a(iArr2);
        }
    }

    /* renamed from: a */
    public static void m42786a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && C13959c.m43842b(iArr2, f30720a))) {
            m42784a(iArr2);
        }
    }

    /* renamed from: b */
    public static void m42790b(int[] iArr, int[] iArr2) {
        if (C13959c.m43841b(iArr)) {
            C13959c.m43853d(iArr2);
        } else {
            C13959c.m43855e(f30720a, iArr, iArr2);
        }
    }

    /* renamed from: c */
    public static void m42792c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[7]) & 4294967295L;
        long j2 = (((long) iArr[3]) & 4294967295L) + j;
        long j3 = (((long) iArr[6]) & 4294967295L) + (j << 1);
        long j4 = (((long) iArr[2]) & 4294967295L) + j3;
        long j5 = (((long) iArr[5]) & 4294967295L) + (j3 << 1);
        long j6 = (((long) iArr[1]) & 4294967295L) + j5;
        long j7 = (((long) iArr[4]) & 4294967295L) + (j5 << 1);
        long j8 = (((long) iArr[0]) & 4294967295L) + j7;
        long j9 = j2 + (j7 << 1);
        iArr3[0] = (int) j8;
        long j10 = j6 + (j8 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = j4 + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = j9 + (j11 >>> 32);
        iArr3[3] = (int) j12;
        m42783a((int) (j12 >>> 32), iArr3);
    }

    /* renamed from: d */
    public static void m42795d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13959c.m43855e(iArr, iArr2, iArr3) != 0) {
            m42789b(iArr3);
        }
    }

    /* renamed from: a */
    public static int[] m42788a(BigInteger bigInteger) {
        int[] a = C13959c.m43839a(bigInteger);
        if ((a[3] >>> 1) >= 2147483646 && C13959c.m43842b(a, f30720a)) {
            C13959c.m43851d(f30720a, a);
        }
        return a;
    }

    /* renamed from: b */
    private static void m42789b(int[] iArr) {
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
        iArr[3] = (int) (j2 + ((4294967295L & ((long) iArr[3])) - 2));
    }

    /* renamed from: a */
    public static void m42783a(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (4294967295L & ((long) iArr[3])) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    /* renamed from: a */
    public static void m42785a(int[] iArr, int i, int[] iArr2) {
        int[] c = C13959c.m43850c();
        C13959c.m43848c(iArr, c);
        m42792c(c, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13959c.m43848c(iArr2, c);
                m42792c(c, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m42784a(int[] iArr) {
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
        iArr[3] = (int) (j2 + (4294967295L & ((long) iArr[3])) + 2);
    }
}
