package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;
import com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData;

/* renamed from: com.google.android.exoplayer2.source.d */
/* compiled from: lambda */
public final /* synthetic */ class C9084d implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20255U;

    /* renamed from: V */
    private final /* synthetic */ MediaPeriodId f20256V;

    /* renamed from: W */
    private final /* synthetic */ MediaLoadData f20257W;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20258c;

    public /* synthetic */ C9084d(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        this.f20258c = aVar;
        this.f20255U = mediaSourceEventListener;
        this.f20256V = mediaPeriodId;
        this.f20257W = mediaLoadData;
    }

    public final void run() {
        this.f20258c.mo23508a(this.f20255U, this.f20256V, this.f20257W);
    }
}
