package com.bamtechmedia.dominguez.collections.p080o0;

import android.content.res.Resources;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.k */
/* compiled from: ContainerConfigExt.kt */
public final class C3446k {
    /* renamed from: a */
    public static final int m11762a(C3444j jVar, View view) {
        Resources resources = view.getResources();
        Intrinsics.checkReturnedValueIsNotNull((Object) resources, "target.resources");
        return resources.getDisplayMetrics().widthPixels / jVar.mo12637p();
    }
}
