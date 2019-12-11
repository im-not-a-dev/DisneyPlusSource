package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13959c;

/* renamed from: m.d.e.a.x.c.u0 */
/* compiled from: SecT113Field */
public class C13926u0 {
    /* renamed from: a */
    public static void m43605a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    /* renamed from: b */
    public static void m43608b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: c */
    public static void m43609c(long[] jArr, long[] jArr2) {
        if (!C13959c.m43843b(jArr)) {
            long[] b = C13959c.m43844b();
            long[] b2 = C13959c.m43844b();
            m43615f(jArr, b);
            m43612d(b, jArr, b);
            m43615f(b, b);
            m43612d(b, jArr, b);
            m43603a(b, 3, b2);
            m43612d(b2, b, b2);
            m43615f(b2, b2);
            m43612d(b2, jArr, b2);
            m43603a(b2, 7, b);
            m43612d(b, b2, b);
            m43603a(b, 14, b2);
            m43612d(b2, b, b2);
            m43603a(b2, 28, b);
            m43612d(b, b2, b);
            m43603a(b, 56, b2);
            m43612d(b2, b, b2);
            m43615f(b2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public static void m43612d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13959c.m43854d();
        m43610c(jArr, jArr2, d);
        m43611d(d, jArr3);
    }

    /* renamed from: e */
    public static void m43614e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13959c.m43854d();
        m43610c(jArr, jArr2, d);
        m43608b(jArr3, d, jArr3);
    }

    /* renamed from: f */
    public static void m43615f(long[] jArr, long[] jArr2) {
        long[] d = C13959c.m43854d();
        m43607b(jArr, d);
        m43611d(d, jArr2);
    }

    /* renamed from: g */
    public static void m43616g(long[] jArr, long[] jArr2) {
        long[] d = C13959c.m43854d();
        m43607b(jArr, d);
        m43608b(jArr2, d, jArr2);
    }

    /* renamed from: a */
    public static void m43604a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    /* renamed from: d */
    public static void m43611d(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    /* renamed from: e */
    public static void m43613e(long[] jArr, long[] jArr2) {
        long a = C13957a.m43823a(jArr[0]);
        long a2 = C13957a.m43823a(jArr[1]);
        long j = (a >>> 32) | (a2 & -4294967296L);
        jArr2[0] = ((j << 57) ^ ((4294967295L & a) | (a2 << 32))) ^ (j << 5);
        jArr2[1] = (j >>> 59) ^ (j >>> 7);
    }

    /* renamed from: a */
    public static long[] m43606a(BigInteger bigInteger) {
        long[] b = C13959c.m43845b(bigInteger);
        m43602a(b, 0);
        return b;
    }

    /* renamed from: b */
    protected static void m43607b(long[] jArr, long[] jArr2) {
        C13957a.m43824a(jArr[0], jArr2, 0);
        C13957a.m43824a(jArr[1], jArr2, 2);
    }

    /* renamed from: a */
    public static void m43602a(long[] jArr, int i) {
        int i2 = i + 1;
        long j = jArr[i2];
        long j2 = j >>> 49;
        jArr[i] = (j2 ^ (j2 << 9)) ^ jArr[i];
        jArr[i2] = j & 562949953421311L;
    }

    /* renamed from: a */
    public static void m43603a(long[] jArr, int i, long[] jArr2) {
        long[] d = C13959c.m43854d();
        m43607b(jArr, d);
        m43611d(d, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m43607b(jArr2, d);
                m43611d(d, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m43601a(long j, long j2, long[] jArr, int i) {
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
    protected static void m43610c(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = 144115188075855871L & j4;
        long[] jArr4 = new long[6];
        long[] jArr5 = jArr4;
        m43601a(j3, j6, jArr4, 0);
        m43601a(j2, j5, jArr5, 2);
        m43601a(j3 ^ j2, j6 ^ j5, jArr5, 4);
        long j7 = jArr5[1] ^ jArr5[2];
        long j8 = jArr5[0];
        long j9 = jArr5[3];
        long j10 = (jArr5[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr5[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }
}
