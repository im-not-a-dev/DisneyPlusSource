package p602m.p613d.p653e.p661c;

/* renamed from: m.d.e.c.a */
/* compiled from: Interleave */
public class C13957a {
    /* renamed from: a */
    public static int m43822a(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    /* renamed from: a */
    public static long m43823a(long j) {
        long j2 = ((j >>> 1) ^ j) & 2459565876494606882L;
        long j3 = j ^ (j2 ^ (j2 << 1));
        long j4 = ((j3 >>> 2) ^ j3) & 868082074056920076L;
        long j5 = j3 ^ (j4 ^ (j4 << 2));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 8) ^ j7) & 280375465148160L;
        long j9 = j7 ^ (j8 ^ (j8 << 8));
        long j10 = ((j9 >>> 16) ^ j9) & 4294901760L;
        return j9 ^ (j10 ^ (j10 << 16));
    }

    /* renamed from: a */
    public static void m43824a(long j, long[] jArr, int i) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & 6148914691236517205L;
        jArr[i + 1] = (j11 >>> 1) & 6148914691236517205L;
    }

    /* renamed from: b */
    public static long m43825b(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        int i9 = i7 ^ (i8 ^ (i8 << 1));
        return ((((long) (i9 >>> 1)) & 1431655765) << 32) | (1431655765 & ((long) i9));
    }

    /* renamed from: c */
    public static int m43826c(int i) {
        int i2 = i & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }
}
