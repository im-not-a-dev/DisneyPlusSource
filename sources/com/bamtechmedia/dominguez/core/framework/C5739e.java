package com.bamtechmedia.dominguez.core.framework;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.core.framework.e */
/* compiled from: ReactivePresenter.kt */
final class C5739e implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f13500c;

    C5739e(Function1 function1) {
        this.f13500c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12880j.m40222a(this.f13500c.invoke(obj), "invoke(...)");
    }
}
