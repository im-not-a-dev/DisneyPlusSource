package com.bamtechmedia.dominguez.playback.common.contentrating;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.playback.common.contentrating.c */
/* compiled from: ContentRatingPresenter.kt */
final class C6291c implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f14360c;

    C6291c(Function1 function1) {
        this.f14360c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12880j.m40222a(this.f14360c.invoke(obj), "invoke(...)");
    }
}
