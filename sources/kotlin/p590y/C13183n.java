package kotlin.p590y;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.y.n */
/* compiled from: CollectionsJVM.kt */
class C13183n {
    /* renamed from: a */
    public static <T> List<T> m40498a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        Intrinsics.checkReturnedValueIsNotNull((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m40499a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        if (z && Intrinsics.areEqual((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        Intrinsics.checkReturnedValueIsNotNull((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
