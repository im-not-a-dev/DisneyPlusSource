package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13964h;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.e2 */
/* compiled from: SecT283Field */
public class C13864e2 {

    /* renamed from: a */
    private static final long[] f30739a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

    /* renamed from: a */
    public static void m42950a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    /* renamed from: b */
    public static void m42953b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    /* renamed from: c */
    protected static void m42955c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        m42952b(jArr, jArr4);
        m42952b(jArr2, jArr5);
        long[] jArr6 = new long[26];
        long[] jArr7 = jArr6;
        m42945a(jArr4[0], jArr5[0], jArr7, 0);
        m42945a(jArr4[1], jArr5[1], jArr7, 2);
        m42945a(jArr4[2], jArr5[2], jArr7, 4);
        m42945a(jArr4[3], jArr5[3], jArr7, 6);
        m42945a(jArr4[4], jArr5[4], jArr7, 8);
        long j = jArr4[0] ^ jArr4[1];
        long j2 = jArr5[0] ^ jArr5[1];
        long j3 = jArr4[0] ^ jArr4[2];
        long j4 = jArr5[0] ^ jArr5[2];
        long j5 = jArr4[2] ^ jArr4[4];
        long j6 = jArr5[2] ^ jArr5[4];
        long j7 = jArr4[3] ^ jArr4[4];
        long j8 = jArr5[3] ^ jArr5[4];
        m42945a(j3 ^ jArr4[3], j4 ^ jArr5[3], jArr7, 18);
        m42945a(j5 ^ jArr4[1], j6 ^ jArr5[1], jArr7, 20);
        long j9 = j ^ j7;
        long j10 = j2 ^ j8;
        long j11 = j9 ^ jArr4[2];
        long j12 = jArr5[2] ^ j10;
        long[] jArr8 = jArr6;
        m42945a(j9, j10, jArr8, 22);
        m42945a(j11, j12, jArr8, 24);
        m42945a(j, j2, jArr8, 10);
        m42945a(j3, j4, jArr8, 12);
        m42945a(j5, j6, jArr8, 14);
        m42945a(j7, j8, jArr8, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j13 = jArr6[0] ^ jArr6[1];
        long j14 = jArr6[2] ^ j13;
        long j15 = jArr6[10] ^ j14;
        jArr3[1] = j15;
        long j16 = jArr6[3] ^ jArr6[4];
        long j17 = j14 ^ (j16 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j17;
        long j18 = jArr6[5] ^ jArr6[6];
        long j19 = ((j13 ^ j16) ^ j18) ^ jArr6[8];
        long j20 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j19 ^ j20) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j21 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j22 = j21 ^ jArr6[17];
        jArr3[8] = j22;
        long j23 = (j21 ^ j18) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j23;
        long j24 = j15 ^ j23;
        long j25 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = (j25 ^ (jArr6[18] ^ jArr6[23])) ^ j24;
        jArr3[5] = ((j17 ^ j22) ^ j25) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = ((((jArr6[9] ^ (j19 ^ jArr6[0])) ^ j20) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
        m42946a(jArr3);
    }

    /* renamed from: d */
    public static void m42956d(long[] jArr, long[] jArr2) {
        if (!C13964h.m43972b(jArr)) {
            long[] a = C13964h.m43970a();
            long[] a2 = C13964h.m43970a();
            m42961g(jArr, a);
            m42957d(a, jArr, a);
            m42948a(a, 2, a2);
            m42957d(a2, a, a2);
            m42948a(a2, 4, a);
            m42957d(a, a2, a);
            m42948a(a, 8, a2);
            m42957d(a2, a, a2);
            m42961g(a2, a2);
            m42957d(a2, jArr, a2);
            m42948a(a2, 17, a);
            m42957d(a, a2, a);
            m42961g(a, a);
            m42957d(a, jArr, a);
            m42948a(a, 35, a2);
            m42957d(a2, a, a2);
            m42948a(a2, 70, a);
            m42957d(a, a2, a);
            m42961g(a, a);
            m42957d(a, jArr, a);
            m42948a(a, 141, a2);
            m42957d(a2, a, a2);
            m42961g(a2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public static void m42959e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13964h.m43973b();
        m42955c(jArr, jArr2, b);
        m42953b(jArr3, b, jArr3);
    }

    /* renamed from: f */
    public static void m42960f(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr2;
        long[] a = C13964h.m43970a();
        long a2 = C13957a.m43823a(jArr[0]);
        long a3 = C13957a.m43823a(jArr[1]);
        long j = (a2 & 4294967295L) | (a3 << 32);
        a[0] = (a2 >>> 32) | (a3 & -4294967296L);
        long a4 = C13957a.m43823a(jArr[2]);
        long a5 = C13957a.m43823a(jArr[3]);
        long j2 = (a4 & 4294967295L) | (a5 << 32);
        a[1] = (a4 >>> 32) | (-4294967296L & a5);
        long a6 = C13957a.m43823a(jArr[4]);
        long j3 = 4294967295L & a6;
        a[2] = a6 >>> 32;
        m42957d(a, f30739a, jArr3);
        jArr3[0] = jArr3[0] ^ j;
        jArr3[1] = jArr3[1] ^ j2;
        jArr3[2] = jArr3[2] ^ j3;
    }

    /* renamed from: g */
    public static void m42961g(long[] jArr, long[] jArr2) {
        long[] b = C13969m.m44021b(9);
        m42954c(jArr, b);
        m42958e(b, jArr2);
    }

    /* renamed from: h */
    public static void m42962h(long[] jArr, long[] jArr2) {
        long[] b = C13969m.m44021b(9);
        m42954c(jArr, b);
        m42953b(jArr2, b, jArr2);
    }

    /* renamed from: e */
    public static void m42958e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        long j12 = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        long j13 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j14 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j15 = j10 >>> 27;
        jArr2[0] = (((j13 ^ j15) ^ (j15 << 5)) ^ (j15 << 7)) ^ (j15 << 12);
        jArr2[1] = j14;
        jArr2[2] = j12;
        jArr2[3] = j11;
        jArr2[4] = 134217727 & j10;
    }

    /* renamed from: a */
    public static void m42949a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    /* renamed from: b */
    protected static void m42952b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    /* renamed from: a */
    public static long[] m42951a(BigInteger bigInteger) {
        long[] a = C13964h.m43971a(bigInteger);
        m42947a(a, 0);
        return a;
    }

    /* renamed from: a */
    public static void m42947a(long[] jArr, int i) {
        int i2 = i + 4;
        long j = jArr[i2];
        long j2 = j >>> 27;
        jArr[i] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[i];
        jArr[i2] = j & 134217727;
    }

    /* renamed from: a */
    public static void m42948a(long[] jArr, int i, long[] jArr2) {
        long[] b = C13969m.m44021b(9);
        m42954c(jArr, b);
        m42958e(b, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m42954c(jArr2, b);
                m42958e(b, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m42946a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        jArr[0] = j ^ (j2 << 57);
        jArr[1] = (j2 >>> 7) ^ (j3 << 50);
        jArr[2] = (j3 >>> 14) ^ (j4 << 43);
        jArr[3] = (j4 >>> 21) ^ (j5 << 36);
        jArr[4] = (j5 >>> 28) ^ (j6 << 29);
        jArr[5] = (j6 >>> 35) ^ (j7 << 22);
        jArr[6] = (j7 >>> 42) ^ (j8 << 15);
        jArr[7] = (j8 >>> 49) ^ (j9 << 8);
        jArr[8] = (j9 >>> 56) ^ (j10 << 1);
        jArr[9] = j10 >>> 63;
    }

    /* renamed from: d */
    public static void m42957d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13964h.m43973b();
        m42955c(jArr, jArr2, b);
        m42958e(b, jArr3);
    }

    /* renamed from: a */
    protected static void m42945a(long j, long j2, long[] jArr, int i) {
        long j3 = j;
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        long j4 = jArr2[((int) j3) & 7];
        long j5 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j3 >>> i2);
            long j6 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j4 ^= j6 << i2;
            j5 ^= j6 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        long j7 = (((j3 & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j5;
        jArr[i] = 144115188075855871L & j4;
        jArr[i + 1] = (j7 << 7) ^ (j4 >>> 57);
    }

    /* renamed from: c */
    protected static void m42954c(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            C13957a.m43824a(jArr[i], jArr2, i << 1);
        }
        jArr2[8] = C13957a.m43825b((int) jArr[4]);
    }
}
