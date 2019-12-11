package com.bamtechmedia.dominguez.core.background;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.core.background.a */
/* compiled from: BackgroundResponder.kt */
final class C3589a implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f8928c;

    C3589a(Function1 function1) {
        this.f8928c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12880j.m40222a(this.f8928c.invoke(obj), "invoke(...)");
    }
}
