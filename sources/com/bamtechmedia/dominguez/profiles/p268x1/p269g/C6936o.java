package com.bamtechmedia.dominguez.profiles.p268x1.p269g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.profiles.x1.g.o */
/* compiled from: LanguageExt.kt */
public final class C6936o {
    /* renamed from: a */
    public static final List<String> m21182a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Locale forLanguageTag = Locale.forLanguageTag(str);
            Intrinsics.checkReturnedValueIsNotNull((Object) forLanguageTag, "Locale.forLanguageTag(it)");
            C13196t.m40545a((Collection) arrayList, (Iterable) C13185o.m40520c(str, forLanguageTag.getLanguage()));
        }
        return C13199w.m40579d(arrayList);
    }
}
