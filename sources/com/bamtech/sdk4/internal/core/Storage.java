package com.bamtech.sdk4.internal.core;

import com.bamtech.core.networking.converters.Converter;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&JA\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u0005\"\u000e\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J3\u0010\u000f\u001a\u00020\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u0002H\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/core/Storage;", "", "clear", "", "get", "T", "U", "Lkotlin/reflect/KClass;", "key", "", "type", "overrideConverter", "Lcom/bamtech/core/networking/converters/Converter;", "(Ljava/lang/String;Lkotlin/reflect/KClass;Lcom/bamtech/core/networking/converters/Converter;)Ljava/lang/Object;", "remove", "save", "value", "(Ljava/lang/String;Ljava/lang/Object;Lcom/bamtech/core/networking/converters/Converter;)V", "sdk-base"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: Storage.kt */
public interface Storage {

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    /* compiled from: Storage.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object get$default(Storage storage, String str, KClass kClass, Converter converter, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    converter = null;
                }
                return storage.get(str, kClass, converter);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }

        public static /* synthetic */ void save$default(Storage storage, String str, Object obj, Converter converter, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 4) != 0) {
                    converter = null;
                }
                storage.save(str, obj, converter);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
        }
    }

    <T, U extends KClass<T>> T get(String str, U u, Converter converter);

    void remove(String str);

    <T> void save(String str, T t, Converter converter);
}
