package com.bamnet.iap.p035c.p037d;

/* renamed from: com.bamnet.iap.c.d.a */
/* compiled from: Base64 */
public class C1659a {

    /* renamed from: a */
    private static final byte[] f5795a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    private static final byte[] f5796b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, -9, -9, -9, -9, -9};

    /* renamed from: a */
    private static byte[] m7667a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3) {
        int i4 = 0;
        int i5 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0);
        if (i2 > 2) {
            i4 = (bArr[i + 2] << 24) >>> 24;
        }
        int i6 = i5 | i4;
        if (i2 == 1) {
            bArr2[i3] = bArr3[i6 >>> 18];
            bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = bArr3[i6 >>> 18];
            bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = bArr3[i6 >>> 18];
            bArr2[i3 + 1] = bArr3[(i6 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i6 >>> 6) & 63];
            bArr2[i3 + 3] = bArr3[i6 & 63];
            return bArr2;
        }
    }

    /* renamed from: a */
    public static String m7661a(byte[] bArr) {
        return m7662a(bArr, 0, bArr.length, f5795a, true);
    }

    /* renamed from: a */
    public static String m7662a(byte[] bArr, int i, int i2, byte[] bArr2, boolean z) {
        byte[] a = m7666a(bArr, i, i2, bArr2, Integer.MAX_VALUE);
        int length = a.length;
        while (!z && length > 0 && a[length - 1] == 61) {
            length--;
        }
        return new String(a, 0, length);
    }

    /* renamed from: a */
    public static byte[] m7666a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = ((i2 + 2) / 3) * 4;
        byte[] bArr3 = new byte[(i4 + (i4 / i3))];
        int i5 = i2 - 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5) {
            int i9 = ((bArr[i6 + i] << 24) >>> 8) | ((bArr[(i6 + 1) + i] << 24) >>> 16) | ((bArr[(i6 + 2) + i] << 24) >>> 24);
            bArr3[i7] = bArr2[i9 >>> 18];
            int i10 = i7 + 1;
            bArr3[i10] = bArr2[(i9 >>> 12) & 63];
            bArr3[i7 + 2] = bArr2[(i9 >>> 6) & 63];
            bArr3[i7 + 3] = bArr2[i9 & 63];
            i8 += 4;
            if (i8 == i3) {
                bArr3[i7 + 4] = 10;
                i8 = 0;
            } else {
                i10 = i7;
            }
            i6 += 3;
            i7 = i10 + 4;
        }
        if (i6 < i2) {
            m7667a(bArr, i6 + i, i2 - i6, bArr3, i7, bArr2);
            if (i8 + 4 == i3) {
                bArr3[i7 + 4] = 10;
            }
        }
        return bArr3;
    }

    /* renamed from: a */
    private static int m7660a(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        int i3 = i + 2;
        if (bArr[i3] == 61) {
            bArr2[i2] = (byte) ((((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        int i4 = i + 3;
        if (bArr[i4] == 61) {
            int i5 = ((bArr3[bArr[i3]] << 24) >>> 18) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6);
            bArr2[i2] = (byte) (i5 >>> 16);
            bArr2[i2 + 1] = (byte) (i5 >>> 8);
            return 2;
        }
        int i6 = ((bArr3[bArr[i4]] << 24) >>> 24) | ((bArr3[bArr[i + 1]] << 24) >>> 12) | ((bArr3[bArr[i]] << 24) >>> 6) | ((bArr3[bArr[i3]] << 24) >>> 18);
        bArr2[i2] = (byte) (i6 >> 16);
        bArr2[i2 + 1] = (byte) (i6 >> 8);
        bArr2[i2 + 2] = (byte) i6;
        return 3;
    }

    /* renamed from: a */
    public static byte[] m7663a(String str) throws C1660b {
        byte[] bytes = str.getBytes();
        return m7664a(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    public static byte[] m7664a(byte[] bArr, int i, int i2) throws C1660b {
        return m7665a(bArr, i, i2, f5796b);
    }

    /* renamed from: a */
    public static byte[] m7665a(byte[] bArr, int i, int i2, byte[] bArr2) throws C1660b {
        int i3 = i2;
        byte[] bArr3 = bArr2;
        byte[] bArr4 = new byte[(((i3 * 3) / 4) + 2)];
        byte[] bArr5 = new byte[4];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            int i7 = i4 + i;
            byte b = (byte) (bArr[i7] & Byte.MAX_VALUE);
            byte b2 = bArr3[b];
            if (b2 >= -5) {
                if (b2 >= -1) {
                    if (b == 61) {
                        int i8 = i3 - i4;
                        byte b3 = (byte) (bArr[(i3 - 1) + i] & Byte.MAX_VALUE);
                        if (i5 == 0 || i5 == 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("invalid padding byte '=' at byte offset ");
                            sb.append(i4);
                            throw new C1660b(sb.toString());
                        } else if ((i5 == 3 && i8 > 2) || (i5 == 4 && i8 > 1)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("padding byte '=' falsely signals end of encoded value at offset ");
                            sb2.append(i4);
                            throw new C1660b(sb2.toString());
                        } else if (b3 != 61 && b3 != 10) {
                            throw new C1660b("encoded value has invalid trailing byte");
                        }
                    } else {
                        int i9 = i5 + 1;
                        bArr5[i5] = b;
                        if (i9 == 4) {
                            i6 += m7660a(bArr5, 0, bArr4, i6, bArr3);
                            i5 = 0;
                        } else {
                            i5 = i9;
                        }
                    }
                }
                i4++;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Bad Base64 input character at ");
                sb3.append(i4);
                sb3.append(": ");
                sb3.append(bArr[i7]);
                sb3.append("(decimal)");
                throw new C1660b(sb3.toString());
            }
        }
        if (i5 != 0) {
            if (i5 != 1) {
                bArr5[i5] = 61;
                i6 += m7660a(bArr5, 0, bArr4, i6, bArr3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("single trailing character at offset ");
                sb4.append(i3 - 1);
                throw new C1660b(sb4.toString());
            }
        }
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr4, 0, bArr6, 0, i6);
        return bArr6;
    }
}
