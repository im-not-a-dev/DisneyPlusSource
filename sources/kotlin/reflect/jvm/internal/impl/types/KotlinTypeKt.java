package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: KotlinType.kt */
public final class KotlinTypeKt {
    public static final boolean isError(KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        return (unwrap instanceof ErrorType) || ((unwrap instanceof FlexibleType) && (((FlexibleType) unwrap).getDelegate() instanceof ErrorType));
    }

    public static final boolean isNullable(KotlinType kotlinType) {
        return TypeUtils.isNullableType(kotlinType);
    }
}
