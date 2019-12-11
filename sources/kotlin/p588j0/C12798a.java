package kotlin.p588j0;

import kotlin.p586h0.C12757d;

/* renamed from: kotlin.j0.a */
/* compiled from: CharJVM.kt */
class C12798a {
    /* renamed from: a */
    public static final boolean m40012a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: a */
    public static final int m40010a(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: a */
    public static final int m40011a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C12757d(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
