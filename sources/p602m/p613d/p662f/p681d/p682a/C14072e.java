package p602m.p613d.p662f.p681d.p682a;

import java.math.BigInteger;

/* renamed from: m.d.f.d.a.e */
/* compiled from: IntegerFunctions */
public final class C14072e {
    static {
        BigInteger.valueOf(0);
        BigInteger.valueOf(1);
        BigInteger.valueOf(2);
        BigInteger.valueOf(4);
    }

    /* renamed from: a */
    public static int m44403a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 8;
        }
        return i2;
    }
}
