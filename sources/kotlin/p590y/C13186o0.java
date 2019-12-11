package kotlin.p590y;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.y.o0 */
/* compiled from: SetsJVM.kt */
class C13186o0 {
    /* renamed from: a */
    public static <T> Set<T> m40524a(T t) {
        Set<T> singleton = Collections.singleton(t);
        Intrinsics.checkReturnedValueIsNotNull((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }
}
