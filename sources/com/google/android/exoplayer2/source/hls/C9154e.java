package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSource.DataSource;

/* renamed from: com.google.android.exoplayer2.source.hls.e */
/* compiled from: DefaultHlsDataSourceFactory */
public final class C9154e implements HlsDataSourceFactory {

    /* renamed from: a */
    private final DataSource f20562a;

    public C9154e(DataSource aVar) {
        this.f20562a = aVar;
    }

    public DataSource createDataSource(int i) {
        return this.f20562a.mo24448a();
    }
}
