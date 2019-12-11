package kotlin.p588j0;

import kotlin.jvm.functions.Function1;

/* renamed from: kotlin.j0.t */
/* compiled from: StringBuilder.kt */
class C12829t extends C12828s {
    /* renamed from: a */
    public static StringBuilder m40103a(StringBuilder sb, String... strArr) {
        for (String append : strArr) {
            sb.append(append);
        }
        return sb;
    }

    /* renamed from: a */
    public static <T> void m40104a(Appendable appendable, T t, Function1<? super T, ? extends CharSequence> function1) {
        if (function1 != null) {
            appendable.append((CharSequence) function1.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
