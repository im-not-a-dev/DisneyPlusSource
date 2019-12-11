package com.bamtechmedia.dominguez.playback.common.background;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.playback.common.background.a */
/* compiled from: PlaybackActivityBackgroundResponder.kt */
final class C6278a implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f14338c;

    C6278a(Function1 function1) {
        this.f14338c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12880j.m40222a(this.f14338c.invoke(obj), "invoke(...)");
    }
}
