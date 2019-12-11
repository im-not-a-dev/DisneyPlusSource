package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13967k;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.r0 */
/* compiled from: SecP521R1Field */
public class C13914r0 {

    /* renamed from: a */
    static final int[] f30795a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    /* renamed from: a */
    public static void m43480a(int[] iArr, int[] iArr2, int[] iArr3) {
        int a = C13969m.m44005a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (a > 511 || (a == 511 && C13969m.m44020b(16, iArr3, f30795a))) {
            a = (a + C13969m.m44023c(16, iArr3)) & 511;
        }
        iArr3[16] = a;
    }

    /* renamed from: b */
    protected static void m43483b(int[] iArr, int[] iArr2, int[] iArr3) {
        C13967k.m43985a(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = C13969m.m43996a(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    /* renamed from: c */
    public static void m43485c(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] a = C13969m.m44011a(33);
        m43483b(iArr, iArr2, a);
        m43486d(a, iArr3);
    }

    /* renamed from: d */
    public static void m43486d(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int a = (C13969m.m43999a(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + C13969m.m44004a(16, iArr, iArr2);
        if (a > 511 || (a == 511 && C13969m.m44020b(16, iArr2, f30795a))) {
            a = (a + C13969m.m44023c(16, iArr2)) & 511;
        }
        iArr2[16] = a;
    }

    /* renamed from: e */
    public static void m43488e(int[] iArr, int[] iArr2) {
        int[] a = C13969m.m44011a(33);
        m43482b(iArr, a);
        m43486d(a, iArr2);
    }

    /* renamed from: f */
    public static void m43489f(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (C13969m.m44002a(16, iArr, i << 23, iArr2) | (i << 1)) & 511;
    }

    /* renamed from: b */
    protected static void m43482b(int[] iArr, int[] iArr2) {
        C13967k.m43984a(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = C13969m.m43995a(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    /* renamed from: c */
    public static void m43484c(int[] iArr, int[] iArr2) {
        if (C13969m.m44033e(17, iArr)) {
            C13969m.m44035g(17, iArr2);
        } else {
            C13969m.m44026c(17, f30795a, iArr, iArr2);
        }
    }

    /* renamed from: a */
    public static void m43479a(int[] iArr, int[] iArr2) {
        int d = C13969m.m44030d(16, iArr, iArr2) + iArr[16];
        if (d > 511 || (d == 511 && C13969m.m44020b(16, iArr2, f30795a))) {
            d = (d + C13969m.m44023c(16, iArr2)) & 511;
        }
        iArr2[16] = d;
    }

    /* renamed from: d */
    public static void m43487d(int[] iArr, int[] iArr2, int[] iArr3) {
        int c = (C13969m.m44026c(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (c < 0) {
            c = (c + C13969m.m44015b(16, iArr3)) & 511;
        }
        iArr3[16] = c;
    }

    /* renamed from: a */
    public static int[] m43481a(BigInteger bigInteger) {
        int[] a = C13969m.m44012a(521, bigInteger);
        if (C13969m.m44020b(17, a, f30795a)) {
            C13969m.m44035g(17, a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m43477a(int[] iArr) {
        int i = iArr[16];
        int b = C13969m.m44014b(16, i >>> 9, iArr) + (i & 511);
        if (b > 511 || (b == 511 && C13969m.m44020b(16, iArr, f30795a))) {
            b = (b + C13969m.m44023c(16, iArr)) & 511;
        }
        iArr[16] = b;
    }

    /* renamed from: a */
    public static void m43478a(int[] iArr, int i, int[] iArr2) {
        int[] a = C13969m.m44011a(33);
        m43482b(iArr, a);
        m43486d(a, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                m43482b(iArr2, a);
                m43486d(a, iArr2);
            } else {
                return;
            }
        }
    }
}
