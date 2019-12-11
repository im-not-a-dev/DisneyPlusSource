package p163g.p441i.p442a.p443a.p445r;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import net.danlew.android.joda.DateUtils;

/* renamed from: g.i.a.a.r.h */
/* compiled from: UTF8Writer */
public final class C10923h extends Writer {

    /* renamed from: U */
    private OutputStream f25927U;

    /* renamed from: V */
    private byte[] f25928V;

    /* renamed from: W */
    private final int f25929W = (this.f25928V.length - 4);

    /* renamed from: X */
    private int f25930X = 0;

    /* renamed from: Y */
    private int f25931Y;

    /* renamed from: c */
    private final C10918c f25932c;

    public C10923h(C10918c cVar, OutputStream outputStream) {
        this.f25932c = cVar;
        this.f25927U = outputStream;
        this.f25928V = cVar.mo28115b();
    }

    /* renamed from: c */
    protected static void m34486c(int i) throws IOException {
        throw new IOException(m34487d(i));
    }

    /* renamed from: d */
    protected static String m34487d(int i) {
        String str = "Illegal character point (0x";
        if (i > 1114111) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Integer.toHexString(i));
            sb.append(") to output; max is 0x10FFFF as per RFC 4627");
            return sb.toString();
        } else if (i >= 55296) {
            String str2 = ")";
            if (i <= 56319) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unmatched first part of surrogate pair (0x");
                sb2.append(Integer.toHexString(i));
                sb2.append(str2);
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unmatched second part of surrogate pair (0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(str2);
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(Integer.toHexString(i));
            sb4.append(") to output");
            return sb4.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo28124b(int i) throws IOException {
        int i2 = this.f25931Y;
        this.f25931Y = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + DateUtils.FORMAT_ABBREV_MONTH + (i - 56320);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i2));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i));
        sb.append("; illegal combination");
        throw new IOException(sb.toString());
    }

    public void close() throws IOException {
        OutputStream outputStream = this.f25927U;
        if (outputStream != null) {
            int i = this.f25930X;
            if (i > 0) {
                outputStream.write(this.f25928V, 0, i);
                this.f25930X = 0;
            }
            OutputStream outputStream2 = this.f25927U;
            this.f25927U = null;
            byte[] bArr = this.f25928V;
            if (bArr != null) {
                this.f25928V = null;
                this.f25932c.mo28109a(bArr);
            }
            outputStream2.close();
            int i2 = this.f25931Y;
            this.f25931Y = 0;
            if (i2 > 0) {
                m34486c(i2);
                throw null;
            }
        }
    }

    public void flush() throws IOException {
        OutputStream outputStream = this.f25927U;
        if (outputStream != null) {
            int i = this.f25930X;
            if (i > 0) {
                outputStream.write(this.f25928V, 0, i);
                this.f25930X = 0;
            }
            this.f25927U.flush();
        }
    }

    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    public Writer append(char c) throws IOException {
        write((int) c);
        return this;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write((int) cArr[i]);
            }
            return;
        }
        if (this.f25931Y > 0) {
            int i3 = i + 1;
            i2--;
            write(mo28124b(cArr[i]));
            i = i3;
        }
        int i4 = this.f25930X;
        byte[] bArr = this.f25928V;
        int i5 = this.f25929W;
        int i6 = i2 + r9;
        while (r9 < i6) {
            if (i4 >= i5) {
                this.f25927U.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = r9 + 1;
            char c = cArr[r9];
            if (c < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) c;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 + i7;
                while (true) {
                    r9 = i7;
                    i4 = i8;
                    if (r9 >= i11) {
                        continue;
                        break;
                    }
                    i7 = r9 + 1;
                    c = cArr[r9];
                    if (c >= 128) {
                        break;
                    }
                    i8 = i4 + 1;
                    bArr[i4] = (byte) c;
                }
            }
            if (c < 2048) {
                int i12 = i4 + 1;
                bArr[i4] = (byte) ((c >> 6) | 192);
                i4 = i12 + 1;
                bArr[i12] = (byte) ((c & '?') | 128);
                r9 = i7;
            } else if (c < 55296 || c > 57343) {
                int i13 = i4 + 1;
                bArr[i4] = (byte) ((c >> 12) | 224);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((c >> 6) & 63) | 128);
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((c & '?') | 128);
                r9 = i7;
                i4 = i15;
            } else if (c <= 56319) {
                this.f25931Y = c;
                if (i7 >= i6) {
                    break;
                }
                r9 = i7 + 1;
                int b = mo28124b(cArr[i7]);
                if (b <= 1114111) {
                    int i16 = i4 + 1;
                    bArr[i4] = (byte) ((b >> 18) | 240);
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) (((b >> 12) & 63) | 128);
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) (((b >> 6) & 63) | 128);
                    i4 = i18 + 1;
                    bArr[i18] = (byte) ((b & 63) | 128);
                } else {
                    this.f25930X = i4;
                    m34486c(b);
                    throw null;
                }
            } else {
                this.f25930X = i4;
                m34486c(c);
                throw null;
            }
        }
        this.f25930X = i4;
    }

    public void write(int i) throws IOException {
        int i2;
        if (this.f25931Y > 0) {
            i = mo28124b(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i <= 56319) {
                this.f25931Y = i;
                return;
            } else {
                m34486c(i);
                throw null;
            }
        }
        int i3 = this.f25930X;
        if (i3 >= this.f25929W) {
            this.f25927U.write(this.f25928V, 0, i3);
            this.f25930X = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f25928V;
            int i4 = this.f25930X;
            this.f25930X = i4 + 1;
            bArr[i4] = (byte) i;
        } else {
            int i5 = this.f25930X;
            if (i < 2048) {
                byte[] bArr2 = this.f25928V;
                int i6 = i5 + 1;
                bArr2[i5] = (byte) ((i >> 6) | 192);
                i2 = i6 + 1;
                bArr2[i6] = (byte) ((i & 63) | 128);
            } else if (i <= 65535) {
                byte[] bArr3 = this.f25928V;
                int i7 = i5 + 1;
                bArr3[i5] = (byte) ((i >> 12) | 224);
                int i8 = i7 + 1;
                bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
                int i9 = i8 + 1;
                bArr3[i8] = (byte) ((i & 63) | 128);
                i2 = i9;
            } else if (i <= 1114111) {
                byte[] bArr4 = this.f25928V;
                int i10 = i5 + 1;
                bArr4[i5] = (byte) ((i >> 18) | 240);
                int i11 = i10 + 1;
                bArr4[i10] = (byte) (((i >> 12) & 63) | 128);
                int i12 = i11 + 1;
                bArr4[i11] = (byte) (((i >> 6) & 63) | 128);
                i2 = i12 + 1;
                bArr4[i12] = (byte) ((i & 63) | 128);
            } else {
                m34486c(i);
                throw null;
            }
            this.f25930X = i2;
        }
    }

    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    public void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write((int) str.charAt(i));
            }
            return;
        }
        if (this.f25931Y > 0) {
            int i3 = i + 1;
            i2--;
            write(mo28124b(str.charAt(i)));
            i = i3;
        }
        int i4 = this.f25930X;
        byte[] bArr = this.f25928V;
        int i5 = this.f25929W;
        int i6 = i2 + r9;
        while (r9 < i6) {
            if (i4 >= i5) {
                this.f25927U.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = r9 + 1;
            char charAt = str.charAt(r9);
            if (charAt < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) charAt;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 + i7;
                while (true) {
                    r9 = i7;
                    i4 = i8;
                    if (r9 >= i11) {
                        continue;
                        break;
                    }
                    i7 = r9 + 1;
                    charAt = str.charAt(r9);
                    if (charAt >= 128) {
                        break;
                    }
                    i8 = i4 + 1;
                    bArr[i4] = (byte) charAt;
                }
            }
            if (charAt < 2048) {
                int i12 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i4 = i12 + 1;
                bArr[i12] = (byte) ((charAt & '?') | 128);
                r9 = i7;
            } else if (charAt < 55296 || charAt > 57343) {
                int i13 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 12) | 224);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((charAt >> 6) & 63) | 128);
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((charAt & '?') | 128);
                r9 = i7;
                i4 = i15;
            } else if (charAt <= 56319) {
                this.f25931Y = charAt;
                if (i7 >= i6) {
                    break;
                }
                r9 = i7 + 1;
                int b = mo28124b(str.charAt(i7));
                if (b <= 1114111) {
                    int i16 = i4 + 1;
                    bArr[i4] = (byte) ((b >> 18) | 240);
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) (((b >> 12) & 63) | 128);
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) (((b >> 6) & 63) | 128);
                    i4 = i18 + 1;
                    bArr[i18] = (byte) ((b & 63) | 128);
                } else {
                    this.f25930X = i4;
                    m34486c(b);
                    throw null;
                }
            } else {
                this.f25930X = i4;
                m34486c(charAt);
                throw null;
            }
        }
        this.f25930X = i4;
    }
}
