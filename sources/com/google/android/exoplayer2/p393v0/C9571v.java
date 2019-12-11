package com.google.android.exoplayer2.p393v0;

/* renamed from: com.google.android.exoplayer2.v0.v */
/* compiled from: ParsableBitArray */
public final class C9571v {

    /* renamed from: a */
    public byte[] f22329a;

    /* renamed from: b */
    private int f22330b;

    /* renamed from: c */
    private int f22331c;

    /* renamed from: d */
    private int f22332d;

    public C9571v() {
        this.f22329a = C9554k0.f22286f;
    }

    /* renamed from: g */
    private void m29531g() {
        boolean z;
        int i = this.f22330b;
        if (i >= 0) {
            int i2 = this.f22332d;
            if (i < i2 || (i == i2 && this.f22331c == 0)) {
                z = true;
                C9537e.m29301b(z);
            }
        }
        z = false;
        C9537e.m29301b(z);
    }

    /* renamed from: a */
    public void mo24663a(byte[] bArr) {
        mo24664a(bArr, bArr.length);
    }

    /* renamed from: b */
    public void mo24667b(int i) {
        this.f22330b = i / 8;
        this.f22331c = i - (this.f22330b * 8);
        m29531g();
    }

    /* renamed from: c */
    public int mo24669c() {
        C9537e.m29301b(this.f22331c == 0);
        return this.f22330b;
    }

    /* renamed from: d */
    public int mo24671d() {
        return (this.f22330b * 8) + this.f22331c;
    }

    /* renamed from: e */
    public boolean mo24673e() {
        boolean z = (this.f22329a[this.f22330b] & (128 >> this.f22331c)) != 0;
        mo24674f();
        return z;
    }

    /* renamed from: f */
    public void mo24674f() {
        int i = this.f22331c + 1;
        this.f22331c = i;
        if (i == 8) {
            this.f22331c = 0;
            this.f22330b++;
        }
        m29531g();
    }

    /* renamed from: a */
    public void mo24662a(C9572w wVar) {
        mo24664a(wVar.f22333a, wVar.mo24690d());
        mo24667b(wVar.mo24688c() * 8);
    }

    /* renamed from: d */
    public void mo24672d(int i) {
        C9537e.m29301b(this.f22331c == 0);
        this.f22330b += i;
        m29531g();
    }

    public C9571v(byte[] bArr) {
        this(bArr, bArr.length);
    }

    /* renamed from: c */
    public void mo24670c(int i) {
        int i2 = i / 8;
        this.f22330b += i2;
        this.f22331c += i - (i2 * 8);
        int i3 = this.f22331c;
        if (i3 > 7) {
            this.f22330b++;
            this.f22331c = i3 - 8;
        }
        m29531g();
    }

    public C9571v(byte[] bArr, int i) {
        this.f22329a = bArr;
        this.f22332d = i;
    }

    /* renamed from: a */
    public void mo24664a(byte[] bArr, int i) {
        this.f22329a = bArr;
        this.f22330b = 0;
        this.f22331c = 0;
        this.f22332d = i;
    }

    /* renamed from: b */
    public void mo24666b() {
        if (this.f22331c != 0) {
            this.f22331c = 0;
            this.f22330b++;
            m29531g();
        }
    }

    /* renamed from: a */
    public int mo24659a() {
        return ((this.f22332d - this.f22330b) * 8) - this.f22331c;
    }

    /* renamed from: b */
    public void mo24668b(byte[] bArr, int i, int i2) {
        C9537e.m29301b(this.f22331c == 0);
        System.arraycopy(this.f22329a, this.f22330b, bArr, i, i2);
        this.f22330b += i2;
        m29531g();
    }

    /* renamed from: a */
    public int mo24660a(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f22331c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f22331c;
            if (i2 <= 8) {
                break;
            }
            this.f22331c = i2 - 8;
            byte[] bArr = this.f22329a;
            int i4 = this.f22330b;
            this.f22330b = i4 + 1;
            i3 |= (bArr[i4] & 255) << this.f22331c;
        }
        byte[] bArr2 = this.f22329a;
        int i5 = this.f22330b;
        int i6 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f22331c = 0;
            this.f22330b = i5 + 1;
        }
        m29531g();
        return i6;
    }

    /* renamed from: a */
    public void mo24665a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f22329a;
            int i4 = this.f22330b;
            this.f22330b = i4 + 1;
            byte b = bArr2[i4];
            int i5 = this.f22331c;
            bArr[i] = (byte) (b << i5);
            bArr[i] = (byte) (((255 & bArr2[this.f22330b]) >> (8 - i5)) | bArr[i]);
            i++;
        }
        int i6 = i2 & 7;
        if (i6 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i6));
            int i7 = this.f22331c;
            if (i7 + i6 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f22329a;
                int i8 = this.f22330b;
                this.f22330b = i8 + 1;
                bArr[i3] = (byte) (b2 | ((bArr3[i8] & 255) << i7));
                this.f22331c = i7 - 8;
            }
            this.f22331c += i6;
            byte[] bArr4 = this.f22329a;
            int i9 = this.f22330b;
            byte b3 = bArr4[i9] & 255;
            int i10 = this.f22331c;
            bArr[i3] = (byte) (((byte) ((b3 >> (8 - i10)) << (8 - i6))) | bArr[i3]);
            if (i10 == 8) {
                this.f22331c = 0;
                this.f22330b = i9 + 1;
            }
            m29531g();
        }
    }

    /* renamed from: a */
    public void mo24661a(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f22331c, i2);
        int i3 = this.f22331c;
        int i4 = (8 - i3) - min;
        byte b = (65280 >> i3) | ((1 << i4) - 1);
        byte[] bArr = this.f22329a;
        int i5 = this.f22330b;
        bArr[i5] = (byte) (b & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            int i8 = i7 + 1;
            this.f22329a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7 = i8;
        }
        int i9 = 8 - i6;
        byte[] bArr2 = this.f22329a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i9) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i9) | bArr2[i7]);
        mo24670c(i2);
        m29531g();
    }
}
