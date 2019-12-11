package com.bamtechmedia.dominguez.analytics.p056n0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.analytics.n0.b */
/* compiled from: GlimpseAnalyticsViewModel.kt */
final class C2425b implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f6688c;

    C2425b(Function1 function1) {
        this.f6688c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f6688c.invoke(obj), "invoke(...)");
    }
}
