package kotlin.p590y;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: kotlin.y.p0 */
/* compiled from: Sets.kt */
class C13188p0 extends C13186o0 {
    /* renamed from: a */
    public static <T> Set<T> m40531a() {
        return C13150a0.f29592c;
    }

    /* renamed from: b */
    public static <T> Set<T> m40533b(T... tArr) {
        return tArr.length > 0 ? C13174k.m40414n(tArr) : m40531a();
    }

    /* renamed from: a */
    public static <T> LinkedHashSet<T> m40530a(T... tArr) {
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(C13173j0.m40349a(tArr.length));
        C13174k.m40384b(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static final <T> Set<T> m40532a(Set<? extends T> set) {
        int size = set.size();
        if (size == 0) {
            return m40531a();
        }
        if (size != 1) {
            return set;
        }
        return C13186o0.m40524a(set.iterator().next());
    }
}
