package com.bamtechmedia.dominguez.purchase;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.purchase.w */
/* compiled from: PaywallViewModel.kt */
final class C7109w implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f15738c;

    C7109w(Function1 function1) {
        this.f15738c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f15738c.invoke(obj), "invoke(...)");
    }
}
