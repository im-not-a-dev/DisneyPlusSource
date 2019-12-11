package p602m.p613d.p662f.p681d.p682a;

/* renamed from: m.d.f.d.a.j */
/* compiled from: PolynomialRingGF2 */
public final class C14077j {
    /* renamed from: a */
    public static int m44431a(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m44433a(int i, int i2, int i3) {
        int b = m44434b(i, i3);
        int b2 = m44434b(i2, i3);
        int i4 = 0;
        if (b2 != 0) {
            int a = 1 << m44431a(i3);
            while (b != 0) {
                if (((byte) (b & 1)) == 1) {
                    i4 ^= b2;
                }
                b >>>= 1;
                b2 <<= 1;
                if (b2 >= a) {
                    b2 ^= i3;
                }
            }
        }
        return i4;
    }

    /* renamed from: b */
    public static int m44434b(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (m44431a(i) >= m44431a(i2)) {
            i ^= i2 << (m44431a(i) - m44431a(i2));
        }
        return i;
    }

    /* renamed from: a */
    public static int m44432a(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i == 0) {
                return i4;
            }
            i2 = m44434b(i4, i);
        }
    }

    /* renamed from: b */
    public static boolean m44435b(int i) {
        if (i == 0) {
            return false;
        }
        int a = m44431a(i) >>> 1;
        int i2 = 2;
        for (int i3 = 0; i3 < a; i3++) {
            i2 = m44433a(i2, i2, i);
            if (m44432a(i2 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }
}
