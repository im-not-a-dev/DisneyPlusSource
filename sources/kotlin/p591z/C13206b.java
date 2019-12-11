package kotlin.p591z;

/* renamed from: kotlin.z.b */
/* compiled from: Comparisons.kt */
class C13206b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m40622a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
