package com.bamtech.sdk4.internal.media.adapters.exoplayer;

import com.bamtech.sdk4.media.drm.SilkDrmProvider;
import com.google.android.exoplayer2.source.hls.C9162h;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.Factory;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/media/adapters/exoplayer/BamHttpDataSourceFactory;", "Lcom/google/android/exoplayer2/source/hls/HlsDataSourceFactory;", "drmProvider", "Lcom/bamtech/sdk4/media/drm/SilkDrmProvider;", "segmentDataSourceFactory", "Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;", "manifestDataSourceFactory", "(Lcom/bamtech/sdk4/media/drm/SilkDrmProvider;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;)V", "createDataSource", "Lcom/google/android/exoplayer2/upstream/DataSource;", "dataType", "", "playeradapter-exoplayer-2.10.1_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: BamHttpDataSourceFactory.kt */
public final class BamHttpDataSourceFactory implements C9162h {
    private final SilkDrmProvider drmProvider;
    private final Factory manifestDataSourceFactory;
    private final Factory segmentDataSourceFactory;

    public BamHttpDataSourceFactory(SilkDrmProvider silkDrmProvider, Factory factory, Factory factory2) {
        this.drmProvider = silkDrmProvider;
        this.segmentDataSourceFactory = factory;
        this.manifestDataSourceFactory = factory2;
    }

    public DataSource createDataSource(int i) {
        if (i == 3) {
            return new KeyRequestDataSource(this.drmProvider);
        }
        if (i != 4) {
            HttpDataSource a = this.segmentDataSourceFactory.mo24448a();
            C12880j.m40222a((Object) a, "segmentDataSourceFactory.createDataSource()");
            return a;
        }
        HttpDataSource a2 = this.manifestDataSourceFactory.mo24448a();
        C12880j.m40222a((Object) a2, "manifestDataSourceFactory.createDataSource()");
        return a2;
    }
}
