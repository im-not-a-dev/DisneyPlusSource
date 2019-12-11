package com.bamtechmedia.dominguez.collections;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.collections.t */
/* compiled from: CollectionViewModelImpl.kt */
final class C3488t implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f8766c;

    C3488t(Function1 function1) {
        this.f8766c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f8766c.invoke(obj), "invoke(...)");
    }
}
