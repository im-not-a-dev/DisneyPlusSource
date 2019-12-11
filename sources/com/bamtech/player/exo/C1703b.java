package com.bamtech.player.exo;

import com.google.android.exoplayer2.source.MediaSource;
import p520io.reactivex.functions.Function;

/* renamed from: com.bamtech.player.exo.b */
/* compiled from: lambda */
public final /* synthetic */ class C1703b implements Function {

    /* renamed from: c */
    public static final /* synthetic */ C1703b f5943c = new C1703b();

    private /* synthetic */ C1703b() {
    }

    public final Object apply(Object obj) {
        MediaSource mediaSource = (MediaSource) obj;
        ExoPlaybackEngine.m7814a(mediaSource);
        return mediaSource;
    }
}
