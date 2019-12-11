package kotlin.p590y;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C12880j;

/* renamed from: kotlin.y.n */
/* compiled from: CollectionsJVM.kt */
class C13183n {
    /* renamed from: a */
    public static <T> List<T> m40498a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C12880j.m40222a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m40499a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        if (z && C12880j.m40224a((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C12880j.m40222a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
