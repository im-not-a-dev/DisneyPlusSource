package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13963g;

/* renamed from: m.d.e.a.x.c.o1 */
/* compiled from: SecT193Field */
public class C13903o1 {
    /* renamed from: a */
    public static void m43356a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: b */
    public static void m43359b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    /* renamed from: c */
    protected static void m43361c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m43358b(jArr, jArr4);
        m43358b(jArr2, jArr5);
        long[] jArr6 = jArr3;
        m43351a(jArr4[0], jArr5[0], jArr6, 0);
        m43351a(jArr4[1], jArr5[1], jArr6, 1);
        m43351a(jArr4[2], jArr5[2], jArr6, 2);
        m43351a(jArr4[3], jArr5[3], jArr6, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m43351a(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m43351a(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m43351a(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        m43351a(j, j3, jArr7, 0);
        m43351a(j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        m43352a(jArr3);
    }

    /* renamed from: d */
    public static void m43362d(long[] jArr, long[] jArr2) {
        if (!C13963g.m43952b(jArr)) {
            long[] b = C13963g.m43953b();
            long[] b2 = C13963g.m43953b();
            m43367g(jArr, b);
            m43354a(b, 1, b2);
            m43363d(b, b2, b);
            m43354a(b2, 1, b2);
            m43363d(b, b2, b);
            m43354a(b, 3, b2);
            m43363d(b, b2, b);
            m43354a(b, 6, b2);
            m43363d(b, b2, b);
            m43354a(b, 12, b2);
            m43363d(b, b2, b);
            m43354a(b, 24, b2);
            m43363d(b, b2, b);
            m43354a(b, 48, b2);
            m43363d(b, b2, b);
            m43354a(b, 96, b2);
            m43363d(b, b2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public static void m43365e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13963g.m43965d();
        m43361c(jArr, jArr2, d);
        m43359b(jArr3, d, jArr3);
    }

    /* renamed from: f */
    public static void m43366f(long[] jArr, long[] jArr2) {
        long a = C13957a.m43823a(jArr[0]);
        long a2 = C13957a.m43823a(jArr[1]);
        long j = (a & 4294967295L) | (a2 << 32);
        long j2 = (a >>> 32) | (a2 & -4294967296L);
        long a3 = C13957a.m43823a(jArr[2]);
        long j3 = (a3 & 4294967295L) ^ (jArr[3] << 32);
        long j4 = a3 >>> 32;
        jArr2[0] = j ^ (j2 << 8);
        jArr2[1] = ((j3 ^ (j4 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33);
        jArr2[2] = (j2 >>> 31) ^ ((j4 >>> 56) ^ (j4 << 33));
        jArr2[3] = j4 >>> 31;
    }

    /* renamed from: g */
    public static void m43367g(long[] jArr, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m43360c(jArr, d);
        m43364e(d, jArr2);
    }

    /* renamed from: h */
    public static void m43368h(long[] jArr, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m43360c(jArr, d);
        m43359b(jArr2, d, jArr2);
    }

    /* renamed from: e */
    public static void m43364e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j13 >>> 49) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    /* renamed from: a */
    public static void m43355a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    /* renamed from: b */
    protected static void m43358b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    /* renamed from: a */
    public static long[] m43357a(BigInteger bigInteger) {
        long[] b = C13963g.m43954b(bigInteger);
        m43353a(b, 0);
        return b;
    }

    /* renamed from: a */
    public static void m43353a(long[] jArr, int i) {
        int i2 = i + 3;
        long j = jArr[i2];
        long j2 = j >>> 1;
        jArr[i] = jArr[i] ^ ((j2 << 15) ^ j2);
        int i3 = i + 1;
        jArr[i3] = (j2 >>> 49) ^ jArr[i3];
        jArr[i2] = j & 1;
    }

    /* renamed from: a */
    public static void m43354a(long[] jArr, int i, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m43360c(jArr, d);
        m43364e(d, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m43360c(jArr2, d);
                m43364e(d, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m43352a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 49);
        jArr[1] = (j2 >>> 15) ^ (j3 << 34);
        jArr[2] = (j3 >>> 30) ^ (j4 << 19);
        jArr[3] = ((j4 >>> 45) ^ (j5 << 4)) ^ (j6 << 53);
        jArr[4] = ((j5 >>> 60) ^ (j7 << 38)) ^ (j6 >>> 11);
        jArr[5] = (j7 >>> 26) ^ (j8 << 23);
        jArr[6] = j8 >>> 41;
        jArr[7] = 0;
    }

    /* renamed from: c */
    protected static void m43360c(long[] jArr, long[] jArr2) {
        C13957a.m43824a(jArr[0], jArr2, 0);
        C13957a.m43824a(jArr[1], jArr2, 2);
        C13957a.m43824a(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    /* renamed from: d */
    public static void m43363d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13963g.m43965d();
        m43361c(jArr, jArr2, d);
        m43364e(d, jArr3);
    }

    /* renamed from: a */
    protected static void m43351a(long j, long j2, long[] jArr, int i) {
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
        long j4 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j5 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j3 >>> i3);
            long j6 = (jArr2[(i4 >>> 12) & 7] << 12) ^ (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9));
            j4 ^= j6 << i3;
            j5 ^= j6 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j4);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j4 >>> 49) ^ (j5 << 15));
    }
}
