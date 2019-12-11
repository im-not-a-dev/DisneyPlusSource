package com.bamtechmedia.dominguez.core.utils;

import java.util.Locale;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.core.utils.i0 */
/* compiled from: StringExt.kt */
public final class C5838i0 {
    /* renamed from: a */
    public static final String m18844a(String str) {
        Locale locale = Locale.US;
        C12880j.m40222a((Object) locale, "Locale.US");
        String lowerCase = str.toLowerCase(locale);
        C12880j.m40222a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
