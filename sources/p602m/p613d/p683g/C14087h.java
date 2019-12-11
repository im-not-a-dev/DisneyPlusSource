package p602m.p613d.p683g;

/* renamed from: m.d.g.h */
/* compiled from: Pack */
public abstract class C14087h {
    /* renamed from: a */
    public static int m44469a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    /* renamed from: b */
    public static long m44476b(byte[] bArr, int i) {
        int a = m44469a(bArr, i);
        return (((long) m44469a(bArr, i + 4)) & 4294967295L) | ((((long) a) & 4294967295L) << 32);
    }

    /* renamed from: c */
    public static int m44479c(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: d */
    public static long m44480d(byte[] bArr, int i) {
        return ((((long) m44479c(bArr, i + 4)) & 4294967295L) << 32) | (((long) m44479c(bArr, i)) & 4294967295L);
    }

    /* renamed from: e */
    public static short m44481e(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: b */
    public static void m44477b(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: a */
    public static void m44473a(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m44469a(bArr, i);
            i += 4;
        }
    }

    /* renamed from: a */
    public static void m44470a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    /* renamed from: b */
    public static void m44478b(long j, byte[] bArr, int i) {
        m44477b((int) (4294967295L & j), bArr, i);
        m44477b((int) (j >>> 32), bArr, i + 4);
    }

    /* renamed from: a */
    public static void m44474a(int[] iArr, byte[] bArr, int i) {
        for (int a : iArr) {
            m44470a(a, bArr, i);
            i += 4;
        }
    }

    /* renamed from: a */
    public static void m44471a(long j, byte[] bArr, int i) {
        m44470a((int) (j >>> 32), bArr, i);
        m44470a((int) (j & 4294967295L), bArr, i + 4);
    }

    /* renamed from: a */
    public static void m44472a(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }

    /* renamed from: a */
    public static void m44475a(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            m44478b(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }
}
