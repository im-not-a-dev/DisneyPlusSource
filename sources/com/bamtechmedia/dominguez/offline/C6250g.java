package com.bamtechmedia.dominguez.offline;

import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.offline.g */
/* compiled from: ContentLocationProvider.kt */
public final class C6250g implements C6240b {
    /* renamed from: a */
    public Single<String> mo18834a(String str) {
        Single<String> b = Single.m38399b("network");
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "Single.just(NETWORK)");
        return b;
    }
}
