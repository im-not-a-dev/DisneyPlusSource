package com.bamtechmedia.dominguez.collections;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.collections.d */
/* compiled from: AssetTransitionHandler.kt */
final class C3315d implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f8368c;

    C3315d(Function1 function1) {
        this.f8368c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f8368c.invoke(obj), "invoke(...)");
    }
}
