package kotlin.p588j0;

/* renamed from: kotlin.j0.b */
/* compiled from: Char.kt */
class C12800b extends C12798a {
    /* renamed from: a */
    public static final boolean m40013a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
