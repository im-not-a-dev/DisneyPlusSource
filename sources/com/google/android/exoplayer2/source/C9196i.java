package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;

/* renamed from: com.google.android.exoplayer2.source.i */
/* compiled from: lambda */
public final /* synthetic */ class C9196i implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20814U;

    /* renamed from: V */
    private final /* synthetic */ LoadEventInfo f20815V;

    /* renamed from: W */
    private final /* synthetic */ MediaLoadData f20816W;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20817c;

    public /* synthetic */ C9196i(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        this.f20817c = aVar;
        this.f20814U = mediaSourceEventListener;
        this.f20815V = loadEventInfo;
        this.f20816W = mediaLoadData;
    }

    public final void run() {
        this.f20817c.mo23528c(this.f20814U, this.f20815V, this.f20816W);
    }
}
