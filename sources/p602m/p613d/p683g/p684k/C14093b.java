package p602m.p613d.p683g.p684k;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: m.d.g.k.b */
/* compiled from: Base64Encoder */
public class C14093b implements C14095d {

    /* renamed from: a */
    protected final byte[] f31113a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    protected byte f31114b = 61;

    /* renamed from: c */
    protected final byte[] f31115c = new byte[128];

    public C14093b() {
        mo35661a();
    }

    /* renamed from: a */
    private boolean m44499a(char c) {
        return c == 10 || c == 13 || c == 9 || c == ' ';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35661a() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f31115c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f31113a;
            if (i < bArr2.length) {
                this.f31115c[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public int mo35662b(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3 = i2 + i;
        while (i3 > i && m44499a((char) bArr[i3 - 1])) {
            i3--;
        }
        int i4 = i3 - 4;
        int a = m44498a(bArr, i, i4);
        int i5 = 0;
        while (a < i4) {
            int i6 = a + 1;
            byte b = this.f31115c[bArr[a]];
            int a2 = m44498a(bArr, i6, i4);
            int i7 = a2 + 1;
            byte b2 = this.f31115c[bArr[a2]];
            int a3 = m44498a(bArr, i7, i4);
            int i8 = a3 + 1;
            byte b3 = this.f31115c[bArr[a3]];
            int a4 = m44498a(bArr, i8, i4);
            int i9 = a4 + 1;
            byte b4 = this.f31115c[bArr[a4]];
            if ((b | b2 | b3 | b4) >= 0) {
                outputStream.write((b << 2) | (b2 >> 4));
                outputStream.write((b2 << 4) | (b3 >> 2));
                outputStream.write((b3 << 6) | b4);
                i5 += 3;
                a = m44498a(bArr, i9, i4);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        return i5 + m44496a(outputStream, (char) bArr[i4], (char) bArr[i3 - 3], (char) bArr[i3 - 2], (char) bArr[i3 - 1]);
    }

    /* renamed from: a */
    public int mo35660a(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3;
        int i4;
        int i5 = i2 % 3;
        int i6 = i2 - i5;
        int i7 = i;
        while (true) {
            i3 = i + i6;
            i4 = 4;
            if (i7 >= i3) {
                break;
            }
            byte b = bArr[i7] & 255;
            byte b2 = bArr[i7 + 1] & 255;
            byte b3 = bArr[i7 + 2] & 255;
            outputStream.write(this.f31113a[(b >>> 2) & 63]);
            outputStream.write(this.f31113a[((b << 4) | (b2 >>> 4)) & 63]);
            outputStream.write(this.f31113a[((b2 << 2) | (b3 >>> 6)) & 63]);
            outputStream.write(this.f31113a[b3 & 63]);
            i7 += 3;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                byte b4 = bArr[i3] & 255;
                int i8 = (b4 >>> 2) & 63;
                int i9 = (b4 << 4) & 63;
                outputStream.write(this.f31113a[i8]);
                outputStream.write(this.f31113a[i9]);
                outputStream.write(this.f31114b);
                outputStream.write(this.f31114b);
            } else if (i5 == 2) {
                byte b5 = bArr[i3] & 255;
                byte b6 = bArr[i3 + 1] & 255;
                int i10 = (b5 >>> 2) & 63;
                int i11 = ((b5 << 4) | (b6 >>> 4)) & 63;
                int i12 = (b6 << 2) & 63;
                outputStream.write(this.f31113a[i10]);
                outputStream.write(this.f31113a[i11]);
                outputStream.write(this.f31113a[i12]);
                outputStream.write(this.f31114b);
            }
        }
        int i13 = (i6 / 3) * 4;
        if (i5 == 0) {
            i4 = 0;
        }
        return i13 + i4;
    }

    /* renamed from: a */
    private int m44498a(byte[] bArr, int i, int i2) {
        while (i < i2 && m44499a((char) bArr[i])) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public int mo35659a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && m44499a(str.charAt(length - 1))) {
            length--;
        }
        int i = length - 4;
        int i2 = 0;
        int a = m44497a(str, 0, i);
        while (a < i) {
            int i3 = a + 1;
            byte b = this.f31115c[str.charAt(a)];
            int a2 = m44497a(str, i3, i);
            int i4 = a2 + 1;
            byte b2 = this.f31115c[str.charAt(a2)];
            int a3 = m44497a(str, i4, i);
            int i5 = a3 + 1;
            byte b3 = this.f31115c[str.charAt(a3)];
            int a4 = m44497a(str, i5, i);
            int i6 = a4 + 1;
            byte b4 = this.f31115c[str.charAt(a4)];
            if ((b | b2 | b3 | b4) >= 0) {
                outputStream.write((b << 2) | (b2 >> 4));
                outputStream.write((b2 << 4) | (b3 >> 2));
                outputStream.write((b3 << 6) | b4);
                i2 += 3;
                a = m44497a(str, i6, i);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        return i2 + m44496a(outputStream, str.charAt(i), str.charAt(length - 3), str.charAt(length - 2), str.charAt(length - 1));
    }

    /* renamed from: a */
    private int m44496a(OutputStream outputStream, char c, char c2, char c3, char c4) throws IOException {
        byte b = this.f31114b;
        String str = "invalid characters encountered at end of base64 data";
        if (c3 == b) {
            if (c4 == b) {
                byte[] bArr = this.f31115c;
                byte b2 = bArr[c];
                byte b3 = bArr[c2];
                if ((b2 | b3) >= 0) {
                    outputStream.write((b2 << 2) | (b3 >> 4));
                    return 1;
                }
                throw new IOException(str);
            }
            throw new IOException(str);
        } else if (c4 == b) {
            byte[] bArr2 = this.f31115c;
            byte b4 = bArr2[c];
            byte b5 = bArr2[c2];
            byte b6 = bArr2[c3];
            if ((b4 | b5 | b6) >= 0) {
                outputStream.write((b4 << 2) | (b5 >> 4));
                outputStream.write((b5 << 4) | (b6 >> 2));
                return 2;
            }
            throw new IOException(str);
        } else {
            byte[] bArr3 = this.f31115c;
            byte b7 = bArr3[c];
            byte b8 = bArr3[c2];
            byte b9 = bArr3[c3];
            byte b10 = bArr3[c4];
            if ((b7 | b8 | b9 | b10) >= 0) {
                outputStream.write((b7 << 2) | (b8 >> 4));
                outputStream.write((b8 << 4) | (b9 >> 2));
                outputStream.write((b9 << 6) | b10);
                return 3;
            }
            throw new IOException(str);
        }
    }

    /* renamed from: a */
    private int m44497a(String str, int i, int i2) {
        while (i < i2 && m44499a(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
