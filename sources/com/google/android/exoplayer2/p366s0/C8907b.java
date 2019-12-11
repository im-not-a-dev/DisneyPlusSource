package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.b */
/* compiled from: ChunkIndex */
public final class C8907b implements C8920o {

    /* renamed from: a */
    public final int f19116a;

    /* renamed from: b */
    public final int[] f19117b;

    /* renamed from: c */
    public final long[] f19118c;

    /* renamed from: d */
    public final long[] f19119d;

    /* renamed from: e */
    public final long[] f19120e;

    /* renamed from: f */
    private final long f19121f;

    public C8907b(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f19117b = iArr;
        this.f19118c = jArr;
        this.f19119d = jArr2;
        this.f19120e = jArr3;
        this.f19116a = iArr.length;
        int i = this.f19116a;
        if (i > 0) {
            this.f19121f = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.f19121f = 0;
        }
    }

    /* renamed from: b */
    public C8921a mo23277b(long j) {
        int c = mo23284c(j);
        C8923p pVar = new C8923p(this.f19120e[c], this.f19118c[c]);
        if (pVar.f19169a >= j || c == this.f19116a - 1) {
            return new C8921a(pVar);
        }
        int i = c + 1;
        return new C8921a(pVar, new C8923p(this.f19120e[i], this.f19118c[i]));
    }

    /* renamed from: c */
    public int mo23284c(long j) {
        return Util.m29429b(this.f19120e, j, true, true);
    }

    /* renamed from: c */
    public boolean mo23279c() {
        return true;
    }

    /* renamed from: d */
    public long mo23280d() {
        return this.f19121f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChunkIndex(length=");
        sb.append(this.f19116a);
        sb.append(", sizes=");
        sb.append(Arrays.toString(this.f19117b));
        sb.append(", offsets=");
        sb.append(Arrays.toString(this.f19118c));
        sb.append(", timeUs=");
        sb.append(Arrays.toString(this.f19120e));
        sb.append(", durationsUs=");
        sb.append(Arrays.toString(this.f19119d));
        sb.append(")");
        return sb.toString();
    }
}
