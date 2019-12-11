package okio;

/* renamed from: okio.a */
/* compiled from: -Base64.kt */
public final class C14271a {

    /* renamed from: a */
    private static final byte[] f31856a = ByteString.f31852X.mo36400c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").mo36379b();

    static {
        ByteString.f31852X.mo36400c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").mo36379b();
    }

    /* renamed from: a */
    public static final byte[] m45645a(String str) {
        int i;
        int length = str.length();
        while (length > 0) {
            char charAt = str.charAt(length - 1);
            if (charAt != '=' && charAt != 10 && charAt != 13 && charAt != ' ' && charAt != 9) {
                break;
            }
            length--;
        }
        byte[] bArr = new byte[((int) ((((long) length) * 6) / 8))];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt2 = str.charAt(i5);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i = 63;
            } else {
                if (!(charAt2 == 10 || charAt2 == 13 || charAt2 == ' ' || charAt2 == 9)) {
                    return null;
                }
            }
            i3 = (i3 << 6) | i;
            i2++;
            if (i2 % 4 == 0) {
                int i6 = i4 + 1;
                bArr[i4] = (byte) (i3 >> 16);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (i3 >> 8);
                int i8 = i7 + 1;
                bArr[i7] = (byte) i3;
                i4 = i8;
            }
        }
        int i9 = i2 % 4;
        if (i9 == 1) {
            return null;
        }
        if (i9 == 2) {
            int i10 = i4 + 1;
            bArr[i4] = (byte) ((i3 << 12) >> 16);
            i4 = i10;
        } else if (i9 == 3) {
            int i11 = i3 << 6;
            int i12 = i4 + 1;
            bArr[i4] = (byte) (i11 >> 16);
            i4 = i12 + 1;
            bArr[i12] = (byte) (i11 >> 8);
        }
        if (i4 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        C14272b.m45647a(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ String m45644a(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = f31856a;
        }
        return m45643a(bArr, bArr2);
    }

    /* renamed from: a */
    public static final String m45643a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            int i11 = i10 + 1;
            byte b5 = (byte) 61;
            bArr3[i10] = b5;
            bArr3[i11] = b5;
        } else if (length2 == 2) {
            int i12 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i12];
            int i13 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            int i15 = i14 + 1;
            bArr3[i14] = bArr2[(b7 & 15) << 2];
            bArr3[i15] = (byte) 61;
        }
        return C14272b.m45646a(bArr3);
    }
}
