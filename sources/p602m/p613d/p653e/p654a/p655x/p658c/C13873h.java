package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13960d;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.h */
/* compiled from: SecP160R1Field */
public class C13873h {

    /* renamed from: a */
    static final int[] f30750a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* renamed from: b */
    static final int[] f30751b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* renamed from: c */
    private static final int[] f30752c = {-1, -1073741826, -1, -1, -1, 1, 1};

    /* renamed from: a */
    public static void m43056a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13960d.m43859a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && C13960d.m43868b(iArr3, f30750a))) {
            C13969m.m44014b(5, -2147483647, iArr3);
        }
    }

    /* renamed from: b */
    public static void m43059b(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] b = C13960d.m43869b();
        C13960d.m43872c(iArr, iArr2, b);
        m43060c(b, iArr3);
    }

    /* renamed from: c */
    public static void m43061c(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13960d.m43874d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && C13969m.m44027c(10, iArr3, f30751b))) {
            int[] iArr4 = f30752c;
            if (C13969m.m44004a(iArr4.length, iArr4, iArr3) != 0) {
                C13969m.m44016b(10, iArr3, f30752c.length);
            }
        }
    }

    /* renamed from: d */
    public static void m43062d(int[] iArr, int[] iArr2) {
        int[] b = C13960d.m43869b();
        C13960d.m43871c(iArr, b);
        m43060c(b, iArr2);
    }

    /* renamed from: e */
    public static void m43064e(int[] iArr, int[] iArr2) {
        if (C13969m.m44002a(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && C13960d.m43868b(iArr2, f30750a))) {
            C13969m.m44014b(5, -2147483647, iArr2);
        }
    }

    /* renamed from: a */
    public static void m43055a(int[] iArr, int[] iArr2) {
        if (C13969m.m44030d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && C13960d.m43868b(iArr2, f30750a))) {
            C13969m.m44014b(5, -2147483647, iArr2);
        }
    }

    /* renamed from: b */
    public static void m43058b(int[] iArr, int[] iArr2) {
        if (C13960d.m43867b(iArr)) {
            C13960d.m43875d(iArr2);
        } else {
            C13960d.m43876e(f30750a, iArr, iArr2);
        }
    }

    /* renamed from: d */
    public static void m43063d(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C13960d.m43876e(iArr, iArr2, iArr3) != 0) {
            C13969m.m44028d(5, -2147483647, iArr3);
        }
    }

    /* renamed from: c */
    public static void m43060c(int[] iArr, int[] iArr2) {
        int[] iArr3 = iArr2;
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31) + 0;
        iArr3[0] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31);
        iArr3[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31);
        iArr3[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31);
        iArr3[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31);
        iArr3[4] = (int) j10;
        m43053a((int) (j10 >>> 32), iArr3);
    }

    /* renamed from: a */
    public static int[] m43057a(BigInteger bigInteger) {
        int[] a = C13960d.m43864a(bigInteger);
        if (a[4] == -1 && C13960d.m43868b(a, f30750a)) {
            C13960d.m43873d(f30750a, a);
        }
        return a;
    }

    /* renamed from: a */
    public static void m43053a(int i, int[] iArr) {
        if ((i != 0 && C13960d.m43865b(-2147483647, i, iArr, 0) != 0) || (iArr[4] == -1 && C13960d.m43868b(iArr, f30750a))) {
            C13969m.m44014b(5, -2147483647, iArr);
        }
    }

    /* renamed from: a */
    public static void m43054a(int[] iArr, int i, int[] iArr2) {
        int[] b = C13960d.m43869b();
        C13960d.m43871c(iArr, b);
        m43060c(b, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                C13960d.m43871c(iArr2, b);
                m43060c(b, iArr2);
            } else {
                return;
            }
        }
    }
}
