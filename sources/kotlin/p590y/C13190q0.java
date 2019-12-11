package kotlin.p590y;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.y.q0 */
/* compiled from: _Sets.kt */
class C13190q0 extends C13188p0 {
    /* renamed from: a */
    public static <T> Set<T> m40535a(Set<? extends T> set, T t) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13173j0.m40349a(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(next, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public static <T> Set<T> m40536b(Set<? extends T> set, T t) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13173j0.m40349a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static <T> Set<T> m40534a(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        Integer a = C13187p.m40526a(iterable);
        if (a != null) {
            i = set.size() + a.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13173j0.m40349a(i));
        linkedHashSet.addAll(set);
        C13196t.m40545a((Collection<? super T>) linkedHashSet, iterable);
        return linkedHashSet;
    }
}
