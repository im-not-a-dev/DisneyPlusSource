package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.p */
/* compiled from: SecP192K1Field */
public class C13905p {

    /* renamed from: a */
    static final int[] f30785a = {-4553, -2, -1, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30786b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30787c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    /* renamed from: a */
    public static void m43380a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13961e.m43882a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && C13961e.m43895b(iArr3, f30785a))) {
            C13969m.m43993a(6, 4553, iArr3);
        }
    }

    /* renamed from: b */
    public static void m43383b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] c = C13961e.m43905c();
        C13961e.m43904c(iArr, iArr2, c);
        m43384c(c, iArr3);
    }

    /* renamed from: c */
    public static void m43385c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13961e.m43907d(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && C13969m.m44027c(12, iArr3, f30786b))) {
            int[] iArr4 = f30787c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(12, iArr3, f30787c.length);
            }
        }
    }

    /* renamed from: d */
    public static void m43386d(int[] iArr, int[] iArr2) {
        int[] c = C13961e.m43905c();
        C13961e.m43903c(iArr, c);
        m43384c(c, iArr2);
    }

    /* renamed from: e */
    public static void m43388e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && C13961e.m43895b(iArr2, f30785a))) {
            C13969m.m43993a(6, 4553, iArr2);
        }
    }

    /* renamed from: a */
    public static void m43379a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && C13961e.m43895b(iArr2, f30785a))) {
            C13969m.m43993a(6, 4553, iArr2);
        }
    }

    /* renamed from: b */
    public static void m43382b(int[] iArr, int[] iArr2) {
        if (C13961e.m43893b(iArr)) {
            C13961e.m43908d(iArr2);
        } else {
            C13961e.m43910e(f30785a, iArr, iArr2);
        }
    }

    /* renamed from: d */
    public static void m43387d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13961e.m43910e(iArr, iArr2, iArr3) != 0) {
            C13969m.m44022c(6, 4553, iArr3);
        }
    }

    /* renamed from: c */
    public static void m43384c(int[] iArr, int[] iArr2) {
        if (C13961e.m43878a(4553, C13961e.m43883a(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && C13961e.m43895b(iArr2, f30785a))) {
            C13969m.m43993a(6, 4553, iArr2);
        }
    }

    /* renamed from: a */
    public static int[] m43381a(BigInteger bigInteger) {
        int[] a = C13961e.m43890a(bigInteger);
        if (a[5] == -1 && C13961e.m43895b(a, f30785a)) {
            C13961e.m43906d(f30785a, a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m43377a(int i, int[] iArr) {
        if ((i != 0 && C13961e.m43877a(4553, i, iArr, 0) != 0) || (iArr[5] == -1 && C13961e.m43895b(iArr, f30785a))) {
            C13969m.m43993a(6, 4553, iArr);
        }
    }

    /* renamed from: a */
    public static void m43378a(int[] iArr, int i, int[] iArr2) {
        int[] c = C13961e.m43905c();
        C13961e.m43903c(iArr, c);
        m43384c(c, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13961e.m43903c(iArr2, c);
                m43384c(c, iArr2);
            } else {
                return;
            }
        }
    }
}
