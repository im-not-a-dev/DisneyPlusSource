package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

import java.util.Collection;
import java.util.LinkedHashSet;

/* compiled from: scopeUtils.kt */
public final class ScopeUtilsKt {
    public static final <T> Collection<T> concat(Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }
}
