package kotlin.reflect.jvm.internal.impl.types;

import kotlin.C12898l;

/* compiled from: TypeWithEnhancement.kt */
public final class TypeWithEnhancementKt {
    public static final KotlinType getEnhancement(KotlinType kotlinType) {
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).getEnhancement();
        }
        return null;
    }

    public static final UnwrappedType inheritEnhancement(UnwrappedType unwrappedType, KotlinType kotlinType) {
        return wrapEnhancement(unwrappedType, getEnhancement(kotlinType));
    }

    public static final KotlinType unwrapEnhancement(KotlinType kotlinType) {
        KotlinType enhancement = getEnhancement(kotlinType);
        return enhancement != null ? enhancement : kotlinType;
    }

    public static final UnwrappedType wrapEnhancement(UnwrappedType unwrappedType, KotlinType kotlinType) {
        UnwrappedType unwrappedType2;
        if (kotlinType == null) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            unwrappedType2 = new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        } else if (unwrappedType instanceof FlexibleType) {
            unwrappedType2 = new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        } else {
            throw new C12898l();
        }
        return unwrappedType2;
    }
}
