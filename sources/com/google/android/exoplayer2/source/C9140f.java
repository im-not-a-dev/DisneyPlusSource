package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;

/* renamed from: com.google.android.exoplayer2.source.f */
/* compiled from: lambda */
public final /* synthetic */ class C9140f implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20519U;

    /* renamed from: V */
    private final /* synthetic */ LoadEventInfo f20520V;

    /* renamed from: W */
    private final /* synthetic */ MediaLoadData f20521W;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20522c;

    public /* synthetic */ C9140f(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f20522c = aVar;
        this.f20519U = mediaSourceEventListener;
        this.f20520V = loadEventInfo;
        this.f20521W = mediaLoadData;
    }

    public final void run() {
        this.f20522c.mo23522b(this.f20519U, this.f20520V, this.f20521W);
    }
}
