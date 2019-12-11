package p163g.p441i.p442a.p443a.p446s;

import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import p163g.p441i.p442a.p443a.C10897a;
import p163g.p441i.p442a.p443a.C10902e;
import p163g.p441i.p442a.p443a.C10903f.C10904a;
import p163g.p441i.p442a.p443a.C10909k;
import p163g.p441i.p442a.p443a.C10910l;
import p163g.p441i.p442a.p443a.C10911m;
import p163g.p441i.p442a.p443a.C10912n;
import p163g.p441i.p442a.p443a.p445r.C10916a;
import p163g.p441i.p442a.p443a.p445r.C10917b;
import p163g.p441i.p442a.p443a.p445r.C10918c;
import p163g.p441i.p442a.p443a.p445r.C10920e;

/* renamed from: g.i.a.a.s.e */
/* compiled from: WriterBasedJsonGenerator */
public class C10928e extends C10925b {

    /* renamed from: o0 */
    protected static final char[] f25962o0 = C10916a.m34447b();

    /* renamed from: f0 */
    protected final Writer f25963f0;

    /* renamed from: g0 */
    protected char f25964g0 = '\"';

    /* renamed from: h0 */
    protected char[] f25965h0;

    /* renamed from: i0 */
    protected int f25966i0;

    /* renamed from: j0 */
    protected int f25967j0;

    /* renamed from: k0 */
    protected int f25968k0;

    /* renamed from: l0 */
    protected char[] f25969l0;

    /* renamed from: m0 */
    protected C10912n f25970m0;

    /* renamed from: n0 */
    protected char[] f25971n0;

    public C10928e(C10918c cVar, int i, C10910l lVar, Writer writer) {
        super(cVar, i, lVar);
        this.f25963f0 = writer;
        this.f25965h0 = cVar.mo28113a();
        this.f25968k0 = this.f25965h0.length;
    }

    /* renamed from: d */
    private void m34563d(int i) throws IOException {
        if (this.f25967j0 + 13 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i2 = this.f25967j0;
        this.f25967j0 = i2 + 1;
        cArr[i2] = this.f25964g0;
        this.f25967j0 = C10920e.m34482e(i, cArr, this.f25967j0);
        char[] cArr2 = this.f25965h0;
        int i3 = this.f25967j0;
        this.f25967j0 = i3 + 1;
        cArr2[i3] = this.f25964g0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34567h(int r12) throws java.io.IOException, p163g.p441i.p442a.p443a.C10902e {
        /*
            r11 = this;
            int r0 = r11.f25967j0
            int r0 = r0 + r12
            int[] r12 = r11.f25939Z
            int r1 = r11.f25940a0
            r2 = 1
            if (r1 >= r2) goto L_0x000d
            r1 = 65535(0xffff, float:9.1834E-41)
        L_0x000d:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            g.i.a.a.r.b r4 = r11.f25941b0
        L_0x0016:
            int r5 = r11.f25967j0
            if (r5 >= r0) goto L_0x0052
        L_0x001a:
            char[] r5 = r11.f25965h0
            int r6 = r11.f25967j0
            char r5 = r5[r6]
            if (r5 >= r3) goto L_0x0027
            r6 = r12[r5]
            if (r6 == 0) goto L_0x004b
            goto L_0x0034
        L_0x0027:
            if (r5 <= r1) goto L_0x002b
            r6 = -1
            goto L_0x0034
        L_0x002b:
            g.i.a.a.n r6 = r4.mo28105a(r5)
            r11.f25970m0 = r6
            if (r6 == 0) goto L_0x004b
            r6 = -2
        L_0x0034:
            int r7 = r11.f25967j0
            int r8 = r11.f25966i0
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x0042
            java.io.Writer r9 = r11.f25963f0
            char[] r10 = r11.f25965h0
            r9.write(r10, r8, r7)
        L_0x0042:
            int r7 = r11.f25967j0
            int r7 = r7 + r2
            r11.f25967j0 = r7
            r11.m34559a(r5, r6)
            goto L_0x0016
        L_0x004b:
            int r5 = r11.f25967j0
            int r5 = r5 + r2
            r11.f25967j0 = r5
            if (r5 < r0) goto L_0x001a
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p441i.p442a.p443a.p446s.C10928e.m34567h(int):void");
    }

    /* renamed from: i */
    private void m34568i(long j) throws IOException {
        if (this.f25967j0 + 23 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = this.f25964g0;
        this.f25967j0 = C10920e.m34468a(j, cArr, this.f25967j0);
        char[] cArr2 = this.f25965h0;
        int i2 = this.f25967j0;
        this.f25967j0 = i2 + 1;
        cArr2[i2] = this.f25964g0;
    }

    /* renamed from: k */
    private final void m34570k() throws IOException {
        if (this.f25967j0 + 4 >= this.f25968k0) {
            mo28159h();
        }
        int i = this.f25967j0;
        char[] cArr = this.f25965h0;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.f25967j0 = i4 + 1;
    }

    /* renamed from: n */
    private void m34571n(String str) throws IOException {
        mo28159h();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.f25968k0;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.f25965h0, 0);
            if (this.f25941b0 != null) {
                m34565f(i2);
            } else {
                int i4 = this.f25940a0;
                if (i4 != 0) {
                    m34560b(i2, i4);
                } else {
                    m34564e(i2);
                }
            }
            if (i3 < length) {
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: o */
    private void m34572o(String str) throws IOException {
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = this.f25964g0;
        mo28162m(str);
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr2 = this.f25965h0;
        int i2 = this.f25967j0;
        this.f25967j0 = i2 + 1;
        cArr2[i2] = this.f25964g0;
    }

    /* renamed from: p */
    private void m34573p(String str) throws IOException {
        int length = str.length();
        int i = this.f25968k0;
        if (length > i) {
            m34571n(str);
            return;
        }
        if (this.f25967j0 + length > i) {
            mo28159h();
        }
        str.getChars(0, length, this.f25965h0, this.f25967j0);
        if (this.f25941b0 != null) {
            m34567h(length);
        } else {
            int i2 = this.f25940a0;
            if (i2 != 0) {
                m34562c(length, i2);
            } else {
                m34566g(length);
            }
        }
    }

    /* renamed from: q */
    private void m34574q(String str) throws IOException {
        int i = this.f25968k0;
        int i2 = this.f25967j0;
        int i3 = i - i2;
        str.getChars(0, i3, this.f25965h0, i2);
        this.f25967j0 += i3;
        mo28159h();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.f25968k0;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.f25965h0, 0);
                this.f25966i0 = 0;
                this.f25967j0 = i4;
                mo28159h();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.f25965h0, 0);
                this.f25966i0 = 0;
                this.f25967j0 = length;
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo28040a(C10897a aVar, byte[] bArr, int i, int i2) throws IOException, C10902e {
        mo28161l("write a binary value");
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i3 = this.f25967j0;
        this.f25967j0 = i3 + 1;
        cArr[i3] = this.f25964g0;
        mo28156b(aVar, bArr, i, i2 + i);
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr2 = this.f25965h0;
        int i4 = this.f25967j0;
        this.f25967j0 = i4 + 1;
        cArr2[i4] = this.f25964g0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28157b(String str, boolean z) throws IOException {
        if (this.f25860c != null) {
            mo28158c(str, z);
            return;
        }
        if (this.f25967j0 + 1 >= this.f25968k0) {
            mo28159h();
        }
        if (z) {
            char[] cArr = this.f25965h0;
            int i = this.f25967j0;
            this.f25967j0 = i + 1;
            cArr[i] = ',';
        }
        if (this.f25943d0) {
            m34573p(str);
            return;
        }
        char[] cArr2 = this.f25965h0;
        int i2 = this.f25967j0;
        this.f25967j0 = i2 + 1;
        cArr2[i2] = this.f25964g0;
        m34573p(str);
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr3 = this.f25965h0;
        int i3 = this.f25967j0;
        this.f25967j0 = i3 + 1;
        cArr3[i3] = this.f25964g0;
    }

    /* renamed from: c */
    public void mo28055c() throws IOException {
        if (this.f25902X.mo28085e()) {
            C10911m mVar = this.f25860c;
            if (mVar != null) {
                mVar.mo28090a(this, this.f25902X.mo28083c());
            } else {
                if (this.f25967j0 >= this.f25968k0) {
                    mo28159h();
                }
                char[] cArr = this.f25965h0;
                int i = this.f25967j0;
                this.f25967j0 = i + 1;
                cArr[i] = '}';
            }
            this.f25902X = this.f25902X.mo28143g();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current context not Object but ");
        sb.append(this.f25902X.mo28086f());
        mo28059e(sb.toString());
        throw null;
    }

    public void close() throws IOException {
        super.close();
        if (this.f25965h0 != null && mo28102a(C10904a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C10909k g = mo28104g();
                if (!g.mo28084d()) {
                    if (!g.mo28085e()) {
                        break;
                    }
                    mo28055c();
                } else {
                    mo28052b();
                }
            }
        }
        mo28159h();
        this.f25966i0 = 0;
        this.f25967j0 = 0;
        if (this.f25963f0 != null) {
            if (this.f25938Y.mo28116c() || mo28102a(C10904a.AUTO_CLOSE_TARGET)) {
                this.f25963f0.close();
            } else if (mo28102a(C10904a.FLUSH_PASSED_TO_STREAM)) {
                this.f25963f0.flush();
            }
        }
        mo28160i();
    }

    /* renamed from: e */
    public void mo28058e() throws IOException {
        mo28161l("start an array");
        this.f25902X = this.f25902X.mo28144h();
        C10911m mVar = this.f25860c;
        if (mVar != null) {
            mVar.mo28095e(this);
            return;
        }
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = '[';
    }

    /* renamed from: f */
    public void mo28060f() throws IOException {
        mo28161l("start an object");
        this.f25902X = this.f25902X.mo28145i();
        C10911m mVar = this.f25860c;
        if (mVar != null) {
            mVar.mo28089a(this);
            return;
        }
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = '{';
    }

    public void flush() throws IOException {
        mo28159h();
        if (this.f25963f0 != null && mo28102a(C10904a.FLUSH_PASSED_TO_STREAM)) {
            this.f25963f0.flush();
        }
    }

    /* renamed from: g */
    public void mo28063g(String str) throws IOException {
        int a = this.f25902X.mo28141a(str);
        if (a != 4) {
            boolean z = true;
            if (a != 1) {
                z = false;
            }
            mo28157b(str, z);
            return;
        }
        mo28059e("Can not write a field name, expecting a value");
        throw null;
    }

    /* renamed from: j */
    public void mo28066j(String str) throws IOException {
        mo28161l("write a string");
        if (str == null) {
            m34570k();
            return;
        }
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = this.f25964g0;
        m34573p(str);
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr2 = this.f25965h0;
        int i2 = this.f25967j0;
        this.f25967j0 = i2 + 1;
        cArr2[i2] = this.f25964g0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo28161l(String str) throws IOException {
        char c;
        int j = this.f25902X.mo28146j();
        if (this.f25860c != null) {
            mo28138b(str, j);
            return;
        }
        if (j == 1) {
            c = ',';
        } else if (j == 2) {
            c = ':';
        } else if (j == 3) {
            C10912n nVar = this.f25942c0;
            if (nVar != null) {
                mo28162m(nVar.getValue());
            }
            return;
        } else if (j == 5) {
            mo28140k(str);
            throw null;
        } else {
            return;
        }
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = c;
    }

    /* renamed from: m */
    public void mo28162m(String str) throws IOException {
        int length = str.length();
        int i = this.f25968k0 - this.f25967j0;
        if (i == 0) {
            mo28159h();
            i = this.f25968k0 - this.f25967j0;
        }
        if (i >= length) {
            str.getChars(0, length, this.f25965h0, this.f25967j0);
            this.f25967j0 += length;
            return;
        }
        m34574q(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r6.f25965h0;
        r3 = r6.f25967j0;
        r6.f25967j0 = r3 + 1;
        r2 = r2[r3];
        m34559a(r2, r7[r2]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r4 = r6.f25966i0;
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r3 <= 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r6.f25963f0.write(r2, r4, r3);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34566g(int r7) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.f25967j0
            int r0 = r0 + r7
            int[] r7 = r6.f25939Z
            int r1 = r7.length
        L_0x0006:
            int r2 = r6.f25967j0
            if (r2 >= r0) goto L_0x0038
        L_0x000a:
            char[] r2 = r6.f25965h0
            int r3 = r6.f25967j0
            char r4 = r2[r3]
            if (r4 >= r1) goto L_0x0030
            r4 = r7[r4]
            if (r4 == 0) goto L_0x0030
            int r4 = r6.f25966i0
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x0020
            java.io.Writer r5 = r6.f25963f0
            r5.write(r2, r4, r3)
        L_0x0020:
            char[] r2 = r6.f25965h0
            int r3 = r6.f25967j0
            int r4 = r3 + 1
            r6.f25967j0 = r4
            char r2 = r2[r3]
            r3 = r7[r2]
            r6.m34559a(r2, r3)
            goto L_0x0006
        L_0x0030:
            int r2 = r6.f25967j0
            int r2 = r2 + 1
            r6.f25967j0 = r2
            if (r2 < r0) goto L_0x000a
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p441i.p442a.p443a.p446s.C10928e.m34566g(int):void");
    }

    /* renamed from: d */
    public void mo28057d() throws IOException {
        mo28161l("write a null");
        m34570k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo28160i() {
        char[] cArr = this.f25965h0;
        if (cArr != null) {
            this.f25965h0 = null;
            this.f25938Y.mo28111a(cArr);
        }
        char[] cArr2 = this.f25971n0;
        if (cArr2 != null) {
            this.f25971n0 = null;
            this.f25938Y.mo28114b(cArr2);
        }
    }

    /* renamed from: e */
    private void m34564e(int i) throws IOException {
        char c;
        int[] iArr = this.f25939Z;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            do {
                c = this.f25965h0[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i2++;
            } while (i2 < i);
            int i4 = i2 - i3;
            if (i4 > 0) {
                this.f25963f0.write(this.f25965h0, i3, i4);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            i3 = m34558a(this.f25965h0, i2, i, c, iArr[c]);
        }
    }

    /* renamed from: f */
    private void m34565f(int i) throws IOException, C10902e {
        char c;
        int[] iArr = this.f25939Z;
        int i2 = this.f25940a0;
        if (i2 < 1) {
            i2 = 65535;
        }
        int min = Math.min(iArr.length, i2 + 1);
        C10917b bVar = this.f25941b0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                c = this.f25965h0[i3];
                if (c >= min) {
                    if (c <= i2) {
                        C10912n a = bVar.mo28105a(c);
                        this.f25970m0 = a;
                        if (a != null) {
                            i5 = -2;
                            break;
                        }
                    } else {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this.f25963f0.write(this.f25965h0, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = m34558a(this.f25965h0, i3, i, c, i5);
        }
    }

    /* renamed from: a */
    public void mo28049a(short s) throws IOException {
        mo28161l("write a number");
        if (this.f25901W) {
            m34561b(s);
            return;
        }
        if (this.f25967j0 + 6 >= this.f25968k0) {
            mo28159h();
        }
        this.f25967j0 = C10920e.m34482e((int) s, this.f25965h0, this.f25967j0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo28158c(String str, boolean z) throws IOException {
        if (z) {
            this.f25860c.mo28097g(this);
        } else {
            this.f25860c.mo28094d(this);
        }
        if (this.f25943d0) {
            m34573p(str);
            return;
        }
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = this.f25964g0;
        m34573p(str);
        if (this.f25967j0 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr2 = this.f25965h0;
        int i2 = this.f25967j0;
        this.f25967j0 = i2 + 1;
        cArr2[i2] = this.f25964g0;
    }

    /* renamed from: j */
    private char[] m34569j() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.f25969l0 = cArr;
        return cArr;
    }

    /* renamed from: b */
    public void mo28052b() throws IOException {
        if (this.f25902X.mo28084d()) {
            C10911m mVar = this.f25860c;
            if (mVar != null) {
                mVar.mo28092b(this, this.f25902X.mo28083c());
            } else {
                if (this.f25967j0 >= this.f25968k0) {
                    mo28159h();
                }
                char[] cArr = this.f25965h0;
                int i = this.f25967j0;
                this.f25967j0 = i + 1;
                cArr[i] = ']';
            }
            this.f25902X = this.f25902X.mo28143g();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Current context not Array but ");
        sb.append(this.f25902X.mo28086f());
        mo28059e(sb.toString());
        throw null;
    }

    /* renamed from: a */
    public void mo28039a(long j) throws IOException {
        mo28161l("write a number");
        if (this.f25901W) {
            m34568i(j);
            return;
        }
        if (this.f25967j0 + 21 >= this.f25968k0) {
            mo28159h();
        }
        this.f25967j0 = C10920e.m34468a(j, this.f25965h0, this.f25967j0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo28159h() throws IOException {
        int i = this.f25967j0;
        int i2 = this.f25966i0;
        int i3 = i - i2;
        if (i3 > 0) {
            this.f25966i0 = 0;
            this.f25967j0 = 0;
            this.f25963f0.write(this.f25965h0, i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34562c(int r9, int r10) throws java.io.IOException, p163g.p441i.p442a.p443a.C10902e {
        /*
            r8 = this;
            int r0 = r8.f25967j0
            int r0 = r0 + r9
            int[] r9 = r8.f25939Z
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        L_0x000c:
            int r2 = r8.f25967j0
            if (r2 >= r0) goto L_0x0040
        L_0x0010:
            char[] r2 = r8.f25965h0
            int r3 = r8.f25967j0
            char r2 = r2[r3]
            if (r2 >= r1) goto L_0x001d
            r3 = r9[r2]
            if (r3 == 0) goto L_0x0038
            goto L_0x0020
        L_0x001d:
            if (r2 <= r10) goto L_0x0038
            r3 = -1
        L_0x0020:
            int r4 = r8.f25967j0
            int r5 = r8.f25966i0
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x002e
            java.io.Writer r6 = r8.f25963f0
            char[] r7 = r8.f25965h0
            r6.write(r7, r5, r4)
        L_0x002e:
            int r4 = r8.f25967j0
            int r4 = r4 + 1
            r8.f25967j0 = r4
            r8.m34559a(r2, r3)
            goto L_0x000c
        L_0x0038:
            int r2 = r8.f25967j0
            int r2 = r2 + 1
            r8.f25967j0 = r2
            if (r2 < r0) goto L_0x0010
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p441i.p442a.p443a.p446s.C10928e.m34562c(int, int):void");
    }

    /* renamed from: b */
    private void m34561b(short s) throws IOException {
        if (this.f25967j0 + 8 >= this.f25968k0) {
            mo28159h();
        }
        char[] cArr = this.f25965h0;
        int i = this.f25967j0;
        this.f25967j0 = i + 1;
        cArr[i] = this.f25964g0;
        this.f25967j0 = C10920e.m34482e((int) s, cArr, this.f25967j0);
        char[] cArr2 = this.f25965h0;
        int i2 = this.f25967j0;
        this.f25967j0 = i2 + 1;
        cArr2[i2] = this.f25964g0;
    }

    /* renamed from: a */
    public void mo28048a(BigInteger bigInteger) throws IOException {
        mo28161l("write a number");
        if (bigInteger == null) {
            m34570k();
        } else if (this.f25901W) {
            m34572o(bigInteger.toString());
        } else {
            mo28162m(bigInteger.toString());
        }
    }

    /* renamed from: a */
    public void mo28037a(double d) throws IOException {
        if (this.f25901W || (mo28102a(C10904a.QUOTE_NON_NUMERIC_NUMBERS) && (Double.isNaN(d) || Double.isInfinite(d)))) {
            mo28066j(String.valueOf(d));
            return;
        }
        mo28161l("write a number");
        mo28162m(String.valueOf(d));
    }

    /* renamed from: b */
    public void mo28053b(int i) throws IOException {
        mo28161l("write a number");
        if (this.f25901W) {
            m34563d(i);
            return;
        }
        if (this.f25967j0 + 11 >= this.f25968k0) {
            mo28159h();
        }
        this.f25967j0 = C10920e.m34482e(i, this.f25965h0, this.f25967j0);
    }

    /* renamed from: a */
    public void mo28038a(float f) throws IOException {
        if (this.f25901W || (mo28102a(C10904a.QUOTE_NON_NUMERIC_NUMBERS) && (Float.isNaN(f) || Float.isInfinite(f)))) {
            mo28066j(String.valueOf(f));
            return;
        }
        mo28161l("write a number");
        mo28162m(String.valueOf(f));
    }

    /* renamed from: b */
    private void m34560b(int i, int i2) throws IOException, C10902e {
        char c;
        int[] iArr = this.f25939Z;
        int min = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i) {
            while (true) {
                c = this.f25965h0[i3];
                if (c >= min) {
                    if (c > i2) {
                        i5 = -1;
                        break;
                    }
                } else {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                }
                i3++;
                if (i3 >= i) {
                    break;
                }
            }
            int i6 = i3 - i4;
            if (i6 > 0) {
                this.f25963f0.write(this.f25965h0, i4, i6);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            i4 = m34558a(this.f25965h0, i3, i, c, i5);
        }
    }

    /* renamed from: a */
    public void mo28047a(BigDecimal bigDecimal) throws IOException {
        mo28161l("write a number");
        if (bigDecimal == null) {
            m34570k();
        } else if (this.f25901W) {
            m34572o(mo28103b(bigDecimal));
        } else {
            mo28162m(mo28103b(bigDecimal));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28156b(C10897a aVar, byte[] bArr, int i, int i2) throws IOException, C10902e {
        int i3 = i2 - 3;
        int i4 = this.f25968k0 - 6;
        int a = aVar.mo28015a() >> 2;
        while (i <= i3) {
            if (this.f25967j0 > i4) {
                mo28159h();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            this.f25967j0 = aVar.mo28019a((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f25965h0, this.f25967j0);
            a--;
            if (a <= 0) {
                char[] cArr = this.f25965h0;
                int i8 = this.f25967j0;
                this.f25967j0 = i8 + 1;
                cArr[i8] = '\\';
                int i9 = this.f25967j0;
                this.f25967j0 = i9 + 1;
                cArr[i9] = 'n';
                a = aVar.mo28015a() >> 2;
            }
            i = i7;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this.f25967j0 > i4) {
                mo28159h();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this.f25967j0 = aVar.mo28017a(i12, i10, this.f25965h0, this.f25967j0);
        }
    }

    /* renamed from: a */
    public void mo28050a(boolean z) throws IOException {
        int i;
        mo28161l("write a boolean value");
        if (this.f25967j0 + 5 >= this.f25968k0) {
            mo28159h();
        }
        int i2 = this.f25967j0;
        char[] cArr = this.f25965h0;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.f25967j0 = i + 1;
    }

    /* renamed from: a */
    private void m34559a(char c, int i) throws IOException, C10902e {
        String str;
        int i2;
        if (i >= 0) {
            int i3 = this.f25967j0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.f25966i0 = i4;
                char[] cArr = this.f25965h0;
                int i5 = i4 + 1;
                cArr[i4] = '\\';
                cArr[i5] = (char) i;
                return;
            }
            char[] cArr2 = this.f25969l0;
            if (cArr2 == null) {
                cArr2 = m34569j();
            }
            this.f25966i0 = this.f25967j0;
            cArr2[1] = (char) i;
            this.f25963f0.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i6 = this.f25967j0;
            if (i6 >= 6) {
                char[] cArr3 = this.f25965h0;
                int i7 = i6 - 6;
                this.f25966i0 = i7;
                cArr3[i7] = '\\';
                int i8 = i7 + 1;
                cArr3[i8] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr4 = f25962o0;
                    cArr3[i10] = cArr4[i9 >> 4];
                    i2 = i10 + 1;
                    cArr3[i2] = cArr4[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr3[i11] = '0';
                    i2 = i11 + 1;
                    cArr3[i2] = '0';
                }
                int i12 = i2 + 1;
                char[] cArr5 = f25962o0;
                cArr3[i12] = cArr5[c >> 4];
                cArr3[i12 + 1] = cArr5[c & 15];
                return;
            }
            char[] cArr6 = this.f25969l0;
            if (cArr6 == null) {
                cArr6 = m34569j();
            }
            this.f25966i0 = this.f25967j0;
            if (c > 255) {
                int i13 = (c >> 8) & 255;
                char c2 = c & 255;
                char[] cArr7 = f25962o0;
                cArr6[10] = cArr7[i13 >> 4];
                cArr6[11] = cArr7[i13 & 15];
                cArr6[12] = cArr7[c2 >> 4];
                cArr6[13] = cArr7[c2 & 15];
                this.f25963f0.write(cArr6, 8, 6);
            } else {
                char[] cArr8 = f25962o0;
                cArr6[6] = cArr8[c >> 4];
                cArr6[7] = cArr8[c & 15];
                this.f25963f0.write(cArr6, 2, 6);
            }
        } else {
            C10912n nVar = this.f25970m0;
            if (nVar == null) {
                str = this.f25941b0.mo28105a(c).getValue();
            } else {
                str = nVar.getValue();
                this.f25970m0 = null;
            }
            int length = str.length();
            int i14 = this.f25967j0;
            if (i14 >= length) {
                int i15 = i14 - length;
                this.f25966i0 = i15;
                str.getChars(0, length, this.f25965h0, i15);
                return;
            }
            this.f25966i0 = i14;
            this.f25963f0.write(str);
        }
    }

    /* renamed from: a */
    private int m34558a(char[] cArr, int i, int i2, char c, int i3) throws IOException, C10902e {
        String str;
        int i4;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.f25969l0;
                if (cArr2 == null) {
                    cArr2 = m34569j();
                }
                cArr2[1] = (char) i3;
                this.f25963f0.write(cArr2, 0, 2);
            } else {
                i -= 2;
                cArr[i] = '\\';
                cArr[i + 1] = (char) i3;
            }
            return i;
        } else if (i3 != -2) {
            if (i <= 5 || i >= i2) {
                char[] cArr3 = this.f25969l0;
                if (cArr3 == null) {
                    cArr3 = m34569j();
                }
                this.f25966i0 = this.f25967j0;
                if (c > 255) {
                    int i5 = (c >> 8) & 255;
                    char c2 = c & 255;
                    char[] cArr4 = f25962o0;
                    cArr3[10] = cArr4[i5 >> 4];
                    cArr3[11] = cArr4[i5 & 15];
                    cArr3[12] = cArr4[c2 >> 4];
                    cArr3[13] = cArr4[c2 & 15];
                    this.f25963f0.write(cArr3, 8, 6);
                } else {
                    char[] cArr5 = f25962o0;
                    cArr3[6] = cArr5[c >> 4];
                    cArr3[7] = cArr5[c & 15];
                    this.f25963f0.write(cArr3, 2, 6);
                }
            } else {
                int i6 = i - 6;
                int i7 = i6 + 1;
                cArr[i6] = '\\';
                int i8 = i7 + 1;
                cArr[i7] = 'u';
                if (c > 255) {
                    int i9 = (c >> 8) & 255;
                    int i10 = i8 + 1;
                    char[] cArr6 = f25962o0;
                    cArr[i8] = cArr6[i9 >> 4];
                    i4 = i10 + 1;
                    cArr[i10] = cArr6[i9 & 15];
                    c = (char) (c & 255);
                } else {
                    int i11 = i8 + 1;
                    cArr[i8] = '0';
                    i4 = i11 + 1;
                    cArr[i11] = '0';
                }
                int i12 = i4 + 1;
                char[] cArr7 = f25962o0;
                cArr[i4] = cArr7[c >> 4];
                cArr[i12] = cArr7[c & 15];
                i = i12 - 5;
            }
            return i;
        } else {
            C10912n nVar = this.f25970m0;
            if (nVar == null) {
                str = this.f25941b0.mo28105a(c).getValue();
            } else {
                str = nVar.getValue();
                this.f25970m0 = null;
            }
            int length = str.length();
            if (i < length || i >= i2) {
                this.f25963f0.write(str);
            } else {
                i -= length;
                str.getChars(0, length, cArr, i);
            }
            return i;
        }
    }
}
