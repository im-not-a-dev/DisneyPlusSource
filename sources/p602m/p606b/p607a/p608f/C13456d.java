package p602m.p606b.p607a.p608f;

import java.io.IOException;
import java.io.Reader;
import net.danlew.android.joda.DateUtils;

/* renamed from: m.b.a.f.d */
/* compiled from: Yylex */
class C13456d {

    /* renamed from: l */
    private static final int[] f29960l = {0, 0, 1, 1};

    /* renamed from: m */
    private static final char[] f29961m = m41387a("\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000");

    /* renamed from: n */
    private static final int[] f29962n = m41392e();

    /* renamed from: o */
    private static final int[] f29963o = m41394g();

    /* renamed from: p */
    private static final int[] f29964p = {2, 2, 3, 4, 2, 2, 2, 5, 2, 6, 2, 2, 7, 8, 2, 9, 2, 2, 2, 2, 2, 10, 11, 12, 13, 14, 15, 16, 16, 16, 16, 16, 16, 16, 16, 17, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4, 19, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, -1, -1, -1, -1, -1, -1, -1, -1, 24, 25, 26, 27, 28, 29, 30, 31, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, 35, -1, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, 39, -1, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, 42, -1, 42, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, 43, -1, 43, -1, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, -1, 44, -1, 44, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: q */
    private static final String[] f29965q = {"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};

    /* renamed from: r */
    private static final int[] f29966r = m41393f();

    /* renamed from: a */
    private Reader f29967a;

    /* renamed from: b */
    private int f29968b;

    /* renamed from: c */
    private int f29969c = 0;

    /* renamed from: d */
    private char[] f29970d = new char[DateUtils.FORMAT_ABBREV_TIME];

    /* renamed from: e */
    private int f29971e;

    /* renamed from: f */
    private int f29972f;

    /* renamed from: g */
    private int f29973g;

    /* renamed from: h */
    private int f29974h;

    /* renamed from: i */
    private int f29975i;

    /* renamed from: j */
    private boolean f29976j;

    /* renamed from: k */
    private StringBuffer f29977k = new StringBuffer();

    C13456d(Reader reader) {
        this.f29967a = reader;
    }

    /* renamed from: a */
    private static int m41386a(String str, int i, int[] iArr) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            int charAt = str.charAt(i3);
            int i5 = i4 + 1;
            int charAt2 = str.charAt(i4);
            while (true) {
                i2 = i + 1;
                iArr[i] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i = i2;
            }
            i3 = i5;
            i = i2;
        }
        return i;
    }

    /* renamed from: b */
    private static int m41388b(String str, int i, int[] iArr) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            int charAt = str.charAt(i3);
            int i5 = i4 + 1;
            int charAt2 = str.charAt(i4);
            while (true) {
                i2 = i + 1;
                iArr[i] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i = i2;
            }
            i3 = i5;
            i = i2;
        }
        return i;
    }

    /* renamed from: c */
    private static int m41389c(String str, int i, int[] iArr) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            int i4 = i + 1;
            int i5 = i3 + 1;
            iArr[i] = (str.charAt(i2) << 16) | str.charAt(i3);
            i = i4;
            i2 = i5;
        }
        return i;
    }

    /* renamed from: d */
    private boolean m41391d() throws IOException {
        int i = this.f29973g;
        if (i > 0) {
            char[] cArr = this.f29970d;
            System.arraycopy(cArr, i, cArr, 0, this.f29974h - i);
            int i2 = this.f29974h;
            int i3 = this.f29973g;
            this.f29974h = i2 - i3;
            this.f29972f -= i3;
            this.f29971e -= i3;
            this.f29973g = 0;
        }
        int i4 = this.f29972f;
        char[] cArr2 = this.f29970d;
        if (i4 >= cArr2.length) {
            char[] cArr3 = new char[(i4 * 2)];
            System.arraycopy(cArr2, 0, cArr3, 0, cArr2.length);
            this.f29970d = cArr3;
        }
        Reader reader = this.f29967a;
        char[] cArr4 = this.f29970d;
        int i5 = this.f29974h;
        int read = reader.read(cArr4, i5, cArr4.length - i5);
        if (read > 0) {
            this.f29974h += read;
            return false;
        } else if (read != 0) {
            return true;
        } else {
            int read2 = this.f29967a.read();
            if (read2 == -1) {
                return true;
            }
            char[] cArr5 = this.f29970d;
            int i6 = this.f29974h;
            this.f29974h = i6 + 1;
            cArr5[i6] = (char) read2;
            return false;
        }
    }

    /* renamed from: e */
    private static int[] m41392e() {
        int[] iArr = new int[45];
        m41386a("\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018", 0, iArr);
        return iArr;
    }

    /* renamed from: f */
    private static int[] m41393f() {
        int[] iArr = new int[45];
        m41388b("\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t", 0, iArr);
        return iArr;
    }

    /* renamed from: g */
    private static int[] m41394g() {
        int[] iArr = new int[45];
        m41389c("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006", 0, iArr);
        return iArr;
    }

    /* renamed from: c */
    public final String mo34717c() {
        char[] cArr = this.f29970d;
        int i = this.f29973g;
        return new String(cArr, i, this.f29971e - i);
    }

    /* renamed from: c */
    private void m41390c(int i) {
        String str;
        try {
            str = f29965q[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            str = f29965q[0];
        }
        throw new Error(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo34712a() {
        return this.f29975i;
    }

    /* renamed from: b */
    public final char mo34715b(int i) {
        return this.f29970d[this.f29973g + i];
    }

    /* renamed from: a */
    private static char[] m41387a(String str) {
        int i;
        char[] cArr = new char[DateUtils.FORMAT_ABBREV_MONTH];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 90) {
            int i4 = i2 + 1;
            int charAt = str.charAt(i2);
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            while (true) {
                i = i3 + 1;
                cArr[i3] = charAt2;
                charAt--;
                if (charAt <= 0) {
                    break;
                }
                i3 = i;
            }
            i2 = i5;
            i3 = i;
        }
        return cArr;
    }

    /* renamed from: b */
    public C13457e mo34716b() throws IOException, C13455c {
        char[] cArr;
        char c;
        int i = this.f29974h;
        char[] cArr2 = this.f29970d;
        char[] cArr3 = f29961m;
        int[] iArr = f29964p;
        int[] iArr2 = f29963o;
        int[] iArr3 = f29966r;
        while (true) {
            int i2 = this.f29971e;
            this.f29975i += i2 - this.f29973g;
            this.f29973g = i2;
            this.f29972f = i2;
            this.f29968b = f29960l[this.f29969c];
            int i3 = -1;
            int i4 = i2;
            int i5 = -1;
            while (true) {
                if (i2 < i) {
                    int i6 = i2 + 1;
                    cArr = cArr2;
                    c = cArr2[i2];
                    i2 = i6;
                } else if (this.f29976j) {
                    cArr = cArr2;
                    c = 65535;
                } else {
                    this.f29972f = i2;
                    this.f29971e = i4;
                    boolean d = m41391d();
                    int i7 = this.f29972f;
                    i4 = this.f29971e;
                    char[] cArr4 = this.f29970d;
                    int i8 = this.f29974h;
                    if (d) {
                        i = i8;
                        c = 65535;
                        cArr = cArr4;
                    } else {
                        int i9 = i7 + 1;
                        c = cArr4[i7];
                        char[] cArr5 = cArr4;
                        i2 = i9;
                        i = i8;
                        cArr = cArr5;
                    }
                }
                int i10 = iArr[iArr2[this.f29968b] + cArr3[c]];
                if (i10 != i3) {
                    this.f29968b = i10;
                    int i11 = this.f29968b;
                    int i12 = iArr3[i11];
                    if ((i12 & 1) == 1) {
                        if ((i12 & 8) == 8) {
                            i4 = i2;
                            i5 = i11;
                        } else {
                            i4 = i2;
                            i5 = i11;
                        }
                    }
                    cArr2 = cArr;
                    i3 = -1;
                }
            }
            this.f29971e = i4;
            if (i5 >= 0) {
                i5 = f29962n[i5];
            }
            switch (i5) {
                case 1:
                    throw new C13455c(this.f29975i, 0, new Character(mo34715b(0)));
                case 2:
                    return new C13457e(0, Long.valueOf(mo34717c()));
                case 3:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                    break;
                case 4:
                    StringBuffer stringBuffer = this.f29977k;
                    stringBuffer.delete(0, stringBuffer.length());
                    mo34713a(2);
                    break;
                case 5:
                    return new C13457e(1, null);
                case 6:
                    return new C13457e(2, null);
                case 7:
                    return new C13457e(3, null);
                case 8:
                    return new C13457e(4, null);
                case 9:
                    return new C13457e(5, null);
                case 10:
                    return new C13457e(6, null);
                case 11:
                    this.f29977k.append(mo34717c());
                    break;
                case 12:
                    this.f29977k.append('\\');
                    break;
                case 13:
                    mo34713a(0);
                    return new C13457e(0, this.f29977k.toString());
                case 14:
                    this.f29977k.append('\"');
                    break;
                case 15:
                    this.f29977k.append('/');
                    break;
                case 16:
                    this.f29977k.append(8);
                    break;
                case 17:
                    this.f29977k.append(12);
                    break;
                case 18:
                    this.f29977k.append(10);
                    break;
                case 19:
                    this.f29977k.append(13);
                    break;
                case 20:
                    this.f29977k.append(9);
                    break;
                case 21:
                    return new C13457e(0, Double.valueOf(mo34717c()));
                case 22:
                    return new C13457e(0, null);
                case 23:
                    return new C13457e(0, Boolean.valueOf(mo34717c()));
                case 24:
                    try {
                        this.f29977k.append((char) Integer.parseInt(mo34717c().substring(2), 16));
                        break;
                    } catch (Exception e) {
                        throw new C13455c(this.f29975i, 2, e);
                    }
                default:
                    if (c == 65535 && this.f29973g == this.f29972f) {
                        this.f29976j = true;
                        return null;
                    }
                    m41390c(1);
                    throw null;
            }
            cArr2 = cArr;
        }
    }

    /* renamed from: a */
    public final void mo34714a(Reader reader) {
        this.f29967a = reader;
        this.f29976j = false;
        this.f29973g = 0;
        this.f29974h = 0;
        this.f29971e = 0;
        this.f29972f = 0;
        this.f29975i = 0;
        this.f29969c = 0;
    }

    /* renamed from: a */
    public final void mo34713a(int i) {
        this.f29969c = i;
    }
}
