package kotlin.p586h0;

/* renamed from: kotlin.h0.g */
/* compiled from: Ranges.kt */
class C12761g extends C12760f {
    /* renamed from: a */
    public static final void m39911a(boolean z, Number number) {
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Step must be positive, was: ");
            sb.append(number);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
