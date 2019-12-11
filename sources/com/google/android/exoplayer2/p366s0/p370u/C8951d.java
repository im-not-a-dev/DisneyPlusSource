package com.google.android.exoplayer2.p366s0.p370u;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.p359j.C8776k;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8923p;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.s0.u.d */
/* compiled from: MlltSeeker */
final class C8951d implements C8953a {

    /* renamed from: a */
    private final long[] f19356a;

    /* renamed from: b */
    private final long[] f19357b;

    /* renamed from: c */
    private final long f19358c;

    private C8951d(long[] jArr, long[] jArr2) {
        this.f19356a = jArr;
        this.f19357b = jArr2;
        this.f19358c = C.msToUs(jArr2[jArr2.length - 1]);
    }

    /* renamed from: a */
    public static C8951d m26317a(long j, C8776k kVar) {
        int length = kVar.f18633X.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j2 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (kVar.f18631V + kVar.f18633X[i3]);
            j2 += (long) (kVar.f18632W + kVar.f18634Y[i3]);
            jArr[i2] = j;
            jArr2[i2] = j2;
        }
        return new C8951d(jArr, jArr2);
    }

    /* renamed from: b */
    public long mo23361b() {
        return -1;
    }

    /* renamed from: b */
    public C8921a mo23277b(long j) {
        Pair a = m26316a(C.usToMs(Util.m29431b(j, 0, this.f19358c)), this.f19357b, this.f19356a);
        return new C8921a(new C8923p(C.msToUs(((Long) a.first).longValue()), ((Long) a.second).longValue()));
    }

    /* renamed from: c */
    public boolean mo23279c() {
        return true;
    }

    /* renamed from: d */
    public long mo23280d() {
        return this.f19358c;
    }

    /* renamed from: a */
    public long mo23360a(long j) {
        return C.msToUs(((Long) m26316a(j, this.f19356a, this.f19357b).second).longValue());
    }

    /* renamed from: a */
    private static Pair<Long, Long> m26316a(long j, long[] jArr, long[] jArr2) {
        int b = Util.m29429b(jArr, j, true, true);
        long j2 = jArr[b];
        long j3 = jArr2[b];
        int i = b + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }
}
