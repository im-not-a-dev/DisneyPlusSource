package p602m.p613d.p653e.p654a.p655x.p658c;

import java.math.BigInteger;
import p602m.p613d.p653e.p661c.C13957a;
import p602m.p613d.p653e.p661c.C13968l;
import p602m.p613d.p653e.p661c.C13969m;

/* renamed from: m.d.e.a.x.c.q2 */
/* compiled from: SecT571Field */
public class C13912q2 {

    /* renamed from: a */
    private static final long[] f30794a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    /* renamed from: a */
    public static void m43453a(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    /* renamed from: b */
    public static void m43458b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    /* renamed from: c */
    public static void m43460c(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    /* renamed from: d */
    public static void m43461d(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    /* renamed from: e */
    public static void m43463e(long[] jArr, long[] jArr2) {
        long[] a = C13968l.m43988a();
        long[] a2 = C13968l.m43988a();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long a3 = C13957a.m43823a(jArr[i]);
            i = i3 + 1;
            long a4 = C13957a.m43823a(jArr[i3]);
            a[i2] = (4294967295L & a3) | (a4 << 32);
            a2[i2] = (a3 >>> 32) | (-4294967296L & a4);
        }
        long a5 = C13957a.m43823a(jArr[i]);
        a[4] = 4294967295L & a5;
        a2[4] = a5 >>> 32;
        m43466f(a2, f30794a, jArr2);
        m43453a(jArr2, a, jArr2);
    }

    /* renamed from: f */
    public static void m43466f(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13968l.m43991b();
        m43462d(jArr, jArr2, b);
        m43461d(b, jArr3);
    }

    /* renamed from: g */
    public static void m43468g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13968l.m43991b();
        m43462d(jArr, jArr2, b);
        m43460c(jArr3, b, jArr3);
    }

    /* renamed from: h */
    public static void m43469h(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13968l.m43991b();
        m43464e(jArr, jArr2, b);
        m43461d(b, jArr3);
    }

    /* renamed from: i */
    public static void m43470i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] b = C13968l.m43991b();
        m43464e(jArr, jArr2, b);
        m43460c(jArr3, b, jArr3);
    }

    /* renamed from: a */
    private static void m43451a(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i3 + i4] = jArr[i + i4] ^ jArr2[i2 + i4];
        }
    }

    /* renamed from: b */
    private static void m43456b(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    /* renamed from: c */
    public static void m43459c(long[] jArr, long[] jArr2) {
        if (!C13968l.m43990b(jArr)) {
            long[] a = C13968l.m43988a();
            long[] a2 = C13968l.m43988a();
            long[] a3 = C13968l.m43988a();
            m43465f(jArr, a3);
            m43465f(a3, a);
            m43465f(a, a2);
            m43466f(a, a2, a);
            m43450a(a, 2, a2);
            m43466f(a, a2, a);
            m43466f(a, a3, a);
            m43450a(a, 5, a2);
            m43466f(a, a2, a);
            m43450a(a2, 5, a2);
            m43466f(a, a2, a);
            m43450a(a, 15, a2);
            m43466f(a, a2, a3);
            m43450a(a3, 30, a);
            m43450a(a, 30, a2);
            m43466f(a, a2, a);
            m43450a(a, 60, a2);
            m43466f(a, a2, a);
            m43450a(a2, 60, a2);
            m43466f(a, a2, a);
            m43450a(a, 180, a2);
            m43466f(a, a2, a);
            m43450a(a2, 180, a2);
            m43466f(a, a2, a);
            m43466f(a, a3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static void m43452a(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    /* renamed from: b */
    protected static void m43457b(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            C13957a.m43824a(jArr[i], jArr2, i << 1);
        }
    }

    /* renamed from: f */
    public static void m43465f(long[] jArr, long[] jArr2) {
        long[] b = C13968l.m43991b();
        m43457b(jArr, b);
        m43461d(b, jArr2);
    }

    /* renamed from: g */
    public static void m43467g(long[] jArr, long[] jArr2) {
        long[] b = C13968l.m43991b();
        m43457b(jArr, b);
        m43460c(jArr2, b, jArr2);
    }

    /* renamed from: a */
    public static long[] m43454a(BigInteger bigInteger) {
        long[] a = C13968l.m43989a(bigInteger);
        m43449a(a, 0);
        return a;
    }

    /* renamed from: a */
    public static long[] m43455a(long[] jArr) {
        long[] jArr2 = new long[288];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        while (i2 > 0) {
            int i3 = i + 18;
            C13969m.m44009a(9, jArr2, i3 >>> 1, 0, jArr2, i3);
            m43449a(jArr2, i3);
            m43451a(jArr2, 9, jArr2, i3, jArr2, i3 + 9);
            i2--;
            i = i3;
        }
        C13969m.m44008a(144, jArr2, 0, 4, 0, jArr2, 144);
        return jArr2;
    }

    /* renamed from: e */
    protected static void m43464e(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr2;
                long[] jArr6 = jArr3;
                m43456b(jArr4, (i3 & 15) * 9, jArr5, (((i3 >>> 4) & 15) + 16) * 9, jArr6, i2 - 1);
            }
            C13969m.m44007a(16, jArr3, 0, 8, 0);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                m43456b(jArr2, (i6 & 15) * 9, jArr2, (((i6 >>> 4) & 15) + 16) * 9, jArr3, i5);
            }
            if (i4 > 0) {
                C13969m.m44007a(18, jArr3, 0, 8, 0);
            }
        }
    }

    /* renamed from: a */
    public static void m43449a(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    /* renamed from: d */
    protected static void m43462d(long[] jArr, long[] jArr2, long[] jArr3) {
        m43464e(jArr, m43455a(jArr2), jArr3);
    }

    /* renamed from: a */
    public static void m43450a(long[] jArr, int i, long[] jArr2) {
        long[] b = C13968l.m43991b();
        m43457b(jArr, b);
        m43461d(b, jArr2);
        while (true) {
            i--;
            if (i > 0) {
                m43457b(jArr2, b);
                m43461d(b, jArr2);
            } else {
                return;
            }
        }
    }
}
