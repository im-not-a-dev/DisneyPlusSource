package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: dynamicTypes.kt */
public final class DynamicTypesKt {
    public static final boolean isDynamic(KotlinType kotlinType) {
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
