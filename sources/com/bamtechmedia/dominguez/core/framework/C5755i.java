package com.bamtechmedia.dominguez.core.framework;

import androidx.lifecycle.C0715i.C0716a;
import androidx.lifecycle.C0722m;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import p520io.reactivex.C11969r;

/* renamed from: com.bamtechmedia.dominguez.core.framework.i */
/* compiled from: ReactiveViewModelExt.kt */
public final class C5755i {
    /* renamed from: a */
    public static /* synthetic */ void m18679a(C0722m mVar, C5741g gVar, C0716a aVar, C11969r rVar, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = C0716a.ON_STOP;
        }
        if ((i & 4) != 0) {
            rVar = null;
        }
        m18678a(mVar, gVar, aVar, rVar, function1);
    }

    /* renamed from: a */
    public static final <T> void m18678a(C0722m mVar, C5741g<T> gVar, C0716a aVar, C11969r rVar, Function1<? super T, C13145v> function1) {
        gVar.observeInLifecycle(mVar, aVar, rVar, function1);
    }
}
