package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

/* renamed from: com.google.android.exoplayer2.source.m0.l */
/* compiled from: MediaChunk */
public abstract class C9224l extends C9212d {

    /* renamed from: i */
    public final long f20922i;

    public C9224l(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3) {
        super(dataSource, dataSpec, 1, format, i, obj, j, j2);
        Assertions.checkNotNull(format);
        this.f20922i = j3;
    }

    /* renamed from: f */
    public long mo23956f() {
        long j = this.f20922i;
        if (j != -1) {
            return 1 + j;
        }
        return -1;
    }

    /* renamed from: g */
    public abstract boolean mo23818g();
}
