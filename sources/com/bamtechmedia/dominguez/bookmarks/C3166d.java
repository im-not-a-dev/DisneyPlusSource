package com.bamtechmedia.dominguez.bookmarks;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.Single;

/* renamed from: com.bamtechmedia.dominguez.bookmarks.d */
/* compiled from: LocalBookmarksExt.kt */
public final class C3166d {
    /* renamed from: a */
    public static final Single<Map<String, Object>> m11070a(C3165c<?> cVar) {
        Single<Map<String, Object>> b = cVar.mo12185a().mo30120b(C13173j0.m40350a());
        Intrinsics.checkReturnedValueIsNotNull((Object) b, "lastLocalBookmarkMapMaybe().toSingle(emptyMap())");
        return b;
    }
}
