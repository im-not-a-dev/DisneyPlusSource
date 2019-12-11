package com.bamtechmedia.dominguez.auth;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.auth.y */
/* compiled from: AuthSuccessActionImpl.kt */
final class C3144y implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f8065c;

    C3144y(Function1 function1) {
        this.f8065c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkReturnedValueIsNotNull(this.f8065c.invoke(obj), "invoke(...)");
    }
}
