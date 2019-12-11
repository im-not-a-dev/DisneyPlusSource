package com.bamtechmedia.dominguez.detail.common;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.detail.common.f */
/* compiled from: DetailLifecycleObserver.kt */
final class C5924f implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f13715c;

    C5924f(Function1 function1) {
        this.f13715c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f13715c.invoke(obj), "invoke(...)");
    }
}
