package com.bamtechmedia.dominguez.core.framework;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.core.framework.h */
/* compiled from: ReactiveViewModel.kt */
final class C5754h implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f13514c;

    C5754h(Function1 function1) {
        this.f13514c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12880j.m40222a(this.f13514c.invoke(obj), "invoke(...)");
    }
}
