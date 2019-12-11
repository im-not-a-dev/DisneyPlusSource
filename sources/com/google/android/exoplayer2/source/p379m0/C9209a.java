package com.google.android.exoplayer2.source.p379m0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;

/* renamed from: com.google.android.exoplayer2.source.m0.a */
/* compiled from: BaseMediaChunk */
public abstract class C9209a extends C9224l {

    /* renamed from: j */
    public final long f20849j;

    /* renamed from: k */
    public final long f20850k;

    /* renamed from: l */
    private C9211c f20851l;

    /* renamed from: m */
    private int[] f20852m;

    public C9209a(DataSource dataSource, DataSpec dataSpec, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j5);
        this.f20849j = j3;
        this.f20850k = j4;
    }

    /* renamed from: a */
    public void mo23928a(C9211c cVar) {
        this.f20851l = cVar;
        this.f20852m = cVar.mo23933a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C9211c mo23929h() {
        return this.f20851l;
    }

    /* renamed from: a */
    public final int mo23927a(int i) {
        return this.f20852m[i];
    }
}
