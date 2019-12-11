package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.b */
/* compiled from: lambda */
public final /* synthetic */ class C9074b implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20173U;

    /* renamed from: V */
    private final /* synthetic */ LoadEventInfo f20174V;

    /* renamed from: W */
    private final /* synthetic */ MediaLoadData f20175W;

    /* renamed from: X */
    private final /* synthetic */ IOException f20176X;

    /* renamed from: Y */
    private final /* synthetic */ boolean f20177Y;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20178c;

    public /* synthetic */ C9074b(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f20178c = aVar;
        this.f20173U = mediaSourceEventListener;
        this.f20174V = loadEventInfo;
        this.f20175W = mediaLoadData;
        this.f20176X = iOException;
        this.f20177Y = z;
    }

    public final void run() {
        this.f20178c.mo23510a(this.f20173U, this.f20174V, this.f20175W, this.f20176X, this.f20177Y);
    }
}
