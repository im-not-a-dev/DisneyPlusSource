package com.bamtechmedia.dominguez.profiles.p266v1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.profiles.v1.c */
/* compiled from: ChooseAvatarFragment.kt */
public final class C6877c {
    /* renamed from: a */
    public static final List<String> m21060a(List<String> list, String str, String str2) {
        if ((str2 == null || C12832w.m40118a(str2)) || !(!Intrinsics.areEqual((Object) str2, (Object) str))) {
            return list;
        }
        List a = C13199w.m40563a((Collection) list, (Object) str2);
        ArrayList arrayList = new ArrayList();
        for (Object next : a) {
            if (!Intrinsics.areEqual((Object) (String) next, (Object) str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
