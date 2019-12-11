package com.google.android.exoplayer2.ext.okhttp;

import com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource.Factory;
import com.google.android.exoplayer2.upstream.TransferListener;
import okhttp3.CacheControl;
import okhttp3.Call.Factory;

/* renamed from: com.google.android.exoplayer2.r0.b.b */
/* compiled from: OkHttpDataSourceFactory */
public final class OkHttpDataSourceFactory extends BaseFactory {

    /* renamed from: b */
    private final Factory f19089b;

    /* renamed from: c */
    private final String f19090c;

    /* renamed from: d */
    private final TransferListener f19091d;

    /* renamed from: e */
    private final CacheControl f19092e;

    public OkHttpDataSourceFactory(Factory aVar, String str, TransferListener transferListener, CacheControl cacheControl) {
        this.f19089b = aVar;
        this.f19090c = str;
        this.f19091d = transferListener;
        this.f19092e = cacheControl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public OkHttpDataSource createDataSourceInternal(Factory eVar) {
        OkHttpDataSource aVar = new OkHttpDataSource(this.f19089b, this.f19090c, null, this.f19092e, eVar);
        TransferListener transferListener = this.f19091d;
        if (transferListener != null) {
            aVar.addTransferListener(transferListener);
        }
        return aVar;
    }
}
