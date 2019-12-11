package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13961e;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.a1 */
/* compiled from: SecT131Field */
public class C13847a1 {

    /* renamed from: a */
    private static final long[] f30719a = {2791191049453778211L, 2791191049453778402L, 6};

    /* renamed from: a */
    public static void m42753a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    /* renamed from: b */
    public static void m42756b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    /* renamed from: c */
    public static void m42757c(long[] jArr, long[] jArr2) {
        if (!C13961e.m43896b(jArr)) {
            long[] b = C13961e.m43897b();
            long[] b2 = C13961e.m43897b();
            m42763f(jArr, b);
            m42760d(b, jArr, b);
            m42751a(b, 2, b2);
            m42760d(b2, b, b2);
            m42751a(b2, 4, b);
            m42760d(b, b2, b);
            m42751a(b, 8, b2);
            m42760d(b2, b, b2);
            m42751a(b2, 16, b);
            m42760d(b, b2, b);
            m42751a(b, 32, b2);
            m42760d(b2, b, b2);
            m42763f(b2, b2);
            m42760d(b2, jArr, b2);
            m42751a(b2, 65, b);
            m42760d(b, b2, b);
            m42763f(b, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public static void m42760d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13961e.m43909d();
        m42758c(jArr, jArr2, d);
        m42759d(d, jArr3);
    }

    /* renamed from: e */
    public static void m42762e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13961e.m43909d();
        m42758c(jArr, jArr2, d);
        m42756b(jArr3, d, jArr3);
    }

    /* renamed from: f */
    public static void m42763f(long[] jArr, long[] jArr2) {
        long[] b = C13969m.m44021b(5);
        m42755b(jArr, b);
        m42759d(b, jArr2);
    }

    /* renamed from: g */
    public static void m42764g(long[] jArr, long[] jArr2) {
        long[] b = C13969m.m44021b(5);
        m42755b(jArr, b);
        m42756b(jArr2, b, jArr2);
    }

    /* renamed from: a */
    public static void m42752a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* renamed from: d */
    public static void m42759d(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j10 >>> 56) ^ j8;
        jArr2[2] = 7 & j9;
    }

    /* renamed from: e */
    public static void m42761e(long[] jArr, long[] jArr2) {
        long[] b = C13961e.m43897b();
        long a = C13957a.m43823a(jArr[0]);
        long a2 = C13957a.m43823a(jArr[1]);
        long j = (a & 4294967295L) | (a2 << 32);
        b[0] = (a >>> 32) | (a2 & -4294967296L);
        long a3 = C13957a.m43823a(jArr[2]);
        long j2 = a3 & 4294967295L;
        b[1] = a3 >>> 32;
        m42760d(b, f30719a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j2;
    }

    /* renamed from: b */
    protected static void m42755b(long[] jArr, long[] jArr2) {
        C13957a.m43824a(jArr[0], jArr2, 0);
        C13957a.m43824a(jArr[1], jArr2, 2);
        jArr2[4] = ((long) C13957a.m43826c((int) jArr[2])) & 4294967295L;
    }

    /* renamed from: a */
    public static long[] m42754a(BigInteger bigInteger) {
        long[] b = C13961e.m43898b(bigInteger);
        m42750a(b, 0);
        return b;
    }

    /* renamed from: a */
    public static void m42750a(long[] jArr, int i) {
        int i2 = i + 2;
        long j = jArr[i2];
        long j2 = j >>> 3;
        jArr[i] = jArr[i] ^ ((((j2 << 2) ^ j2) ^ (j2 << 3)) ^ (j2 << 8));
        int i3 = i + 1;
        jArr[i3] = (j2 >>> 56) ^ jArr[i3];
        jArr[i2] = j & 7;
    }

    /* renamed from: a */
    public static void m42751a(long[] jArr, int i, long[] jArr2) {
        long[] b = C13969m.m44021b(5);
        m42755b(jArr, b);
        m42759d(b, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m42755b(jArr2, b);
                m42759d(b, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m42749a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 44);
        jArr[1] = (j2 >>> 20) ^ (j3 << 24);
        jArr[2] = ((j3 >>> 40) ^ (j4 << 4)) ^ (j5 << 48);
        jArr[3] = ((j4 >>> 60) ^ (j6 << 28)) ^ (j5 >>> 16);
        jArr[4] = j6 >>> 36;
        jArr[5] = 0;
    }

    /* renamed from: c */
    protected static void m42758c(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & 17592186044415L;
        long j4 = ((j2 << 20) ^ (j >>> 44)) & 17592186044415L;
        long j5 = j & 17592186044415L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j9 = ((j6 >>> 44) ^ (j7 << 20)) & 17592186044415L;
        long j10 = j6 & 17592186044415L;
        long[] jArr4 = new long[10];
        m42748a(j5, j10, jArr4, 0);
        m42748a(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        long[] jArr5 = jArr4;
        m42748a(j11, j12, jArr5, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        m42748a(j5 ^ j13, j10 ^ j14, jArr5, 6);
        m42748a(j11 ^ j13, j12 ^ j14, jArr5, 8);
        long j15 = jArr4[6] ^ jArr4[8];
        long j16 = jArr4[7] ^ jArr4[9];
        long j17 = (j15 << 1) ^ jArr4[6];
        long j18 = (j15 ^ (j16 << 1)) ^ jArr4[7];
        long j19 = jArr4[0];
        long j20 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j21 = jArr4[1] ^ jArr4[5];
        long j22 = ((j17 ^ j19) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j23 = (((j20 ^ j18) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j22 >>> 44);
        long j24 = (j21 ^ j16) ^ (j23 >>> 44);
        long j25 = j23 & 17592186044415L;
        long j26 = ((j22 & 17592186044415L) >>> 1) ^ ((j25 & 1) << 43);
        long j27 = j26 ^ (j26 << 1);
        long j28 = j27 ^ (j27 << 2);
        long j29 = j28 ^ (j28 << 4);
        long j30 = j29 ^ (j29 << 8);
        long j31 = j30 ^ (j30 << 16);
        long j32 = (j31 ^ (j31 << 32)) & 17592186044415L;
        long j33 = ((j25 >>> 1) ^ ((j24 & 1) << 43)) ^ (j32 >>> 43);
        long j34 = j33 ^ (j33 << 1);
        long j35 = j34 ^ (j34 << 2);
        long j36 = j35 ^ (j35 << 4);
        long j37 = j36 ^ (j36 << 8);
        long j38 = j37 ^ (j37 << 16);
        long j39 = (j38 ^ (j38 << 32)) & 17592186044415L;
        long j40 = (j24 >>> 1) ^ (j39 >>> 43);
        long j41 = j40 ^ (j40 << 1);
        long j42 = j41 ^ (j41 << 2);
        long j43 = j42 ^ (j42 << 4);
        long j44 = j43 ^ (j43 << 8);
        long j45 = j44 ^ (j44 << 16);
        long j46 = j45 ^ (j45 << 32);
        jArr3[0] = j19;
        jArr3[1] = (j20 ^ j32) ^ jArr4[2];
        jArr3[2] = ((j21 ^ j39) ^ j32) ^ jArr4[3];
        jArr3[3] = j46 ^ j39;
        jArr3[4] = jArr4[2] ^ j46;
        jArr3[5] = jArr4[3];
        m42749a(jArr3);
    }

    /* renamed from: a */
    protected static void m42748a(long j, long j2, long[] jArr, int i) {
        long j3 = j;
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        int i2 = (int) j3;
        long j4 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        long j5 = 0;
        int i3 = 33;
        do {
            int i4 = (int) (j3 >>> i3);
            long j6 = (jArr2[(i4 >>> 9) & 7] << 9) ^ ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6));
            j4 ^= j6 << i3;
            j5 ^= j6 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = 17592186044415L & j4;
        jArr[i + 1] = (j4 >>> 44) ^ (j5 << 20);
    }
}
