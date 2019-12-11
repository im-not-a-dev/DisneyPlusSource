package p602m.p613d.p653e.p661c;

import java.math.BigInteger;
import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.e.c.j */
/* compiled from: Nat448 */
public abstract class C13966j {
    /* renamed from: a */
    public static boolean m43978a(long[] jArr, long[] jArr2) {
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static long[] m43979a() {
        return new long[7];
    }

    /* renamed from: b */
    public static boolean m43981b(long[] jArr) {
        for (int i = 0; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static long[] m43982b() {
        return new long[14];
    }

    /* renamed from: c */
    public static BigInteger m43983c(long[] jArr) {
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j = jArr[i];
            if (j != 0) {
                C14087h.m44471a(j, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: a */
    public static long[] m43980a(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] a = m43979a();
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
    public static boolean m43977a(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
