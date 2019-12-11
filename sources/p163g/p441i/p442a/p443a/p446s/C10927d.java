package p163g.p441i.p442a.p443a.p446s;

import java.io.IOException;
import java.io.OutputStream;
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

/* renamed from: g.i.a.a.s.d */
/* compiled from: UTF8JsonGenerator */
public class C10927d extends C10925b {

    /* renamed from: o0 */
    private static final byte[] f25949o0 = C10916a.m34446a();

    /* renamed from: p0 */
    private static final byte[] f25950p0 = {110, 117, 108, 108};

    /* renamed from: q0 */
    private static final byte[] f25951q0 = {116, 114, 117, 101};

    /* renamed from: r0 */
    private static final byte[] f25952r0 = {102, 97, 108, 115, 101};

    /* renamed from: f0 */
    protected final OutputStream f25953f0;

    /* renamed from: g0 */
    protected byte f25954g0 = 34;

    /* renamed from: h0 */
    protected byte[] f25955h0;

    /* renamed from: i0 */
    protected int f25956i0;

    /* renamed from: j0 */
    protected final int f25957j0;

    /* renamed from: k0 */
    protected final int f25958k0;

    /* renamed from: l0 */
    protected char[] f25959l0;

    /* renamed from: m0 */
    protected final int f25960m0;

    /* renamed from: n0 */
    protected boolean f25961n0;

    public C10927d(C10918c cVar, int i, C10910l lVar, OutputStream outputStream) {
        super(cVar, i, lVar);
        this.f25953f0 = outputStream;
        this.f25961n0 = true;
        this.f25955h0 = cVar.mo28115b();
        this.f25957j0 = this.f25955h0.length;
        this.f25958k0 = this.f25957j0 >> 3;
        this.f25959l0 = cVar.mo28113a();
        this.f25960m0 = this.f25959l0.length;
        if (mo28102a(C10904a.ESCAPE_NON_ASCII)) {
            mo28139c(127);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        r8 = m34509a((int) r8, r7, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if ((r6.f25956i0 + 3) < r6.f25957j0) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        mo28151h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r2 = r8 + 1;
        r8 = r7[r8];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r8 >= 2048) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r6.f25956i0;
        r6.f25956i0 = r4 + 1;
        r1[r4] = (byte) ((r8 >> 6) | 192);
        r4 = r6.f25956i0;
        r6.f25956i0 = r4 + 1;
        r1[r4] = (byte) ((r8 & '?') | 128);
        r8 = r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34522d(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r6.f25957j0
            byte[] r1 = r6.f25955h0
            int r9 = r9 + r8
        L_0x0005:
            if (r8 >= r9) goto L_0x0054
        L_0x0007:
            char r2 = r7[r8]
            r3 = 128(0x80, float:1.794E-43)
            if (r2 < r3) goto L_0x0040
            int r2 = r6.f25956i0
            int r2 = r2 + 3
            int r4 = r6.f25957j0
            if (r2 < r4) goto L_0x0018
            r6.mo28151h()
        L_0x0018:
            int r2 = r8 + 1
            char r8 = r7[r8]
            r4 = 2048(0x800, float:2.87E-42)
            if (r8 >= r4) goto L_0x003b
            int r4 = r6.f25956i0
            int r5 = r4 + 1
            r6.f25956i0 = r5
            int r5 = r8 >> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r1[r4] = r5
            int r4 = r6.f25956i0
            int r5 = r4 + 1
            r6.f25956i0 = r5
            r8 = r8 & 63
            r8 = r8 | r3
            byte r8 = (byte) r8
            r1[r4] = r8
            r8 = r2
            goto L_0x0005
        L_0x003b:
            int r8 = r6.m34509a(r8, r7, r2, r9)
            goto L_0x0005
        L_0x0040:
            int r3 = r6.f25956i0
            if (r3 < r0) goto L_0x0047
            r6.mo28151h()
        L_0x0047:
            int r3 = r6.f25956i0
            int r4 = r3 + 1
            r6.f25956i0 = r4
            byte r2 = (byte) r2
            r1[r3] = r2
            int r8 = r8 + 1
            if (r8 < r9) goto L_0x0007
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p441i.p442a.p443a.p446s.C10927d.m34522d(char[], int, int):void");
    }

    /* renamed from: h */
    private final void m34529h(char[] cArr, int i, int i2) throws IOException {
        do {
            int min = Math.min(this.f25958k0, i2);
            if (this.f25956i0 + min > this.f25957j0) {
                mo28151h();
            }
            m34524e(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: i */
    private final void m34530i(long j) throws IOException {
        if (this.f25956i0 + 23 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i = this.f25956i0;
        this.f25956i0 = i + 1;
        bArr[i] = this.f25954g0;
        this.f25956i0 = C10920e.m34467a(j, bArr, this.f25956i0);
        byte[] bArr2 = this.f25955h0;
        int i2 = this.f25956i0;
        this.f25956i0 = i2 + 1;
        bArr2[i2] = this.f25954g0;
    }

    /* renamed from: o */
    private final void m34532o(String str) throws IOException {
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i = this.f25956i0;
        this.f25956i0 = i + 1;
        bArr[i] = this.f25954g0;
        mo28155n(str);
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr2 = this.f25955h0;
        int i2 = this.f25956i0;
        this.f25956i0 = i2 + 1;
        bArr2[i2] = this.f25954g0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r6 + 1;
        r6 = r5[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r6 >= 2048) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r1 = r4.f25955h0;
        r2 = r4.f25956i0;
        r4.f25956i0 = r2 + 1;
        r1[r2] = (byte) ((r6 >> 6) | 192);
        r2 = r4.f25956i0;
        r4.f25956i0 = r2 + 1;
        r1[r2] = (byte) ((r6 & '?') | 128);
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r6 = m34509a((int) r6, r5, r0, r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28147a(char[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r7 + r7
            int r0 = r0 + r7
            int r1 = r4.f25956i0
            int r1 = r1 + r0
            int r2 = r4.f25957j0
            if (r1 <= r2) goto L_0x0013
            if (r2 >= r0) goto L_0x0010
            r4.m34522d(r5, r6, r7)
            return
        L_0x0010:
            r4.mo28151h()
        L_0x0013:
            int r7 = r7 + r6
        L_0x0014:
            if (r6 >= r7) goto L_0x0056
        L_0x0016:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0047
            int r0 = r6 + 1
            char r6 = r5[r6]
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 >= r1) goto L_0x0042
            byte[] r1 = r4.f25955h0
            int r2 = r4.f25956i0
            int r3 = r2 + 1
            r4.f25956i0 = r3
            int r3 = r6 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r4.f25956i0
            int r3 = r2 + 1
            r4.f25956i0 = r3
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            r6 = r0
            goto L_0x0014
        L_0x0042:
            int r6 = r4.m34509a(r6, r5, r0, r7)
            goto L_0x0014
        L_0x0047:
            byte[] r1 = r4.f25955h0
            int r2 = r4.f25956i0
            int r3 = r2 + 1
            r4.f25956i0 = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 < r7) goto L_0x0016
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p441i.p442a.p443a.p446s.C10927d.mo28147a(char[], int, int):void");
    }

    /* renamed from: b */
    public final void mo28052b() throws IOException {
        if (this.f25902X.mo28084d()) {
            C10911m mVar = this.f25860c;
            if (mVar != null) {
                mVar.mo28092b(this, this.f25902X.mo28083c());
            } else {
                if (this.f25956i0 >= this.f25957j0) {
                    mo28151h();
                }
                byte[] bArr = this.f25955h0;
                int i = this.f25956i0;
                this.f25956i0 = i + 1;
                bArr[i] = 93;
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

    /* renamed from: c */
    public final void mo28055c() throws IOException {
        if (this.f25902X.mo28085e()) {
            C10911m mVar = this.f25860c;
            if (mVar != null) {
                mVar.mo28090a(this, this.f25902X.mo28083c());
            } else {
                if (this.f25956i0 >= this.f25957j0) {
                    mo28151h();
                }
                byte[] bArr = this.f25955h0;
                int i = this.f25956i0;
                this.f25956i0 = i + 1;
                bArr[i] = 125;
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
        if (this.f25955h0 != null && mo28102a(C10904a.AUTO_CLOSE_JSON_CONTENT)) {
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
        mo28151h();
        this.f25956i0 = 0;
        if (this.f25953f0 != null) {
            if (this.f25938Y.mo28116c() || mo28102a(C10904a.AUTO_CLOSE_TARGET)) {
                this.f25953f0.close();
            } else if (mo28102a(C10904a.FLUSH_PASSED_TO_STREAM)) {
                this.f25953f0.flush();
            }
        }
        mo28152i();
    }

    /* renamed from: e */
    public final void mo28058e() throws IOException {
        mo28153l("start an array");
        this.f25902X = this.f25902X.mo28144h();
        C10911m mVar = this.f25860c;
        if (mVar != null) {
            mVar.mo28095e(this);
            return;
        }
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i = this.f25956i0;
        this.f25956i0 = i + 1;
        bArr[i] = 91;
    }

    /* renamed from: f */
    public final void mo28060f() throws IOException {
        mo28153l("start an object");
        this.f25902X = this.f25902X.mo28145i();
        C10911m mVar = this.f25860c;
        if (mVar != null) {
            mVar.mo28089a(this);
            return;
        }
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i = this.f25956i0;
        this.f25956i0 = i + 1;
        bArr[i] = 123;
    }

    public void flush() throws IOException {
        mo28151h();
        if (this.f25953f0 != null && mo28102a(C10904a.FLUSH_PASSED_TO_STREAM)) {
            this.f25953f0.flush();
        }
    }

    /* renamed from: g */
    public void mo28063g(String str) throws IOException {
        if (this.f25860c != null) {
            mo28154m(str);
            return;
        }
        int a = this.f25902X.mo28141a(str);
        if (a != 4) {
            if (a == 1) {
                if (this.f25956i0 >= this.f25957j0) {
                    mo28151h();
                }
                byte[] bArr = this.f25955h0;
                int i = this.f25956i0;
                this.f25956i0 = i + 1;
                bArr[i] = 44;
            }
            if (this.f25943d0) {
                m34512b(str, false);
                return;
            }
            int length = str.length();
            if (length > this.f25960m0) {
                m34512b(str, true);
                return;
            }
            if (this.f25956i0 >= this.f25957j0) {
                mo28151h();
            }
            byte[] bArr2 = this.f25955h0;
            int i2 = this.f25956i0;
            this.f25956i0 = i2 + 1;
            bArr2[i2] = this.f25954g0;
            if (length <= this.f25958k0) {
                if (this.f25956i0 + length > this.f25957j0) {
                    mo28151h();
                }
                m34521d(str, 0, length);
            } else {
                m34527g(str, 0, length);
            }
            if (this.f25956i0 >= this.f25957j0) {
                mo28151h();
            }
            byte[] bArr3 = this.f25955h0;
            int i3 = this.f25956i0;
            this.f25956i0 = i3 + 1;
            bArr3[i3] = this.f25954g0;
            return;
        }
        mo28059e("Can not write a field name, expecting a value");
        throw null;
    }

    /* renamed from: j */
    public void mo28066j(String str) throws IOException {
        mo28153l("write a string");
        if (str == null) {
            m34531j();
            return;
        }
        int length = str.length();
        if (length > this.f25958k0) {
            m34512b(str, true);
            return;
        }
        if (this.f25956i0 + length >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i = this.f25956i0;
        this.f25956i0 = i + 1;
        bArr[i] = this.f25954g0;
        m34521d(str, 0, length);
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr2 = this.f25955h0;
        int i2 = this.f25956i0;
        this.f25956i0 = i2 + 1;
        bArr2[i2] = this.f25954g0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo28153l(String str) throws IOException {
        byte b;
        int j = this.f25902X.mo28146j();
        if (this.f25860c != null) {
            mo28138b(str, j);
            return;
        }
        if (j == 1) {
            b = 44;
        } else if (j == 2) {
            b = 58;
        } else if (j == 3) {
            C10912n nVar = this.f25942c0;
            if (nVar != null) {
                byte[] a = nVar.mo28099a();
                if (a.length > 0) {
                    m34514b(a);
                }
            }
            return;
        } else if (j == 5) {
            mo28140k(str);
            throw null;
        } else {
            return;
        }
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i = this.f25956i0;
        this.f25956i0 = i + 1;
        bArr[i] = b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo28154m(String str) throws IOException {
        int a = this.f25902X.mo28141a(str);
        if (a != 4) {
            if (a == 1) {
                this.f25860c.mo28097g(this);
            } else {
                this.f25860c.mo28094d(this);
            }
            if (this.f25943d0) {
                m34512b(str, false);
                return;
            }
            int length = str.length();
            if (length > this.f25960m0) {
                m34512b(str, true);
                return;
            }
            if (this.f25956i0 >= this.f25957j0) {
                mo28151h();
            }
            byte[] bArr = this.f25955h0;
            int i = this.f25956i0;
            this.f25956i0 = i + 1;
            bArr[i] = this.f25954g0;
            str.getChars(0, length, this.f25959l0, 0);
            if (length <= this.f25958k0) {
                if (this.f25956i0 + length > this.f25957j0) {
                    mo28151h();
                }
                m34524e(this.f25959l0, 0, length);
            } else {
                m34529h(this.f25959l0, 0, length);
            }
            if (this.f25956i0 >= this.f25957j0) {
                mo28151h();
            }
            byte[] bArr2 = this.f25955h0;
            int i2 = this.f25956i0;
            this.f25956i0 = i2 + 1;
            bArr2[i2] = this.f25954g0;
            return;
        }
        mo28059e("Can not write a field name, expecting a value");
        throw null;
    }

    /* renamed from: n */
    public void mo28155n(String str) throws IOException {
        int length = str.length();
        char[] cArr = this.f25959l0;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            mo28147a(cArr, 0, length);
            return;
        }
        mo28150b(str, 0, length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo28151h() throws IOException {
        int i = this.f25956i0;
        if (i > 0) {
            this.f25956i0 = 0;
            this.f25953f0.write(this.f25955h0, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo28152i() {
        byte[] bArr = this.f25955h0;
        if (bArr != null && this.f25961n0) {
            this.f25955h0 = null;
            this.f25938Y.mo28109a(bArr);
        }
        char[] cArr = this.f25959l0;
        if (cArr != null) {
            this.f25959l0 = null;
            this.f25938Y.mo28111a(cArr);
        }
    }

    /* renamed from: e */
    private final void m34524e(char[] cArr, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) c;
            i++;
            i4 = i5;
        }
        this.f25956i0 = i4;
        if (i >= i3) {
            return;
        }
        if (this.f25941b0 != null) {
            m34515b(cArr, i, i3);
        } else if (this.f25940a0 == 0) {
            m34526f(cArr, i, i3);
        } else {
            m34528g(cArr, i, i3);
        }
    }

    /* renamed from: f */
    private final void m34526f(char[] cArr, int i, int i2) throws IOException {
        if (this.f25956i0 + ((i2 - i) * 6) > this.f25957j0) {
            mo28151h();
        }
        int i3 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[c];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = m34519d(c, i3);
                    }
                }
            } else if (c <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((c & '?') | 128);
            } else {
                i3 = m34516c(c, i3);
            }
            i = i4;
        }
        this.f25956i0 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r6 + 1;
        r6 = r5[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (r6 >= 2048) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r1 = r4.f25955h0;
        r2 = r4.f25956i0;
        r4.f25956i0 = r2 + 1;
        r1[r2] = (byte) ((r6 >> 6) | 192);
        r2 = r4.f25956i0;
        r4.f25956i0 = r2 + 1;
        r1[r2] = (byte) ((r6 & '?') | 128);
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        r6 = m34509a((int) r6, r5, r0, r7);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34518c(char[] r5, int r6, int r7) throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            if (r6 >= r7) goto L_0x0042
        L_0x0002:
            char r0 = r5[r6]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L_0x0033
            int r0 = r6 + 1
            char r6 = r5[r6]
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 >= r1) goto L_0x002e
            byte[] r1 = r4.f25955h0
            int r2 = r4.f25956i0
            int r3 = r2 + 1
            r4.f25956i0 = r3
            int r3 = r6 >> 6
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r4.f25956i0
            int r3 = r2 + 1
            r4.f25956i0 = r3
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r1[r2] = r6
            r6 = r0
            goto L_0x0000
        L_0x002e:
            int r6 = r4.m34509a(r6, r5, r0, r7)
            goto L_0x0000
        L_0x0033:
            byte[] r1 = r4.f25955h0
            int r2 = r4.f25956i0
            int r3 = r2 + 1
            r4.f25956i0 = r3
            byte r0 = (byte) r0
            r1[r2] = r0
            int r6 = r6 + 1
            if (r6 < r7) goto L_0x0002
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p441i.p442a.p443a.p446s.C10927d.m34518c(char[], int, int):void");
    }

    /* renamed from: b */
    public void mo28150b(String str, int i, int i2) throws IOException {
        char[] cArr = this.f25959l0;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            mo28147a(cArr, 0, i2);
            return;
        }
        int i3 = this.f25957j0;
        int min = Math.min(length, (i3 >> 2) + (i3 >> 4));
        int i4 = min * 3;
        while (i2 > 0) {
            int min2 = Math.min(min, i2);
            str.getChars(i, i + min2, cArr, 0);
            if (this.f25956i0 + i4 > this.f25957j0) {
                mo28151h();
            }
            if (min2 > 1) {
                char c = cArr[min2 - 1];
                if (c >= 55296 && c <= 56319) {
                    min2--;
                }
            }
            m34518c(cArr, 0, min2);
            i += min2;
            i2 -= min2;
        }
    }

    /* renamed from: a */
    public void mo28040a(C10897a aVar, byte[] bArr, int i, int i2) throws IOException, C10902e {
        mo28153l("write a binary value");
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr2 = this.f25955h0;
        int i3 = this.f25956i0;
        this.f25956i0 = i3 + 1;
        bArr2[i3] = this.f25954g0;
        mo28149b(aVar, bArr, i, i2 + i);
        if (this.f25956i0 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr3 = this.f25955h0;
        int i4 = this.f25956i0;
        this.f25956i0 = i4 + 1;
        bArr3[i4] = this.f25954g0;
    }

    /* renamed from: d */
    private final void m34520d(int i) throws IOException {
        if (this.f25956i0 + 13 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i2 = this.f25956i0;
        this.f25956i0 = i2 + 1;
        bArr[i2] = this.f25954g0;
        this.f25956i0 = C10920e.m34481e(i, bArr, this.f25956i0);
        byte[] bArr2 = this.f25955h0;
        int i3 = this.f25956i0;
        this.f25956i0 = i3 + 1;
        bArr2[i3] = this.f25954g0;
    }

    /* renamed from: j */
    private final void m34531j() throws IOException {
        if (this.f25956i0 + 4 >= this.f25957j0) {
            mo28151h();
        }
        System.arraycopy(f25950p0, 0, this.f25955h0, this.f25956i0, 4);
        this.f25956i0 += 4;
    }

    /* renamed from: c */
    private final void m34517c(String str, int i, int i2) throws IOException {
        if (this.f25956i0 + ((i2 - i) * 6) > this.f25957j0) {
            mo28151h();
        }
        int i3 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        int i4 = this.f25940a0;
        if (i4 <= 0) {
            i4 = 65535;
        }
        C10917b bVar = this.f25941b0;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        C10912n a = bVar.mo28105a(charAt);
                        if (a != null) {
                            i3 = m34511a(bArr, i3, a, i2 - i5);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid custom escape definitions; custom escape not found for character code 0x");
                            sb.append(Integer.toHexString(charAt));
                            sb.append(", although was supposed to have one");
                            mo28059e(sb.toString());
                            throw null;
                        }
                    } else {
                        i3 = m34519d(charAt, i3);
                    }
                }
            } else if (charAt > i4) {
                i3 = m34519d(charAt, i3);
            } else {
                C10912n a2 = bVar.mo28105a(charAt);
                if (a2 != null) {
                    i3 = m34511a(bArr, i3, a2, i2 - i5);
                } else if (charAt <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((charAt >> 6) | 192);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) ((charAt & '?') | 128);
                } else {
                    i3 = m34516c(charAt, i3);
                }
            }
            i = i5;
        }
        this.f25956i0 = i3;
    }

    /* renamed from: a */
    public void mo28049a(short s) throws IOException {
        mo28153l("write a number");
        if (this.f25956i0 + 6 >= this.f25957j0) {
            mo28151h();
        }
        if (this.f25901W) {
            m34513b(s);
        } else {
            this.f25956i0 = C10920e.m34481e((int) s, this.f25955h0, this.f25956i0);
        }
    }

    /* renamed from: d */
    public void mo28057d() throws IOException {
        mo28153l("write a null");
        m34531j();
    }

    /* renamed from: b */
    private final void m34513b(short s) throws IOException {
        if (this.f25956i0 + 8 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i = this.f25956i0;
        this.f25956i0 = i + 1;
        bArr[i] = this.f25954g0;
        this.f25956i0 = C10920e.m34481e((int) s, bArr, this.f25956i0);
        byte[] bArr2 = this.f25955h0;
        int i2 = this.f25956i0;
        this.f25956i0 = i2 + 1;
        bArr2[i2] = this.f25954g0;
    }

    /* renamed from: d */
    private final void m34521d(String str, int i, int i2) throws IOException {
        int i3 = i2 + i;
        int i4 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        while (i < i3) {
            char charAt = str.charAt(i);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            int i5 = i4 + 1;
            bArr[i4] = (byte) charAt;
            i++;
            i4 = i5;
        }
        this.f25956i0 = i4;
        if (i >= i3) {
            return;
        }
        if (this.f25941b0 != null) {
            m34517c(str, i, i3);
        } else if (this.f25940a0 == 0) {
            m34523e(str, i, i3);
        } else {
            m34525f(str, i, i3);
        }
    }

    /* renamed from: e */
    private final void m34523e(String str, int i, int i2) throws IOException {
        if (this.f25956i0 + ((i2 - i) * 6) > this.f25957j0) {
            mo28151h();
        }
        int i3 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        while (i < i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[charAt];
                    if (i6 > 0) {
                        int i7 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i3 = m34519d(charAt, i3);
                    }
                }
            } else if (charAt <= 2047) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = m34516c(charAt, i3);
            }
            i = i4;
        }
        this.f25956i0 = i3;
    }

    /* renamed from: f */
    private final void m34525f(String str, int i, int i2) throws IOException {
        if (this.f25956i0 + ((i2 - i) * 6) > this.f25957j0) {
            mo28151h();
        }
        int i3 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        int i4 = this.f25940a0;
        while (i < i2) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i3 = m34519d(charAt, i3);
                    }
                }
            } else if (charAt > i4) {
                i3 = m34519d(charAt, i3);
            } else if (charAt <= 2047) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((charAt >> 6) | 192);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((charAt & '?') | 128);
            } else {
                i3 = m34516c(charAt, i3);
            }
            i = i5;
        }
        this.f25956i0 = i3;
    }

    /* renamed from: g */
    private final void m34527g(String str, int i, int i2) throws IOException {
        do {
            int min = Math.min(this.f25958k0, i2);
            if (this.f25956i0 + min > this.f25957j0) {
                mo28151h();
            }
            m34521d(str, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    /* renamed from: a */
    public void mo28039a(long j) throws IOException {
        mo28153l("write a number");
        if (this.f25901W) {
            m34530i(j);
            return;
        }
        if (this.f25956i0 + 21 >= this.f25957j0) {
            mo28151h();
        }
        this.f25956i0 = C10920e.m34467a(j, this.f25955h0, this.f25956i0);
    }

    /* renamed from: b */
    public void mo28053b(int i) throws IOException {
        mo28153l("write a number");
        if (this.f25956i0 + 11 >= this.f25957j0) {
            mo28151h();
        }
        if (this.f25901W) {
            m34520d(i);
        } else {
            this.f25956i0 = C10920e.m34481e(i, this.f25955h0, this.f25956i0);
        }
    }

    /* renamed from: g */
    private final void m34528g(char[] cArr, int i, int i2) throws IOException {
        if (this.f25956i0 + ((i2 - i) * 6) > this.f25957j0) {
            mo28151h();
        }
        int i3 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        int i4 = this.f25940a0;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i3 = m34519d(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = m34519d(c, i3);
            } else if (c <= 2047) {
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i9 + 1;
                bArr[i9] = (byte) ((c & '?') | 128);
            } else {
                i3 = m34516c(c, i3);
            }
            i = i5;
        }
        this.f25956i0 = i3;
    }

    /* renamed from: a */
    public void mo28048a(BigInteger bigInteger) throws IOException {
        mo28153l("write a number");
        if (bigInteger == null) {
            m34531j();
        } else if (this.f25901W) {
            m34532o(bigInteger.toString());
        } else {
            mo28155n(bigInteger.toString());
        }
    }

    /* renamed from: b */
    private final void m34514b(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this.f25956i0 + length > this.f25957j0) {
            mo28151h();
            if (length > 512) {
                this.f25953f0.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this.f25955h0, this.f25956i0, length);
        this.f25956i0 += length;
    }

    /* renamed from: d */
    private int m34519d(int i, int i2) throws IOException {
        int i3;
        byte[] bArr = this.f25955h0;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = 255 & (i >> 8);
            int i7 = i5 + 1;
            byte[] bArr2 = f25949o0;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = f25949o0;
        bArr[i3] = bArr3[i >> 4];
        int i10 = i9 + 1;
        bArr[i9] = bArr3[i & 15];
        return i10;
    }

    /* renamed from: a */
    public void mo28037a(double d) throws IOException {
        if (this.f25901W || ((Double.isNaN(d) || Double.isInfinite(d)) && C10904a.QUOTE_NON_NUMERIC_NUMBERS.mo28068a(this.f25900V))) {
            mo28066j(String.valueOf(d));
            return;
        }
        mo28153l("write a number");
        mo28155n(String.valueOf(d));
    }

    /* renamed from: b */
    private final void m34512b(String str, boolean z) throws IOException {
        if (z) {
            if (this.f25956i0 >= this.f25957j0) {
                mo28151h();
            }
            byte[] bArr = this.f25955h0;
            int i = this.f25956i0;
            this.f25956i0 = i + 1;
            bArr[i] = this.f25954g0;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int min = Math.min(this.f25958k0, length);
            if (this.f25956i0 + min > this.f25957j0) {
                mo28151h();
            }
            m34521d(str, i2, min);
            i2 += min;
            length -= min;
        }
        if (z) {
            if (this.f25956i0 >= this.f25957j0) {
                mo28151h();
            }
            byte[] bArr2 = this.f25955h0;
            int i3 = this.f25956i0;
            this.f25956i0 = i3 + 1;
            bArr2[i3] = this.f25954g0;
        }
    }

    /* renamed from: c */
    private final int m34516c(int i, int i2) throws IOException {
        byte[] bArr = this.f25955h0;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i5;
        }
        int i6 = i2 + 1;
        bArr[i2] = 92;
        int i7 = i6 + 1;
        bArr[i6] = 117;
        int i8 = i7 + 1;
        byte[] bArr2 = f25949o0;
        bArr[i7] = bArr2[(i >> 12) & 15];
        int i9 = i8 + 1;
        bArr[i8] = bArr2[(i >> 8) & 15];
        int i10 = i9 + 1;
        bArr[i9] = bArr2[(i >> 4) & 15];
        int i11 = i10 + 1;
        bArr[i10] = bArr2[i & 15];
        return i11;
    }

    /* renamed from: a */
    public void mo28038a(float f) throws IOException {
        if (this.f25901W || ((Float.isNaN(f) || Float.isInfinite(f)) && C10904a.QUOTE_NON_NUMERIC_NUMBERS.mo28068a(this.f25900V))) {
            mo28066j(String.valueOf(f));
            return;
        }
        mo28153l("write a number");
        mo28155n(String.valueOf(f));
    }

    /* renamed from: a */
    public void mo28047a(BigDecimal bigDecimal) throws IOException {
        mo28153l("write a number");
        if (bigDecimal == null) {
            m34531j();
        } else if (this.f25901W) {
            m34532o(mo28103b(bigDecimal));
        } else {
            mo28155n(mo28103b(bigDecimal));
        }
    }

    /* renamed from: b */
    private final void m34515b(char[] cArr, int i, int i2) throws IOException {
        if (this.f25956i0 + ((i2 - i) * 6) > this.f25957j0) {
            mo28151h();
        }
        int i3 = this.f25956i0;
        byte[] bArr = this.f25955h0;
        int[] iArr = this.f25939Z;
        int i4 = this.f25940a0;
        if (i4 <= 0) {
            i4 = 65535;
        }
        C10917b bVar = this.f25941b0;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                if (iArr[c] == 0) {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i5;
                    i3 = i6;
                } else {
                    int i7 = iArr[c];
                    if (i7 > 0) {
                        int i8 = i3 + 1;
                        bArr[i3] = 92;
                        i3 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 == -2) {
                        C10912n a = bVar.mo28105a(c);
                        if (a != null) {
                            i3 = m34511a(bArr, i3, a, i2 - i5);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid custom escape definitions; custom escape not found for character code 0x");
                            sb.append(Integer.toHexString(c));
                            sb.append(", although was supposed to have one");
                            mo28059e(sb.toString());
                            throw null;
                        }
                    } else {
                        i3 = m34519d(c, i3);
                    }
                }
            } else if (c > i4) {
                i3 = m34519d(c, i3);
            } else {
                C10912n a2 = bVar.mo28105a(c);
                if (a2 != null) {
                    i3 = m34511a(bArr, i3, a2, i2 - i5);
                } else if (c <= 2047) {
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) ((c & '?') | 128);
                } else {
                    i3 = m34516c(c, i3);
                }
            }
            i = i5;
        }
        this.f25956i0 = i3;
    }

    /* renamed from: a */
    public void mo28050a(boolean z) throws IOException {
        mo28153l("write a boolean value");
        if (this.f25956i0 + 5 >= this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = z ? f25951q0 : f25952r0;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.f25955h0, this.f25956i0, length);
        this.f25956i0 += length;
    }

    /* renamed from: a */
    private final int m34511a(byte[] bArr, int i, C10912n nVar, int i2) throws IOException, C10902e {
        byte[] a = nVar.mo28099a();
        int length = a.length;
        if (length > 6) {
            return m34510a(bArr, i, this.f25957j0, a, i2);
        }
        System.arraycopy(a, 0, bArr, i, length);
        return i + length;
    }

    /* renamed from: a */
    private final int m34510a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IOException, C10902e {
        int length = bArr2.length;
        if (i + length > i2) {
            this.f25956i0 = i;
            mo28151h();
            int i4 = this.f25956i0;
            if (length > bArr.length) {
                this.f25953f0.write(bArr2, 0, length);
                return i4;
            }
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i = i4 + length;
        }
        if ((i3 * 6) + i <= i2) {
            return i;
        }
        mo28151h();
        return this.f25956i0;
    }

    /* renamed from: a */
    private final int m34509a(int i, char[] cArr, int i2, int i3) throws IOException {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.f25955h0;
            int i4 = this.f25956i0;
            this.f25956i0 = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i5 = this.f25956i0;
            this.f25956i0 = i5 + 1;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            int i6 = this.f25956i0;
            this.f25956i0 = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return i2;
        } else if (i2 >= i3 || cArr == null) {
            mo28059e(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", new Object[]{Integer.valueOf(i)}));
            throw null;
        } else {
            mo28148b(i, (int) cArr[i2]);
            return i2 + 1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28149b(C10897a aVar, byte[] bArr, int i, int i2) throws IOException, C10902e {
        int i3 = i2 - 3;
        int i4 = this.f25957j0 - 6;
        int a = aVar.mo28015a() >> 2;
        while (i <= i3) {
            if (this.f25956i0 > i4) {
                mo28151h();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            this.f25956i0 = aVar.mo28018a((int) (((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this.f25955h0, this.f25956i0);
            a--;
            if (a <= 0) {
                byte[] bArr2 = this.f25955h0;
                int i8 = this.f25956i0;
                this.f25956i0 = i8 + 1;
                bArr2[i8] = 92;
                int i9 = this.f25956i0;
                this.f25956i0 = i9 + 1;
                bArr2[i9] = 110;
                a = aVar.mo28015a() >> 2;
            }
            i = i7;
        }
        int i10 = i2 - i;
        if (i10 > 0) {
            if (this.f25956i0 > i4) {
                mo28151h();
            }
            int i11 = i + 1;
            int i12 = bArr[i] << 16;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            }
            this.f25956i0 = aVar.mo28016a(i12, i10, this.f25955h0, this.f25956i0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28148b(int i, int i2) throws IOException {
        int a = mo28101a(i, i2);
        if (this.f25956i0 + 4 > this.f25957j0) {
            mo28151h();
        }
        byte[] bArr = this.f25955h0;
        int i3 = this.f25956i0;
        this.f25956i0 = i3 + 1;
        bArr[i3] = (byte) ((a >> 18) | 240);
        int i4 = this.f25956i0;
        this.f25956i0 = i4 + 1;
        bArr[i4] = (byte) (((a >> 12) & 63) | 128);
        int i5 = this.f25956i0;
        this.f25956i0 = i5 + 1;
        bArr[i5] = (byte) (((a >> 6) & 63) | 128);
        int i6 = this.f25956i0;
        this.f25956i0 = i6 + 1;
        bArr[i6] = (byte) ((a & 63) | 128);
    }
}
