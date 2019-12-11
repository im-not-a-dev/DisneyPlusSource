package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;

/* renamed from: com.google.android.exoplayer2.source.j */
/* compiled from: lambda */
public final /* synthetic */ class C9198j implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20828U;

    /* renamed from: V */
    private final /* synthetic */ MediaPeriodId f20829V;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20830c;

    public /* synthetic */ C9198j(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId) {
        this.f20830c = aVar;
        this.f20828U = mediaSourceEventListener;
        this.f20829V = mediaPeriodId;
    }

    public final void run() {
        this.f20830c.mo23521b(this.f20828U, this.f20829V);
    }
}
