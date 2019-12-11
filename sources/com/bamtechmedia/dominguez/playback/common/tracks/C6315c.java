package com.bamtechmedia.dominguez.playback.common.tracks;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.playback.common.tracks.c */
/* compiled from: PlaybackAudioAndSubtitlesPresenter.kt */
final class C6315c implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f14402c;

    C6315c(Function1 function1) {
        this.f14402c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f14402c.invoke(obj), "invoke(...)");
    }
}
