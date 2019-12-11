package kotlin.p590y;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12865c0;

/* renamed from: kotlin.y.t */
/* compiled from: MutableCollections.kt */
class C13196t extends C13194s {
    /* renamed from: a */
    public static <T> boolean m40545a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static final <T> boolean m40547b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        return C12865c0.m40199a((Object) collection).removeAll(C13187p.m40527a(iterable, (Iterable<? extends T>) collection));
    }

    /* renamed from: c */
    public static final <T> boolean m40548c(Collection<? super T> collection, Iterable<? extends T> iterable) {
        return C12865c0.m40199a((Object) collection).retainAll(C13187p.m40527a(iterable, (Iterable<? extends T>) collection));
    }

    /* renamed from: a */
    public static <T> boolean m40546a(Collection<? super T> collection, T[] tArr) {
        return collection.addAll(C13171j.m40336a(tArr));
    }

    /* renamed from: a */
    public static <T> boolean m40543a(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        return m40544a(iterable, function1, false);
    }

    /* renamed from: a */
    private static final <T> boolean m40544a(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
