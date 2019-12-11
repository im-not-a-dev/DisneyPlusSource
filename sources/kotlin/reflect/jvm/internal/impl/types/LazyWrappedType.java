package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* compiled from: SpecialTypes.kt */
public final class LazyWrappedType extends WrappedType {
    private final NotNullLazyValue<KotlinType> lazyValue;

    public LazyWrappedType(StorageManager storageManager, Function0<? extends KotlinType> function0) {
        this.lazyValue = storageManager.createLazyValue(function0);
    }

    /* access modifiers changed from: protected */
    public KotlinType getDelegate() {
        return (KotlinType) this.lazyValue.invoke();
    }

    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }
}
