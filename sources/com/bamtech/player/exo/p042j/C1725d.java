package com.bamtech.player.exo.p042j;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtech.player.exo.j.d */
/* compiled from: PerformanceMonitoringDelegate.kt */
final class C1725d implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f6003c;

    C1725d(Function1 function1) {
        this.f6003c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f6003c.invoke(obj), "invoke(...)");
    }
}
