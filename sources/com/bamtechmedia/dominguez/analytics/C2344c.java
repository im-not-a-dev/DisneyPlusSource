package com.bamtechmedia.dominguez.analytics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.functions.Consumer;

/* renamed from: com.bamtechmedia.dominguez.analytics.c */
/* compiled from: ActivePageTracker.kt */
final class C2344c implements Consumer {

    /* renamed from: c */
    private final /* synthetic */ Function1 f6551c;

    C2344c(Function1 function1) {
        this.f6551c = function1;
    }

    public final /* synthetic */ void accept(Object obj) {
        C12880j.m40222a(this.f6551c.invoke(obj), "invoke(...)");
    }
}
