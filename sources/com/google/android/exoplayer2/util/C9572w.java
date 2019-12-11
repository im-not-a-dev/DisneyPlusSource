package com.google.android.exoplayer2.util;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;

/* renamed from: com.google.android.exoplayer2.v0.w */
/* compiled from: ParsableByteArray */
public final class C9572w {

    /* renamed from: a */
    public byte[] f22333a;

    /* renamed from: b */
    private int f22334b;

    /* renamed from: c */
    private int f22335c;

    public C9572w() {
        this.f22333a = Util.EMPTY_BYTE_ARRAY;
    }

    /* renamed from: A */
    public long mo24675A() {
        long r = mo24707r();
        if (r >= 0) {
            return r;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(r);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: B */
    public int mo24676B() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        return (bArr[i3] & 255) | i2;
    }

    /* renamed from: C */
    public long mo24677C() {
        int i;
        int i2;
        long j = (long) this.f22333a[this.f22334b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f22333a[this.f22334b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f22334b += i2;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: D */
    public void mo24678D() {
        this.f22334b = 0;
        this.f22335c = 0;
    }

    /* renamed from: a */
    public void mo24683a(byte[] bArr) {
        mo24684a(bArr, bArr.length);
    }

    /* renamed from: b */
    public int mo24686b() {
        return this.f22333a.length;
    }

    /* renamed from: c */
    public void mo24689c(int i) {
        mo24684a(mo24686b() < i ? new byte[i] : this.f22333a, i);
    }

    /* renamed from: d */
    public int mo24690d() {
        return this.f22335c;
    }

    /* renamed from: e */
    public void mo24693e(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.f22335c);
        this.f22334b = i;
    }

    /* renamed from: f */
    public void mo24695f(int i) {
        mo24693e(this.f22334b + i);
    }

    /* renamed from: g */
    public double mo24696g() {
        return Double.longBitsToDouble(mo24707r());
    }

    /* renamed from: h */
    public float mo24697h() {
        return Float.intBitsToFloat(mo24698i());
    }

    /* renamed from: i */
    public int mo24698i() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        byte b = i2 | ((bArr[i3] & 255) << 16);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        int i5 = this.f22334b;
        this.f22334b = i5 + 1;
        return (bArr[i5] & 255) | b2;
    }

    /* renamed from: j */
    public int mo24699j() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        int i2 = ((bArr[i] & 255) << 24) >> 8;
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        byte b = i2 | ((bArr[i3] & 255) << 8);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: k */
    public String mo24700k() {
        if (mo24679a() == 0) {
            return null;
        }
        int i = this.f22334b;
        while (i < this.f22335c && !Util.m29452f((int) this.f22333a[i])) {
            i++;
        }
        int i2 = this.f22334b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f22333a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f22334b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f22333a;
        int i3 = this.f22334b;
        String a = Util.m29400a(bArr2, i3, i - i3);
        this.f22334b = i;
        int i4 = this.f22334b;
        int i5 = this.f22335c;
        if (i4 == i5) {
            return a;
        }
        if (this.f22333a[i4] == 13) {
            this.f22334b = i4 + 1;
            if (this.f22334b == i5) {
                return a;
            }
        }
        byte[] bArr3 = this.f22333a;
        int i6 = this.f22334b;
        if (bArr3[i6] == 10) {
            this.f22334b = i6 + 1;
        }
        return a;
    }

    /* renamed from: l */
    public int mo24701l() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        byte b = bArr[i] & 255;
        int i2 = this.f22334b;
        this.f22334b = i2 + 1;
        byte b2 = b | ((bArr[i2] & 255) << 8);
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        byte b3 = b2 | ((bArr[i3] & 255) << 16);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b3;
    }

    /* renamed from: m */
    public long mo24702m() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.f22334b;
        this.f22334b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i5 = this.f22334b;
        this.f22334b = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i6 = this.f22334b;
        this.f22334b = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i7 = this.f22334b;
        this.f22334b = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        int i8 = this.f22334b;
        this.f22334b = i8 + 1;
        return j7 | ((255 & ((long) bArr[i8])) << 56);
    }

    /* renamed from: n */
    public short mo24703n() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        byte b = bArr[i] & 255;
        int i2 = this.f22334b;
        this.f22334b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | b);
    }

    /* renamed from: o */
    public long mo24704o() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.f22334b;
        this.f22334b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        return j3 | ((255 & ((long) bArr[i4])) << 24);
    }

    /* renamed from: p */
    public int mo24705p() {
        int l = mo24701l();
        if (l >= 0) {
            return l;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(l);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: q */
    public int mo24706q() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        byte b = bArr[i] & 255;
        int i2 = this.f22334b;
        this.f22334b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | b;
    }

    /* renamed from: r */
    public long mo24707r() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i2 = this.f22334b;
        this.f22334b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.f22334b;
        this.f22334b = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.f22334b;
        this.f22334b = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.f22334b;
        this.f22334b = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        int i8 = this.f22334b;
        this.f22334b = i8 + 1;
        return j7 | (255 & ((long) bArr[i8]));
    }

    /* renamed from: s */
    public String mo24708s() {
        if (mo24679a() == 0) {
            return null;
        }
        int i = this.f22334b;
        while (i < this.f22335c && this.f22333a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f22333a;
        int i2 = this.f22334b;
        String a = Util.m29400a(bArr, i2, i - i2);
        this.f22334b = i;
        int i3 = this.f22334b;
        if (i3 < this.f22335c) {
            this.f22334b = i3 + 1;
        }
        return a;
    }

    /* renamed from: t */
    public short mo24709t() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        return (short) ((bArr[i3] & 255) | i2);
    }

    /* renamed from: u */
    public int mo24710u() {
        return (mo24711v() << 21) | (mo24711v() << 14) | (mo24711v() << 7) | mo24711v();
    }

    /* renamed from: v */
    public int mo24711v() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: w */
    public int mo24712w() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        byte b = (bArr[i3] & 255) | i2;
        this.f22334b += 2;
        return b;
    }

    /* renamed from: x */
    public long mo24713x() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        int i2 = this.f22334b;
        this.f22334b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        return j3 | (255 & ((long) bArr[i4]));
    }

    /* renamed from: y */
    public int mo24714y() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        this.f22334b = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        int i3 = this.f22334b;
        this.f22334b = i3 + 1;
        byte b = i2 | ((bArr[i3] & 255) << 8);
        int i4 = this.f22334b;
        this.f22334b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: z */
    public int mo24715z() {
        int i = mo24698i();
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo24684a(byte[] bArr, int i) {
        this.f22333a = bArr;
        this.f22335c = i;
        this.f22334b = 0;
    }

    /* renamed from: b */
    public String mo24687b(int i) {
        return mo24681a(i, Charset.forName(Utf8Charset.NAME));
    }

    /* renamed from: c */
    public int mo24688c() {
        return this.f22334b;
    }

    /* renamed from: d */
    public void mo24691d(int i) {
        Assertions.checkArgument(i >= 0 && i <= this.f22333a.length);
        this.f22335c = i;
    }

    /* renamed from: f */
    public int mo24694f() {
        return this.f22333a[this.f22334b] & 255;
    }

    public C9572w(int i) {
        this.f22333a = new byte[i];
        this.f22335c = i;
    }

    /* renamed from: e */
    public char mo24692e() {
        byte[] bArr = this.f22333a;
        int i = this.f22334b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: a */
    public int mo24679a() {
        return this.f22335c - this.f22334b;
    }

    public C9572w(byte[] bArr) {
        this.f22333a = bArr;
        this.f22335c = bArr.length;
    }

    /* renamed from: a */
    public void mo24682a(C9571v vVar, int i) {
        mo24685a(vVar.f22329a, 0, i);
        vVar.mo24667b(0);
    }

    /* renamed from: a */
    public void mo24685a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f22333a, this.f22334b, bArr, i, i2);
        this.f22334b += i2;
    }

    public C9572w(byte[] bArr, int i) {
        this.f22333a = bArr;
        this.f22335c = i;
    }

    /* renamed from: a */
    public String mo24681a(int i, Charset charset) {
        String str = new String(this.f22333a, this.f22334b, i, charset);
        this.f22334b += i;
        return str;
    }

    /* renamed from: a */
    public String mo24680a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f22334b + i) - 1;
        String a = Util.m29400a(this.f22333a, this.f22334b, (i2 >= this.f22335c || this.f22333a[i2] != 0) ? i : i - 1);
        this.f22334b += i;
        return a;
    }
}
