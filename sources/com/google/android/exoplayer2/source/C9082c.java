package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;

/* renamed from: com.google.android.exoplayer2.source.c */
/* compiled from: lambda */
public final /* synthetic */ class C9082c implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20241U;

    /* renamed from: V */
    private final /* synthetic */ LoadEventInfo f20242V;

    /* renamed from: W */
    private final /* synthetic */ MediaLoadData f20243W;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20244c;

    public /* synthetic */ C9082c(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f20244c = aVar;
        this.f20241U = mediaSourceEventListener;
        this.f20242V = loadEventInfo;
        this.f20243W = mediaLoadData;
    }

    public final void run() {
        this.f20244c.mo23509a(this.f20241U, this.f20242V, this.f20243W);
    }
}
