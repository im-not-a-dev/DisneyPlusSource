package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;

/* renamed from: com.google.android.exoplayer2.source.e */
/* compiled from: lambda */
public final /* synthetic */ class C9136e implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20496U;

    /* renamed from: V */
    private final /* synthetic */ MediaLoadData f20497V;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20498c;

    public /* synthetic */ C9136e(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
        this.f20498c = aVar;
        this.f20496U = mediaSourceEventListener;
        this.f20497V = mediaLoadData;
    }

    public final void run() {
        this.f20498c.mo23511a(this.f20496U, this.f20497V);
    }
}
