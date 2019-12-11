package com.bamtechmedia.dominguez.dictionaries;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.dictionaries.h */
/* compiled from: DictionaryManager.kt */
final class C6080h implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f13993c;

    C6080h(Function1 function1) {
        this.f13993c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f13993c.invoke(obj), "invoke(...)");
    }
}
