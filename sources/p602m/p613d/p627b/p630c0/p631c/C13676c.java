package p602m.p613d.p627b.p630c0.p631c;

import p602m.p613d.p683g.C14087h;

/* renamed from: m.d.b.c0.c.c */
/* compiled from: GCMUtil */
public abstract class C13676c {

    /* renamed from: a */
    private static final int[] f30428a = m42030a();

    /* renamed from: a */
    private static int[] m42030a() {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = 0;
            for (int i3 = 7; i3 >= 0; i3--) {
                if (((1 << i3) & i) != 0) {
                    i2 ^= -520093696 >>> (7 - i3);
                }
            }
            iArr[i] = i2;
        }
        return iArr;
    }

    /* renamed from: b */
    public static void m42033b(int[] iArr, int[] iArr2) {
        iArr2[0] = ((m42036d(iArr, iArr2) >> 8) & -520093696) ^ iArr2[0];
    }

    /* renamed from: b */
    public static int[] m42034b() {
        int[] iArr = new int[4];
        iArr[0] = Integer.MIN_VALUE;
        return iArr;
    }

    /* renamed from: c */
    public static void m42035c(int[] iArr, int[] iArr2) {
        int a = m42023a(iArr, 8, iArr2);
        iArr2[0] = f30428a[a >>> 24] ^ iArr2[0];
    }

    /* renamed from: d */
    static int m42036d(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        iArr2[0] = i >>> 1;
        int i2 = i << 31;
        int i3 = iArr[1];
        iArr2[1] = i2 | (i3 >>> 1);
        int i4 = i3 << 31;
        int i5 = iArr[2];
        iArr2[2] = i4 | (i5 >>> 1);
        int i6 = i5 << 31;
        int i7 = iArr[3];
        iArr2[3] = i6 | (i7 >>> 1);
        return i7 << 31;
    }

    /* renamed from: a */
    public static void m42027a(int[] iArr, byte[] bArr) {
        C14087h.m44474a(iArr, bArr, 0);
    }

    /* renamed from: a */
    public static int[] m42031a(byte[] bArr) {
        int[] iArr = new int[4];
        C14087h.m44473a(bArr, 0, iArr);
        return iArr;
    }

    /* renamed from: b */
    public static void m42032b(byte[] bArr, byte[] bArr2) {
        int i = 0;
        do {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
            int i2 = i + 1;
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
            int i4 = i3 + 1;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
            i = i4 + 1;
        } while (i < 16);
    }

    /* renamed from: a */
    public static void m42026a(byte[] bArr, int[] iArr) {
        C14087h.m44473a(bArr, 0, iArr);
    }

    /* renamed from: a */
    public static void m42024a(byte[] bArr, byte[] bArr2) {
        int[] a = m42031a(bArr);
        m42028a(a, m42031a(bArr2));
        m42027a(a, bArr);
    }

    /* renamed from: a */
    public static void m42028a(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = i;
        int i4 = i2;
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i7 < 4) {
            int i12 = iArr2[i7];
            int i13 = i6;
            int i14 = i5;
            int i15 = i4;
            int i16 = i3;
            int i17 = i11;
            int i18 = i10;
            int i19 = i9;
            int i20 = i8;
            for (int i21 = 0; i21 < 32; i21++) {
                int i22 = i12 >> 31;
                i12 <<= 1;
                i20 ^= i16 & i22;
                i19 ^= i15 & i22;
                i18 ^= i14 & i22;
                i17 ^= i22 & i13;
                i13 = (i13 >>> 1) | (i14 << 31);
                i14 = (i14 >>> 1) | (i15 << 31);
                i15 = (i15 >>> 1) | (i16 << 31);
                i16 = (i16 >>> 1) ^ (((i13 << 31) >> 8) & -520093696);
            }
            i7++;
            i8 = i20;
            i9 = i19;
            i10 = i18;
            i11 = i17;
            i3 = i16;
            i4 = i15;
            i5 = i14;
            i6 = i13;
        }
        iArr[0] = i8;
        iArr[1] = i9;
        iArr[2] = i10;
        iArr[3] = i11;
    }

    /* renamed from: a */
    static int m42023a(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = 32 - i;
        iArr2[0] = i2 >>> i;
        int i4 = i2 << i3;
        int i5 = iArr[1];
        iArr2[1] = i4 | (i5 >>> i);
        int i6 = i5 << i3;
        int i7 = iArr[2];
        iArr2[2] = i6 | (i7 >>> i);
        int i8 = i7 << i3;
        int i9 = iArr[3];
        iArr2[3] = (i9 >>> i) | i8;
        return i9 << i3;
    }

    /* renamed from: a */
    public static void m42025a(byte[] bArr, byte[] bArr2, int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= 0) {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i + i2]);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m42029a(int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[0] = iArr[0] ^ iArr2[0];
        iArr3[1] = iArr[1] ^ iArr2[1];
        iArr3[2] = iArr[2] ^ iArr2[2];
        iArr3[3] = iArr[3] ^ iArr2[3];
    }
}
