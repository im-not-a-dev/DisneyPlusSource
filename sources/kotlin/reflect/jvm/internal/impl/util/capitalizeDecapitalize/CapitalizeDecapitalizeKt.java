package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import kotlin.C13142s;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: capitalizeDecapitalize.kt */
public final class CapitalizeDecapitalizeKt {
    public static final String capitalizeAsciiOnly(String str) {
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && 'z' >= charAt) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(upperCase));
            sb.append(substring);
            str = sb.toString();
        }
        return str;
    }

    public static final String decapitalizeAsciiOnly(String str) {
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && 'Z' >= charAt) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(lowerCase));
            sb.append(substring);
            str = sb.toString();
        }
        return str;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z) {
        Object obj;
        if (!(str.length() == 0) && isUpperCaseCharAt(str, 0, z)) {
            if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z)) {
                str = z ? decapitalizeAsciiOnly(str) : C12832w.m40126g(str);
            } else {
                Iterator it = C12833x.m40165b(str).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (!isUpperCaseCharAt(str, ((Number) obj).intValue(), z)) {
                        break;
                    }
                }
                Integer num = (Integer) obj;
                if (num == null) {
                    return toLowerCase(str, z);
                }
                int intValue = num.intValue() - 1;
                StringBuilder sb = new StringBuilder();
                String substring = str.substring(0, intValue);
                Intrinsics.checkReturnedValueIsNotNull((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(toLowerCase(substring, z));
                String substring2 = str.substring(intValue);
                Intrinsics.checkReturnedValueIsNotNull((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                return sb.toString();
            }
        }
        return str;
    }

    private static final boolean isUpperCaseCharAt(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        if (z) {
            return 'A' <= charAt && 'Z' >= charAt;
        }
        return Character.isUpperCase(charAt);
    }

    private static final String toLowerCase(String str, boolean z) {
        if (z) {
            return toLowerCaseAsciiOnly(str);
        }
        if (str != null) {
            String lowerCase = str.toLowerCase();
            Intrinsics.checkReturnedValueIsNotNull((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        }
        throw new C13142s("null cannot be cast to non-null type java.lang.String");
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && 'Z' >= charAt) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb2, "builder.toString()");
        return sb2;
    }
}
