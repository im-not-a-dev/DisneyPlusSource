package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.C12880j;

/* compiled from: numbers.kt */
public final class NumbersKt {
    public static final NumberWithRadix extractRadix(String str) {
        String str2 = "(this as java.lang.String).substring(startIndex)";
        if (C12832w.m40123b(str, "0x", false, 2, null) || C12832w.m40123b(str, "0X", false, 2, null)) {
            String substring = str.substring(2);
            C12880j.m40222a((Object) substring, str2);
            return new NumberWithRadix(substring, 16);
        } else if (!C12832w.m40123b(str, "0b", false, 2, null) && !C12832w.m40123b(str, "0B", false, 2, null)) {
            return new NumberWithRadix(str, 10);
        } else {
            String substring2 = str.substring(2);
            C12880j.m40222a((Object) substring2, str2);
            return new NumberWithRadix(substring2, 2);
        }
    }
}
