package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C9068a;

/* renamed from: com.google.android.exoplayer2.source.g */
/* compiled from: lambda */
public final /* synthetic */ class C9142g implements Runnable {

    /* renamed from: U */
    private final /* synthetic */ MediaSourceEventListener f20523U;

    /* renamed from: V */
    private final /* synthetic */ MediaPeriodId f20524V;

    /* renamed from: c */
    private final /* synthetic */ C9068a f20525c;

    public /* synthetic */ C9142g(C9068a aVar, MediaSourceEventListener mediaSourceEventListener, MediaPeriodId mediaPeriodId) {
        this.f20525c = aVar;
        this.f20523U = mediaSourceEventListener;
        this.f20524V = mediaPeriodId;
    }

    public final void run() {
        this.f20525c.mo23507a(this.f20523U, this.f20524V);
    }
}
