package com.google.android.exoplayer2.p366s0.p370u;

import com.google.android.exoplayer2.p366s0.C8918m;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8923p;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.Log;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.u.g */
/* compiled from: XingSeeker */
final class C8955g implements C8953a {

    /* renamed from: a */
    private final long f19382a;

    /* renamed from: b */
    private final int f19383b;

    /* renamed from: c */
    private final long f19384c;

    /* renamed from: d */
    private final long f19385d;

    /* renamed from: e */
    private final long f19386e;

    /* renamed from: f */
    private final long[] f19387f;

    private C8955g(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    /* renamed from: a */
    public static C8955g m26347a(long j, long j2, C8918m mVar, C9572w wVar) {
        long j3 = j;
        C8918m mVar2 = mVar;
        int i = mVar2.f19162g;
        int i2 = mVar2.f19159d;
        int i3 = wVar.mo24698i();
        if ((i3 & 1) == 1) {
            int z = wVar.mo24715z();
            if (z != 0) {
                long c = Util.m29439c((long) z, ((long) i) * 1000000, (long) i2);
                if ((i3 & 6) != 6) {
                    C8955g gVar = new C8955g(j2, mVar2.f19158c, c);
                    return gVar;
                }
                long z2 = (long) wVar.mo24715z();
                long[] jArr = new long[100];
                for (int i4 = 0; i4 < 100; i4++) {
                    jArr[i4] = (long) wVar.mo24711v();
                }
                if (j3 != -1) {
                    long j4 = j2 + z2;
                    if (j3 != j4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("XING data size mismatch: ");
                        sb.append(j3);
                        sb.append(", ");
                        sb.append(j4);
                        Log.m29500d("XingSeeker", sb.toString());
                    }
                }
                C8955g gVar2 = new C8955g(j2, mVar2.f19158c, c, z2, jArr);
                return gVar2;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C8921a mo23277b(long j) {
        double d;
        if (!mo23279c()) {
            return new C8921a(new C8923p(0, this.f19382a + ((long) this.f19383b)));
        }
        long b = Util.m29431b(j, 0, this.f19384c);
        double d2 = (((double) b) * 100.0d) / ((double) this.f19384c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.f19387f;
                Assertions.checkNotNull(jArr);
                long[] jArr2 = jArr;
                double d4 = (double) jArr2[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr2[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        return new C8921a(new C8923p(b, this.f19382a + Util.m29431b(Math.round((d3 / 256.0d) * ((double) this.f19385d)), (long) this.f19383b, this.f19385d - 1)));
    }

    /* renamed from: c */
    public boolean mo23279c() {
        return this.f19387f != null;
    }

    /* renamed from: d */
    public long mo23280d() {
        return this.f19384c;
    }

    private C8955g(long j, int i, long j2, long j3, long[] jArr) {
        this.f19382a = j;
        this.f19383b = i;
        this.f19384c = j2;
        this.f19387f = jArr;
        this.f19385d = j3;
        long j4 = -1;
        if (j3 != -1) {
            j4 = j + j3;
        }
        this.f19386e = j4;
    }

    /* renamed from: a */
    public long mo23360a(long j) {
        long j2;
        long j3 = j - this.f19382a;
        if (!mo23279c() || j3 <= ((long) this.f19383b)) {
            return 0;
        }
        long[] jArr = this.f19387f;
        Assertions.checkNotNull(jArr);
        long[] jArr2 = jArr;
        double d = (((double) j3) * 256.0d) / ((double) this.f19385d);
        int b = Util.m29429b(jArr2, (long) d, true, true);
        long a = m26346a(b);
        long j4 = jArr2[b];
        int i = b + 1;
        long a2 = m26346a(i);
        if (b == 99) {
            j2 = 256;
        } else {
            j2 = jArr2[i];
        }
        return a + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (a2 - a)));
    }

    /* renamed from: b */
    public long mo23361b() {
        return this.f19386e;
    }

    /* renamed from: a */
    private long m26346a(int i) {
        return (this.f19384c * ((long) i)) / 100;
    }
}
