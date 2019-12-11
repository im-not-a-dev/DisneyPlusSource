package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.l */
/* compiled from: Nat576 */
public abstract class C13968l {
    /* renamed from: a */
    public static boolean m43987a(long[] jArr, long[] jArr2) {
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static long[] m43988a() {
        return new long[9];
    }

    /* renamed from: b */
    public static boolean m43990b(long[] jArr) {
        for (int i = 0; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static long[] m43991b() {
        return new long[18];
    }

    /* renamed from: c */
    public static BigInteger m43992c(long[] jArr) {
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j = jArr[i];
            if (j != 0) {
                C14087h.m44471a(j, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static long[] m43989a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 576) {
            throw new IllegalArgumentException();
        }
        long[] a = m43988a();
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
    public static boolean m43986a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
