package com.bamtechmedia.dominguez.core.framework;

import kotlin.jvm.functions.Function1;
import p520io.reactivex.functions.Function;

/* renamed from: com.bamtechmedia.dominguez.core.framework.f */
/* compiled from: ReactivePresenter.kt */
final class C5740f implements Function {

    /* renamed from: c */
    private final /* synthetic */ Function1 f13501c;

    C5740f(Function1 function1) {
        this.f13501c = function1;
    }

    public final /* synthetic */ Object apply(Object obj) {
        return this.f13501c.invoke(obj);
    }
}
