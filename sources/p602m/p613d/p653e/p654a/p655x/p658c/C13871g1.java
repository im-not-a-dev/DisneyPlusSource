package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13961e;

/* renamed from: m.d.e.a.x.c.g1 */
/* compiled from: SecT163Field */
public class C13871g1 {

    /* renamed from: a */
    private static final long[] f30748a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    /* renamed from: a */
    public static void m43032a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    /* renamed from: b */
    public static void m43035b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    /* renamed from: c */
    public static void m43036c(long[] jArr, long[] jArr2) {
        if (!C13961e.m43896b(jArr)) {
            long[] b = C13961e.m43897b();
            long[] b2 = C13961e.m43897b();
            m43042f(jArr, b);
            m43030a(b, 1, b2);
            m43039d(b, b2, b);
            m43030a(b2, 1, b2);
            m43039d(b, b2, b);
            m43030a(b, 3, b2);
            m43039d(b, b2, b);
            m43030a(b2, 3, b2);
            m43039d(b, b2, b);
            m43030a(b, 9, b2);
            m43039d(b, b2, b);
            m43030a(b2, 9, b2);
            m43039d(b, b2, b);
            m43030a(b, 27, b2);
            m43039d(b, b2, b);
            m43030a(b2, 27, b2);
            m43039d(b, b2, b);
            m43030a(b, 81, b2);
            m43039d(b, b2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public static void m43039d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13961e.m43909d();
        m43037c(jArr, jArr2, d);
        m43038d(d, jArr3);
    }

    /* renamed from: e */
    public static void m43041e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13961e.m43909d();
        m43037c(jArr, jArr2, d);
        m43035b(jArr3, d, jArr3);
    }

    /* renamed from: f */
    public static void m43042f(long[] jArr, long[] jArr2) {
        long[] d = C13961e.m43909d();
        m43034b(jArr, d);
        m43038d(d, jArr2);
    }

    /* renamed from: g */
    public static void m43043g(long[] jArr, long[] jArr2) {
        long[] d = C13961e.m43909d();
        m43034b(jArr, d);
        m43035b(jArr2, d, jArr2);
    }

    /* renamed from: a */
    public static void m43031a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* renamed from: d */
    public static void m43038d(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36));
        long j9 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j10 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j11 = j8 ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j12 = j9 >>> 35;
        jArr2[0] = (((j10 ^ j12) ^ (j12 << 3)) ^ (j12 << 6)) ^ (j12 << 7);
        jArr2[1] = j11;
        jArr2[2] = 34359738367L & j9;
    }

    /* renamed from: e */
    public static void m43040e(long[] jArr, long[] jArr2) {
        long[] b = C13961e.m43897b();
        long a = C13957a.m43823a(jArr[0]);
        long a2 = C13957a.m43823a(jArr[1]);
        long j = (a & 4294967295L) | (a2 << 32);
        b[0] = (a >>> 32) | (a2 & -4294967296L);
        long a3 = C13957a.m43823a(jArr[2]);
        long j2 = a3 & 4294967295L;
        b[1] = a3 >>> 32;
        m43039d(b, f30748a, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j2;
    }

    /* renamed from: a */
    public static long[] m43033a(BigInteger bigInteger) {
        long[] b = C13961e.m43898b(bigInteger);
        m43029a(b, 0);
        return b;
    }

    /* renamed from: b */
    protected static void m43034b(long[] jArr, long[] jArr2) {
        C13957a.m43824a(jArr[0], jArr2, 0);
        C13957a.m43824a(jArr[1], jArr2, 2);
        long j = jArr[2];
        jArr2[4] = C13957a.m43825b((int) j);
        jArr2[5] = ((long) C13957a.m43826c((int) (j >>> 32))) & 4294967295L;
    }

    /* renamed from: a */
    public static void m43029a(long[] jArr, int i) {
        int i2 = i + 2;
        long j = jArr[i2];
        long j2 = j >>> 35;
        jArr[i] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArr[i];
        jArr[i2] = j & 34359738367L;
    }

    /* renamed from: a */
    public static void m43030a(long[] jArr, int i, long[] jArr2) {
        long[] d = C13961e.m43909d();
        m43034b(jArr, d);
        m43038d(d, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m43034b(jArr2, d);
                m43038d(d, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m43028a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 55);
        jArr[1] = (j2 >>> 9) ^ (j3 << 46);
        jArr[2] = (j3 >>> 18) ^ (j4 << 37);
        jArr[3] = (j4 >>> 27) ^ (j5 << 28);
        jArr[4] = (j5 >>> 36) ^ (j6 << 19);
        jArr[5] = j6 >>> 45;
    }

    /* renamed from: a */
    protected static void m43027a(long j, long j2, long[] jArr, int i) {
        long j3 = j;
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        long j4 = jArr2[((int) j3) & 3];
        long j5 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j3 >>> i2);
            long j6 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j4 ^= j6 << i2;
            j5 ^= j6 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 36028797018963967L & j4;
        jArr[i + 1] = (j4 >>> 55) ^ (j5 << 9);
    }

    /* renamed from: c */
    protected static void m43037c(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (jArr[2] << 18) ^ (j2 >>> 46);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        long[] jArr5 = jArr4;
        m43027a(j5, j10, jArr5, 0);
        m43027a(j3, j8, jArr5, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        long[] jArr6 = jArr4;
        m43027a(j11, j12, jArr6, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        m43027a(j5 ^ j13, j10 ^ j14, jArr6, 6);
        m43027a(j11 ^ j13, j12 ^ j14, jArr6, 8);
        long j15 = jArr4[6] ^ jArr4[8];
        long j16 = jArr4[7] ^ jArr4[9];
        long j17 = (j15 << 1) ^ jArr4[6];
        long j18 = (j15 ^ (j16 << 1)) ^ jArr4[7];
        long j19 = jArr4[0];
        long j20 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j21 = jArr4[1] ^ jArr4[5];
        long j22 = ((j17 ^ j19) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j23 = (((j18 ^ j20) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j22 >>> 55);
        long j24 = (j21 ^ j16) ^ (j23 >>> 55);
        long j25 = j23 & 36028797018963967L;
        long j26 = ((j22 & 36028797018963967L) >>> 1) ^ ((j25 & 1) << 54);
        long j27 = j26 ^ (j26 << 1);
        long j28 = j27 ^ (j27 << 2);
        long j29 = j28 ^ (j28 << 4);
        long j30 = j29 ^ (j29 << 8);
        long j31 = j30 ^ (j30 << 16);
        long j32 = (j31 ^ (j31 << 32)) & 36028797018963967L;
        long j33 = ((j25 >>> 1) ^ ((j24 & 1) << 54)) ^ (j32 >>> 54);
        long j34 = j33 ^ (j33 << 1);
        long j35 = j34 ^ (j34 << 2);
        long j36 = j35 ^ (j35 << 4);
        long j37 = j36 ^ (j36 << 8);
        long j38 = j37 ^ (j37 << 16);
        long j39 = (j38 ^ (j38 << 32)) & 36028797018963967L;
        long j40 = (j24 >>> 1) ^ (j39 >>> 54);
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
        m43028a(jArr3);
    }
}
