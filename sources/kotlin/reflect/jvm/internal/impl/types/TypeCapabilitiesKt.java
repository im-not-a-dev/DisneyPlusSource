package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: TypeCapabilities.kt */
public final class TypeCapabilitiesKt {
    public static final CustomTypeVariable getCustomTypeVariable(KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof CustomTypeVariable)) {
            unwrap = null;
        }
        CustomTypeVariable customTypeVariable = (CustomTypeVariable) unwrap;
        if (customTypeVariable == null || !customTypeVariable.isTypeVariable()) {
            return null;
        }
        return customTypeVariable;
    }

    public static final KotlinType getSubtypeRepresentative(KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        if (subtypingRepresentatives == null) {
            return kotlinType;
        }
        KotlinType subTypeRepresentative = subtypingRepresentatives.getSubTypeRepresentative();
        return subTypeRepresentative != null ? subTypeRepresentative : kotlinType;
    }

    public static final KotlinType getSupertypeRepresentative(KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        if (subtypingRepresentatives == null) {
            return kotlinType;
        }
        KotlinType superTypeRepresentative = subtypingRepresentatives.getSuperTypeRepresentative();
        return superTypeRepresentative != null ? superTypeRepresentative : kotlinType;
    }

    public static final boolean isCustomTypeVariable(KotlinType kotlinType) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof CustomTypeVariable)) {
            unwrap = null;
        }
        CustomTypeVariable customTypeVariable = (CustomTypeVariable) unwrap;
        if (customTypeVariable != null) {
            return customTypeVariable.isTypeVariable();
        }
        return false;
    }

    public static final boolean sameTypeConstructors(KotlinType kotlinType, KotlinType kotlinType2) {
        UnwrappedType unwrap = kotlinType.unwrap();
        if (!(unwrap instanceof SubtypingRepresentatives)) {
            unwrap = null;
        }
        SubtypingRepresentatives subtypingRepresentatives = (SubtypingRepresentatives) unwrap;
        if (!(subtypingRepresentatives != null ? subtypingRepresentatives.sameTypeConstructor(kotlinType2) : false)) {
            UnwrappedType unwrap2 = kotlinType2.unwrap();
            if (!(unwrap2 instanceof SubtypingRepresentatives)) {
                unwrap2 = null;
            }
            SubtypingRepresentatives subtypingRepresentatives2 = (SubtypingRepresentatives) unwrap2;
            if (!(subtypingRepresentatives2 != null ? subtypingRepresentatives2.sameTypeConstructor(kotlinType) : false)) {
                return false;
            }
        }
        return true;
    }
}
