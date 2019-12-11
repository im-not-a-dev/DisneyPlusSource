package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;

/* renamed from: com.google.android.exoplayer2.source.h */
/* compiled from: lambda */
public final /* synthetic */ class C9145h implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20526U;

    /* renamed from: V */
    private final /* synthetic */ MediaPeriodId f20527V;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20528c;

    public /* synthetic */ C9145h(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId) {
        this.f20528c = aVar;
        this.f20526U = mediaSourceEventListener;
        this.f20527V = mediaPeriodId;
    }

    public final void run() {
        this.f20528c.mo23527c(this.f20526U, this.f20527V);
    }
}
