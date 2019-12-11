package com.bamtechmedia.dominguez.core.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.core.utils.g0 */
/* compiled from: RxExt.kt */
final class C5834g0 implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f13619c;

    C5834g0(Function1 function1) {
        this.f13619c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12880j.m40222a(this.f13619c.invoke(obj), "invoke(...)");
    }
}
