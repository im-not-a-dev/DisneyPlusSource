package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13963g;

/* renamed from: m.d.e.a.x.c.a2 */
/* compiled from: SecT239Field */
public class C13848a2 {
    /* renamed from: a */
    public static void m42770a(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    /* renamed from: b */
    public static void m42773b(long[] jArr, long[] jArr2, long[] jArr3) {
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
    protected static void m42775c(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m42772b(jArr, jArr4);
        m42772b(jArr2, jArr5);
        long[] jArr6 = jArr3;
        m42765a(jArr4[0], jArr5[0], jArr6, 0);
        m42765a(jArr4[1], jArr5[1], jArr6, 1);
        m42765a(jArr4[2], jArr5[2], jArr6, 2);
        m42765a(jArr4[3], jArr5[3], jArr6, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        m42765a(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        m42765a(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        m42765a(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr7 = new long[3];
        m42765a(j, j3, jArr7, 0);
        m42765a(j2, j4, jArr7, 1);
        long j5 = jArr7[0];
        long j6 = jArr7[1];
        long j7 = jArr7[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j7 ^ j6);
        jArr3[5] = jArr3[5] ^ j7;
        m42766a(jArr3);
    }

    /* renamed from: d */
    public static void m42776d(long[] jArr, long[] jArr2) {
        if (!C13963g.m43952b(jArr)) {
            long[] b = C13963g.m43953b();
            long[] b2 = C13963g.m43953b();
            m42781g(jArr, b);
            m42777d(b, jArr, b);
            m42781g(b, b);
            m42777d(b, jArr, b);
            m42768a(b, 3, b2);
            m42777d(b2, b, b2);
            m42781g(b2, b2);
            m42777d(b2, jArr, b2);
            m42768a(b2, 7, b);
            m42777d(b, b2, b);
            m42768a(b, 14, b2);
            m42777d(b2, b, b2);
            m42781g(b2, b2);
            m42777d(b2, jArr, b2);
            m42768a(b2, 29, b);
            m42777d(b, b2, b);
            m42781g(b, b);
            m42777d(b, jArr, b);
            m42768a(b, 59, b2);
            m42777d(b2, b, b2);
            m42781g(b2, b2);
            m42777d(b2, jArr, b2);
            m42768a(b2, 119, b);
            m42777d(b, b2, b);
            m42781g(b, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public static void m42779e(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13963g.m43965d();
        m42775c(jArr, jArr2, d);
        m42773b(jArr3, d, jArr3);
    }

    /* renamed from: f */
    public static void m42780f(long[] jArr, long[] jArr2) {
        long[] jArr3 = jArr2;
        long a = C13957a.m43823a(jArr[0]);
        long a2 = C13957a.m43823a(jArr[1]);
        long j = (a & 4294967295L) | (a2 << 32);
        long j2 = (a >>> 32) | (a2 & -4294967296L);
        long a3 = C13957a.m43823a(jArr[2]);
        long a4 = C13957a.m43823a(jArr[3]);
        long j3 = (a3 & 4294967295L) | (a4 << 32);
        long j4 = (a4 & -4294967296L) | (a3 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] d = C13963g.m43965d();
        int[] iArr = {39, 120};
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i] >>> 6;
            int[] iArr2 = iArr;
            int i3 = iArr[i] & 63;
            d[i2] = d[i2] ^ (j2 << i3);
            int i4 = i2 + 1;
            long j8 = j3;
            int i5 = -i3;
            d[i4] = d[i4] ^ ((j7 << i3) | (j2 >>> i5));
            int i6 = i2 + 2;
            d[i6] = d[i6] ^ ((j6 << i3) | (j7 >>> i5));
            int i7 = i2 + 3;
            d[i7] = d[i7] ^ ((j5 << i3) | (j6 >>> i5));
            int i8 = i2 + 4;
            d[i8] = d[i8] ^ (j5 >>> i5);
            i++;
            iArr = iArr2;
            j3 = j8;
        }
        long j9 = j3;
        m42778e(d, jArr3);
        jArr3[0] = jArr3[0] ^ j;
        jArr3[1] = jArr3[1] ^ j9;
    }

    /* renamed from: g */
    public static void m42781g(long[] jArr, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m42774c(jArr, d);
        m42778e(d, jArr2);
    }

    /* renamed from: h */
    public static void m42782h(long[] jArr, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m42774c(jArr, d);
        m42773b(jArr2, d, jArr2);
    }

    /* renamed from: e */
    public static void m42778e(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = ((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47);
        long j15 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j16 = j15 >>> 47;
        jArr2[0] = j12 ^ j16;
        jArr2[1] = j13;
        jArr2[2] = (j16 << 30) ^ j14;
        jArr2[3] = 140737488355327L & j15;
    }

    /* renamed from: a */
    public static void m42769a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    /* renamed from: a */
    public static long[] m42771a(BigInteger bigInteger) {
        long[] b = C13963g.m43954b(bigInteger);
        m42767a(b, 0);
        return b;
    }

    /* renamed from: b */
    protected static void m42772b(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 1152921504606846975L;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & 1152921504606846975L;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    /* renamed from: a */
    public static void m42767a(long[] jArr, int i) {
        int i2 = i + 3;
        long j = jArr[i2];
        long j2 = j >>> 47;
        jArr[i] = jArr[i] ^ j2;
        int i3 = i + 2;
        jArr[i3] = (j2 << 30) ^ jArr[i3];
        jArr[i2] = j & 140737488355327L;
    }

    /* renamed from: a */
    public static void m42768a(long[] jArr, int i, long[] jArr2) {
        long[] d = C13963g.m43965d();
        m42774c(jArr, d);
        m42778e(d, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m42774c(jArr2, d);
                m42778e(d, jArr2);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    protected static void m42766a(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 60);
        jArr[1] = (j2 >>> 4) ^ (j3 << 56);
        jArr[2] = (j3 >>> 8) ^ (j4 << 52);
        jArr[3] = (j4 >>> 12) ^ (j5 << 48);
        jArr[4] = (j5 >>> 16) ^ (j6 << 44);
        jArr[5] = (j6 >>> 20) ^ (j7 << 40);
        jArr[6] = (j7 >>> 24) ^ (j8 << 36);
        jArr[7] = j8 >>> 28;
    }

    /* renamed from: c */
    protected static void m42774c(long[] jArr, long[] jArr2) {
        C13957a.m43824a(jArr[0], jArr2, 0);
        C13957a.m43824a(jArr[1], jArr2, 2);
        C13957a.m43824a(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = C13957a.m43825b((int) j);
        jArr2[7] = ((long) C13957a.m43822a((int) (j >>> 32))) & 4294967295L;
    }

    /* renamed from: a */
    protected static void m42765a(long j, long j2, long[] jArr, int i) {
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
        long j7 = (((j3 & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j5;
        jArr[i] = jArr[i] ^ (1152921504606846975L & j4);
        int i5 = i + 1;
        jArr[i5] = ((j7 << 4) ^ (j4 >>> 60)) ^ jArr[i5];
    }

    /* renamed from: d */
    public static void m42777d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] d = C13963g.m43965d();
        m42775c(jArr, jArr2, d);
        m42778e(d, jArr3);
    }
}
