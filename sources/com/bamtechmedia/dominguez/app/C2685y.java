package com.bamtechmedia.dominguez.app;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.app.y */
/* compiled from: SentryConfigSetup.kt */
final class C2685y implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f7432c;

    C2685y(Function1 function1) {
        this.f7432c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f7432c.invoke(obj), "invoke(...)");
    }
}
