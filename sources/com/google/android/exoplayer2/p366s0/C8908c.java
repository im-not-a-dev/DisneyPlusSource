package com.google.android.exoplayer2.p366s0;

import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p393v0.Util;

/* renamed from: com.google.android.exoplayer2.s0.c */
/* compiled from: ConstantBitrateSeekMap */
public class C8908c implements C8920o {

    /* renamed from: a */
    private final long f19122a;

    /* renamed from: b */
    private final long f19123b;

    /* renamed from: c */
    private final int f19124c;

    /* renamed from: d */
    private final long f19125d;

    /* renamed from: e */
    private final int f19126e;

    /* renamed from: f */
    private final long f19127f;

    public C8908c(long j, long j2, int i, int i2) {
        this.f19122a = j;
        this.f19123b = j2;
        if (i2 == -1) {
            i2 = 1;
        }
        this.f19124c = i2;
        this.f19126e = i;
        if (j == -1) {
            this.f19125d = -1;
            this.f19127f = -9223372036854775807L;
            return;
        }
        this.f19125d = j - j2;
        this.f19127f = m26117a(j, j2, i);
    }

    /* renamed from: a */
    private static long m26117a(long j, long j2, int i) {
        return ((Math.max(0, j - j2) * 8) * 1000000) / ((long) i);
    }

    /* renamed from: b */
    public C8921a mo23277b(long j) {
        if (this.f19125d == -1) {
            return new C8921a(new C8923p(0, this.f19123b));
        }
        long d = m26118d(j);
        long c = mo23286c(d);
        C8923p pVar = new C8923p(c, d);
        if (c < j) {
            int i = this.f19124c;
            if (((long) i) + d < this.f19122a) {
                long j2 = d + ((long) i);
                return new C8921a(pVar, new C8923p(mo23286c(j2), j2));
            }
        }
        return new C8921a(pVar);
    }

    /* renamed from: c */
    public boolean mo23279c() {
        return this.f19125d != -1;
    }

    /* renamed from: d */
    public long mo23280d() {
        return this.f19127f;
    }

    /* renamed from: d */
    private long m26118d(long j) {
        long j2 = (j * ((long) this.f19126e)) / 8000000;
        int i = this.f19124c;
        return this.f19123b + Util.m29431b((j2 / ((long) i)) * ((long) i), 0, this.f19125d - ((long) i));
    }

    /* renamed from: c */
    public long mo23286c(long j) {
        return m26117a(j, this.f19123b, this.f19126e);
    }
}
