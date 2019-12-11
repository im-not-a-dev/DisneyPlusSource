package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.h */
/* compiled from: Nat320 */
public abstract class C13964h {
    /* renamed from: a */
    public static boolean m43969a(long[] jArr, long[] jArr2) {
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static long[] m43970a() {
        return new long[5];
    }

    /* renamed from: b */
    public static boolean m43972b(long[] jArr) {
        for (int i = 0; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static long[] m43973b() {
        return new long[10];
    }

    /* renamed from: c */
    public static BigInteger m43974c(long[] jArr) {
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j = jArr[i];
            if (j != 0) {
                C14087h.m44471a(j, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static long[] m43971a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 320) {
            throw new IllegalArgumentException();
        }
        long[] a = m43970a();
        int i = 0;
        while (bigInteger.signum() != 0) {
            int i2 = i + 1;
            a[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i = i2;
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m43968a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
