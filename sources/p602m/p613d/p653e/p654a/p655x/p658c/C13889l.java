package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13960d;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.l */
/* compiled from: SecP160R2Field */
public class C13889l {

    /* renamed from: a */
    static final int[] f30767a = {-21389, -2, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30768b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30769c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    /* renamed from: a */
    public static void m43218a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13960d.m43859a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && C13960d.m43868b(iArr3, f30767a))) {
            C13969m.m43993a(5, 21389, iArr3);
        }
    }

    /* renamed from: b */
    public static void m43221b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] b = C13960d.m43869b();
        C13960d.m43872c(iArr, iArr2, b);
        m43222c(b, iArr3);
    }

    /* renamed from: c */
    public static void m43223c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13960d.m43874d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && C13969m.m44027c(10, iArr3, f30768b))) {
            int[] iArr4 = f30769c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(10, iArr3, f30769c.length);
            }
        }
    }

    /* renamed from: d */
    public static void m43224d(int[] iArr, int[] iArr2) {
        int[] b = C13960d.m43869b();
        C13960d.m43871c(iArr, b);
        m43222c(b, iArr2);
    }

    /* renamed from: e */
    public static void m43226e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && C13960d.m43868b(iArr2, f30767a))) {
            C13969m.m43993a(5, 21389, iArr2);
        }
    }

    /* renamed from: a */
    public static void m43217a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && C13960d.m43868b(iArr2, f30767a))) {
            C13969m.m43993a(5, 21389, iArr2);
        }
    }

    /* renamed from: b */
    public static void m43220b(int[] iArr, int[] iArr2) {
        if (C13960d.m43867b(iArr)) {
            C13960d.m43875d(iArr2);
        } else {
            C13960d.m43876e(f30767a, iArr, iArr2);
        }
    }

    /* renamed from: d */
    public static void m43225d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13960d.m43876e(iArr, iArr2, iArr3) != 0) {
            C13969m.m44022c(5, 21389, iArr3);
        }
    }

    /* renamed from: c */
    public static void m43222c(int[] iArr, int[] iArr2) {
        if (C13960d.m43857a(21389, C13960d.m43860a(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && C13960d.m43868b(iArr2, f30767a))) {
            C13969m.m43993a(5, 21389, iArr2);
        }
    }

    /* renamed from: a */
    public static int[] m43219a(BigInteger bigInteger) {
        int[] a = C13960d.m43864a(bigInteger);
        if (a[4] == -1 && C13960d.m43868b(a, f30767a)) {
            C13960d.m43873d(f30767a, a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m43215a(int i, int[] iArr) {
        if ((i != 0 && C13960d.m43856a(21389, i, iArr, 0) != 0) || (iArr[4] == -1 && C13960d.m43868b(iArr, f30767a))) {
            C13969m.m43993a(5, 21389, iArr);
        }
    }

    /* renamed from: a */
    public static void m43216a(int[] iArr, int i, int[] iArr2) {
        int[] b = C13960d.m43869b();
        C13960d.m43871c(iArr, b);
        m43222c(b, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13960d.m43871c(iArr2, b);
                m43222c(b, iArr2);
            } else {
                return;
            }
        }
    }
}
