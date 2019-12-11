package com.google.android.exoplayer2.p393v0;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.v0.r */
/* compiled from: LongArray */
public final class C9564r {

    /* renamed from: a */
    private int f22303a;

    /* renamed from: b */
    private long[] f22304b;

    public C9564r() {
        this(32);
    }

    /* renamed from: a */
    public void mo24657a(long j) {
        int i = this.f22303a;
        long[] jArr = this.f22304b;
        if (i == jArr.length) {
            this.f22304b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f22304b;
        int i2 = this.f22303a;
        this.f22303a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long[] mo24658b() {
        return Arrays.copyOf(this.f22304b, this.f22303a);
    }

    public C9564r(int i) {
        this.f22304b = new long[i];
    }

    /* renamed from: a */
    public long mo24656a(int i) {
        if (i >= 0 && i < this.f22303a) {
            return this.f22304b[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(this.f22303a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public int mo24655a() {
        return this.f22303a;
    }
}
