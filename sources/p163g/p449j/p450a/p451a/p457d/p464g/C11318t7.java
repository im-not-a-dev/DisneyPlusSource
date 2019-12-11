package p163g.p449j.p450a.p451a.p457d.p464g;

import java.io.IOException;

/* renamed from: g.j.a.a.d.g.t7 */
public final class C11318t7 {

    /* renamed from: a */
    private final byte[] f26530a;

    /* renamed from: b */
    private final int f26531b;

    /* renamed from: c */
    private final int f26532c;

    /* renamed from: d */
    private int f26533d;

    /* renamed from: e */
    private int f26534e;

    /* renamed from: f */
    private int f26535f;

    /* renamed from: g */
    private int f26536g;

    /* renamed from: h */
    private int f26537h = Integer.MAX_VALUE;

    /* renamed from: i */
    private int f26538i;

    /* renamed from: j */
    private int f26539j = 64;

    /* renamed from: k */
    private C11152i3 f26540k;

    private C11318t7(byte[] bArr, int i, int i2) {
        this.f26530a = bArr;
        this.f26531b = 0;
        int i3 = i2 + 0;
        this.f26533d = i3;
        this.f26532c = i3;
        this.f26535f = 0;
    }

    /* renamed from: a */
    public static C11318t7 m36376a(byte[] bArr, int i, int i2) {
        return new C11318t7(bArr, 0, i2);
    }

    /* renamed from: b */
    private final void m36377b(int i) throws C11044b8 {
        if (this.f26536g != i) {
            throw new C11044b8("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: g */
    private final void m36379g() {
        this.f26533d += this.f26534e;
        int i = this.f26533d;
        int i2 = this.f26537h;
        if (i > i2) {
            this.f26534e = i - i2;
            this.f26533d = i - this.f26534e;
            return;
        }
        this.f26534e = 0;
    }

    /* renamed from: h */
    private final byte m36380h() throws IOException {
        int i = this.f26535f;
        if (i != this.f26533d) {
            byte[] bArr = this.f26530a;
            this.f26535f = i + 1;
            return bArr[i];
        }
        throw C11044b8.m34810a();
    }

    /* renamed from: c */
    public final int mo29030c() throws IOException {
        if (this.f26535f == this.f26533d) {
            this.f26536g = 0;
            return 0;
        }
        this.f26536g = mo29032e();
        int i = this.f26536g;
        if (i != 0) {
            return i;
        }
        throw new C11044b8("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public final boolean mo29031d() throws IOException {
        return mo29032e() != 0;
    }

    /* renamed from: e */
    public final int mo29032e() throws IOException {
        byte b;
        int i;
        byte h = m36380h();
        if (h >= 0) {
            return h;
        }
        byte b2 = h & Byte.MAX_VALUE;
        byte h2 = m36380h();
        if (h2 >= 0) {
            i = h2 << 7;
        } else {
            b2 |= (h2 & Byte.MAX_VALUE) << 7;
            byte h3 = m36380h();
            if (h3 >= 0) {
                i = h3 << 14;
            } else {
                b2 |= (h3 & Byte.MAX_VALUE) << 14;
                byte h4 = m36380h();
                if (h4 >= 0) {
                    i = h4 << 21;
                } else {
                    byte b3 = b2 | ((h4 & Byte.MAX_VALUE) << 21);
                    byte h5 = m36380h();
                    b = b3 | (h5 << 28);
                    if (h5 < 0) {
                        for (int i2 = 0; i2 < 5; i2++) {
                            if (m36380h() >= 0) {
                                return b;
                            }
                        }
                        throw C11044b8.m34812c();
                    }
                    return b;
                }
            }
        }
        b = b2 | i;
        return b;
    }

    /* renamed from: f */
    public final long mo29033f() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte h = m36380h();
            j |= ((long) (h & Byte.MAX_VALUE)) << i;
            if ((h & 128) == 0) {
                return j;
            }
        }
        throw C11044b8.m34812c();
    }

    /* renamed from: a */
    public final boolean mo29026a(int i) throws IOException {
        int c;
        int i2 = i & 7;
        if (i2 == 0) {
            mo29032e();
            return true;
        } else if (i2 == 1) {
            m36380h();
            m36380h();
            m36380h();
            m36380h();
            m36380h();
            m36380h();
            m36380h();
            m36380h();
            return true;
        } else if (i2 == 2) {
            m36378c(mo29032e());
            return true;
        } else if (i2 == 3) {
            do {
                c = mo29030c();
                if (c == 0) {
                    break;
                }
            } while (mo29026a(c));
            m36377b(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                m36380h();
                m36380h();
                m36380h();
                m36380h();
                return true;
            }
            throw new C11044b8("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: b */
    public final String mo29028b() throws IOException {
        int e = mo29032e();
        if (e >= 0) {
            int i = this.f26533d;
            int i2 = this.f26535f;
            if (e <= i - i2) {
                String str = new String(this.f26530a, i2, e, C11063c8.f26115a);
                this.f26535f += e;
                return str;
            }
            throw C11044b8.m34810a();
        }
        throw C11044b8.m34811b();
    }

    /* renamed from: c */
    private final void m36378c(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f26535f;
            int i3 = i2 + i;
            int i4 = this.f26537h;
            if (i3 > i4) {
                m36378c(i4 - i2);
                throw C11044b8.m34810a();
            } else if (i <= this.f26533d - i2) {
                this.f26535f = i2 + i;
            } else {
                throw C11044b8.m34810a();
            }
        } else {
            throw C11044b8.m34811b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo29029b(int i, int i2) {
        int i3 = this.f26535f;
        int i4 = this.f26531b;
        if (i > i3 - i4) {
            int i5 = i3 - i4;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        } else if (i >= 0) {
            this.f26535f = i4 + i;
            this.f26536g = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo29025a(C11099e8 e8Var) throws IOException {
        int e = mo29032e();
        if (this.f26538i >= this.f26539j) {
            throw new C11044b8("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (e >= 0) {
            int i = e + this.f26535f;
            int i2 = this.f26537h;
            if (i <= i2) {
                this.f26537h = i;
                m36379g();
                this.f26538i++;
                e8Var.mo28251a(this);
                m36377b(0);
                this.f26538i--;
                this.f26537h = i2;
                m36379g();
                return;
            }
            throw C11044b8.m34810a();
        } else {
            throw C11044b8.m34811b();
        }
    }

    /* renamed from: a */
    public final <T extends C11090e4<T, ?>> T mo29024a(C11373x5<T> x5Var) throws IOException {
        try {
            if (this.f26540k == null) {
                this.f26540k = C11152i3.m35288a(this.f26530a, this.f26531b, this.f26532c);
            }
            int t = this.f26540k.mo28574t();
            int i = this.f26535f - this.f26531b;
            if (t <= i) {
                this.f26540k.mo28560f(i - t);
                this.f26540k.mo28553c(this.f26539j - this.f26538i);
                T t2 = (C11090e4) this.f26540k.mo28549a(x5Var, C11285r3.m36044d());
                mo29026a(this.f26536g);
                return t2;
            }
            throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", new Object[]{Integer.valueOf(t), Integer.valueOf(i)}));
        } catch (C11258p4 e) {
            throw new C11044b8("", e);
        }
    }

    /* renamed from: a */
    public final int mo29023a() {
        return this.f26535f - this.f26531b;
    }

    /* renamed from: a */
    public final byte[] mo29027a(int i, int i2) {
        if (i2 == 0) {
            return C11115f8.f26205a;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f26530a, this.f26531b + i, bArr, 0, i2);
        return bArr;
    }
}
