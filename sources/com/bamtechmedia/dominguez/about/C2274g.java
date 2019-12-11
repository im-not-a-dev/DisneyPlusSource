package com.bamtechmedia.dominguez.about;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.about.g */
/* compiled from: AboutViewModel.kt */
final class C2274g implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f6409c;

    C2274g(Function1 function1) {
        this.f6409c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f6409c.invoke(obj), "invoke(...)");
    }
}
