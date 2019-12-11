package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p393v0.Assertions;

public final class SeekParameters {

    /* renamed from: c */
    public static final SeekParameters f18389c = new SeekParameters(0, 0);

    /* renamed from: d */
    public static final SeekParameters f18390d = f18389c;

    /* renamed from: a */
    public final long f18391a;

    /* renamed from: b */
    public final long f18392b;

    static {
        new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        new SeekParameters(Long.MAX_VALUE, 0);
        new SeekParameters(0, Long.MAX_VALUE);
    }

    public SeekParameters(long j, long j2) {
        boolean z = true;
        Assertions.m29299a(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        Assertions.m29299a(z);
        this.f18391a = j;
        this.f18392b = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekParameters.class != obj.getClass()) {
            return false;
        }
        SeekParameters seekParameters = (SeekParameters) obj;
        if (!(this.f18391a == seekParameters.f18391a && this.f18392b == seekParameters.f18392b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.f18391a) * 31) + ((int) this.f18392b);
    }
}
