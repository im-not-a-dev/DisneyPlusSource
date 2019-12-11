package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.f0 */
/* compiled from: SecP256K1Field */
public class C13866f0 {

    /* renamed from: a */
    static final int[] f30740a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30741b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30742c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    /* renamed from: a */
    public static void m42972a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13963g.m43939a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && C13963g.m43960c(iArr3, f30740a))) {
            C13969m.m43993a(8, 977, iArr3);
        }
    }

    /* renamed from: b */
    public static void m42975b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] c = C13963g.m43961c();
        C13963g.m43959c(iArr, iArr2, c);
        m42976c(c, iArr3);
    }

    /* renamed from: c */
    public static void m42977c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13963g.m43962d(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && C13969m.m44027c(16, iArr3, f30741b))) {
            int[] iArr4 = f30742c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(16, iArr3, f30742c.length);
            }
        }
    }

    /* renamed from: d */
    public static void m42978d(int[] iArr, int[] iArr2) {
        int[] c = C13963g.m43961c();
        C13963g.m43964d(iArr, c);
        m42976c(c, iArr2);
    }

    /* renamed from: e */
    public static void m42980e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && C13963g.m43960c(iArr2, f30740a))) {
            C13969m.m43993a(8, 977, iArr2);
        }
    }

    /* renamed from: a */
    public static void m42971a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && C13963g.m43960c(iArr2, f30740a))) {
            C13969m.m43993a(8, 977, iArr2);
        }
    }

    /* renamed from: b */
    public static void m42974b(int[] iArr, int[] iArr2) {
        if (C13963g.m43949b(iArr)) {
            C13963g.m43963d(iArr2);
        } else {
            C13963g.m43967e(f30740a, iArr, iArr2);
        }
    }

    /* renamed from: d */
    public static void m42979d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13963g.m43967e(iArr, iArr2, iArr3) != 0) {
            C13969m.m44022c(8, 977, iArr3);
        }
    }

    /* renamed from: c */
    public static void m42976c(int[] iArr, int[] iArr2) {
        if (C13963g.m43933a(977, C13963g.m43940a(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && C13963g.m43960c(iArr2, f30740a))) {
            C13969m.m43993a(8, 977, iArr2);
        }
    }

    /* renamed from: a */
    public static int[] m42973a(BigInteger bigInteger) {
        int[] a = C13963g.m43946a(bigInteger);
        if (a[7] == -1 && C13963g.m43960c(a, f30740a)) {
            C13963g.m43966e(f30740a, a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m42969a(int i, int[] iArr) {
        if ((i != 0 && C13963g.m43932a(977, i, iArr, 0) != 0) || (iArr[7] == -1 && C13963g.m43960c(iArr, f30740a))) {
            C13969m.m43993a(8, 977, iArr);
        }
    }

    /* renamed from: a */
    public static void m42970a(int[] iArr, int i, int[] iArr2) {
        int[] c = C13963g.m43961c();
        C13963g.m43964d(iArr, c);
        m42976c(c, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13963g.m43964d(iArr2, c);
                m42976c(c, iArr2);
            } else {
                return;
            }
        }
    }
}
