package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player.EventListener;

/* renamed from: com.google.android.exoplayer2.l */
/* compiled from: lambda */
public final /* synthetic */ class C8732l implements C8814b {

    /* renamed from: a */
    private final /* synthetic */ ExoPlaybackException f18549a;

    public /* synthetic */ C8732l(ExoPlaybackException exoPlaybackException) {
        this.f18549a = exoPlaybackException;
    }

    /* renamed from: a */
    public final void mo22694a(EventListener eventListener) {
        eventListener.onPlayerError(this.f18549a);
    }
}
