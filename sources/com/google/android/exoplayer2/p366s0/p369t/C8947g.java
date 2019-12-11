package com.google.android.exoplayer2.p366s0.p369t;

import com.google.android.exoplayer2.p366s0.C8913h;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.t.g */
/* compiled from: VarintReader */
final class C8947g {

    /* renamed from: d */
    private static final long[] f19350d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f19351a = new byte[8];

    /* renamed from: b */
    private int f19352b;

    /* renamed from: c */
    private int f19353c;

    /* renamed from: a */
    public long mo23358a(C8913h hVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f19352b == 0) {
            if (!hVar.mo23291a(this.f19351a, 0, 1, z)) {
                return -1;
            }
            this.f19353c = m26307a(this.f19351a[0] & 255);
            if (this.f19353c != -1) {
                this.f19352b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f19353c;
        if (i2 > i) {
            this.f19352b = 0;
            return -2;
        }
        if (i2 != 1) {
            hVar.mo23289a(this.f19351a, 1, i2 - 1);
        }
        this.f19352b = 0;
        return m26308a(this.f19351a, this.f19353c, z2);
    }

    /* renamed from: b */
    public void mo23359b() {
        this.f19352b = 0;
        this.f19353c = 0;
    }

    /* renamed from: a */
    public int mo23357a() {
        return this.f19353c;
    }

    /* renamed from: a */
    public static int m26307a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f19350d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public static long m26308a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f19350d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
