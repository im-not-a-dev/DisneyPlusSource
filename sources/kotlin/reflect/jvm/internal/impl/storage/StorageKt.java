package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.reflect.KProperty;

/* compiled from: storage.kt */
public final class StorageKt {
    public static final <T> T getValue(NotNullLazyValue<? extends T> notNullLazyValue, Object obj, KProperty<?> kProperty) {
        return notNullLazyValue.invoke();
    }

    public static final <T> T getValue(NullableLazyValue<? extends T> nullableLazyValue, Object obj, KProperty<?> kProperty) {
        return nullableLazyValue.invoke();
    }
}
