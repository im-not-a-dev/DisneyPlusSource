package com.bamtechmedia.dominguez.playback;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.playback.k */
/* compiled from: ScreenSaverBlocker.kt */
final class C6332k implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f14422c;

    C6332k(Function1 function1) {
        this.f14422c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f14422c.invoke(obj), "invoke(...)");
    }
}
