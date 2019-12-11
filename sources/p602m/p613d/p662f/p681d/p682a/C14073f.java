package p602m.p613d.p662f.p681d.p682a;

/* renamed from: m.d.f.d.a.f */
/* compiled from: LittleEndianConversions */
public final class C14073f {
    /* renamed from: a */
    public static int m44404a(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    /* renamed from: a */
    public static byte[] m44409a(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    /* renamed from: a */
    public static int m44405a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        return ((bArr[i3 + 1] & 255) << 24) | b | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: a */
    public static int m44406a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 |= (bArr[i + i4] & 255) << (i4 * 8);
        }
        return i3;
    }

    /* renamed from: a */
    public static void m44407a(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i5] = (byte) (i >>> 24);
    }

    /* renamed from: a */
    public static void m44408a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }
}
