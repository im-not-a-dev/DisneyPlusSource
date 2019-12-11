package p602m.p613d.p662f.p664b.p667c.p668b;

import java.lang.reflect.Array;

/* renamed from: m.d.f.b.c.b.a */
/* compiled from: RainbowUtil */
public class C13993a {
    /* renamed from: a */
    public static short[] m44137a(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    /* renamed from: b */
    public static int[] m44142b(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return iArr;
    }

    /* renamed from: a */
    public static short[][] m44139a(byte[][] bArr) {
        short[][] sArr = (short[][]) Array.newInstance(short.class, new int[]{bArr.length, bArr[0].length});
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    /* renamed from: a */
    public static short[][][] m44141a(byte[][][] bArr) {
        short[][][] sArr = (short[][][]) Array.newInstance(short.class, new int[]{bArr.length, bArr[0].length, bArr[0][0].length});
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }

    /* renamed from: a */
    public static byte[] m44135a(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m44136a(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[][] m44138a(short[][] sArr) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, new int[]{sArr.length, sArr[0].length});
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static byte[][][] m44140a(short[][][] sArr) {
        byte[][][] bArr = (byte[][][]) Array.newInstance(byte.class, new int[]{sArr.length, sArr[0].length, sArr[0][0].length});
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public static boolean m44132a(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m44133a(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m44132a(sArr[length], sArr2[length]);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m44134a(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= m44133a(sArr[length], sArr2[length]);
        }
        return z;
    }
}
