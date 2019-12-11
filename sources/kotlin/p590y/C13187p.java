package kotlin.p590y;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: kotlin.y.p */
/* compiled from: Iterables.kt */
class C13187p extends C13185o {
    /* renamed from: a */
    public static final <T> Integer m40526a(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: b */
    private static final <T> boolean m40529b(Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }

    /* renamed from: a */
    public static <T> int m40525a(Iterable<? extends T> iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: b */
    public static <T> List<T> m40528b(Iterable<? extends Iterable<? extends T>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Iterable a : iterable) {
            C13196t.m40545a((Collection<? super T>) arrayList, a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final <T> Collection<T> m40527a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C13199w.m40605p(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection collection = (Collection) iterable;
        return m40529b(collection) ? C13199w.m40605p(iterable) : collection;
    }
}
