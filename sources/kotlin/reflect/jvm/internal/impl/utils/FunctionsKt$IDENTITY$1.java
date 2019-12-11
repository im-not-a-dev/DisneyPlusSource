package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: functions.kt */
final class FunctionsKt$IDENTITY$1 extends C12881k implements Function1<Object, Object> {
    public static final FunctionsKt$IDENTITY$1 INSTANCE = new FunctionsKt$IDENTITY$1();

    FunctionsKt$IDENTITY$1() {
        super(1);
    }

    public final Object invoke(Object obj) {
        return obj;
    }
}
