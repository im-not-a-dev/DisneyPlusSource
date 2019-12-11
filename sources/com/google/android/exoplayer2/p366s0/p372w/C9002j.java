package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.p393v0.Assertions;

/* renamed from: com.google.android.exoplayer2.s0.w.j */
/* compiled from: VorbisBitArray */
final class C9002j {

    /* renamed from: a */
    private final byte[] f19761a;

    /* renamed from: b */
    private final int f19762b;

    /* renamed from: c */
    private int f19763c;

    /* renamed from: d */
    private int f19764d;

    public C9002j(byte[] bArr) {
        this.f19761a = bArr;
        this.f19762b = bArr.length;
    }

    /* renamed from: c */
    private void m26586c() {
        boolean z;
        int i = this.f19763c;
        if (i >= 0) {
            int i2 = this.f19762b;
            if (i < i2 || (i == i2 && this.f19764d == 0)) {
                z = true;
                Assertions.checkState(z);
            }
        }
        z = false;
        Assertions.checkState(z);
    }

    /* renamed from: a */
    public int mo23419a(int i) {
        int i2 = this.f19763c;
        int min = Math.min(i, 8 - this.f19764d);
        int i3 = i2 + 1;
        int i4 = ((this.f19761a[i2] & 255) >> this.f19764d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f19761a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo23420b(i);
        return i5;
    }

    /* renamed from: b */
    public boolean mo23421b() {
        boolean z = (((this.f19761a[this.f19763c] & 255) >> this.f19764d) & 1) == 1;
        mo23420b(1);
        return z;
    }

    /* renamed from: b */
    public void mo23420b(int i) {
        int i2 = i / 8;
        this.f19763c += i2;
        this.f19764d += i - (i2 * 8);
        int i3 = this.f19764d;
        if (i3 > 7) {
            this.f19763c++;
            this.f19764d = i3 - 8;
        }
        m26586c();
    }

    /* renamed from: a */
    public int mo23418a() {
        return (this.f19763c * 8) + this.f19764d;
    }
}
