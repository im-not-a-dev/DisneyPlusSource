package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13966j;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.k2 */
/* compiled from: SecT409Field */
public class C13888k2 {
    /* renamed from: a */
    public static void m43202a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    /* renamed from: b */
    public static void m43205b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    /* renamed from: c */
    protected static void m43207c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        m43204b(jArr, jArr4);
        m43204b(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            m43200a(jArr4, jArr5[i], jArr3, i);
        }
        m43197a(jArr3);
    }

    /* renamed from: d */
    public static void m43208d(long[] jArr, long[] jArr2) {
        if (!C13966j.m43981b(jArr)) {
            long[] a = C13966j.m43979a();
            long[] a2 = C13966j.m43979a();
            long[] a3 = C13966j.m43979a();
            m43213g(jArr, a);
            m43199a(a, 1, a2);
            m43209d(a, a2, a);
            m43199a(a2, 1, a2);
            m43209d(a, a2, a);
            m43199a(a, 3, a2);
            m43209d(a, a2, a);
            m43199a(a, 6, a2);
            m43209d(a, a2, a);
            m43199a(a, 12, a2);
            m43209d(a, a2, a3);
            m43199a(a3, 24, a);
            m43199a(a, 24, a2);
            m43209d(a, a2, a);
            m43199a(a, 48, a2);
            m43209d(a, a2, a);
            m43199a(a, 96, a2);
            m43209d(a, a2, a);
            m43199a(a, 192, a2);
            m43209d(a, a2, a);
            m43209d(a, a3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public static void m43211e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13966j.m43982b();
        m43207c(jArr, jArr2, b);
        m43205b(jArr3, b, jArr3);
    }

    /* renamed from: f */
    public static void m43212f(long[] jArr, long[] jArr2) {
        long a = C13957a.m43823a(jArr[0]);
        long a2 = C13957a.m43823a(jArr[1]);
        long j = (a & 4294967295L) | (a2 << 32);
        long j2 = (a >>> 32) | (a2 & -4294967296L);
        long a3 = C13957a.m43823a(jArr[2]);
        long a4 = C13957a.m43823a(jArr[3]);
        long j3 = (a3 & 4294967295L) | (a4 << 32);
        long j4 = (a3 >>> 32) | (a4 & -4294967296L);
        long a5 = C13957a.m43823a(jArr[4]);
        long a6 = C13957a.m43823a(jArr[5]);
        long j5 = (a5 & 4294967295L) | (a6 << 32);
        long j6 = (a5 >>> 32) | (a6 & -4294967296L);
        long a7 = C13957a.m43823a(jArr[6]);
        long j7 = a7 & 4294967295L;
        long j8 = a7 >>> 32;
        jArr2[0] = j ^ (j2 << 44);
        jArr2[1] = (j3 ^ (j4 << 44)) ^ (j2 >>> 20);
        jArr2[2] = (j5 ^ (j6 << 44)) ^ (j4 >>> 20);
        jArr2[3] = (((j8 << 44) ^ j7) ^ (j6 >>> 20)) ^ (j2 << 13);
        jArr2[4] = (j2 >>> 51) ^ ((j8 >>> 20) ^ (j4 << 13));
        jArr2[5] = (j6 << 13) ^ (j4 >>> 51);
        jArr2[6] = (j8 << 13) ^ (j6 >>> 51);
    }

    /* renamed from: g */
    public static void m43213g(long[] jArr, long[] jArr2) {
        long[] b = C13969m.m44021b(13);
        m43206c(jArr, b);
        m43210e(b, jArr2);
    }

    /* renamed from: h */
    public static void m43214h(long[] jArr, long[] jArr2) {
        long[] b = C13969m.m44021b(13);
        m43206c(jArr, b);
        m43205b(jArr2, b, jArr2);
    }

    /* renamed from: b */
    protected static void m43204b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    /* renamed from: e */
    public static void m43210e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j23 ^ (j25 >>> 2);
        long j27 = j ^ (j12 << 39);
        long j28 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j29 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j30 = j16 >>> 25;
        jArr2[0] = j27 ^ j30;
        jArr2[1] = (j30 << 23) ^ j28;
        jArr2[2] = j29;
        jArr2[3] = j26;
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    /* renamed from: c */
    protected static void m43206c(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            C13957a.m43824a(jArr[i], jArr2, i << 1);
        }
        jArr2[12] = C13957a.m43825b((int) jArr[6]);
    }

    /* renamed from: a */
    public static void m43201a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    /* renamed from: a */
    public static long[] m43203a(BigInteger bigInteger) {
        long[] a = C13966j.m43980a(bigInteger);
        m43198a(a, 0);
        return a;
    }

    /* renamed from: a */
    public static void m43198a(long[] jArr, int i) {
        int i2 = i + 6;
        long j = jArr[i2];
        long j2 = j >>> 25;
        jArr[i] = jArr[i] ^ j2;
        int i3 = i + 1;
        jArr[i3] = (j2 << 23) ^ jArr[i3];
        jArr[i2] = j & 33554431;
    }

    /* renamed from: a */
    public static void m43199a(long[] jArr, int i, long[] jArr2) {
        long[] b = C13969m.m44021b(13);
        m43206c(jArr, b);
        m43210e(b, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m43206c(jArr2, b);
                m43210e(b, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m43197a(long[] jArr) {
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
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = (j8 >>> 35) ^ (j9 << 24);
        jArr[8] = (j9 >>> 40) ^ (j10 << 19);
        jArr[9] = (j10 >>> 45) ^ (j11 << 14);
        jArr[10] = (j11 >>> 50) ^ (j12 << 9);
        jArr[11] = ((j12 >>> 55) ^ (j13 << 4)) ^ (j14 << 63);
        jArr[12] = (j13 >>> 60) ^ (j14 >>> 1);
        jArr[13] = 0;
    }

    /* renamed from: d */
    public static void m43209d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13966j.m43982b();
        m43207c(jArr, jArr2, b);
        m43210e(b, jArr3);
    }

    /* renamed from: a */
    protected static void m43200a(long[] jArr, long j, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        jArr3[1] = j;
        jArr3[2] = jArr3[1] << 1;
        jArr3[3] = jArr3[2] ^ j;
        jArr3[4] = jArr3[2] << 1;
        jArr3[5] = jArr3[4] ^ j;
        jArr3[6] = jArr3[3] << 1;
        jArr3[7] = jArr3[6] ^ j;
        for (int i2 = 0; i2 < 7; i2++) {
            long j2 = jArr[i2];
            int i3 = (int) j2;
            long j3 = 0;
            long j4 = jArr3[i3 & 7] ^ (jArr3[(i3 >>> 3) & 7] << 3);
            int i4 = 54;
            do {
                int i5 = (int) (j2 >>> i4);
                long j5 = (jArr3[(i5 >>> 3) & 7] << 3) ^ jArr3[i5 & 7];
                j4 ^= j5 << i4;
                j3 ^= j5 >>> (-i4);
                i4 -= 6;
            } while (i4 > 0);
            int i6 = i + i2;
            jArr2[i6] = jArr2[i6] ^ (576460752303423487L & j4);
            int i7 = i6 + 1;
            jArr2[i7] = jArr2[i7] ^ ((j3 << 5) ^ (j4 >>> 59));
        }
    }
}
