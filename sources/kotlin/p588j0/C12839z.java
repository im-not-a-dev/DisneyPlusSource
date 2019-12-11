package kotlin.p588j0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12880j;

/* renamed from: kotlin.j0.z */
/* compiled from: _Strings.kt */
class C12839z extends C12838y {
    /* renamed from: e */
    public static String m40186e(String str, int i) {
        if (i >= 0) {
            String substring = str.substring(C12762h.m39917b(i, str.length()));
            C12880j.m40222a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: f */
    public static String m40187f(String str, int i) {
        if (i >= 0) {
            String substring = str.substring(0, C12762h.m39917b(i, str.length()));
            C12880j.m40222a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: g */
    public static char m40188g(CharSequence charSequence) {
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(C12833x.m40172c(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: h */
    public static Character m40189h(CharSequence charSequence) {
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }
}
