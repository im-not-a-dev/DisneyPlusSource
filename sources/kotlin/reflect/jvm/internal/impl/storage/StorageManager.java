package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.C13145v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: StorageManager.kt */
public interface StorageManager {
    <T> T compute(Function0<? extends T> function0);

    <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues();

    <T> NotNullLazyValue<T> createLazyValue(Function0<? extends T> function0);

    <T> NotNullLazyValue<T> createLazyValueWithPostCompute(Function0<? extends T> function0, Function1<? super Boolean, ? extends T> function1, Function1<? super T, C13145v> function12);

    <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(Function1<? super K, ? extends V> function1);

    <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(Function1<? super K, ? extends V> function1);

    <T> NullableLazyValue<T> createNullableLazyValue(Function0<? extends T> function0);

    <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(Function0<? extends T> function0, T t);
}
