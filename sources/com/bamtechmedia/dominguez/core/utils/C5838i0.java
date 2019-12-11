package com.bamtechmedia.dominguez.core.utils;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bamtechmedia.dominguez.core.utils.i0 */
/* compiled from: StringExt.kt */
public final class C5838i0 {
    /* renamed from: a */
    public static final String m18844a(String str) {
        Locale locale = Locale.US;
        Intrinsics.checkReturnedValueIsNotNull((Object) locale, "Locale.US");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
