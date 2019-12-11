package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player.EventListener;

/* renamed from: com.google.android.exoplayer2.d */
/* compiled from: lambda */
public final /* synthetic */ class C8682d implements C8814b {

    /* renamed from: a */
    private final /* synthetic */ PlaybackParameters f18429a;

    public /* synthetic */ C8682d(PlaybackParameters playbackParameters) {
        this.f18429a = playbackParameters;
    }

    /* renamed from: a */
    public final void mo22694a(EventListener eventListener) {
        eventListener.onPlaybackParametersChanged(this.f18429a);
    }
}
