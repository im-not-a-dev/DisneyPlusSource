package p602m.p613d.p653e.p654a.p655x.p656a;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13963g;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.a.b */
/* compiled from: Curve25519Field */
public class C13838b {

    /* renamed from: a */
    static final int[] f30704a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b */
    private static final int[] f30705b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    /* renamed from: a */
    public static void m42658a(int[] iArr, int[] iArr2, int[] iArr3) {
        C13963g.m43939a(iArr, iArr2, iArr3);
        if (C13963g.m43960c(iArr3, f30704a)) {
            m42663c(iArr3);
        }
    }

    /* renamed from: b */
    public static void m42662b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] c = C13963g.m43961c();
        C13963g.m43959c(iArr, iArr2, c);
        m42664c(c, iArr3);
    }

    /* renamed from: c */
    public static void m42665c(int[] iArr, int[] iArr2, int[] iArr3) {
        C13963g.m43962d(iArr, iArr2, iArr3);
        if (C13969m.m44027c(16, iArr3, f30705b)) {
            m42660b(iArr3);
        }
    }

    /* renamed from: d */
    public static void m42666d(int[] iArr, int[] iArr2) {
        int[] c = C13963g.m43961c();
        C13963g.m43964d(iArr, c);
        m42664c(c, iArr2);
    }

    /* renamed from: e */
    public static void m42668e(int[] iArr, int[] iArr2) {
        C13969m.m44002a(8, iArr, 0, iArr2);
        if (C13963g.m43960c(iArr2, f30704a)) {
            m42663c(iArr2);
        }
    }

    /* renamed from: a */
    public static void m42657a(int[] iArr, int[] iArr2) {
        C13969m.m44030d(8, iArr, iArr2);
        if (C13963g.m43960c(iArr2, f30704a)) {
            m42663c(iArr2);
        }
    }

    /* renamed from: b */
    public static void m42661b(int[] iArr, int[] iArr2) {
        if (C13963g.m43949b(iArr)) {
            C13963g.m43963d(iArr2);
        } else {
            C13963g.m43967e(f30704a, iArr, iArr2);
        }
    }

    /* renamed from: c */
    public static void m42664c(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        C13969m.m44001a(8, iArr, 8, i, iArr2, 0);
        int a = C13963g.m43934a(19, iArr, iArr2) << 1;
        int i2 = iArr2[7];
        iArr2[7] = (i2 & Integer.MAX_VALUE) + C13969m.m44014b(7, (a + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (C13963g.m43960c(iArr2, f30704a)) {
            m42663c(iArr2);
        }
    }

    /* renamed from: d */
    public static void m42667d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13963g.m43967e(iArr, iArr2, iArr3) != 0) {
            m42654a(iArr3);
        }
    }

    /* renamed from: a */
    public static int[] m42659a(BigInteger bigInteger) {
        int[] a = C13963g.m43946a(bigInteger);
        while (C13963g.m43960c(a, f30704a)) {
            C13963g.m43966e(f30704a, a);
        }
        return a;
    }

    /* renamed from: b */
    private static int m42660b(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) f30705b[0]) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C13969m.m43997a(8, iArr, 1);
        }
        long j3 = j2 + (((long) iArr[8]) & 4294967295L) + 19;
        iArr[8] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            j4 = (long) C13969m.m44016b(15, iArr, 9);
        }
        long j5 = j4 + ((((long) iArr[15]) & 4294967295L) - (4294967295L & ((long) (f30705b[15] + 1))));
        iArr[15] = (int) j5;
        return (int) (j5 >> 32);
    }

    /* renamed from: a */
    public static void m42655a(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + C13969m.m44014b(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (C13963g.m43960c(iArr, f30704a)) {
            m42663c(iArr);
        }
    }

    /* renamed from: c */
    private static int m42663c(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C13969m.m44016b(7, iArr, 1);
        }
        long j3 = j2 + ((4294967295L & ((long) iArr[7])) - 2147483648L);
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    /* renamed from: a */
    public static void m42656a(int[] iArr, int i, int[] iArr2) {
        int[] c = C13963g.m43961c();
        C13963g.m43964d(iArr, c);
        m42664c(c, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13963g.m43964d(iArr2, c);
                m42664c(c, iArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m42654a(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C13969m.m43997a(7, iArr, 1);
        }
        long j3 = j2 + (4294967295L & ((long) iArr[7])) + 2147483648L;
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }
}
