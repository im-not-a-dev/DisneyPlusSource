package p602m.p613d.p653e.p661c;

import java.util.Random;

/* renamed from: m.d.e.c.b */
/* compiled from: Mod */
public abstract class C13958b {
    /* renamed from: a */
    private static int m43827a(int i) {
        int i2 = 0;
        while ((i & 1) == 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    /* renamed from: a */
    public static void m43830a(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (C13969m.m44033e(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        } else if (C13969m.m44031d(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
        } else {
            int[] a = C13969m.m44013a(length, iArr2);
            int[] a2 = C13969m.m44011a(length);
            a2[0] = 1;
            int a3 = (1 & a[0]) == 0 ? m43828a(iArr, a, length, a2, 0) : 0;
            if (C13969m.m44031d(length, a)) {
                m43829a(iArr, a3, a2, iArr3);
                return;
            }
            int[] a4 = C13969m.m44013a(length, iArr);
            int[] a5 = C13969m.m44011a(length);
            int i = length;
            int i2 = 0;
            while (true) {
                int i3 = i - 1;
                if (a[i3] == 0 && a4[i3] == 0) {
                    i--;
                } else if (C13969m.m44027c(i, a, a4)) {
                    C13969m.m44032e(i, a4, a);
                    a3 = m43828a(iArr, a, i, a2, a3 + (C13969m.m44032e(length, a5, a2) - i2));
                    if (C13969m.m44031d(i, a)) {
                        m43829a(iArr, a3, a2, iArr3);
                        return;
                    }
                } else {
                    C13969m.m44032e(i, a, a4);
                    i2 = m43828a(iArr, a4, i, a5, i2 + (C13969m.m44032e(length, a2, a5) - a3));
                    if (C13969m.m44031d(i, a4)) {
                        m43829a(iArr, i2, a5, iArr3);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static int[] m43831a(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] a = C13969m.m44011a(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                a[i8] = random.nextInt();
            }
            a[i] = a[i] & i7;
        } while (C13969m.m44027c(length, a, iArr));
        return a;
    }

    /* renamed from: a */
    private static void m43829a(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            C13969m.m44005a(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    /* renamed from: a */
    private static int m43828a(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int i3;
        int length = iArr.length;
        int i4 = 0;
        while (iArr2[0] == 0) {
            C13969m.m44029d(i, iArr2, 0);
            i4 += 32;
        }
        int a = m43827a(iArr2[0]);
        if (a > 0) {
            C13969m.m44017b(i, iArr2, a, 0);
            i4 += a;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if ((iArr3[0] & 1) != 0) {
                if (i2 < 0) {
                    i3 = C13969m.m44004a(length, iArr, iArr3);
                } else {
                    i3 = C13969m.m44032e(length, iArr, iArr3);
                }
                i2 += i3;
            }
            C13969m.m44024c(length, iArr3, i2);
        }
        return i2;
    }
}
