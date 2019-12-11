package com.google.android.exoplayer2.util;

/* renamed from: com.google.android.exoplayer2.v0.x */
/* compiled from: ParsableNalUnitBitArray */
public final class C9573x {

    /* renamed from: a */
    private byte[] f22336a;

    /* renamed from: b */
    private int f22337b;

    /* renamed from: c */
    private int f22338c;

    /* renamed from: d */
    private int f22339d;

    public C9573x(byte[] bArr, int i, int i2) {
        mo24716a(bArr, i, i2);
    }

    /* renamed from: f */
    private void m29590f() {
        boolean z;
        int i = this.f22338c;
        if (i >= 0) {
            int i2 = this.f22337b;
            if (i < i2 || (i == i2 && this.f22339d == 0)) {
                z = true;
                Assertions.checkState(z);
            }
        }
        z = false;
        Assertions.checkState(z);
    }

    /* renamed from: g */
    private int m29591g() {
        int i = 0;
        int i2 = 0;
        while (!mo24720b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo24719b(i2);
        }
        return i3 + i;
    }

    /* renamed from: a */
    public void mo24716a(byte[] bArr, int i, int i2) {
        this.f22336a = bArr;
        this.f22338c = i;
        this.f22337b = i2;
        this.f22339d = 0;
        m29590f();
    }

    /* renamed from: b */
    public boolean mo24720b() {
        boolean z = (this.f22336a[this.f22338c] & (128 >> this.f22339d)) != 0;
        mo24724e();
        return z;
    }

    /* renamed from: c */
    public void mo24722c(int i) {
        int i2 = this.f22338c;
        int i3 = i / 8;
        this.f22338c = i2 + i3;
        this.f22339d += i - (i3 * 8);
        int i4 = this.f22339d;
        if (i4 > 7) {
            this.f22338c++;
            this.f22339d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f22338c) {
                m29590f();
                return;
            } else if (m29589d(i2)) {
                this.f22338c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: d */
    public int mo24723d() {
        return m29591g();
    }

    /* renamed from: e */
    public void mo24724e() {
        int i = 1;
        int i2 = this.f22339d + 1;
        this.f22339d = i2;
        if (i2 == 8) {
            this.f22339d = 0;
            int i3 = this.f22338c;
            if (m29589d(i3 + 1)) {
                i = 2;
            }
            this.f22338c = i3 + i;
        }
        m29590f();
    }

    /* renamed from: d */
    private boolean m29589d(int i) {
        if (2 <= i && i < this.f22337b) {
            byte[] bArr = this.f22336a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public int mo24719b(int i) {
        int i2;
        int i3;
        this.f22339d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f22339d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            this.f22339d = i2 - 8;
            byte[] bArr = this.f22336a;
            int i5 = this.f22338c;
            i4 |= (bArr[i5] & 255) << this.f22339d;
            if (!m29589d(i5 + 1)) {
                i3 = 1;
            }
            this.f22338c = i5 + i3;
        }
        byte[] bArr2 = this.f22336a;
        int i6 = this.f22338c;
        int i7 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f22339d = 0;
            if (!m29589d(i6 + 1)) {
                i3 = 1;
            }
            this.f22338c = i6 + i3;
        }
        m29590f();
        return i7;
    }

    /* renamed from: a */
    public boolean mo24718a(int i) {
        int i2 = this.f22338c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f22339d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f22337b) {
                int i6 = this.f22337b;
            } else if (m29589d(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f22337b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo24717a() {
        int i = this.f22338c;
        int i2 = this.f22339d;
        int i3 = 0;
        while (this.f22338c < this.f22337b && !mo24720b()) {
            i3++;
        }
        boolean z = this.f22338c == this.f22337b;
        this.f22338c = i;
        this.f22339d = i2;
        if (z || !mo24718a((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public int mo24721c() {
        int g = m29591g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }
}
