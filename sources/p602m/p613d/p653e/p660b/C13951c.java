package p602m.p613d.p653e.p660b;

import java.math.BigInteger;

/* renamed from: m.d.e.b.c */
/* compiled from: FiniteFields */
public abstract class C13951c {

    /* renamed from: a */
    static final C13950b f30835a = new C13956h(BigInteger.valueOf(2));

    /* renamed from: b */
    static final C13950b f30836b = new C13956h(BigInteger.valueOf(3));

    /* renamed from: a */
    public static C13955g m43811a(int[] iArr) {
        if (iArr[0] == 0) {
            int i = 1;
            while (i < iArr.length) {
                if (iArr[i] > iArr[i - 1]) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
                }
            }
            return new C13953e(f30835a, new C13952d(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }

    /* renamed from: a */
    public static C13950b m43810a(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return f30835a;
            }
            if (intValue == 3) {
                return f30836b;
            }
        }
        return new C13956h(bigInteger);
    }
}
