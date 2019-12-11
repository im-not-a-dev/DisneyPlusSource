package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13962f;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.x */
/* compiled from: SecP224K1Field */
public class C13936x {

    /* renamed from: a */
    static final int[] f30817a = {-6803, -2, -1, -1, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30818b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30819c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    /* renamed from: a */
    public static void m43719a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13962f.m43914a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && C13962f.m43926c(iArr3, f30817a))) {
            C13969m.m43993a(7, 6803, iArr3);
        }
    }

    /* renamed from: b */
    public static void m43722b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] b = C13962f.m43923b();
        C13962f.m43925c(iArr, iArr2, b);
        m43723c(b, iArr3);
    }

    /* renamed from: c */
    public static void m43724c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13962f.m43927d(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && C13969m.m44027c(14, iArr3, f30818b))) {
            int[] iArr4 = f30819c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(14, iArr3, f30819c.length);
            }
        }
    }

    /* renamed from: d */
    public static void m43725d(int[] iArr, int[] iArr2) {
        int[] b = C13962f.m43923b();
        C13962f.m43929d(iArr, b);
        m43723c(b, iArr2);
    }

    /* renamed from: e */
    public static void m43727e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && C13962f.m43926c(iArr2, f30817a))) {
            C13969m.m43993a(7, 6803, iArr2);
        }
    }

    /* renamed from: a */
    public static void m43718a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && C13962f.m43926c(iArr2, f30817a))) {
            C13969m.m43993a(7, 6803, iArr2);
        }
    }

    /* renamed from: b */
    public static void m43721b(int[] iArr, int[] iArr2) {
        if (C13962f.m43921b(iArr)) {
            C13962f.m43928d(iArr2);
        } else {
            C13962f.m43931e(f30817a, iArr, iArr2);
        }
    }

    /* renamed from: d */
    public static void m43726d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13962f.m43931e(iArr, iArr2, iArr3) != 0) {
            C13969m.m44022c(7, 6803, iArr3);
        }
    }

    /* renamed from: c */
    public static void m43723c(int[] iArr, int[] iArr2) {
        if (C13962f.m43912a(6803, C13962f.m43915a(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && C13962f.m43926c(iArr2, f30817a))) {
            C13969m.m43993a(7, 6803, iArr2);
        }
    }

    /* renamed from: a */
    public static int[] m43720a(BigInteger bigInteger) {
        int[] a = C13962f.m43919a(bigInteger);
        if (a[6] == -1 && C13962f.m43926c(a, f30817a)) {
            C13969m.m43993a(7, 6803, a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m43716a(int i, int[] iArr) {
        if ((i != 0 && C13962f.m43911a(6803, i, iArr, 0) != 0) || (iArr[6] == -1 && C13962f.m43926c(iArr, f30817a))) {
            C13969m.m43993a(7, 6803, iArr);
        }
    }

    /* renamed from: a */
    public static void m43717a(int[] iArr, int i, int[] iArr2) {
        int[] b = C13962f.m43923b();
        C13962f.m43929d(iArr, b);
        m43723c(b, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13962f.m43929d(iArr2, b);
                m43723c(b, iArr2);
            } else {
                return;
            }
        }
    }
}
