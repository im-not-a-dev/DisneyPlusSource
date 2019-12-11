package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: g.j.a.a.d.g.k3 */
final class C11180k3 extends C11152i3 {

    /* renamed from: d */
    private final byte[] f26292d;

    /* renamed from: e */
    private int f26293e;

    /* renamed from: f */
    private int f26294f;

    /* renamed from: g */
    private int f26295g;

    /* renamed from: h */
    private int f26296h;

    /* renamed from: i */
    private int f26297i;

    /* renamed from: j */
    private int f26298j;

    private C11180k3(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f26298j = Integer.MAX_VALUE;
        this.f26292d = bArr;
        this.f26293e = i2 + i;
        this.f26295g = i;
        this.f26296h = this.f26295g;
    }

    /* renamed from: A */
    private final byte m35436A() throws IOException {
        int i = this.f26295g;
        if (i != this.f26293e) {
            byte[] bArr = this.f26292d;
            this.f26295g = i + 1;
            return bArr[i];
        }
        throw C11258p4.m35930a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m35437v() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f26295g
            int r1 = r5.f26293e
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.f26292d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.f26295g = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.f26295g = r1
            return r0
        L_0x006b:
            long r0 = r5.mo28622u()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11180k3.m35437v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m35438w() throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f26295g
            int r1 = r11.f26293e
            if (r1 == r0) goto L_0x00b8
            byte[] r2 = r11.f26292d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.f26295g = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b8
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0025
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            goto L_0x00b5
        L_0x0025:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0036
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00b5
        L_0x0036:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0044
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0044:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0057:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00b5
        L_0x005b:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006d:
            long r2 = r3 ^ r5
            goto L_0x00b5
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0057
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006d
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b3
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b8
            goto L_0x00b4
        L_0x00b3:
            r1 = r0
        L_0x00b4:
            r2 = r3
        L_0x00b5:
            r11.f26295g = r1
            return r2
        L_0x00b8:
            long r0 = r11.mo28622u()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p449j.p450a.p451a.p457d.p464g.C11180k3.m35438w():long");
    }

    /* renamed from: x */
    private final int m35439x() throws IOException {
        int i = this.f26295g;
        if (this.f26293e - i >= 4) {
            byte[] bArr = this.f26292d;
            this.f26295g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw C11258p4.m35930a();
    }

    /* renamed from: y */
    private final long m35440y() throws IOException {
        int i = this.f26295g;
        if (this.f26293e - i >= 8) {
            byte[] bArr = this.f26292d;
            this.f26295g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw C11258p4.m35930a();
    }

    /* renamed from: z */
    private final void m35441z() {
        this.f26293e += this.f26294f;
        int i = this.f26293e;
        int i2 = i - this.f26296h;
        int i3 = this.f26298j;
        if (i2 > i3) {
            this.f26294f = i2 - i3;
            this.f26293e = i - this.f26294f;
            return;
        }
        this.f26294f = 0;
    }

    /* renamed from: a */
    public final void mo28550a(int i) throws C11258p4 {
        if (this.f26297i != i) {
            throw C11258p4.m35934e();
        }
    }

    /* renamed from: b */
    public final boolean mo28552b(int i) throws IOException {
        int d;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f26293e - this.f26295g >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f26292d;
                    int i4 = this.f26295g;
                    this.f26295g = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw C11258p4.m35932c();
            }
            while (i3 < 10) {
                if (m35436A() < 0) {
                    i3++;
                }
            }
            throw C11258p4.m35932c();
            return true;
        } else if (i2 == 1) {
            mo28560f(8);
            return true;
        } else if (i2 == 2) {
            mo28560f(m35437v());
            return true;
        } else if (i2 == 3) {
            do {
                d = mo28555d();
                if (d == 0) {
                    break;
                }
            } while (mo28552b(d));
            mo28550a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo28560f(4);
                return true;
            }
            throw C11258p4.m35935f();
        }
    }

    /* renamed from: c */
    public final String mo28554c() throws IOException {
        int v = m35437v();
        if (v > 0) {
            int i = this.f26293e;
            int i2 = this.f26295g;
            if (v <= i - i2) {
                String str = new String(this.f26292d, i2, v, C11111f4.f26198a);
                this.f26295g += v;
                return str;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v < 0) {
            throw C11258p4.m35931b();
        }
        throw C11258p4.m35930a();
    }

    /* renamed from: d */
    public final int mo28555d() throws IOException {
        if (mo28573s()) {
            this.f26297i = 0;
            return 0;
        }
        this.f26297i = m35437v();
        int i = this.f26297i;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw C11258p4.m35933d();
    }

    /* renamed from: e */
    public final long mo28557e() throws IOException {
        return m35438w();
    }

    /* renamed from: f */
    public final long mo28559f() throws IOException {
        return m35438w();
    }

    /* renamed from: g */
    public final int mo28561g() throws IOException {
        return m35437v();
    }

    /* renamed from: h */
    public final long mo28562h() throws IOException {
        return m35440y();
    }

    /* renamed from: i */
    public final int mo28563i() throws IOException {
        return m35439x();
    }

    /* renamed from: j */
    public final boolean mo28564j() throws IOException {
        return m35438w() != 0;
    }

    /* renamed from: k */
    public final String mo28565k() throws IOException {
        int v = m35437v();
        if (v > 0) {
            int i = this.f26293e;
            int i2 = this.f26295g;
            if (v <= i - i2) {
                String c = C11114f7.m35227c(this.f26292d, i2, v);
                this.f26295g += v;
                return c;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v <= 0) {
            throw C11258p4.m35931b();
        }
        throw C11258p4.m35930a();
    }

    /* renamed from: l */
    public final C11342v2 mo28566l() throws IOException {
        byte[] bArr;
        int v = m35437v();
        if (v > 0) {
            int i = this.f26293e;
            int i2 = this.f26295g;
            if (v <= i - i2) {
                C11342v2 a = C11342v2.m36528a(this.f26292d, i2, v);
                this.f26295g += v;
                return a;
            }
        }
        if (v == 0) {
            return C11342v2.f26574U;
        }
        if (v > 0) {
            int i3 = this.f26293e;
            int i4 = this.f26295g;
            if (v <= i3 - i4) {
                this.f26295g = v + i4;
                bArr = Arrays.copyOfRange(this.f26292d, i4, this.f26295g);
                return C11342v2.m36527a(bArr);
            }
        }
        if (v > 0) {
            throw C11258p4.m35930a();
        } else if (v == 0) {
            bArr = C11111f4.f26199b;
            return C11342v2.m36527a(bArr);
        } else {
            throw C11258p4.m35931b();
        }
    }

    /* renamed from: m */
    public final int mo28567m() throws IOException {
        return m35437v();
    }

    /* renamed from: n */
    public final int mo28568n() throws IOException {
        return m35437v();
    }

    /* renamed from: o */
    public final int mo28569o() throws IOException {
        return m35439x();
    }

    /* renamed from: p */
    public final long mo28570p() throws IOException {
        return m35440y();
    }

    /* renamed from: q */
    public final int mo28571q() throws IOException {
        return C11152i3.m35290g(m35437v());
    }

    /* renamed from: r */
    public final long mo28572r() throws IOException {
        return C11152i3.m35287a(m35438w());
    }

    /* renamed from: s */
    public final boolean mo28573s() throws IOException {
        return this.f26295g == this.f26293e;
    }

    /* renamed from: t */
    public final int mo28574t() {
        return this.f26295g - this.f26296h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final long mo28622u() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = m35436A();
            j |= ((long) (A & Byte.MAX_VALUE)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw C11258p4.m35932c();
    }

    /* renamed from: e */
    public final void mo28558e(int i) {
        this.f26298j = i;
        m35441z();
    }

    /* renamed from: f */
    public final void mo28560f(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f26293e;
            int i3 = this.f26295g;
            if (i <= i2 - i3) {
                this.f26295g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw C11258p4.m35931b();
        }
        throw C11258p4.m35930a();
    }

    /* renamed from: a */
    public final double mo28548a() throws IOException {
        return Double.longBitsToDouble(m35440y());
    }

    /* renamed from: a */
    public final <T extends C11259p5> T mo28549a(C11373x5<T> x5Var, C11285r3 r3Var) throws IOException {
        int v = m35437v();
        if (this.f26247a < this.f26248b) {
            int d = mo28556d(v);
            this.f26247a++;
            T t = (C11259p5) x5Var.mo28448a(this, r3Var);
            mo28550a(0);
            this.f26247a--;
            mo28558e(d);
            return t;
        }
        throw C11258p4.m35936g();
    }

    /* renamed from: d */
    public final int mo28556d(int i) throws C11258p4 {
        if (i >= 0) {
            int t = i + mo28574t();
            int i2 = this.f26298j;
            if (t <= i2) {
                this.f26298j = t;
                m35441z();
                return i2;
            }
            throw C11258p4.m35930a();
        }
        throw C11258p4.m35931b();
    }

    /* renamed from: b */
    public final float mo28551b() throws IOException {
        return Float.intBitsToFloat(m35439x());
    }
}
