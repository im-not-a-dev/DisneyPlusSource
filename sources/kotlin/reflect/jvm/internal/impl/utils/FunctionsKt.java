package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.C13145v;
import kotlin.jvm.functions.C12853n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: functions.kt */
public final class FunctionsKt {
    private static final Function1<Object, Object> ALWAYS_NULL = FunctionsKt$ALWAYS_NULL$1.INSTANCE;
    private static final Function1<Object, Boolean> ALWAYS_TRUE = FunctionsKt$ALWAYS_TRUE$1.INSTANCE;
    private static final Function1<Object, C13145v> DO_NOTHING = FunctionsKt$DO_NOTHING$1.INSTANCE;
    private static final Function2<Object, Object, C13145v> DO_NOTHING_2 = FunctionsKt$DO_NOTHING_2$1.INSTANCE;
    private static final C12853n<Object, Object, Object, C13145v> DO_NOTHING_3 = FunctionsKt$DO_NOTHING_3$1.INSTANCE;
    private static final Function1<Object, Object> IDENTITY = FunctionsKt$IDENTITY$1.INSTANCE;

    public static final <T> Function1<T, Boolean> alwaysTrue() {
        return ALWAYS_TRUE;
    }

    public static final Function2<Object, Object, C13145v> getDO_NOTHING_2() {
        return DO_NOTHING_2;
    }

    public static final C12853n<Object, Object, Object, C13145v> getDO_NOTHING_3() {
        return DO_NOTHING_3;
    }
}
