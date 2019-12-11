package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;

/* compiled from: deprecation.kt */
public final class DeprecationKt {
    private static final UserDataKey<Object> DEPRECATED_FUNCTION_KEY = new DeprecationKt$DEPRECATED_FUNCTION_KEY$1();

    public static final UserDataKey<Object> getDEPRECATED_FUNCTION_KEY() {
        return DEPRECATED_FUNCTION_KEY;
    }
}
