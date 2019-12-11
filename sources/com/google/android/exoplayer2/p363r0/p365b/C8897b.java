package com.google.android.exoplayer2.p363r0.p365b;

import com.google.android.exoplayer2.upstream.HttpDataSource.C9436a;
import com.google.android.exoplayer2.upstream.HttpDataSource.C9440e;
import com.google.android.exoplayer2.upstream.TransferListener;
import okhttp3.CacheControl;
import okhttp3.Call.C14111a;

/* renamed from: com.google.android.exoplayer2.r0.b.b */
/* compiled from: OkHttpDataSourceFactory */
public final class C8897b extends C9436a {

    /* renamed from: b */
    private final C14111a f19089b;

    /* renamed from: c */
    private final String f19090c;

    /* renamed from: d */
    private final TransferListener f19091d;

    /* renamed from: e */
    private final CacheControl f19092e;

    public C8897b(C14111a aVar, String str, TransferListener transferListener, CacheControl cacheControl) {
        this.f19089b = aVar;
        this.f19090c = str;
        this.f19091d = transferListener;
        this.f19092e = cacheControl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C8896a m26063a(C9440e eVar) {
        C8896a aVar = new C8896a(this.f19089b, this.f19090c, null, this.f19092e, eVar);
        TransferListener transferListener = this.f19091d;
        if (transferListener != null) {
            aVar.addTransferListener(transferListener);
        }
        return aVar;
    }
}
