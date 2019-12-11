package p163g.p500m.p501a;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import p163g.p500m.p501a.C11737m.C11739b;
import p163g.p500m.p501a.C11737m.C11740c;

/* renamed from: g.m.a.o */
/* compiled from: JsonUtf8Reader */
final class C11742o extends C11737m {

    /* renamed from: f0 */
    private static final ByteString f27319f0 = ByteString.m45615e("'\\");

    /* renamed from: g0 */
    private static final ByteString f27320g0 = ByteString.m45615e("\"\\");

    /* renamed from: h0 */
    private static final ByteString f27321h0 = ByteString.m45615e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: i0 */
    private static final ByteString f27322i0 = ByteString.m45615e("\n\r");

    /* renamed from: j0 */
    private static final ByteString f27323j0 = ByteString.m45615e("*/");

    /* renamed from: Z */
    private final BufferedSource f27324Z;

    /* renamed from: a0 */
    private final Buffer f27325a0;

    /* renamed from: b0 */
    private int f27326b0 = 0;

    /* renamed from: c0 */
    private long f27327c0;

    /* renamed from: d0 */
    private int f27328d0;

    /* renamed from: e0 */
    private String f27329e0;

    C11742o(BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            this.f27324Z = bufferedSource;
            this.f27325a0 = bufferedSource.mo36288Z();
            mo29764b(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: A */
    private void m37731A() throws IOException {
        long b = this.f27324Z.mo36311b(f27321h0);
        Buffer buffer = this.f27325a0;
        if (b == -1) {
            b = buffer.mo36335h();
        }
        buffer.skip(b);
    }

    /* renamed from: s */
    private void m37738s() throws IOException {
        if (!this.f27302X) {
            mo29768e("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: t */
    private int m37739t() throws IOException {
        int[] iArr = this.f27299U;
        int i = this.f27304c;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int c = m37734c(true);
            this.f27325a0.readByte();
            if (c != 44) {
                if (c == 59) {
                    m37738s();
                } else if (c == 93) {
                    this.f27326b0 = 4;
                    return 4;
                } else {
                    mo29768e("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f27299U[this.f27304c - 1] = 4;
            if (i2 == 5) {
                int c2 = m37734c(true);
                this.f27325a0.readByte();
                if (c2 != 44) {
                    if (c2 == 59) {
                        m37738s();
                    } else if (c2 == 125) {
                        this.f27326b0 = 2;
                        return 2;
                    } else {
                        mo29768e("Unterminated object");
                        throw null;
                    }
                }
            }
            int c3 = m37734c(true);
            if (c3 == 34) {
                this.f27325a0.readByte();
                this.f27326b0 = 13;
                return 13;
            } else if (c3 == 39) {
                this.f27325a0.readByte();
                m37738s();
                this.f27326b0 = 12;
                return 12;
            } else if (c3 != 125) {
                m37738s();
                if (m37736c((int) (char) c3)) {
                    this.f27326b0 = 14;
                    return 14;
                }
                mo29768e("Expected name");
                throw null;
            } else if (i2 != 5) {
                this.f27325a0.readByte();
                this.f27326b0 = 2;
                return 2;
            } else {
                mo29768e("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int c4 = m37734c(true);
            this.f27325a0.readByte();
            if (c4 != 58) {
                if (c4 == 61) {
                    m37738s();
                    if (this.f27324Z.mo36314b(1) && this.f27325a0.mo36289a(0) == 62) {
                        this.f27325a0.readByte();
                    }
                } else {
                    mo29768e("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m37734c(false) == -1) {
                this.f27326b0 = 18;
                return 18;
            }
            m37738s();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int c5 = m37734c(true);
        if (c5 == 34) {
            this.f27325a0.readByte();
            this.f27326b0 = 9;
            return 9;
        } else if (c5 != 39) {
            if (!(c5 == 44 || c5 == 59)) {
                if (c5 == 91) {
                    this.f27325a0.readByte();
                    this.f27326b0 = 3;
                    return 3;
                } else if (c5 != 93) {
                    if (c5 != 123) {
                        int v = m37741v();
                        if (v != 0) {
                            return v;
                        }
                        int w = m37742w();
                        if (w != 0) {
                            return w;
                        }
                        if (m37736c((int) this.f27325a0.mo36289a(0))) {
                            m37738s();
                            this.f27326b0 = 10;
                            return 10;
                        }
                        mo29768e("Expected value");
                        throw null;
                    }
                    this.f27325a0.readByte();
                    this.f27326b0 = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f27325a0.readByte();
                    this.f27326b0 = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m37738s();
                this.f27326b0 = 7;
                return 7;
            }
            mo29768e("Unexpected value");
            throw null;
        } else {
            m37738s();
            this.f27325a0.readByte();
            this.f27326b0 = 8;
            return 8;
        }
    }

    /* renamed from: u */
    private String m37740u() throws IOException {
        long b = this.f27324Z.mo36311b(f27321h0);
        return b != -1 ? this.f27325a0.mo36339i(b) : this.f27325a0.mo36327e0();
    }

    /* renamed from: v */
    private int m37741v() throws IOException {
        String str;
        String str2;
        int i;
        byte a = this.f27325a0.mo36289a(0);
        if (a == 116 || a == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (a == 102 || a == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (a != 110 && a != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f27324Z.mo36314b((long) i3)) {
                return 0;
            }
            byte a2 = this.f27325a0.mo36289a((long) i2);
            if (a2 != str2.charAt(i2) && a2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f27324Z.mo36314b((long) (length + 1)) && m37736c((int) this.f27325a0.mo36289a((long) length))) {
            return 0;
        }
        this.f27325a0.skip((long) length);
        this.f27326b0 = i;
        return i;
    }

    /* renamed from: w */
    private int m37742w() throws IOException {
        byte a;
        boolean z = true;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f27324Z.mo36314b((long) i3)) {
                break;
            }
            a = this.f27325a0.mo36289a((long) i2);
            if (a != 43) {
                if (a != 69 && a != 101) {
                    if (a != 45) {
                        if (a != 46) {
                            if (a >= 48 && a <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(a - 48));
                                    i = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i;
                                        }
                                        long j2 = (10 * j) - ((long) (a - 48));
                                        int i4 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        z2 = (i4 > 0 || (i4 == 0 && j2 < j)) & z2;
                                        j = j2;
                                    } else if (c == 3) {
                                        i = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i = 0;
                                        c = 7;
                                    }
                                    i = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i;
                    }
                    i2 = i3;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i;
                } else {
                    c = 5;
                    i2 = i3;
                    z = true;
                }
            } else if (c != 5) {
                return i;
            }
            c = 6;
            i2 = i3;
            z = true;
        }
        if (m37736c((int) a)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f27327c0 = j;
            this.f27325a0.skip((long) i2);
            this.f27326b0 = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f27328d0 = i2;
            this.f27326b0 = 17;
            return 17;
        }
    }

    /* renamed from: x */
    private char m37743x() throws IOException {
        int i;
        int i2;
        if (this.f27324Z.mo36314b(1)) {
            byte readByte = this.f27325a0.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f27302X) {
                    return (char) readByte;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid escape sequence: \\");
                sb.append((char) readByte);
                mo29768e(sb.toString());
                throw null;
            } else if (this.f27324Z.mo36314b(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte a = this.f27325a0.mo36289a((long) i3);
                    char c2 = (char) (c << 4);
                    if (a < 48 || a > 57) {
                        if (a >= 97 && a <= 102) {
                            i = a - 97;
                        } else if (a < 65 || a > 70) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\\u");
                            sb2.append(this.f27325a0.mo36339i(4));
                            mo29768e(sb2.toString());
                            throw null;
                        } else {
                            i = a - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = a - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f27325a0.skip(4);
                return c;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unterminated escape sequence at path ");
                sb3.append(mo29775j0());
                throw new EOFException(sb3.toString());
            }
        } else {
            mo29768e("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: y */
    private boolean m37744y() throws IOException {
        long a = this.f27324Z.mo36295a(f27323j0);
        boolean z = a != -1;
        Buffer buffer = this.f27325a0;
        buffer.skip(z ? a + ((long) f27323j0.size()) : buffer.mo36335h());
        return z;
    }

    /* renamed from: z */
    private void m37745z() throws IOException {
        long b = this.f27324Z.mo36311b(f27322i0);
        Buffer buffer = this.f27325a0;
        buffer.skip(b != -1 ? b + 1 : buffer.mo36335h());
    }

    /* renamed from: a */
    public void mo29760a() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 3) {
            mo29764b(1);
            this.f27301W[this.f27304c - 1] = 0;
            this.f27326b0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo29775j0());
        throw new C11734j(sb.toString());
    }

    /* renamed from: b */
    public void mo29763b() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 1) {
            mo29764b(3);
            this.f27326b0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo29775j0());
        throw new C11734j(sb.toString());
    }

    /* renamed from: c */
    public void mo29766c() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 4) {
            this.f27304c--;
            int[] iArr = this.f27301W;
            int i2 = this.f27304c - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f27326b0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo29775j0());
        throw new C11734j(sb.toString());
    }

    public void close() throws IOException {
        this.f27326b0 = 0;
        this.f27299U[0] = 8;
        this.f27304c = 1;
        this.f27325a0.mo36308a();
        this.f27324Z.close();
    }

    /* renamed from: d */
    public void mo29767d() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 2) {
            this.f27304c--;
            String[] strArr = this.f27300V;
            int i2 = this.f27304c;
            strArr[i2] = null;
            int[] iArr = this.f27301W;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f27326b0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo29775j0());
        throw new C11734j(sb.toString());
    }

    /* renamed from: f */
    public boolean mo29770f() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: h */
    public boolean mo29772h() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 5) {
            this.f27326b0 = 0;
            int[] iArr = this.f27301W;
            int i2 = this.f27304c - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f27326b0 = 0;
            int[] iArr2 = this.f27301W;
            int i3 = this.f27304c - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(mo29775j0());
            throw new C11734j(sb.toString());
        }
    }

    /* renamed from: i */
    public double mo29773i() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 16) {
            this.f27326b0 = 0;
            int[] iArr = this.f27301W;
            int i2 = this.f27304c - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f27327c0;
        }
        String str = "Expected a double but was ";
        String str2 = " at path ";
        if (i == 17) {
            this.f27329e0 = this.f27325a0.mo36339i((long) this.f27328d0);
        } else if (i == 9) {
            this.f27329e0 = m37735c(f27320g0);
        } else if (i == 8) {
            this.f27329e0 = m37735c(f27319f0);
        } else if (i == 10) {
            this.f27329e0 = m37740u();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(peek());
            sb.append(str2);
            sb.append(mo29775j0());
            throw new C11734j(sb.toString());
        }
        this.f27326b0 = 11;
        try {
            double parseDouble = Double.parseDouble(this.f27329e0);
            if (this.f27302X || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f27329e0 = null;
                this.f27326b0 = 0;
                int[] iArr2 = this.f27301W;
                int i3 = this.f27304c - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(str2);
            sb2.append(mo29775j0());
            throw new C11735k(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f27329e0);
            sb3.append(str2);
            sb3.append(mo29775j0());
            throw new C11734j(sb3.toString());
        }
    }

    /* renamed from: j */
    public int mo29774j() throws IOException {
        String str;
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        String str2 = " at path ";
        String str3 = "Expected an int but was ";
        if (i == 16) {
            long j = this.f27327c0;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f27326b0 = 0;
                int[] iArr = this.f27301W;
                int i3 = this.f27304c - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(this.f27327c0);
            sb.append(str2);
            sb.append(mo29775j0());
            throw new C11734j(sb.toString());
        }
        if (i == 17) {
            this.f27329e0 = this.f27325a0.mo36339i((long) this.f27328d0);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m37735c(f27320g0);
            } else {
                str = m37735c(f27319f0);
            }
            this.f27329e0 = str;
            try {
                int parseInt = Integer.parseInt(this.f27329e0);
                this.f27326b0 = 0;
                int[] iArr2 = this.f27301W;
                int i4 = this.f27304c - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(peek());
            sb2.append(str2);
            sb2.append(mo29775j0());
            throw new C11734j(sb2.toString());
        }
        this.f27326b0 = 11;
        try {
            double parseDouble = Double.parseDouble(this.f27329e0);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f27329e0 = null;
                this.f27326b0 = 0;
                int[] iArr3 = this.f27301W;
                int i6 = this.f27304c - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(this.f27329e0);
            sb3.append(str2);
            sb3.append(mo29775j0());
            throw new C11734j(sb3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(this.f27329e0);
            sb4.append(str2);
            sb4.append(mo29775j0());
            throw new C11734j(sb4.toString());
        }
    }

    /* renamed from: k */
    public long mo29776k() throws IOException {
        String str;
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 16) {
            this.f27326b0 = 0;
            int[] iArr = this.f27301W;
            int i2 = this.f27304c - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f27327c0;
        }
        String str2 = " at path ";
        String str3 = "Expected a long but was ";
        if (i == 17) {
            this.f27329e0 = this.f27325a0.mo36339i((long) this.f27328d0);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m37735c(f27320g0);
            } else {
                str = m37735c(f27319f0);
            }
            this.f27329e0 = str;
            try {
                long parseLong = Long.parseLong(this.f27329e0);
                this.f27326b0 = 0;
                int[] iArr2 = this.f27301W;
                int i3 = this.f27304c - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(peek());
            sb.append(str2);
            sb.append(mo29775j0());
            throw new C11734j(sb.toString());
        }
        this.f27326b0 = 11;
        try {
            long longValueExact = new BigDecimal(this.f27329e0).longValueExact();
            this.f27329e0 = null;
            this.f27326b0 = 0;
            int[] iArr3 = this.f27301W;
            int i4 = this.f27304c - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f27329e0);
            sb2.append(str2);
            sb2.append(mo29775j0());
            throw new C11734j(sb2.toString());
        }
    }

    /* renamed from: l */
    public String mo29777l() throws IOException {
        String str;
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 14) {
            str = m37740u();
        } else if (i == 13) {
            str = m37735c(f27320g0);
        } else if (i == 12) {
            str = m37735c(f27319f0);
        } else if (i == 15) {
            str = this.f27329e0;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a name but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(mo29775j0());
            throw new C11734j(sb.toString());
        }
        this.f27326b0 = 0;
        this.f27300V[this.f27304c - 1] = str;
        return str;
    }

    /* renamed from: m */
    public <T> T mo29778m() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 7) {
            this.f27326b0 = 0;
            int[] iArr = this.f27301W;
            int i2 = this.f27304c - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected null but was ");
        sb.append(peek());
        sb.append(" at path ");
        sb.append(mo29775j0());
        throw new C11734j(sb.toString());
    }

    /* renamed from: n */
    public String mo29779n() throws IOException {
        String str;
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i == 10) {
            str = m37740u();
        } else if (i == 9) {
            str = m37735c(f27320g0);
        } else if (i == 8) {
            str = m37735c(f27319f0);
        } else if (i == 11) {
            str = this.f27329e0;
            this.f27329e0 = null;
        } else if (i == 16) {
            str = Long.toString(this.f27327c0);
        } else if (i == 17) {
            str = this.f27325a0.mo36339i((long) this.f27328d0);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a string but was ");
            sb.append(peek());
            sb.append(" at path ");
            sb.append(mo29775j0());
            throw new C11734j(sb.toString());
        }
        this.f27326b0 = 0;
        int[] iArr = this.f27301W;
        int i2 = this.f27304c - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo29780o() throws IOException {
        if (mo29770f()) {
            this.f27329e0 = mo29777l();
            this.f27326b0 = 11;
        }
    }

    public C11740c peek() throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        switch (i) {
            case 1:
                return C11740c.BEGIN_OBJECT;
            case 2:
                return C11740c.END_OBJECT;
            case 3:
                return C11740c.BEGIN_ARRAY;
            case 4:
                return C11740c.END_ARRAY;
            case 5:
            case 6:
                return C11740c.BOOLEAN;
            case 7:
                return C11740c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C11740c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C11740c.NAME;
            case 16:
            case 17:
                return C11740c.NUMBER;
            case 18:
                return C11740c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public void mo29783q() throws IOException {
        if (!this.f27303Y) {
            int i = this.f27326b0;
            if (i == 0) {
                i = m37739t();
            }
            if (i == 14) {
                m37731A();
            } else if (i == 13) {
                m37737d(f27320g0);
            } else if (i == 12) {
                m37737d(f27319f0);
            } else if (i != 15) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(peek());
                sb.append(" at path ");
                sb.append(mo29775j0());
                throw new C11734j(sb.toString());
            }
            this.f27326b0 = 0;
            this.f27300V[this.f27304c - 1] = "null";
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot skip unexpected ");
        sb2.append(peek());
        sb2.append(" at ");
        sb2.append(mo29775j0());
        throw new C11734j(sb2.toString());
    }

    /* renamed from: r */
    public void mo29784r() throws IOException {
        if (!this.f27303Y) {
            int i = 0;
            do {
                int i2 = this.f27326b0;
                if (i2 == 0) {
                    i2 = m37739t();
                }
                if (i2 == 3) {
                    mo29764b(1);
                } else if (i2 == 1) {
                    mo29764b(3);
                } else {
                    if (i2 == 4) {
                        this.f27304c--;
                    } else if (i2 == 2) {
                        this.f27304c--;
                    } else if (i2 == 14 || i2 == 10) {
                        m37731A();
                        this.f27326b0 = 0;
                    } else if (i2 == 9 || i2 == 13) {
                        m37737d(f27320g0);
                        this.f27326b0 = 0;
                    } else if (i2 == 8 || i2 == 12) {
                        m37737d(f27319f0);
                        this.f27326b0 = 0;
                    } else {
                        if (i2 == 17) {
                            this.f27325a0.skip((long) this.f27328d0);
                        }
                        this.f27326b0 = 0;
                    }
                    i--;
                    this.f27326b0 = 0;
                }
                i++;
                this.f27326b0 = 0;
            } while (i != 0);
            int[] iArr = this.f27301W;
            int i3 = this.f27304c;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f27300V[i3 - 1] = "null";
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot skip unexpected ");
        sb.append(peek());
        sb.append(" at ");
        sb.append(mo29775j0());
        throw new C11734j(sb.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JsonReader(");
        sb.append(this.f27324Z);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public int mo29762b(C11739b bVar) throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return m37733b(this.f27329e0, bVar);
        }
        int a = this.f27324Z.mo36290a(bVar.f27307b);
        if (a != -1) {
            this.f27326b0 = 0;
            int[] iArr = this.f27301W;
            int i2 = this.f27304c - 1;
            iArr[i2] = iArr[i2] + 1;
            return a;
        }
        String n = mo29779n();
        int b = m37733b(n, bVar);
        if (b == -1) {
            this.f27326b0 = 11;
            this.f27329e0 = n;
            int[] iArr2 = this.f27301W;
            int i3 = this.f27304c - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return b;
    }

    /* renamed from: c */
    private boolean m37736c(int i) throws IOException {
        if (!(i == 9 || i == 10 || i == 12 || i == 13 || i == 32)) {
            if (i != 35) {
                if (i != 44) {
                    if (!(i == 47 || i == 61)) {
                        if (!(i == 123 || i == 125 || i == 58)) {
                            if (i != 59) {
                                switch (i) {
                                    case 91:
                                    case 93:
                                        break;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            m37738s();
        }
        return false;
    }

    /* renamed from: a */
    public int mo29758a(C11739b bVar) throws IOException {
        int i = this.f27326b0;
        if (i == 0) {
            i = m37739t();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m37732a(this.f27329e0, bVar);
        }
        int a = this.f27324Z.mo36290a(bVar.f27307b);
        if (a != -1) {
            this.f27326b0 = 0;
            this.f27300V[this.f27304c - 1] = bVar.f27306a[a];
            return a;
        }
        String str = this.f27300V[this.f27304c - 1];
        String l = mo29777l();
        int a2 = m37732a(l, bVar);
        if (a2 == -1) {
            this.f27326b0 = 15;
            this.f27329e0 = l;
            this.f27300V[this.f27304c - 1] = str;
        }
        return a2;
    }

    /* renamed from: c */
    private String m37735c(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long b = this.f27324Z.mo36311b(byteString);
            if (b == -1) {
                mo29768e("Unterminated string");
                throw null;
            } else if (this.f27325a0.mo36289a(b) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f27325a0.mo36339i(b));
                this.f27325a0.readByte();
                sb.append(m37743x());
            } else if (sb == null) {
                String i = this.f27325a0.mo36339i(b);
                this.f27325a0.readByte();
                return i;
            } else {
                sb.append(this.f27325a0.mo36339i(b));
                this.f27325a0.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: d */
    private void m37737d(ByteString byteString) throws IOException {
        while (true) {
            long b = this.f27324Z.mo36311b(byteString);
            if (b == -1) {
                mo29768e("Unterminated string");
                throw null;
            } else if (this.f27325a0.mo36289a(b) == 92) {
                this.f27325a0.skip(b + 1);
                m37743x();
            } else {
                this.f27325a0.skip(b + 1);
                return;
            }
        }
    }

    /* renamed from: b */
    private int m37733b(String str, C11739b bVar) {
        int length = bVar.f27306a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f27306a[i])) {
                this.f27326b0 = 0;
                int[] iArr = this.f27301W;
                int i2 = this.f27304c - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m37732a(String str, C11739b bVar) {
        int length = bVar.f27306a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bVar.f27306a[i])) {
                this.f27326b0 = 0;
                this.f27300V[this.f27304c - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f27325a0.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f27324Z.mo36314b(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m37738s();
        r3 = r6.f27325a0.mo36289a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f27325a0.readByte();
        r6.f27325a0.readByte();
        m37745z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f27325a0.readByte();
        r6.f27325a0.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m37744y() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        mo29768e("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m37738s();
        m37745z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m37734c(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            okio.BufferedSource r2 = r6.f27324Z
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo36314b(r4)
            if (r2 == 0) goto L_0x0082
            okio.Buffer r2 = r6.f27325a0
            long r4 = (long) r1
            byte r1 = r2.mo36289a(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            okio.Buffer r2 = r6.f27325a0
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            okio.BufferedSource r3 = r6.f27324Z
            r4 = 2
            boolean r3 = r3.mo36314b(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m37738s()
            okio.Buffer r3 = r6.f27325a0
            r4 = 1
            byte r3 = r3.mo36289a(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            okio.Buffer r1 = r6.f27325a0
            r1.readByte()
            okio.Buffer r1 = r6.f27325a0
            r1.readByte()
            r6.m37745z()
            goto L_0x0001
        L_0x005c:
            okio.Buffer r1 = r6.f27325a0
            r1.readByte()
            okio.Buffer r1 = r6.f27325a0
            r1.readByte()
            boolean r1 = r6.m37744y()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            r6.mo29768e(r7)
            r7 = 0
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m37738s()
            r6.m37745z()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p500m.p501a.C11742o.m37734c(boolean):int");
    }
}
