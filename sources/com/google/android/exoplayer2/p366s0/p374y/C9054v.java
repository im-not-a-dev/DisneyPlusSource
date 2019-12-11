package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.y.v */
/* compiled from: NalUnitTargetBuffer */
final class C9054v {

    /* renamed from: a */
    private final int f20085a;

    /* renamed from: b */
    private boolean f20086b;

    /* renamed from: c */
    private boolean f20087c;

    /* renamed from: d */
    public byte[] f20088d;

    /* renamed from: e */
    public int f20089e;

    public C9054v(int i, int i2) {
        this.f20085a = i;
        this.f20088d = new byte[(i2 + 3)];
        this.f20088d[2] = 1;
    }

    /* renamed from: a */
    public boolean mo23466a() {
        return this.f20087c;
    }

    /* renamed from: b */
    public void mo23468b() {
        this.f20086b = false;
        this.f20087c = false;
    }

    /* renamed from: a */
    public void mo23465a(byte[] bArr, int i, int i2) {
        if (this.f20086b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f20088d;
            int length = bArr2.length;
            int i4 = this.f20089e;
            if (length < i4 + i3) {
                this.f20088d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f20088d, this.f20089e, i3);
            this.f20089e += i3;
        }
    }

    /* renamed from: b */
    public void mo23469b(int i) {
        boolean z = true;
        Assertions.checkState(!this.f20086b);
        if (i != this.f20085a) {
            z = false;
        }
        this.f20086b = z;
        if (this.f20086b) {
            this.f20089e = 3;
            this.f20087c = false;
        }
    }

    /* renamed from: a */
    public boolean mo23467a(int i) {
        if (!this.f20086b) {
            return false;
        }
        this.f20089e -= i;
        this.f20086b = false;
        this.f20087c = true;
        return true;
    }
}
