package p163g.p449j.p487c.p488a0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import p163g.p449j.p487c.p490y.C11601e;
import p163g.p449j.p487c.p490y.p491l.C11628e;

/* renamed from: g.j.c.a0.a */
/* compiled from: JsonReader */
public class C11533a implements Closeable {

    /* renamed from: i0 */
    private static final char[] f26947i0 = ")]}'\n".toCharArray();

    /* renamed from: U */
    private boolean f26948U = false;

    /* renamed from: V */
    private final char[] f26949V = new char[1024];

    /* renamed from: W */
    private int f26950W = 0;

    /* renamed from: X */
    private int f26951X = 0;

    /* renamed from: Y */
    private int f26952Y = 0;

    /* renamed from: Z */
    private int f26953Z = 0;

    /* renamed from: a0 */
    int f26954a0 = 0;

    /* renamed from: b0 */
    private long f26955b0;

    /* renamed from: c */
    private final Reader f26956c;

    /* renamed from: c0 */
    private int f26957c0;

    /* renamed from: d0 */
    private String f26958d0;

    /* renamed from: e0 */
    private int[] f26959e0 = new int[32];

    /* renamed from: f0 */
    private int f26960f0 = 0;

    /* renamed from: g0 */
    private String[] f26961g0;

    /* renamed from: h0 */
    private int[] f26962h0;

    /* renamed from: g.j.c.a0.a$a */
    /* compiled from: JsonReader */
    static class C11534a extends C11601e {
        C11534a() {
        }

        /* renamed from: a */
        public void mo29483a(C11533a aVar) throws IOException {
            if (aVar instanceof C11628e) {
                ((C11628e) aVar).mo29653q();
                return;
            }
            int i = aVar.f26954a0;
            if (i == 0) {
                i = aVar.mo29465c();
            }
            if (i == 13) {
                aVar.f26954a0 = 9;
            } else if (i == 12) {
                aVar.f26954a0 = 8;
            } else if (i == 14) {
                aVar.f26954a0 = 10;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(aVar.peek());
                sb.append(aVar.mo29471h());
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    static {
        C11601e.f27060a = new C11534a();
    }

    public C11533a(Reader reader) {
        int[] iArr = this.f26959e0;
        int i = this.f26960f0;
        this.f26960f0 = i + 1;
        iArr[i] = 6;
        this.f26961g0 = new String[32];
        this.f26962h0 = new int[32];
        if (reader != null) {
            this.f26956c = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: q */
    private void mo29653q() throws IOException {
        if (!this.f26948U) {
            m37181f("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: r */
    private void m37183r() throws IOException {
        m37175b(true);
        this.f26950W--;
        int i = this.f26950W;
        char[] cArr = f26947i0;
        if (i + cArr.length <= this.f26951X || m37177b(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f26947i0;
                if (i2 >= cArr2.length) {
                    this.f26950W += cArr2.length;
                    return;
                } else if (this.f26949V[this.f26950W + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        mo29653q();
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m37184s() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L_0x0003:
            r1 = 0
        L_0x0004:
            int r3 = r6.f26950W
            int r4 = r3 + r1
            int r5 = r6.f26951X
            if (r4 >= r5) goto L_0x004f
            char[] r4 = r6.f26949V
            int r3 = r3 + r1
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005d
            r4 = 10
            if (r3 == r4) goto L_0x005d
            r4 = 12
            if (r3 == r4) goto L_0x005d
            r4 = 13
            if (r3 == r4) goto L_0x005d
            r4 = 32
            if (r3 == r4) goto L_0x005d
            r4 = 35
            if (r3 == r4) goto L_0x004b
            r4 = 44
            if (r3 == r4) goto L_0x005d
            r4 = 47
            if (r3 == r4) goto L_0x004b
            r4 = 61
            if (r3 == r4) goto L_0x004b
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005d
            r4 = 58
            if (r3 == r4) goto L_0x005d
            r4 = 59
            if (r3 == r4) goto L_0x004b
            switch(r3) {
                case 91: goto L_0x005d;
                case 92: goto L_0x004b;
                case 93: goto L_0x005d;
                default: goto L_0x0048;
            }
        L_0x0048:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x004b:
            r6.mo29653q()
            goto L_0x005d
        L_0x004f:
            char[] r3 = r6.f26949V
            int r3 = r3.length
            if (r1 >= r3) goto L_0x005f
            int r3 = r1 + 1
            boolean r3 = r6.m37177b(r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x0004
        L_0x005d:
            r0 = r1
            goto L_0x007f
        L_0x005f:
            if (r2 != 0) goto L_0x006c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r1, r3)
            r2.<init>(r3)
        L_0x006c:
            char[] r3 = r6.f26949V
            int r4 = r6.f26950W
            r2.append(r3, r4, r1)
            int r3 = r6.f26950W
            int r3 = r3 + r1
            r6.f26950W = r3
            r1 = 1
            boolean r1 = r6.m37177b(r1)
            if (r1 != 0) goto L_0x0003
        L_0x007f:
            if (r2 != 0) goto L_0x008b
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f26949V
            int r3 = r6.f26950W
            r1.<init>(r2, r3, r0)
            goto L_0x0096
        L_0x008b:
            char[] r1 = r6.f26949V
            int r3 = r6.f26950W
            r2.append(r1, r3, r0)
            java.lang.String r1 = r2.toString()
        L_0x0096:
            int r2 = r6.f26950W
            int r2 = r2 + r0
            r6.f26950W = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p488a0.C11533a.m37184s():java.lang.String");
    }

    /* renamed from: t */
    private int m37185t() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f26949V[this.f26950W];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f26950W + i2 >= this.f26951X && !m37177b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f26949V[this.f26950W + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f26950W + length < this.f26951X || m37177b(length + 1)) && m37174a(this.f26949V[this.f26950W + length])) {
            return 0;
        }
        this.f26950W += length;
        this.f26954a0 = i;
        return i;
    }

    /* renamed from: u */
    private int m37186u() throws IOException {
        char c;
        char[] cArr = this.f26949V;
        int i = this.f26950W;
        int i2 = 0;
        int i3 = this.f26951X;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i3) {
                if (i4 == cArr.length) {
                    return i2;
                }
                if (!m37177b(i4 + 1)) {
                    break;
                }
                i = this.f26950W;
                i3 = this.f26951X;
            }
            c = cArr[i + i4];
            if (c == '+') {
                i2 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i2 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i2 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i2 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i2 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            boolean z3 = i5 > 0 || (i5 == 0 && j2 < j);
                            j = j2;
                            z = z3 & z;
                        } else if (c2 == 3) {
                            i2 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i2 = 0;
                            c2 = 7;
                        }
                        i2 = 0;
                    }
                }
                i4++;
            }
            c2 = 6;
            i4++;
        }
        if (m37174a(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f26955b0 = j;
            this.f26950W += i4;
            this.f26954a0 = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f26957c0 = i4;
            this.f26954a0 = 16;
            return 16;
        }
    }

    /* renamed from: v */
    private char m37187v() throws IOException {
        int i;
        int i2;
        String str = "Unterminated escape sequence";
        if (this.f26950W != this.f26951X || m37177b(1)) {
            char[] cArr = this.f26949V;
            int i3 = this.f26950W;
            this.f26950W = i3 + 1;
            char c = cArr[i3];
            if (c == 10) {
                this.f26952Y++;
                this.f26953Z = this.f26950W;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m37181f("Invalid escape sequence");
                    throw null;
                } else if (this.f26950W + 4 <= this.f26951X || m37177b(4)) {
                    char c2 = 0;
                    int i4 = this.f26950W;
                    int i5 = i4 + 4;
                    while (i4 < i5) {
                        char c3 = this.f26949V[i4];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder sb = new StringBuilder();
                                sb.append("\\u");
                                sb.append(new String(this.f26949V, this.f26950W, 4));
                                throw new NumberFormatException(sb.toString());
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i4++;
                    }
                    this.f26950W += 4;
                    return c2;
                } else {
                    m37181f(str);
                    throw null;
                }
            }
            return c;
        }
        m37181f(str);
        throw null;
    }

    /* renamed from: w */
    private void m37188w() throws IOException {
        char c;
        do {
            if (this.f26950W < this.f26951X || m37177b(1)) {
                char[] cArr = this.f26949V;
                int i = this.f26950W;
                this.f26950W = i + 1;
                c = cArr[i];
                if (c == 10) {
                    this.f26952Y++;
                    this.f26953Z = this.f26950W;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo29653q();
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m37189x() throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f26950W
            int r2 = r1 + r0
            int r3 = r4.f26951X
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f26949V
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo29653q()
        L_0x004b:
            int r1 = r4.f26950W
            int r1 = r1 + r0
            r4.f26950W = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f26950W = r1
            r0 = 1
            boolean r0 = r4.m37177b(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p488a0.C11533a.m37189x():void");
    }

    /* renamed from: a */
    public final void mo29463a(boolean z) {
        this.f26948U = z;
    }

    /* renamed from: b */
    public void mo29464b() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 1) {
            m37179c(3);
            this.f26954a0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(peek());
        sb.append(mo29471h());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo29465c() throws IOException {
        int[] iArr = this.f26959e0;
        int i = this.f26960f0;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int b = m37175b(true);
            if (b != 44) {
                if (b == 59) {
                    mo29653q();
                } else if (b == 93) {
                    this.f26954a0 = 4;
                    return 4;
                } else {
                    m37181f("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f26959e0[this.f26960f0 - 1] = 4;
            if (i2 == 5) {
                int b2 = m37175b(true);
                if (b2 != 44) {
                    if (b2 == 59) {
                        mo29653q();
                    } else if (b2 == 125) {
                        this.f26954a0 = 2;
                        return 2;
                    } else {
                        m37181f("Unterminated object");
                        throw null;
                    }
                }
            }
            int b3 = m37175b(true);
            if (b3 == 34) {
                this.f26954a0 = 13;
                return 13;
            } else if (b3 != 39) {
                String str = "Expected name";
                if (b3 != 125) {
                    mo29653q();
                    this.f26950W--;
                    if (m37174a((char) b3)) {
                        this.f26954a0 = 14;
                        return 14;
                    }
                    m37181f(str);
                    throw null;
                } else if (i2 != 5) {
                    this.f26954a0 = 2;
                    return 2;
                } else {
                    m37181f(str);
                    throw null;
                }
            } else {
                mo29653q();
                this.f26954a0 = 12;
                return 12;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int b4 = m37175b(true);
            if (b4 != 58) {
                if (b4 == 61) {
                    mo29653q();
                    if (this.f26950W < this.f26951X || m37177b(1)) {
                        char[] cArr = this.f26949V;
                        int i3 = this.f26950W;
                        if (cArr[i3] == '>') {
                            this.f26950W = i3 + 1;
                        }
                    }
                } else {
                    m37181f("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            if (this.f26948U) {
                m37183r();
            }
            this.f26959e0[this.f26960f0 - 1] = 7;
        } else if (i2 == 7) {
            if (m37175b(false) == -1) {
                this.f26954a0 = 17;
                return 17;
            }
            mo29653q();
            this.f26950W--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int b5 = m37175b(true);
        if (b5 == 34) {
            this.f26954a0 = 9;
            return 9;
        } else if (b5 != 39) {
            if (!(b5 == 44 || b5 == 59)) {
                if (b5 == 91) {
                    this.f26954a0 = 3;
                    return 3;
                } else if (b5 != 93) {
                    if (b5 != 123) {
                        this.f26950W--;
                        int t = m37185t();
                        if (t != 0) {
                            return t;
                        }
                        int u = m37186u();
                        if (u != 0) {
                            return u;
                        }
                        if (m37174a(this.f26949V[this.f26950W])) {
                            mo29653q();
                            this.f26954a0 = 10;
                            return 10;
                        }
                        m37181f("Expected value");
                        throw null;
                    }
                    this.f26954a0 = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f26954a0 = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                mo29653q();
                this.f26950W--;
                this.f26954a0 = 7;
                return 7;
            }
            m37181f("Unexpected value");
            throw null;
        } else {
            mo29653q();
            this.f26954a0 = 8;
            return 8;
        }
    }

    public void close() throws IOException {
        this.f26954a0 = 0;
        this.f26959e0[0] = 8;
        this.f26960f0 = 1;
        this.f26956c.close();
    }

    /* renamed from: d */
    public void mo29467d() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 4) {
            this.f26960f0--;
            int[] iArr = this.f26962h0;
            int i2 = this.f26960f0 - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f26954a0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(peek());
        sb.append(mo29471h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public void mo29468e() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 2) {
            this.f26960f0--;
            String[] strArr = this.f26961g0;
            int i2 = this.f26960f0;
            strArr[i2] = null;
            int[] iArr = this.f26962h0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f26954a0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(peek());
        sb.append(mo29471h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public boolean mo29469f() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: g */
    public final boolean mo29470g() {
        return this.f26948U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo29471h() {
        int i = this.f26952Y + 1;
        int i2 = (this.f26950W - this.f26953Z) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        sb.append(mo29474j0());
        return sb.toString();
    }

    /* renamed from: i */
    public boolean mo29472i() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 5) {
            this.f26954a0 = 0;
            int[] iArr = this.f26962h0;
            int i2 = this.f26960f0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f26954a0 = 0;
            int[] iArr2 = this.f26962h0;
            int i3 = this.f26960f0 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(peek());
            sb.append(mo29471h());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: j */
    public double mo29473j() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 15) {
            this.f26954a0 = 0;
            int[] iArr = this.f26962h0;
            int i2 = this.f26960f0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f26955b0;
        }
        if (i == 16) {
            this.f26958d0 = new String(this.f26949V, this.f26950W, this.f26957c0);
            this.f26950W += this.f26957c0;
        } else if (i == 8 || i == 9) {
            this.f26958d0 = m37176b(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f26958d0 = m37184s();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a double but was ");
            sb.append(peek());
            sb.append(mo29471h());
            throw new IllegalStateException(sb.toString());
        }
        this.f26954a0 = 11;
        double parseDouble = Double.parseDouble(this.f26958d0);
        if (this.f26948U || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f26958d0 = null;
            this.f26954a0 = 0;
            int[] iArr2 = this.f26962h0;
            int i3 = this.f26960f0 - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(mo29471h());
        throw new C11537d(sb2.toString());
    }

    /* renamed from: j0 */
    public String mo29474j0() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f26960f0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f26959e0[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f26962h0[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f26961g0;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: k */
    public int mo29475k() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        String str = "Expected an int but was ";
        if (i == 15) {
            long j = this.f26955b0;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f26954a0 = 0;
                int[] iArr = this.f26962h0;
                int i3 = this.f26960f0 - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f26955b0);
            sb.append(mo29471h());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f26958d0 = new String(this.f26949V, this.f26950W, this.f26957c0);
            this.f26950W += this.f26957c0;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f26958d0 = m37184s();
            } else {
                this.f26958d0 = m37176b(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f26958d0);
                this.f26954a0 = 0;
                int[] iArr2 = this.f26962h0;
                int i4 = this.f26960f0 - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(peek());
            sb2.append(mo29471h());
            throw new IllegalStateException(sb2.toString());
        }
        this.f26954a0 = 11;
        double parseDouble = Double.parseDouble(this.f26958d0);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f26958d0 = null;
            this.f26954a0 = 0;
            int[] iArr3 = this.f26962h0;
            int i6 = this.f26960f0 - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f26958d0);
        sb3.append(mo29471h());
        throw new NumberFormatException(sb3.toString());
    }

    /* renamed from: l */
    public long mo29476l() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 15) {
            this.f26954a0 = 0;
            int[] iArr = this.f26962h0;
            int i2 = this.f26960f0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f26955b0;
        }
        String str = "Expected a long but was ";
        if (i == 16) {
            this.f26958d0 = new String(this.f26949V, this.f26950W, this.f26957c0);
            this.f26950W += this.f26957c0;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f26958d0 = m37184s();
            } else {
                this.f26958d0 = m37176b(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f26958d0);
                this.f26954a0 = 0;
                int[] iArr2 = this.f26962h0;
                int i3 = this.f26960f0 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(peek());
            sb.append(mo29471h());
            throw new IllegalStateException(sb.toString());
        }
        this.f26954a0 = 11;
        double parseDouble = Double.parseDouble(this.f26958d0);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f26958d0 = null;
            this.f26954a0 = 0;
            int[] iArr3 = this.f26962h0;
            int i4 = this.f26960f0 - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f26958d0);
        sb2.append(mo29471h());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: m */
    public String mo29477m() throws IOException {
        String str;
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 14) {
            str = m37184s();
        } else if (i == 12) {
            str = m37176b('\'');
        } else if (i == 13) {
            str = m37176b('\"');
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a name but was ");
            sb.append(peek());
            sb.append(mo29471h());
            throw new IllegalStateException(sb.toString());
        }
        this.f26954a0 = 0;
        this.f26961g0[this.f26960f0 - 1] = str;
        return str;
    }

    /* renamed from: n */
    public void mo29478n() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 7) {
            this.f26954a0 = 0;
            int[] iArr = this.f26962h0;
            int i2 = this.f26960f0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected null but was ");
        sb.append(peek());
        sb.append(mo29471h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o */
    public String mo29479o() throws IOException {
        String str;
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 10) {
            str = m37184s();
        } else if (i == 8) {
            str = m37176b('\'');
        } else if (i == 9) {
            str = m37176b('\"');
        } else if (i == 11) {
            str = this.f26958d0;
            this.f26958d0 = null;
        } else if (i == 15) {
            str = Long.toString(this.f26955b0);
        } else if (i == 16) {
            str = new String(this.f26949V, this.f26950W, this.f26957c0);
            this.f26950W += this.f26957c0;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a string but was ");
            sb.append(peek());
            sb.append(mo29471h());
            throw new IllegalStateException(sb.toString());
        }
        this.f26954a0 = 0;
        int[] iArr = this.f26962h0;
        int i2 = this.f26960f0 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: p */
    public void mo29480p() throws IOException {
        int i = 0;
        do {
            int i2 = this.f26954a0;
            if (i2 == 0) {
                i2 = mo29465c();
            }
            if (i2 == 3) {
                m37179c(1);
            } else if (i2 == 1) {
                m37179c(3);
            } else {
                if (i2 == 4) {
                    this.f26960f0--;
                } else if (i2 == 2) {
                    this.f26960f0--;
                } else if (i2 == 14 || i2 == 10) {
                    m37189x();
                    this.f26954a0 = 0;
                } else if (i2 == 8 || i2 == 12) {
                    m37178c('\'');
                    this.f26954a0 = 0;
                } else if (i2 == 9 || i2 == 13) {
                    m37178c('\"');
                    this.f26954a0 = 0;
                } else {
                    if (i2 == 16) {
                        this.f26950W += this.f26957c0;
                    }
                    this.f26954a0 = 0;
                }
                i--;
                this.f26954a0 = 0;
            }
            i++;
            this.f26954a0 = 0;
        } while (i != 0);
        int[] iArr = this.f26962h0;
        int i3 = this.f26960f0;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f26961g0[i3 - 1] = "null";
    }

    public C11535b peek() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        switch (i) {
            case 1:
                return C11535b.BEGIN_OBJECT;
            case 2:
                return C11535b.END_OBJECT;
            case 3:
                return C11535b.BEGIN_ARRAY;
            case 4:
                return C11535b.END_ARRAY;
            case 5:
            case 6:
                return C11535b.BOOLEAN;
            case 7:
                return C11535b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C11535b.STRING;
            case 12:
            case 13:
            case 14:
                return C11535b.NAME;
            case 15:
            case 16:
                return C11535b.NUMBER;
            case 17:
                return C11535b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo29471h());
        return sb.toString();
    }

    /* renamed from: a */
    public void mo29462a() throws IOException {
        int i = this.f26954a0;
        if (i == 0) {
            i = mo29465c();
        }
        if (i == 3) {
            m37179c(1);
            this.f26962h0[this.f26960f0 - 1] = 0;
            this.f26954a0 = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(peek());
        sb.append(mo29471h());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    private IOException m37181f(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo29471h());
        throw new C11537d(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r5) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r2.append(r0, r5, r3 - r5);
        r10.f26950W = r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m37176b(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f26949V
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f26950W
            int r4 = r10.f26951X
        L_0x0008:
            r5 = r3
        L_0x0009:
            r6 = 16
            r7 = 1
            if (r3 >= r4) goto L_0x005c
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0028
            r10.f26950W = r8
            int r8 = r8 - r5
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0020
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r5, r8)
            return r11
        L_0x0020:
            r2.append(r0, r5, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0028:
            r9 = 92
            if (r3 != r9) goto L_0x004f
            r10.f26950W = r8
            int r8 = r8 - r5
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0040
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0040:
            r2.append(r0, r5, r8)
            char r3 = r10.m37187v()
            r2.append(r3)
            int r3 = r10.f26950W
            int r4 = r10.f26951X
            goto L_0x0008
        L_0x004f:
            r6 = 10
            if (r3 != r6) goto L_0x005a
            int r3 = r10.f26952Y
            int r3 = r3 + r7
            r10.f26952Y = r3
            r10.f26953Z = r8
        L_0x005a:
            r3 = r8
            goto L_0x0009
        L_0x005c:
            if (r2 != 0) goto L_0x006c
            int r2 = r3 - r5
            int r2 = r2 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r4.<init>(r2)
            r2 = r4
        L_0x006c:
            int r4 = r3 - r5
            r2.append(r0, r5, r4)
            r10.f26950W = r3
            boolean r3 = r10.m37177b(r7)
            if (r3 == 0) goto L_0x007a
            goto L_0x0004
        L_0x007a:
            java.lang.String r11 = "Unterminated string"
            r10.m37181f(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p487c.p488a0.C11533a.m37176b(char):java.lang.String");
    }

    /* renamed from: a */
    private boolean m37174a(char c) throws IOException {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            mo29653q();
        }
        return false;
    }

    /* renamed from: e */
    private boolean m37180e(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f26950W + length > this.f26951X && !m37177b(length)) {
                return false;
            }
            char[] cArr = this.f26949V;
            int i2 = this.f26950W;
            if (cArr[i2] == 10) {
                this.f26952Y++;
                this.f26953Z = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f26949V[this.f26950W + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f26950W++;
        }
    }

    /* renamed from: b */
    private boolean m37177b(int i) throws IOException {
        char[] cArr = this.f26949V;
        int i2 = this.f26953Z;
        int i3 = this.f26950W;
        this.f26953Z = i2 - i3;
        int i4 = this.f26951X;
        if (i4 != i3) {
            this.f26951X = i4 - i3;
            System.arraycopy(cArr, i3, cArr, 0, this.f26951X);
        } else {
            this.f26951X = 0;
        }
        this.f26950W = 0;
        do {
            Reader reader = this.f26956c;
            int i5 = this.f26951X;
            int read = reader.read(cArr, i5, cArr.length - i5);
            if (read == -1) {
                return false;
            }
            this.f26951X += read;
            if (this.f26952Y == 0) {
                int i6 = this.f26953Z;
                if (i6 == 0 && this.f26951X > 0 && cArr[0] == 65279) {
                    this.f26950W++;
                    this.f26953Z = i6 + 1;
                    i++;
                }
            }
        } while (this.f26951X < i);
        return true;
    }

    /* renamed from: b */
    private int m37175b(boolean z) throws IOException {
        char[] cArr = this.f26949V;
        int i = this.f26950W;
        int i2 = this.f26951X;
        while (true) {
            if (i == i2) {
                this.f26950W = i;
                if (m37177b(1)) {
                    i = this.f26950W;
                    i2 = this.f26951X;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("End of input");
                    sb.append(mo29471h());
                    throw new EOFException(sb.toString());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f26952Y++;
                this.f26953Z = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f26950W = i3;
                    if (i3 == i2) {
                        this.f26950W--;
                        boolean b = m37177b(2);
                        this.f26950W++;
                        if (!b) {
                            return c;
                        }
                    }
                    mo29653q();
                    int i4 = this.f26950W;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f26950W = i4 + 1;
                        if (m37180e("*/")) {
                            i = this.f26950W + 2;
                            i2 = this.f26951X;
                        } else {
                            m37181f("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f26950W = i4 + 1;
                        m37188w();
                        i = this.f26950W;
                        i2 = this.f26951X;
                    }
                } else if (c == '#') {
                    this.f26950W = i3;
                    mo29653q();
                    m37188w();
                    i = this.f26950W;
                    i2 = this.f26951X;
                } else {
                    this.f26950W = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: c */
    private void m37178c(char c) throws IOException {
        char[] cArr = this.f26949V;
        do {
            int i = this.f26950W;
            int i2 = this.f26951X;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f26950W = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f26950W = i3;
                    m37187v();
                    i = this.f26950W;
                    i2 = this.f26951X;
                } else {
                    if (c2 == 10) {
                        this.f26952Y++;
                        this.f26953Z = i3;
                    }
                    i = i3;
                }
            }
            this.f26950W = i;
        } while (m37177b(1));
        m37181f("Unterminated string");
        throw null;
    }

    /* renamed from: c */
    private void m37179c(int i) {
        int i2 = this.f26960f0;
        int[] iArr = this.f26959e0;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f26962h0, 0, iArr3, 0, this.f26960f0);
            System.arraycopy(this.f26961g0, 0, strArr, 0, this.f26960f0);
            this.f26959e0 = iArr2;
            this.f26962h0 = iArr3;
            this.f26961g0 = strArr;
        }
        int[] iArr4 = this.f26959e0;
        int i3 = this.f26960f0;
        this.f26960f0 = i3 + 1;
        iArr4[i3] = i;
    }
}
