package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13963g;

/* renamed from: m.d.e.a.x.c.u1 */
/* compiled from: SecT233Field */
public class C13927u1 {
    /* renamed from: a */
    public static void m43622a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: b */
    public static void m43625b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    /* renamed from: c */
    protected static void m43627c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m43624b(jArr, jArr4);
        m43624b(jArr2, jArr5);
        long[] jArr6 = jArr3;
        m43617a(jArr4[0], jArr5[0], jArr6, 0);
        m43617a(jArr4[1], jArr5[1], jArr6, 1);
        m43617a(jArr4[2], jArr5[2], jArr6, 2);
        m43617a(jArr4[3], jArr5[3], jArr6, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m43617a(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m43617a(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m43617a(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        m43617a(j, j3, jArr7, 0);
        m43617a(j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        m43618a(jArr3);
    }

    /* renamed from: d */
    public static void m43628d(long[] jArr, long[] jArr2) {
        if (!C13963g.m43952b(jArr)) {
            long[] b = C13963g.m43953b();
            long[] b2 = C13963g.m43953b();
            m43633g(jArr, b);
            m43629d(b, jArr, b);
            m43633g(b, b);
            m43629d(b, jArr, b);
            m43620a(b, 3, b2);
            m43629d(b2, b, b2);
            m43633g(b2, b2);
            m43629d(b2, jArr, b2);
            m43620a(b2, 7, b);
            m43629d(b, b2, b);
            m43620a(b, 14, b2);
            m43629d(b2, b, b2);
            m43633g(b2, b2);
            m43629d(b2, jArr, b2);
            m43620a(b2, 29, b);
            m43629d(b, b2, b);
            m43620a(b, 58, b2);
            m43629d(b2, b, b2);
            m43620a(b2, 116, b);
            m43629d(b, b2, b);
            m43633g(b, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public static void m43631e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13963g.m43965d();
        m43627c(jArr, jArr2, d);
        m43625b(jArr3, d, jArr3);
    }

    /* renamed from: f */
    public static void m43632f(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr2;
        long a = C13957a.m43823a(jArr[0]);
        long a2 = C13957a.m43823a(jArr[1]);
        long j = (a & 4294967295L) | (a2 << 32);
        long j2 = (a >>> 32) | (a2 & -4294967296L);
        long a3 = C13957a.m43823a(jArr[2]);
        long a4 = C13957a.m43823a(jArr[3]);
        long j3 = (4294967295L & a3) | (a4 << 32);
        long j4 = (a3 >>> 32) | (a4 & -4294967296L);
        long j5 = j4 >>> 27;
        long j6 = j4 ^ ((j2 >>> 27) | (j4 << 37));
        long j7 = j2 ^ (j2 << 37);
        long[] d = C13963g.m43965d();
        int[] iArr = {32, 117, 191};
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i] >>> 6;
            int i3 = iArr[i] & 63;
            d[i2] = d[i2] ^ (j7 << i3);
            int i4 = i2 + 1;
            int[] iArr2 = iArr;
            int i5 = -i3;
            d[i4] = d[i4] ^ ((j6 << i3) | (j7 >>> i5));
            int i6 = i2 + 2;
            d[i6] = d[i6] ^ ((j5 << i3) | (j6 >>> i5));
            int i7 = i2 + 3;
            d[i7] = d[i7] ^ (j5 >>> i5);
            i++;
            iArr = iArr2;
        }
        m43630e(d, jArr3);
        jArr3[0] = jArr3[0] ^ j;
        jArr3[1] = jArr3[1] ^ j3;
    }

    /* renamed from: g */
    public static void m43633g(long[] jArr, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m43626c(jArr, d);
        m43630e(d, jArr2);
    }

    /* renamed from: h */
    public static void m43634h(long[] jArr, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m43626c(jArr, d);
        m43625b(jArr2, d, jArr2);
    }

    /* renamed from: e */
    public static void m43630e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    /* renamed from: a */
    public static void m43621a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    /* renamed from: a */
    public static long[] m43623a(BigInteger bigInteger) {
        long[] b = C13963g.m43954b(bigInteger);
        m43619a(b, 0);
        return b;
    }

    /* renamed from: b */
    protected static void m43624b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    /* renamed from: a */
    public static void m43619a(long[] jArr, int i) {
        int i2 = i + 3;
        long j = jArr[i2];
        long j2 = j >>> 41;
        jArr[i] = jArr[i] ^ j2;
        int i3 = i + 1;
        jArr[i3] = (j2 << 10) ^ jArr[i3];
        jArr[i2] = j & 2199023255551L;
    }

    /* renamed from: a */
    public static void m43620a(long[] jArr, int i, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m43626c(jArr, d);
        m43630e(d, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m43626c(jArr2, d);
                m43630e(d, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m43618a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = j8 >>> 35;
    }

    /* renamed from: c */
    protected static void m43626c(long[] jArr, long[] jArr2) {
        C13957a.m43824a(jArr[0], jArr2, 0);
        C13957a.m43824a(jArr[1], jArr2, 2);
        C13957a.m43824a(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = C13957a.m43825b((int) j);
        jArr2[7] = ((long) C13957a.m43822a((int) (j >>> 32))) & 4294967295L;
    }

    /* renamed from: d */
    public static void m43629d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13963g.m43965d();
        m43627c(jArr, jArr2, d);
        m43630e(d, jArr3);
    }

    /* renamed from: a */
    protected static void m43617a(long j, long j2, long[] jArr, int i) {
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
        int i3 = 54;
        do {
            int i4 = (int) (j3 >>> i3);
            long j6 = (jArr2[(i4 >>> 3) & 7] << 3) ^ jArr2[i4 & 7];
            j4 ^= j6 << i3;
            j5 ^= j6 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (576460752303423487L & j4);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j4 >>> 59) ^ (j5 << 5));
    }
}
